package cn.ymcc;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 10, 22, 28,7,12,18,24,30};
        Random rand = new Random();
        int randomIndex = rand.nextInt(a.length);
        int randomNumber = a[randomIndex];
        int[] randomNums = new int[6];
        randomNums[0] = randomNumber;
        for (int i = 1; i < 6; i++) {
            boolean found = false;
            do {
                randomNums[i] = rand.nextInt(33) + 1;
                found = false;
                for (int j = 0; j < a.length; j++) {
                    if (randomNums[i] == a[j]) {
                        found = true;
                        break;
                    }
                }
            } while (found);
        }
        System.out.println("随机生成的数组:");
        Arrays.sort(randomNums);
        for (int randomNum : randomNums) {
            System.out.println(randomNum);
        }
    }
}

