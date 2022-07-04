package labs_examples.objects_classes_methods.labs.objects.Ex3;

public class Ex3Controller {
    public static void main(String[] args) {
        Person tricia = new Person("Tricia", 41);
        Computer tablet = new Computer("tablet", 2012, "Microsoft");
        System.out.println(tricia.getName() + " owns a " + tablet.getType());

    }
}
