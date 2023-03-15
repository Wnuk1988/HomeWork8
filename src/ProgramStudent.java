
public class ProgramStudent {

    public static void main(String[] args) {

        StudentActions student = new StudentActions();

        student.students.add(new Student("Mikhail",7,1,8));
        student.students.add(new Student("Natalia",5,2,9));
        student.students.add(new Student("Oleg",3,3,6));
        student.students.add(new Student("Sofia",3,3,10));
        student.students.add(new Student("Sergey",8,2,3));
        student.students.add(new Student("Svetlana",1,1,7));
        student.students.add(new Student("Alexei",2,4,2));
        student.students.add(new Student("Nadia",3,4,5));
        student.students.add(new Student("Amir",4,2,2));
        student.students.add(new Student("Dmitriy",7,4,3));

        student.displayInfo();
        student.removalStudents();
        student.transferToTheNextCourse();
        student.displayInfo();
        student.nameStudent();
    }
}
