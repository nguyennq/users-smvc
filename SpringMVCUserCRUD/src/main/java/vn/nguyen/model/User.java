package vn.nguyen.model;

import javax.persistence.*;

/**
 * Created by nals on 11/10/17.
 */
@Entity
@Table(name = "myusers")
// , schema = "userdb", catalog = "")
public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private Integer phone;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        if (username != null ? !username.equals(user.username) : user.username != null) return false;
//        if (password != null ? !password.equals(user.password) : user.password != null) return false;
//        if (firstname != null ? !firstname.equals(user.firstname) : user.firstname != null) return false;
//        if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;
//        if (email != null ? !email.equals(user.email) : user.email != null) return false;
//        if (address != null ? !address.equals(user.address) : user.address != null) return false;
//        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = username != null ? username.hashCode() : 0;
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
//        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        return result;
//    }
}
