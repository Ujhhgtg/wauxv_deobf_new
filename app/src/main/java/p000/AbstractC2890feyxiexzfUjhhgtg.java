package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳ要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2890feyxiexzfUjhhgtg extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f9160Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f9161Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public TextureView f9162Ujhhgtgfeyxiexzf;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f9160Ujhhgtgfeyxiexzf) {
            super.dispatchDraw(canvas);
            return;
        }
        TextureView textureView = this.f9162Ujhhgtgfeyxiexzf;
        if (textureView == null) {
            textureView = null;
        }
        drawChild(canvas, textureView, getDrawingTime());
    }

    public float getCutoffFactor() {
        return 0.65f;
    }

    public final boolean getUseTextureViewOnPrePie() {
        return this.f9161Ujhhgtgfeyxiexzf;
    }

    public final void setPreAndroidPie(boolean z) {
        this.f9160Ujhhgtgfeyxiexzf = z;
    }

    public final void setUseTextureViewOnPrePie(boolean z) {
        this.f9161Ujhhgtgfeyxiexzf = z;
    }

    public void setupBaseViews(Context context) {
        if (this.f9161Ujhhgtgfeyxiexzf) {
            this.f9160Ujhhgtgfeyxiexzf = Build.VERSION.SDK_INT < 28;
        } else {
            this.f9160Ujhhgtgfeyxiexzf = false;
        }
    }
}
