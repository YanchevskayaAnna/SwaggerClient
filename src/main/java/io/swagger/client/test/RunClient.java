package io.swagger.client.test;

import io.swagger.client.ApiException;
import io.swagger.client.api.EmployeeControllerApi;
import io.swagger.client.model.Employee;

import java.sql.SQLOutput;
import java.util.List;

public class RunClient {
    public static void main(String[] args) throws ApiException {

        EmployeeControllerApi api = new EmployeeControllerApi();
        Employee employee = new Employee();
        employee.setName("ZuzuKochka_");
        employee.setRole("Tra-la-la");
        Employee employee1 = api.newEmployeeUsingPOST(employee);
        System.out.printf("name %s role %s", employee1.getName(), employee1.getRole());
    }
}
