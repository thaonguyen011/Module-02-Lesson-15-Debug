import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "An", 18));
        list.add(new Employee(2, "Cuong", 17));
        list.add(new Employee(1, "Dao", 20));
        list.add(new Employee(1, "Anh", 20));
        list.add(new Employee(1, "Anh", 18));

        System.out.println("List before sorting");
        System.out.println(list);
        System.out.println();

        System.out.println("List after sorting");
        list.sort(new SortByRoll());
        System.out.println(list);

        list.sort(Comparator.comparing(Employee::getAge).reversed());
        System.out.println(list);


    }
}