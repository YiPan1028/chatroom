package entity;

import java.util.UUID;

/**
 * A simple implementation of the User interface.
 */
public class CommonUser implements User {

    private final String username;
    private final String password;
    private final String userID;

    public CommonUser(String name, String password) {
        this.username = name;
        this.password = password;
        this.userID = UUID.randomUUID().toString();
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return userID;
    }

}
