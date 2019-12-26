package CP5;

import java.util.HashMap;
import java.util.Map;

//HashMap类的基础方法使用练习1
public class test5_9 {
    public static void main(String[] args){
        Map<String,Employee> staff = new HashMap<String, Employee>();
        staff.put("111",new Employee("Tom"));
        staff.put("222",new Employee("Jerry"));

        System.out.println("Beginning:" + staff + "\n");
        staff.remove("222");
        System.out.println("After deleting Jerry: " + staff + "\n");

        staff.put("222",new Employee("Beth"));
        System.out.println("Replace Jerry To Beth : " + staff + "\n");

        System.out.println("print \"222\" value :" + staff.get("222") + "\n");

        //分别取出映射表中key-value信息
        for(Map.Entry<String,Employee> entry : staff.entrySet()){
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("key = "+ key + " ,value = "+ value);
        }
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name){
        this.name = name;
        salary = 0;
    }
    @Override public String toString(){
        return "[name = " + name + " salary = " + salary + "}";
    }
}
