package utn.dsi.entrega5.aplicacion.entidades;

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


    public static Date crearFechaHora(int dia, int mes, int año, int hora, int minuto) {
        String strFecha = año + "-" + mes + "-" + dia + ":" + hora + ":" + minuto;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm");
        Date date = null;
        try {
            date = sdf.parse(strFecha);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        return date;
    }
}
