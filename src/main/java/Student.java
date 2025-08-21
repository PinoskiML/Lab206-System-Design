import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int grade ;

    Map<Student,String> studentList = new HashMap<>();




    //  Gs


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    //   Ss


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cant be null or empty!");
        } else {
            this.name = name;
        }
    }


    public int setGrade(int grade) {
        if (grade <0){
            this.grade = 0;

        } else if (grade > 100) {
            this.grade = 100;

        } else {
            this.grade = grade;
        }
        return grade;
    }


    // Cs


    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }


    @Override
    public String toString() {
        return "Student " +
                "name: " + name + '\'' +
                ", grade: " + grade

                ;
    }
}
