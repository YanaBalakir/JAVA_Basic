package com.epam.mentoring.task2;

import java.io.*;
import java.time.LocalDate;
import java.util.Properties;
import java.time.format.DateTimeFormatter;

public class EventsPropertiesReader {


    public static void getEventsProperties() {
        FileInputStream fis;
        Properties eventProp = new Properties();

        try {
            fis = new FileInputStream("src/task2/events.properties");
            eventProp.load(fis);
            int id = Integer.parseInt(eventProp.getProperty("id"));
            String eventDescription = eventProp.getProperty("eventDescription");
            String eventName = eventProp.getProperty("eventName");
            LocalDate eventDate = LocalDate.parse(eventProp.getProperty("eventDate"));
            String place = eventProp.getProperty("place");
            int ticketsLimit = Integer.parseInt(eventProp.getProperty("ticketsLimit"));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
