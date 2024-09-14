@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        return ResponseEntity.ok(eventService.createEvent(event));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id) {
        return ResponseEntity.ok(eventService.getEvent(id));
    }

    @GetMapping
    public ResponseEntity<List<Event>> listEvents() {
        return ResponseEntity.ok(eventService.listEvents());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{eventId}/attendees")
    public ResponseEntity<Attendee> addAttendee(@PathVariable Long eventId, @RequestBody Attendee attendee) {
        attendee.setEvent(eventService.getEvent(eventId));
        return ResponseEntity.ok(eventService.addAttendee(attendee));
    }

    @GetMapping("/{eventId}/attendees")
    public ResponseEntity<List<Attendee>> getAttendees(@PathVariable Long eventId) {
        return ResponseEntity.ok(eventService.getAttendees(eventId));
    }

    @PostMapping("/{eventId}/reminders")
    public ResponseEntity<Reminder> createReminder(@PathVariable Long eventId, @RequestBody Reminder reminder) {
        reminder.setEvent(eventService.getEvent(eventId));
        return ResponseEntity.ok(eventService.createReminder(reminder));
    }

    @GetMapping("/{eventId}/reminders")
    public ResponseEntity<List<Reminder>> getReminders(@PathVariable Long eventId) {
        return ResponseEntity.ok(eventService.getReminders(eventId));
    }
}
