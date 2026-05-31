package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲀᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3741 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ArrayList f11709 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C3610 f11710 = new C3610();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f11711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m5314(int i, String str) {
        m5319(4, new C3742(AbstractC0738.f2835, "D", String.valueOf(str), null, 51), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m5315(String str, Exception exc, int i) {
        if ((i & 2) != 0) {
            exc = null;
        }
        m5319(4, new C3742(AbstractC0738.f2835, "E", String.valueOf(str), exc, 51), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m5316() {
        int i = AbstractC1768.f5906;
        C2933 c2933 = C1770.f5907;
        if (!((Boolean) C1770.f5908.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", AbstractC1095.m2789(2));
        }
        C1770.f5910 = 2;
        if (f11711) {
            return;
        }
        C1770.f5909 = f11710;
        f11711 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m5317(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        m5319(4, new C3742(null, "E", String.valueOf(str), th, 55), (i & 4) == 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m5318(String str) {
        m5319(4, new C3742(null, "W", String.valueOf(str), null, 55), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m5319(int i, C3742 c3742, boolean z) {
        m5316();
        String str = c3742.f11718;
        boolean z2 = !AbstractC2901.m4869(str) || (AbstractC2901.m4869(str) && c3742.f11719 != null);
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 == 0) {
            m5321(c3742);
            return;
        }
        if (iM4792 == 1) {
            m5320(z2, c3742, z);
            return;
        }
        if (iM4792 == 2) {
            boolean z3 = C3755.f11758;
            if (C3755.m5365()) {
                m5320(z2, c3742, z);
                return;
            } else {
                m5321(c3742);
                return;
            }
        }
        if (iM4792 != 3) {
            throw new C0758();
        }
        m5321(c3742);
        boolean z4 = C3755.f11758;
        if (C3755.m5365()) {
            m5320(z2, c3742, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final void m5320(boolean z, C3742 c3742, boolean z2) {
        Object c2641;
        boolean zBooleanValue;
        Object c2642;
        if (z) {
            c3742.f11720 = z2;
            String string = c3742.toString();
            Throwable th = c3742.f11719;
            int[] iArr = AbstractC3744.f11721;
            boolean zBooleanValue2 = false;
            int i = iArr[0];
            if (AbstractC1567.f5453[AbstractC2844.m4792(i)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2641 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c2641 = new C2641(th2);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Boolean bool = (Boolean) c2641;
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
                if (AbstractC1567.f5453[AbstractC2844.m4792(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2642 = Boolean.TRUE;
                    } catch (Throwable th3) {
                        c2642 = new C2641(th3);
                    }
                    Boolean bool2 = (Boolean) (c2642 instanceof C2641 ? null : c2642);
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                }
                int iM4792 = AbstractC2844.m4792(zBooleanValue2 ? i2 : 2);
                if (iM4792 != 0) {
                    if (iM4792 == 1) {
                        throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                    }
                    throw new C0758();
                }
                XposedBridge.log(string);
                if (th != null) {
                    XposedBridge.log(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m5321(C3742 c3742) {
        String str = c3742.f11715;
        Throwable th = c3742.f11719;
        String str2 = c3742.f11718;
        String str3 = c3742.f11714;
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
