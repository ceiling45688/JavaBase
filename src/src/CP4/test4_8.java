package CP4;

public class test4_8 {
    public static void main(String[] args){
        Employee3 employee3 = new Employee3("lily", 2000);

        System.out.println(employee3.toString());

        Manager3 manager3 = new Manager3("max", 4000, 2000);
        System.out.println(manager3.toString());
    }
}
class Employee3{

    private String name;
    private double salary;


    Employee3(String name, double  salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public double getTotalIncome(){
        return 12*salary;
    }

    @Override public String toString(){
        return "name = " + getName() + ",salary = " + getSalary()+ ",totalIncome(included bonus) = " + getTotalIncome();
    }
}
class Manager3 extends Employee3 {
    private double bonus;


    Manager3(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getTotalIncome() {
        return super.getTotalIncome() +  bonus;
    }

    @Override public String toString(){
        return super.toString() + ", annual bonus = " + getBonus();
    }
}