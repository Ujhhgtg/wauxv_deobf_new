package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Properties;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲇᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2399 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2400 f7678;

    public /* synthetic */ C2399(C2400 c2400, int i) {
        this.f7677 = i;
        this.f7678 = c2400;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() throws IOException {
        Object c2641;
        int i = this.f7677;
        C2400 c2400 = this.f7678;
        switch (i) {
            case 0:
                Properties properties = new Properties();
                if (c2400.f7681.exists()) {
                    properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(c2400.f7681), AbstractC0580.UTF_8), 8192));
                }
                return properties;
            case 1:
                Properties properties2 = (Properties) c2400.f7683.getValue();
                String[] strArr = AbstractC1471.f5234;
                return properties2.getProperty("name", "未知");
            case 2:
                Properties properties3 = (Properties) c2400.f7683.getValue();
                String[] strArr2 = AbstractC1471.f5234;
                return properties3.getProperty("author", "未知");
            case 3:
                Properties properties4 = (Properties) c2400.f7683.getValue();
                String[] strArr3 = AbstractC1471.f5234;
                return properties4.getProperty("version", "未知");
            case 4:
                Properties properties5 = (Properties) c2400.f7683.getValue();
                String[] strArr4 = AbstractC1471.f5234;
                return properties5.getProperty("updateTime", "未知");
            case 5:
                File file = c2400.f7682;
                if (file.exists()) {
                    return AbstractC1330.m3146(file);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String[] strArr5 = AbstractC1471.f5234;
                sb2.append("# ");
                sb2.append((String) c2400.f7685.getValue());
                sb.append(sb2.toString());
                sb.append("\n\n");
                sb.append("**作者**: " + ((String) c2400.f7686.getValue()));
                sb.append("\n\n");
                sb.append("---");
                sb.append("\n\n");
                return AbstractC1095.m2801(sb, "暂无相关描述", '\n');
            default:
                LinkedHashMap linkedHashMap = AbstractC2419.f7753;
                String[] strArr6 = AbstractC1471.f5234;
                C2426 c2426M4355 = AbstractC2419.m4355(c2400);
                C3554 c3554 = C3554.UNIT;
                if (c2426M4355 != null || (c2426M4355 = AbstractC2419.m4356(c2400)) != null) {
                    try {
                        c2426M4355.m4360("openSettings", new Object[0]);
                        c2641 = c3554;
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    Throwable thM4616 = C2642.m4616(c2641);
                    if (thM4616 != null) {
                        c2400.m4346("openSettings Failed: " + thM4616.getMessage());
                    }
                }
                return c3554;
        }
    }
}
