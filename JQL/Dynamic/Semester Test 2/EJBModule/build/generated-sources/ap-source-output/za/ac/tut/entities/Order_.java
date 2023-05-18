package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Address;
import za.ac.tut.entities.Item;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-18T20:26:04")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Date> orderTime;
    public static volatile SingularAttribute<Order, Address> address;
    public static volatile ListAttribute<Order, Item> orderList;
    public static volatile SingularAttribute<Order, Long> id;
    public static volatile SingularAttribute<Order, Double> totAmt;

}