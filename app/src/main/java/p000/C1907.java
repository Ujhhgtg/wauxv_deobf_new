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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲇᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final MaterialButton f6282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C2677 f6283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f6284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f6290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f6291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f6292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ColorStateList f6293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1917 f6294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f6298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public RippleDrawable f6300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f6301;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6295 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6296 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6297 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f6299 = true;

    public C1907(MaterialButton materialButton, C2677 c2677) {
        this.f6282 = materialButton;
        this.f6283 = c2677;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2688 m3701() {
        RippleDrawable rippleDrawable = this.f6300;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f6300.getNumberOfLayers() > 2 ? (InterfaceC2688) this.f6300.getDrawable(2) : (InterfaceC2688) this.f6300.getDrawable(1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1917 m3702(boolean z) {
        RippleDrawable rippleDrawable = this.f6300;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1917) ((LayerDrawable) ((InsetDrawable) this.f6300.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3703(C2677 c2677) {
        this.f6283 = c2677;
        if (m3702(false) != null) {
            m3702(false).setShapeAppearanceModel(c2677);
        }
        if (m3702(true) != null) {
            m3702(true).setShapeAppearanceModel(c2677);
        }
        if (m3701() != null) {
            m3701().setShapeAppearanceModel(c2677);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3704(int i, int i2) {
        Field field = AbstractC3578.f11184;
        MaterialButton materialButton = this.f6282;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f6286;
        int i4 = this.f6287;
        this.f6287 = i2;
        this.f6286 = i;
        if (!this.f6296) {
            m3705();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3705() {
        C1917 c1917 = new C1917(this.f6283);
        MaterialButton materialButton = this.f6282;
        c1917.m3714(materialButton.getContext());
        c1917.setTintList(this.f6291);
        PorterDuff.Mode mode = this.f6290;
        if (mode != null) {
            c1917.setTintMode(mode);
        }
        float f = this.f6289;
        ColorStateList colorStateList = this.f6292;
        c1917.f6332.f6323 = f;
        c1917.invalidateSelf();
        c1917.m3718(colorStateList);
        C1917 c1918 = new C1917(this.f6283);
        c1918.setTint(0);
        float f2 = this.f6289;
        int iM4131 = this.f6295 ? AbstractC2209.m4131(materialButton, R.attr.colorSurface) : 0;
        c1918.f6332.f6323 = f2;
        c1918.invalidateSelf();
        c1918.m3718(ColorStateList.valueOf(iM4131));
        C1917 c1919 = new C1917(this.f6283);
        this.f6294 = c1919;
        c1919.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2589.m4597(this.f6293), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1918, c1917}), this.f6284, this.f6286, this.f6285, this.f6287), this.f6294);
        this.f6300 = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1917 c1917M3702 = m3702(false);
        if (c1917M3702 != null) {
            c1917M3702.m3715(this.f6301);
            c1917M3702.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3706() {
        C1917 c1917M3702 = m3702(false);
        C1917 c1917M3703 = m3702(true);
        if (c1917M3702 != null) {
            float f = this.f6289;
            ColorStateList colorStateList = this.f6292;
            c1917M3702.f6332.f6323 = f;
            c1917M3702.invalidateSelf();
            c1917M3702.m3718(colorStateList);
            if (c1917M3703 != null) {
                float f2 = this.f6289;
                int iM4131 = this.f6295 ? AbstractC2209.m4131(this.f6282, R.attr.colorSurface) : 0;
                c1917M3703.f6332.f6323 = f2;
                c1917M3703.invalidateSelf();
                c1917M3703.m3718(ColorStateList.valueOf(iM4131));
            }
        }
    }
}
