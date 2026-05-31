package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᛸᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3394 {
    public static final C3393 Companion = new C3393();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10706;

    public /* synthetic */ C3394(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3392.f10704.mo1509());
            throw null;
        }
        this.f10705 = str;
        this.f10706 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3394)) {
            return false;
        }
        C3394 c3394 = (C3394) obj;
        return AbstractC1469.m3322(this.f10705, c3394.f10705) && AbstractC1469.m3322(this.f10706, c3394.f10706);
    }

    public final int hashCode() {
        String str = this.f10705;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10706;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("w90Proto(dynamic_voice_live_img_url=");
        sb.append(this.f10705);
        sb.append(", static_voice_img_url=");
        return AbstractC1095.m2801(sb, this.f10706, ')');
    }
}
