package com.epam.task02;

import java.io.*;
import java.time.LocalDate;
import java.util.Properties;
import java.time.format.DateTimeFormatter;

public class EventsPropertiesReader {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd");
    static Properties eventProp = new Properties();

    public static void getEventsProperties() {

        try {
            FileInputStream fis = new FileInputStream("src/task2/events.properties");
            Properties eventProp = new Properties();
            eventProp.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static int getId(int index) {
        return Integer.parseInt(eventProp.getProperty("id"+ index));
    }


    public static String getEventName(int index) {
        return eventProp.getProperty("eventName"+index);
    }

    public static String getEventDescription(int index) {
        return eventProp.getProperty("eventDescription"+index);
    }

    public static LocalDate getEventDate(int index) {
        return LocalDate.parse(eventProp.getProperty("eventDate"+index),formatter);
    }

    public static String getPlace(int index) {
        return eventProp.getProperty("place"+index);
    }

    public static int getTicketsLimit(int index) {
        return Integer.parseInt(eventProp.getProperty("ticketsLimit"+index));
    }

}
