package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1234 implements Runnable, Comparable, InterfaceC1085 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f4455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f4456;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4455 - ((AbstractRunnableC1234) obj).f4455;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4455 + ']';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2988(long j, C1235 c1235, AbstractC1236 abstractC1236) {
        synchronized (this) {
            if (this._heap == C1787.f5941) {
                return 2;
            }
            synchronized (c1235) {
                try {
                    AbstractRunnableC1234[] abstractRunnableC1234Arr = c1235.f9544;
                    AbstractRunnableC1234 abstractRunnableC1234 = abstractRunnableC1234Arr != null ? abstractRunnableC1234Arr[0] : null;
                    if (AbstractC1236.f4460.get(abstractC1236) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC1234 == null) {
                        c1235.f4457 = j;
                    } else {
                        long j2 = abstractRunnableC1234.f4455;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c1235.f4457 > 0) {
                            c1235.f4457 = j;
                        }
                    }
                    long j3 = this.f4455;
                    long j4 = c1235.f4457;
                    if (j3 - j4 < 0) {
                        this.f4455 = j4;
                    }
                    c1235.m4984(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2989(C1235 c1235) {
        if (this._heap == C1787.f5941) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c1235;
    }

    @Override // p000.InterfaceC1085
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2774() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1174 c1174 = C1787.f5941;
                if (obj == c1174) {
                    return;
                }
                C1235 c1235 = obj instanceof C1235 ? (C1235) obj : null;
                if (c1235 != null) {
                    synchronized (c1235) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C2980 ? (C2980) obj2 : null) != null) {
                            c1235.m4985(this.f4456);
                        }
                    }
                }
                this._heap = c1174;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
