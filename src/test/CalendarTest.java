package test;

import model.Event;
import service.Calendar;

import java.time.LocalDate;
import java.util.List;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Event meeting = new Event("Встреча с командой", LocalDate.of(2025, 10, 26), "Офис");
        Event concert = new Event("Концерт", LocalDate.of(2025, 10, 27), "Астана Арена");
        Event training = new Event("Тренировка", LocalDate.of(2025, 10, 26), "Фитнес-зал");

        calendar.addEvent(meeting);
        calendar.addEvent(concert);
        calendar.addEvent(training);

        System.out.println("\nВсе события:");
        calendar.printAllEvents();

        System.out.println("\nСобытия на 26 октября 2025:");
        List<Event> eventsOn26 = calendar.getEventsForTheDay(LocalDate.of(2025, 10, 26));
        for (Event event : eventsOn26) {
            System.out.println(event);
        }

        calendar.removeEvent(training);

        System.out.println("\nПосле удаления тренировки:");
        eventsOn26 = calendar.getEventsForTheDay(LocalDate.of(2025, 10, 26));
        for (Event event : eventsOn26) {
            System.out.println(event);
        }
    }

}
