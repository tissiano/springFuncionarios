package com.tbenicio.funcionarios.boot.dao;

import org.springframework.stereotype.Repository;

import com.tbenicio.funcionarios.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
