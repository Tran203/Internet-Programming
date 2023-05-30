package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Contact;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-04T10:14:36")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Character> gender;
    public static volatile SingularAttribute<Customer, String> surname;
    public static volatile SingularAttribute<Customer, Contact> contact;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, Date> creationDate;
    public static volatile SingularAttribute<Customer, Integer> age;
    public static volatile SingularAttribute<Customer, Boolean> status;

}