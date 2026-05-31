package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲈᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0578 extends AbstractC0576 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f2376 = 0;

    static {
        new C0578();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0578)) {
            return false;
        }
        char c = this.f2370;
        return (AbstractC1469.m3327(1, c) > 0 && AbstractC1469.m3327(1, ((C0578) obj).f2370) > 0) || c == ((C0578) obj).f2370;
    }

    public final int hashCode() {
        char c = this.f2370;
        if (AbstractC1469.m3327(1, c) > 0) {
            return -1;
        }
        return 31 + c;
    }

    public final String toString() {
        return "\u0001.." + this.f2370;
    }
}
