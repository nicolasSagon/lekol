package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.930+0100")
@StaticMetamodel(Class.class)
public class Class_ {
	public static volatile SingularAttribute<Class, Integer> id;
	public static volatile ListAttribute<Class, Activity> activities;
	public static volatile ListAttribute<Class, Child> childs;
	public static volatile SingularAttribute<Class, Teacher> teacher;
	public static volatile SingularAttribute<Class, Room> room;
	public static volatile SingularAttribute<Class, Level> level;
	public static volatile SingularAttribute<Class, School> school;
}
