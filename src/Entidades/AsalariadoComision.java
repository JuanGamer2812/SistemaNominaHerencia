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
public class AsalariadoComision extends Comision {

    private double SalarioBase;

    public AsalariadoComision() {
        super();
    }

    public AsalariadoComision(int cod, String nom, String ape, Date fec, char sex, String est, double Porcentaje, double VentasBrutas, double SalarioBase) {
        super(cod, nom, ape, fec, sex, est, Porcentaje, VentasBrutas);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public double CalcularSueldo() {
        return SalarioBase + (SalarioBase * 0.10) + super.CalcularSueldo();
    }

    public void ImprimirAC() {
        StringBuilder ImprimirAC = new StringBuilder();
        ImprimirAC.append(Imprimir()).append("\n").append("Sueldo a cobrar: $").append(CalcularSueldo());
        JOptionPane.showMessageDialog(null, ImprimirAC);
    }
}
