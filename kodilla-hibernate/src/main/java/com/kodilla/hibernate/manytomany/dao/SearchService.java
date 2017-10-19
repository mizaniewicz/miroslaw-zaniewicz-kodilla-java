package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    CompanyDao companyDao;

    public List<Company> searchCompanyName(String companyName) {
        return companyDao.retrieveCompanyByNameFragment(companyName);
    }
}
