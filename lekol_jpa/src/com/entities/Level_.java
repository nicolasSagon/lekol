package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.946+0100")
@StaticMetamodel(Level.class)
public class Level_ {
	public static volatile SingularAttribute<Level, Integer> id;
	public static volatile SingularAttribute<Level, String> name;
	public static volatile ListAttribute<Level, Class> clazzs;
	public static volatile SingularAttribute<Level, Cycle> cycle;
}
