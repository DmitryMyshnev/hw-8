
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println();
       myArrayList.remove(3);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println();
        myArrayList.clear();
        System.out.println("Size is " + myArrayList.size());
        System.out.println("--------------------------");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.add("4");
        myLinkedList.add("5");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
        myLinkedList.remove(1);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
        myLinkedList.clear();
        System.out.println("Size is " + myLinkedList.size());

    }
}
