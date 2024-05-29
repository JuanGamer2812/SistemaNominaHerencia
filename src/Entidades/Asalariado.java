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
public class Asalariado extends Persona {

    private double Sueldo;

    public Asalariado() {
        super();
    }

    public Asalariado(int cod, String nom, String ape, Date fec, char sex, String est, double Sueldo) {
        super(cod, nom, ape, fec, sex, est);
        this.Sueldo = Sueldo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double CalcularSueldo() {
        double total = 0;
        total = Sueldo * 4;
        return total;
    }

    public void ImprimirAsalariado() {
        JOptionPane.showMessageDialog(null, Imprimir() + "\n" + "Sueldo a cobrar: $" + CalcularSueldo());
    }
}
