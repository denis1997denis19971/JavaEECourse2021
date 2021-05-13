package by.qdpub.entities;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class NumberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phone")
    private int idPhone;

    @Column
    private String number;

    @ManyToOne(targetEntity = PersonEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_fk", referencedColumnName = "id")
    private PersonEntity myperson;

    public NumberEntity() {
    }

    public NumberEntity(String number, PersonEntity person) {
        this.number = number;
        this.myperson = person;
    }

    public NumberEntity(int id_phone, String number, PersonEntity person) {
        this.idPhone = id_phone;
        this.number = number;
        this.myperson = person;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int id_phone) {
        this.idPhone = id_phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PersonEntity getPerson() {
        return myperson;
    }

    public void setPerson(PersonEntity person) {
        this.myperson = person;
    }
}
