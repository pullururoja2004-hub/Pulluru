import java.util.*;
public class ExampleCollection {
    public static void main(String[] args){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("List:"+l);
        for(Object i:l){
            System.out.println(i);
    }
    System.out.println(l.size());
    System.out.println(l.contains(40));
    System.out.println(l.get(1));
    System.out.println(l.getLast());
    System.out.println("------------------");
     ArrayList<Integer>al=new ArrayList<>();
        al.add(25);
        al.add(35);
        al.add(45);
        System.out.println("List:"+al);
        
    }
    
}

