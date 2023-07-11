package com.train.booking;

public class Passenger {
	private int PassengrId;
	private String PassengerName;
	private int age;
	private BankAccount bankAccount;

	public int getPassengrId() {
		return PassengrId;
	}

	public void setPassengrId(int passengrId) {
		PassengrId = passengrId;
	}

	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	
	

}
