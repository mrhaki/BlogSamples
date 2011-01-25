package com.mrhaki.app.services;

public interface UserService {
    /**
     * Find username for given name.
     * 
     * @param name
     *            Name of the user.
     * @return Found username or empty if not found.
     */
    public String findUsername(String name);
}
