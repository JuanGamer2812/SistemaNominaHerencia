package Entidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Juan
 * @version 1.0
 * @created 17-may.-2024 10:02:38
 */
public class Persona {

    private int Codigo;
    private String Nombre;
    private String Apellido;
    private Date FechaNaci;
    private char Sexo;
    private String Estado;

    public Persona() {

    }

    public Persona(int cod, String nom, String ape, Date fec, char sex, String est) {
        this.Codigo = cod;
        this.Nombre = nom;
        this.Apellido = ape;
        this.FechaNaci = fec;
        this.Sexo = sex;
        this.Estado = est;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int newVal) {
        Codigo = newVal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String newVal) {
        Nombre = newVal;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String newVal) {
        Apellido = newVal;
    }

    public Date getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(Date newVal) {
        FechaNaci = newVal;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char newVal) {
        Sexo = newVal;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String newVal) {
        Estado = newVal;
    }

    public int CalcularEdad() {
        int edad;
        LocalDate fecnac = FechaNaci.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechactual = LocalDate.now();
        edad = Period.between(fecnac, fechactual).getYears();
        return edad;
    }

    public String Edad() {
        int edad, meses, dias;
        String edadcompleta = "";
        LocalDate fecnac = FechaNaci.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechactual = LocalDate.now();
        edad = Period.between(fecnac, fechactual).getYears();
        meses = Period.between(fecnac, fechactual).getMonths();
        dias = Period.between(fecnac, fechactual).getDays();
        edadcompleta = edad + " años, " + meses + " meses, " + dias + " días";
        return edadcompleta;
    }

    public String SignoZodiacal() {
        LocalDate fechaNaciLocal = FechaNaci.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int dia = fechaNaciLocal.getDayOfMonth();
        int mes = fechaNaciLocal.getMonthValue();

        String signo = "";
        if (mes == 1) {
            signo = (dia <= 19) ? "Capricornio" : "Acuario";
        } else if (mes == 2) {
            signo = (dia <= 18) ? "Acuario" : "Piscis";
        } else if (mes == 3) {
            signo = (dia <= 20) ? "Piscis" : "Aries";
        } else if (mes == 4) {
            signo = (dia <= 19) ? "Aries" : "Tauro";
        } else if (mes == 5) {
            signo = (dia <= 20) ? "Tauro" : "Géminis";
        } else if (mes == 6) {
            signo = (dia <= 20) ? "Géminis" : "Cáncer";
        } else if (mes == 7) {
            signo = (dia <= 22) ? "Cáncer" : "Leo";
        } else if (mes == 8) {
            signo = (dia <= 22) ? "Leo" : "Virgo";
        } else if (mes == 9) {
            signo = (dia <= 22) ? "Virgo" : "Libra";
        } else if (mes == 10) {
            signo = (dia <= 22) ? "Libra" : "Escorpio";
        } else if (mes == 11) {
            signo = (dia <= 21) ? "Escorpio" : "Sagitario";
        } else if (mes == 12) {
            signo = (dia <= 21) ? "Sagitario" : "Capricornio";
        }
        return signo;
    }

    public String Imprimir() {
        return "Código: " + Codigo + "\n"
                + "Nombres: " + Nombre + "\n"
                + "Apellidos: " + Apellido + "\n"
                + "Edad: " + CalcularEdad() + "\n"
                + "Edad Completa: " + Edad() + "\n"
                + "Signo Zodiacal: " + SignoZodiacal() + "\n"
                + "Sexo: " + Sexo + "\n"
                + "Estado: " + Estado;
    }
}
