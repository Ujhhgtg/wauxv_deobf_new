package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲀᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3265 {
    public static final C3264 Companion = new C3264();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3277 f10396;

    public /* synthetic */ C3265(int i, C3277 c3277) {
        if (1 == (i & 1)) {
            this.f10396 = c3277;
        } else {
            AbstractC2234.m4187(i, 1, C3263.f10395.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3265) && AbstractC1469.m3322(this.f10396, ((C3265) obj).f10396);
    }

    public final int hashCode() {
        C3277 c3277 = this.f10396;
        if (c3277 == null) {
            return 0;
        }
        return c3277.hashCode();
    }

    public final String toString() {
        return "ok1Proto(preload_infos=" + this.f10396 + ')';
    }
}
