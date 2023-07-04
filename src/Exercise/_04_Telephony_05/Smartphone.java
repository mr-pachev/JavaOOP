package src.Exercise._04_Telephony_05;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();
        for (String url : urls) {
            if (!isNotContainDigit(url)) {
                builder.append("Invalid URL!").append(System.lineSeparator());
            } else {
                builder.append(String.format("Browsing: %s!", url)).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            if (!isContainDigit(number)) {
                builder.append("Invalid number!").append(System.lineSeparator()) ;
            } else {
                builder.append(String.format("Calling... %s", number)).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    public static boolean isContainDigit(String string) {
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (!Character.isDigit(string.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotContainDigit(String string) {
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (Character.isDigit(string.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }
}
