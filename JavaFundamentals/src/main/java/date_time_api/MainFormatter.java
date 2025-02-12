package date_time_api;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MainFormatter {
    /**
     * ISO 8601:
     * AAAA-MM-JJTHH:MM:SS,ss-/+FF:ff
     * <ul>
     *     <li>« AAAA » représente l'année sur quatre chiffres (par exemple : 1959)<b>--> yyyy</b></li>
     *     <li>« MM » représente le mois sur deux chiffres (par exemple : 12 pour décembre)<b>--> MM</b></li>
     *     <li>« JJ » représente le jour du mois sur deux chiffres (par exemple : 25 pour le 25e jour du mois)<b>--> dd</b></li>
     *     <li>« T » pour time permet de séparer les indications de date (à gauche) et d'heure (à droite)<b>'T'</b></li>
     *     <li>« HH » représente l'heure en système 24 heures (par exemple : 15)<b>--> HH</b></li>
     *     <li>« MM » représente les minutes (par exemple : 20) <b>--> mm</b></li>
     *     <li>« SS » représente les secondes (par exemple : 49)<b>--> ss</b></li>
     *     <li>« ss » représente les fractions de seconde sur autant d'unités que nécessaire (par exemple : 3342)<b>--> SSSS</b></li>
     *     <li>
     *         <ul>
     *             <li>« -/+» représente le fuseau horaire, où « + » permet d'indiquer un fuseau en avance sur UTC et « - » permet d'indiquer un fuseau en retard sur UTC </li>
     *             <li>« FF » représente le nombre d'heures d'avance ou de retard sur le fuseau horaire UTC</li>
     *             <li>« ff » représente le nombre de minutes d'avance ou de retard sur le fuseau horaire UTC</li>
     *         </ul>
     *         <b>--> X ou Z</b>
     *     </li>
     * </ul>
     *
     * @param args
     */
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        String iso8601Pattern = "yyyy-MM-dd'T'HH:mm:ss,SSSS XXX";
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern(iso8601Pattern);
        String formattedDate = sdf.format(now);
        System.out.println(formattedDate);
    }
}
