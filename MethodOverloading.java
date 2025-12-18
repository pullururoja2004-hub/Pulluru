import java.util.*;
class Circle{
    void area(int r){
        double result=Math.PI*r*r;
        System.out.println("Area of the circle:"+result);
    }
    void area(double r){
        double 
        result=Math.PI*r*r;
        System.out.println("Area of the circle:"+result);
    }

}
public class MethodOverloading{
public static void main(String[] args){
Circle c=new Circle();
c.area(5);
c.area(2.5);
}
}