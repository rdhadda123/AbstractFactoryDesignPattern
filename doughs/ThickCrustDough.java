package doughs;

public class ThickCrustDough extends Dough {
    public ThickCrustDough createDough() {
        System.out.println("Rolling out some ThickCrust Dough");

        return new ThickCrustDough();
    }
}
