package com.promocao.cupom.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class PontosCupomRequestDTO implements Serializable {

    @JsonProperty(value = "id_usuario")
    private Long idUsuario;
    private String cupom;
    private BigDecimal valor;
    private Long pontos;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public PontosCupomRequestDTO setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getCupom() {
        return cupom;
    }

    public PontosCupomRequestDTO setCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public PontosCupomRequestDTO setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Long getPontos() {
        return pontos;
    }

    public PontosCupomRequestDTO setPontos(Long pontos) {
        this.pontos = pontos;
        return this;
    }
}
