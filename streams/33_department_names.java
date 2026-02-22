import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {

        List<Employee1> empList = Employee1.getEmployeesList();

        List<String> res = empList.stream()
                .map(emp -> emp.getDepartment())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(res);
    }
}