package Lab._01_StudentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void create(String[] args) {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade = Double.parseDouble(args[3]);

        if (!repo.containsKey(name)) {
            var student = new Student(name, age, grade);
            repo.put(name, student);
        }
    }

    public void show(String[] args) {
        var name = args[1];
        if (repo.containsKey(name)) {
            var student = repo.get(name);
            String view = student.toString();

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }

            System.out.println(view);
        }
    }
}
