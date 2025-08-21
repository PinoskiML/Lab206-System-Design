import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Howdy?! \nThis is Lab 206!\n");

        Map<String, Student> studentList = new HashMap<>();
        studentList.put("John", new Student("John", 111));
        studentList.put("Sarah", new Student("Sarah", 90));
        studentList.put("Mike", new Student("Mike", 70));
        studentList.put("Jimmy", new Student("Jimmy", -20));

        System.out.println("showList(studentList)");
        showList(studentList);

        System.out.println("\nincreaseGrades(studentList);    + 10%");
        increaseGrades(studentList);
    }

    private static void showList(Map<String, Student> studentList) {
                for (String key : studentList.keySet()){
            Student student = studentList.get(key);
            System.out.println(student);
        }
    }

    private static void increaseGrades(Map<String, Student> studentList) {
                for (String key : studentList.keySet()) {
            Student student = studentList.get(key);

            // Get current grade
            int currentGrade = student.getGrade();

            // Increase by 10%
            double increaseRate = 1.10;
            double updatedGrade = increaseRate * currentGrade;

            // Update the student's grade
            student.setGrade((int) updatedGrade);

            System.out.println(student);
        }
    }
}