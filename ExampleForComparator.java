import java.util.*;
import java.util.Comparator;
class NameComparator implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        return o1.getName().compareTo(o2.getName());

    }
}
class rollNoComparator implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        return o1.getrollNo().compareTo(o2.getrollNo());
    }
}
class Student{
    private String name;
    private String rollno;
    public String getName(){
        return name;
    }
    public String getrollNo(){
        return rollno;
    }
    Student (String name, String rollno){
        super();
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
        return "student name"+name+"student rollno"+rollno;

    }
}


public class ExampleForComparator {
    public static void main(String[] args){
        Student s1=new Student("roja","AK33");
        Student s2=new Student("jashu","AK31");
        Student s3=new Student("teju","AK32");
         Vector<Student> v=new Vector<Student>();
         v.add(s1);
         v.add(s2);
         v.add(s3);
         Collections.sort(v,new rollNoComparator());
         for(Object i:v){
            System.out.println(i);
         }
    }
    
}
