package com.financiera.reto.service.impl;

import com.financiera.reto.dao.ClienteDao;
import com.financiera.reto.entity.ClienteEntity;
import com.financiera.reto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteDao clienteDao;
    @Override
    public List<ClienteEntity> findAllClients() {
        return clienteDao.findAll();
    }

    @Override
    public ClienteEntity save(ClienteEntity model) {

        return clienteDao.save(model);
    }
}
