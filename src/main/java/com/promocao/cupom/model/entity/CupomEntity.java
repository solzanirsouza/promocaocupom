package com.promocao.cupom.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "cupom")
public class CupomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cupom;
    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public CupomEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCupom() {
        return cupom;
    }

    public CupomEntity setCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public CupomEntity setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
