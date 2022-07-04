package labs_examples.objects_classes_methods.labs.objects.ex1;

public class Wings {

    private String wingType;
    private int wingSpan;

    public Wings(String wingType, int wingSpan) {
        this.wingType = wingType;
        this.wingSpan = wingSpan;
    }

    public String getWingType() {
        return wingType;
    }

    public void setWingType(String wingType) {
        this.wingType = wingType;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "wingType='" + wingType + '\'' +
                ", wingSpan=" + wingSpan +
                '}';
    }
}
