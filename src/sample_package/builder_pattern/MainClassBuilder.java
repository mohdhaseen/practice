package sample_package.builder_pattern;

public class MainClassBuilder {
    public static void main(String args[]) {
        Employee employee = new Employee.EmployeeBuilder("111").setName("haseen").build();
        System.out.println(employee.name);
    }
}
