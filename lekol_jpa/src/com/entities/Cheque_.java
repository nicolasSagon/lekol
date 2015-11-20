package com.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-20T10:50:31.735+0100")
@StaticMetamodel(Cheque.class)
public class Cheque_ {
	public static volatile SingularAttribute<Cheque, Integer> id;
	public static volatile SingularAttribute<Cheque, Integer> amount;
	public static volatile SingularAttribute<Cheque, String> bankName;
	public static volatile SingularAttribute<Cheque, Date> collactionDate;
	public static volatile SingularAttribute<Cheque, String> number;
	public static volatile SingularAttribute<Cheque, String> tutorName;
	public static volatile ListAttribute<Cheque, Payment> payments;
}
