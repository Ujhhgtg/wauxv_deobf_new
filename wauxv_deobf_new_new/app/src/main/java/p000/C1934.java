package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᤝᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1934 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final MaterialButton f6361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C2738 f6362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f6363;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f6369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f6370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f6371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ColorStateList f6372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1948 f6373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f6377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public RippleDrawable f6379;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f6380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6374 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6375 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6376 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f6378 = true;

    public C1934(MaterialButton materialButton, C2738 c2738) {
        this.f6361 = materialButton;
        this.f6362 = c2738;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2749 m3885() {
        RippleDrawable rippleDrawable = this.f6379;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f6379.getNumberOfLayers() > 2 ? (InterfaceC2749) this.f6379.getDrawable(2) : (InterfaceC2749) this.f6379.getDrawable(1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1948 m3886(boolean z) {
        RippleDrawable rippleDrawable = this.f6379;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1948) ((LayerDrawable) ((InsetDrawable) this.f6379.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3887(C2738 c2738) {
        this.f6362 = c2738;
        if (m3886(false) != null) {
            m3886(false).setShapeAppearanceModel(c2738);
        }
        if (m3886(true) != null) {
            m3886(true).setShapeAppearanceModel(c2738);
        }
        if (m3885() != null) {
            m3885().setShapeAppearanceModel(c2738);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3888(int i, int i2) {
        Field field = AbstractC3638.f11333;
        MaterialButton materialButton = this.f6361;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f6365;
        int i4 = this.f6366;
        this.f6366 = i2;
        this.f6365 = i;
        if (!this.f6375) {
            m3889();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3889() {
        C1948 c1948 = new C1948(this.f6362);
        MaterialButton materialButton = this.f6361;
        c1948.m3912(materialButton.getContext());
        c1948.setTintList(this.f6370);
        PorterDuff.Mode mode = this.f6369;
        if (mode != null) {
            c1948.setTintMode(mode);
        }
        float f = this.f6368;
        ColorStateList colorStateList = this.f6371;
        c1948.f6437.f6428 = f;
        c1948.invalidateSelf();
        c1948.m3918(colorStateList);
        C1948 c1949 = new C1948(this.f6362);
        c1949.setTint(0);
        float f2 = this.f6368;
        int iM3363 = this.f6374 ? AbstractC1470.m3363(materialButton, R.attr.colorSurface) : 0;
        c1949.f6437.f6428 = f2;
        c1949.invalidateSelf();
        c1949.m3918(ColorStateList.valueOf(iM3363));
        C1948 c19410 = new C1948(this.f6362);
        this.f6373 = c19410;
        c19410.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2646.m4619(this.f6372), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1949, c1948}), this.f6363, this.f6365, this.f6364, this.f6366), this.f6373);
        this.f6379 = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1948 c1948M3886 = m3886(false);
        if (c1948M3886 != null) {
            c1948M3886.m3913(this.f6380);
            c1948M3886.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3890() {
        C1948 c1948M3886 = m3886(false);
        C1948 c1948M3887 = m3886(true);
        if (c1948M3886 != null) {
            float f = this.f6368;
            ColorStateList colorStateList = this.f6371;
            c1948M3886.f6437.f6428 = f;
            c1948M3886.invalidateSelf();
            c1948M3886.m3918(colorStateList);
            if (c1948M3887 != null) {
                float f2 = this.f6368;
                int iM3363 = this.f6374 ? AbstractC1470.m3363(this.f6361, R.attr.colorSurface) : 0;
                c1948M3887.f6437.f6428 = f2;
                c1948M3887.invalidateSelf();
                c1948M3887.m3918(ColorStateList.valueOf(iM3363));
            }
        }
    }
}
