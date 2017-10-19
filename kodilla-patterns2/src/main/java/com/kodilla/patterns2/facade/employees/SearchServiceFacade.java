package com.kodilla.patterns2.facade.employees;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceFacade {
    @Autowired
    private SearchService searchService;

    public List<Company> searchCompanyNameByFragment(final String companyName) {
        return searchService.searchCompanyName(companyName);
    }
}
