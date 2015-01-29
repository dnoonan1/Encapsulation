/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Dan Noonan
 */
public class Employer {
    private ArrayList<Employee> employees;
    
    public Employer() {
        employees = new ArrayList<Employee>();
    }
    
    public void hire(String firstName, String lastName, String ssn,
            String cubeId) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        e.moveIn(cubeId);
    }
    
    public String getEmployeeStatus() {
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) {
            sb.append(e.getFullName() + "'s status is: " + e.getStatus());
        }
        return sb.toString();
    }
}
