import java.util.List; // Ensure this is at the top of the file

public interface Filter {
    List<Applicant> process(List<Applicant> applicants);
}
