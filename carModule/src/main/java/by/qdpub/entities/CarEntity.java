package by.qdpub.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "speed")
    private int speed;

    @Column(name = "age")
    private int age;

    @Column(name = "price")
    private int price;

    public CarEntity(int id, String name, String brand, int speed, int age, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.age = age;
        this.price = price;
    }

    public CarEntity(String name, String brand, int speed, int age, int price) {
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.age = age;
        this.price = price;
    }

    public CarEntity() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id &&
                speed == carEntity.speed &&
                age == carEntity.age &&
                Objects.equals(name, carEntity.name) &&
                Objects.equals(brand, carEntity.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, speed, age, price);
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
