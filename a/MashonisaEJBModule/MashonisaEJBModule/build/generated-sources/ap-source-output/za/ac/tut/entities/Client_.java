package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Loan_application;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-20T18:44:08")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> password;
    public static volatile SingularAttribute<Client, String> cellNo;
    public static volatile SingularAttribute<Client, String> occupation;
    public static volatile SingularAttribute<Client, String> address;
    public static volatile SingularAttribute<Client, String> gender;
    public static volatile SingularAttribute<Client, Loan_application> application;
    public static volatile SingularAttribute<Client, String> surname;
    public static volatile SingularAttribute<Client, String> name;
    public static volatile SingularAttribute<Client, Long> id;
    public static volatile SingularAttribute<Client, String> age;
    public static volatile SingularAttribute<Client, String> username;

}