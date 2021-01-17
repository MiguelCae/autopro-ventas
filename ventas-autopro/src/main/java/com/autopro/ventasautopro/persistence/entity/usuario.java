package com.autopro.ventasautopro.persistence.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;



@Entity
@Table(name = "usuario")

public class usuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer usuId;

    private String usuLogin;
    private String usuPassword;


    @OneToMany(mappedBy = "usuarioDat")
    private List<datospersonales> DatosPersonales;

    public Integer getUsuId() {
        return this.usuId;
    }

    public void setUsuId(Integer usuId) {
        this.usuId = usuId;
    }

    public String getUsuLogin() {
        return this.usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuPassword() {
        return this.usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }



    
}
