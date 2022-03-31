package com.promocao.cupom.producer;

import com.promocao.cupom.model.message.CupomMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
public class CupomProducer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void enviar(CupomMessage message) {
        logger.info(format("Postando cupom %s na fila", message.getCupom()));

    }
}
