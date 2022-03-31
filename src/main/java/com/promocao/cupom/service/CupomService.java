package com.promocao.cupom.service;

import com.promocao.cupom.model.dto.CupomRequestDTO;
import com.promocao.cupom.model.dto.PontosCupomRequestDTO;
import com.promocao.cupom.model.entity.CupomEntity;
import com.promocao.cupom.model.message.CupomMessage;
import com.promocao.cupom.producer.CupomProducer;
import com.promocao.cupom.repository.CupomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class CupomService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CupomRepository repository;
    @Autowired
    private UsuarioPontosService pontosService;
    @Autowired
    private CupomProducer producer;

    public void salvar(CupomRequestDTO cupom) {
        logger.info(format("Registrando cupom %s no valor de %s", cupom.getCupom(), cupom.getValor().toString()));
        producer.enviar(new CupomMessage()
                .setIdUsuario(cupom.getIdUsuario())
                .setCupom(cupom.getCupom())
                .setValor(cupom.getValor()));

    }

    public void registrarCupom(PontosCupomRequestDTO cupom) {
        logger.info(format("Salvando cupom %s com %d pontos do cliente %d",
                cupom.getCupom(),
                cupom.getPontos(),
                cupom.getIdUsuario()));

        repository.save(new CupomEntity()
                .setCupom(cupom.getCupom())
                .setValor(cupom.getValor()));

        pontosService.atualizarPontosUsuario(cupom.getIdUsuario(), cupom.getPontos());
    }
}
