public class Student {
    interface LearningPerson {
        void studyAtHome();
    }

    interface TeachingPerson {
        void teachToOtherPeople();
    }

    class CollegePerson {
        private String name;
        private String surname;
        private int collegeId;

        public CollegePerson(String name, String surname, int collegeId) {
            this.name = name;
            this.surname = surname;
            this.collegeId = collegeId;
        }

        public void goToCollege() {
            System.out.println("Name: " + name + ", Surname: " + surname + ", College ID: " + collegeId);
        }
    }

    class Student extends CollegePerson implements LearningPerson {
        private int academicYear;

        public Student(String name, String surname, int collegeId, int academicYear) {
            super(name, surname, collegeId);
            this.academicYear = academicYear;
        }

        @Override
        public void studyAtHome() {
            System.out.println("Student " + getName() + " is studying at home in academic year " + academicYear);
        }
    }

    class Professor extends CollegePerson implements TeachingPerson {
        private String teachingSubject;

        public Professor(String name, String surname, int collegeId, String teachingSubject) {
            super(name, surname, collegeId);
            this.teachingSubject = teachingSubject;
        }

        @Override
        public void teachToOtherPeople() {
            System.out.println("Professor " + getName() + " is teaching " + teachingSubject);
        }
    }

    class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
        private boolean isGoingToBeAPhD;

        public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
            super(name, surname, collegeId);
            this.isGoingToBeAPhD = isGoingToBeAPhD;
        }

        @Override
        public void studyAtHome() {
            System.out.println("Assistant " + getName() + " is studying at home");
        }

        @Override
        public void teachToOtherPeople() {
            System.out.println("Assistant " + getName() + " is teaching");
        }
    }
}
