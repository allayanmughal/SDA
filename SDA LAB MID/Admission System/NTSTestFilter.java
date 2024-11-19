// NTSTestFilter.java (Business Logic Layer)
import java.util.ArrayList;
import java.util.List;

public class NTSTestFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> ntsPassedApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.ntsScore >= 60) {
                System.out.println("Notification sent to " + applicant.name + ": You passed the NTS test.");
                ntsPassedApplicants.add(applicant);
            }
        }
        return ntsPassedApplicants;
    }
}
