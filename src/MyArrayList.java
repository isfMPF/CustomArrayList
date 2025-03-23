public class MyArrayList <T> {

    private static final int DEFAULT_CAPACITY  = 10;
    private int size;
    private Object[] array;

    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }


    public MyArrayList(int capacity){
        if(capacity > 0 ){
            this.array = new Object[capacity];
            this.size = 0;
        }
    }


    public void add(T value){
        if(size == array.length - 1){
            grow(size);
        }
        array[size] = value;
        size++;
    }

    private void grow(int val) {
        int newCapacity = (int) (val * 1.5);
        Object[] arrayNew = new Object[newCapacity];
        System.arraycopy(array,0, arrayNew, 0, size);
        array = arrayNew;
    }



    public Object findFirst(T value){
        for (int i = 0; i < size; i++) {
            if(value.equals(array[i]))
                return i;
        }
        return -1;
    }

    public boolean remove(int index){
        if(index > size){
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

    public boolean isEmpty(){
        return size == 0;
    }

    public T getFirst(){
        if(size == 0){
            return null;
        }else {
            return (T) array[0];
        }
    }

    @Override
    public String toString() {

        if (array == null)
            return "null";

        if (size == -1)
            return "[]";

        StringBuilder arr = new StringBuilder();
        arr.append("[");
        for (int i = 0; i < size; i++) {
            arr.append(array[i]);
            if(i < size - 1)
                arr.append(", ");
        }
        arr.append("]");
        return arr.toString();
    }


}
