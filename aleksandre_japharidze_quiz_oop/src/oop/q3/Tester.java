package oop.q3;

public class Tester {
    public static void main(String[] args) {
        University university = new University();

        Student aleksandre = new Student();
        aleksandre.setName("Aleksandre");
        aleksandre.setSurname("Japharidze");
        aleksandre.setCountry("Georgia");
        aleksandre.setInfo("Student at university");

        Student james = new Student();
        james.setName("James");
        james.setSurname("Bond");
        james.setCountry("USA");
        james.setInfo("Student at University");

        university.addStudent(aleksandre);
        university.addStudent(james);

        System.out.println(university.getStudentInfoStrange(aleksandre));
        System.out.println(university.getStudentInfoStrange(james));
        university.removeStudent(aleksandre);
        System.out.println(university.getStudentInfoStrange(aleksandre));
        university.removeStudent(james);
        System.out.println(university.getStudentInfoStrange(james));

        System.out.println();
    }
}
