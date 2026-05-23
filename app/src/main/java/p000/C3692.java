package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3692 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean f11601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean f11602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f11603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C1538 f11607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f11604 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f11605 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f11606 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String f11608 = "";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String f11609 = "";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2310 m5355(int i, String str, String str2, ClassLoader classLoader, ApplicationInfo applicationInfo, AbstractC2583 abstractC2583, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            classLoader = null;
        }
        if ((i2 & 16) != 0) {
            applicationInfo = null;
        }
        f11603 = i == 1;
        LinkedHashMap linkedHashMap = f11606;
        if (linkedHashMap.get(str) != null) {
            C2310 c2310 = (C2310) linkedHashMap.get(str);
            if (c2310 != null) {
                c2310.f7438 = i;
                if (str != null) {
                    if (AbstractC2841.m4836(str)) {
                        str = null;
                    }
                    if (str != null) {
                        c2310.f7439 = str;
                    }
                }
                if (str2 != null) {
                    if (AbstractC2841.m4836(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        c2310.f7440 = str2;
                    }
                }
                if (classLoader != null) {
                    ClassLoader classLoader2 = (i == 1 || (classLoader instanceof PathClassLoader)) ? classLoader : null;
                    if (classLoader2 != null) {
                        c2310.f7441 = classLoader2;
                    }
                }
                if (applicationInfo != null) {
                    c2310.f7442 = applicationInfo;
                }
                return c2310;
            }
        } else if (i == 1 || classLoader != null) {
            String str3 = str == null ? "android" : str;
            if (str2 == null) {
                str2 = "android";
            }
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            C2310 c2311 = new C2310();
            c2311.f7438 = i;
            c2311.f7439 = str3;
            c2311.f7440 = str2;
            c2311.f7441 = classLoader;
            c2311.f7442 = applicationInfo;
            if (str == null) {
                str = "android";
            }
            linkedHashMap.put(str, c2311);
            return c2311;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m5356(int i, String str) {
        if (str == null) {
            return false;
        }
        StringBuilder sbM2788 = AbstractC1194.m2788(str, ":");
        sbM2788.append(AbstractC1194.m2794(i));
        String string = sbM2788.toString();
        LinkedHashSet linkedHashSet = f11605;
        if (linkedHashSet.contains(string)) {
            return true;
        }
        StringBuilder sbM2789 = AbstractC1194.m2788(str, ":");
        sbM2789.append(AbstractC1194.m2794(i));
        linkedHashSet.add(sbM2789.toString());
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m5357() {
        Object c2585;
        boolean zBooleanValue;
        int i = AbstractC0743.f2838[0];
        if (AbstractC1555.f5422[AbstractC2784.m4759(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c2585 = Boolean.TRUE;
            } catch (Throwable th) {
                c2585 = new C2585(th);
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
        return (i != 2) && f11601;
    }
}
