package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628 extends AbstractC1675 {

    public int f5505 = -1;

    public final int m3345() {
        int i = this.f5505;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    public final String m3346() {
        return "[" + Integer.toHexString(this.f5505) + ']';
    }

    public final void m3347(int i) {
        if (this.f5505 != -1) {
            throw new RuntimeException("index already set");
        }
        this.f5505 = i;
    }
}
