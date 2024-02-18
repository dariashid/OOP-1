public class Hufflepuff extends HogwartsStudent{
    private int integrity;
    private int loyalty;
    private int hardwork;
    public Hufflepuff (String name, int magicPower, int transgressionDistance, int integrity, int loyalty, int hardwork) {
        super(name, magicPower, transgressionDistance);
        this.integrity = integrity;
        this.loyalty = loyalty;
        this.hardwork = hardwork;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString()+
                "integrity=" + integrity +
                ", loyalty=" + loyalty +
                ", hardwork=" + hardwork +
                '}';
    }
}
