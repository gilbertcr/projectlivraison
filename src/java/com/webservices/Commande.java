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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gt
 */
@Entity
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c")
    , @NamedQuery(name = "Commande.findByIdCommande", query = "SELECT c FROM Commande c WHERE c.idCommande = :idCommande")
    , @NamedQuery(name = "Commande.findByPositionCommande", query = "SELECT c FROM Commande c WHERE c.positionCommande = :positionCommande")
    , @NamedQuery(name = "Commande.findByAddresseclient", query = "SELECT c FROM Commande c WHERE c.addresseclient = :addresseclient")
    , @NamedQuery(name = "Commande.findByConfirmationreception", query = "SELECT c FROM Commande c WHERE c.confirmationreception = :confirmationreception")
    , @NamedQuery(name = "Commande.findByLivreurid", query = "SELECT c FROM Commande c WHERE c.livreurid = :livreurid")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCommande")
    private Integer idCommande;
    @Basic(optional = false)
    @NotNull
    @Column(name = "positionCommande")
    private double positionCommande;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "addresseclient")
    private String addresseclient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "confirmationreception")
    private boolean confirmationreception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "livreurid")
    private int livreurid;

    public Commande() {
    }

    public Commande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Commande(Integer idCommande, double positionCommande, String addresseclient, boolean confirmationreception, int livreurid) {
        this.idCommande = idCommande;
        this.positionCommande = positionCommande;
        this.addresseclient = addresseclient;
        this.confirmationreception = confirmationreception;
        this.livreurid = livreurid;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public double getPositionCommande() {
        return positionCommande;
    }

    public void setPositionCommande(double positionCommande) {
        this.positionCommande = positionCommande;
    }

    public String getAddresseclient() {
        return addresseclient;
    }

    public void setAddresseclient(String addresseclient) {
        this.addresseclient = addresseclient;
    }

    public boolean getConfirmationreception() {
        return confirmationreception;
    }

    public void setConfirmationreception(boolean confirmationreception) {
        this.confirmationreception = confirmationreception;
    }

    public int getLivreurid() {
        return livreurid;
    }

    public void setLivreurid(int livreurid) {
        this.livreurid = livreurid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommande != null ? idCommande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.idCommande == null && other.idCommande != null) || (this.idCommande != null && !this.idCommande.equals(other.idCommande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webservices.Commande[ idCommande=" + idCommande + " ]";
    }
    
}
