import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListIterator {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("1");
        arrl.add("5");
        arrl.add("9");
        arrl.add("100");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}