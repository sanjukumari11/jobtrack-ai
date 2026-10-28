
package in.sanjurai.jobtrack.controller;

import in.sanjurai.jobtrack.entity.JobOpening;
import in.sanjurai.jobtrack.service.JobOpeningService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/openings")
public class JobOpeningController {

    private final JobOpeningService jobOpeningService;

    public JobOpeningController(JobOpeningService jobOpeningService) {
        this.jobOpeningService = jobOpeningService;
    }

    @PostMapping
    public JobOpening addOpening(@RequestBody JobOpening opening) {
        return jobOpeningService.addOpening(opening);
    }

    @GetMapping
    public List<JobOpening> getAllOpenings() {
        return jobOpeningService.getAllOpenings();
    }
}
