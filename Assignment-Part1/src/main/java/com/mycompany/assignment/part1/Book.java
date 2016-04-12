/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment.part1;

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

    public String getAuthor() {
        return author;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public Date getDateOfPub() {
        return dateOfPublish;
    }
    
    public int getEdition() {
        return edition;
    }
    
    public Date getDateOfLoan() {
        return dateOfLoan;
    }
    
    public User getLoanTo() {
        return loanTo;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    public void setDateOfPub(Date dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
    
    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    public void setDateOfLoan(Date dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }
    public void setLoanTo(User loanTo) {
        this.loanTo = loanTo;
    }   
}



