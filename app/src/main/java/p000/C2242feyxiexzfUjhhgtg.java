package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2242feyxiexzfUjhhgtg extends AbstractC2269Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static Field f7284Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static boolean f7285Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Constructor f7286Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean f7287Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public WindowInsets f7288Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7289Ujhhgtgfeyxiexzf;

    public C2242feyxiexzfUjhhgtg() {
        this.f7288Ujhhgtgfeyxiexzf = m3410Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    private static WindowInsets m3410Ujhhgtgfeyxiexzf() {
        if (!f7285Ujhhgtgfeyxiexzf) {
            try {
                f7284Ujhhgtgfeyxiexzf = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f7285Ujhhgtgfeyxiexzf = true;
        }
        Field field = f7284Ujhhgtgfeyxiexzf;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!f7287Ujhhgtgfeyxiexzf) {
            try {
                f7286Ujhhgtgfeyxiexzf = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f7287Ujhhgtgfeyxiexzf = true;
        }
        Constructor constructor = f7286Ujhhgtgfeyxiexzf;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000.AbstractC2269Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg mo3411Ujhhgtgfeyxiexzf() {
        m3460Ujhhgtgfeyxiexzf();
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7288Ujhhgtgfeyxiexzf);
        C0688Ujhhgtgfeyxiexzf[] c0688UjhhgtgfeyxiexzfArr = this.f7432Ujhhgtgfeyxiexzf;
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf;
        c2252Ujhhgtgfeyxiexzf.mo3443Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfArr);
        c2252Ujhhgtgfeyxiexzf.mo3445Ujhhgtgfeyxiexzf(this.f7289Ujhhgtgfeyxiexzf);
        c2252Ujhhgtgfeyxiexzf.mo3442Ujhhgtgfeyxiexzf(null);
        c2252Ujhhgtgfeyxiexzf.mo3447feyxiexzfUjhhgtg(this.f7433Ujhhgtgfeyxiexzf);
        c2252Ujhhgtgfeyxiexzf.mo3448feyxiexzfUjhhgtg(this.f7434Ujhhgtgfeyxiexzf);
        return c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2269Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo3412Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
        this.f7289Ujhhgtgfeyxiexzf = c0688Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2269Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void mo3413Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
        WindowInsets windowInsets = this.f7288Ujhhgtgfeyxiexzf;
        if (windowInsets != null) {
            this.f7288Ujhhgtgfeyxiexzf = windowInsets.replaceSystemWindowInsets(c0688Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf, c0688Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf, c0688Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf, c0688Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf);
        }
    }

    public C2242feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        super(c2256feyxiexzfUjhhgtg);
        this.f7288Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.m3453Ujhhgtgfeyxiexzf();
    }
}
