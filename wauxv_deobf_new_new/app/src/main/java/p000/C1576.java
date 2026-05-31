package p000;

import android.content.Context;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1576 f5470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1766[] f5471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0099 f5472;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0099 f5473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0099 f5474;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0099 f5475;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0099 f5476;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0099 f5477;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0099 f5478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0099 f5479;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C0099 f5480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C0099 f5481;

    static {
        String[] strArr = AbstractC1471.f5234;
        f5471 = new InterfaceC1766[]{new C2141("modulePath", "getModulePath()Ljava/lang/String;"), new C2141("appContext", "getAppContext()Landroid/content/Context;"), new C2141("appPackageName", "getAppPackageName()Ljava/lang/String;"), new C2141("appClassLoader", "getAppClassLoader()Ljava/lang/ClassLoader;"), new C2141("appFilePath", "getAppFilePath()Ljava/lang/String;"), new C2141("appName", "getAppName()Ljava/lang/String;"), new C2141("verName", "getVerName()Ljava/lang/String;"), new C2141("verCode", "getVerCode()I"), new C2141("verClient", "getVerClient()Ljava/lang/String;"), new C2141("isPlay", "isPlay()Z")};
        f5470 = new C1576();
        f5472 = new C0099(3);
        f5473 = new C0099(3);
        f5474 = new C0099(3);
        f5475 = new C0099(3);
        f5476 = new C0099(3);
        f5477 = new C0099(3);
        f5478 = new C0099(3);
        f5479 = new C0099(3);
        f5480 = new C0099(3);
        f5481 = new C0099(3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ClassLoader m3455() {
        return (ClassLoader) f5475.m1232(f5471[3]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Context m3456() {
        return (Context) f5473.m1232(f5471[1]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m3457() {
        return (String) f5474.m1232(f5471[2]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3458() {
        return ((Number) f5479.m1232(f5471[7])).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static String m3459() {
        return (String) f5478.m1232(f5471[6]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3460() {
        return ((Boolean) f5481.m1232(f5471[9])).booleanValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m3461() {
        String[] strArr = AbstractC1471.f5234;
        StringBuilder sb = new StringBuilder();
        sb.append(MagicFactory.get(m3460() ? -21083994454659L : -21096879356547L, strArr));
        sb.append('.');
        sb.append(m3459());
        sb.append('.');
        sb.append(m3458());
        sb.append('(');
        return AbstractC1095.m2801(sb, (String) f5480.m1232(f5471[8]), ')');
    }
}
