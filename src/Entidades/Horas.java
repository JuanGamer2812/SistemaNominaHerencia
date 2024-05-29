/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Horas extends Persona {

    private double Horas;
    private double Costo;

    public Horas() {
        super();
    }

    public Horas(int cod, String nom, String ape, Date fec, char sex, String est, double Horas, double Costo) {
        super(cod, nom, ape, fec, sex, est);
        this.Horas = Horas;
        this.Costo = Costo;
    }

    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public double CalcularSueldo() {
        double total;
        if (Horas >= 40) {
            Costo *= 1.5;
        }
        total = Horas * Costo;

        return total;
    }

    public void ImprimirHoras() {
        JOptionPane.showMessageDialog(null, Imprimir() + "\n" + "Sueldo a cobrar: $" + CalcularSueldo());
    }
}
