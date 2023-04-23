package creational.builder;

public class Client {
    public static void main(String[] args) {

        Student firstStudent = Student.builder()
                .firstName("Mykola")
                .lastName("Dnonnikov")
                .build();

        firstStudent.printStudent();
    }
}
