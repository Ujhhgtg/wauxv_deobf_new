package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲈᤝᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3755 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean f11758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean f11759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f11760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C1559 f11764;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f11761 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f11762 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f11763 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String f11765 = "";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String f11766 = "";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2343 m5363(int i, String str, String str2, ClassLoader classLoader, ApplicationInfo applicationInfo, AbstractC2639 abstractC2639, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            classLoader = null;
        }
        if ((i2 & 16) != 0) {
            applicationInfo = null;
        }
        f11760 = i == 1;
        LinkedHashMap linkedHashMap = f11763;
        if (linkedHashMap.get(str) != null) {
            C2343 c2343 = (C2343) linkedHashMap.get(str);
            if (c2343 != null) {
                c2343.f7560 = i;
                if (str != null) {
                    if (AbstractC2901.m4869(str)) {
                        str = null;
                    }
                    if (str != null) {
                        c2343.f7561 = str;
                    }
                }
                if (str2 != null) {
                    if (AbstractC2901.m4869(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        c2343.f7562 = str2;
                    }
                }
                if (classLoader != null) {
                    ClassLoader classLoader2 = (i == 1 || (classLoader instanceof PathClassLoader)) ? classLoader : null;
                    if (classLoader2 != null) {
                        c2343.f7563 = classLoader2;
                    }
                }
                if (applicationInfo != null) {
                    c2343.f7564 = applicationInfo;
                }
                return c2343;
            }
        } else if (i == 1 || classLoader != null) {
            String str3 = str == null ? "android" : str;
            if (str2 == null) {
                str2 = "android";
            }
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            C2343 c2344 = new C2343();
            c2344.f7560 = i;
            c2344.f7561 = str3;
            c2344.f7562 = str2;
            c2344.f7563 = classLoader;
            c2344.f7564 = applicationInfo;
            if (str == null) {
                str = "android";
            }
            linkedHashMap.put(str, c2344);
            return c2344;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m5364(int i, String str) {
        if (str == null) {
            return false;
        }
        StringBuilder sbM2803 = AbstractC1095.m2803(str, ":");
        sbM2803.append(AbstractC1095.m2810(i));
        String string = sbM2803.toString();
        LinkedHashSet linkedHashSet = f11762;
        if (linkedHashSet.contains(string)) {
            return true;
        }
        StringBuilder sbM2804 = AbstractC1095.m2803(str, ":");
        sbM2804.append(AbstractC1095.m2810(i));
        linkedHashSet.add(sbM2804.toString());
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m5365() {
        Object c2641;
        boolean zBooleanValue;
        int i = AbstractC3744.f11721[0];
        if (AbstractC1567.f5453[AbstractC2844.m4792(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c2641 = Boolean.TRUE;
            } catch (Throwable th) {
                c2641 = new C2641(th);
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
        return (i != 2) && f11758;
    }
}
