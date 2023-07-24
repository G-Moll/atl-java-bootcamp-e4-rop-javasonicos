package com.academy.atl.newsletter.dao;

import com.academy.atl.newsletter.models.Email;

import java.util.List;

public interface EmailDao {
    Email getEmail( Long id );  // Get Single
    List<Email> getAllEmail();  // Get All
    void delete( Long id );     // Delete Single
    void save( Email email );   // Post Single
}
