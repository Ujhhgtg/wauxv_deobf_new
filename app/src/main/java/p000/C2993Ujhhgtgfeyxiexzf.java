package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2993Ujhhgtgfeyxiexzf extends Drawable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ActionBarContainer f9307Ujhhgtgfeyxiexzf;

    public C2993Ujhhgtgfeyxiexzf(ActionBarContainer actionBarContainer) {
        this.f9307Ujhhgtgfeyxiexzf = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f9307Ujhhgtgfeyxiexzf;
        if (actionBarContainer.f37Ujhhgtgfeyxiexzf) {
            Drawable drawable = actionBarContainer.f36Ujhhgtgfeyxiexzf;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f34Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f35Ujhhgtgfeyxiexzf;
        if (drawable3 == null || !actionBarContainer.f38Ujhhgtgfeyxiexzf) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f9307Ujhhgtgfeyxiexzf;
        if (actionBarContainer.f37Ujhhgtgfeyxiexzf) {
            if (actionBarContainer.f36Ujhhgtgfeyxiexzf != null) {
                actionBarContainer.f34Ujhhgtgfeyxiexzf.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f34Ujhhgtgfeyxiexzf;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
