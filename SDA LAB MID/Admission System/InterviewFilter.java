// InterviewFilter.java (Business Logic Layer)
import java.util.ArrayList;
import java.util.List;

public class InterviewFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> interviewPassedApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.passedInterview) {
                System.out.println("Notification sent to " + applicant.name + ": You passed the interview.");
                interviewPassedApplicants.add(applicant);
            }
        }
        return interviewPassedApplicants;
    }
}
