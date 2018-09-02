package com.kodilla.hibernate.manytomany.facade;

public class SearchingProcessingException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company was not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee was not found";

    public SearchingProcessingException(String message) {
        super(message);
    }
}
