package src.Exercise._06_BarracksWarsANewFactory_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        while (!"END".equals(input)) {
            String currentMethod = input.split("_")[0];
            int parameter = Integer.parseInt(input.split("_")[1]);

            Method declaredMethod = clazz.getDeclaredMethod(currentMethod, int.class);
            declaredMethod.setAccessible(true);

            declaredMethod.invoke(blackBoxInt, parameter);

            Field declaredField = clazz.getDeclaredField("innerValue");
            declaredField.setAccessible(true);
            System.out.println(declaredField.get(blackBoxInt));

            input = scanner.nextLine();
        }

    }
}
