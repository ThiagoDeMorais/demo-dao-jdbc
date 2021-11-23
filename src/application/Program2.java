package application;

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


		sc.close();

	}

}
