package com.jdc.hwy.inheritance;

import com.jdc.hwy.inheritance.Account.Member;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String PASSWORD = "password";
	public static final String LOGIN_ID = "loginId";
	public static final String NAME = "name";
	public static final String MEMBER = "member";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.hwy.inheritance.Account#password
	 **/
	public static volatile SingularAttribute<Account, String> password;
	
	/**
	 * @see com.jdc.hwy.inheritance.Account#loginId
	 **/
	public static volatile SingularAttribute<Account, String> loginId;
	
	/**
	 * @see com.jdc.hwy.inheritance.Account#name
	 **/
	public static volatile SingularAttribute<Account, String> name;
	
	/**
	 * @see com.jdc.hwy.inheritance.Account#member
	 **/
	public static volatile SingularAttribute<Account, Member> member;
	
	/**
	 * @see com.jdc.hwy.inheritance.Account#id
	 **/
	public static volatile SingularAttribute<Account, Integer> id;
	
	/**
	 * @see com.jdc.hwy.inheritance.Account
	 **/
	public static volatile EntityType<Account> class_;

}

