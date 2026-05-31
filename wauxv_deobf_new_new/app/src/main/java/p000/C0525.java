package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0525 extends AbstractC3552 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final TreeMap f2217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f2218;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525(C1026 c1026, int i) {
        super("call_site_ids", c1026, 4);
        this.f2216 = i;
        switch (i) {
            case 1:
                super("class_defs", c1026, 4);
                this.f2217 = new TreeMap();
                this.f2218 = null;
                break;
            default:
                this.f2217 = new TreeMap();
                this.f2218 = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Collection mo2018() {
        switch (this.f2216) {
            case 0:
                return this.f2217.values();
            default:
                ArrayList arrayList = (ArrayList) this.f2218;
                return arrayList != null ? arrayList : this.f2217.values();
        }
    }

    @Override // p000.AbstractC3552
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo2019() {
        switch (this.f2216) {
            case 0:
                Iterator it = this.f2217.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C0524) it.next()).m3511(i);
                    i++;
                }
                break;
            default:
                TreeMap treeMap = this.f2217;
                int size = treeMap.size();
                this.f2218 = new ArrayList(size);
                Iterator it2 = treeMap.keySet().iterator();
                int iM2020 = 0;
                while (it2.hasNext()) {
                    iM2020 = m2020(iM2020, size - iM2020, (C3505) it2.next());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int m2020(int i, int i2, C3505 c3505) {
        C0697 c0697 = (C0697) this.f2217.get(c3505);
        if (c0697 == null || c0697.f5539 >= 0) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c3505);
        }
        int i3 = i2 - 1;
        C0917 c0917 = c0697.f2666;
        if (c0917 != null) {
            i = m2020(i, i3, c0917.f3408);
        }
        C3511 c3511 = c0697.f2667;
        InterfaceC3510 interfaceC3510 = c3511 == null ? C2879.f9192 : c3511.f11084;
        int size = interfaceC3510.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m2020(i, i3, interfaceC3510.getType(i4));
        }
        c0697.m3511(i);
        ((ArrayList) this.f2218).add(c0697);
        return i + 1;
    }
}
