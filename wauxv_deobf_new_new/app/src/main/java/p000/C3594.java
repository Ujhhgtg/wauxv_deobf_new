package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᤝᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3594 extends AbstractC3595 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Matrix f11227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f11228;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f11229;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f11230;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f11231;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f11232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f11233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f11234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f11235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Matrix f11236;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public String f11237;

    public C3594() {
        this.f11227 = new Matrix();
        this.f11228 = new ArrayList();
        this.f11229 = 0.0f;
        this.f11230 = 0.0f;
        this.f11231 = 0.0f;
        this.f11232 = 1.0f;
        this.f11233 = 1.0f;
        this.f11234 = 0.0f;
        this.f11235 = 0.0f;
        this.f11236 = new Matrix();
        this.f11237 = null;
    }

    public String getGroupName() {
        return this.f11237;
    }

    public Matrix getLocalMatrix() {
        return this.f11236;
    }

    public float getPivotX() {
        return this.f11230;
    }

    public float getPivotY() {
        return this.f11231;
    }

    public float getRotation() {
        return this.f11229;
    }

    public float getScaleX() {
        return this.f11232;
    }

    public float getScaleY() {
        return this.f11233;
    }

    public float getTranslateX() {
        return this.f11234;
    }

    public float getTranslateY() {
        return this.f11235;
    }

    public void setPivotX(float f) {
        if (f != this.f11230) {
            this.f11230 = f;
            m5136();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f11231) {
            this.f11231 = f;
            m5136();
        }
    }

    public void setRotation(float f) {
        if (f != this.f11229) {
            this.f11229 = f;
            m5136();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f11232) {
            this.f11232 = f;
            m5136();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f11233) {
            this.f11233 = f;
            m5136();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f11234) {
            this.f11234 = f;
            m5136();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f11235) {
            this.f11235 = f;
            m5136();
        }
    }

    @Override // p000.AbstractC3595
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo5134() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11228;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3595) arrayList.get(i)).mo5134()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.AbstractC3595
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo5135(int[] iArr) {
        int i = 0;
        boolean zMo5135 = false;
        while (true) {
            ArrayList arrayList = this.f11228;
            if (i >= arrayList.size()) {
                return zMo5135;
            }
            zMo5135 |= ((AbstractC3595) arrayList.get(i)).mo5135(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m5136() {
        Matrix matrix = this.f11236;
        matrix.reset();
        matrix.postTranslate(-this.f11230, -this.f11231);
        matrix.postScale(this.f11232, this.f11233);
        matrix.postRotate(this.f11229, 0.0f, 0.0f);
        matrix.postTranslate(this.f11234 + this.f11230, this.f11235 + this.f11231);
    }

    public C3594(C3594 c3594, C0274 c0274) {
        AbstractC3596 c3592;
        this.f11227 = new Matrix();
        this.f11228 = new ArrayList();
        this.f11229 = 0.0f;
        this.f11230 = 0.0f;
        this.f11231 = 0.0f;
        this.f11232 = 1.0f;
        this.f11233 = 1.0f;
        this.f11234 = 0.0f;
        this.f11235 = 0.0f;
        Matrix matrix = new Matrix();
        this.f11236 = matrix;
        this.f11237 = null;
        this.f11229 = c3594.f11229;
        this.f11230 = c3594.f11230;
        this.f11231 = c3594.f11231;
        this.f11232 = c3594.f11232;
        this.f11233 = c3594.f11233;
        this.f11234 = c3594.f11234;
        this.f11235 = c3594.f11235;
        String str = c3594.f11237;
        this.f11237 = str;
        if (str != null) {
            c0274.put(str, this);
        }
        matrix.set(c3594.f11236);
        ArrayList arrayList = c3594.f11228;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C3594) {
                this.f11228.add(new C3594((C3594) obj, c0274));
            } else {
                if (obj instanceof C3593) {
                    C3593 c3593 = (C3593) obj;
                    C3593 c3595 = new C3593(c3593);
                    c3595.f11217 = 0.0f;
                    c3595.f11219 = 1.0f;
                    c3595.f11220 = 1.0f;
                    c3595.f11221 = 0.0f;
                    c3595.f11222 = 1.0f;
                    c3595.f11223 = 0.0f;
                    c3595.f11224 = Paint.Cap.BUTT;
                    c3595.f11225 = Paint.Join.MITER;
                    c3595.f11226 = 4.0f;
                    c3595.f11216 = c3593.f11216;
                    c3595.f11217 = c3593.f11217;
                    c3595.f11219 = c3593.f11219;
                    c3595.f11218 = c3593.f11218;
                    c3595.f11240 = c3593.f11240;
                    c3595.f11220 = c3593.f11220;
                    c3595.f11221 = c3593.f11221;
                    c3595.f11222 = c3593.f11222;
                    c3595.f11223 = c3593.f11223;
                    c3595.f11224 = c3593.f11224;
                    c3595.f11225 = c3593.f11225;
                    c3595.f11226 = c3593.f11226;
                    c3592 = c3595;
                } else if (obj instanceof C3592) {
                    c3592 = new C3592((C3592) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f11228.add(c3592);
                Object obj2 = c3592.f11239;
                if (obj2 != null) {
                    c0274.put(obj2, c3592);
                }
            }
        }
    }
}
