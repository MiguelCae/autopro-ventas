package com.autopro.ventasautopro.persistence.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")

public class rol {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer rolId;
    private String rolTipo;

    public Integer getRolId() {
        return this.rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolTipo() {
        return this.rolTipo;
    }

    public void setRolTipo(String rolTipo) {
        this.rolTipo = rolTipo;
    }
    
}
