public class Test {

    public static void main(String[] args) {

        Student student = new Student("John", "Doe", 1001, 2);
        Professor professor = new Professor("Alice", "Smith", 2001, "Computer Science");
        Assistant assistant = new Assistant("Bob", "Johnson", 3001, true);

        // Invoke the goToCollege() method for each object
        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        // Invoke the implemented methods from interfaces
        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
