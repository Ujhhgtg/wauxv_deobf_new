package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2256feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C2256feyxiexzfUjhhgtg f7333Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2252Ujhhgtgfeyxiexzf f7334Ujhhgtgfeyxiexzf;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f7333Ujhhgtgfeyxiexzf = C2251Ujhhgtgfeyxiexzf.f7329Ujhhgtgfeyxiexzf;
        } else if (i >= 30) {
            f7333Ujhhgtgfeyxiexzf = C2254Ujhhgtgfeyxiexzf.f7332Ujhhgtgfeyxiexzf;
        } else {
            f7333Ujhhgtgfeyxiexzf = C2252Ujhhgtgfeyxiexzf.f7330Ujhhgtgfeyxiexzf;
        }
    }

    public C2256feyxiexzfUjhhgtg(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f7334Ujhhgtgfeyxiexzf = new C2253Ujhhgtgfeyxiexzf(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f7334Ujhhgtgfeyxiexzf = new C2251Ujhhgtgfeyxiexzf(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f7334Ujhhgtgfeyxiexzf = new C2255Ujhhgtgfeyxiexzf(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f7334Ujhhgtgfeyxiexzf = new C2254Ujhhgtgfeyxiexzf(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f7334Ujhhgtgfeyxiexzf = new C2273feyxiexzfUjhhgtg(this, windowInsets);
        } else if (i >= 28) {
            this.f7334Ujhhgtgfeyxiexzf = new C2272Ujhhgtgfeyxiexzf(this, windowInsets);
        } else {
            this.f7334Ujhhgtgfeyxiexzf = new C2271feyxiexzfUjhhgtg(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C0688Ujhhgtgfeyxiexzf m3449Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c0688Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf - i);
        int iMax2 = Math.max(0, c0688Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf - i2);
        int iMax3 = Math.max(0, c0688Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf - i3);
        int iMax4 = Math.max(0, c0688Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c0688Ujhhgtgfeyxiexzf : C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C2256feyxiexzfUjhhgtg m3450Ujhhgtgfeyxiexzf(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = new C2256feyxiexzfUjhhgtg(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf = AbstractC1892Ujhhgtgfeyxiexzf.m3224Ujhhgtgfeyxiexzf(view);
            C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf;
            c2252Ujhhgtgfeyxiexzf.mo3444Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf);
            View rootView = view.getRootView();
            c2252Ujhhgtgfeyxiexzf.mo3429Ujhhgtgfeyxiexzf(rootView);
            c2252Ujhhgtgfeyxiexzf.mo3423Ujhhgtgfeyxiexzf(rootView);
            c2252Ujhhgtgfeyxiexzf.mo3438Ujhhgtgfeyxiexzf();
            c2252Ujhhgtgfeyxiexzf.mo3446Ujhhgtgfeyxiexzf(view.getWindowSystemUiVisibility());
        }
        return c2256feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2256feyxiexzfUjhhgtg) {
            return Objects.equals(this.f7334Ujhhgtgfeyxiexzf, ((C2256feyxiexzfUjhhgtg) obj).f7334Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = this.f7334Ujhhgtgfeyxiexzf;
        if (c2252Ujhhgtgfeyxiexzf == null) {
            return 0;
        }
        return c2252Ujhhgtgfeyxiexzf.hashCode();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m3451Ujhhgtgfeyxiexzf() {
        return this.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2821Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m3452Ujhhgtgfeyxiexzf() {
        return this.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2819Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final WindowInsets m3453Ujhhgtgfeyxiexzf() {
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = this.f7334Ujhhgtgfeyxiexzf;
        if (c2252Ujhhgtgfeyxiexzf instanceof AbstractC2270feyxiexzfUjhhgtg) {
            return ((AbstractC2270feyxiexzfUjhhgtg) c2252Ujhhgtgfeyxiexzf).f7440Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public C2256feyxiexzfUjhhgtg() {
        this.f7334Ujhhgtgfeyxiexzf = new C2252Ujhhgtgfeyxiexzf(this);
    }
}
