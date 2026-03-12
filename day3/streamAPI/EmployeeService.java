package streamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public double sumOfSalary() {
        return EmployeeRepository.getEmployees()
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    public Map<String, Long> getCount() {
        return EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() != null)
                .map(e -> e.getDepartment().getDepartmentName())
                .collect(Collectors.groupingBy(d -> d, Collectors.counting()));
    }

    public void mostSenior() {
        EmployeeRepository.getEmployees().stream()
                .min(Comparator.comparing(Employee::getHireDate))
                .ifPresent(e -> System.out.println("Most Senior Employee: " +
                        e.getFirstName() + " " + e.getLastName()));
    }

    public void printEmployeeServiceDuration() {

        LocalDate today = LocalDate.now();

        EmployeeRepository.getEmployees().forEach(emp -> {

            Period duration = Period.between(emp.getHireDate(), today);

            int months = duration.getYears() * 12 + duration.getMonths();
            int days = duration.getDays();

            System.out.println(emp.getFirstName() + " " + emp.getLastName()
                    + " - " + months + " months " + days + " days");
        });
    }

    public List<Employee> getEmployeeWithoutDepartment() {

        return EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() == null)
                .collect(Collectors.toList());
    }

    public List<Department> getDepartmentWithoutEmployees() {

        Set<Integer> activeDeptIds = EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() != null)
                .map(e -> e.getDepartment().getDepartmentId())
                .collect(Collectors.toSet());

        return EmployeeRepository.getDepartments().stream()
                .filter(d -> !activeDeptIds.contains(d.getDepartmentId()))
                .collect(Collectors.toList());
    }

    public List<String> getDepartmentsWithHighestEmployeeCount() {

        Map<String, Long> deptCounts = getCount();

        long max = deptCounts.values()
                .stream()
                .max(Long::compare)
                .orElse(0L);

        return deptCounts.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(max))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}