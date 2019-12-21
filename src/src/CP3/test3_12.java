package CP3;
//访问权限
public class test3_12 {
    public static void main(String[] args){
        Student stu1 = new Student("lily",500);
        Student stu2 = new Student("max",98);
        System.out.println("Student's name = "+ stu2.getName()+",Student'score  = "+ stu2.getScore());
    }
}
class Student {
    private String name;
    private int score;

    Student(String name, int score){
        this.name = name;
        if (score>100 || score < 0){
            System.out.println("error score!");
        }else {
            this.score = score;
        }
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}
