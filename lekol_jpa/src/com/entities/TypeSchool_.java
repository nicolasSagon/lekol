package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.993+0100")
@StaticMetamodel(TypeSchool.class)
public class TypeSchool_ {
	public static volatile SingularAttribute<TypeSchool, Integer> id;
	public static volatile SingularAttribute<TypeSchool, String> name;
	public static volatile ListAttribute<TypeSchool, School> schools;
}
