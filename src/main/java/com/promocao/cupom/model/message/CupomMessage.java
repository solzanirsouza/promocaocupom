package com.promocao.cupom.model.message;

import java.io.Serializable;
import java.math.BigDecimal;

public class CupomMessage implements Serializable {

    private Long idUsuario;
    private String cupom;
    private BigDecimal valor;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public CupomMessage setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getCupom() {
        return cupom;
    }

    public CupomMessage setCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public CupomMessage setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
