package com.financiera.reto.service.impl;

import com.financiera.reto.dao.ProductoDao;
import com.financiera.reto.entity.ProductoEntity;
import com.financiera.reto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoDao productoDao;
    @Override
    public List<ProductoEntity> findAll() {
        return productoDao.findAll();
    }

    @Override
    public ProductoEntity save(ProductoEntity model) {
        return productoDao.save(model);
    }

    @Override
    public int delete(Integer id) {
        int res = 0;
        try {
            productoDao.delete(ProductoEntity.builder().id(id).build());
            res =1;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return res;
        }

    }
}
