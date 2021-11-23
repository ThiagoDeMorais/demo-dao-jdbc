package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== TEST 1: department insert ===\n");

		Department department = new Department(null, "Sales");

		departmentDao.insert(department);
		System.out.println("id of new department: " + department.getId());
		
		
		System.out.println("\n=== TEST 2: department findById ===\n");
		Department newDepartment = departmentDao.findById(7);

		
		System.out.println("Department: " + newDepartment.toString());
		
		System.out.println("\n=== TEST 3: department findAll ===\n");

		
		for(Department element: departmentDao.findAll()) {
			System.out.println(element.toString());
		}
		
		System.out.println("\n=== TEST 4: department update ===\n");

		department = departmentDao.findById(19);
		department.setName("maintenance");
		departmentDao.update(department);
		System.out.println("id of new department: " + department.getId());

	
		System.out.println("\n=== TEST 5: department delete ===\n");
		departmentDao.deleteById(23);
		sc.close();

	}

}
