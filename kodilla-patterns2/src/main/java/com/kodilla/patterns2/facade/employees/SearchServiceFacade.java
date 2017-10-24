package com.kodilla.patterns2.facade.employees;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyNameByFragment(String companyName) {
        return companyDao.retrieveCompanyByNameFragment(companyName);
    }

    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteCompany(int companyId) {
        companyDao.delete(companyId);
    }

    public List<Employee> searchEmployeeLastnameByFragment(String lastname) {
        return employeeDao.retrieveEmployeeByLastnameFragment(lastname);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteEmployee(int employeeId) {
        employeeDao.delete(employeeId);
    }
}
