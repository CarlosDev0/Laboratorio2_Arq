package entities;

import entities.Category;
import entities.Film;
import entities.FilmCategoryPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-01T08:59:19")
@StaticMetamodel(FilmCategory.class)
public class FilmCategory_ { 

    public static volatile SingularAttribute<FilmCategory, Date> lastUpdate;
    public static volatile SingularAttribute<FilmCategory, FilmCategoryPK> filmCategoryPK;
    public static volatile SingularAttribute<FilmCategory, Film> film;
    public static volatile SingularAttribute<FilmCategory, Category> category;

}