package service;

import model.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private final List<Event> calendar;

    public Calendar() {
        calendar = new ArrayList<>();
    }

    public void addEvent(Event event) {
        calendar.add(event);
    }

    public List<Event> getEventsForTheDay(LocalDate date) {
        List<Event> events = new ArrayList<>();
        for (Event event : calendar) {
            if (event.getDate().equals(date)) {
                events.add(event);
            }
        }
        return events;
    }

    public void removeEvent(Event event) {
        calendar.remove(event);
    }

    public void printAllEvents() {
        calendar.forEach(System.out::println);
    }

}
