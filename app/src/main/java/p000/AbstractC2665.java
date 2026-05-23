package p000;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᛸᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2665 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2416 f8580 = new C2416("list-item-type");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2416 f8581 = new C2416("bullet-list-item-level");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2416 f8582 = new C2416("ordered-list-item-number");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2416 f8583 = new C2416("heading-level");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2416 f8584 = new C2416("link-destination");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2416 f8585 = new C2416("paragraph-is-in-tight-list");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2416 f8586 = new C2416("code-block-info");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final int[] f8587 = {16842752, me.hd.wauxv.R.attr.theme};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int[] f8588 = {me.hd.wauxv.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C0542 f8589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m4657(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4658(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4659(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m4660(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC2784.m4745(i, "startIndex: ", " > endIndex: ", i2));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m4661(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m4662(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC2784.m4745(i, "fromIndex: ", " > toIndex: ", i2));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m4663(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4663(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static int m4664() {
        Object c2585;
        Object c2586;
        boolean zBooleanValue = false;
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
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 != 0) {
            if (iM4759 == 1) {
                return -1;
            }
            throw new C0761();
        }
        try {
            c2586 = Integer.valueOf(XposedBridge.getXposedVersion());
        } catch (Throwable th2) {
            c2586 = new C2585(th2);
        }
        Integer num = (Integer) (c2586 instanceof C2585 ? null : c2586);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m4665() {
        Object c2585;
        String str;
        String string;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        boolean zBooleanValue = false;
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
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM4759 = AbstractC2784.m4759(i);
        Object c2586 = "unknown";
        if (iM4759 != 0) {
            if (iM4759 == 1) {
                return "unknown";
            }
            throw new C0761();
        }
        
        Application applicationM1337 = C0251.m1337();
        if (applicationM1337 != null && (classLoader2 = applicationM1337.getClassLoader()) != null && AbstractC0710.m2134(classLoader2, "me.weishu.exposed.ExposedBridge")) {
            return "TaiChi";
        }
        Application applicationM1338 = C0251.m1337();
        if (applicationM1338 != null && (classLoader = applicationM1338.getClassLoader()) != null && AbstractC0710.m2134(classLoader, "com.bug.load.BugLoad")) {
            return "BugXposed";
        }
        try {
            int i2 = 0;
            C1744 c1744M2482 = AbstractC0968.m2482(AbstractC2519.classToKClass(XposedBridge.class));
            c1744M2482.m3493(true);
            C1299 c1299M3490 = c1744M2482.m3490();
            c1299M3490.f6370 = "TAG";
            AbstractC0750.m2218(c1299M3490.f6372, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.STATIC}, 1));
            C1315 c1315 = (C1315) AbstractC0744.m2192(c1299M3490.resolve());
            if (c1315 != null && (str = (String) c1315.m3024()) != null) {
                if (AbstractC2841.m4836(str)) {
                    str = null;
                }
                if (str != null && (string = AbstractC2841.m4848(AbstractC2849.m4857(AbstractC2849.m4857(str, "Bridge", ""), "-", "")).toString()) != null) {
                    c2586 = string;
                }
            }
        } catch (Throwable th2) {
            c2586 = new C2585(th2);
        }
        String str2 = (String) (c2586 instanceof C2585 ? null : c2586);
        return str2 == null ? "invalid" : str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static int m4666(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC1194.m2779(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static boolean m4667(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static Typeface m4668(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == 2147483647 || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC3681.m5318(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static Set m4669(Set set, Set set2) {
        if (set2.isEmpty()) {
            return AbstractC0744.m2209(set);
        }
        if (false) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(set2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!set2.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static int m4670(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (AbstractC3471.m5081(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (AbstractC3471.m5081(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static int m4671(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case 92 /* 92 */:
                    int i2 = i + 1;
                    if (AbstractC3471.m5081(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static int m4672(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (AbstractC3471.m5081(i2, charSequence)) {
                    i = i2;
                } else {
                    if (92 == c) {
                        return i;
                    }
                    if (false) {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c) {
                    return i;
                }
                if (c == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static Context m4673(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8588, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0841) && ((C0841) context).f3244 == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0841 c0841 = new C0841(context);
        c0841.f3244 = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f8587);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0841.getTheme().applyStyle(resourceId2, true);
        }
        return c0841;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static void m4674(C0519 c0519, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c0519.m1838(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c0519.m1838((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m4675(C0519 c0519, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        c0519.m1838(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c0519.m1838((byte) j);
            j >>= 8;
            i2--;
        }
    }
}
