package com.financiera.reto.service;

import com.financiera.reto.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ClienteService {


    List<ClienteEntity> findAllClients();

    ClienteEntity save(ClienteEntity model);
}
