package course.Daniel.Java;

import java.util.Random;

/**
 * Created by Jakars on 07/02/2017.
 */
public class RandomUtils {
    static int nextRandom (int min, int max){

        Random randGen = new Random();
        int diff = max-min;
        int rand1 = randGen.nextInt(diff+1)+min;
        return rand1;
    }
    static int nextRandom (int n){
        Random randGen = new Random();
        int rand = randGen.nextInt();
        rand = rand%n;
        return rand;

    }
    static int[] nextRandomArray (int min, int max, int size){
        int [] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = nextRandom(min,max);
        }
        return result;
    }
}
