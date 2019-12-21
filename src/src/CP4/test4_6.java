package CP4;

public class test4_6 {
    public static void main(String[] args){
        Employee2 employee2 = new Employee2("lily", 2000);

        System.out.println(employee2.toString());

        Manager2 manager2 = new Manager2("max", 4000, 2000);
        System.out.println(manager2.toString());
    }
}
class Employee2{

    private String name;
    private double salary;


    Employee2(String name, double  salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary(){
        return salary;
    }

    @Override public String toString(){
        return "Employee's name = " + getName() + ",salary = " + getSalary();
    }
}
class Manager2 extends Employee2 {
    private double bonus;


    Manager2(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override public String toString(){
        return "Manager's name = " + super.getName() + ",salary = " + super.getSalary() + ",bonus = " + getBonus();
    }
}