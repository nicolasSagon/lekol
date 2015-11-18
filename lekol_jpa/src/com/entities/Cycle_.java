package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.930+0100")
@StaticMetamodel(Cycle.class)
public class Cycle_ {
	public static volatile SingularAttribute<Cycle, Integer> id;
	public static volatile SingularAttribute<Cycle, String> name;
	public static volatile ListAttribute<Cycle, Level> levels;
}
