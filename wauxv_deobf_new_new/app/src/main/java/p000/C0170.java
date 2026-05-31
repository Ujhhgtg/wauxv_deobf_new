package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0170 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f1247;

    public /* synthetic */ C0170(Object obj, int i) {
        this.f1246 = i;
        this.f1247 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f1246) {
            case 0:
                return ((Drawable.ConstantState) this.f1247).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f1246) {
            case 0:
                return ((Drawable.ConstantState) this.f1247).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f1246) {
            case 0:
                C0171 c0171 = new C0171(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1247).newDrawable();
                c0171.f11215 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0171.f1252);
                return c0171;
            default:
                return new C1454(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f1246) {
            case 0:
                C0171 c0171 = new C0171(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1247).newDrawable(resources);
                c0171.f11215 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0171.f1252);
                return c0171;
            default:
                return new C1454(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1246) {
            case 0:
                C0171 c0171 = new C0171(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1247).newDrawable(resources, theme);
                c0171.f11215 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0171.f1252);
                return c0171;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
