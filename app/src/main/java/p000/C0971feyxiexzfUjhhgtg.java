package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛴ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0971feyxiexzfUjhhgtg implements InterfaceC3736Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float f3859Ujhhgtgfeyxiexzf;

    public C0971feyxiexzfUjhhgtg(float f) {
        this.f3859Ujhhgtgfeyxiexzf = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0971feyxiexzfUjhhgtg) && this.f3859Ujhhgtgfeyxiexzf == ((C0971feyxiexzfUjhhgtg) obj).f3859Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3859Ujhhgtgfeyxiexzf)});
    }

    @Override // p000.InterfaceC3736Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float mo2475Ujhhgtgfeyxiexzf(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f3859Ujhhgtgfeyxiexzf;
    }
}
