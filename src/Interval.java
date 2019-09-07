import java.math.BigInteger;

public class Interval {
    private BigInteger a;
    private BigInteger b;

    private boolean marked;

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public BigInteger getA() {
        return a;
    }

    public void setA(BigInteger a) {
        this.a = a;
    }

    public BigInteger getB() {
        return b;
    }

    public void setB(BigInteger b) {
        this.b = b;
    }

    public Interval(BigInteger _a, BigInteger _b)
    {
        a = _a;
        b = _b;

        marked = false;
    }
}
