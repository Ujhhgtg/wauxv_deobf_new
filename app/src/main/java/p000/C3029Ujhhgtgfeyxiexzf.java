package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3029Ujhhgtgfeyxiexzf extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0193Ujhhgtgfeyxiexzf f9395Ujhhgtgfeyxiexzf;

    public C3029Ujhhgtgfeyxiexzf(C0193Ujhhgtgfeyxiexzf c0193Ujhhgtgfeyxiexzf) {
        this.f9395Ujhhgtgfeyxiexzf = c0193Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f9395Ujhhgtgfeyxiexzf.f1420Ujhhgtgfeyxiexzf.f745Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.f9395Ujhhgtgfeyxiexzf.f1420Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList = materialCheckBox.f745Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.f749Ujhhgtgfeyxiexzf, colorStateList.getDefaultColor()));
        }
    }
}
