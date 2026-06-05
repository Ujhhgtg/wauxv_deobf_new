package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ要点脸能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1007feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public float f3926Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public float f3927Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f3928Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f3929Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f3930Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f3931Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ArrayList f3932Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final ArrayList f3933Ujhhgtgfeyxiexzf = new ArrayList();

    public C1007feyxiexzfUjhhgtg() {
        m2506Ujhhgtgfeyxiexzf(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2503Ujhhgtgfeyxiexzf(float f) {
        float f2 = this.f3930Ujhhgtgfeyxiexzf;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f3928Ujhhgtgfeyxiexzf;
        float f5 = this.f3929Ujhhgtgfeyxiexzf;
        C1023feyxiexzfUjhhgtg c1023feyxiexzfUjhhgtg = new C1023feyxiexzfUjhhgtg(f4, f5, f4, f5);
        c1023feyxiexzfUjhhgtg.f4008Ujhhgtgfeyxiexzf = this.f3930Ujhhgtgfeyxiexzf;
        c1023feyxiexzfUjhhgtg.f4009Ujhhgtgfeyxiexzf = f3;
        this.f3933Ujhhgtgfeyxiexzf.add(new C1021feyxiexzfUjhhgtg(c1023feyxiexzfUjhhgtg));
        this.f3930Ujhhgtgfeyxiexzf = f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2504Ujhhgtgfeyxiexzf(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3932Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1005feyxiexzfUjhhgtg) arrayList.get(i)).mo2502Ujhhgtgfeyxiexzf(matrix, path);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2505Ujhhgtgfeyxiexzf(float f, float f2) {
        C1022feyxiexzfUjhhgtg c1022feyxiexzfUjhhgtg = new C1022feyxiexzfUjhhgtg();
        c1022feyxiexzfUjhhgtg.f4001Ujhhgtgfeyxiexzf = f;
        c1022feyxiexzfUjhhgtg.f4002Ujhhgtgfeyxiexzf = f2;
        this.f3932Ujhhgtgfeyxiexzf.add(c1022feyxiexzfUjhhgtg);
        C1020feyxiexzfUjhhgtg c1020feyxiexzfUjhhgtg = new C1020feyxiexzfUjhhgtg(c1022feyxiexzfUjhhgtg, this.f3928Ujhhgtgfeyxiexzf, this.f3929Ujhhgtgfeyxiexzf);
        float fM2519Ujhhgtgfeyxiexzf = c1020feyxiexzfUjhhgtg.m2519Ujhhgtgfeyxiexzf() + 270.0f;
        float fM2519Ujhhgtgfeyxiexzf2 = c1020feyxiexzfUjhhgtg.m2519Ujhhgtgfeyxiexzf() + 270.0f;
        m2503Ujhhgtgfeyxiexzf(fM2519Ujhhgtgfeyxiexzf);
        this.f3933Ujhhgtgfeyxiexzf.add(c1020feyxiexzfUjhhgtg);
        this.f3930Ujhhgtgfeyxiexzf = fM2519Ujhhgtgfeyxiexzf2;
        this.f3928Ujhhgtgfeyxiexzf = f;
        this.f3929Ujhhgtgfeyxiexzf = f2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2506Ujhhgtgfeyxiexzf(float f, float f2, float f3, float f4) {
        this.f3926Ujhhgtgfeyxiexzf = f;
        this.f3927Ujhhgtgfeyxiexzf = f2;
        this.f3928Ujhhgtgfeyxiexzf = f;
        this.f3929Ujhhgtgfeyxiexzf = f2;
        this.f3930Ujhhgtgfeyxiexzf = f3;
        this.f3931Ujhhgtgfeyxiexzf = (f3 + f4) % 360.0f;
        this.f3932Ujhhgtgfeyxiexzf.clear();
        this.f3933Ujhhgtgfeyxiexzf.clear();
    }
}
