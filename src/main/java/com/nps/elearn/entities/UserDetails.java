package com.nps.elearn.entities;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("userDetails")
public class UserDetails {

    @Id
    private String userId;

    private String userName;

    private String userAddress;
}
