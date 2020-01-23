package com.itstep.cl.object;

public class EnumTest {
    public static void main(String[] args) {
        final CalendarEventFactory calendarEventFactory = new CalendarEventFactory();

        calendarEventFactory.createEvent(DayOfTheWeek.THURSDAY, "Java course");
//        calendarEventFactory.createEvent(DayOfTheWeek.SUNDAY, "Бухалово");

        System.out.println(DayOfTheWeek.SUNDAY.getDisplayName());


        final DayOfTheWeek monday = DayOfTheWeek.valueOf("MONDAY");
        final DayOfTheWeek tuesday = DayOfTheWeek.getDayByName("Tuesday");

        final int ordinal = DayOfTheWeek.SUNDAY.ordinal();
        System.out.println(ordinal);

        final DayOfTheWeek value = DayOfTheWeek.values()[4];

        System.out.println(value);
    }

    private enum DayOfTheWeek implements DayWeek {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        private String dayOfTheWeekPrintable;

        DayOfTheWeek(String dayOfTheWeekPrintable) {
            this.dayOfTheWeekPrintable = dayOfTheWeekPrintable;
        }

        public static DayOfTheWeek getDayByName(String name) {
            final DayOfTheWeek[] values = values();

            for (DayOfTheWeek value : values) {
                if (value.dayOfTheWeekPrintable.equals(name)) {
                    return value;
                }
            }
            throw new RuntimeException("Illegal name: " + name);
        }

        @Override
        public String toString() {
            return dayOfTheWeekPrintable;
        }

        @Override
        public String getDisplayName() {
            return dayOfTheWeekPrintable;
        }
    }

    private interface DayWeek {
        String getDisplayName();
    }

    private static class DayOfTheWeekClass {
        private static final DayOfTheWeekClass MONDAY = new DayOfTheWeekClass();
        private static final DayOfTheWeekClass TUESDAY = new DayOfTheWeekClass();
        private static final DayOfTheWeekClass WEDNESDAY = new DayOfTheWeekClass();

        private DayOfTheWeekClass() {

        }
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

    //простейшая реализация синглетона. Не для многопоточной среды
    private static class SingletonExample {
        private static final SingletonExample se = new SingletonExample();

        private SingletonExample() {
        }

        public static SingletonExample getInstance() {
            return se;
        }
    }

}
