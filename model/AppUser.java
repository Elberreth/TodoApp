package se.lexicon.model;


import se.lexicon.util.AppRole;

import java.util.Objects;

public class AppUser {
    private String user_Name;
    private String password;
    private AppRole role;

    public String getUserName() {return user_Name;}
    public String getPassword() {return password;}
    public AppRole getRole() {return role;}

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("Role was null");
        this.role = role;
    }
    public void setUserName(String userName) {
        if (userName == null) throw new IllegalArgumentException("Username was null");
        else this.user_Name = user_Name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(user_Name, appUser.user_Name)  && role == appUser.role;
    }

    @Override
    public String toString() {
        return
                "UserName: " + getUserName() + "\n" +
                "Role: " + getRole();
    }

    @Override
    public int hashCode() {return user_Name.hashCode() + role.hashCode();}

}

