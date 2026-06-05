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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2270feyxiexzfUjhhgtg extends C2252Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static boolean f7435Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static Method f7436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Class f7437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Field f7438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static Field f7439Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final WindowInsets f7440Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf[] f7441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7442Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f7443Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f7445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f7446Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f7447Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Rect[][] f7448Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Rect[][] f7449Ujhhgtgfeyxiexzf;

    public AbstractC2270feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, WindowInsets windowInsets) {
        super(c2256feyxiexzfUjhhgtg);
        this.f7442Ujhhgtgfeyxiexzf = null;
        this.f7448Ujhhgtgfeyxiexzf = new Rect[10][];
        this.f7449Ujhhgtgfeyxiexzf = new Rect[10][];
        this.f7440Ujhhgtgfeyxiexzf = windowInsets;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    private C3226feyxiexzfUjhhgtg m3461feyxiexzfUjhhgtg(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f7331Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3441Ujhhgtgfeyxiexzf()) {
            return C3226feyxiexzfUjhhgtg.m4730Ujhhgtgfeyxiexzf(point.x, point.y, true, 0, 0, 0, 0);
        }
        C0942feyxiexzfUjhhgtg c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5216Ujhhgtgfeyxiexzf(display, 0);
        C0942feyxiexzfUjhhgtg c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf2 = AbstractC3611Ujhhgtgfeyxiexzf.m5216Ujhhgtgfeyxiexzf(display, 1);
        C0942feyxiexzfUjhhgtg c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf3 = AbstractC3611Ujhhgtgfeyxiexzf.m5216Ujhhgtgfeyxiexzf(display, 2);
        C0942feyxiexzfUjhhgtg c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf4 = AbstractC3611Ujhhgtgfeyxiexzf.m5216Ujhhgtgfeyxiexzf(display, 3);
        return C3226feyxiexzfUjhhgtg.m4730Ujhhgtgfeyxiexzf(point.x, point.y, false, c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf != null ? c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf.f3787Ujhhgtgfeyxiexzf : 0, c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf2 != null ? c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf2.f3787Ujhhgtgfeyxiexzf : 0, c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf3 != null ? c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf3.f3787Ujhhgtgfeyxiexzf : 0, c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf4 != null ? c0942feyxiexzfUjhhgtgM5216Ujhhgtgfeyxiexzf4.f3787Ujhhgtgfeyxiexzf : 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    private static List<Rect> m3462feyxiexzfUjhhgtg(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC3085Ujhhgtgfeyxiexzf.m4565Ujhhgtgfeyxiexzf(i2)]) != null) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    private Rect[] m3463feyxiexzfUjhhgtg(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
        ArrayList arrayList = new ArrayList();
        int i = c0688Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf;
        int i2 = c0688Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf;
        int i3 = c0688Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf;
        int i4 = c0688Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c0688Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf, this.f7446Ujhhgtgfeyxiexzf));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f7447Ujhhgtgfeyxiexzf, i4));
        }
        if (i3 != 0) {
            int i5 = this.f7447Ujhhgtgfeyxiexzf;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f7446Ujhhgtgfeyxiexzf));
        }
        if (i2 != 0) {
            int i6 = this.f7446Ujhhgtgfeyxiexzf;
            arrayList.add(new Rect(0, i6 - i2, this.f7447Ujhhgtgfeyxiexzf, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    private C0688Ujhhgtgfeyxiexzf m3464feyxiexzfUjhhgtg(int i, boolean z) {
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM1955Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0688UjhhgtgfeyxiexzfM1955Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1955Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfM1955Ujhhgtgfeyxiexzf, m3469feyxiexzfUjhhgtg(i2, z));
            }
        }
        return c0688UjhhgtgfeyxiexzfM1955Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    private C0688Ujhhgtgfeyxiexzf m3465feyxiexzfUjhhgtg() {
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = this.f7443Ujhhgtgfeyxiexzf;
        return c2256feyxiexzfUjhhgtg != null ? c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf.mo3434Ujhhgtgfeyxiexzf() : C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    private C0688Ujhhgtgfeyxiexzf m3466feyxiexzfUjhhgtg(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f7435Ujhhgtgfeyxiexzf) {
            m3467feyxiexzfUjhhgtg();
        }
        Method method = f7436Ujhhgtgfeyxiexzf;
        if (method != null && f7437Ujhhgtgfeyxiexzf != null && f7438Ujhhgtgfeyxiexzf != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f7438Ujhhgtgfeyxiexzf.get(f7439Ujhhgtgfeyxiexzf.get(objInvoke));
                if (rect != null) {
                    return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    private static void m3467feyxiexzfUjhhgtg() {
        try {
            f7436Ujhhgtgfeyxiexzf = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f7437Ujhhgtgfeyxiexzf = cls;
            f7438Ujhhgtgfeyxiexzf = cls.getDeclaredField("mVisibleInsets");
            f7439Ujhhgtgfeyxiexzf = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f7438Ujhhgtgfeyxiexzf.setAccessible(true);
            f7439Ujhhgtgfeyxiexzf.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f7435Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m3468feyxiexzfUjhhgtg(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC2270feyxiexzfUjhhgtg abstractC2270feyxiexzfUjhhgtg = (AbstractC2270feyxiexzfUjhhgtg) obj;
        return Objects.equals(this.f7444Ujhhgtgfeyxiexzf, abstractC2270feyxiexzfUjhhgtg.f7444Ujhhgtgfeyxiexzf) && m3468feyxiexzfUjhhgtg(this.f7445Ujhhgtgfeyxiexzf, abstractC2270feyxiexzfUjhhgtg.f7445Ujhhgtgfeyxiexzf);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo3429Ujhhgtgfeyxiexzf(View view) {
        this.f7447Ujhhgtgfeyxiexzf = view.getWidth();
        this.f7446Ujhhgtgfeyxiexzf = view.getHeight();
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM3466feyxiexzfUjhhgtg = m3466feyxiexzfUjhhgtg(view);
        if (c0688UjhhgtgfeyxiexzfM3466feyxiexzfUjhhgtg == null) {
            c0688UjhhgtgfeyxiexzfM3466feyxiexzfUjhhgtg = C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
        }
        m3471feyxiexzfUjhhgtg(c0688UjhhgtgfeyxiexzfM3466feyxiexzfUjhhgtg);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public List<Rect> mo3430Ujhhgtgfeyxiexzf(int i) {
        return m3462feyxiexzfUjhhgtg(this.f7448Ujhhgtgfeyxiexzf, i);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public List<Rect> mo3431Ujhhgtgfeyxiexzf(int i) {
        return m3462feyxiexzfUjhhgtg(this.f7449Ujhhgtgfeyxiexzf, i);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public C0688Ujhhgtgfeyxiexzf mo3422Ujhhgtgfeyxiexzf(int i) {
        return m3464feyxiexzfUjhhgtg(i, false);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final C0688Ujhhgtgfeyxiexzf mo3436Ujhhgtgfeyxiexzf() {
        if (this.f7442Ujhhgtgfeyxiexzf == null) {
            WindowInsets windowInsets = this.f7440Ujhhgtgfeyxiexzf;
            this.f7442Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f7442Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public void mo3423Ujhhgtgfeyxiexzf(View view) {
        m3461feyxiexzfUjhhgtg(view);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public void mo3438Ujhhgtgfeyxiexzf() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4565Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4565Ujhhgtgfeyxiexzf(i);
            this.f7448Ujhhgtgfeyxiexzf[iM4565Ujhhgtgfeyxiexzf] = m3463feyxiexzfUjhhgtg(mo3422Ujhhgtgfeyxiexzf(i));
            if (i != 8) {
                this.f7449Ujhhgtgfeyxiexzf[iM4565Ujhhgtgfeyxiexzf] = m3463feyxiexzfUjhhgtg(mo3425feyxiexzfUjhhgtg(i));
            }
        }
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public C2256feyxiexzfUjhhgtg mo3439Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        AbstractC2269Ujhhgtgfeyxiexzf c2243feyxiexzfUjhhgtg;
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7440Ujhhgtgfeyxiexzf);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c2243feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        } else if (i5 >= 35) {
            c2243feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        } else if (i5 >= 34) {
            c2243feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        } else if (i5 >= 31) {
            c2243feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        } else if (i5 >= 30) {
            c2243feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        } else {
            c2243feyxiexzfUjhhgtg = i5 >= 29 ? new C2243feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf) : new C2242feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        }
        c2243feyxiexzfUjhhgtg.mo3413Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg.m3449Ujhhgtgfeyxiexzf(mo3436Ujhhgtgfeyxiexzf(), i, i2, i3, i4));
        c2243feyxiexzfUjhhgtg.mo3412Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg.m3449Ujhhgtgfeyxiexzf(mo3434Ujhhgtgfeyxiexzf(), i, i2, i3, i4));
        return c2243feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf();
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public boolean mo3441Ujhhgtgfeyxiexzf() {
        return this.f7440Ujhhgtgfeyxiexzf.isRound();
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public boolean mo3424Ujhhgtgfeyxiexzf(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m3470feyxiexzfUjhhgtg(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public void mo3443Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf[] c0688UjhhgtgfeyxiexzfArr) {
        this.f7441Ujhhgtgfeyxiexzf = c0688UjhhgtgfeyxiexzfArr;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public void mo3444Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        this.f7443Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public void mo3446Ujhhgtgfeyxiexzf(int i) {
        this.f7445Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public void mo3447feyxiexzfUjhhgtg(Rect[][] rectArr) {
        this.f7448Ujhhgtgfeyxiexzf = (Rect[][]) rectArr.clone();
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public void mo3448feyxiexzfUjhhgtg(Rect[][] rectArr) {
        this.f7449Ujhhgtgfeyxiexzf = (Rect[][]) rectArr.clone();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf m3469feyxiexzfUjhhgtg(int i, boolean z) {
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf;
        int i2;
        C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C0688Ujhhgtgfeyxiexzf[] c0688UjhhgtgfeyxiexzfArr = this.f7441Ujhhgtgfeyxiexzf;
                    c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf = c0688UjhhgtgfeyxiexzfArr != null ? c0688UjhhgtgfeyxiexzfArr[AbstractC3085Ujhhgtgfeyxiexzf.m4565Ujhhgtgfeyxiexzf(8)] : null;
                    if (c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf != null) {
                        return c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf;
                    }
                    C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf = mo3436Ujhhgtgfeyxiexzf();
                    C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg = m3465feyxiexzfUjhhgtg();
                    int i3 = c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf;
                    if (i3 > c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg.f2821Ujhhgtgfeyxiexzf) {
                        return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(0, 0, 0, i3);
                    }
                    C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf2 = this.f7444Ujhhgtgfeyxiexzf;
                    if (c0688Ujhhgtgfeyxiexzf2 != null && !c0688Ujhhgtgfeyxiexzf2.equals(c0688Ujhhgtgfeyxiexzf) && (i2 = this.f7444Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf) > c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg.f2821Ujhhgtgfeyxiexzf) {
                        return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo3435Ujhhgtgfeyxiexzf();
                    }
                    if (i == 32) {
                        return mo3433Ujhhgtgfeyxiexzf();
                    }
                    if (i == 64) {
                        return mo3437Ujhhgtgfeyxiexzf();
                    }
                    if (i == 128) {
                        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = this.f7443Ujhhgtgfeyxiexzf;
                        C3224feyxiexzfUjhhgtg c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg != null ? c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf.mo3432Ujhhgtgfeyxiexzf() : mo3432Ujhhgtgfeyxiexzf();
                        if (c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(i4 >= 28 ? AbstractC3223feyxiexzfUjhhgtg.m4724Ujhhgtgfeyxiexzf(c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf.f10125Ujhhgtgfeyxiexzf) : 0, i4 >= 28 ? AbstractC3223feyxiexzfUjhhgtg.m4726Ujhhgtgfeyxiexzf(c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf.f10125Ujhhgtgfeyxiexzf) : 0, i4 >= 28 ? AbstractC3223feyxiexzfUjhhgtg.m4725Ujhhgtgfeyxiexzf(c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf.f10125Ujhhgtgfeyxiexzf) : 0, i4 >= 28 ? AbstractC3223feyxiexzfUjhhgtg.m4723Ujhhgtgfeyxiexzf(c3224feyxiexzfUjhhgtgMo3432Ujhhgtgfeyxiexzf.f10125Ujhhgtgfeyxiexzf) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg2 = m3465feyxiexzfUjhhgtg();
                    C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf2 = mo3434Ujhhgtgfeyxiexzf();
                    return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(Math.max(c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg2.f2818Ujhhgtgfeyxiexzf, c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf2.f2818Ujhhgtgfeyxiexzf), 0, Math.max(c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg2.f2820Ujhhgtgfeyxiexzf, c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf2.f2820Ujhhgtgfeyxiexzf), Math.max(c0688UjhhgtgfeyxiexzfM3465feyxiexzfUjhhgtg2.f2821Ujhhgtgfeyxiexzf, c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf2.f2821Ujhhgtgfeyxiexzf));
                }
                if ((this.f7445Ujhhgtgfeyxiexzf & 2) == 0) {
                    C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf2 = mo3436Ujhhgtgfeyxiexzf();
                    C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg2 = this.f7443Ujhhgtgfeyxiexzf;
                    c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg2 != null ? c2256feyxiexzfUjhhgtg2.f7334Ujhhgtgfeyxiexzf.mo3434Ujhhgtgfeyxiexzf() : null;
                    int iMin = c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf2.f2821Ujhhgtgfeyxiexzf;
                    if (c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf != null) {
                        iMin = Math.min(iMin, c0688UjhhgtgfeyxiexzfMo3434Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf);
                    }
                    return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf2.f2818Ujhhgtgfeyxiexzf, 0, c0688UjhhgtgfeyxiexzfMo3436Ujhhgtgfeyxiexzf2.f2820Ujhhgtgfeyxiexzf, iMin);
                }
            }
        } else {
            if (z) {
                return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(0, Math.max(m3465feyxiexzfUjhhgtg().f2819Ujhhgtgfeyxiexzf, mo3436Ujhhgtgfeyxiexzf().f2819Ujhhgtgfeyxiexzf), 0, 0);
            }
            if ((this.f7445Ujhhgtgfeyxiexzf & 4) == 0) {
                return C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(0, mo3436Ujhhgtgfeyxiexzf().f2819Ujhhgtgfeyxiexzf, 0, 0);
            }
        }
        return c0688Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public C0688Ujhhgtgfeyxiexzf mo3425feyxiexzfUjhhgtg(int i) {
        return m3464feyxiexzfUjhhgtg(i, true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public boolean m3470feyxiexzfUjhhgtg(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m3469feyxiexzfUjhhgtg(i, false).equals(C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public void m3471feyxiexzfUjhhgtg(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
        this.f7444Ujhhgtgfeyxiexzf = c0688Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public void mo3442Ujhhgtgfeyxiexzf(C3226feyxiexzfUjhhgtg c3226feyxiexzfUjhhgtg) {
    }
}
