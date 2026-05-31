package p000;

import java.util.Arrays;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1496 {
    public static final C1495 Companion = new C1495();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f5291 = {null, null, null, null, AbstractC2240.m4259(new C1356(5))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f5296;

    public /* synthetic */ C1496(int i, String str, int i2, String str2, boolean z, String[] strArr) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C1494.f5290.mo1509());
            throw null;
        }
        this.f5292 = str;
        this.f5293 = i2;
        this.f5294 = str2;
        this.f5295 = z;
        this.f5296 = strArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1496 m3419(C1496 c1496, int i, String str, int i2) {
        String str2 = c1496.f5292;
        if ((i2 & 2) != 0) {
            i = c1496.f5293;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = c1496.f5294;
        }
        boolean z = c1496.f5295;
        String[] strArr = c1496.f5296;
        c1496.getClass();
        return new C1496(str2, i3, str, z, strArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1496)) {
            return false;
        }
        C1496 c1496 = (C1496) obj;
        return AbstractC1469.m3322(this.f5292, c1496.f5292) && this.f5293 == c1496.f5293 && AbstractC1469.m3322(this.f5294, c1496.f5294) && this.f5295 == c1496.f5295 && AbstractC1469.m3322(this.f5296, c1496.f5296);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.f5295) + AbstractC2647.m4621((Integer.hashCode(this.f5293) + (this.f5292.hashCode() * 31)) * 31, 31, this.f5294)) * 31) + Arrays.hashCode(this.f5296);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("GroupItem(type=");
        sb.append(this.f5292);
        sb.append(", order=");
        sb.append(this.f5293);
        sb.append(", title=");
        sb.append(this.f5294);
        sb.append(", enable=");
        sb.append(this.f5295);
        sb.append(", idList=");
        return AbstractC1095.m2801(sb, Arrays.toString(this.f5296), ')');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m3420() {
        EnumC1497 enumC1497M3421 = m3421();
        if (enumC1497M3421 != EnumC1497.f5303) {
            return enumC1497M3421.f5307;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append(" where (username in ");
        sb.append(AbstractC0280.m1533(this.f5296, null, "(", ")", new C1493(0), 25));
        sb.append(") order by flag desc");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final EnumC1497 m3421() {
        Object next;
        String str;
        String lowerCase;
        EnumC1497.f5297.getClass();
        C1227 c1227 = EnumC1497.f5305;
        c1227.getClass();
        C0067 c0067 = new C0067(c1227, 0);
        do {
            if (!c0067.hasNext()) {
                next = null;
                break;
            }
            next = c0067.next();
            str = ((EnumC1497) next).f5306;
            lowerCase = this.f5292.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
        } while (!AbstractC1469.m3322(str, lowerCase));
        EnumC1497 enumC1497 = (EnumC1497) next;
        return enumC1497 != null ? enumC1497 : EnumC1497.f5303;
    }

    public C1496(String str, int i, String str2, boolean z, String[] strArr) {
        this.f5292 = str;
        this.f5293 = i;
        this.f5294 = str2;
        this.f5295 = z;
        this.f5296 = strArr;
    }
}
