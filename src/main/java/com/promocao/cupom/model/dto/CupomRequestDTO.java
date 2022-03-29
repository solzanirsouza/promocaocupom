package com.promocao.cupom.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class CupomRequestDTO implements Serializable {

    @JsonProperty(value = "id_usuario")
    private Long idUsuario;
    private String cupom;
    private BigDecimal valor;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public CupomRequestDTO setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getCupom() {
        return cupom;
    }

    public CupomRequestDTO setCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public CupomRequestDTO setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
