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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᤞᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1134 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int[] f4207 = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Map f4208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Map f4209;

    static {
        C1131 c1131 = new C1131();
        C1132 c1132 = new C1132();
        HashMap map = new HashMap();
        map.put("fcnt", c1131);
        map.put("google", c1131);
        map.put("hmd global", c1131);
        map.put("infinix", c1131);
        map.put("infinix mobility limited", c1131);
        map.put("itel", c1131);
        map.put("kyocera", c1131);
        map.put("lenovo", c1131);
        map.put("lge", c1131);
        map.put("meizu", c1131);
        map.put("motorola", c1131);
        map.put("nothing", c1131);
        map.put("oneplus", c1131);
        map.put("oppo", c1131);
        map.put("realme", c1131);
        map.put("robolectric", c1131);
        map.put("samsung", c1132);
        map.put("sharp", c1131);
        map.put("shift", c1131);
        map.put("sony", c1131);
        map.put("tcl", c1131);
        map.put("tecno", c1131);
        map.put("tecno mobile limited", c1131);
        map.put("vivo", c1131);
        map.put("wingtech", c1131);
        map.put("xiaomi", c1131);
        f4208 = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c1131);
        map2.put("jio", c1131);
        f4209 = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Context m2849(C2039 c2039) {
        int resourceId;
        Locale locale;
        InterfaceC1133 interfaceC1133;
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            int i2 = AbstractC0487.f2135;
            if (i >= 33) {
                TypedArray typedArrayObtainStyledAttributes = c2039.obtainStyledAttributes(f4207);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != 0) {
                    return new ContextThemeWrapper(c2039, resourceId);
                }
            } else if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                if ("REL".equals(str)) {
                    String str2 = Build.MANUFACTURER;
                    locale = Locale.ROOT;
                    interfaceC1133 = (InterfaceC1133) f4208.get(str2.toLowerCase(locale));
                    if (interfaceC1133 == null) {
                        interfaceC1133 = (InterfaceC1133) f4209.get(Build.BRAND.toLowerCase(locale));
                    }
                    if (interfaceC1133 != null && interfaceC1133.isSupported()) {
                        TypedArray typedArrayObtainStyledAttributes2 = c2039.obtainStyledAttributes(f4207);
                        resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c2039, resourceId);
                        }
                    }
                } else {
                    Locale locale2 = Locale.ROOT;
                    Integer num2 = str.toUpperCase(locale2).equals("BAKLAVA") ? num : null;
                    num = "Tiramisu".toUpperCase(locale2).equals("BAKLAVA") ? 0 : null;
                    if (num2 == null || num == null ? !(num2 == null && num == null) ? num2 != null : str.toUpperCase(locale2).compareTo("Tiramisu".toUpperCase(locale2)) >= 0 : num2.intValue() < num.intValue()) {
                        String str3 = Build.MANUFACTURER;
                        locale = Locale.ROOT;
                        interfaceC1133 = (InterfaceC1133) f4208.get(str3.toLowerCase(locale));
                        if (interfaceC1133 == null) {
                            interfaceC1133 = (InterfaceC1133) f4209.get(Build.BRAND.toLowerCase(locale));
                        }
                        if (interfaceC1133 != null) {
                            TypedArray typedArrayObtainStyledAttributes3 = c2039.obtainStyledAttributes(f4207);
                            resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
                            typedArrayObtainStyledAttributes3.recycle();
                            if (resourceId != 0) {
                                return new ContextThemeWrapper(c2039, resourceId);
                            }
                        }
                    } else {
                        TypedArray typedArrayObtainStyledAttributes4 = c2039.obtainStyledAttributes(f4207);
                        resourceId = typedArrayObtainStyledAttributes4.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes4.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c2039, resourceId);
                        }
                    }
                }
            } else {
                String str4 = Build.MANUFACTURER;
                locale = Locale.ROOT;
                interfaceC1133 = (InterfaceC1133) f4208.get(str4.toLowerCase(locale));
                if (interfaceC1133 == null) {
                    interfaceC1133 = (InterfaceC1133) f4209.get(Build.BRAND.toLowerCase(locale));
                }
                if (interfaceC1133 != null) {
                    TypedArray typedArrayObtainStyledAttributes5 = c2039.obtainStyledAttributes(f4207);
                    resourceId = typedArrayObtainStyledAttributes5.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes5.recycle();
                    if (resourceId != 0) {
                        return new ContextThemeWrapper(c2039, resourceId);
                    }
                }
            }
        }
        return c2039;
    }
}
