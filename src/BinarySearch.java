import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[100000];
        int target = 42678;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int index = builtInMethod(array, target);
        int index = ourOwnImplementation(array, target);

        if(index == -1){
            System.out.println(target +" Not Found");
        }else{
            System.out.println(target + " is found at index " + index);
        }
    }

    public static int builtInMethod(int[] array, int target){

        int index = Arrays.binarySearch(array, target);

        return index;
    }

    public static int ourOwnImplementation(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = low + ( high - low) / 2 ;

            int value = array[middle];

            System.out.println("middle: " + value);

            if(value < target){
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            }else{
                return middle; //target is found
            }
        }

        return -1; // target Not Found
    }
}
