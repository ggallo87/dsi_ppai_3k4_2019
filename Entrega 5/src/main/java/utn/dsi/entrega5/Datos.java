package utn.dsi.entrega5;

import java.util.ArrayList;

public class Datos {

    private ArrayList<Bombero> bomberos;
    private ArrayList<ProgramacionGuardia> programacionesGuardia;

    private static Datos instance;

    public static Datos getInstance() {
        if (instance == null) instance = new Datos();
        return instance;
    }

    public Datos() {
        bomberos = new ArrayList<>();


        cargarBomberos();
    }

    private void cargarBomberos() {
        // TODO!
    }

    public ArrayList<Bombero> obtenerBomberos() {
        return bomberos;
    }

    public ArrayList<ProgramacionGuardia> obtenerProgramacionesGuardia() {
        return programacionesGuardia;
    }
}
