package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.977+0100")
@StaticMetamodel(Teacher.class)
public class Teacher_ {
	public static volatile SingularAttribute<Teacher, Integer> id;
	public static volatile SingularAttribute<Teacher, String> firstName;
	public static volatile SingularAttribute<Teacher, String> lastName;
	public static volatile ListAttribute<Teacher, Activity> activities;
	public static volatile ListAttribute<Teacher, Class> clazzs;
}
