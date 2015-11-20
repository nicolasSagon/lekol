package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-20T10:50:31.755+0100")
@StaticMetamodel(Payment.class)
public class Payment_ {
	public static volatile SingularAttribute<Payment, Integer> id;
	public static volatile SingularAttribute<Payment, Integer> frequency;
	public static volatile SingularAttribute<Payment, String> mode;
	public static volatile SingularAttribute<Payment, Cheque> cheque;
}
