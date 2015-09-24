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
public class KATA11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar;
        calendar = GregorianCalendar.getInstance();
        calendar.set(1900+49,7,22);
        Person persona = new Person("Union Deportiva", "Las Palmas", calendar);
        System.out.println(persona.getFullName());
        System.out.println(persona.getBirth().getTime());
        System.out.println(persona.getAge());
        System.out.println("");
    }
}
