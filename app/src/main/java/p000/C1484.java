package p000;

import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲁᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1484 {
    public static final C1483 Companion = new C1483();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final InterfaceC1758[] f5258 = {null, null, null, null, AbstractC1458.m3163(new C1354(4))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5260;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f5263;

    public /* synthetic */ C1484(int i, String str, int i2, String str2, boolean z, String[] strArr) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C1482.f5257.mo1363());
            throw null;
        }
        this.f5259 = str;
        this.f5260 = i2;
        this.f5261 = str2;
        this.f5262 = z;
        this.f5263 = strArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String m3242() {
        Object next;
        String str;
        String lowerCase;
        String[] strArr = AbstractC1574.f5469;
        
        C1225 c1225 = EnumC1485.f5272;
        
        C0060 c0060 = new C0060(0, c1225);
        do {
            if (!c0060.hasNext()) {
                next = null;
                break;
            }
            next = c0060.next();
            str = ((EnumC1485) next).f5273;
            lowerCase = this.f5259.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
        } while (!AbstractC2207.m4087(str, lowerCase));
        EnumC1485 enumC1485 = (EnumC1485) next;
        if (enumC1485 == null) {
            enumC1485 = EnumC1485.f5270;
        }
        if (enumC1485 != EnumC1485.f5270) {
            return enumC1485.f5274;
        }
        return " where (username in " + AbstractC0270.m1387(this.f5263, null, "(", ")", new C1338(14), 25) + ") order by flag desc";
    }

    public C1484(String str, int i, String str2, boolean z, String[] strArr) {
        this.f5259 = str;
        this.f5260 = i;
        this.f5261 = str2;
        this.f5262 = z;
        this.f5263 = strArr;
    }
}
