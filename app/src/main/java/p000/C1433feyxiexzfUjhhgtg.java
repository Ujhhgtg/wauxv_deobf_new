package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Properties;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1433feyxiexzfUjhhgtg implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5028Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1414feyxiexzfUjhhgtg f5029Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1433feyxiexzfUjhhgtg(C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg, int i) {
        this.f5028Ujhhgtgfeyxiexzf = i;
        this.f5029Ujhhgtgfeyxiexzf = c1414feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() throws IOException {
        Object c0919feyxiexzfUjhhgtg;
        int i = this.f5028Ujhhgtgfeyxiexzf;
        C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = this.f5029Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                Properties properties = new Properties();
                if (c1414feyxiexzfUjhhgtg.f4965Ujhhgtgfeyxiexzf.exists()) {
                    properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(c1414feyxiexzfUjhhgtg.f4965Ujhhgtgfeyxiexzf), AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf), 8192));
                }
                return properties;
            case 1:
                Properties properties2 = (Properties) c1414feyxiexzfUjhhgtg.f4967Ujhhgtgfeyxiexzf.getValue();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                return properties2.getProperty("name", "未知");
            case 2:
                Properties properties3 = (Properties) c1414feyxiexzfUjhhgtg.f4967Ujhhgtgfeyxiexzf.getValue();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                return properties3.getProperty("author", "未知");
            case 3:
                Properties properties4 = (Properties) c1414feyxiexzfUjhhgtg.f4967Ujhhgtgfeyxiexzf.getValue();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                return properties4.getProperty("version", "未知");
            case 4:
                Properties properties5 = (Properties) c1414feyxiexzfUjhhgtg.f4967Ujhhgtgfeyxiexzf.getValue();
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                return properties5.getProperty("updateTime", "未知");
            case 5:
                File file = c1414feyxiexzfUjhhgtg.f4966Ujhhgtgfeyxiexzf;
                if (file.exists()) {
                    return AbstractC3445Ujhhgtgfeyxiexzf.m4946feyxiexzfUjhhgtg(file);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                sb2.append("# ");
                sb2.append((String) c1414feyxiexzfUjhhgtg.f4969Ujhhgtgfeyxiexzf.getValue());
                sb.append(sb2.toString());
                sb.append("\n\n");
                sb.append("**作者**: " + ((String) c1414feyxiexzfUjhhgtg.f4970Ujhhgtgfeyxiexzf.getValue()));
                sb.append("\n\n");
                sb.append("---");
                sb.append("\n\n");
                return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, "暂无相关描述", '\n');
            default:
                LinkedHashMap linkedHashMap = AbstractC1453feyxiexzfUjhhgtg.f5062Ujhhgtgfeyxiexzf;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2963Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg);
                C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                if (c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf != null || (c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2964Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg)) != null) {
                    try {
                        c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf.m2928Ujhhgtgfeyxiexzf("openSettings", new Object[0]);
                        c0919feyxiexzfUjhhgtg = c1943Ujhhgtgfeyxiexzf;
                    } catch (Throwable th) {
                        c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                    }
                    Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                    if (thM2409Ujhhgtgfeyxiexzf != null) {
                        c1414feyxiexzfUjhhgtg.m2925Ujhhgtgfeyxiexzf("openSettings Failed: " + thM2409Ujhhgtgfeyxiexzf.getMessage());
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
