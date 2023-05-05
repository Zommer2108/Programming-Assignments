package IntList;

public class DoublyLinkedIntListApp {
    public static void main(String[] args) {

        // Build list with five elements.
        DoublyLinkedIntList list = new DoublyLinkedIntList();
        for (int i = 1; i <= 5; i++) {
            list.addLast(i);
        }

        // Print it.
        System.out.println("list: " + list);
        System.out.println("is list empty? " + (list.isEmpty() ? "yes" : "no"));
        System.out.println("list size: " + list.size());
        System.out.println("contains 4? " + (list.contains(4) ? "yes" : "no"));

        // Print the numbers in the list and their squares.
        System.out.println("squares:");
        DoublyLinkedIntList.Iterator it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.println(String.format("%4d %4d", x, x*x));
        }

    }}
       
