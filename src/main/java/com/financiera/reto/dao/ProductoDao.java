package com.financiera.reto.dao;

import com.financiera.reto.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<ProductoEntity,Integer> {
}
