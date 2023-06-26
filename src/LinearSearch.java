public class LinearSearch {
    public static void main(String[] args) {

        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 1);

        if(index != -1){
            System.out.println("Element Found at index: " + index);
        }else{
            System.out.println("Element Not Found.");
        }
    }

    public static int linearSearch(int[] array,int item){
        for(int i = 0;i < array.length; i++){
            if( array[i] == item){
                return i;
            }
        }
        return  -1;
    }

}
