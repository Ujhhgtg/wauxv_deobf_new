package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1747 {

    public static final C2873 f5845 = new C2873(new C1354(18));

    public static final C2873 f5846;

    public static InterfaceC1746 f5847;

    public static int f5848;

    static {
        C2873 c2873 = new C2873(new C1354(19));
        f5846 = c2873;
        f5847 = new C1227(21);
        f5848 = 3;
        if (!((Boolean) c2873.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", AbstractC1194.m2774(3));
        }
        f5848 = 3;
    }

    public static void m3496(String str, Throwable th) {
        if (AbstractC2784.m4759(f5848) <= AbstractC2784.m4759(3)) {
            f5847.mo2862(str, th);
        }
    }
}
