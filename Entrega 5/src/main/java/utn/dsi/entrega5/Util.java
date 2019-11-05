package utn.dsi.entrega5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static Date crearFecha(int dia, int mes, int año) {
        String strFecha = año + "-" + mes + "-" + dia;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(strFecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
