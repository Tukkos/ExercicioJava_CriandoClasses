public class Subject {
    String subjectName;
    String subjectProfessor;
    int subjectLevel;
    String[] subjectProgram;
    private double studentFinalGrade;
    private boolean studentApproval = false;

    public void setStudentFinalGrade(double studentFinalGrade) {
        this.studentFinalGrade = studentFinalGrade;
    }

    public double getStudentFinalGrade() {
        return this.studentFinalGrade;
    }

    public void setStudentApproval() {
        if (getStudentFinalGrade() > 70) {
            this.studentApproval = true;
        }
    }

    public boolean getStudentApproval() {
        return this.studentApproval;
    }
}
