package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᤝᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0755 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f2854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0532 f2855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1438 f2856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f2857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Throwable f2858;

    public C0755(Object obj, C0532 c0532, InterfaceC1438 interfaceC1438, Object obj2, Throwable th) {
        this.f2854 = obj;
        this.f2855 = c0532;
        this.f2856 = interfaceC1438;
        this.f2857 = obj2;
        this.f2858 = th;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0755 m2328(C0755 c0755, C0532 c0532, Throwable th, int i) {
        Object obj = c0755.f2854;
        if ((i & 2) != 0) {
            c0532 = c0755.f2855;
        }
        C0532 c0533 = c0532;
        InterfaceC1438 interfaceC1438 = c0755.f2856;
        Object obj2 = c0755.f2857;
        if ((i & 16) != 0) {
            th = c0755.f2858;
        }
        return new C0755(obj, c0533, interfaceC1438, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0755)) {
            return false;
        }
        C0755 c0755 = (C0755) obj;
        return AbstractC1469.m3322(this.f2854, c0755.f2854) && AbstractC1469.m3322(this.f2855, c0755.f2855) && AbstractC1469.m3322(this.f2856, c0755.f2856) && AbstractC1469.m3322(this.f2857, c0755.f2857) && AbstractC1469.m3322(this.f2858, c0755.f2858);
    }

    public final int hashCode() {
        Object obj = this.f2854;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0532 c0532 = this.f2855;
        int iHashCode2 = (iHashCode + (c0532 == null ? 0 : c0532.hashCode())) * 31;
        InterfaceC1438 interfaceC1438 = this.f2856;
        int iHashCode3 = (iHashCode2 + (interfaceC1438 == null ? 0 : interfaceC1438.hashCode())) * 31;
        Object obj2 = this.f2857;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2858;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2854 + ", cancelHandler=" + this.f2855 + ", onCancellation=" + this.f2856 + ", idempotentResume=" + this.f2857 + ", cancelCause=" + this.f2858 + ')';
    }

    public /* synthetic */ C0755(Object obj, C0532 c0532, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c0532, null, null, (i & 16) != 0 ? null : th);
    }
}
