import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long d = date.getTime();
        System.out.println(d);
        SimpleDateFormat sd = new SimpleDateFormat();
        String std = sd.format(date);
        System.out.println(std);
        date = sd.parse(std);
        System.out.println(date);
    }
}
