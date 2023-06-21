import java.util.ArrayList;

public class DynamicArrays {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrays() {
        this.array = new Object[capacity];
    }

    public DynamicArrays(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size <= 0){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index;i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < (size- i -1); j++){
                    array[i + j] = array[i+j+i];
                }
                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }

    }
    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                return  i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity = (int)(capacity * 2);

        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        int newCapacity = (int)(capacity / 2);

        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return  size == 0;
    }
    public String toString(){
        String string = "";
        for(int i =0; i < capacity ;i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() -2) + "]"; // remove , at the end of array
        }else{
            string = "[]";
        }
        return string;
    }

    public static void main(String[] args) {
        DynamicArrays dynamicArrays = new DynamicArrays(5);

        dynamicArrays.add("A");
        dynamicArrays.add("B");
        dynamicArrays.add("C");
        dynamicArrays.add("D");
        dynamicArrays.add("E");
        dynamicArrays.add("F");

        dynamicArrays.delete("A");
        dynamicArrays.delete("B");
        dynamicArrays.delete("C");

//        dynamicArrays.insert(0, "E");
//        dynamicArrays.delete("A");
//
//        System.out.println("Search result: " +dynamicArrays.search("C"));

        System.out.println("Array: " + dynamicArrays);
        System.out.println("Size: " + dynamicArrays.size);
        System.out.println("Capacity: " + dynamicArrays.capacity);
        System.out.println("Empty: " + dynamicArrays.isEmpty());
    }
}
