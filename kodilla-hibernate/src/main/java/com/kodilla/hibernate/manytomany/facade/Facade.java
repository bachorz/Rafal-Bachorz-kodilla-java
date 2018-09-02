package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> companySearchProcess (final String fragmentName) throws SearchingProcessingException {

        String arg = "%" + fragmentName + "%";
        List<Company> resultOfSearch;
        LOGGER.info("Searching companies by fragment name: " + arg);
        resultOfSearch = companyDao.findCompanyByFragment(arg);
        if (resultOfSearch.size() == 0) {
            LOGGER.error(SearchingProcessingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchingProcessingException(SearchingProcessingException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("Result of searching for companies");
            resultOfSearch.forEach(company -> LOGGER.info("Company: " + company));

            return resultOfSearch;
        }
    }

    public List<Employee> employeeSearchProcess (final String fragmentName) throws SearchingProcessingException {

        String arg = "%" + fragmentName + "%";
        List<Employee> resultOfSearch;
        LOGGER.info("Searching employees by fragment last name: " + arg);
        resultOfSearch = employeeDao.findEmployeeByFragment(arg);
        if (resultOfSearch.size() == 0) {
            LOGGER.error(SearchingProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchingProcessingException(SearchingProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("Result of searching for employees");
            resultOfSearch.forEach(employee -> LOGGER.info("Employee: " + employee));

            return resultOfSearch;
        }
    }
}
