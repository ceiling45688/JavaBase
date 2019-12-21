package CP4;

public class test4_2 {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.name = "lily";
        employee.salary = 2000;
        System.out.println(employee.toString());

        Manager manager = new Manager();
        manager.name = "max";
        manager.salary = 4000;
        manager.bonus = 2000;
        System.out.println(manager.toString());
    }
}

class Employee {
    String name;
    int salary;

    @Override public String toString(){
        return "Employee's name = " + name + ",salary = " + salary;
    }
}
class Manager extends Employee {
    int bonus;

    @Override public String toString(){
        return "Manager's name = " + name + ",salary = " + salary + ",bonus = " + bonus;
    }
}
