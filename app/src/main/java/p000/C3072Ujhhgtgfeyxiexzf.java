package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3072Ujhhgtgfeyxiexzf extends C0226Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ int f9513feyxiexzfUjhhgtg = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3071Ujhhgtgfeyxiexzf f9514feyxiexzfUjhhgtg;

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f9514feyxiexzfUjhhgtg = new C3071Ujhhgtgfeyxiexzf(this.f9514feyxiexzfUjhhgtg);
        return this;
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1363Ujhhgtgfeyxiexzf(Canvas canvas) {
        if (this.f9514feyxiexzfUjhhgtg.f9512Ujhhgtgfeyxiexzf.isEmpty()) {
            super.mo1363Ujhhgtgfeyxiexzf(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f9514feyxiexzfUjhhgtg.f9512Ujhhgtgfeyxiexzf);
        super.mo1363Ujhhgtgfeyxiexzf(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m4546Ujhhgtgfeyxiexzf(float f, float f2, float f3, float f4) {
        RectF rectF = this.f9514feyxiexzfUjhhgtg.f9512Ujhhgtgfeyxiexzf;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
