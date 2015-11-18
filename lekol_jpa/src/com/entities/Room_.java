package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.962+0100")
@StaticMetamodel(Room.class)
public class Room_ {
	public static volatile SingularAttribute<Room, Integer> id;
	public static volatile SingularAttribute<Room, String> name;
	public static volatile ListAttribute<Room, Activity> activities;
	public static volatile ListAttribute<Room, Class> clazzs;
}
