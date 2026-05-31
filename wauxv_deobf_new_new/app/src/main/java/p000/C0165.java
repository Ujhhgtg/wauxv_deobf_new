package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0165 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1942 f1236;

    public C0165(C1942 c1942) {
        this.f1236 = c1942;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1236.f6415.f731;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.f1236.f6415;
        ColorStateList colorStateList = materialCheckBox.f731;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.f735, colorStateList.getDefaultColor()));
        }
    }
}
