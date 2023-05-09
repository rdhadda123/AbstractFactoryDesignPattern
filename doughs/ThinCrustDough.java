package doughs;

public class ThinCrustDough extends Dough {
    public ThinCrustDough createDough() {
        System.out.println("Rolling out some Thin Crust Dough");

        return new ThinCrustDough();

    }
}
