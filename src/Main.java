public class Main {
    public static void main(String[] args) {

        System.out.println("Hello course work!");
        // Создаем массив объектов Employee из 10 элементов
        Employee[] employees = new Employee[10];

        // Заполняем массив различными экземплярами Employee
        employees[0] = new Employee("Дорофеев Денис Анатольевич", 85000, 1, 101);
        employees[1] = new Employee("Турдиева Надирахон Косимовна", 60000, 1, 102);
        employees[2] = new Employee("Зубова Юлия Александровна", 55000, 2, 103);
        employees[3] = new Employee("Зверев Андрей Андреевич", 52000, 2, 104);
        employees[4] = new Employee("Джон Смит", 58000, 3, 105);
        employees[5] = new Employee("Аманда Уилсон", 53000, 3, 106);
        employees[6] = new Employee("Ильясов Азамат", 54000, 4, 107);
        employees[7] = new Employee("Мамбетжумаев Женис", 59000, 4, 108);
        employees[8] = new Employee("Элькина Юлия Эдуардовна", 62000, 5, 109);
        employees[9] = new Employee("Тен Айя Александровна", 60000, 5, 110);

        // Пример вывода информации о сотрудниках
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getFullName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("ID: " + employee.getId());
            System.out.println("-------------------");
        }
        //ИЗ УСЛОВИЯ Я НЕ ОЧЕНЬ ПОНЯЛ НЕОБХОДИМО И ДОСТАТОЧНО ЧЕРЕЗ toString|| или+стандартный формат вывода
        for (Employee employee : employees) {
            System.out.println(employee);  // Вызов метода toString
        }
        //ВЫВОДИМ ОБЩУЮ З/П
        int totalSalary = Employee.calculateTotalSalary(employees);
        System.out.println("Общая зарплата всех сотрудников будет: " + totalSalary+" рублей.");
        System.out.println("============");

        //ВЫВОДИМ СОТРУДНИКА С МАКСИМАЛЬНОЙ З/П
        int maxSalary=Employee.calculateMaxSalary(employees);
        System.out.println("Максимальная зарплата сотрудника в списке будет : " + maxSalary+" рублей.");
        System.out.println("============");
        //ВЫВОДИМ СОТРУДНИКА С МИНИМАЛЬНОЙ З/П
        int minSalary=Employee.calculateMinSalary(employees);
        System.out.println("Минимальная зарплата сотрудника в списке будет : " + minSalary+" рублей.");
        System.out.println("============");
        //ВЫВОДИМ СРЕДНЮЮ З/П ПО ОТДЕЛАМ
        double averageSalary = Employee.calculateAverageSalary(employees);
        System.out.println("Средняя зарплата сотрудников: " + averageSalary);
        System.out.println("=======GAME=====OVER=====");



    }
}