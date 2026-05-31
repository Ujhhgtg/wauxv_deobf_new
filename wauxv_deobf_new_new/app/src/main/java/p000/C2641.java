package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2641 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Throwable f8344;

    public C2641(Throwable th) {
        this.f8344 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2641) {
            return AbstractC1469.m3322(this.f8344, ((C2641) obj).f8344);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8344.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8344 + ')';
    }
}
