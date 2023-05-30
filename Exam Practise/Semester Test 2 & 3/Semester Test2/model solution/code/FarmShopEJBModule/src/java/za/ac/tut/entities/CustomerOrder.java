/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author MemaniV
 */
@Entity
@Table(name="CUSTOMER_ORDERS_TBL")
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ORDER_NUMBER")
    private Long id;
    private Double orderValue;
    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="ORDERED_ITEMS_TBL")
    @Column(name="ITEM_VALUES")
    private List<String> orderedItems;
    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
    @JoinColumn(name="addr_fk")
    private Address customerAddress;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date creationDate;

    public CustomerOrder() {
    }

    public CustomerOrder(Double orderValue, List<String> orderedItems, Address customerAddress, Date creationDate) {
        this.orderValue = orderValue;
        this.orderedItems = orderedItems;
        this.customerAddress = customerAddress;
        this.creationDate = creationDate;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Double orderValue) {
        this.orderValue = orderValue;
    }

    public List<String> getItems() {
        return orderedItems;
    }

    public void setItems(List<String> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
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
        if (!(object instanceof CustomerOrder)) {
            return false;
        }
        CustomerOrder other = (CustomerOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.CustomerOrder[ id=" + id + " ]";
    }
    
}
