package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 *              (edited by Dan Noonan)
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    //private boolean metWithHr;
    //private boolean metDeptStaff;
    //private boolean reviewedDeptPolicies;
    private String cubeId;
    private Date hireDate;
    private boolean active;

    public Employee() {
        hireDate = new Date();
    }
    
    public Employee(String firstName, String lastName, String ssn) {
        hireDate = new Date();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public Date getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    private String getHireDateString() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(hireDate);
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        System.out.println("Met with Hr on " + getHireDateString());
        //metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        /*if(metWithHr) {
            System.out.println("Met with Dept. Staff on "
                    + getCurrentDateString());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }*/
        System.out.println("Met with Dept. Staff on "
                    + getHireDateString());
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        /*if(metWithHr && metDeptStaff) {
            System.out.println("Reviewed Dept. Policies on "
                    + getCurrentDateString());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }*/
        System.out.println("Reviewed Dept. Policies on "
                    + getHireDateString());
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        /*if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            System.out.println("Moved into cube on "
                    + getCurrentDateString());
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }*/
        System.out.println("Moved into cube on "
                    + getHireDateString());
        this.cubeId = cubeId;
    }

    public void moveIn(String cubeId) {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
        active = true;
    }
    
    public String getStatus() {
        String fmtDate = getHireDateString();
        if(active) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
