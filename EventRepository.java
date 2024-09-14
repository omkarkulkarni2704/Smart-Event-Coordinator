@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAll();
    Event findById(long id);
    void deleteById(long id);
}
