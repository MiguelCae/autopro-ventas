package com.autopro.ventasautopro.persistence.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class usuarioRolPK implements Serializable{

    private Integer rol_rolid;

    private Integer usuario_usuid;

    public Integer getRol_rolid() {
        return this.rol_rolid;
    }

    public void setRol_rolid(Integer rol_rolid) {
        this.rol_rolid = rol_rolid;
    }

    public Integer getUsuario_usuid() {
        return this.usuario_usuid;
    }

    public void setUsuario_usuid(Integer usuario_usuid) {
        this.usuario_usuid = usuario_usuid;
    }
    
}
