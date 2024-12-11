package collection.payment;

import java.util.Objects;

public class Employee {
    int id; // 직원 Id
    String name;  // 직원 이름
    String position; // 직급
    int baseSalary; // 기본 급여
    String accountNumber; // 계좌 번호

    public Employee(int id, String name, String position, int baseSalary, String accountNumber) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id; // ID만 비교하여 동일 여부 판단
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // ID 기반으로 해시코드 생성
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", baseSalary=" + baseSalary +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
