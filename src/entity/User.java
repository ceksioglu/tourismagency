package entity;

/**
 * Represents a user in the system.
 */

public class User {

    private int id;
    private String username;
    private String password;
    private String role;

    public User() {}

    /**
     * Constructs a new User object with the specified parameters.
     *
     * @param id       the unique identifier for the user
     * @param username the username of the user
     * @param password the password of the user
     * @param role     the role of the user (ADMIN, PERSONNEL)
     */

    public User(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}