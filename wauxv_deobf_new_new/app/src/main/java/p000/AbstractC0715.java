package p000;

import java.io.File;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String f2724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f2725;

    static {
        File parentFile;
        C1576.f5470.getClass();
        File parentFile2 = C1576.m3456().getFilesDir().getParentFile();
        String path = null;
        f2724 = String.valueOf(parentFile2 != null ? parentFile2.getPath() : null);
        File externalCacheDir = C1576.m3456().getExternalCacheDir();
        if (externalCacheDir != null && (parentFile = externalCacheDir.getParentFile()) != null) {
            path = parentFile.getPath();
        }
        f2725 = String.valueOf(path);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m2235() {
        String[] strArr = AbstractC1471.f5234;
        String str = "Cache";
        StringBuilder sb = new StringBuilder();
        String str2 = f2724;
        sb.append(str2);
        sb.append("/cache");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str3 = f2725;
        sb2.append(str3);
        sb2.append("/cache");
        C0714 c0714 = new C0714(str, AbstractC0740.m2311(string, sb2.toString()));
        String str4 = "Log";
        StringBuilder sbM4787 = AbstractC2844.m4787(str2);
        sbM4787.append("/MicroMsg/crash");
        String string2 = sbM4787.toString();
        StringBuilder sbM4788 = AbstractC2844.m4787(str2);
        sbM4788.append("/MicroMsg/xlog");
        String string3 = sbM4788.toString();
        StringBuilder sbM4789 = AbstractC2844.m4787(str3);
        sbM4789.append("/MicroMsg/crash");
        String string4 = sbM4789.toString();
        StringBuilder sbM47810 = AbstractC2844.m4787(str3);
        sbM47810.append("/MicroMsg/xlog");
        String string5 = sbM47810.toString();
        StringBuilder sbM47811 = AbstractC2844.m4787(str3);
        sbM47811.append("/files/onelog");
        String string6 = sbM47811.toString();
        StringBuilder sbM47812 = AbstractC2844.m4787(str3);
        sbM47812.append("/files/tbslog");
        String string7 = sbM47812.toString();
        StringBuilder sbM47813 = AbstractC2844.m4787(str3);
        sbM47813.append("/files/Tencent/tbs_common_log");
        String string8 = sbM47813.toString();
        StringBuilder sbM47814 = AbstractC2844.m4787(str3);
        sbM47814.append("/files/Tencent/tbs_live_log");
        C0714 c0715 = new C0714(str4, AbstractC0740.m2311(string2, string3, string4, string5, string6, string7, string8, sbM47814.toString()));
        String str5 = "AppBrand";
        StringBuilder sbM47815 = AbstractC2844.m4787(str2);
        sbM47815.append("/appbrand");
        String string9 = sbM47815.toString();
        StringBuilder sbM47816 = AbstractC2844.m4787(str2);
        sbM47816.append("/cache/appbrand");
        String string10 = sbM47816.toString();
        StringBuilder sbM47817 = AbstractC2844.m4787(str2);
        sbM47817.append("/MicroMsg/appbrand");
        C0714 c0716 = new C0714(str5, AbstractC0740.m2311(string9, string10, sbM47817.toString()));
        String str6 = "LiteApp";
        StringBuilder sbM47818 = AbstractC2844.m4787(str2);
        sbM47818.append("/cache/liteapp");
        String string11 = sbM47818.toString();
        StringBuilder sbM47819 = AbstractC2844.m4787(str2);
        sbM47819.append("/files/liteapp");
        C0714 c0717 = new C0714(str6, AbstractC0740.m2311(string11, sbM47819.toString()));
        String str7 = "Tinker";
        StringBuilder sbM47820 = AbstractC2844.m4787(str2);
        sbM47820.append("/tinker");
        return AbstractC0740.m2311(c0714, c0715, c0716, c0717, new C0714(str7, Collections.singletonList(sbM47820.toString())));
    }
}
