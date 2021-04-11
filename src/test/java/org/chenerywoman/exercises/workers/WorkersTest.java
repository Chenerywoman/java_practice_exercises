package org.chenerywoman.exercises.workers;

import org.junit.Test;
import static org.junit.Assert.*;

public class WorkersTest {

    Member myMember = new Member();
    Employee employeeOne = new Employee();
    Manager managerTwo = new Manager();

    @Test
    public void getMemberSalary(){
        double salary = 30000.00;
        myMember.setSalary(salary);

        assertEquals("Your salary is £30000.00", myMember.printSalary());
    }

    @Test
    public void getEmployeeDetails(){
        employeeOne.setSpecialization("Java");
        employeeOne.setSalary(20000);

        assertEquals("Your salary is £20000.00", employeeOne.printSalary());
        assertEquals("Java", employeeOne.getSpecialization());
    }

    @Test
    public void getManagerDetails(){
        managerTwo.setDepartment("Android");
        managerTwo.setPhoneNumber(12345678901L);

        assertEquals(12345678901L, managerTwo.getPhoneNumber());
        assertEquals("Android", managerTwo.getDepartment());

    }

}
