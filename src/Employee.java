import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private Integer age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        if (!Objects.equals(o.name, this.name)) {
            return this.name.compareTo(o.name);
        }
        return this.age.compareTo(o.age);

    }

    public String toString() {
        return "{id: " + id + ", name: " + name + ", age: " + age +"}";
    }
}
