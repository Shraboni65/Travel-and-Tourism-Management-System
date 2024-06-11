package travelandtour;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JDate {
    public static long calculateDateDifference(int d1, int m1, int y1, int d2, int m2, int y2) {
        try{
            LocalDate date1 = LocalDate.of(y1, m1+1, d1);
            LocalDate date2 = LocalDate.of(y2, m2+1, d2);

            return ChronoUnit.DAYS.between(date1, date2);
        }catch(Exception e){
            
        }
        return 0;
    }
    
    public static String dateToString(int d, int m, int y){
        m++;
        String s = y + "";
        if(m < 10)  s = s + "-0" + m;
        else    s = s + "-" + m;
        
        if(d < 10)  s = s + "-0" + d;
        else    s = s + "-" + d;
        
        return s;
    }
}
