package EXERCISES.LABO12.zad3;

public class Rakieta {

    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = 0;
    }

    public void zatankuj() throws BoomException {
        this.wagaPaliwa += (int) (Math.random() * 100 + 1);
        if (Math.random() < 0.05)
            throw new BoomException("o matko wszyscy zginiemy! coś jest nie tak z paliwem!");
    }

    public void start() throws Exception {
        if (this.wagaPaliwa < 1000) {
            throw new Exception("start anulowany - za mało paliwa");
        } else {
            System.out.println("Rakieta wystartowała");
        }
    }
}
