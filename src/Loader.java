import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewtduffin on 24/08/2016.
 */
public class Loader {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.add(12);
    linkedList.add(13);
    linkedList.add(14);
    linkedList.add(15);
    linkedList.print();

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(12);
    arrayList.add(13);
    arrayList.add(14);
    arrayList.add(15);


    linkedList.add(20);
    arrayList.add(20);
    linkedList.print();


    linkedList.remove(3);
    arrayList.remove(3);
    linkedList.print();

    System.out.println("\n"+linkedList.get(0));
    System.out.println("\n"+linkedList.get(1));
    System.out.println("\n"+linkedList.get(2));
    System.out.println("\n"+linkedList.get(3));
    System.out.println("\n"+linkedList.get(4));
    System.out.println("\n"+linkedList.get(-1));

  }

}
