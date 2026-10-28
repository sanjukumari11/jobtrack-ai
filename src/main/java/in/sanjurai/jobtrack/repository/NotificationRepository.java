
package in.sanjurai.jobtrack.repository;

import in.sanjurai.jobtrack.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository
        extends JpaRepository<Notification, Long> {

    long countByIsReadFalse();
}
