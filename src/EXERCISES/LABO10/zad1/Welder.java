package EXERCISES.LABO10.zad1;

public class Welder extends Person {

    private int jobSeniotrity;

    public Welder(String name, int jobSeniotrity) {
        super(name);
        this.jobSeniotrity = jobSeniotrity;
    }

    public String getString() {
        return super.getString() + ", staz: " + this.jobSeniotrity;
    }
}
