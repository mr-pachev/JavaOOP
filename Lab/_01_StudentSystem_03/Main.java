package Lab._01_StudentSystem_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if ("Exit".equals(input[0])) {
                break;
            }
            if ("Create".equals(input[0])){
                studentSystem.create(input);
            }else if ("Show".equals(input[0])){
                studentSystem.show(input);
            }
        }
    }
}
