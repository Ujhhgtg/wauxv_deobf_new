package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3206 {
    public static final C3205 Companion = new C3205();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3218 f10229;

    public /* synthetic */ C3206(int i, C3218 c3218) {
        if (1 == (i & 1)) {
            this.f10229 = c3218;
        } else {
            AbstractC1270.m2997(i, 1, C3204.f10228.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3206) && AbstractC2207.m4087(this.f10229, ((C3206) obj).f10229);
    }

    public final int hashCode() {
        C3218 c3218 = this.f10229;
        if (c3218 == null) {
            return 0;
        }
        return c3218.hashCode();
    }

    public final String toString() {
        return "ok1Proto(preload_infos=" + this.f10229 + ')';
    }
}
