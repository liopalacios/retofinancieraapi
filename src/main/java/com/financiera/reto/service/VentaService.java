package com.financiera.reto.service;

import com.financiera.reto.entity.VentaEntity;

import java.util.List;

public interface VentaService {
    List<VentaEntity> findAll();

    VentaEntity findById(Integer id);

    List<VentaEntity> findByDate(String desde, String hasta);
}
