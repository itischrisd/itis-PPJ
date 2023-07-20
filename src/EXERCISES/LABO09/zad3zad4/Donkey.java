package EXERCISES.LABO09.zad3zad4;

public class Donkey {
    private Balloon[] balloons = new Balloon[0];
    private double mass = (int) (1 + Math.random() * 5);

    public void addBalloon(Balloon balloon) {
        Balloon[] tmp = new Balloon[this.balloons.length + 1];

        for (int i = 0; i < balloons.length; i++)
            tmp[i] = balloons[i];

        tmp[balloons.length] = balloon;

        this.balloons = tmp;
    }

    public boolean isFlying() {
        double liftForce = 0;

        for (int i = 0; i < balloons.length; i++) {
            liftForce += balloons[i].getLoad();
        }

        return liftForce * 1000 > this.mass;
    }
}
