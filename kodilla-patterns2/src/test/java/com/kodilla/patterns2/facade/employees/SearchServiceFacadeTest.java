package com.kodilla.patterns2.facade.employees;

import com.kodilla.hibernate.KodillaHibernateApplication;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.patterns2.KodillaPatterns2Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import({KodillaHibernateApplication.class, KodillaPatterns2Application.class})
public class SearchServiceFacadeTest {
    @Autowired
    private SearchServiceFacade searchServiceFacade;

    @Test
    public void testRetrieveCompanyByName() {
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        searchServiceFacade.saveCompany(softwareMachine);
        int companyId = softwareMachine.getId();

        List<Company> companyName = searchServiceFacade.searchCompanyNameByFragment("of");

        try {
            Assert.assertEquals(1, companyName.size());
        } finally {
            //CleanUp
            searchServiceFacade.deleteCompany(companyId);
        }
    }

    @Test
    public void testRetrieveEmployeeByLastname() {
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        johnSmith.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(johnSmith);
        searchServiceFacade.saveEmployee(johnSmith);
        int id = johnSmith.getId();

        List<Employee> employeeLastname = searchServiceFacade.searchEmployeeLastnameByFragment("mith");

        try {
            Assert.assertEquals(1, employeeLastname.size());
        } finally {
            //CleanUp
            searchServiceFacade.deleteEmployee(id);
        }
    }
}