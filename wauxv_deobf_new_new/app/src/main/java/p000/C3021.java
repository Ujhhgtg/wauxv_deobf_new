package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲀᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3021 {
    public static final C3020 Companion = new C3020();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9656;

    public /* synthetic */ C3021(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f9656 = num;
        } else {
            AbstractC2234.m4187(i, 1, C3019.f9655.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3021) && AbstractC1469.m3322(this.f9656, ((C3021) obj).f9656);
    }

    public final int hashCode() {
        Integer num = this.f9656;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderJumpInfoProto(jumpinfo_type=");
        return AbstractC2647.m4623(sb, this.f9656, ')');
    }
}
