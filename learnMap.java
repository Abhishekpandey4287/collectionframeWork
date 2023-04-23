import java.util.HashMap;
import java.util.Map;

public class learnMap {
    public static void main(String[] args){
        Map<String , Integer> student = new HashMap<>();
        student.put("abhishek" , 30);
        student.put("prem" , 10);
        student.put("priya " , 15);
        System.out.println(student);
        student.put("abhishek" , 23);
        System.out.println(student);
       student.putIfAbsent("abhishek" , 50);

        System.out.println(student);

        /*for ( Map.Entry< String , Integer> e : student.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }*/

        student.remove("prem");
        System.out.println(student);
        student.clear();
        System.out.println(student);
    }
}
