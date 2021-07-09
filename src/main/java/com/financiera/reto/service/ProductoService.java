package com.financiera.reto.service;

import com.financiera.reto.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    List<ProductoEntity> findAll();

    ProductoEntity save(ProductoEntity model);

    int delete(Integer id);
}
