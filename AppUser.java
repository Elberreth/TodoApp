package se.lexicon;


import java.util.Objects;

public class AppUser {
    private String userName;
    private String password;
    private AppRole role;

    public String getUserName() {return userName;}
    public String getPassword() {return password;}
    public AppRole getRole() {return role;}

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("Role was null");
        this.role = role;
    }
    public void setUserName(String userName) {
        if (userName == null) throw new IllegalArgumentException("Username was null");
        else this.userName = userName;
    }
    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("Password was null");
        else this.password = password;

    }
    public AppUser(String userName, String password,  AppRole role) {
        setUserName(userName);
        setPassword(password);
        setRole(role);
    }
    @Override
    public boolean equals(Object obj) {
        AppUser cast = AppUser.class.cast(obj);
        return cast.getUserName() == getUserName() && cast.getRole() == getRole();
    }

    @Override
    public String toString() {
        return
                "UserName: " + getUserName() + "\n" +
                "Role: " + getRole();
    }

    @Override
    public int hashCode() {return userName.hashCode() + role.hashCode();}

}

