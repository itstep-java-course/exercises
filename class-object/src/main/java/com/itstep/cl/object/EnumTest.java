package com.itstep.cl.object;

public class EnumTest {
    public static void main(String[] args) {
        final CalendarEventFactory calendarEventFactory = new CalendarEventFactory();

        calendarEventFactory.createEvent(DayOfTheWeek.THURSDAY, "Java course");
        calendarEventFactory.createEvent(DayOfTheWeek.SUNDAY, "Бухалово");
    }

    private enum DayOfTheWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private static class CalendarEvent {
        private final DayOfTheWeek dayOfTheWeek;
        private final String eventName;

        private CalendarEvent(DayOfTheWeek dayOfTheWeek, String eventName) {
            this.dayOfTheWeek = dayOfTheWeek;
            this.eventName = eventName;
        }

        @Override
        public String toString() {
            return "CalendarEvent{" +
                    "dayOfTheWeek=" + dayOfTheWeek +
                    ", eventName='" + eventName + '\'' +
                    '}';
        }
    }

    private static class CalendarEventFactory {

        private CalendarEvent createEvent(DayOfTheWeek dayOfTheWeek, String eventName) {
            if (DayOfTheWeek.SUNDAY == dayOfTheWeek) {
                throw new RuntimeException("В воскресенье нет возможности провести: " + eventName);
            }
            return new CalendarEvent(dayOfTheWeek, eventName);
        }
    }
}
