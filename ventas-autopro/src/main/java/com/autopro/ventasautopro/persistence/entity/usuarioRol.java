package com.autopro.ventasautopro.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_rol")

public class usuarioRol {
    public class usuarioRolPK{
        @EmbeddedId
        private usuarioRolPK id;

        public usuarioRolPK getId() {
            return this.id;
        }

        public void setId(usuarioRolPK id) {
            this.id = id;
        }

    }
    
}
