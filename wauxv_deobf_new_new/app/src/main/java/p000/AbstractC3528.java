package p000;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.io.Closeable;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤞᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3528 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1216 f11115 = new C1216(new C1042(2));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C0179 f11116 = new C0179(20);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2491 m5087(C2491 c2491, long j) {
        return new C2491(j == 19500 ? c2491.m4427() : c2491.m4426());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m5088(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        C1012 c1012 = new C1012(new C0630(type, 2), C3527.f11114, 1);
        StringBuilder sb = new StringBuilder();
        Iterator it = c1012.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        sb.append(AbstractC2909.m4917(AbstractC2713.m4687(c1012), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final void m5089(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final void m5090(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1272.m3094(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static Object[] m5091(Object[]... objArr) {
        if (objArr.length == 0) {
            throw new NullPointerException("There is no arrays to concat!");
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), length);
        int length2 = 0;
        for (Object[] objArr4 : objArr) {
            System.arraycopy(objArr4, 0, objArr3, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArr3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final void m5092(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C1382 m5093(Context context) {
        ProviderInfo providerInfo;
        C1380 c1380;
        ApplicationInfo applicationInfo;
        C0348 c0987 = Build.VERSION.SDK_INT >= 28 ? new C0987(17) : new C0348(17);
        PackageManager packageManager = context.getPackageManager();
        C1787.m3664(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c1380 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1622 = c0987.mo1622(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1622) {
                    arrayList.add(signature.toByteArray());
                }
                c1380 = new C1380(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c1380 = null;
            }
        }
        if (c1380 == null) {
            return null;
        }
        return new C1382(new C1381(context, c1380));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2367 m5094(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC1095.m2792(it);
            }
            return new C2367(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC1095.m2792(it2);
            }
            return new C2367(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C2367 c2367M5094 = m5094(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC0741.m2313(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        if (it3.hasNext()) {
            throw AbstractC1095.m2792(it3);
        }
        return new C2367(cls, c2367M5094, arrayList3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static int m5095() {
        Object c2641;
        Object c2642;
        boolean zBooleanValue = false;
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
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 != 0) {
            if (iM4792 == 1) {
                return -1;
            }
            throw new C0758();
        }
        try {
            c2642 = Integer.valueOf(XposedBridge.getXposedVersion());
        } catch (Throwable th2) {
            c2642 = new C2641(th2);
        }
        Integer num = (Integer) (c2642 instanceof C2641 ? null : c2642);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Type m5096(C3513 c3513) {
        Class clsMo2209 = c3513.f11087.mo2209();
        List list = Collections.EMPTY_LIST;
        if (list.isEmpty()) {
            return clsMo2209;
        }
        if (!clsMo2209.isArray()) {
            return m5094(clsMo2209, list);
        }
        if (clsMo2209.getComponentType().isPrimitive()) {
            return clsMo2209;
        }
        if (AbstractC0739.m2299(list) != null) {
            throw new ClassCastException();
        }
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + c3513);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static String m5097() {
        Object c2641;
        String str;
        String string;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        boolean zBooleanValue = false;
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
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM4792 = AbstractC2844.m4792(i);
        Object c2642 = "unknown";
        if (iM4792 != 0) {
            if (iM4792 == 1) {
                return "unknown";
            }
            throw new C0758();
        }
        C0261.f1489.getClass();
        Application applicationM1483 = C0261.m1483();
        if (applicationM1483 != null && (classLoader2 = applicationM1483.getClassLoader()) != null && AbstractC0705.m2227(classLoader2, "me.weishu.exposed.ExposedBridge")) {
            return "TaiChi";
        }
        Application applicationM1484 = C0261.m1483();
        if (applicationM1484 != null && (classLoader = applicationM1484.getClassLoader()) != null && AbstractC0705.m2227(classLoader, "com.bug.load.BugLoad")) {
            return "BugXposed";
        }
        try {
            int i2 = AbstractC1768.f5906;
            C1681 c1681M4711 = AbstractC2727.m4711(AbstractC2574.m4549(XposedBridge.class));
            c1681M4711.m3561(true);
            C1300 c1300M3558 = c1681M4711.m3558();
            c1300M3558.f6475 = "TAG";
            AbstractC0745.m2317(c1300M3558.f6477, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.STATIC}, 1));
            C1316 c1316 = (C1316) AbstractC0739.m2291(c1300M3558.m3117());
            if (c1316 != null && (str = (String) c1316.m3127()) != null) {
                if (AbstractC2901.m4869(str)) {
                    str = null;
                }
                if (str != null && (string = AbstractC2901.m4882(AbstractC2909.m4918(AbstractC2909.m4918(str, "Bridge", ""), "-", "")).toString()) != null) {
                    c2642 = string;
                }
            }
        } catch (Throwable th2) {
            c2642 = new C2641(th2);
        }
        String str2 = (String) (c2642 instanceof C2641 ? null : c2642);
        return str2 == null ? "invalid" : str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static ArrayList m5098(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static void m5099(C2013 c2013, AbstractC1698 abstractC1698) {
        Method method;
        if (c2013 == null || (method = c2013.f6671) == null) {
            return;
        }
        m5100(method, abstractC1698);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C3750 m5100(Member member, AbstractC1698 abstractC1698) {
        Object c2641;
        boolean zBooleanValue;
        Object c2642;
        int i;
        int[] iArr = AbstractC3744.f11721;
        C3745 c3745 = null;
        if (member != null) {
            boolean zBooleanValue2 = false;
            int i2 = iArr[0];
            if (AbstractC1567.f5453[AbstractC2844.m4792(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2641 = Boolean.TRUE;
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                boolean z = c2641 instanceof C2641;
                Object obj = c2641;
                if (z) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            int iM4792 = AbstractC2844.m4792(i2);
            if (iM4792 != 0) {
                if (iM4792 != 1) {
                    throw new C0758();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int i3 = iArr[0];
            if (AbstractC1567.f5453[AbstractC2844.m4792(i3)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2642 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                Boolean bool2 = (Boolean) (c2642 instanceof C2641 ? null : c2642);
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
            }
            if (!zBooleanValue2) {
                i3 = 2;
            }
            int iM4793 = AbstractC2844.m4792(i3);
            if (iM4793 != 0) {
                if (iM4793 != 1) {
                    throw new C0758();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int iM4794 = AbstractC2844.m4792(abstractC1698.mo1480());
            if (iM4794 == 0) {
                i = 50;
            } else if (iM4794 == 1) {
                i = -10000;
            } else {
                if (iM4794 != 2) {
                    throw new C0758();
                }
                i = 10000;
            }
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(member, new C2408(abstractC1698, i));
            c3745 = new C3745(new C1570(unhookHookMethod, 0), new C1570(unhookHookMethod, 1));
        }
        return new C3750(c3745);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static boolean m5101(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final long m5102(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC2942.f9404;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM4915 = AbstractC2908.m4915(property);
        if (lM4915 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM4915.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static int m5103(int i, int i2, String str) {
        return (int) m5102(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public abstract InputFilter[] mo2909(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public abstract boolean mo2910();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public abstract void mo2911(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public abstract void mo2912(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public abstract TransformationMethod mo2913(TransformationMethod transformationMethod);
}
