package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-18T11:07:33.946+0100")
@StaticMetamodel(Family.class)
public class Family_ {
	public static volatile SingularAttribute<Family, Integer> id;
	public static volatile SingularAttribute<Family, String> inChargeAddress;
	public static volatile SingularAttribute<Family, String> inChargeFirstName;
	public static volatile SingularAttribute<Family, String> inChargeLastName;
	public static volatile SingularAttribute<Family, String> inChargePhone;
	public static volatile SingularAttribute<Family, String> parent1Address;
	public static volatile SingularAttribute<Family, String> parent1FamilySituation;
	public static volatile SingularAttribute<Family, String> parent1FirstName;
	public static volatile SingularAttribute<Family, String> parent1HomePhone;
	public static volatile SingularAttribute<Family, String> parent1LastName;
	public static volatile SingularAttribute<Family, String> parent1Mail;
	public static volatile SingularAttribute<Family, String> parent1MobilePhone;
	public static volatile SingularAttribute<Family, String> parent1SocialSecurityNumber;
	public static volatile SingularAttribute<Family, String> parent2Address;
	public static volatile SingularAttribute<Family, String> parent2FamilySituation;
	public static volatile SingularAttribute<Family, String> parent2FirstName;
	public static volatile SingularAttribute<Family, String> parent2HomePhone;
	public static volatile SingularAttribute<Family, String> parent2LastName;
	public static volatile SingularAttribute<Family, String> parent2Mail;
	public static volatile SingularAttribute<Family, String> parent2MobilePhone;
	public static volatile SingularAttribute<Family, String> parent2SocialSecurityNumber;
	public static volatile SingularAttribute<Family, Payment> payment;
}
