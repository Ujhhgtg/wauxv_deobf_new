package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0548 extends AbstractC3495 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2260;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final TreeMap f2261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f2262;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0548(C1023 c1023, int i) {
        super("call_site_ids", c1023, 4);
        this.f2260 = i;
        switch (i) {
            case 1:
                super("class_defs", c1023, 4);
                this.f2261 = new TreeMap();
                this.f2262 = null;
                break;
            default:
                this.f2261 = new TreeMap();
                this.f2262 = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC2643
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Collection mo1923() {
        switch (this.f2260) {
            case 0:
                return this.f2261.values();
            default:
                ArrayList arrayList = (ArrayList) this.f2262;
                return arrayList != null ? arrayList : this.f2261.values();
        }
    }

    @Override // p000.AbstractC3495
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1924() {
        switch (this.f2260) {
            case 0:
                Iterator it = this.f2261.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C0547) it.next()).m3347(i);
                    i++;
                }
                break;
            default:
                TreeMap treeMap = this.f2261;
                int size = treeMap.size();
                this.f2262 = new ArrayList(size);
                Iterator it2 = treeMap.keySet().iterator();
                int iM1925 = 0;
                while (it2.hasNext()) {
                    iM1925 = m1925(iM1925, size - iM1925, (C3448) it2.next());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int m1925(int i, int i2, C3448 c3448) {
        C0701 c0701 = (C0701) this.f2261.get(c3448);
        if (c0701 == null || c0701.f5505 >= 0) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c3448);
        }
        int i3 = i2 - 1;
        C0918 c0918 = c0701.f2665;
        if (c0918 != null) {
            i = m1925(i, i3, c0918.f3401);
        }
        C3455 c3455 = c0701.f2666;
        InterfaceC3454 interfaceC3454 = c3455 == null ? C2819.f9030 : c3455.f10928;
        int size = interfaceC3454.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m1925(i, i3, interfaceC3454.getType(i4));
        }
        c0701.m3347(i);
        ((ArrayList) this.f2262).add(c0701);
        return i + 1;
    }
}
