package p000;

import android.content.Context;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1565 {

    public static final C1565 f5440;

    public static final /* synthetic */ InterfaceC1742[] f5441;

    public static final C0091 f5442;

    public static final C0091 f5443;

    public static final C0091 f5444;

    public static final C0091 f5445;

    public static final C0091 f5446;

    public static final C0091 f5447;

    public static final C0091 f5448;

    public static final C0091 f5449;

    public static final C0091 f5450;

    public static final C0091 f5451;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5441 = new InterfaceC1742[]{new C2108("modulePath", "getModulePath()Ljava/lang/String;"), new C2108("appContext", "getAppContext()Landroid/content/Context;"), new C2108("appPackageName", "getAppPackageName()Ljava/lang/String;"), new C2108("appClassLoader", "getAppClassLoader()Ljava/lang/ClassLoader;"), new C2108("appFilePath", "getAppFilePath()Ljava/lang/String;"), new C2108("appName", "getAppName()Ljava/lang/String;"), new C2108("verName", "getVerName()Ljava/lang/String;"), new C2108("verCode", "getVerCode()I"), new C2108("verClient", "getVerClient()Ljava/lang/String;"), new C2108("isPlay", "isPlay()Z")};
        f5440 = new C1565();
        f5442 = new C0091(2);
        f5443 = new C0091(2);
        f5444 = new C0091(2);
        f5445 = new C0091(2);
        f5446 = new C0091(2);
        f5447 = new C0091(2);
        f5448 = new C0091(2);
        f5449 = new C0091(2);
        f5450 = new C0091(2);
        f5451 = new C0091(2);
    }

    public static ClassLoader m3275() {
        return (ClassLoader) f5445.m1086(f5441[3]);
    }

    public static Context m3276() {
        return (Context) f5443.m1086(f5441[1]);
    }

    public static String m3277() {
        return (String) f5444.m1086(f5441[2]);
    }

    public static int m3278() {
        return ((Number) f5449.m1086(f5441[7])).intValue();
    }

    public static String m3279() {
        return (String) f5448.m1086(f5441[6]);
    }

    public static boolean m3280() {
        return ((Boolean) f5451.m1086(f5441[9])).booleanValue();
    }

    public static String m3281() {
        String[] strArr = AbstractC1574.f5469;
        StringBuilder sb = new StringBuilder();
        sb.append(MagicFactory.get(m3280() ? -19640885443252L : -19653770345140L, strArr));
        sb.append('.');
        sb.append(m3279());
        sb.append('.');
        sb.append(m3278());
        sb.append('(');
        return AbstractC1194.m2786(sb, (String) f5450.m1086(f5441[8]), ')');
    }
}
