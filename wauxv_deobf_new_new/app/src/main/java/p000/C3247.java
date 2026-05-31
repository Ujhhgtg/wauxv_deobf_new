package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲈᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3247 {
    public static final C3246 Companion = new C3246();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10359;

    public /* synthetic */ C3247(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10359 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3245.f10358.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3247) && AbstractC1469.m3322(this.f10359, ((C3247) obj).f10359);
    }

    public final int hashCode() {
        Integer num = this.f10359;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nl1Proto(screen_orientation=");
        return AbstractC2647.m4623(sb, this.f10359, ')');
    }
}
