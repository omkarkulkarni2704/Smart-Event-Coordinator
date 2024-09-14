@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "event")
    private List<Attendee> attendees;

    // Getters and Setters
}
