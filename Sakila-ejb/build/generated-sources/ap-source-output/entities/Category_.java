package entities;

import entities.FilmCategory;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-01T08:59:19")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile CollectionAttribute<Category, FilmCategory> filmCategoryCollection;
    public static volatile SingularAttribute<Category, Date> lastUpdate;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Short> categoryId;

}