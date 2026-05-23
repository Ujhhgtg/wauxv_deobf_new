package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᛸᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3387 {
    public static final C3386 Companion = new C3386();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10665 = {AbstractC1458.m3163(new C3369(1)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3155 f10667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10669;

    public /* synthetic */ C3387(int i, List list, C3155 c3155, Integer num, String str) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3385.f10664.mo1363());
            throw null;
        }
        this.f10666 = list;
        this.f10667 = c3155;
        this.f10668 = num;
        this.f10669 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3387)) {
            return false;
        }
        C3387 c3387 = (C3387) obj;
        return AbstractC2207.m4087(this.f10666, c3387.f10666) && AbstractC2207.m4087(this.f10667, c3387.f10667) && AbstractC2207.m4087(this.f10668, c3387.f10668) && AbstractC2207.m4087(this.f10669, c3387.f10669);
    }

    public final int hashCode() {
        List list = this.f10666;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C3155 c3155 = this.f10667;
        int iHashCode2 = (iHashCode + (c3155 == null ? 0 : c3155.hashCode())) * 31;
        Integer num = this.f10668;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10669;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ze1Proto(cdnTransInfo=");
        sb.append(this.f10666);
        sb.append(", anchor_video_params=");
        sb.append(this.f10667);
        sb.append(", audience_cdn_quality_cfg=");
        sb.append(this.f10668);
        sb.append(", audience_cdn_url=");
        return AbstractC1194.m2786(sb, this.f10669, ')');
    }
}
