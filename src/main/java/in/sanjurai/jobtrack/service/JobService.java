package in.sanjurai.jobtrack.service;


import in.sanjurai.jobtrack.entity.Job;
import in.sanjurai.jobtrack.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class JobService {


    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

        public Job updateJob (Long id, Job updatedJob){
            Optional<Job> optionalJob = jobRepository.findById(id);

            if (optionalJob.isEmpty()) {
                throw new RuntimeException("Job not found with id: " + id);
            }

            Job existingJob = optionalJob.get();

            existingJob.setCompanyName(updatedJob.getCompanyName());
            existingJob.setRole(updatedJob.getRole());
            existingJob.setStatus(updatedJob.getStatus());
            existingJob.setJobLink(updatedJob.getJobLink());

            return jobRepository.save(existingJob);
        }

    }



