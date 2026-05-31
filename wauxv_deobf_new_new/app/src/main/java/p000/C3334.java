package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲇᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3334 {
    public static final C3333 Companion = new C3333();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10571;

    public /* synthetic */ C3334(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10571 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3332.f10570.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3334) && AbstractC1469.m3322(this.f10571, ((C3334) obj).f10571);
    }

    public final int hashCode() {
        Integer num = this.f10571;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("t90Proto(d=");
        return AbstractC2647.m4623(sb, this.f10571, ')');
    }
}
