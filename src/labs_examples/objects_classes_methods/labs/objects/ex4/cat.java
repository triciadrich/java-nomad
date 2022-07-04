package labs_examples.objects_classes_methods.labs.objects.ex4;

public class cat {
    String type;
    String name;
    int age;


    public cat(String type) {//constructor with one parameter
        this.type = type;
    }

    public cat() {//empty constructor
    }

    public cat(String type, String name, int age) {//constructor with 3 parameters
        this.type = type;
        this.name = name;
        this.age = age;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
