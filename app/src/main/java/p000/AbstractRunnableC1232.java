package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1232 implements Runnable, Comparable, InterfaceC1080 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f4457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4458;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4457 - ((AbstractRunnableC1232) obj).f4457;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4457 + ']';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2866(long j, C1233 c1233, AbstractC1234 abstractC1234) {
        synchronized (this) {
            if (this._heap == AbstractC2209.f7183) {
                return 2;
            }
            synchronized (c1233) {
                try {
                    AbstractRunnableC1232[] abstractRunnableC1232Arr = c1233.f9377;
                    AbstractRunnableC1232 abstractRunnableC1232 = abstractRunnableC1232Arr != null ? abstractRunnableC1232Arr[0] : null;
                    if (AbstractC1234.f4462.get(abstractC1234) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC1232 == null) {
                        c1233.f4459 = j;
                    } else {
                        long j2 = abstractRunnableC1232.f4457;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c1233.f4459 > 0) {
                            c1233.f4459 = j;
                        }
                    }
                    long j3 = this.f4457;
                    long j4 = c1233.f4459;
                    if (j3 - j4 < 0) {
                        this.f4457 = j4;
                    }
                    c1233.m4922(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2867(C1233 c1233) {
        if (this._heap == AbstractC2209.f7183) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c1233;
    }

    @Override // p000.InterfaceC1080
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2648() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1172 c1172 = AbstractC2209.f7183;
                if (obj == c1172) {
                    return;
                }
                C1233 c1233 = obj instanceof C1233 ? (C1233) obj : null;
                if (c1233 != null) {
                    synchronized (c1233) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C2921 ? (C2921) obj2 : null) != null) {
                            c1233.m4923(this.f4458);
                        }
                    }
                }
                this._heap = c1172;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
