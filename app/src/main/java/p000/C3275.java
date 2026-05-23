package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᤝᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3275 {
    public static final C3274 Companion = new C3274();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10404;

    public /* synthetic */ C3275(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10404 = num;
        } else {
            AbstractC1270.m2997(i, 1, C3273.f10403.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3275) && AbstractC2207.m4087(this.f10404, ((C3275) obj).f10404);
    }

    public final int hashCode() {
        Integer num = this.f10404;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("t90Proto(d=");
        return AbstractC2668.m4677(sb, this.f10404, ')');
    }
}
