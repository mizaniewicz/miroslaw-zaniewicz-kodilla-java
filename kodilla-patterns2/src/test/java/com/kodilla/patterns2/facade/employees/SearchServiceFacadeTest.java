package com.kodilla.patterns2.facade.employees;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceFacadeTest {
    @Autowired
    private SearchServiceFacade searchServiceFacade;

    @Test
    public void testRetrieveCompanyByName() {
        searchServiceFacade.searchCompanyNameByFragment("of");
    }
}