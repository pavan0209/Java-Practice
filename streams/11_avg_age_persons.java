import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {

    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}

class Solution {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));

        double avg = persons.stream()
                .collect(Collectors.summingInt(person -> person.getAge()));

        System.out.println(avg / persons.size());

        persons.stream()
                .mapToInt(person -> person.getAge()).average()
                .ifPresent(val -> System.out.println(val));
    }
}