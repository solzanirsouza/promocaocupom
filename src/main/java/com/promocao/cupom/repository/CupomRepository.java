package com.promocao.cupom.repository;

import com.promocao.cupom.model.entity.CupomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupomRepository extends JpaRepository<CupomEntity, Long> {
}
