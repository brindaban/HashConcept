import java.util.HashMap;
import java.util.Map;

/**
 * Created by brindaba on 2/29/16.
 */
public class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
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
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee)obj;
            return (emp.name == name && emp.age == age);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.length() + age;
    }

    public static void main(String[] args) {
        Employee e = new Employee("muhammad", 24);
        Map<Object, Object> m = new HashMap<Object, Object>();
        m.put(e, "Muhammad Ali Khojaye");
        // getting output
        System.out.println(m.get(e));
        e.name = "abid";
        // it fails to get
        System.out.println(m.get(e));
        e.name = "amirrana";
        // it fails again
//        System.out.println(m.get(new Employee("muhammad", 24)));
    }
}