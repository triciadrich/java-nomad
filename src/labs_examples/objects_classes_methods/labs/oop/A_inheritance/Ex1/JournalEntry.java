package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex1;

import java.util.Date;

public class JournalEntry extends Mood {
    protected String entry;
    protected String location;

    public JournalEntry(String moodType, int level, Date date, String entry, String location) {
        super(moodType, level, date);
        this.entry = entry;
        this.location = location;
    }
    //getters and setters
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setMoodType(String moodType) {
        this.moodType = moodType;
    }

    @Override
    public Person increaseMoodLevel(Person person, int amount) {
        return super.increaseMoodLevel(person, amount);
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
                "entry='" + entry + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
