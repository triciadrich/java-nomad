package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex1;

import java.util.Date;

public class Weather extends JournalEntry{
    protected int temp;
    protected String sky;
    protected boolean rain;
    protected boolean stormy;
    protected boolean snow;

    public Weather(String moodType, int level, Date date, String entry, String location, int temp, String sky, boolean rain, boolean stormy, boolean snow) {
        super(moodType, level, date, entry, location);
        this.temp = temp;
        this.sky = sky;
        this.rain = rain;
        this.stormy = stormy;
        this.snow = snow;
    }
    //getters and setters
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }

    public boolean isStormy() {
        return stormy;
    }

    public void setStormy(boolean stormy) {
        this.stormy = stormy;
    }

    public boolean isSnow() {
        return snow;
    }

    public void setSnow(boolean snow) {
        this.snow = snow;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", sky='" + sky + '\'' +
                ", rain=" + rain +
                ", stormy=" + stormy +
                ", snow=" + snow +
                '}';
    }
}
