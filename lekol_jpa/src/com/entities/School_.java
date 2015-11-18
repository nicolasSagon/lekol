package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.977+0100")
@StaticMetamodel(School.class)
public class School_ {
	public static volatile SingularAttribute<School, Integer> id;
	public static volatile SingularAttribute<School, String> address;
	public static volatile SingularAttribute<School, String> directorMail;
	public static volatile SingularAttribute<School, String> directorName;
	public static volatile SingularAttribute<School, String> directPhone;
	public static volatile SingularAttribute<School, String> fax;
	public static volatile SingularAttribute<School, String> name;
	public static volatile SingularAttribute<School, Integer> numberRoom;
	public static volatile SingularAttribute<School, String> phone;
	public static volatile SingularAttribute<School, Integer> surface;
	public static volatile ListAttribute<School, Child> childs;
	public static volatile ListAttribute<School, Class> clazzs;
	public static volatile SingularAttribute<School, TypeSchool> typeSchool;
}
