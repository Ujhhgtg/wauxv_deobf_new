package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3540 extends Drawable.ConstantState {

    public int f11108;

    public C3539 f11109;

    public ColorStateList f11110;

    public PorterDuff.Mode f11111;

    public boolean f11112;

    public Bitmap f11113;

    public ColorStateList f11114;

    public PorterDuff.Mode f11115;

    public int f11116;

    public boolean f11117;

    public boolean f11118;

    public Paint f11119;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f11108;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C3542(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C3542(this);
    }
}
