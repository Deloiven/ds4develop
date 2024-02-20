package main;

/**
 * ds 4
 */
public class App {
    public static void main(String[] args) {

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1 = new Employee("Alex", 34325, "82383248", 12);
        Employee employee2 = new Employee("Ivan", 46365, "74363434", 7);
        Employee employee3 = new Employee("Ilya", 53243, "64336435", 12);

        employeeDirectory.add(employee1);
        employeeDirectory.add(employee2);
        employeeDirectory.add(employee3);

        System.out.println(employeeDirectory.findEmployeeByExperience(12));
        System.out.println(employeeDirectory.getPhoneEmployee("Ilya"));
        System.out.println(employeeDirectory.findServiceNumber(53243));
    }
}