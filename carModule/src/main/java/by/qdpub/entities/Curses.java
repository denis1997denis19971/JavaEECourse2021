package by.qdpub.entities;

import java.util.Objects;

public class Curses {

    public int Cur_ID;
    public String Date;
    public String Cur_Abbreviation;
    public int Cur_Scale;
    public String Cur_Name;
    public float Cur_OfficialRate;

    public Curses() {

    }

    public Curses(int cur_ID, String date, String cur_Abbreviation, int cur_Scale, String cur_Name, float cur_OfficialRate) {
        this.Cur_ID = cur_ID;
        this.Date = date;
        this.Cur_Abbreviation = cur_Abbreviation;
        this.Cur_Scale = cur_Scale;
        this.Cur_Name = cur_Name;
        this.Cur_OfficialRate = cur_OfficialRate;
    }

    public Curses(String date, String cur_Abbreviation, int cur_Scale, String cur_Name, float cur_OfficialRate) {
        this.Date = date;
        this.Cur_Abbreviation = cur_Abbreviation;
        this.Cur_Scale = cur_Scale;
        this.Cur_Name = cur_Name;
        this.Cur_OfficialRate = cur_OfficialRate;
    }

    public int getCur_ID() {
        return Cur_ID;
    }

    public void setCur_ID(int cur_ID) {
        this.Cur_ID = cur_ID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        this.Cur_Abbreviation = cur_Abbreviation;
    }

    public int getCur_Scale() {
        return Cur_Scale;
    }

    public void setCur_Scale(int cur_Scale) {
        this.Cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return Cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        this.Cur_Name = cur_Name;
    }

    public double getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

    public void setCur_OfficialRate(float cur_OfficialRate) {
        this.Cur_OfficialRate = cur_OfficialRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curses curses = (Curses) o;
        return Cur_ID == curses.Cur_ID &&
                Cur_Scale == curses.Cur_Scale &&
                Double.compare(curses.Cur_OfficialRate, Cur_OfficialRate) == 0 &&
                Objects.equals(Date, curses.Date) &&
                Objects.equals(Cur_Abbreviation, curses.Cur_Abbreviation) &&
                Objects.equals(Cur_Name, curses.Cur_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cur_ID, Date, Cur_Abbreviation, Cur_Scale, Cur_Name, Cur_OfficialRate);
    }

    @Override
    public String toString() {
        return "Curses{" +
                "Cur_ID=" + Cur_ID +
                ", Date='" + Date + '\'' +
                ", Cur_Abbreviation='" + Cur_Abbreviation + '\'' +
                ", Cur_Scale=" + Cur_Scale +
                ", Cur_Name='" + Cur_Name + '\'' +
                ", Cur_OfficialRate=" + Cur_OfficialRate +
                '}';
    }
}
