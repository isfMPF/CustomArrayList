public class MyArrayList <T> {

    private final int capacity = 10;
    private int size = 0;
    private Object[] array = new Object[capacity];


    public void add(T value){
        if(size == array.length - 1){
            grow();
        }
        array[size] = value;
        size++;

    }

    private void grow() {
        Object[] arrayNew = new Object[size * 2];
        System.arraycopy(array,0, arrayNew, 0, size);
        array = arrayNew;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private int find(T value){
        for (int i = 0; i < size; i++) {
            if(array[i] == value)
                return i;
        }
        return size;
    }

    public boolean delete(T value){
        int index = find(value);
        if(index == size){
            return false;
        }else {
            for (int i = index; i < size; i++) {
                array[i]= array[i + 1];
            }
            size--;
            return true;
        }
    }

    public int size(){
        return size;
    }

    public Object get(int index){
        for (int i = 0; i < size; i++) {
            if (i == index){
                return array[index];
            }
        }
        return -1;
    }

}