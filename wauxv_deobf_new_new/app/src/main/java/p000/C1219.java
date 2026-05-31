package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2769 f4394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Executor f4395;

    public C1219(C2769 c2769, Executor executor) {
        this.f4394 = c2769;
        this.f4395 = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1219) {
            return this.f4394.equals(((C1219) obj).f4394);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4394.hashCode();
    }
}
