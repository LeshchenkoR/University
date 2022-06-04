public class Student {

    String universityId;
    String fullName;
    int currentCourseNumber;
    float avgExamScore;

    //builder
    Student(StudentBuilder studentBuilder) {
        universityId = studentBuilder.universityId;
        fullName = studentBuilder.fullName;
        currentCourseNumber = studentBuilder.currentCourseNumber;
        avgExamScore = studentBuilder.avgExamScore;
    }

    //getters
    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    @Override
    public String toString() {
        String specifiers = "%-20s %-15s %-4d %-5.2f %n";
         return String.format(specifiers, fullName, universityId, currentCourseNumber, avgExamScore);
    }

    //Student Builder
    public static class StudentBuilder {
        private final String universityId;
        private final String fullName;
        private int currentCourseNumber;
        private float avgExamScore;

        public StudentBuilder(String universityId, String fullName) {
            this.universityId = universityId;
            this.fullName = fullName;
        }

        //SETTERS
        public StudentBuilder setCurrentCourseNumber(int currentCourseNumber) {
            this.currentCourseNumber = currentCourseNumber;
            return this;
        }

        public StudentBuilder setAvgExamScore(float avgExamScore) {
            this.avgExamScore = avgExamScore;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
