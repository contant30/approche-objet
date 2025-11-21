package tp.dateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    static void main(String[] args) {


        //  Date du jour
        Date dateDuJour = new Date(); // date actuelle
        SimpleDateFormat formatJour = new SimpleDateFormat("dd/MM/yyyy"); // jour/mois/année
        System.out.println("Date du jour : " + formatJour.format(dateDuJour));

        //  Date précise : 19/05/2016 23:59:30
        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30); // mois = 0-based donc Mai = 4 ou Calendar.MAY
        Date datePrecise = cal.getTime();

        SimpleDateFormat formatPrecise = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // année/mois/jour heure:minute:seconde
        System.out.println("Date précise : " + formatPrecise.format(datePrecise));

        //  Date/heure système actuelle
        Date dateHeureSysteme = new Date();
        System.out.println("Date/heure système : " + formatPrecise.format(dateHeureSysteme));


    }
}
