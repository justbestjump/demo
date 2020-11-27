package jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user")
public class User1 implements Serializable {
    @Id//主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)//指明所用数据库：mysql
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    public User1() {
    }

    public User1(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
