package entities;

import entities.Actor;
import entities.Film;
import entities.FilmActorPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-01T08:59:19")
@StaticMetamodel(FilmActor.class)
public class FilmActor_ { 

    public static volatile SingularAttribute<FilmActor, Actor> actor;
    public static volatile SingularAttribute<FilmActor, FilmActorPK> filmActorPK;
    public static volatile SingularAttribute<FilmActor, Date> lastUpdate;
    public static volatile SingularAttribute<FilmActor, Film> film;

}