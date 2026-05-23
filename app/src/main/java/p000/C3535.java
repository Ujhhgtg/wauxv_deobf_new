package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3535 extends AbstractC3538 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0221 f11067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f11068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0221 f11069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f11070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f11071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f11072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f11073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f11074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Paint.Cap f11075;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Paint.Join f11076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f11077;

    public float getFillAlpha() {
        return this.f11071;
    }

    public int getFillColor() {
        return this.f11069.f1351;
    }

    public float getStrokeAlpha() {
        return this.f11070;
    }

    public int getStrokeColor() {
        return this.f11067.f1351;
    }

    public float getStrokeWidth() {
        return this.f11068;
    }

    public float getTrimPathEnd() {
        return this.f11073;
    }

    public float getTrimPathOffset() {
        return this.f11074;
    }

    public float getTrimPathStart() {
        return this.f11072;
    }

    public void setFillAlpha(float f) {
        this.f11071 = f;
    }

    public void setFillColor(int i) {
        this.f11069.f1351 = i;
    }

    public void setStrokeAlpha(float f) {
        this.f11070 = f;
    }

    public void setStrokeColor(int i) {
        this.f11067.f1351 = i;
    }

    public void setStrokeWidth(float f) {
        this.f11068 = f;
    }

    public void setTrimPathEnd(float f) {
        this.f11073 = f;
    }

    public void setTrimPathOffset(float f) {
        this.f11074 = f;
    }

    public void setTrimPathStart(float f) {
        this.f11072 = f;
    }

    @Override // p000.AbstractC3537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo5128() {
        return this.f11069.m1269() || this.f11067.m1269();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.AbstractC3537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo5129(int[] iArr) {
        boolean z;
        C0221 c0221 = this.f11069;
        boolean z2 = true;
        if (c0221.m1269()) {
            ColorStateList colorStateList = (ColorStateList) c0221.f1353;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0221.f1351) {
                c0221.f1351 = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C0221 c0222 = this.f11067;
        if (c0222.m1269()) {
            ColorStateList colorStateList2 = (ColorStateList) c0222.f1353;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0222.f1351) {
                c0222.f1351 = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }
}
