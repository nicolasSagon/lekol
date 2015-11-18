package com.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.915+0100")
@StaticMetamodel(Child.class)
public class Child_ {
	public static volatile SingularAttribute<Child, Integer> id;
	public static volatile SingularAttribute<Child, Date> birthDate;
	public static volatile SingularAttribute<Child, String> firstName;
	public static volatile SingularAttribute<Child, String> gender;
	public static volatile SingularAttribute<Child, String> lastName;
	public static volatile SingularAttribute<Child, School> school;
	public static volatile SingularAttribute<Child, Class> clazz;
}
