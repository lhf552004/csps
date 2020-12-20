package com.jci.emes.models;

import java.util.UUID;

public class AuthenticationResponse {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    private final String firstName;
    private final String lastName;
    private final UUID id;
    private final String userName;
    private final String jwt;
    public AuthenticationResponse(String jwt, UUID id, String userName, String firstName, String lastName) {
        this.jwt = jwt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
    }
    public String getJwt() {
        return jwt;
    }

}
