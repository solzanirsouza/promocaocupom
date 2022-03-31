package com.promocao.cupom.service;

import com.promocao.cupom.model.entity.UsuarioPontosEntity;
import com.promocao.cupom.repository.UsuarioPontoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.String.format;

@Service
public class UsuarioPontosService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsuarioPontoRepository repository;

    public void atualizarPontosUsuario(Long usuarioId, Long pontos) {
        logger.info(format("Atualizando pontos do cliente %d", usuarioId));

        Optional<UsuarioPontosEntity> entity = repository.findByUsuarioId(usuarioId);
        UsuarioPontosEntity novo = new UsuarioPontosEntity();
        novo.setUsuarioId(usuarioId);
        novo.setPontos(pontos);

        if (entity.isPresent()) {
            novo.setId(entity.get().getId());
            novo.incrementarPontos(entity.get().getPontos());
        }

        repository.save(novo);
    }
}
