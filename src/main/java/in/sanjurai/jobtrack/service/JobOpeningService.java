
package in.sanjurai.jobtrack.service;

import in.sanjurai.jobtrack.entity.JobOpening;
import in.sanjurai.jobtrack.repository.JobOpeningRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobOpeningService {

    private final JobOpeningRepository jobOpeningRepository;
    private final NotificationService notificationService;

    public JobOpeningService(
            JobOpeningRepository jobOpeningRepository,
            NotificationService notificationService) {
        this.jobOpeningRepository = jobOpeningRepository;
        this.notificationService = notificationService;
    }

    public JobOpening addOpening(JobOpening opening) {
        JobOpening savedOpening = jobOpeningRepository.save(opening);

        String title = "New Hiring Update: " + savedOpening.getCompanyName();

        String message = savedOpening.getCompanyName()
                + " has a new opening for "
                + savedOpening.getRole()
                + ". Check the Company Hiring Updates section for details.";

        notificationService.createNotification(title, message);

        return savedOpening;
    }

    public List<JobOpening> getAllOpenings() {
        return jobOpeningRepository.findAll();
    }
}
