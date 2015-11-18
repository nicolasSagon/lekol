package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.946+0100")
@StaticMetamodel(Payment.class)
public class Payment_ {
	public static volatile SingularAttribute<Payment, Integer> id;
	public static volatile SingularAttribute<Payment, Integer> frequency;
	public static volatile SingularAttribute<Payment, String> mode;
	public static volatile ListAttribute<Payment, Family> families;
	public static volatile SingularAttribute<Payment, Check> check;
}
