public class Chap7Route extends Chap7Climb {
    private final String grade;
    private final Chap7Area<Chap7Route> area;

    @Override
    public String getTypeDescription() {return "Route";}


    public Chap7Route(String name, String grade, Chap7Area<Chap7Route> area) {
        super(name);
        this.grade = grade;
        this.area = area;
        area.addToMemberEntries(this);
    }

    /**
     * @return
     */
    @Override
    public String getGrade() {
        return "5." + grade;
    }

    @Override
    public String toString() {
        return "Route " + name + ", grade: " + getGrade();
    }


}
