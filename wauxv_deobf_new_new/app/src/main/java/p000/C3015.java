package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᤞᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3015 {
    public static final C3014 Companion = new C3014();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9624;

    public /* synthetic */ C3015(int i, String str) {
        if (1 == (i & 1)) {
            this.f9624 = str;
        } else {
            AbstractC2234.m4187(i, 1, C3013.f9623.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3015) && AbstractC1469.m3322(this.f9624, ((C3015) obj).f9624);
    }

    public final int hashCode() {
        String str = this.f9624;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderContactProto(username=");
        return AbstractC1095.m2801(sb, this.f9624, ')');
    }
}
