public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("josh", 17, "12-1-58214", 88, 90, 92);
        Student student2 = new Student("Bob", 18, "12-1-41285", 90, 89, 91);
        Student student3 = new Student("Ken", 20, "1224100449", 85, 87, 90);

        student1.introduce();
        student1.grades();

        student2.introduce();
        student2.grades();
        
        student3.introduce();
        student3.grades();
    }
}
