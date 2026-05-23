package p000;

import java.util.Collection;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2643 {

    public final String f8533;

    public final C1023 f8534;

    public final int f8535;

    public int f8536;

    public boolean f8537;

    public AbstractC2643(String str, C1023 c1023, int i) {
        if (c1023 == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f8533 = str;
        this.f8534 = c1023;
        this.f8535 = i;
        this.f8536 = -1;
        this.f8537 = false;
    }

    public abstract int mo3850(AbstractC1675 abstractC1675);

    public final int m4635() {
        int i = this.f8536;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    public abstract Collection mo1923();

    public final void m4636() {
        m4638();
        mo3851();
        this.f8537 = true;
    }

    public abstract void mo3851();

    public final void m4637() {
        if (!this.f8537) {
            throw new RuntimeException("not prepared");
        }
    }

    public final void m4638() {
        if (this.f8537) {
            throw new RuntimeException("already prepared");
        }
    }

    public abstract int mo3852();

    public final void m4639(C0519 c0519) {
        m4637();
        c0519.m1830(this.f8535);
        int i = c0519.f2196;
        int i2 = this.f8536;
        if (i2 < 0) {
            this.f8536 = i;
        } else if (i2 != i) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + i + ", but expected " + this.f8536);
        }
        if (c0519.m1833()) {
            String str = this.f8533;
            if (str != null) {
                c0519.m1831(0, "\n" + str + ":");
            } else if (i != 0) {
                c0519.m1831(0, "\n");
            }
        }
        mo3853(c0519);
    }

    public abstract void mo3853(C0519 c0519);
}
