package com.kodilla.patterns2.facade.employees;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceFacade {
    @Autowired
    private CompanyDao companyDao;

    public List<Company> searchCompanyNameByFragment(final String companyName) {
        return companyDao.retrieveCompanyByNameFragment(companyName);
    }
}
