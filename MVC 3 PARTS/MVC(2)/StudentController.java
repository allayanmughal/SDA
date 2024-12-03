class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRegNo(String regNo) {
        model.setRegNo(regNo);
    }

    public String getStudentRegNo() {
        return model.getRegNo();
    }

    public void setStudentGpa(double gpa) {
        model.setGpa(gpa);
    }

    public double getStudentGpa() {
        return model.getGpa();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRegNo(), model.getGpa(), model.getGrade());
    }
}
