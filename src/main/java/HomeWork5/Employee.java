package HomeWork5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int pay;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("Ф.И.О.: " + fullName + " Должность: " + position + " Электронная почта: " + email +
                " Телефон: " + phone + " Зарплата: " + pay + " Возраст: " + age);
    }
}
