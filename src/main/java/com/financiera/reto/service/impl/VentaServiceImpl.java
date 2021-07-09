package com.financiera.reto.service.impl;

import com.financiera.reto.dao.VentaDao;
import com.financiera.reto.entity.VentaEntity;
import com.financiera.reto.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    VentaDao ventaDao;
    @Override
    public List<VentaEntity> findAll() {
        return ventaDao.findAll();
    }

    @Override
    public VentaEntity findById(Integer id) {
        return ventaDao.findById(id).orElse(null);
    }

    @Override
    public List<VentaEntity> findByDate(String desde, String hasta) {
        return ventaDao.findByFechaBetween(desde,hasta);
    }
}
