package com.synisys.training.classes;

import java.util.ArrayList;

public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private int age;
	private boolean isAdmin;
	private static ArrayList<User> usersList;

	public User(String firstName, String lastName, String userName, String password, int age, boolean isAdmin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.isAdmin = isAdmin;
	}

	public static void addPersonToList(User user) {
		usersList.add(user);
	}

	public static ArrayList<User> getPersonsList() {
		return usersList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean admin) {
		isAdmin = admin;
	}

	@Override public String toString() {
		return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}' + '\n';
	}
}
