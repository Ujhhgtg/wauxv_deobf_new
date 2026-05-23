package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᤞᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1128 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int[] f4196 = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Map f4197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Map f4198;

    static {
        C1125 c1125 = new C1125();
        C1126 c1126 = new C1126();
        HashMap map = new HashMap();
        map.put("fcnt", c1125);
        map.put("google", c1125);
        map.put("hmd global", c1125);
        map.put("infinix", c1125);
        map.put("infinix mobility limited", c1125);
        map.put("itel", c1125);
        map.put("kyocera", c1125);
        map.put("lenovo", c1125);
        map.put("lge", c1125);
        map.put("meizu", c1125);
        map.put("motorola", c1125);
        map.put("nothing", c1125);
        map.put("oneplus", c1125);
        map.put("oppo", c1125);
        map.put("realme", c1125);
        map.put("robolectric", c1125);
        map.put("samsung", c1126);
        map.put("sharp", c1125);
        map.put("shift", c1125);
        map.put("sony", c1125);
        map.put("tcl", c1125);
        map.put("tecno", c1125);
        map.put("tecno mobile limited", c1125);
        map.put("vivo", c1125);
        map.put("wingtech", c1125);
        map.put("xiaomi", c1125);
        f4197 = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c1125);
        map2.put("jio", c1125);
        f4198 = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Context m2700(C2009 c2009) {
        int resourceId;
        Locale locale;
        InterfaceC1127 interfaceC1127;
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            int i2 = AbstractC0510.f2179;
            if (i >= 33) {
                TypedArray typedArrayObtainStyledAttributes = c2009.obtainStyledAttributes(f4196);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != 0) {
                    return new ContextThemeWrapper(c2009, resourceId);
                }
            } else if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                if ("REL".equals(str)) {
                    String str2 = Build.MANUFACTURER;
                    locale = Locale.ROOT;
                    interfaceC1127 = (InterfaceC1127) f4197.get(str2.toLowerCase(locale));
                    if (interfaceC1127 == null) {
                        interfaceC1127 = (InterfaceC1127) f4198.get(Build.BRAND.toLowerCase(locale));
                    }
                    if (interfaceC1127 != null && interfaceC1127.isSupported()) {
                        TypedArray typedArrayObtainStyledAttributes2 = c2009.obtainStyledAttributes(f4196);
                        resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c2009, resourceId);
                        }
                    }
                } else {
                    Locale locale2 = Locale.ROOT;
                    Integer num2 = str.toUpperCase(locale2).equals("BAKLAVA") ? num : null;
                    num = "Tiramisu".toUpperCase(locale2).equals("BAKLAVA") ? 0 : null;
                    if (num2 == null || num == null ? !(num2 == null && num == null) ? num2 != null : str.toUpperCase(locale2).compareTo("Tiramisu".toUpperCase(locale2)) >= 0 : num2.intValue() < num.intValue()) {
                        String str3 = Build.MANUFACTURER;
                        locale = Locale.ROOT;
                        interfaceC1127 = (InterfaceC1127) f4197.get(str3.toLowerCase(locale));
                        if (interfaceC1127 == null) {
                            interfaceC1127 = (InterfaceC1127) f4198.get(Build.BRAND.toLowerCase(locale));
                        }
                        if (interfaceC1127 != null) {
                            TypedArray typedArrayObtainStyledAttributes3 = c2009.obtainStyledAttributes(f4196);
                            resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
                            typedArrayObtainStyledAttributes3.recycle();
                            if (resourceId != 0) {
                                return new ContextThemeWrapper(c2009, resourceId);
                            }
                        }
                    } else {
                        TypedArray typedArrayObtainStyledAttributes4 = c2009.obtainStyledAttributes(f4196);
                        resourceId = typedArrayObtainStyledAttributes4.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes4.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c2009, resourceId);
                        }
                    }
                }
            } else {
                String str4 = Build.MANUFACTURER;
                locale = Locale.ROOT;
                interfaceC1127 = (InterfaceC1127) f4197.get(str4.toLowerCase(locale));
                if (interfaceC1127 == null) {
                    interfaceC1127 = (InterfaceC1127) f4198.get(Build.BRAND.toLowerCase(locale));
                }
                if (interfaceC1127 != null) {
                    TypedArray typedArrayObtainStyledAttributes5 = c2009.obtainStyledAttributes(f4196);
                    resourceId = typedArrayObtainStyledAttributes5.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes5.recycle();
                    if (resourceId != 0) {
                        return new ContextThemeWrapper(c2009, resourceId);
                    }
                }
            }
        }
        return c2009;
    }
}
