package HomeWork5;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович ", "Инженер ", "ivanov@mail.ru",
                23712, 100000, 41);
        employees[1] = new Employee("Петров Пётр Петрович", " Экономист ", "petrov@mail.ru",
                43436, 90000, 44);
        employees[2] = new Employee("Васильев Василий Васильевич", " Юрист ", "vasiliev@mail.ru",
                123213, 120000, 33);
        employees[3] = new Employee("Фомина Елена Петровна", " Бухгалтер ", "fomina@mail.ru",
                994421, 95000, 38);
        employees[4] = new Employee("Габичева Галина Сергеевна", " Директор ", "gabicheva@mail.ru",
                2000000, 1000000, 27);

        //employees[3].employeeInfo();

      /* for (int i = 0; i < employees.length; i++) {
          employees[i].employeeInfo();
       }*/

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                employees[i].employeeInfo();
            }
        }
    }
}
