package streamAPI;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();

        System.out.println("Total Salary: " + es.sumOfSalary());

        System.out.println("\nEmployee Count By Department:");
        System.out.println(es.getCount());

        System.out.println("\nMost Senior Employee:");
        es.mostSenior();

        System.out.println("\nEmployee Service Duration:");
        es.printEmployeeServiceDuration();

        System.out.println("\nEmployees Without Department:");
        es.getEmployeeWithoutDepartment()
                .forEach(e -> System.out.println(e));

        System.out.println("\nDepartments Without Employees:");
        es.getDepartmentWithoutEmployees()
                .forEach(d -> System.out.println(d));

        System.out.println("\nDepartments With Highest Employee Count:");
        es.getDepartmentsWithHighestEmployeeCount()
                .forEach(d -> System.out.println(d));
    }
}