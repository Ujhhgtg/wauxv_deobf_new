package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤞᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2993 {
    public static final C2992 Companion = new C2992();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9576;

    public /* synthetic */ C2993(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C2991.f9574.mo1509());
            throw null;
        }
        this.f9575 = num;
        this.f9576 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2993)) {
            return false;
        }
        C2993 c2993 = (C2993) obj;
        return AbstractC1469.m3322(this.f9575, c2993.f9575) && AbstractC1469.m3322(this.f9576, c2993.f9576);
    }

    public final int hashCode() {
        Integer num = this.f9575;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9576;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("AppActionSceneProto(installedActionScene=");
        sb.append(this.f9575);
        sb.append(", uninstalledActionScene=");
        return AbstractC2647.m4623(sb, this.f9576, ')');
    }
}
