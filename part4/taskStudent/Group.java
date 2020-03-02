package by.training.part4.taskStudent;

public class Group {
    private Student[] students;
    private int realGroupSize;

    public Group(int number) {
        students = new Student[number];
        realGroupSize = 0;
    }

    public boolean add(Student newStudent) {
        if (realGroupSize >= students.length) {
            return false;
        }
        students[realGroupSize] = newStudent;
        realGroupSize++;
        return true;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}
