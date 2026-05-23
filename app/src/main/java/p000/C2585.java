package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2585 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Throwable f8191;

    public C2585(Throwable th) {
        this.f8191 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2585) {
            return AbstractC2207.m4087(this.f8191, ((C2585) obj).f8191);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8191.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8191 + ')';
    }
}
