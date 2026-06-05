package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1880feyxiexzfUjhhgtg extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Drawable.ConstantState f6280Ujhhgtgfeyxiexzf;

    public C1880feyxiexzfUjhhgtg(Drawable.ConstantState constantState) {
        this.f6280Ujhhgtgfeyxiexzf = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f6280Ujhhgtgfeyxiexzf.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f6280Ujhhgtgfeyxiexzf.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1888feyxiexzfUjhhgtg c1888feyxiexzfUjhhgtg = new C1888feyxiexzfUjhhgtg();
        c1888feyxiexzfUjhhgtg.f6219Ujhhgtgfeyxiexzf = (VectorDrawable) this.f6280Ujhhgtgfeyxiexzf.newDrawable();
        return c1888feyxiexzfUjhhgtg;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1888feyxiexzfUjhhgtg c1888feyxiexzfUjhhgtg = new C1888feyxiexzfUjhhgtg();
        c1888feyxiexzfUjhhgtg.f6219Ujhhgtgfeyxiexzf = (VectorDrawable) this.f6280Ujhhgtgfeyxiexzf.newDrawable(resources);
        return c1888feyxiexzfUjhhgtg;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1888feyxiexzfUjhhgtg c1888feyxiexzfUjhhgtg = new C1888feyxiexzfUjhhgtg();
        c1888feyxiexzfUjhhgtg.f6219Ujhhgtgfeyxiexzf = (VectorDrawable) this.f6280Ujhhgtgfeyxiexzf.newDrawable(resources, theme);
        return c1888feyxiexzfUjhhgtg;
    }
}
