package by.training.part4.taskStudent;

public class Student {
    private String name;
    private String lastName;
    private int groupNumber;
    private int[] mark;

    public Student(String name, String lastName, int groupNumber, int[] mark) {
        this.name = name;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

}
