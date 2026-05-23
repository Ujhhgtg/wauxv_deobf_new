package p000;

import android.content.Context;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1565 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1565 f5440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1742[] f5441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0091 f5442;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0091 f5443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0091 f5444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0091 f5445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0091 f5446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0091 f5447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0091 f5448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0091 f5449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C0091 f5450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ClassLoader m3275() {
        return (ClassLoader) f5445.m1086(f5441[3]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Context m3276() {
        return (Context) f5443.m1086(f5441[1]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m3277() {
        return (String) f5444.m1086(f5441[2]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3278() {
        return ((Number) f5449.m1086(f5441[7])).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static String m3279() {
        return (String) f5448.m1086(f5441[6]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3280() {
        return ((Boolean) f5451.m1086(f5441[9])).booleanValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
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
