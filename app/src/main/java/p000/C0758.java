package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0758 {

    public final Object f2854;

    public final C0555 f2855;

    public final InterfaceC1430 f2856;

    public final Object f2857;

    public final Throwable f2858;

    public C0758(Object obj, C0555 c0555, InterfaceC1430 interfaceC1430, Object obj2, Throwable th) {
        this.f2854 = obj;
        this.f2855 = c0555;
        this.f2856 = interfaceC1430;
        this.f2857 = obj2;
        this.f2858 = th;
    }

    public static C0758 m2227(C0758 c0758, C0555 c0555, Throwable th, int i) {
        Object obj = c0758.f2854;
        if ((i & 2) != 0) {
            c0555 = c0758.f2855;
        }
        C0555 c0556 = c0555;
        InterfaceC1430 interfaceC1430 = c0758.f2856;
        Object obj2 = c0758.f2857;
        if ((i & 16) != 0) {
            th = c0758.f2858;
        }
        return new C0758(obj, c0556, interfaceC1430, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758)) {
            return false;
        }
        C0758 c0758 = (C0758) obj;
        return AbstractC2207.m4087(this.f2854, c0758.f2854) && AbstractC2207.m4087(this.f2855, c0758.f2855) && AbstractC2207.m4087(this.f2856, c0758.f2856) && AbstractC2207.m4087(this.f2857, c0758.f2857) && AbstractC2207.m4087(this.f2858, c0758.f2858);
    }

    public final int hashCode() {
        Object obj = this.f2854;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0555 c0555 = this.f2855;
        int iHashCode2 = (iHashCode + (c0555 == null ? 0 : c0555.hashCode())) * 31;
        InterfaceC1430 interfaceC1430 = this.f2856;
        int iHashCode3 = (iHashCode2 + (interfaceC1430 == null ? 0 : interfaceC1430.hashCode())) * 31;
        Object obj2 = this.f2857;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2858;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2854 + ", cancelHandler=" + this.f2855 + ", onCancellation=" + this.f2856 + ", idempotentResume=" + this.f2857 + ", cancelCause=" + this.f2858 + ')';
    }

    public /* synthetic */ C0758(Object obj, C0555 c0555, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c0555, null, null, (i & 16) != 0 ? null : th);
    }
}
