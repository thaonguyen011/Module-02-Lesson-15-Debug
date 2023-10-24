import java.util.Comparator;
import java.util.Objects;

public class SortByRoll implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (!Objects.equals(o1.getName(), o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}
