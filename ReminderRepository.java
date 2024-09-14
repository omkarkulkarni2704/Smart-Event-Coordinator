@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    List<Reminder> findByEventId(Long eventId);
}
