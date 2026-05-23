package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0157 extends Animatable2.AnimationCallback {

    public final /* synthetic */ C1912 f1168;

    public C0157(C1912 c1912) {
        this.f1168 = c1912;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1168.f6310.f672;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.f1168.f6310;
        ColorStateList colorStateList = materialCheckBox.f672;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.f676, colorStateList.getDefaultColor()));
        }
    }
}
