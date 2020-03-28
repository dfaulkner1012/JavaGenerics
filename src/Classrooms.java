import java.util.ArrayList;

public class Classrooms<T extends Student> {
    private String name;
    private int classroomSize = 0;
    private ArrayList<T> students = new ArrayList<>();

    public Classrooms(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addStudent(T Student) {
        if (students.contains(Student)) {
            return false;
        }

        students.add(Student);
        return true;
    }

    public int numStudents() {
        return this.students.size();
    }
}
