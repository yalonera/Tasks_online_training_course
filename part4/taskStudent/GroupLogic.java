package by.training.part4.taskStudent;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    private StudentLogic studentLogic = new StudentLogic();

    public List<Student> takeALevelStudents(Group group) {

        List<Student> result = new ArrayList<Student>();

        Student[] students = group.getStudents();

        for (Student st : students) {
            if (studentLogic.isAStudent(st)) {
                result.add(st);
            }

        }
        return result;
    }
}
