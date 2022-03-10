package mx.edu.utez.marketplace.rol.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.person.model.Person;
import mx.edu.utez.marketplace.user.model.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Rol {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Column(nullable = false, length = 30)
    private String description;
 @ManyToMany
    @JoinTable(name = "user_rol",
    joinColumns = @JoinColumn(name = "role_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    @JsonIgnore
    private Set<User> users;

    public Rol() {
    }

    public Rol(String description) {
        this.description = description;
    }

    public Rol(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
