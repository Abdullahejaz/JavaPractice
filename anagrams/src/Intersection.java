import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public static List<String> intersection(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<String>();

        for (String t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    public static void main(String... args) throws Exception {
        String[] l1 = {"A", "B", "C"};
        String[] l2 = {"A", "B", "C", "D", "E", "F"};

        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();

        a1.addAll(Arrays.asList(l1));
        a2.addAll(Arrays.asList(l2));
        /*List<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F"));
*/
        Intersection obj = new Intersection();
        System.out.println(obj.intersection(a1, a2));



    }

}
