package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3034feyxiexzfUjhhgtg extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9405Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f9406Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3034feyxiexzfUjhhgtg(int i, Object obj) {
        this.f9405Ujhhgtgfeyxiexzf = i;
        this.f9406Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f9405Ujhhgtgfeyxiexzf) {
            case 0:
                return ((Drawable.ConstantState) this.f9406Ujhhgtgfeyxiexzf).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f9405Ujhhgtgfeyxiexzf) {
            case 0:
                return ((Drawable.ConstantState) this.f9406Ujhhgtgfeyxiexzf).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f9405Ujhhgtgfeyxiexzf) {
            case 0:
                C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = new C3035Ujhhgtgfeyxiexzf(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9406Ujhhgtgfeyxiexzf).newDrawable();
                c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3035Ujhhgtgfeyxiexzf.f9411Ujhhgtgfeyxiexzf);
                return c3035Ujhhgtgfeyxiexzf;
            default:
                return new C3571feyxiexzfUjhhgtg(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f9405Ujhhgtgfeyxiexzf) {
            case 0:
                C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = new C3035Ujhhgtgfeyxiexzf(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9406Ujhhgtgfeyxiexzf).newDrawable(resources);
                c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3035Ujhhgtgfeyxiexzf.f9411Ujhhgtgfeyxiexzf);
                return c3035Ujhhgtgfeyxiexzf;
            default:
                return new C3571feyxiexzfUjhhgtg(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f9405Ujhhgtgfeyxiexzf) {
            case 0:
                C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = new C3035Ujhhgtgfeyxiexzf(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9406Ujhhgtgfeyxiexzf).newDrawable(resources, theme);
                c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3035Ujhhgtgfeyxiexzf.f9411Ujhhgtgfeyxiexzf);
                return c3035Ujhhgtgfeyxiexzf;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
