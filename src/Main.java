
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.clear();
      // myArrayList.remove(4);
       // myArrayList.remove(1);

        for (int i = 0; i < myArrayList.getSize() ; i++) {
            System.out.println(myArrayList.get(i));
        }






    }
}
