package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲈᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0597 extends AbstractC0595 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f2410 = 0;

    static {
        new C0597();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0597)) {
            return false;
        }
        char c = this.f2404;
        return (AbstractC2207.m4089(1, c) > 0 && AbstractC2207.m4089(1, ((C0597) obj).f2404) > 0) || c == ((C0597) obj).f2404;
    }

    public final int hashCode() {
        char c = this.f2404;
        if (AbstractC2207.m4089(1, c) > 0) {
            return -1;
        }
        return 31 + c;
    }

    public final String toString() {
        return "\u0001.." + this.f2404;
    }
}
