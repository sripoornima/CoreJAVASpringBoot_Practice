package com.dateandtime;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
class Employee {
	String name;
	LocalDate joiningDate;
	Employee(String name, LocalDate joiningDate) {
		this.name = name;
		this.joiningDate = joiningDate;
	}
}
public class EmployeeJoiningDates {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", LocalDate.of(2020, 3, 15)),
				new Employee("Bob", LocalDate.of(2020, 2, 29)),
				new Employee("Charlie", LocalDate.of(2019, 7, 19))
				);
		Map<Integer, List<Employee>> groupedByYear = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.joiningDate.getYear()));
		System.out.println("Employees grouped by year of joining:");
		groupedByYear.forEach((year, empList) -> {
			System.out.println(year + ": " + empList.stream().map(emp ->
			emp.name).collect(Collectors.joining(", ")));
		});
		System.out.println("\nEmployees who joined in a leap year:");
		employees.stream()
		.filter(emp -> emp.joiningDate.isLeapYear())
		.forEach(emp -> System.out.println(emp.name));
	}
}