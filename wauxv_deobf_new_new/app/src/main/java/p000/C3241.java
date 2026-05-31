package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲇᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3241 {
    public static final C3240 Companion = new C3240();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10350;

    public /* synthetic */ C3241(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10350 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3239.f10349.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3241) && AbstractC1469.m3322(this.f10350, ((C3241) obj).f10350);
    }

    public final int hashCode() {
        Integer num = this.f10350;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ni1Proto(audience_no_privilege=");
        return AbstractC2647.m4623(sb, this.f10350, ')');
    }
}
