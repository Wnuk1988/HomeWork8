
import java.util.HashSet;
import java.util.Set;

public class StudentActions {
    public HashSet<Student> students;

    public StudentActions() {
        this.students = new HashSet<>();
    }

    public HashSet<Student> removalStudents() {
        Set<Student> removedStudents = new HashSet<>();
        for (Student student : this.students) {
            if (student.getSubjectGrades() < 3)
                removedStudents.add(student);
        }
        this.students.removeAll(removedStudents);
        return students;
    }

    public HashSet<Student> transferToTheNextCourse() {
        for (Student student : this.students) {
            student.setTrainingCourse(student.getTrainingCourse() + 1);
        }
        return students;
    }

    public void displayInfo() {
        for (Student student : this.students) {
            System.out.printf("Name: %s\t group: %d\t Training course: %d\t Subject grades: %d\n",
                    student.getName(), student.getGroup(), student.getTrainingCourse(), student.getSubjectGrades());
        }
        System.out.println("\n");
    }

    public void nameStudent() {
        for (Student student : this.students) {
            System.out.printf("Name: %s\t", student.getName());
        }
    }

}
