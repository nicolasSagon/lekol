package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.899+0100")
@StaticMetamodel(Activity.class)
public class Activity_ {
	public static volatile SingularAttribute<Activity, Integer> id;
	public static volatile SingularAttribute<Activity, String> name;
	public static volatile SingularAttribute<Activity, Room> room;
	public static volatile SingularAttribute<Activity, Class> clazz;
	public static volatile SingularAttribute<Activity, Teacher> teacher;
}
