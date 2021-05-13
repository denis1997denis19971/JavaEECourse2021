package by.qdpub.entities;

import javax.persistence.*;

@Entity
@Table(name = "passport")
public class PassportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "serial_number")
    private String serialPassportNumber;

    @OneToOne(targetEntity = PersonEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person_fk", referencedColumnName = "id")
    private PersonEntity pers;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    public PassportEntity() {

    }

    public PassportEntity(int id, String serialPassportNumber, String name, String adress) {
        this.id = id;
        this.serialPassportNumber = serialPassportNumber;
        this.name = name;
        this.adress = adress;
    }

    public PassportEntity(String serialPassportNumber, String name, String adress) {
        this.serialPassportNumber = serialPassportNumber;
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialPassportNumber() {
        return serialPassportNumber;
    }

    public void setSerialPassportNumber(String serialPassportNumber) {
        this.serialPassportNumber = serialPassportNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


}
