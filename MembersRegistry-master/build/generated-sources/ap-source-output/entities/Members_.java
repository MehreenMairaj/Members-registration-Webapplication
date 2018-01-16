package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-16T09:59:35")
@StaticMetamodel(Members.class)
public class Members_ { 

    public static volatile SingularAttribute<Members, String> firstName;
    public static volatile SingularAttribute<Members, String> phoneNumber;
    public static volatile SingularAttribute<Members, String> gender;
    public static volatile SingularAttribute<Members, String> surname;
    public static volatile SingularAttribute<Members, Date> registrationDate;
    public static volatile SingularAttribute<Members, Long> id;
    public static volatile SingularAttribute<Members, Date> birthDate;
    public static volatile SingularAttribute<Members, String> email;

}