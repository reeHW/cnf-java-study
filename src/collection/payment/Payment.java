package collection.payment;

import java.util.HashSet;
import java.util.Set;

public class Payment {
    private Set<Integer> processedEmployees = new HashSet<>();

    public void processPayment(Employee employee, int finalSalary) {
        if (hasProcessed(employee.id)) {
            System.out.println("이미 급여가 입금되었습니다: " + employee.name);
            return;
        }

        // 급여 전송
        System.out.println("급여 전송: " + employee.name + " - " + finalSalary + "원 입금 (" + employee.accountNumber + ")");


        processedEmployees.add(employee.id);
    }

    public boolean hasProcessed(int employeeId) {
        return processedEmployees.contains(employeeId);
    }
}
