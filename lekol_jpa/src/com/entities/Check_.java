package com.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.915+0100")
@StaticMetamodel(Check.class)
public class Check_ {
	public static volatile SingularAttribute<Check, Integer> id;
	public static volatile SingularAttribute<Check, Integer> amount;
	public static volatile SingularAttribute<Check, String> bankName;
	public static volatile SingularAttribute<Check, Date> collactionDate;
	public static volatile SingularAttribute<Check, String> number;
	public static volatile SingularAttribute<Check, String> tutorName;
	public static volatile ListAttribute<Check, Payment> payments;
}
