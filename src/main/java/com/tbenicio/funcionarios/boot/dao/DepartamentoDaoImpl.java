package com.tbenicio.funcionarios.boot.dao;

import org.springframework.stereotype.Repository;

import com.tbenicio.funcionarios.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
