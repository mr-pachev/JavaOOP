package src.Lab._03_RandomArrayList_03;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();     //създаваме си обект, който представлява List

        randomArrayList.add(8);
        randomArrayList.add(65);
        randomArrayList.add(71);

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());

    }
}
