
package in.sanjurai.jobtrack.repository;

import in.sanjurai.jobtrack.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
