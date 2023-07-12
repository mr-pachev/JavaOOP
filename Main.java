import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflectionClass = Reflection.class;

//        Task 1.
//
//        System.out.println(reflectionClass);
//        System.out.println(Reflection.class.getSuperclass());
//
//        Class<?>[] interfaces = reflectionClass.getInterfaces();
//
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface);
//        }
//
//        Reflection reflection = (Reflection) Class.forName(Reflection.class.getName()).getConstructor().newInstance();
//        System.out.println(reflection);


//        Task 2.
//
        Method[] declaredMethods = reflectionClass.getDeclaredMethods();
//
//        Arrays.stream(declaredMethods)
//                .filter(Main::isGetter)
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(m -> System.out.printf("%s will return class %s%n",
//                        m.getName(),
//                        m.getReturnType().getName()));
//
//        Arrays.stream(declaredMethods)
//                .filter(Main::isSetter)
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(m -> System.out.printf("%s and will set field of class %s%n",
//                        m.getName(),
//                        m.getParameterTypes()[0].getName()));

//        Task 3.

        Field[] declaredFields = reflectionClass.getDeclaredFields();

        Arrays.stream(declaredFields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.printf("%s must be private!%n", f.getName()));

        Arrays.stream(declaredMethods)
                .filter(Main::isGetter)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be public!%n", m.getName()));

        Arrays.stream(declaredMethods)
                .filter(Main::isSetter)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be private!%n", m.getName()));


    }
    public static boolean isGetter (Method method){
        if (!method.getName().startsWith("get")){
            return false;
        }

        if (method.getReturnType().equals(void.class)){
            return false;
        }

        if (method.getParameterCount() > 0){
            return false;
        }
        return true;
    }

    public static boolean isSetter (Method method){

        if (!method.getName().startsWith("set")){
            return false;
        }

        if (!method.getReturnType().equals(void.class)){
            return false;
        }

        if (method.getParameterCount() != 1){
            return false;
        }
        return true;
    }
}
