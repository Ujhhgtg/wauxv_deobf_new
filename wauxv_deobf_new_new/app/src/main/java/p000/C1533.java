package p000;

import com.umeng.ccg.a;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲇᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1533 extends AbstractC1641 {
    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5756;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 112;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        int iM4669 = c1026.f3746.m4669();
        C2017 c2017 = c1026.f3744;
        C2017 c2018 = c1026.f3746;
        int iM46610 = c2017.m4669();
        int iM46611 = c2018.m4669();
        c2018.m4671();
        int i = (iM46611 + c2018.f6706) - iM46610;
        if (c0496.m1927()) {
            c0496.m1925(8, "magic: " + new C0916("dex\n035\u0000").m2547());
            c0496.m1925(4, "checksum");
            c0496.m1925(20, a.A);
            int i2 = c1026.f3760;
            if (i2 < 0) {
                throw new RuntimeException("file size not yet known");
            }
            c0496.m1925(4, "file_size:       ".concat(AbstractC2902.m4907(i2)));
            c0496.m1925(4, "header_size:     ".concat(AbstractC2902.m4907(112)));
            c0496.m1925(4, "endian_tag:      ".concat(AbstractC2902.m4907(305419896)));
            c0496.m1925(4, "link_size:       0");
            c0496.m1925(4, "link_off:        0");
            c0496.m1925(4, "map_off:         ".concat(AbstractC2902.m4907(iM4669)));
        }
        for (int i3 = 0; i3 < 8; i3++) {
            c0496.m1932("dex\n035\u0000".charAt(i3));
        }
        c0496.m1937(24);
        int i4 = c1026.f3760;
        if (i4 < 0) {
            throw new RuntimeException("file size not yet known");
        }
        c0496.m1933(i4);
        c0496.m1933(112);
        c0496.m1933(305419896);
        c0496.m1937(8);
        c0496.m1933(iM4669);
        C2008 c2008 = c1026.f3748;
        c2008.m4671();
        int size = ((TreeMap) c2008.f6655).size();
        int iM46612 = size == 0 ? 0 : c2008.m4669();
        if (c0496.m1927()) {
            c0496.m1925(4, "string_ids_size: ".concat(AbstractC2902.m4907(size)));
            c0496.m1925(4, "string_ids_off:  ".concat(AbstractC2902.m4907(iM46612)));
        }
        c0496.m1933(size);
        c0496.m1933(iM46612);
        C2008 c2009 = c1026.f3749;
        c2009.m4671();
        TreeMap treeMap = (TreeMap) c2009.f6655;
        int size2 = treeMap.size();
        int iM46613 = size2 == 0 ? 0 : c2009.m4669();
        if (size2 > 65536) {
            throw new C1027(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c0496.m1927()) {
            c0496.m1925(4, "type_ids_size:   ".concat(AbstractC2902.m4907(size2)));
            c0496.m1925(4, "type_ids_off:    ".concat(AbstractC2902.m4907(iM46613)));
        }
        c0496.m1933(size2);
        c0496.m1933(iM46613);
        C2008 c20010 = c1026.f3750;
        c20010.m4671();
        int size3 = ((TreeMap) c20010.f6655).size();
        int iM46614 = size3 == 0 ? 0 : c20010.m4669();
        if (size3 > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c0496.m1927()) {
            c0496.m1925(4, "proto_ids_size:  ".concat(AbstractC2902.m4907(size3)));
            c0496.m1925(4, "proto_ids_off:   ".concat(AbstractC2902.m4907(iM46614)));
        }
        c0496.m1933(size3);
        c0496.m1933(iM46614);
        C1302 c1302 = c1026.f3751;
        c1302.m4671();
        int size4 = c1302.f4726.size();
        int iM46615 = size4 == 0 ? 0 : c1302.m4669();
        if (c0496.m1927()) {
            c0496.m1925(4, "field_ids_size:  ".concat(AbstractC2902.m4907(size4)));
            c0496.m1925(4, "field_ids_off:   ".concat(AbstractC2902.m4907(iM46615)));
        }
        c0496.m1933(size4);
        c0496.m1933(iM46615);
        C2010 c2010 = c1026.f3752;
        c2010.m4671();
        int size5 = c2010.f6656.size();
        int iM46616 = size5 == 0 ? 0 : c2010.m4669();
        if (c0496.m1927()) {
            c0496.m1925(4, "method_ids_size: ".concat(AbstractC2902.m4907(size5)));
            c0496.m1925(4, "method_ids_off:  ".concat(AbstractC2902.m4907(iM46616)));
        }
        c0496.m1933(size5);
        c0496.m1933(iM46616);
        C0525 c0525 = c1026.f3753;
        c0525.m4671();
        int size6 = c0525.f2217.size();
        int iM46617 = size6 != 0 ? c0525.m4669() : 0;
        if (c0496.m1927()) {
            c0496.m1925(4, "class_defs_size: ".concat(AbstractC2902.m4907(size6)));
            c0496.m1925(4, "class_defs_off:  ".concat(AbstractC2902.m4907(iM46617)));
        }
        c0496.m1933(size6);
        c0496.m1933(iM46617);
        if (c0496.m1927()) {
            c0496.m1925(4, "data_size:       ".concat(AbstractC2902.m4907(i)));
            c0496.m1925(4, "data_off:        ".concat(AbstractC2902.m4907(iM46610)));
        }
        c0496.m1933(i);
        c0496.m1933(iM46610);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
    }
}
