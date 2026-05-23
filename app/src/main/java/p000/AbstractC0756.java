package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0756 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2850;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2851;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public TextureView f2852;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f2850) {
            super.dispatchDraw(canvas);
            return;
        }
        TextureView textureView = this.f2852;
        if (textureView == null) {
            textureView = null;
        }
        drawChild(canvas, textureView, getDrawingTime());
    }

    public float getCutoffFactor() {
        return 0.65f;
    }

    public final boolean getUseTextureViewOnPrePie() {
        return this.f2851;
    }

    public final void setPreAndroidPie(boolean z) {
        this.f2850 = z;
    }

    public final void setUseTextureViewOnPrePie(boolean z) {
        this.f2851 = z;
    }

    public void setupBaseViews(Context context) {
        if (this.f2851) {
            this.f2850 = Build.VERSION.SDK_INT < 28;
        } else {
            this.f2850 = false;
        }
    }
}
