package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲈᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3268 {
    public static final C3267 Companion = new C3267();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10398;

    public /* synthetic */ C3268(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10398 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3266.f10397.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3268) && AbstractC1469.m3322(this.f10398, ((C3268) obj).f10398);
    }

    public final int hashCode() {
        Integer num = this.f10398;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ol1Proto(audienceMode=");
        return AbstractC2647.m4623(sb, this.f10398, ')');
    }
}
