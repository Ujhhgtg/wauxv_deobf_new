package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0162 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f1179;

    public /* synthetic */ C0162(int i, Object obj) {
        this.f1178 = i;
        this.f1179 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f1178) {
            case 0:
                return ((Drawable.ConstantState) this.f1179).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f1178) {
            case 0:
                return ((Drawable.ConstantState) this.f1179).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f1178) {
            case 0:
                C0163 c0163 = new C0163(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1179).newDrawable();
                c0163.f11066 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0163.f1184);
                return c0163;
            default:
                return new C1446(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f1178) {
            case 0:
                C0163 c0163 = new C0163(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1179).newDrawable(resources);
                c0163.f11066 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0163.f1184);
                return c0163;
            default:
                return new C1446(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1178) {
            case 0:
                C0163 c0163 = new C0163(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1179).newDrawable(resources, theme);
                c0163.f11066 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0163.f1184);
                return c0163;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
