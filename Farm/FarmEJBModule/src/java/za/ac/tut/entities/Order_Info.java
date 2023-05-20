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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Student
 */
@Entity
public class Order_Info implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ORDER_NUM")
    private Long id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;
    private Double totAmt;
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
    private Customer address;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Items> item = new ArrayList<>();

    public Order_Info() {
    }

    public Order_Info(Long id, Date creationDate, Double totAmt, Customer address) {
        this.id = id;
        this.creationDate = creationDate;
        this.totAmt = totAmt;
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Double getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(Double totAmt) {
        this.totAmt = totAmt;
    }

    public Customer getAddress() {
        return address;
    }

    public void setAddress(Customer address) {
        this.address = address;
    }

    public List<Items> getItem() {
        return item;
    }

    public void setItem(List<Items> item) {
        this.item = item;
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
        if (!(object instanceof Order_Info)) {
            return false;
        }
        Order_Info other = (Order_Info) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Order_Info[ id=" + id + " ]";
    }
    
}
