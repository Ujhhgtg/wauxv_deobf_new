package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲀᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3024 {
    public static final C3023 Companion = new C3023();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9658;

    public /* synthetic */ C3024(int i, String str) {
        if (1 == (i & 1)) {
            this.f9658 = str;
        } else {
            AbstractC2234.m4187(i, 1, C3022.f9657.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3024) && AbstractC1469.m3322(this.f9658, ((C3024) obj).f9658);
    }

    public final int hashCode() {
        String str = this.f9658;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderMediaProto(url=");
        return AbstractC1095.m2801(sb, this.f9658, ')');
    }
}
