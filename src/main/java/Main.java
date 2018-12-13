
import javax.swing.*;
import java.lang.String;



public class Main {

    public static void main (String [] args){

    AccionesBolsa FVI = new AccionesBolsa("Fondo de Valores Inmobiliarios", "FVI-A", 133193909.0, 54.2);

        System.out.println (FVI.getNombre() +  FVI.getSimbolo() + FVI.getNumeroDeAcciones() + FVI.getUltimoPrecio());

        JTextArea TxtNombreAccion = new JTextArea(FVI.getNombre());

    }




}
