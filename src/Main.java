
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        System.out.println("Размер массива до удаления: " + arr.size());
        arr.remove(2);
        System.out.println(arr);
        System.out.println("Размер массива после удаления: " + arr.size());

        MyArrayList<String> str = new MyArrayList<>();
        str.add("п");
        str.add("р");
        str.add("и");
        str.add("в");
        str.add("е");
        str.add("т");
        System.out.println(str);
        System.out.println("Размер массива: " + str.size());
        System.out.println("FindFirst (index): " + str.findFirst("т"));
        System.out.println("GetFirst: " + str.getFirst());
        System.out.println("Get: " + str.get(0));
        System.out.println("isEmpty: " + str.isEmpty());
        str.remove(3);
        System.out.println(str);



    }
}