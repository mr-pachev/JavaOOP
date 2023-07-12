package Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflectionClass = Reflection.class;

        System.out.println(reflectionClass);
        System.out.println(Reflection.class.getSuperclass());

        Class<?>[] interfaces = reflectionClass.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }


        Reflection reflection = (Reflection) Class.forName(Reflection.class.getName()).getConstructor().newInstance();

        System.out.println(reflection);
    }
}
