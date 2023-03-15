
public class Student {
    private String name;
    private int group;
    private int trainingCourse;
    private int subjectGrades;

    public Student(String name, int group, int trainingCourse, int subjectGrades) {
        this.name = name;
        this.group = group;
        this.trainingCourse = trainingCourse;
        this.subjectGrades = subjectGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getTrainingCourse() {
        return trainingCourse;
    }

    public void setTrainingCourse(int trainingCourse) {
        this.trainingCourse = trainingCourse;
    }

    public int getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(int subjectGrades) {
        this.subjectGrades = subjectGrades;
    }
}
