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
public class Comision extends Persona {

    private double Porcentaje;
    private double VentasBrutas;

    public Comision() {
        super();
    }

    public Comision(int cod, String nom, String ape, Date fec, char sex, String est, double Porcentaje, double VentasBrutas) {
        super(cod, nom, ape, fec, sex, est);
        this.Porcentaje = Porcentaje;
        this.VentasBrutas = VentasBrutas;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getVentasBrutas() {
        return VentasBrutas;
    }

    public void setVentasBrutas(double VentasBrutas) {
        this.VentasBrutas = VentasBrutas;
    }

    public double CalcularSueldo() {
        return (VentasBrutas * Porcentaje) / 100;
    }

    public void Imprimircomision() {
        JOptionPane.showMessageDialog(null, Imprimir() + "\n" + "Sueldo a cobrar: $" + CalcularSueldo());
    }
}
