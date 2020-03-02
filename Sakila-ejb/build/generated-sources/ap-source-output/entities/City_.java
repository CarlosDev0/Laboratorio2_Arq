package entities;

import entities.Country;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-01T08:59:19")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> city;
    public static volatile SingularAttribute<City, Date> lastUpdate;
    public static volatile SingularAttribute<City, Short> cityId;
    public static volatile SingularAttribute<City, Country> countryId;

}