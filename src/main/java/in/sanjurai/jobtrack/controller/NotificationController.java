
package in.sanjurai.jobtrack.controller;

import in.sanjurai.jobtrack.entity.Notification;
import in.sanjurai.jobtrack.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(
            NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/unread-count")
    public Map<String, Long> getUnreadCount() {
        return Map.of(
                "count",
                notificationService.getUnreadCount()
        );
    }

    @PostMapping
    public Notification createNotification(
            @RequestBody Map<String, String> request) {
        return notificationService.createNotification(
                request.get("title"),
                request.get("message")
        );
    }

    @PutMapping("/{id}/read")
    public Notification markAsRead(@PathVariable Long id) {
        return notificationService.markAsRead(id);
    }
}
