package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1445 implements Cloneable {

    public C2102 f5113;

    public final boolean equals(Object obj) {
        return (obj instanceof C1445) && m3141(obj);
    }

    public final int hashCode() {
        return m3142();
    }

    public final C1445 clone() {
        try {
            return (C1445) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean m3141(Object obj) {
        if (obj instanceof C1445) {
            return AbstractC3522.m5105(this.f5113, ((C1445) obj).f5113);
        }
        return false;
    }

    public final int m3142() {
        C2102 c2102 = this.f5113;
        if (c2102 != null) {
            return c2102.hashCode();
        }
        return 0;
    }
}
