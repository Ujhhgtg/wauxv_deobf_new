package p000;

import java.io.File;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤝᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0720 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String f2730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f2731;

    static {
        File parentFile;
        
        File parentFile2 = C1565.m3276().getFilesDir().getParentFile();
        String path = null;
        f2730 = String.valueOf(parentFile2 != null ? parentFile2.getPath() : null);
        File externalCacheDir = C1565.m3276().getExternalCacheDir();
        if (externalCacheDir != null && (parentFile = externalCacheDir.getParentFile()) != null) {
            path = parentFile.getPath();
        }
        f2731 = String.valueOf(path);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m2143() {
        String[] strArr = AbstractC1574.f5469;
        String str = "Cache";
        StringBuilder sb = new StringBuilder();
        String str2 = f2730;
        sb.append(str2);
        sb.append("/cache");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str3 = f2731;
        sb2.append(str3);
        sb2.append("/cache");
        C0719 c0719 = new C0719("Cache", AbstractC0745.m2212(string, sb2.toString()));
        String str4 = "Log";
        StringBuilder sbM4753 = AbstractC2784.m4753(str2);
        sbM4753.append("/MicroMsg/crash");
        String string2 = sbM4753.toString();
        StringBuilder sbM4754 = AbstractC2784.m4753(str2);
        sbM4754.append("/MicroMsg/xlog");
        String string3 = sbM4754.toString();
        StringBuilder sbM4755 = AbstractC2784.m4753(str3);
        sbM4755.append("/MicroMsg/crash");
        String string4 = sbM4755.toString();
        StringBuilder sbM4756 = AbstractC2784.m4753(str3);
        sbM4756.append("/MicroMsg/xlog");
        String string5 = sbM4756.toString();
        StringBuilder sbM4757 = AbstractC2784.m4753(str3);
        sbM4757.append("/files/onelog");
        String string6 = sbM4757.toString();
        StringBuilder sbM4758 = AbstractC2784.m4753(str3);
        sbM4758.append("/files/tbslog");
        String string7 = sbM4758.toString();
        StringBuilder sbM4759 = AbstractC2784.m4753(str3);
        sbM4759.append("/files/Tencent/tbs_common_log");
        String string8 = sbM4759.toString();
        StringBuilder sbM47510 = AbstractC2784.m4753(str3);
        sbM47510.append("/files/Tencent/tbs_live_log");
        C0719 c07110 = new C0719("Log", AbstractC0745.m2212(string2, string3, string4, string5, string6, string7, string8, sbM47510.toString()));
        String str5 = "AppBrand";
        StringBuilder sbM47511 = AbstractC2784.m4753(str2);
        sbM47511.append("/appbrand");
        String string9 = sbM47511.toString();
        StringBuilder sbM47512 = AbstractC2784.m4753(str2);
        sbM47512.append("/cache/appbrand");
        String string10 = sbM47512.toString();
        StringBuilder sbM47513 = AbstractC2784.m4753(str2);
        sbM47513.append("/MicroMsg/appbrand");
        C0719 c07111 = new C0719("AppBrand", AbstractC0745.m2212(string9, string10, sbM47513.toString()));
        String str6 = "LiteApp";
        StringBuilder sbM47514 = AbstractC2784.m4753(str2);
        sbM47514.append("/cache/liteapp");
        String string11 = sbM47514.toString();
        StringBuilder sbM47515 = AbstractC2784.m4753(str2);
        sbM47515.append("/files/liteapp");
        C0719 c07112 = new C0719("LiteApp", AbstractC0745.m2212(string11, sbM47515.toString()));
        String str7 = "Tinker";
        StringBuilder sbM47516 = AbstractC2784.m4753(str2);
        sbM47516.append("/tinker");
        return AbstractC0745.m2212(c0719, c07110, c07111, c07112, new C0719("Tinker", Collections.singletonList(sbM47516.toString())));
    }
}
