import java.util.Hashtable;
public class ExampleHashtable {
    public static void main(String[] args) {
        Hashtable<String,Object> ht=new Hashtable<String,Object>();
        ht.put("Name","roja");
        ht.put("Age",22);
        ht.put("Email","roja@gmail.com");

        System.out.println(ht);
    }
}
