package com.autopro.ventasautopro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "datospersonales")
public class datospersonales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "datid")
    private Integer idDate;

    private String datnombre;

    private String datapellido;

    private String datacorreo;

    private String datatelefono;

    private String datipoid;

    private String datnumeroid;


    @ManyToOne
    @JoinColumn(name = "usuario_usuid", insertable = false, updatable = false )
    private usuario usuarioDat;

    

    @Column(name = "usuario_usuid")
    private Integer UsuarioUsuId;


    @OneToMany(mappedBy = "Usuario")
    private List<vehiculo> Vehiculos;


    public Integer getIdDate() {
        return this.idDate;
    }

    public void setIdDate(Integer idDate) {
        this.idDate = idDate;
    }


    public String getDatnombre() {
        return this.datnombre;
    }

    public void setDatnombre(String datnombre) {
        this.datnombre = datnombre;
    }

    public String getDatapellido() {
        return this.datapellido;
    }

    public void setDatapellido(String datapellido) {
        this.datapellido = datapellido;
    }

    public String getDatacorreo() {
        return this.datacorreo;
    }

    public void setDatacorreo(String datacorreo) {
        this.datacorreo = datacorreo;
    }

    public String getDatatelefono() {
        return this.datatelefono;
    }

    public void setDatatelefono(String datatelefono) {
        this.datatelefono = datatelefono;
    }

    public String getDatipoid() {
        return this.datipoid;
    }

    public void setDatipoid(String datipoid) {
        this.datipoid = datipoid;
    }

    public String getDatnumeroid() {
        return this.datnumeroid;
    }

    public void setDatnumeroid(String datnumeroid) {
        this.datnumeroid = datnumeroid;
    }

     public Integer getUsuarioUsuId() {
        return this.UsuarioUsuId;
    }

    public void setUsuarioUsuId(Integer UsuarioUsuId) {
        this.UsuarioUsuId = UsuarioUsuId;
    }

    



    
}
