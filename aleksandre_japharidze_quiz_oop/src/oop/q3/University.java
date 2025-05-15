package oop.q3;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {   // Here, in my opinion, void would be better choice. But task said to use boolean, so I am...
        return students.remove(s);
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the university.");
        } else {
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Surname: " + student.getSurname() +
                        ", Country: " + student.getCountry() + ", Info: " + student.getInfo());
            }
        }
    }
    public String getStudentInfoStrange(Student s) {
        String yourName = "Aleksandre";
        String yourSurname = "Japharidze";
        String yourCountry = "Georgia";
        String yourPersonalNumber = "01908069637";
        String[] yourCourses = {"Java OOP", "Computer Organization", "Calculus", "English", "Discrete Math"};

        if (s.getName().equals(yourName) && s.getSurname().equals(yourSurname) && s.getCountry().equals(yourCountry)) {
            if (students.contains(s)) {
                return String.join(", ", yourCourses);
            } else {
                return yourPersonalNumber;
            }
        } else {
            if (students.contains(s)) {
                return s.getInfo();
            } else {
                return null;
            }
        }
    }
}
