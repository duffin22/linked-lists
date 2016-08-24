/**
 * Created by matthewtduffin on 24/08/2016.
 */
public class LinkedList {

  private Node head;
  private int size = 0;

  public int getSize() {
    return size;
  }

  public void print() {
    if (head == null) {
      System.out.println("Empty list");
    } else {
      Node iterate = head;
      System.out.println(head.getData());
      while (iterate.getNext() != null) {
        iterate = iterate.getNext();
        System.out.println(iterate.getData());
      }
      System.out.println("*****");
    }
  }

  public void add(Object obj) {
    if (head == null) {
      head = new Node(obj);
    } else {
      Node iterate = head;
      while (iterate.getNext() != null) {
        iterate = iterate.getNext();
      }
      iterate.setNext(new Node(obj));
    }
    size++;
  }

  public boolean remove(int index) {
    return remove(index, head, 0);
  }

  public boolean remove(int index, Node node, int count) {
    Node nextNode = node.getNext();
    if (node == null) {
      return false;
    }

    if (index == count) {
      return false;
    }

    if (index == count + 1 && nextNode != null) {
      if (nextNode.getNext() != null) {
        node.setNext(nextNode.getNext());
      } else {
        node.setNext(null);
      }
      size--;
      return true;
    }

    return true && remove(index,nextNode,count+1);

  }

  public Object get(int index) {

    if (index >= 0 && index < getSize()) {
      Node current = head;
      while (index > 0) {
        current = current.getNext();
        index--;
      }
      return current.getData();
    } else {
      return null;
    }
  }

}