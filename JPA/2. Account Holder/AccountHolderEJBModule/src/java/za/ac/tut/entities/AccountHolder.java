/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Student
 */
@Entity
@Table(name="Account_Holders_TBL")
@SecondaryTables({@SecondaryTable(name="Address_TBL"), @SecondaryTable(name="Contacts_TBL")})
public class AccountHolder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Column(nullable=false, length=20)
    private String name;
    @Column(table="Address_TBL", nullable=true, length=20)
    private String street;
    @Column(table="Address_TBL", nullable=true, length=20)
    private String code;
    @Column(table="Contacts_TBL", nullable=true, length=20)
    private String cellNo;
    @Column(table="Contacts_TBL", nullable=true, length=20)
    private String emailAddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creataionDate;

    public AccountHolder() {
    }

    public AccountHolder(Long id, String name, String street, String code, String cellNo, String emailAddress, Date creataionDate) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.code = code;
        this.cellNo = cellNo;
        this.emailAddress = emailAddress;
        this.creataionDate = creataionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getCreataionDate() {
        return creataionDate;
    }

    public void setCreataionDate(Date creataionDate) {
        this.creataionDate = creataionDate;
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
        if (!(object instanceof AccountHolder)) {
            return false;
        }
        AccountHolder other = (AccountHolder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.AccountHolder[ id=" + id + " ]";
    }
    
}
