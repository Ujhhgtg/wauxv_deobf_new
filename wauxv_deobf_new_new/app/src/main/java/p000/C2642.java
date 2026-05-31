package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲈᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2642 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f8345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Throwable m4616(Object obj) {
        if (obj instanceof C2641) {
            return ((C2641) obj).f8344;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2642) {
            return AbstractC1469.m3322(this.f8345, ((C2642) obj).f8345);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8345;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8345;
        if (obj instanceof C2641) {
            return ((C2641) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
