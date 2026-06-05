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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3377Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int[] f10549Ujhhgtgfeyxiexzf = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Map f10550Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Map f10551Ujhhgtgfeyxiexzf;

    static {
        C3374Ujhhgtgfeyxiexzf c3374Ujhhgtgfeyxiexzf = new C3374Ujhhgtgfeyxiexzf();
        C3375Ujhhgtgfeyxiexzf c3375Ujhhgtgfeyxiexzf = new C3375Ujhhgtgfeyxiexzf();
        HashMap map = new HashMap();
        map.put("fcnt", c3374Ujhhgtgfeyxiexzf);
        map.put("google", c3374Ujhhgtgfeyxiexzf);
        map.put("hmd global", c3374Ujhhgtgfeyxiexzf);
        map.put("infinix", c3374Ujhhgtgfeyxiexzf);
        map.put("infinix mobility limited", c3374Ujhhgtgfeyxiexzf);
        map.put("itel", c3374Ujhhgtgfeyxiexzf);
        map.put("kyocera", c3374Ujhhgtgfeyxiexzf);
        map.put("lenovo", c3374Ujhhgtgfeyxiexzf);
        map.put("lge", c3374Ujhhgtgfeyxiexzf);
        map.put("meizu", c3374Ujhhgtgfeyxiexzf);
        map.put("motorola", c3374Ujhhgtgfeyxiexzf);
        map.put("nothing", c3374Ujhhgtgfeyxiexzf);
        map.put("oneplus", c3374Ujhhgtgfeyxiexzf);
        map.put("oppo", c3374Ujhhgtgfeyxiexzf);
        map.put("realme", c3374Ujhhgtgfeyxiexzf);
        map.put("robolectric", c3374Ujhhgtgfeyxiexzf);
        map.put("samsung", c3375Ujhhgtgfeyxiexzf);
        map.put("sharp", c3374Ujhhgtgfeyxiexzf);
        map.put("shift", c3374Ujhhgtgfeyxiexzf);
        map.put("sony", c3374Ujhhgtgfeyxiexzf);
        map.put("tcl", c3374Ujhhgtgfeyxiexzf);
        map.put("tecno", c3374Ujhhgtgfeyxiexzf);
        map.put("tecno mobile limited", c3374Ujhhgtgfeyxiexzf);
        map.put("vivo", c3374Ujhhgtgfeyxiexzf);
        map.put("wingtech", c3374Ujhhgtgfeyxiexzf);
        map.put("xiaomi", c3374Ujhhgtgfeyxiexzf);
        f10550Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c3374Ujhhgtgfeyxiexzf);
        map2.put("jio", c3374Ujhhgtgfeyxiexzf);
        f10551Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Context m4880Ujhhgtgfeyxiexzf(C0324Ujhhgtgfeyxiexzf c0324Ujhhgtgfeyxiexzf) {
        int resourceId;
        Locale locale;
        InterfaceC3376Ujhhgtgfeyxiexzf interfaceC3376Ujhhgtgfeyxiexzf;
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            int i2 = AbstractC2624Ujhhgtgfeyxiexzf.f8452Ujhhgtgfeyxiexzf;
            if (i >= 33) {
                TypedArray typedArrayObtainStyledAttributes = c0324Ujhhgtgfeyxiexzf.obtainStyledAttributes(f10549Ujhhgtgfeyxiexzf);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != 0) {
                    return new ContextThemeWrapper(c0324Ujhhgtgfeyxiexzf, resourceId);
                }
            } else if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                if ("REL".equals(str)) {
                    String str2 = Build.MANUFACTURER;
                    locale = Locale.ROOT;
                    interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10550Ujhhgtgfeyxiexzf.get(str2.toLowerCase(locale));
                    if (interfaceC3376Ujhhgtgfeyxiexzf == null) {
                        interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10551Ujhhgtgfeyxiexzf.get(Build.BRAND.toLowerCase(locale));
                    }
                    if (interfaceC3376Ujhhgtgfeyxiexzf != null && interfaceC3376Ujhhgtgfeyxiexzf.isSupported()) {
                        TypedArray typedArrayObtainStyledAttributes2 = c0324Ujhhgtgfeyxiexzf.obtainStyledAttributes(f10549Ujhhgtgfeyxiexzf);
                        resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c0324Ujhhgtgfeyxiexzf, resourceId);
                        }
                    }
                } else {
                    Locale locale2 = Locale.ROOT;
                    Integer num2 = str.toUpperCase(locale2).equals("BAKLAVA") ? num : null;
                    num = "Tiramisu".toUpperCase(locale2).equals("BAKLAVA") ? 0 : null;
                    if (num2 == null || num == null ? !(num2 == null && num == null) ? num2 != null : str.toUpperCase(locale2).compareTo("Tiramisu".toUpperCase(locale2)) >= 0 : num2.intValue() < num.intValue()) {
                        String str3 = Build.MANUFACTURER;
                        locale = Locale.ROOT;
                        interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10550Ujhhgtgfeyxiexzf.get(str3.toLowerCase(locale));
                        if (interfaceC3376Ujhhgtgfeyxiexzf == null) {
                            interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10551Ujhhgtgfeyxiexzf.get(Build.BRAND.toLowerCase(locale));
                        }
                        if (interfaceC3376Ujhhgtgfeyxiexzf != null) {
                            TypedArray typedArrayObtainStyledAttributes3 = c0324Ujhhgtgfeyxiexzf.obtainStyledAttributes(f10549Ujhhgtgfeyxiexzf);
                            resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
                            typedArrayObtainStyledAttributes3.recycle();
                            if (resourceId != 0) {
                                return new ContextThemeWrapper(c0324Ujhhgtgfeyxiexzf, resourceId);
                            }
                        }
                    } else {
                        TypedArray typedArrayObtainStyledAttributes4 = c0324Ujhhgtgfeyxiexzf.obtainStyledAttributes(f10549Ujhhgtgfeyxiexzf);
                        resourceId = typedArrayObtainStyledAttributes4.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes4.recycle();
                        if (resourceId != 0) {
                            return new ContextThemeWrapper(c0324Ujhhgtgfeyxiexzf, resourceId);
                        }
                    }
                }
            } else {
                String str4 = Build.MANUFACTURER;
                locale = Locale.ROOT;
                interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10550Ujhhgtgfeyxiexzf.get(str4.toLowerCase(locale));
                if (interfaceC3376Ujhhgtgfeyxiexzf == null) {
                    interfaceC3376Ujhhgtgfeyxiexzf = (InterfaceC3376Ujhhgtgfeyxiexzf) f10551Ujhhgtgfeyxiexzf.get(Build.BRAND.toLowerCase(locale));
                }
                if (interfaceC3376Ujhhgtgfeyxiexzf != null) {
                    TypedArray typedArrayObtainStyledAttributes5 = c0324Ujhhgtgfeyxiexzf.obtainStyledAttributes(f10549Ujhhgtgfeyxiexzf);
                    resourceId = typedArrayObtainStyledAttributes5.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes5.recycle();
                    if (resourceId != 0) {
                        return new ContextThemeWrapper(c0324Ujhhgtgfeyxiexzf, resourceId);
                    }
                }
            }
        }
        return c0324Ujhhgtgfeyxiexzf;
    }
}
