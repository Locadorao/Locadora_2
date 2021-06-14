/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.dao.EntidadeBase;
import com.mycompany.dao.GenericDAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "alugar")
@NamedQueries({
    @NamedQuery(name = "Alugar.findAll", query = "SELECT a FROM Alugar a")})
public class Alugar implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tempoAlugado")
    private int tempoAlugado;
    @JoinColumn(name = "Carro_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Carro carroid;
    @JoinColumn(name = "Cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente clienteid;

    public Alugar() {
    }

    public Alugar(Integer id) {
        this.id = id;
    }

    public Alugar(Integer id, int tempoAlugado) {
        this.id = id;
        this.tempoAlugado = tempoAlugado;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTempoAlugado() {
        return tempoAlugado;
    }

    public void setTempoAlugado(int tempoAlugado) {
        this.tempoAlugado = tempoAlugado;
    }

    public Carro getCarroid() {
        return carroid;
    }

    public void setCarroid(Carro carroid) {
        this.carroid = carroid;
    }

    public Cliente getClienteid() {
        return clienteid;
    }

    public void setClienteid(Cliente clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alugar)) {
            return false;
        }
        Alugar other = (Alugar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Alugar[ id=" + id + " ]";
    }

}
