import java.util.Objects;

public class Employee {
    private static int count;
    private String fullName;
    private int salary;
    private int department;
    private int id = 0;

    public Employee(String fullName, int salary, int department, int id) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    // Статический метод для подсчета суммы всех зарплат
    public static int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static int calculateMaxSalary(Employee[] employees){//ищем Мах
        int maxSalary= Integer.MIN_VALUE;
        for(int i=0;i<employees.length;i++){
            if(employees[i].getSalary()>maxSalary){
                maxSalary=employees[i].getSalary();
            }
        }
        return maxSalary;
    }
    public static int calculateMinSalary(Employee[] employees) {//ищем Мin
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;}

     //считаем среднее значение з/п
     public static double calculateAverageSalary(Employee[] employees) {
         if (employees.length == 0) {
             return 0; // Предотвращение деления на ноль
         }
         int totalSalary = calculateTotalSalary(employees);
         return (double) totalSalary / employees.length;
     }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Проверка на сравнение с самим собой
        if (o == null || getClass() != o.getClass()) return false;  // Проверка на null и тип класса
        Employee employee = (Employee) o;
        return id == employee.id &&  // Сравнение по уникальному идентификатору
                salary == employee.salary &&
                department == employee.department &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    }

