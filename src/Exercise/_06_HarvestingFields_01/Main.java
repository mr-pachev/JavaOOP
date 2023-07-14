package src.Exercise._06_HarvestingFields_01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Class<RichSoilLand> clazz = RichSoilLand.class;

		Field[] declaredFields = clazz.getDeclaredFields();
		Consumer<Field> currentField = field -> System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());

		String input = scanner.nextLine();

		while(!"HARVEST".equals(input)){

			switch (input){
				case "private":
					Arrays.stream(declaredFields)
							.filter(f -> Modifier.isPrivate(f.getModifiers()))
							.forEach(currentField);
					break;
				case "protected":
					Arrays.stream(declaredFields)
							.filter(f -> Modifier.isProtected(f.getModifiers()))
							.forEach(currentField);
					break;
				case "public":
					Arrays.stream(declaredFields)
							.filter(f -> Modifier.isPublic(f.getModifiers()))
							.forEach(currentField);
					break;
				case "all":
					Arrays.stream(declaredFields)
							.forEach(currentField);
					break;
			}


			input = scanner.nextLine();
		}

	}
}
