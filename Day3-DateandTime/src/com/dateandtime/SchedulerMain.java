package com.dateandtime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Event {
    private String name;
    private ZonedDateTime startTime;
    private Period recurrencePeriod;

    public Event(String name, ZonedDateTime startTime, Period recurrencePeriod) {
        this.name = name;
        this.startTime = startTime;
        this.recurrencePeriod = recurrencePeriod;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public Period getRecurrencePeriod() {
        return recurrencePeriod;
    }

    public ZonedDateTime getNextOccurrence(ZonedDateTime currentTime) {
        ZonedDateTime nextOccurrence = startTime;
        while (nextOccurrence.isBefore(currentTime)) {
            nextOccurrence = nextOccurrence.plus(recurrencePeriod);
        }
        return nextOccurrence;
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', startTime=" + startTime + ", recurrencePeriod=" + recurrencePeriod + "}";
    }
}

// Scheduler Class
class Scheduler {
    private List<Event> events;

    public Scheduler() {
        events = new ArrayList<>();
    }

    public void addEvent(String name, String dateTime, String timeZone, Period recurrencePeriod) {
        ZonedDateTime startTime = ZonedDateTime.of(LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
                ZoneId.of(timeZone));
        events.add(new Event(name, startTime, recurrencePeriod));
    }

    public void listAllEvents() {
        System.out.println("All Events:");
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public void notifyUpcomingEvents(String timeZone) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(timeZone));
        System.out.println("Notifications for upcoming events:");
        for (Event event : events) {
            ZonedDateTime nextOccurrence = event.getNextOccurrence(now);
            long hoursUntil = ChronoUnit.HOURS.between(now, nextOccurrence);
            if (hoursUntil > 0 && hoursUntil <= 24) {
                System.out.println("Event: " + event.getName() + " is scheduled at " + nextOccurrence + " (in " + hoursUntil + " hours)");
            }
        }
    }
}

public class SchedulerMain {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        // Adding sample events
        scheduler.addEvent("Team Meeting", "2025-01-03 10:00", "America/New_York", Period.ofDays(7));
        scheduler.addEvent("Code Review", "2025-01-04 14:00", "Europe/London", Period.ofMonths(1));
        scheduler.addEvent("Project Deadline", "2025-01-02 23:59", "Asia/Kolkata", Period.ofDays(0));

        // List all events
        scheduler.listAllEvents();

        // Notify upcoming events based on a specific time zone
        scheduler.notifyUpcomingEvents("America/New_York");
    }
}
