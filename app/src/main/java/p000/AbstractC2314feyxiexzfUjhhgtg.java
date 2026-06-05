package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2314feyxiexzfUjhhgtg extends AbstractC3643Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f7561Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f7562Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC3643Ujhhgtgfeyxiexzf, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f7561Ujhhgtgfeyxiexzf || this.f7562Ujhhgtgfeyxiexzf) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f11389Ujhhgtgfeyxiexzf; i++) {
                View view = (View) constraintLayout.f198Ujhhgtgfeyxiexzf.get(this.f11388Ujhhgtgfeyxiexzf[i]);
                if (view != null) {
                    if (this.f7561Ujhhgtgfeyxiexzf) {
                        view.setVisibility(visibility);
                    }
                    if (this.f7562Ujhhgtgfeyxiexzf && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m5302Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m5302Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3643Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo3525Ujhhgtgfeyxiexzf(AttributeSet attributeSet) {
        super.mo3525Ujhhgtgfeyxiexzf(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3057Ujhhgtgfeyxiexzf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f7561Ujhhgtgfeyxiexzf = true;
                } else if (index == 13) {
                    this.f7562Ujhhgtgfeyxiexzf = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public abstract void mo52Ujhhgtgfeyxiexzf(C3618Ujhhgtgfeyxiexzf c3618Ujhhgtgfeyxiexzf, int i, int i2);
}
