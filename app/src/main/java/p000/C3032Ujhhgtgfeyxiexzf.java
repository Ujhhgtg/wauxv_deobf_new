package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3032Ujhhgtgfeyxiexzf implements Drawable.Callback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3035Ujhhgtgfeyxiexzf f9400Ujhhgtgfeyxiexzf;

    public C3032Ujhhgtgfeyxiexzf(C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf) {
        this.f9400Ujhhgtgfeyxiexzf = c3035Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f9400Ujhhgtgfeyxiexzf.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f9400Ujhhgtgfeyxiexzf.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f9400Ujhhgtgfeyxiexzf.unscheduleSelf(runnable);
    }
}
