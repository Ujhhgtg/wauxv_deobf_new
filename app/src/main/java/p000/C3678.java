package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᤝᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3678 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ArrayList f11549 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C3552 f11550 = new C3552();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f11551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m5305(int i, String str) {
        m5310(4, new C3679(AbstractC1270.f4644, "D", String.valueOf(str), null, 51), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m5306(String str, Exception exc, int i) {
        if ((i & 2) != 0) {
            exc = null;
        }
        m5310(4, new C3679(AbstractC1270.f4644, "E", String.valueOf(str), exc, 51), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m5307() {
        int i = AbstractC1745.f5844;
        C2873 c2873 = C1747.f5845;
        if (!((Boolean) C1747.f5846.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", AbstractC1194.m2774(2));
        }
        C1747.f5848 = 2;
        if (f11551) {
            return;
        }
        C1747.f5847 = f11550;
        f11551 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m5308(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        m5310(4, new C3679(null, "E", String.valueOf(str), th, 55), (i & 4) == 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m5309(String str) {
        m5310(4, new C3679(null, "W", String.valueOf(str), null, 55), false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m5310(int i, C3679 c3679, boolean z) {
        m5307();
        String str = c3679.f11558;
        boolean z2 = !AbstractC2841.m4836(str) || (AbstractC2841.m4836(str) && c3679.f11559 != null);
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 0) {
            m5312(c3679);
            return;
        }
        if (iM4759 == 1) {
            m5311(z2, c3679, z);
            return;
        }
        if (iM4759 == 2) {
            boolean z3 = C3692.f11601;
            if (C3692.m5357()) {
                m5311(z2, c3679, z);
                return;
            } else {
                m5312(c3679);
                return;
            }
        }
        if (iM4759 != 3) {
            throw new C0761();
        }
        m5312(c3679);
        boolean z4 = C3692.f11601;
        if (C3692.m5357()) {
            m5311(z2, c3679, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final void m5311(boolean z, C3679 c3679, boolean z2) {
        Object c2585;
        boolean zBooleanValue;
        Object c2586;
        if (z) {
            c3679.f11560 = z2;
            String string = c3679.toString();
            Throwable th = c3679.f11559;
            int[] iArr = AbstractC0743.f2838;
            boolean zBooleanValue2 = false;
            int i = iArr[0];
            if (AbstractC1555.f5422[AbstractC2784.m4759(i)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2585 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c2585 = new C2585(th2);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Boolean bool = (Boolean) c2585;
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
                if (AbstractC1555.f5422[AbstractC2784.m4759(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2586 = Boolean.TRUE;
                    } catch (Throwable th3) {
                        c2586 = new C2585(th3);
                    }
                    Boolean bool2 = (Boolean) (c2586 instanceof C2585 ? null : c2586);
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                }
                int iM4759 = AbstractC2784.m4759(zBooleanValue2 ? i2 : 2);
                if (iM4759 != 0) {
                    if (iM4759 == 1) {
                        throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                    }
                    throw new C0761();
                }
                XposedBridge.log(string);
                if (th != null) {
                    XposedBridge.log(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m5312(C3679 c3679) {
        String str = c3679.f11555;
        Throwable th = c3679.f11559;
        String str2 = c3679.f11558;
        String str3 = c3679.f11554;
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
