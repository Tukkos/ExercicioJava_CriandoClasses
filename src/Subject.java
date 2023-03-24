public class Subject {
    private String subjectName;
    private String subjectProfessor;
    private int subjectLevel;
    private String[] subjectProgram;
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


    public void setSubjectName(String subjectName) {
        if (subjectName.length() > 3) {
            this.subjectName = subjectName;
        } else {
            System.out.println("Favor inserir o nome inteiro da disciplina");
        }
    }

    public String getSubjectName() {
        return subjectName;
    }


    public void setSubjectProfessor(String subjectProfessor) {
        if (subjectProfessor.length() > 10) {
            this.subjectProfessor = subjectProfessor;
        } else {
            System.out.println("Favor inserir o nome completo do professor");
        }
    }

    public String getSubjectProfessor() {
        return subjectProfessor;
    }


    public void setSubjectLevel(int subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    public int getSubjectLevel() {
        return subjectLevel;
    }
    

    public void setSubjectProgram(String[] subjectProgram) {
        this.subjectProgram = subjectProgram;
    }

    public String[] getSubjectProgram() {
        return subjectProgram;
    }

    
}
