package Entities;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name = "TB_USER")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;
    private String Email;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department Department;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
