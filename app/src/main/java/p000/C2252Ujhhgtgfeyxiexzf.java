package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2252Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C2256feyxiexzfUjhhgtg f7330Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2256feyxiexzfUjhhgtg f7331Ujhhgtgfeyxiexzf;

    static {
        AbstractC2269Ujhhgtgfeyxiexzf c2243feyxiexzfUjhhgtg;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c2243feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf();
        } else if (i >= 35) {
            c2243feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg();
        } else if (i >= 34) {
            c2243feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg();
        } else if (i >= 31) {
            c2243feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg();
        } else if (i >= 30) {
            c2243feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg();
        } else {
            c2243feyxiexzfUjhhgtg = i >= 29 ? new C2243feyxiexzfUjhhgtg() : new C2242feyxiexzfUjhhgtg();
        }
        f7330Ujhhgtgfeyxiexzf = c2243feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf().f7334Ujhhgtgfeyxiexzf.mo3426Ujhhgtgfeyxiexzf().f7334Ujhhgtgfeyxiexzf.mo3427Ujhhgtgfeyxiexzf().f7334Ujhhgtgfeyxiexzf.mo3428Ujhhgtgfeyxiexzf();
    }

    public C2252Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        this.f7331Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2252Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = (C2252Ujhhgtgfeyxiexzf) obj;
        return mo3441Ujhhgtgfeyxiexzf() == c2252Ujhhgtgfeyxiexzf.mo3441Ujhhgtgfeyxiexzf() && mo3440Ujhhgtgfeyxiexzf() == c2252Ujhhgtgfeyxiexzf.mo3440Ujhhgtgfeyxiexzf() && Objects.equals(mo3436Ujhhgtgfeyxiexzf(), c2252Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf()) && Objects.equals(mo3434Ujhhgtgfeyxiexzf(), c2252Ujhhgtgfeyxiexzf.mo3434Ujhhgtgfeyxiexzf()) && Objects.equals(mo3432Ujhhgtgfeyxiexzf(), c2252Ujhhgtgfeyxiexzf.mo3432Ujhhgtgfeyxiexzf());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo3441Ujhhgtgfeyxiexzf()), Boolean.valueOf(mo3440Ujhhgtgfeyxiexzf()), mo3436Ujhhgtgfeyxiexzf(), mo3434Ujhhgtgfeyxiexzf(), mo3432Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg mo3426Ujhhgtgfeyxiexzf() {
        return this.f7331Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg mo3427Ujhhgtgfeyxiexzf() {
        return this.f7331Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg mo3428Ujhhgtgfeyxiexzf() {
        return this.f7331Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public List<Rect> mo3430Ujhhgtgfeyxiexzf(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public List<Rect> mo3431Ujhhgtgfeyxiexzf(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C3224feyxiexzfUjhhgtg mo3432Ujhhgtgfeyxiexzf() {
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public C0688Ujhhgtgfeyxiexzf mo3422Ujhhgtgfeyxiexzf(int i) {
        return C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf mo3433Ujhhgtgfeyxiexzf() {
        return mo3436Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf mo3434Ujhhgtgfeyxiexzf() {
        return C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf mo3435Ujhhgtgfeyxiexzf() {
        return mo3436Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf mo3436Ujhhgtgfeyxiexzf() {
        return C0688Ujhhgtgfeyxiexzf.f2817Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf mo3437Ujhhgtgfeyxiexzf() {
        return mo3436Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg mo3439Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        return f7330Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean mo3440Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo3441Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public boolean mo3424Ujhhgtgfeyxiexzf(int i) {
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo3438Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void mo3429Ujhhgtgfeyxiexzf(View view) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public void mo3423Ujhhgtgfeyxiexzf(View view) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public void mo3442Ujhhgtgfeyxiexzf(C3226feyxiexzfUjhhgtg c3226feyxiexzfUjhhgtg) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void mo3443Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf[] c0688UjhhgtgfeyxiexzfArr) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo3444Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public void mo3445Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo3446Ujhhgtgfeyxiexzf(int i) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo3447feyxiexzfUjhhgtg(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public void mo3448feyxiexzfUjhhgtg(Rect[][] rectArr) {
    }
}
