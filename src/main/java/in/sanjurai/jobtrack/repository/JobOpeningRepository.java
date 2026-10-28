package in.sanjurai.jobtrack.repository;

import in.sanjurai.jobtrack.entity.JobOpening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOpeningRepository
        extends JpaRepository<JobOpening, Long> {
}