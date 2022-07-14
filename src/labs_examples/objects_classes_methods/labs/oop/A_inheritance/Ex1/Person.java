package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex1;

import java.util.Date;

public class Person extends Mood{
    protected String name;
    protected int age;

    public Person(String moodType, int level, Date date, String name, int age) {
        super(moodType, level, date);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", moodType='" + moodType + '\'' +
                ", level='" + level + '\'' +
                ", date=" + date +
                '}';
    }
}
