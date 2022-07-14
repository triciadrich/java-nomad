package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex1;

import java.util.Date;

public class Mood {
    protected String moodType;
    protected int level;
    protected Date date;

    public Mood(String moodType, int level, Date date) {
        this.moodType = moodType;
        this.level = level;
        this.date = date;
    }

    public String getMoodType() {
        return moodType;
    }

    public void setMoodType(String moodType) {
        this.moodType = moodType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mood{" +
                "moodType='" + moodType + '\'' +
                ", level='" + level + '\'' +
                ", date=" + date +
                '}';
    }


    public Person increaseMoodLevel(Person person, int amount){
        person.level += amount;
        return person;
    }
}
