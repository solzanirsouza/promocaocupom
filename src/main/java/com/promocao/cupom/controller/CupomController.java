package com.promocao.cupom.controller;

import com.promocao.cupom.model.dto.CupomRequestDTO;
import com.promocao.cupom.model.dto.PontosCupomRequestDTO;
import com.promocao.cupom.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/v1/cupom")
public class CupomController {

    @Autowired
    private CupomService service;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody CupomRequestDTO cupom) {
        service.salvar(cupom);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/pontos")
    public ResponseEntity<Void> obterPorId(@RequestBody PontosCupomRequestDTO pontos) {
        service.registrarCupom(pontos);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
