package com.packt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankEmployee
{
	@Id
	private int ID;
	private String firstName;
	private String surname;
	private int age;
	private double salary;
	private String designation;
	private String branch;
	
	public BankEmployee( )
	{
		
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public String getBranch()
	{
		return branch;
	}

	public void setBranch(String branch)
	{
		this.branch = branch;
	}

	@Override
	public String toString()
	{
		return "BankEmployee [ID=" + ID + ", firstName=" + firstName + 
				", surname=" + surname + ", age=" + age +
				", salary=" + salary + ", designation=" + designation + 
				", branch=" + branch + "]";
	}
	
	
}
