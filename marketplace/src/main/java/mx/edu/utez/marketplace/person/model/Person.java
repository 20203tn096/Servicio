package mx.edu.utez.marketplace.person.model;

import mx.edu.utez.marketplace.user.model.User;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private String birthday;
    @Column(nullable = false, unique = true, length = 10)
    private String CURP;
    @OneToOne(mappedBy = "person")
    private User user;

    public Person(String name, String lastname, String surname, String birthday, String CURP, User user) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.birthday = birthday;
        this.CURP = CURP;
        this.user = user;
    }

    public Person(long id, String name, String lastname, String surname, String birthday, String CURP, User user) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.birthday = birthday;
        this.CURP = CURP;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
