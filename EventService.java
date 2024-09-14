@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AttendeeRepository attendeeRepository;
    @Autowired
    private ReminderRepository reminderRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event getEvent(Long id) {
        return eventRepository.findById(id);
    }

    public List<Event> listEvents() {
        return eventRepository.findAll();
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Attendee> getAttendees(Long eventId) {
        return attendeeRepository.findByEventId(eventId);
    }

    public Reminder createReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public List<Reminder> getReminders(Long eventId) {
        return reminderRepository.findByEventId(eventId);
    }
}
