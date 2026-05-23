package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2354 implements InterfaceC1414 {

    public final /* synthetic */ int f7547;

    public final /* synthetic */ C2355 f7548;

    public /* synthetic */ C2354(C2355 c2355, int i) {
        this.f7547 = i;
        this.f7548 = c2355;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() throws IOException {
        switch (this.f7547) {
            case 0:
                Properties properties = new Properties();
                C2355 c2355 = this.f7548;
                if (c2355.f7551.exists()) {
                    properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(c2355.f7551), AbstractC0599.f2413), 8192));
                }
                return properties;
            case 1:
                Properties properties2 = (Properties) this.f7548.f7553.getValue();
                String[] strArr = AbstractC1574.f5469;
                return properties2.getProperty("name", "未知");
            case 2:
                Properties properties3 = (Properties) this.f7548.f7553.getValue();
                String[] strArr2 = AbstractC1574.f5469;
                return properties3.getProperty("author", "未知");
            case 3:
                Properties properties4 = (Properties) this.f7548.f7553.getValue();
                String[] strArr3 = AbstractC1574.f5469;
                return properties4.getProperty("version", "未知");
            case 4:
                Properties properties5 = (Properties) this.f7548.f7553.getValue();
                String[] strArr4 = AbstractC1574.f5469;
                return properties5.getProperty("updateTime", "未知");
            case 5:
                C2355 c2356 = this.f7548;
                File file = c2356.f7552;
                if (file.exists()) {
                    return AbstractC1328.m3043(file);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String[] strArr5 = AbstractC1574.f5469;
                sb2.append("# ");
                sb2.append((String) c2356.f7555.getValue());
                sb.append(sb2.toString());
                sb.append("\n\n");
                sb.append("**作者**: " + ((String) c2356.f7556.getValue()));
                sb.append("\n\n");
                sb.append("---");
                sb.append("\n\n");
                return AbstractC1194.m2786(sb, "暂无相关描述", '\n');
            default:
                C2355 c2357 = this.f7548;
                
                c2357.m4332("openSettings", new Object[0]);
                return Unit.INSTANCE;
        }
    }
}
