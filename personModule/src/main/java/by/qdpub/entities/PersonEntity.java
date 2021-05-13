package by.qdpub.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToOne(mappedBy = "pers")
    private PassportEntity usr_passport;
    @OneToMany(mappedBy = "myperson")
    private Set<NumberEntity> usr_mobile;
    @Column(name = "person_name")
    private String name;
    @Column(name = "person_age")
    private int age;

    public PersonEntity() {

    }

    public PersonEntity(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public PersonEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PassportEntity getUsr_passport() {
        return usr_passport;
    }

    public void setUsr_passport(PassportEntity usr_passport) {
        this.usr_passport = usr_passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return id == that.id &&
                age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

}
