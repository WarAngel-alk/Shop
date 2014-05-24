package com.my.model.entity;

import com.my.model.entity.order.Order;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 22.05.14
 * Time: 19:27
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 64, unique = true)
    private String login;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true, length = 64)
    private String firstName;

    @Column(nullable = true, length = 64)
    private String lastName;

    @Column(nullable = true, length = 16, unique = true)
    private String telephone;

    @OneToMany
    private Set<Order> orders;

    User() {
        orders = new TreeSet<>();
    }

    public User(String login, String password, String email) {
        this();
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
