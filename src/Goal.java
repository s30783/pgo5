public class Goal {
    String name;
    double bonus;
    int yy;
    int mm;
    int dd;

    public Goal(int yy, int mm, int dd, String name, double bonus) {
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
        this.name = name;
        this.bonus = bonus;
    }

    public boolean isAchieved() {
        return true;
    }

    public double getBonus() {
        return bonus;
    }
}