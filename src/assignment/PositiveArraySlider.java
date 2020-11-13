package assignment;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PositiveArraySlider {
    public static void main(String[] args) {
        int[] positiveArray = {4,1,6,12,5,45,9,2,77,3,66,7,34,2};
        System.out.println("positiveArray length: " + positiveArray.length + "\npositiveArray values: " + Arrays.toString(positiveArray));
        int k = 4;
        //#1
        int currentMax = 0;
        for(int firstIndex = 0; firstIndex <= positiveArray.length - k; firstIndex++) {
            int secondIndex = firstIndex + k;
            int[] subArray = Arrays.copyOfRange(positiveArray, firstIndex, secondIndex);
            int sumOfSubarray = IntStream.of(subArray).sum();
            if (sumOfSubarray>currentMax){
                currentMax = sumOfSubarray;
            }
        }
        System.out.println(currentMax);

        //#2
        int sum;
        int currentMax2 = 0;
        int indexFrom = 0;
        int indexTo = 0;
        for (int firstIndex = 0; firstIndex < positiveArray.length - k; firstIndex++){
            int secondIndex = firstIndex + k;
            sum = 0;
            for (int index = firstIndex; index < secondIndex; index++){
                sum = sum + positiveArray[index];
            }
            if (currentMax2<sum){
                currentMax2=sum;
                indexFrom = firstIndex;
                indexTo = secondIndex;
            }
        }
        System.out.println("The biggest sum of " + k + " elements is: " + currentMax2 + "\nFrom index " + indexFrom + " to index " + indexTo);
    }
}
