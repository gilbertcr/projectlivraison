/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gt
 */
@Entity
@Table(name = "livreur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livreur.findAll", query = "SELECT l FROM Livreur l")
    , @NamedQuery(name = "Livreur.findByIdLivreur", query = "SELECT l FROM Livreur l WHERE l.idLivreur = :idLivreur")
    , @NamedQuery(name = "Livreur.findByPosition", query = "SELECT l FROM Livreur l WHERE l.position = :position")
    , @NamedQuery(name = "Livreur.findByDisponibilite", query = "SELECT l FROM Livreur l WHERE l.disponibilite = :disponibilite")})
public class Livreur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLivreur")
    private Integer idLivreur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "position")
    private double position;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disponibilite")
    private boolean disponibilite;

    public Livreur() {
    }

    public Livreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
    }

    public Livreur(Integer idLivreur, double position, boolean disponibilite) {
        this.idLivreur = idLivreur;
        this.position = position;
        this.disponibilite = disponibilite;
    }

    public Integer getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivreur != null ? idLivreur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livreur)) {
            return false;
        }
        Livreur other = (Livreur) object;
        if ((this.idLivreur == null && other.idLivreur != null) || (this.idLivreur != null && !this.idLivreur.equals(other.idLivreur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webservices.Livreur[ idLivreur=" + idLivreur + " ]";
    }
    
}
