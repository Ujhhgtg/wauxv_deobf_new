package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲈᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3364 {
    public static final C3363 Companion = new C3363();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10662;

    public /* synthetic */ C3364(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10662 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3362.f10661.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3364) && AbstractC1469.m3322(this.f10662, ((C3364) obj).f10662);
    }

    public final int hashCode() {
        Integer num = this.f10662;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("vc1Proto(number=");
        return AbstractC2647.m4623(sb, this.f10662, ')');
    }
}
