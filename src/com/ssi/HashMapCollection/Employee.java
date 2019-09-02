package com.ssi.HashMapCollection;

import java.util.HashMap;

public class Employee {
	int eno;
	String ename;
	int sal;
	String designation;
	private static Employee e1;
	private static Employee e2;
	private static Employee e3;
	private static Employee e4;
	private static Employee e5;
	
	
	public Employee(int eno, String ename, int sal, String designation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + sal;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}


	public static void main (String args[]){
		
		e5 = new Employee(100, "Gaurav", 80000,"Manager");	
	e1 = new Employee(100, "Gaurav", 80000,"Manager");
	e2 = new Employee(101, "Anjali", 20000,"Engineer");
	e3 = new Employee(102, "Pooja", 40000,"HR");
	e4 = new Employee(103, "Sadiya", 30000,"Manager");
	HashMap<Employee, Project> hm=new HashMap<>();
	hm.put(e1,Project.p1);
	hm.put(e2,Project.p2);
	hm.put(e3,Project.p3);
	hm.put(e4,Project.p4);
	hm.put(e5,Project.p4);
	hm.put(e2,Project.p2);// HASH MAP CONSTRAINT NOT VIOLATED AS HASHCODE IS WRITTEN
	
	System.out.println(hm);
		
		
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", designation=" + designation + "]";
	}
	

}
