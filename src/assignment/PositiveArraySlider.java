package assignment;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PositiveArraySlider {
    public static void main(String[] args) {
        int[] positiveArray = {4,1,6,12,67,25,8,2,0,6,43};
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
        for (int firstIndex = 0; firstIndex <= positiveArray.length + k; firstIndex++){

            for (int index = 0; index <= firstIndex + k; index++){

            }
        }
    }
}
