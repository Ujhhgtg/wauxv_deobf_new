package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3750 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3745 f11742;

    public C3750(C3745 c3745) {
        this.f11742 = c3745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3750) && AbstractC1469.m3322(this.f11742, ((C3750) obj).f11742);
    }

    public final int hashCode() {
        C3745 c3745 = this.f11742;
        if (c3745 == null) {
            return 0;
        }
        return c3745.hashCode();
    }

    public final String toString() {
        return "YukiHookResult(hookedMember=" + this.f11742 + ")";
    }
}
