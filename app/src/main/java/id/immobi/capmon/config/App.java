package id.immobi.capmon.config;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by root on 5/29/2017.
 */
public class App {
    String tgl;
    public static String getTgl(){
        Calendar c = Calendar.getInstance();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String strDate = sdf.format(c.getTime());
        return strDate;
    }
}
