package cn.ascending.collection.List;

import java.io.Serializable;
import java.util.Objects;

//Comparable接口是一个泛型接口。Java类库中：Byte，Short，Integer，Long，Float，Double，Character，BigTnteger，BigDecimal，Calendar，String及Data类都实现了Comparable接口。
// 可以直接调用，对于没有实现的类，可以通过接口implements实现。
public class Person implements Comparable<Person>, Serializable {//This class implements Serializable interface which means it can be serialized.
    private String name;
    private int age;
    public String a;

    @Override
    public int compareTo(Person person) {
        if(person instanceof Person){// Object o=new Goods()  o instanceof Goods
            Person p1=(Person)person;//down casting
/*            if(this.price>goods.price){
                return -1;//降序
            }
            return 1;//升序*/
            return this.age-p1.age;//升序
        }
        throw new RuntimeException("diff data type/");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void eat(String name){
        System.out.println(name+" is eat...");
    }

    public void eat(){
        System.out.println("eat...");
    }


}
