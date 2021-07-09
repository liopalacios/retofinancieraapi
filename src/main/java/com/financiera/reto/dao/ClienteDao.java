package com.financiera.reto.dao;

import com.financiera.reto.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends JpaRepository<ClienteEntity,Integer> {

}
