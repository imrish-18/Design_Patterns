package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSorting{

	int id;
    
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public EmployeeSorting(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeSorting> employeeList = new ArrayList<EmployeeSorting>();
        
		
		employeeList.add(new EmployeeSorting(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeSorting(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new EmployeeSorting(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new EmployeeSorting(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
	employeeList.add(new EmployeeSorting(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
      
 employeeList.sort(Comparator.comparing(EmployeeSorting::getId).thenComparing(EmployeeSorting::getSalary));
 Map<Integer, EmployeeSorting> map =employeeList.stream().collect(Collectors.toMap(EmployeeSorting::getId,Function.identity()));
//	Optional<EmployeeSorting> maxSalaryEmp = 
//            employeeList.stream()
//            .collect(Collectors.maxBy(Comparator.comparing(EmployeeSorting::getSalary)));
//	System.out.println("Employee with max salary:"
//            + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
//	 Optional<EmployeeSorting> minAgeEmp =    
//	            employeeList.stream()
//	            .collect(Collectors.minBy(Comparator.comparing(EmployeeSorting::getAge)));
//	    System.out.println("Employee with min age:"
//	            + (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
//	    double maxSalary = employeeList.stream()
//				 .map(EmployeeSorting::getSalary)
//				 .max(Double::compare).get();
//	    System.out.println(maxSalary);t
        
 
	    System.out.println("values in map");
	    System.out.println(map);
	    Set<Entry<Integer, EmployeeSorting>> entry=map.entrySet();
	   
	    map.entrySet().stream().forEach(res->System.out.println(res.getKey()+" "+res.getValue()));;
	    

	}

}
