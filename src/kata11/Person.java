/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {

    private final String name;
    private final String surName;
    private final Calendar birth;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Calendar getBirth() {
        return birth;
    }

    public Person(String name, String surName, Calendar birth) {
        this.name = name;
        this.surName = surName;
        this.birth = birth;
    }

    public String getFullName() {
        return name + " " + surName;
    }

    public int getAge() {
        Calendar today ;
        today = GregorianCalendar.getInstance();
        return (int) milisegundosEnIngles((today.getTimeInMillis()- birth.getTimeInMillis()));
    }

    private long milisegundosEnIngles(long millis) {
        return (millis / MILLISECONDS_PER_YEAR);
    }
}
