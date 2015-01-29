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
    
    public void hire(Employee e, String cubeId) {
        employees.add(e);
        e.moveIn(cubeId);
    }
}
