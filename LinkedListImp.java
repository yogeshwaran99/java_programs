import java.util.LinkedList;

class LinkedListImp{
  public static void main (String[] a){
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);
    list.addFirst(0);
    list.addLast(4);
    System.out.println(list);
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    System.out.println(list.contains(6));
    System.out.println(list.isEmpty());
    list.clear();
    System.out.println(list);
  }
}
