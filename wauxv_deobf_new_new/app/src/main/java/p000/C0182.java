package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0182 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0185 f1277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0180[] f1278;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0182(C0185 c0185, C1026 c1026) {
        try {
            TreeMap treeMap = c0185.f1292;
            super(4, (treeMap.size() * 4) + 4);
            this.f1277 = c0185;
            this.f1278 = new C0180[treeMap.size()];
            Iterator it = Collections.unmodifiableCollection(treeMap.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f1278[i] = new C0180((C0173) it.next(), c1026);
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f1277.f1292.hashCode();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2017 c2017 = c1026.f3757;
        C0180[] c0180Arr = this.f1278;
        int length = c0180Arr.length;
        for (int i = 0; i < length; i++) {
            c0180Arr[i] = (C0180) c2017.m4049(c0180Arr[i]);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5768;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1369(AbstractC2302 abstractC2302) {
        return this.f1277.compareTo(((C0182) abstractC2302).f1277);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        Arrays.sort(this.f1278, C0180.f1271);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        boolean zM1927 = c0496.m1927();
        C0180[] c0180Arr = this.f1278;
        int length = c0180Arr.length;
        if (zM1927) {
            c0496.m1925(0, m4280() + " annotation set");
            c0496.m1925(4, "  size: ".concat(AbstractC2902.m4907(length)));
        }
        c0496.m1933(length);
        for (int i = 0; i < length; i++) {
            int iM4279 = c0180Arr[i].m4279();
            if (zM1927) {
                c0496.m1925(4, "  entries[" + Integer.toHexString(i) + "]: " + AbstractC2902.m4907(iM4279));
                C0180 c0180 = c0180Arr[i];
                c0180.getClass();
                C0173 c0173 = c0180.f1272;
                c0496.m1925(0, "    visibility: ".concat(AbstractC2844.m4768(c0173.f1259)));
                c0496.m1925(0, "    type: " + c0173.f1258.f3408.mo1360());
                for (C2152 c2152 : Collections.unmodifiableCollection(c0173.f1260.values())) {
                    c0496.m1925(0, "    " + c2152.f7102.mo1360() + ": " + C2885.m4834(c2152.f7103));
                }
            }
            c0496.m1933(iM4279);
        }
    }
}
