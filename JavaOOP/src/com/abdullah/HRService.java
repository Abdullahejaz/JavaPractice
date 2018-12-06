package com.abdullah;

import java.util.ArrayList;
import java.util.List;

public class HRService {

List<Employee> employeeData = new ArrayList<>();

public void addEmployee(Employee employee){

    if(employeeData.contains(employee)){
        System.out.println("Employee " +employee.getFirstName() + " already exist");
    }
    else{
        employeeData.add(employee);
    }
}

public static void removeEmployee(){}

public static void searchEmployee(){}


}
