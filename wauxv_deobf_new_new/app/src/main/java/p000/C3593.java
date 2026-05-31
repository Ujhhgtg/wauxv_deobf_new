package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᤝᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3593 extends AbstractC3596 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0231 f11216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f11217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0231 f11218;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f11219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f11220;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f11221;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f11222;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f11223;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Paint.Cap f11224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Paint.Join f11225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f11226;

    public float getFillAlpha() {
        return this.f11220;
    }

    public int getFillColor() {
        return this.f11218.f1425;
    }

    public float getStrokeAlpha() {
        return this.f11219;
    }

    public int getStrokeColor() {
        return this.f11216.f1425;
    }

    public float getStrokeWidth() {
        return this.f11217;
    }

    public float getTrimPathEnd() {
        return this.f11222;
    }

    public float getTrimPathOffset() {
        return this.f11223;
    }

    public float getTrimPathStart() {
        return this.f11221;
    }

    public void setFillAlpha(float f) {
        this.f11220 = f;
    }

    public void setFillColor(int i) {
        this.f11218.f1425 = i;
    }

    public void setStrokeAlpha(float f) {
        this.f11219 = f;
    }

    public void setStrokeColor(int i) {
        this.f11216.f1425 = i;
    }

    public void setStrokeWidth(float f) {
        this.f11217 = f;
    }

    public void setTrimPathEnd(float f) {
        this.f11222 = f;
    }

    public void setTrimPathOffset(float f) {
        this.f11223 = f;
    }

    public void setTrimPathStart(float f) {
        this.f11221 = f;
    }

    @Override // p000.AbstractC3595
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo5134() {
        return this.f11218.m1415() || this.f11216.m1415();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.AbstractC3595
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo5135(int[] iArr) {
        boolean z;
        C0231 c0231 = this.f11218;
        boolean z2 = true;
        if (c0231.m1415()) {
            ColorStateList colorStateList = (ColorStateList) c0231.f1427;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0231.f1425) {
                c0231.f1425 = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C0231 c0232 = this.f11216;
        if (c0232.m1415()) {
            ColorStateList colorStateList2 = (ColorStateList) c0232.f1427;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0232.f1425) {
                c0232.f1425 = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }
}
