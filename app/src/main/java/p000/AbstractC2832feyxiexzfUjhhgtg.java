package p000;

import java.io.File;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛲ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2832feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String f9000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String f9001Ujhhgtgfeyxiexzf;

    static {
        File parentFile;
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        File parentFile2 = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getFilesDir().getParentFile();
        String path = null;
        f9000Ujhhgtgfeyxiexzf = String.valueOf(parentFile2 != null ? parentFile2.getPath() : null);
        File externalCacheDir = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getExternalCacheDir();
        if (externalCacheDir != null && (parentFile = externalCacheDir.getParentFile()) != null) {
            path = parentFile.getPath();
        }
        f9001Ujhhgtgfeyxiexzf = String.valueOf(path);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static List m4157Ujhhgtgfeyxiexzf() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        String str = "Cache";
        StringBuilder sb = new StringBuilder();
        String str2 = f9000Ujhhgtgfeyxiexzf;
        sb.append(str2);
        sb.append("/cache");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str3 = f9001Ujhhgtgfeyxiexzf;
        sb2.append(str3);
        sb2.append("/cache");
        C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg = new C2831feyxiexzfUjhhgtg(str, AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(string, sb2.toString()));
        String str4 = "Log";
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf.append("/MicroMsg/crash");
        String string2 = sbM2707Ujhhgtgfeyxiexzf.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf2.append("/MicroMsg/xlog");
        String string3 = sbM2707Ujhhgtgfeyxiexzf2.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf3.append("/MicroMsg/crash");
        String string4 = sbM2707Ujhhgtgfeyxiexzf3.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf4.append("/MicroMsg/xlog");
        String string5 = sbM2707Ujhhgtgfeyxiexzf4.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf5 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf5.append("/files/onelog");
        String string6 = sbM2707Ujhhgtgfeyxiexzf5.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf6 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf6.append("/files/tbslog");
        String string7 = sbM2707Ujhhgtgfeyxiexzf6.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf7 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf7.append("/files/Tencent/tbs_common_log");
        String string8 = sbM2707Ujhhgtgfeyxiexzf7.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf8 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
        sbM2707Ujhhgtgfeyxiexzf8.append("/files/Tencent/tbs_live_log");
        C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg2 = new C2831feyxiexzfUjhhgtg(str4, AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(string2, string3, string4, string5, string6, string7, string8, sbM2707Ujhhgtgfeyxiexzf8.toString()));
        String str5 = "AppBrand";
        StringBuilder sbM2707Ujhhgtgfeyxiexzf9 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf9.append("/appbrand");
        String string9 = sbM2707Ujhhgtgfeyxiexzf9.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf10 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf10.append("/cache/appbrand");
        String string10 = sbM2707Ujhhgtgfeyxiexzf10.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf11 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf11.append("/MicroMsg/appbrand");
        C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg3 = new C2831feyxiexzfUjhhgtg(str5, AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(string9, string10, sbM2707Ujhhgtgfeyxiexzf11.toString()));
        String str6 = "LiteApp";
        StringBuilder sbM2707Ujhhgtgfeyxiexzf12 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf12.append("/cache/liteapp");
        String string11 = sbM2707Ujhhgtgfeyxiexzf12.toString();
        StringBuilder sbM2707Ujhhgtgfeyxiexzf13 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf13.append("/files/liteapp");
        C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg4 = new C2831feyxiexzfUjhhgtg(str6, AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(string11, sbM2707Ujhhgtgfeyxiexzf13.toString()));
        String str7 = "Tinker";
        StringBuilder sbM2707Ujhhgtgfeyxiexzf14 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2);
        sbM2707Ujhhgtgfeyxiexzf14.append("/tinker");
        return AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(c2831feyxiexzfUjhhgtg, c2831feyxiexzfUjhhgtg2, c2831feyxiexzfUjhhgtg3, c2831feyxiexzfUjhhgtg4, new C2831feyxiexzfUjhhgtg(str7, Collections.singletonList(sbM2707Ujhhgtgfeyxiexzf14.toString())));
    }
}
