package creational.builder;

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String group;

    private Student(String firstName, String lastName, LocalDate dateOfBirth, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", group='" + group + '\'' +
                '}';
    }

    public void printStudent(){
        System.out.println(this);
    }

    public static Student.StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{

        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String group;

        public StudentBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public StudentBuilder dateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public StudentBuilder group(String group){
            this.group = group;
            return this;
        }

        public Student build(){
            return new Student(this.firstName, this.lastName, this.dateOfBirth, this.group);
        }

    }
}
