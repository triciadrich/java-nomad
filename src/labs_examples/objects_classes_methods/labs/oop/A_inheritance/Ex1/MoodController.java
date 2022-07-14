package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex1;

import java.util.Date;

public class MoodController {
    public static void main(String[] args) {
        Person thisPerson = new Person("Depressed",10,new Date(), "Tricia", 41);
        thisPerson.increaseMoodLevel(thisPerson,10);
        System.out.println(thisPerson);
        JournalEntry entry1 = new JournalEntry("Depressed", 10,new Date(),"Had a hard time getting motivated","Home");
        System.out.println(entry1);
        entry1.setLevel(15);
        entry1.increaseMoodLevel(thisPerson,2);
        System.out.println(thisPerson);

    }
}
