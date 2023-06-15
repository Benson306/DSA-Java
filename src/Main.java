public class Main {
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