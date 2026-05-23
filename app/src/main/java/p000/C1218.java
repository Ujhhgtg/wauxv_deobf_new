package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1218 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2708 f4397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Executor f4398;

    public C1218(C2708 c2708, Executor executor) {
        this.f4397 = c2708;
        this.f4398 = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1218) {
            return this.f4397.equals(((C1218) obj).f4397);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4397.hashCode();
    }
}
