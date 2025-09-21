package com.studyopedia;
import java.util.ArrayList;
import java.util.Scanner;
	class Employee
	{
		String name;
		String position;		//ask about char
		int salary;
		int e_id;
		
		Employee(String name, String position, int salary, int e_id)
		{
			this.name=name;
			this.position=position;
			this.salary=salary;
			this.e_id=e_id;
		}
		public void display_e_details() 
		{
			System.out.println("Employee details:"+" "+name+" "+position+" "+salary+" "+e_id);	
		}
		
		public void update_salary(int sal)
		{
			this.salary = sal;
			System.out.println("Updated salary:"+sal);
		}
		
		public void ann_sal()
		{
			System.out.println("Annual salary:"+this.salary*12);
		}
	}
	
	class Manager extends Employee
	{
		ArrayList<Employee> emp = new ArrayList<>();
		
		Manager(String name, String position, int salary, int e_id)
		{
			super(name,position,salary,e_id);			//super is used to access same attributes of different class with the way shown here
			System.out.println("Employees under manager:");
		}
		
		public void add_employee(Employee e)
		{
			emp.add(e);
		}
		
		public void display_employee()
		{
			if(emp.isEmpty())
			{
				System.out.println("No employee under supervision of"+name);
			}
			else {
				for(Employee i : emp) {
					System.out.println("Employee details:"+" "+i.name+" "+i.position+" "+i.salary+" "+i.e_id);	
				}
			}
		}
	}
	public class employee_management_system {
	
		public static void main(String[] args) {
		//	char e='E';	character keyword 
			
			Employee e1 = new Employee("a", "SDE", 50000, 14);
			Employee e2 = new Employee("b", "SDE", 50000, 14);
			Employee e3 = new Employee("c", "SDE", 50000, 14);
			Employee e4 = new Employee("d", "SDE", 50000, 14);
			Employee e5 = new Employee("e", "SDE", 50000, 14);
			
			e1.display_e_details();
			e2.display_e_details();
			e3.display_e_details();
			
			Manager m1 = new Manager("a", "SDE", 50000, 18);
			m1.add_employee(e1);
			m1.display_employee();
		}
	
	}
	//when you create class, its name becomes data type for objects