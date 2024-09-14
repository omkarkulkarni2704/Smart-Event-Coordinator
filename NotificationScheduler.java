@Component
public class NotificationScheduler {

    @Autowired
    private EventService eventService;

    @Scheduled(cron = "0 0 8 * * ?")  // Example: daily at 8 AM
    public void sendReminders() {
        LocalDateTime now = LocalDateTime.now();
        List<Reminder> reminders = eventService.getUpcomingReminders(now);
        for (Reminder reminder : reminders) {
            // Implement email sending and in-app notifications
            sendEmail(reminder);
            sendInAppNotification(reminder);
        }
    }

    private void sendEmail(Reminder reminder) {
        // Implement email sending logic
    }

    private void sendInAppNotification(Reminder reminder) {
        // Implement in-app notification logic
    }
}
