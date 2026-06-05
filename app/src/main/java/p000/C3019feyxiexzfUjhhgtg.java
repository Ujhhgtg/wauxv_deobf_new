package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3019feyxiexzfUjhhgtg implements InterfaceC3736Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC3736Ujhhgtgfeyxiexzf f9383Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float f9384Ujhhgtgfeyxiexzf;

    public C3019feyxiexzfUjhhgtg(float f, InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf) {
        while (interfaceC3736Ujhhgtgfeyxiexzf instanceof C3019feyxiexzfUjhhgtg) {
            interfaceC3736Ujhhgtgfeyxiexzf = ((C3019feyxiexzfUjhhgtg) interfaceC3736Ujhhgtgfeyxiexzf).f9383Ujhhgtgfeyxiexzf;
            f += ((C3019feyxiexzfUjhhgtg) interfaceC3736Ujhhgtgfeyxiexzf).f9384Ujhhgtgfeyxiexzf;
        }
        this.f9383Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf;
        this.f9384Ujhhgtgfeyxiexzf = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3019feyxiexzfUjhhgtg)) {
            return false;
        }
        C3019feyxiexzfUjhhgtg c3019feyxiexzfUjhhgtg = (C3019feyxiexzfUjhhgtg) obj;
        return this.f9383Ujhhgtgfeyxiexzf.equals(c3019feyxiexzfUjhhgtg.f9383Ujhhgtgfeyxiexzf) && this.f9384Ujhhgtgfeyxiexzf == c3019feyxiexzfUjhhgtg.f9384Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9383Ujhhgtgfeyxiexzf, Float.valueOf(this.f9384Ujhhgtgfeyxiexzf)});
    }

    @Override // p000.InterfaceC3736Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final float mo2475Ujhhgtgfeyxiexzf(RectF rectF) {
        return Math.max(0.0f, this.f9383Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) + this.f9384Ujhhgtgfeyxiexzf);
    }
}
