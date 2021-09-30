package sample_package.builder_pattern;

public class Employee {
    String id;
    String name;
    String address;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.address = employeeBuilder.address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class EmployeeBuilder {
        String id;
        String name;
        String address;

        public EmployeeBuilder(String id) {
            this.id = id;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        Employee build() {
            return new Employee(this);
        }

    }
}
