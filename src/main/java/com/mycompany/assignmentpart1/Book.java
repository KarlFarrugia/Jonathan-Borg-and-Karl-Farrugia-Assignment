package com.mycompany.assignmentpart1;

import java.util.*;
/**
 *
 * @author Jonathan Borg and Karl Farrugia
 */
public class Book {
    private String title;
    private String author;
    private Genre genre;
    private Date dateOfPublish;
    private int edition;
    private Date dateOfLoan;
    private User loanTo;
    
    //getters
    public String getTitle() {
        return title;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
}
