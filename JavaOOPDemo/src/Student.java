public class Student {
    String name;
    int age;
    String student_number;
    int math_grade;
    int english_grade;
    int filipino_grade;

    public Student(String name, int age, String student_number, int math_grade, int english_grade, int filipino_grade) {
        this.name = name;
        this.age = age;
        this.student_number = student_number;
        this.math_grade = math_grade;
        this.english_grade = english_grade;
        this.filipino_grade = filipino_grade;

    }

    public void introduce() {
        System.out.println("=Student Record=");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Number: " + student_number);

    }

    public void grades() {
        System.out.println("=Student Grades=");
        System.out.println(name);
        System.out.println("Math | English | Filipino ");
        System.out.println(math_grade + " | " + english_grade + " | " + filipino_grade);

    }
}
