package injection;

public class InjectReference {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
