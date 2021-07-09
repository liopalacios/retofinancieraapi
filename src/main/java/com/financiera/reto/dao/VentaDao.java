package com.financiera.reto.dao;

import com.financiera.reto.entity.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaDao extends JpaRepository<VentaEntity,Integer> {

    List<VentaEntity> findByFechaBetween(String desde, String hasta);
}
