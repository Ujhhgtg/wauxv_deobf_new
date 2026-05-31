package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᛸᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1281 {
    public static final C1280 Companion = new C1280();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f4686;

    public /* synthetic */ C1281(int i, String str) {
        if (1 == (i & 1)) {
            this.f4686 = str;
        } else {
            AbstractC2234.m4187(i, 1, C1279.f4685.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1281) && AbstractC1469.m3322(this.f4686, ((C1281) obj).f4686);
    }

    public final int hashCode() {
        return this.f4686.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatInfoProto(senderId=");
        return AbstractC1095.m2801(sb, this.f4686, ')');
    }
}
