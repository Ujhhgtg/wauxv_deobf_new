package p000;

import com.umeng.ccg.a;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲁᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1521 extends AbstractC1628 {
    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5713;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        return 112;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        int iM4635 = c1023.f3739.m4635();
        C1986 c1986 = c1023.f3737;
        C1986 c1987 = c1023.f3739;
        int iM4636 = c1986.m4635();
        int iM4637 = c1987.m4635();
        c1987.m4637();
        int i = (iM4637 + c1987.f6601) - iM4636;
        if (c0519.m1833()) {
            c0519.m1831(8, "magic: " + new C0917("dex\n035\u0000").m2430());
            c0519.m1831(4, "checksum");
            c0519.m1831(20, a.A);
            int i2 = c1023.f3753;
            if (i2 < 0) {
                throw new RuntimeException("file size not yet known");
            }
            c0519.m1831(4, "file_size:       ".concat(AbstractC1460.m3224(i2)));
            c0519.m1831(4, "header_size:     ".concat(AbstractC1460.m3224(112)));
            c0519.m1831(4, "endian_tag:      ".concat(AbstractC1460.m3224(305419896)));
            c0519.m1831(4, "link_size:       0");
            c0519.m1831(4, "link_off:        0");
            c0519.m1831(4, "map_off:         ".concat(AbstractC1460.m3224(iM4635)));
        }
        for (int i3 = 0; i3 < 8; i3++) {
            c0519.m1838("dex\n035\u0000".charAt(i3));
        }
        c0519.m1843(24);
        int i4 = c1023.f3753;
        if (i4 < 0) {
            throw new RuntimeException("file size not yet known");
        }
        c0519.m1839(i4);
        c0519.m1839(112);
        c0519.m1839(305419896);
        c0519.m1843(8);
        c0519.m1839(iM4635);
        C1977 c1977 = c1023.f3741;
        c1977.m4637();
        int size = ((TreeMap) c1977.f6550).size();
        int iM4638 = size == 0 ? 0 : c1977.m4635();
        if (c0519.m1833()) {
            c0519.m1831(4, "string_ids_size: ".concat(AbstractC1460.m3224(size)));
            c0519.m1831(4, "string_ids_off:  ".concat(AbstractC1460.m3224(iM4638)));
        }
        c0519.m1839(size);
        c0519.m1839(iM4638);
        C1977 c1978 = c1023.f3742;
        c1978.m4637();
        TreeMap treeMap = (TreeMap) c1978.f6550;
        int size2 = treeMap.size();
        int iM4639 = size2 == 0 ? 0 : c1978.m4635();
        if (size2 > 65536) {
            throw new C1024(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c0519.m1833()) {
            c0519.m1831(4, "type_ids_size:   ".concat(AbstractC1460.m3224(size2)));
            c0519.m1831(4, "type_ids_off:    ".concat(AbstractC1460.m3224(iM4639)));
        }
        c0519.m1839(size2);
        c0519.m1839(iM4639);
        C1977 c1979 = c1023.f3743;
        c1979.m4637();
        int size3 = ((TreeMap) c1979.f6550).size();
        int iM46310 = size3 == 0 ? 0 : c1979.m4635();
        if (size3 > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c0519.m1833()) {
            c0519.m1831(4, "proto_ids_size:  ".concat(AbstractC1460.m3224(size3)));
            c0519.m1831(4, "proto_ids_off:   ".concat(AbstractC1460.m3224(iM46310)));
        }
        c0519.m1839(size3);
        c0519.m1839(iM46310);
        C1301 c1301 = c1023.f3744;
        c1301.m4637();
        int size4 = c1301.f4727.size();
        int iM46311 = size4 == 0 ? 0 : c1301.m4635();
        if (c0519.m1833()) {
            c0519.m1831(4, "field_ids_size:  ".concat(AbstractC1460.m3224(size4)));
            c0519.m1831(4, "field_ids_off:   ".concat(AbstractC1460.m3224(iM46311)));
        }
        c0519.m1839(size4);
        c0519.m1839(iM46311);
        C1979 c19710 = c1023.f3745;
        c19710.m4637();
        int size5 = c19710.f6551.size();
        int iM46312 = size5 == 0 ? 0 : c19710.m4635();
        if (c0519.m1833()) {
            c0519.m1831(4, "method_ids_size: ".concat(AbstractC1460.m3224(size5)));
            c0519.m1831(4, "method_ids_off:  ".concat(AbstractC1460.m3224(iM46312)));
        }
        c0519.m1839(size5);
        c0519.m1839(iM46312);
        C0548 c0548 = c1023.f3746;
        c0548.m4637();
        int size6 = c0548.f2261.size();
        int iM46313 = size6 != 0 ? c0548.m4635() : 0;
        if (c0519.m1833()) {
            c0519.m1831(4, "class_defs_size: ".concat(AbstractC1460.m3224(size6)));
            c0519.m1831(4, "class_defs_off:  ".concat(AbstractC1460.m3224(iM46313)));
        }
        c0519.m1839(size6);
        c0519.m1839(iM46313);
        if (c0519.m1833()) {
            c0519.m1831(4, "data_size:       ".concat(AbstractC1460.m3224(i)));
            c0519.m1831(4, "data_off:        ".concat(AbstractC1460.m3224(iM4636)));
        }
        c0519.m1839(i);
        c0519.m1839(iM4636);
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
    }
}
