package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲈᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3188 {
    public static final C3187 Companion = new C3187();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10192;

    public /* synthetic */ C3188(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10192 = num;
        } else {
            AbstractC1270.m2997(i, 1, C3186.f10191.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3188) && AbstractC2207.m4087(this.f10192, ((C3188) obj).f10192);
    }

    public final int hashCode() {
        Integer num = this.f10192;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nl1Proto(screen_orientation=");
        return AbstractC2668.m4677(sb, this.f10192, ')');
    }
}
