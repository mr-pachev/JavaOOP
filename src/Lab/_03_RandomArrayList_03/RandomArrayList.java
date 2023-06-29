package src.Lab._03_RandomArrayList_03;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private final static Random random = new Random();  //обект Random, който да не може да се променя

    public Object getRandomElement(){                   //връща случаен обект List(super-показда от родителския клас)->тип данни от наследения клас ArrayList
       int index = random.nextInt(super.size());
       Object element = super.get(index);
       super.remove(index);

       return element;
   }
}
