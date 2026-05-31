package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3446 {
    public static final C3445 Companion = new C3445();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10832 = {AbstractC2240.m4259(new C3413(3)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3214 f10834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10836;

    public /* synthetic */ C3446(int i, List list, C3214 c3214, Integer num, String str) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3444.f10831.mo1509());
            throw null;
        }
        this.f10833 = list;
        this.f10834 = c3214;
        this.f10835 = num;
        this.f10836 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3446)) {
            return false;
        }
        C3446 c3446 = (C3446) obj;
        return AbstractC1469.m3322(this.f10833, c3446.f10833) && AbstractC1469.m3322(this.f10834, c3446.f10834) && AbstractC1469.m3322(this.f10835, c3446.f10835) && AbstractC1469.m3322(this.f10836, c3446.f10836);
    }

    public final int hashCode() {
        List list = this.f10833;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C3214 c3214 = this.f10834;
        int iHashCode2 = (iHashCode + (c3214 == null ? 0 : c3214.hashCode())) * 31;
        Integer num = this.f10835;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10836;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ze1Proto(cdnTransInfo=");
        sb.append(this.f10833);
        sb.append(", anchor_video_params=");
        sb.append(this.f10834);
        sb.append(", audience_cdn_quality_cfg=");
        sb.append(this.f10835);
        sb.append(", audience_cdn_url=");
        return AbstractC1095.m2801(sb, this.f10836, ')');
    }
}
