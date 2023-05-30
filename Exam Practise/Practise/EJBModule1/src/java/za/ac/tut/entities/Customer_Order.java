/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Student
 */
@Entity
public class Customer_Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="ORDERED_ITEMS_TBL")
    @Column(name="ITEM_VALUES")
    private List<Item> cart = new ArrayList<>();
    private Double totValue;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date creationDate;

    public Customer_Order() {
    }

    public Customer_Order(Long id, Double totValue, Date creationDate) {
        this.id = id;
        this.totValue = totValue;
        this.creationDate = creationDate;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public Double getTotValue() {
        return totValue;
    }

    public void setTotValue(Double totValue) {
        this.totValue = totValue;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Customer_Order)) {
            return false;
        }
        Customer_Order other = (Customer_Order) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Customer_Order[ id=" + id + " ]";
    }
    
}
