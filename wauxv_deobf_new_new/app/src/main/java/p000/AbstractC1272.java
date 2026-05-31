package p000;

import android.R;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1272 implements InterfaceC0978, InterfaceC0764 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static volatile ExecutorService f4632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int[] f4633 = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f4634 = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f4635 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f4636 = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final int[] f4637 = {R.attr.drawable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final int[] f4638 = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C1174 f4639 = new C1174("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1174 f4640 = new C1174("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1174 f4641 = new C1174("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C1174 f4642 = new C1174("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C1174 f4643 = new C1174("SEALED", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1187 f4644 = new C1187(false);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1187 f4645 = new C1187(true);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Toast f4646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1651 m3092(String str, InterfaceC1767 interfaceC1767) {
        return new C1651(str, new C1652(interfaceC1767));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1931 m3093(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C1931(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m3094(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC1702.f5782;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC2397.f7676;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static int m3095(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m3096(File file) {
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
            z = m3096(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static void m3097(SharedPreferencesC1271 sharedPreferencesC1271, String str) {
        Log.e("FastKV", sharedPreferencesC1271.f4608 + " " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static View m3098(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static Executor m3099() {
        if (f4632 == null) {
            synchronized (AbstractC1272.class) {
                try {
                    if (f4632 == null) {
                        f4632 = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4632;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m3100(SharedPreferencesC1271 sharedPreferencesC1271, String str) {
        Log.i("FastKV", sharedPreferencesC1271.f4608 + " " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static CharSequence m3101(CharSequence charSequence) {
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Object m3102(Object obj) {
        InterfaceC1637 interfaceC1637;
        C1638 c1638 = obj instanceof C1638 ? (C1638) obj : null;
        return (c1638 == null || (interfaceC1637 = c1638.f5531) == null) ? obj : interfaceC1637;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC0978 mo2330(C2448 c2448, int i) {
        return mo2641(c2448.mo3644(i));
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo2637() {
        m3103();
        throw null;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public char mo2638() {
        m3103();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m3103() {
        throw new C1667(AbstractC2574.m4549(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public double mo2332(C2448 c2448, int i) {
        return mo2648();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public char mo2333(C2448 c2448, int i) {
        return mo2638();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public float mo2334(C2448 c2448, int i) {
        return mo2647();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public byte mo2335(C2448 c2448, int i) {
        return mo2645();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public String mo2336(InterfaceC2715 interfaceC2715, int i) {
        return mo2642();
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract int mo2640();

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public short mo2337(C2448 c2448, int i) {
        return mo2646();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public Object mo2338(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        return mo2639(interfaceC1767);
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public int mo2339(InterfaceC2715 interfaceC2715, int i) {
        return mo2640();
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public String mo2642() {
        m3103();
        throw null;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public abstract long mo2643();

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public boolean mo2644() {
        return true;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public Object mo2340(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        if (interfaceC1767.mo1509().mo3638() || mo2644()) {
            return mo2639(interfaceC1767);
        }
        return null;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public long mo2341(C2448 c2448, int i) {
        return mo2643();
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ */
    public boolean mo2342(InterfaceC2715 interfaceC2715, int i) {
        return mo2637();
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public abstract byte mo2645();

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public abstract short mo2646();

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public float mo2647() {
        m3103();
        throw null;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public double mo2648() {
        m3103();
        throw null;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo2329(InterfaceC2715 interfaceC2715) {
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        return this;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public InterfaceC0978 mo2641(InterfaceC2715 interfaceC2715) {
        return this;
    }
}
