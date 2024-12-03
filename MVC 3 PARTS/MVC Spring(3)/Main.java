public class Main {
    public static void main(String[] args) {
        // Create the view
        StudentView view = new StudentView();

        // Create and initialize student data
        String[][] studentData = {
            {"Aalyan", "REG001", "3.8", "A"},
            {"Hassan", "REG002", "3.5", "B+"},
            {"Ghazi", "REG003", "3.9", "A+"},
            {"Hadi", "REG004", "3.6", "B+"},
            {"Huzaifa", "REG005", "3.7", "A"}
        };

        // Loop through each student and display details
        for (String[] data : studentData) {
            // Create the model
            Student model = new Student();

            // Create the controller and bind the model and view
            StudentController controller = new StudentController(model, view);

            // Set student data via the controller
            controller.setStudentName(data[0]);
            controller.setStudentRegNo(data[1]);
            controller.setStudentGpa(Double.parseDouble(data[2]));
            controller.setStudentGrade(data[3]);

            // Update the view
            controller.updateView();
        }
    }
}
