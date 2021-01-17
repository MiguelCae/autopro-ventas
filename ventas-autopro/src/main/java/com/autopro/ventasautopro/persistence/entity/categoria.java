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
@Table(name = "categoria")

public class categoria {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="catid")
    private Integer categoriaId;

   

    @Column(name = "catipo")
    private String categoriaTipo;

    @OneToMany(mappedBy = "Categoria")
    private List<vehiculo> VehiculosCat;

    

    public Integer getCategoriaId() {
        return this.categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaTipo() {
        return this.categoriaTipo;
    }

    public void setCategoriaTipo(String categoriaTipo) {
        this.categoriaTipo = categoriaTipo;
    }
    
    
}
