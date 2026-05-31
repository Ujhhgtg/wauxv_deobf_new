package p000;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲁᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3716 extends C3725 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean f11577 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static Method f11578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Class f11579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static Field f11580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static Field f11581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final WindowInsets f11582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1660[] f11583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C1660 f11584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C3729 f11585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1660 f11586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f11587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f11588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Rect[][] f11590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Rect[][] f11591;

    public AbstractC3716(C3729 c3729, WindowInsets windowInsets) {
        super(c3729);
        this.f11584 = null;
        this.f11590 = new Rect[10][];
        this.f11591 = new Rect[10][];
        this.f11582 = windowInsets;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    private C1084 m5260(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f11599.f11601.mo5276()) {
            return C1084.m2773(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2665 c2665M3393 = AbstractC1471.m3393(display, 0);
        C2665 c2665M3394 = AbstractC1471.m3393(display, 1);
        C2665 c2665M3395 = AbstractC1471.m3393(display, 2);
        C2665 c2665M3396 = AbstractC1471.m3393(display, 3);
        return C1084.m2773(point.x, point.y, false, c2665M3393 != null ? c2665M3393.f8639 : 0, c2665M3394 != null ? c2665M3394.f8639 : 0, c2665M3395 != null ? c2665M3395.f8639 : 0, c2665M3396 != null ? c2665M3396.f8639 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    private static List<Rect> m5261(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2234.m4173(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    private Rect[] m5262(C1660 c1660) {
        ArrayList arrayList = new ArrayList();
        int i = c1660.f5615;
        int i2 = c1660.f5618;
        int i3 = c1660.f5617;
        int i4 = c1660.f5616;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c1660.f5615, this.f11588));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f11589, i4));
        }
        if (i3 != 0) {
            int i5 = this.f11589;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f11588));
        }
        if (i2 != 0) {
            int i6 = this.f11588;
            arrayList.add(new Rect(0, i6 - i2, this.f11589, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    private C1660 m5263(int i, boolean z) {
        C1660 c1660M3538 = C1660.f5614;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c1660M3538 = C1660.m3538(c1660M3538, m5284(i2, z));
            }
        }
        return c1660M3538;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    private C1660 m5264() {
        C3729 c3729 = this.f11585;
        return c3729 != null ? c3729.f11601.mo5290() : C1660.f5614;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    private C1660 m5265(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f11577) {
            m5266();
        }
        Method method = f11578;
        if (method != null && f11579 != null && f11580 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f11580.get(f11581.get(objInvoke));
                if (rect != null) {
                    return C1660.m3539(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    private static void m5266() {
        try {
            f11578 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f11579 = cls;
            f11580 = cls.getDeclaredField("mVisibleInsets");
            f11581 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f11580.setAccessible(true);
            f11581.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f11577 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static boolean m5267(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.C3725
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC3716 abstractC3716 = (AbstractC3716) obj;
        return Objects.equals(this.f11586, abstractC3716.f11586) && m5267(this.f11587, abstractC3716.f11587);
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo5268(View view) {
        this.f11589 = view.getWidth();
        this.f11588 = view.getHeight();
        C1660 c1660M5265 = m5265(view);
        if (c1660M5265 == null) {
            c1660M5265 = C1660.f5614;
        }
        m5287(c1660M5265);
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public List<Rect> mo5269(int i) {
        return m5261(this.f11590, i);
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public List<Rect> mo5270(int i) {
        return m5261(this.f11591, i);
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1660 mo5271(int i) {
        return m5263(i, false);
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1660 mo5272() {
        if (this.f11584 == null) {
            WindowInsets windowInsets = this.f11582;
            this.f11584 = C1660.m3539(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f11584;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void mo5273(View view) {
        m5260(view);
    }

    @Override // p000.C3725
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void mo5274() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4173 = AbstractC2234.m4173(i);
            this.f11590[iM4173] = m5262(mo5271(i));
            if (i != 8) {
                this.f11591[iM4173] = m5262(mo5285(i));
            }
        }
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C3729 mo5275(int i, int i2, int i3, int i4) {
        AbstractC3715 c3709;
        C3729 c3729M5305 = C3729.m5305(null, this.f11582);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c3709 = new C3714(c3729M5305);
        } else if (i5 >= 35) {
            c3709 = new C3713(c3729M5305);
        } else if (i5 >= 34) {
            c3709 = new C3712(c3729M5305);
        } else if (i5 >= 31) {
            c3709 = new C3711(c3729M5305);
        } else if (i5 >= 30) {
            c3709 = new C3710(c3729M5305);
        } else {
            c3709 = i5 >= 29 ? new C3709(c3729M5305) : new C3708(c3729M5305);
        }
        c3709.mo5253(C3729.m5304(mo5272(), i, i2, i3, i4));
        c3709.mo5252(C3729.m5304(mo5290(), i, i2, i3, i4));
        return c3709.mo5251();
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean mo5276() {
        return this.f11582.isRound();
    }

    @Override // p000.C3725
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean mo5277(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m5286(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void mo5279(C1660[] c1660Arr) {
        this.f11583 = c1660Arr;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public void mo5280(C3729 c3729) {
        this.f11585 = c3729;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public void mo5281(int i) {
        this.f11587 = i;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void mo5282(Rect[][] rectArr) {
        this.f11590 = (Rect[][]) rectArr.clone();
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public void mo5283(Rect[][] rectArr) {
        this.f11591 = (Rect[][]) rectArr.clone();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public C1660 m5284(int i, boolean z) {
        C1660 c1660Mo5290;
        int i2;
        C1660 c1660 = C1660.f5614;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C1660[] c1660Arr = this.f11583;
                    c1660Mo5290 = c1660Arr != null ? c1660Arr[AbstractC2234.m4173(8)] : null;
                    if (c1660Mo5290 != null) {
                        return c1660Mo5290;
                    }
                    C1660 c1660Mo5272 = mo5272();
                    C1660 c1660M5264 = m5264();
                    int i3 = c1660Mo5272.f5618;
                    if (i3 > c1660M5264.f5618) {
                        return C1660.m3539(0, 0, 0, i3);
                    }
                    C1660 c1661 = this.f11586;
                    if (c1661 != null && !c1661.equals(c1660) && (i2 = this.f11586.f5618) > c1660M5264.f5618) {
                        return C1660.m3539(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo5296();
                    }
                    if (i == 32) {
                        return mo5295();
                    }
                    if (i == 64) {
                        return mo5297();
                    }
                    if (i == 128) {
                        C3729 c3729 = this.f11585;
                        C1082 c1082Mo5294 = c3729 != null ? c3729.f11601.mo5294() : mo5294();
                        if (c1082Mo5294 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C1660.m3539(i4 >= 28 ? AbstractC1081.m2767(c1082Mo5294.f3905) : 0, i4 >= 28 ? AbstractC1081.m2769(c1082Mo5294.f3905) : 0, i4 >= 28 ? AbstractC1081.m2768(c1082Mo5294.f3905) : 0, i4 >= 28 ? AbstractC1081.m2766(c1082Mo5294.f3905) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C1660 c1660M5265 = m5264();
                    C1660 c1660Mo5291 = mo5290();
                    return C1660.m3539(Math.max(c1660M5265.f5615, c1660Mo5291.f5615), 0, Math.max(c1660M5265.f5617, c1660Mo5291.f5617), Math.max(c1660M5265.f5618, c1660Mo5291.f5618));
                }
                if ((this.f11587 & 2) == 0) {
                    C1660 c1660Mo5273 = mo5272();
                    C3729 c37210 = this.f11585;
                    c1660Mo5290 = c37210 != null ? c37210.f11601.mo5290() : null;
                    int iMin = c1660Mo5273.f5618;
                    if (c1660Mo5290 != null) {
                        iMin = Math.min(iMin, c1660Mo5290.f5618);
                    }
                    return C1660.m3539(c1660Mo5273.f5615, 0, c1660Mo5273.f5617, iMin);
                }
            }
        } else {
            if (z) {
                return C1660.m3539(0, Math.max(m5264().f5616, mo5272().f5616), 0, 0);
            }
            if ((this.f11587 & 4) == 0) {
                return C1660.m3539(0, mo5272().f5616, 0, 0);
            }
        }
        return c1660;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public C1660 mo5285(int i) {
        return m5263(i, true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public boolean m5286(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m5284(i, false).equals(C1660.f5614);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public void m5287(C1660 c1660) {
        this.f11586 = c1660;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void mo5278(C1084 c1084) {
    }
}
