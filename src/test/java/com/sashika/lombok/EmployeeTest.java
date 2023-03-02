package com.sashika.lombok;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sashika.Udana
 * on 02/Mar/2023
 */
public class EmployeeTest {

    @Test
    public void testSetters_shouldBeAbleToSetAttributeBySetters() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Adam");
        employee.setDesignation(DESIGNATION.DEVELOPER);
    }

    @Test
    public void testGetters_whenGettersAreInvoked_shouldReturnCorrectAttributes() {
        int id =1;
        String name = "Adam";
        DESIGNATION designation = DESIGNATION.DEVELOPER;
        Employee employee = new Employee();

        employee.setId(id);
        employee.setName(name);
        employee.setDesignation(designation);

        assertThat(employee.getId()).isEqualTo(id);
        assertThat(employee.getName()).isEqualTo(name);
        assertThat(employee.getDesignation()).isEqualTo(designation);
        assertThat(employee.toString()).isEqualTo("Employee(id=1, name=Adam, designation=DEVELOPER)");
    }

}
