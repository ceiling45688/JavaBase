package CP4;

public class test4_15 {
    public static void main(String[] args){
        Beverage beverage = new Tea();
        beverage.prepareRecipe();
    }
}
abstract class Beverage {
    public abstract void brew();
    public abstract String type();
    public void boilWater(){
        System.out.println("boiling water!");
    }
    public void pourInCup(){
        System.out.println("pour into cup!");
    }
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        System.out.println(type() + " is ready to drink!");
    }
}
class Tea extends Beverage {
    @Override public void brew(){
        System.out.println("put tea leaves into water!");
    }
    @Override public String type(){
        return "Tea";
    }
}
