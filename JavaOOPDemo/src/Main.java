public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("josh", 17, "12-1-58214", 88, 90, 92);
        Student student2 = new Student("Bravo", 18, "12-1-41285", 90, 89, 91);
        student1.introduce();
        student1.grades();
        student2.introduce();
        student2.grades();
    }
}
