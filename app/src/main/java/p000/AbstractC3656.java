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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3656 extends C3665 {

    public static boolean f11428 = false;

    public static Method f11429;

    public static Class f11430;

    public static Field f11431;

    public static Field f11432;

    public final WindowInsets f11433;

    public C1646[] f11434;

    public C1646 f11435;

    public C3669 f11436;

    public C1646 f11437;

    public int f11438;

    public int f11439;

    public int f11440;

    public Rect[][] f11441;

    public Rect[][] f11442;

    public AbstractC3656(C3669 c3669, WindowInsets windowInsets) {
        super(c3669);
        this.f11435 = null;
        this.f11441 = new Rect[10][];
        this.f11442 = new Rect[10][];
        this.f11433 = windowInsets;
    }

    private C1079 m5254(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f11450.f11452.mo5270()) {
            return C1079.m2647(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2604 c2604M4132 = AbstractC2209.m4132(display, 0);
        C2604 c2604M4133 = AbstractC2209.m4132(display, 1);
        C2604 c2604M4134 = AbstractC2209.m4132(display, 2);
        C2604 c2604M4135 = AbstractC2209.m4132(display, 3);
        return C1079.m2647(point.x, point.y, false, c2604M4132 != null ? c2604M4132.f8474 : 0, c2604M4133 != null ? c2604M4133.f8474 : 0, c2604M4134 != null ? c2604M4134.f8474 : 0, c2604M4135 != null ? c2604M4135.f8474 : 0);
    }

    private static List<Rect> m5255(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2665.m4666(i2)]) != null) {
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

    private Rect[] m5256(C1646 c1646) {
        ArrayList arrayList = new ArrayList();
        int i = c1646.f5580;
        int i2 = c1646.f5583;
        int i3 = c1646.f5582;
        int i4 = c1646.f5581;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c1646.f5580, this.f11439));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f11440, i4));
        }
        if (i3 != 0) {
            int i5 = this.f11440;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f11439));
        }
        if (i2 != 0) {
            int i6 = this.f11439;
            arrayList.add(new Rect(0, i6 - i2, this.f11440, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private C1646 m5257(int i, boolean z) {
        C1646 c1646M3374 = C1646.f5579;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c1646M3374 = C1646.m3374(c1646M3374, m5278(i2, z));
            }
        }
        return c1646M3374;
    }

    private C1646 m5258() {
        C3669 c3669 = this.f11436;
        return c3669 != null ? c3669.f11452.mo5284() : C1646.f5579;
    }

    private C1646 m5259(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f11428) {
            m5260();
        }
        Method method = f11429;
        if (method != null && f11430 != null && f11431 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f11431.get(f11432.get(objInvoke));
                if (rect != null) {
                    return C1646.m3375(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void m5260() {
        try {
            f11429 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f11430 = cls;
            f11431 = cls.getDeclaredField("mVisibleInsets");
            f11432 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f11431.setAccessible(true);
            f11432.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f11428 = true;
    }

    public static boolean m5261(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.C3665
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC3656 abstractC3656 = (AbstractC3656) obj;
        return Objects.equals(this.f11437, abstractC3656.f11437) && m5261(this.f11438, abstractC3656.f11438);
    }

    @Override // p000.C3665
    public void mo5262(View view) {
        this.f11440 = view.getWidth();
        this.f11439 = view.getHeight();
        C1646 c1646M5259 = m5259(view);
        if (c1646M5259 == null) {
            c1646M5259 = C1646.f5579;
        }
        m5281(c1646M5259);
    }

    @Override // p000.C3665
    public List<Rect> mo5263(int i) {
        return m5255(this.f11441, i);
    }

    @Override // p000.C3665
    public List<Rect> mo5264(int i) {
        return m5255(this.f11442, i);
    }

    @Override // p000.C3665
    public C1646 mo5265(int i) {
        return m5257(i, false);
    }

    @Override // p000.C3665
    public final C1646 mo5266() {
        if (this.f11435 == null) {
            WindowInsets windowInsets = this.f11433;
            this.f11435 = C1646.m3375(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f11435;
    }

    @Override // p000.C3665
    public void mo5267(View view) {
        m5254(view);
    }

    @Override // p000.C3665
    @SuppressLint({"WrongConstant"})
    public void mo5268() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4666 = AbstractC2665.m4666(i);
            this.f11441[iM4666] = m5256(mo5265(i));
            if (i != 8) {
                this.f11442[iM4666] = m5256(mo5279(i));
            }
        }
    }

    @Override // p000.C3665
    public C3669 mo5269(int i, int i2, int i3, int i4) {
        AbstractC3655 c3649;
        C3669 c3669M5299 = C3669.m5299(null, this.f11433);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c3649 = new C3654(c3669M5299);
        } else if (i5 >= 35) {
            c3649 = new C3653(c3669M5299);
        } else if (i5 >= 34) {
            c3649 = new C3652(c3669M5299);
        } else if (i5 >= 31) {
            c3649 = new C3651(c3669M5299);
        } else if (i5 >= 30) {
            c3649 = new C3650(c3669M5299);
        } else {
            c3649 = i5 >= 29 ? new C3649(c3669M5299) : new C3648(c3669M5299);
        }
        c3649.mo5247(C3669.m5298(mo5266(), i, i2, i3, i4));
        c3649.mo5246(C3669.m5298(mo5284(), i, i2, i3, i4));
        return c3649.mo5245();
    }

    @Override // p000.C3665
    public boolean mo5270() {
        return this.f11433.isRound();
    }

    @Override // p000.C3665
    @SuppressLint({"WrongConstant"})
    public boolean mo5271(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m5280(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.C3665
    public void mo5273(C1646[] c1646Arr) {
        this.f11434 = c1646Arr;
    }

    @Override // p000.C3665
    public void mo5274(C3669 c3669) {
        this.f11436 = c3669;
    }

    @Override // p000.C3665
    public void mo5275(int i) {
        this.f11438 = i;
    }

    @Override // p000.C3665
    public void mo5276(Rect[][] rectArr) {
        this.f11441 = (Rect[][]) rectArr.clone();
    }

    @Override // p000.C3665
    public void mo5277(Rect[][] rectArr) {
        this.f11442 = (Rect[][]) rectArr.clone();
    }

    public C1646 m5278(int i, boolean z) {
        C1646 c1646Mo5284;
        int i2;
        C1646 c1646 = C1646.f5579;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C1646[] c1646Arr = this.f11434;
                    c1646Mo5284 = c1646Arr != null ? c1646Arr[AbstractC2665.m4666(8)] : null;
                    if (c1646Mo5284 != null) {
                        return c1646Mo5284;
                    }
                    C1646 c1646Mo5266 = mo5266();
                    C1646 c1646M5258 = m5258();
                    int i3 = c1646Mo5266.f5583;
                    if (i3 > c1646M5258.f5583) {
                        return C1646.m3375(0, 0, 0, i3);
                    }
                    C1646 c1647 = this.f11437;
                    if (c1647 != null && !c1647.equals(c1646) && (i2 = this.f11437.f5583) > c1646M5258.f5583) {
                        return C1646.m3375(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo5290();
                    }
                    if (i == 32) {
                        return mo5289();
                    }
                    if (i == 64) {
                        return mo5291();
                    }
                    if (i == 128) {
                        C3669 c3669 = this.f11436;
                        C1077 c1077Mo5288 = c3669 != null ? c3669.f11452.mo5288() : mo5288();
                        if (c1077Mo5288 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C1646.m3375(i4 >= 28 ? AbstractC1076.m2641(c1077Mo5288.f3894) : 0, i4 >= 28 ? AbstractC1076.m2643(c1077Mo5288.f3894) : 0, i4 >= 28 ? AbstractC1076.m2642(c1077Mo5288.f3894) : 0, i4 >= 28 ? AbstractC1076.m2640(c1077Mo5288.f3894) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C1646 c1646M5259 = m5258();
                    C1646 c1646Mo5285 = mo5284();
                    return C1646.m3375(Math.max(c1646M5259.f5580, c1646Mo5285.f5580), 0, Math.max(c1646M5259.f5582, c1646Mo5285.f5582), Math.max(c1646M5259.f5583, c1646Mo5285.f5583));
                }
                if ((this.f11438 & 2) == 0) {
                    C1646 c1646Mo5267 = mo5266();
                    C3669 c36610 = this.f11436;
                    c1646Mo5284 = c36610 != null ? c36610.f11452.mo5284() : null;
                    int iMin = c1646Mo5267.f5583;
                    if (c1646Mo5284 != null) {
                        iMin = Math.min(iMin, c1646Mo5284.f5583);
                    }
                    return C1646.m3375(c1646Mo5267.f5580, 0, c1646Mo5267.f5582, iMin);
                }
            }
        } else {
            if (z) {
                return C1646.m3375(0, Math.max(m5258().f5581, mo5266().f5581), 0, 0);
            }
            if ((this.f11438 & 4) == 0) {
                return C1646.m3375(0, mo5266().f5581, 0, 0);
            }
        }
        return c1646;
    }

    public C1646 mo5279(int i) {
        return m5257(i, true);
    }

    public boolean m5280(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m5278(i, false).equals(C1646.f5579);
    }

    public void m5281(C1646 c1646) {
        this.f11437 = c1646;
    }

    @Override // p000.C3665
    public void mo5272(C1079 c1079) {
    }
}
