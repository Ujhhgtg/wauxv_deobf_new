package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴ要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2290feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ArrayList f7511Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C1866feyxiexzfUjhhgtg f7512Ujhhgtgfeyxiexzf = new C1866feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean f7513Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3494Ujhhgtgfeyxiexzf(int i, String str) {
        m3499Ujhhgtgfeyxiexzf(4, new C2291Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.f6409Ujhhgtgfeyxiexzf, "D", String.valueOf(str), null, 51), false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3495Ujhhgtgfeyxiexzf(String str, Exception exc, int i) {
        if ((i & 2) != 0) {
            exc = null;
        }
        m3499Ujhhgtgfeyxiexzf(4, new C2291Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.f6409Ujhhgtgfeyxiexzf, "E", String.valueOf(str), exc, 51), false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m3496Ujhhgtgfeyxiexzf() {
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
        if (!((Boolean) C0147Ujhhgtgfeyxiexzf.f1305Ujhhgtgfeyxiexzf.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", AbstractC3317feyxiexzfUjhhgtg.m4790Ujhhgtgfeyxiexzf(2));
        }
        C0147Ujhhgtgfeyxiexzf.f1307Ujhhgtgfeyxiexzf = 2;
        if (f7513Ujhhgtgfeyxiexzf) {
            return;
        }
        C0147Ujhhgtgfeyxiexzf.f1306Ujhhgtgfeyxiexzf = f7512Ujhhgtgfeyxiexzf;
        f7513Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m3497Ujhhgtgfeyxiexzf(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        m3499Ujhhgtgfeyxiexzf(4, new C2291Ujhhgtgfeyxiexzf(null, "E", String.valueOf(str), th, 55), (i & 4) == 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m3498Ujhhgtgfeyxiexzf(String str) {
        m3499Ujhhgtgfeyxiexzf(4, new C2291Ujhhgtgfeyxiexzf(null, "W", String.valueOf(str), null, 55), false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m3499Ujhhgtgfeyxiexzf(int i, C2291Ujhhgtgfeyxiexzf c2291Ujhhgtgfeyxiexzf, boolean z) {
        m3496Ujhhgtgfeyxiexzf();
        String str = c2291Ujhhgtgfeyxiexzf.f7520Ujhhgtgfeyxiexzf;
        boolean z2 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) || (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) && c2291Ujhhgtgfeyxiexzf.f7521Ujhhgtgfeyxiexzf != null);
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        if (iM2713feyxiexzfUjhhgtg == 0) {
            m3501Ujhhgtgfeyxiexzf(c2291Ujhhgtgfeyxiexzf);
            return;
        }
        if (iM2713feyxiexzfUjhhgtg == 1) {
            m3500Ujhhgtgfeyxiexzf(z2, c2291Ujhhgtgfeyxiexzf, z);
            return;
        }
        if (iM2713feyxiexzfUjhhgtg == 2) {
            boolean z3 = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
            if (C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf()) {
                m3500Ujhhgtgfeyxiexzf(z2, c2291Ujhhgtgfeyxiexzf, z);
                return;
            } else {
                m3501Ujhhgtgfeyxiexzf(c2291Ujhhgtgfeyxiexzf);
                return;
            }
        }
        if (iM2713feyxiexzfUjhhgtg != 3) {
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        m3501Ujhhgtgfeyxiexzf(c2291Ujhhgtgfeyxiexzf);
        boolean z4 = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
        if (C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf()) {
            m3500Ujhhgtgfeyxiexzf(z2, c2291Ujhhgtgfeyxiexzf, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final void m3500Ujhhgtgfeyxiexzf(boolean z, C2291Ujhhgtgfeyxiexzf c2291Ujhhgtgfeyxiexzf, boolean z2) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        Object c0919feyxiexzfUjhhgtg2;
        if (z) {
            c2291Ujhhgtgfeyxiexzf.f7522Ujhhgtgfeyxiexzf = z2;
            String string = c2291Ujhhgtgfeyxiexzf.toString();
            Throwable th = c2291Ujhhgtgfeyxiexzf.f7521Ujhhgtgfeyxiexzf;
            int[] iArr = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf;
            boolean zBooleanValue2 = false;
            int i = iArr[0];
            if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c0919feyxiexzfUjhhgtg = Boolean.TRUE;
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i = 2;
            }
            if (i != 2) {
                int i2 = iArr[0];
                if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c0919feyxiexzfUjhhgtg2 = Boolean.TRUE;
                    } catch (Throwable th3) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th3);
                    }
                    Boolean bool2 = (Boolean) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                }
                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(zBooleanValue2 ? i2 : 2);
                if (iM2713feyxiexzfUjhhgtg != 0) {
                    if (iM2713feyxiexzfUjhhgtg == 1) {
                        throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                    }
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                XposedBridge.log(string);
                if (th != null) {
                    XposedBridge.log(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final void m3501Ujhhgtgfeyxiexzf(C2291Ujhhgtgfeyxiexzf c2291Ujhhgtgfeyxiexzf) {
        String str = c2291Ujhhgtgfeyxiexzf.f7517Ujhhgtgfeyxiexzf;
        Throwable th = c2291Ujhhgtgfeyxiexzf.f7521Ujhhgtgfeyxiexzf;
        String str2 = c2291Ujhhgtgfeyxiexzf.f7520Ujhhgtgfeyxiexzf;
        String str3 = c2291Ujhhgtgfeyxiexzf.f7516Ujhhgtgfeyxiexzf;
        int iHashCode = str.hashCode();
        if (iHashCode != 68) {
            if (iHashCode != 69) {
                if (iHashCode != 73) {
                    if (iHashCode == 87 && str.equals("W")) {
                        Log.w(str3, str2, th);
                        return;
                    }
                } else if (str.equals("I")) {
                    Log.i(str3, str2, th);
                    return;
                }
            } else if (str.equals("E")) {
                Log.e(str3, str2, th);
                return;
            }
        } else if (str.equals("D")) {
            Log.d(str3, str2, th);
            return;
        }
        Log.wtf(str3, str2, th);
    }
}
