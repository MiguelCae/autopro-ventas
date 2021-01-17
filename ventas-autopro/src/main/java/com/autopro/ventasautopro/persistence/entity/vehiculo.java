package com.autopro.ventasautopro.persistence.entity;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class vehiculo {

    @Id
    private String vehplaca;

    private String vehmarca;

    private String vehestado;

    private BigDecimal veheprecio;


    @ManyToOne
    @JoinColumn(name = "datospersonales_datid", insertable = false, updatable = false)
    private datospersonales datosPersonales;

    @ManyToOne
    @JoinColumn(name = "categoria_catid", insertable = false, updatable = false)
    private categoria Categoria;


    public String getVehplaca() {
        return this.vehplaca;
    }

    public void setVehplaca(String vehplaca) {
        this.vehplaca = vehplaca;
    }

    public String getVehmarca() {
        return this.vehmarca;
    }

    public void setVehmarca(String vehmarca) {
        this.vehmarca = vehmarca;
    }

    public String getVehestado() {
        return this.vehestado;
    }

    public void setVehestado(String vehestado) {
        this.vehestado = vehestado;
    }
    public BigDecimal getVeheprecio() {
        return this.veheprecio;
    }

    public void setVeheprecio(BigDecimal veheprecio) {
        this.veheprecio = veheprecio;
    }

  
}
