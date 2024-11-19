// EligibilityFilter.java (Business Logic Layer)
import java.util.ArrayList;
import java.util.List;

public class EligibilityFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> eligibleApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.percentage >= 50) {
                System.out.println("Notification sent to " + applicant.name + ": You are eligible to apply.");
                eligibleApplicants.add(applicant);
            }
        }
        return eligibleApplicants;
    }
}
