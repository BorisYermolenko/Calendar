package model;

import java.time.LocalDate;
import java.util.Objects;

public class Event {

    private String title;
    private LocalDate date;
    private String location;

    public Event(String title, LocalDate date, String location) {
        this.title = title;
        this.date = date;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(date, event.date) && Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, location);
    }

    @Override
    public String toString() {
        return "Event{" + "title='" + title + '\'' + ", date=" + date + ", location=" + location + '}';
    }
}
