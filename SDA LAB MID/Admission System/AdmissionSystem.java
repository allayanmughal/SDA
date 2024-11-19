import java.util.ArrayList;
import java.util.List;

public class AdmissionSystem {
    public static void main(String[] args) {
        // Create 10 applicants
        List<Applicant> applicants = new ArrayList<>();
        applicants.add(new Applicant("Allayan Mughal", 55));
        applicants.add(new Applicant("Ghazi Raza", 60));
        applicants.add(new Applicant("Huzaifa Ahmad", 75));
        applicants.add(new Applicant("Hadi Raza", 45));  // Ineligible
        applicants.add(new Applicant("Hassan Ali Mahwani", 80));
        applicants.add(new Applicant("Faraz Jadoon", 40));  // Ineligible
        applicants.add(new Applicant("Abubaker Jutt", 65));
        applicants.add(new Applicant("Hamza Khan", 50));
        applicants.add(new Applicant("Ali Hamid", 85));
        applicants.add(new Applicant("Osama Tariq", 49));  // Ineligible

        // Set NTS scores for each applicant
        for (int i = 0; i < applicants.size(); i++) {
            applicants.get(i).ntsScore = 60 + (i % 5) * 5; // Assign varying NTS scores
        }

        // Set interview results
        for (int i = 0; i < applicants.size(); i++) {
            applicants.get(i).passedInterview = (i % 3 != 0); // Every third fails interview
        }

        // Process applicants and display results
        applyPipelineAndDisplayResults(applicants);
    }

    public static void applyPipelineAndDisplayResults(List<Applicant> applicants) {
        // Filters
        Filter eligibilityFilter = new EligibilityFilter();
        Filter ntsTestFilter = new NTSTestFilter();
        Filter interviewFilter = new InterviewFilter();

        System.out.println("Processing Applicants...\n");

        // Apply Eligibility Filter
        applicants = eligibilityFilter.process(applicants);

        // Apply NTS Test Filter
        applicants = ntsTestFilter.process(applicants);

        // Apply Interview Filter
        List<Applicant> finalMeritList = interviewFilter.process(applicants);

        // Display results for all applicants
        for (Applicant applicant : applicants) {
            System.out.println("===== Applicant: " + applicant.name + " =====");
            System.out.println("Academic Percentage: " + applicant.percentage);

            if (applicant.percentage < 50) {
                System.out.println("Eligibility Status: Not Eligible");
                System.out.println("Notification: Better luck next time.");
            } else {
                System.out.println("Eligibility Status: Eligible");
                System.out.println("Notification: Congratulations! You are eligible to apply.");

                System.out.println("NTS Score: " + applicant.ntsScore);
                if (applicant.ntsScore < 60) {
                    System.out.println("NTS Test Status: Failed");
                    System.out.println("Notification: You did not pass the NTS test.");
                } else {
                    System.out.println("NTS Test Status: Passed");
                    System.out.println("Notification: You passed the NTS test.");

                    System.out.println("Interview Status: " + (applicant.passedInterview ? "Passed" : "Failed"));
                    if (applicant.passedInterview) {
                        System.out.println("Notification: You passed the interview.");
                        System.out.println("Merit List Status: Included");
                    } else {
                        System.out.println("Notification: You did not pass the interview.");
                        System.out.println("Merit List Status: Not Included");
                    }
                }
            }

            System.out.println(); // Separate output for each applicant
        }

        // Display Final Merit List
        System.out.println("\n===== Final Merit List =====");
        for (Applicant applicant : finalMeritList) {
            System.out.println("Name: " + applicant.name);
        }
    }
}

// Eligibility Filter Class
class EligibilityFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> eligibleApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.percentage >= 50) {
                eligibleApplicants.add(applicant);
            }
        }
        return eligibleApplicants;
    }
}

// NTS Test Filter Class
class NTSTestFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> ntsPassedApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.ntsScore >= 60) {
                ntsPassedApplicants.add(applicant);
            }
        }
        return ntsPassedApplicants;
    }
}

// Interview Filter Class
class InterviewFilter implements Filter {
    @Override
    public List<Applicant> process(List<Applicant> applicants) {
        List<Applicant> interviewPassedApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.passedInterview) {
                interviewPassedApplicants.add(applicant);
            }
        }
        return interviewPassedApplicants;
    }
}
