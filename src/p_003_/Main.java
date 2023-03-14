package p_003_;

public class Main {


    public static void main(String[] args) {
        LinkedListPrac<Employee> linkedList = new LinkedListPrac<>();
        linkedList.addFirst(new Employee("1", 1));
        linkedList.addFirst(new Employee("2", 2));
        linkedList.addFirst(new Employee("3", 3));
        linkedList.addFirst(new Employee("4", 4));
        linkedList.addFirst(new Employee("5", 5));
        linkedList.addFirst(new Employee("6", 6));
        linkedList.addFirst(new Employee("7", 7));
//        linkedList.directSort(new EmployeeNameComparator(SortType.Ascending));
//        printList(linkedList);
        linkedList.reverse();
        printList(linkedList);

    }

    public static void printList(LinkedListPrac<Employee> list) {
        LinkedListPrac<Employee>.Node node = list.head;
        while (node != null) {
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }

    }

}

class Employee {
    private String name;
    private int age;

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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}