package p000;

import com.umeng.ccg.a;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛴᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0535Ujhhgtgfeyxiexzf extends AbstractC0644Ujhhgtgfeyxiexzf {
    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2886Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1294Ujhhgtgfeyxiexzf() {
        return 112;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1295Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        int iM2561Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10262Ujhhgtgfeyxiexzf.m2561Ujhhgtgfeyxiexzf();
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10260Ujhhgtgfeyxiexzf;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10262Ujhhgtgfeyxiexzf;
        int iM2561Ujhhgtgfeyxiexzf2 = c0295Ujhhgtgfeyxiexzf.m2561Ujhhgtgfeyxiexzf();
        int iM2561Ujhhgtgfeyxiexzf3 = c0295Ujhhgtgfeyxiexzf2.m2561Ujhhgtgfeyxiexzf();
        c0295Ujhhgtgfeyxiexzf2.m2563Ujhhgtgfeyxiexzf();
        int i = (iM2561Ujhhgtgfeyxiexzf3 + c0295Ujhhgtgfeyxiexzf2.f1747Ujhhgtgfeyxiexzf) - iM2561Ujhhgtgfeyxiexzf2;
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(8, "magic: " + new C3056Ujhhgtgfeyxiexzf("dex\n035\u0000").m4537Ujhhgtgfeyxiexzf());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "checksum");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(20, a.A);
            int i2 = c3268feyxiexzfUjhhgtg.f10276Ujhhgtgfeyxiexzf;
            if (i2 < 0) {
                throw new RuntimeException("file size not yet known");
            }
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "file_size:       ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "header_size:     ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(112)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "endian_tag:      ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(305419896)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "link_size:       0");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "link_off:        0");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "map_off:         ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf)));
        }
        for (int i3 = 0; i3 < 8; i3++) {
            c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf("dex\n035\u0000".charAt(i3));
        }
        c2608Ujhhgtgfeyxiexzf.m3898Ujhhgtgfeyxiexzf(24);
        int i4 = c3268feyxiexzfUjhhgtg.f10276Ujhhgtgfeyxiexzf;
        if (i4 < 0) {
            throw new RuntimeException("file size not yet known");
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(i4);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(112);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(305419896);
        c2608Ujhhgtgfeyxiexzf.m3898Ujhhgtgfeyxiexzf(8);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf);
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
        c0395Ujhhgtgfeyxiexzf.m2563Ujhhgtgfeyxiexzf();
        int size = ((TreeMap) c0395Ujhhgtgfeyxiexzf.f2143Ujhhgtgfeyxiexzf).size();
        int iM2561Ujhhgtgfeyxiexzf4 = size == 0 ? 0 : c0395Ujhhgtgfeyxiexzf.m2561Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "string_ids_size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "string_ids_off:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf4)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf4);
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        c0395Ujhhgtgfeyxiexzf2.m2563Ujhhgtgfeyxiexzf();
        TreeMap treeMap = (TreeMap) c0395Ujhhgtgfeyxiexzf2.f2143Ujhhgtgfeyxiexzf;
        int size2 = treeMap.size();
        int iM2561Ujhhgtgfeyxiexzf5 = size2 == 0 ? 0 : c0395Ujhhgtgfeyxiexzf2.m2561Ujhhgtgfeyxiexzf();
        if (size2 > 65536) {
            throw new C3269feyxiexzfUjhhgtg(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "type_ids_size:   ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size2)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "type_ids_off:    ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf5)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size2);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf5);
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf3 = c3268feyxiexzfUjhhgtg.f10266Ujhhgtgfeyxiexzf;
        c0395Ujhhgtgfeyxiexzf3.m2563Ujhhgtgfeyxiexzf();
        int size3 = ((TreeMap) c0395Ujhhgtgfeyxiexzf3.f2143Ujhhgtgfeyxiexzf).size();
        int iM2561Ujhhgtgfeyxiexzf6 = size3 == 0 ? 0 : c0395Ujhhgtgfeyxiexzf3.m2561Ujhhgtgfeyxiexzf();
        if (size3 > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "proto_ids_size:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size3)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "proto_ids_off:   ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf6)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size3);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf6);
        C3444feyxiexzfUjhhgtg c3444feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf;
        c3444feyxiexzfUjhhgtg.m2563Ujhhgtgfeyxiexzf();
        int size4 = c3444feyxiexzfUjhhgtg.f10726Ujhhgtgfeyxiexzf.size();
        int iM2561Ujhhgtgfeyxiexzf7 = size4 == 0 ? 0 : c3444feyxiexzfUjhhgtg.m2561Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "field_ids_size:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size4)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "field_ids_off:   ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf7)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size4);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf7);
        C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf;
        c0392Ujhhgtgfeyxiexzf.m2563Ujhhgtgfeyxiexzf();
        int size5 = c0392Ujhhgtgfeyxiexzf.f2131Ujhhgtgfeyxiexzf.size();
        int iM2561Ujhhgtgfeyxiexzf8 = size5 == 0 ? 0 : c0392Ujhhgtgfeyxiexzf.m2561Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "method_ids_size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size5)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "method_ids_off:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf8)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size5);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf8);
        C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10269Ujhhgtgfeyxiexzf;
        c2635feyxiexzfUjhhgtg.m2563Ujhhgtgfeyxiexzf();
        int size6 = c2635feyxiexzfUjhhgtg.f8474Ujhhgtgfeyxiexzf.size();
        int iM2561Ujhhgtgfeyxiexzf9 = size6 != 0 ? c2635feyxiexzfUjhhgtg.m2561Ujhhgtgfeyxiexzf() : 0;
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "class_defs_size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size6)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "class_defs_off:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf9)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size6);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf9);
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "data_size:       ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "data_off:        ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf2)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(i);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf2);
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
    }
}
