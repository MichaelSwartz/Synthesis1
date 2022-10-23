public class Chap7Boulder extends Chap7Climb {
    private final int grade;

    public Chap7Boulder(String name, int grade, Chap7Area<Chap7Boulder> area) {
        super(name);
        this.grade = grade;
        area.addToMemberEntries(this);
    }

    @Override
    public String getTypeDescription() {
        return "Boulder";
    }

    /**
     * @return
     */
    @Override
    public String getGrade() {
        return "V" + grade;
    }

    @Override
    public String toString() {
        return "Boulder " + name + ", grade: " + getGrade();
    }
}
