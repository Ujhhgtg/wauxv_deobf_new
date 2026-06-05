package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳ能不能ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3071Ujhhgtgfeyxiexzf extends C0223Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f9512Ujhhgtgfeyxiexzf;

    public C3071Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg, RectF rectF) {
        super(c1017feyxiexzfUjhhgtg);
        this.f9512Ujhhgtgfeyxiexzf = rectF;
    }

    @Override // p000.C0223Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3072Ujhhgtgfeyxiexzf c3072Ujhhgtgfeyxiexzf = new C3072Ujhhgtgfeyxiexzf(this);
        c3072Ujhhgtgfeyxiexzf.f9514feyxiexzfUjhhgtg = this;
        c3072Ujhhgtgfeyxiexzf.invalidateSelf();
        return c3072Ujhhgtgfeyxiexzf;
    }

    public C3071Ujhhgtgfeyxiexzf(C3071Ujhhgtgfeyxiexzf c3071Ujhhgtgfeyxiexzf) {
        super(c3071Ujhhgtgfeyxiexzf);
        this.f9512Ujhhgtgfeyxiexzf = c3071Ujhhgtgfeyxiexzf.f9512Ujhhgtgfeyxiexzf;
    }
}
