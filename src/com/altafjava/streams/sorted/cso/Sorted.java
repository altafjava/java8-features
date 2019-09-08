package com.altafjava.streams.sorted.cso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Custom Sorting Order
public class Sorted {

	public static void main(String[] args) {
		Employee employee1 = new Employee(222, "Sam", 15000);
		Employee employee2 = new Employee(666, "Jafar", 10000);
		Employee employee3 = new Employee(333, "Altaf", 25000);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		System.out.println("employees= " + employees);
		// Without Streams sorting by salary high to low(custom sorting order)
		Collections.sort(employees, new EmployeeComparator());
		System.out.println("without stream sorting employees= " + employees);

		// With Streams
		List<Employee> employees2 = employees.stream().sorted(new EmployeeComparator()).collect(Collectors.toList());
		System.out.println("with stream sorting employees= " + employees2);

	}
}
