package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3536 extends AbstractC3537 {

    public final Matrix f11078;

    public final ArrayList f11079;

    public float f11080;

    public float f11081;

    public float f11082;

    public float f11083;

    public float f11084;

    public float f11085;

    public float f11086;

    public final Matrix f11087;

    public String f11088;

    public C3536() {
        this.f11078 = new Matrix();
        this.f11079 = new ArrayList();
        this.f11080 = 0.0f;
        this.f11081 = 0.0f;
        this.f11082 = 0.0f;
        this.f11083 = 1.0f;
        this.f11084 = 1.0f;
        this.f11085 = 0.0f;
        this.f11086 = 0.0f;
        this.f11087 = new Matrix();
        this.f11088 = null;
    }

    public String getGroupName() {
        return this.f11088;
    }

    public Matrix getLocalMatrix() {
        return this.f11087;
    }

    public float getPivotX() {
        return this.f11081;
    }

    public float getPivotY() {
        return this.f11082;
    }

    public float getRotation() {
        return this.f11080;
    }

    public float getScaleX() {
        return this.f11083;
    }

    public float getScaleY() {
        return this.f11084;
    }

    public float getTranslateX() {
        return this.f11085;
    }

    public float getTranslateY() {
        return this.f11086;
    }

    public void setPivotX(float f) {
        if (f != this.f11081) {
            this.f11081 = f;
            m5130();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f11082) {
            this.f11082 = f;
            m5130();
        }
    }

    public void setRotation(float f) {
        if (f != this.f11080) {
            this.f11080 = f;
            m5130();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f11083) {
            this.f11083 = f;
            m5130();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f11084) {
            this.f11084 = f;
            m5130();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f11085) {
            this.f11085 = f;
            m5130();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f11086) {
            this.f11086 = f;
            m5130();
        }
    }

    @Override // p000.AbstractC3537
    public final boolean mo5128() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11079;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3537) arrayList.get(i)).mo5128()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.AbstractC3537
    public final boolean mo5129(int[] iArr) {
        int i = 0;
        boolean zMo5129 = false;
        while (true) {
            ArrayList arrayList = this.f11079;
            if (i >= arrayList.size()) {
                return zMo5129;
            }
            zMo5129 |= ((AbstractC3537) arrayList.get(i)).mo5129(iArr);
            i++;
        }
    }

    public final void m5130() {
        Matrix matrix = this.f11087;
        matrix.reset();
        matrix.postTranslate(-this.f11081, -this.f11082);
        matrix.postScale(this.f11083, this.f11084);
        matrix.postRotate(this.f11080, 0.0f, 0.0f);
        matrix.postTranslate(this.f11085 + this.f11081, this.f11086 + this.f11082);
    }

    public C3536(C3536 c3536, C0264 c0264) {
        AbstractC3538 c3534;
        this.f11078 = new Matrix();
        this.f11079 = new ArrayList();
        this.f11080 = 0.0f;
        this.f11081 = 0.0f;
        this.f11082 = 0.0f;
        this.f11083 = 1.0f;
        this.f11084 = 1.0f;
        this.f11085 = 0.0f;
        this.f11086 = 0.0f;
        Matrix matrix = new Matrix();
        this.f11087 = matrix;
        this.f11088 = null;
        this.f11080 = c3536.f11080;
        this.f11081 = c3536.f11081;
        this.f11082 = c3536.f11082;
        this.f11083 = c3536.f11083;
        this.f11084 = c3536.f11084;
        this.f11085 = c3536.f11085;
        this.f11086 = c3536.f11086;
        String str = c3536.f11088;
        this.f11088 = str;
        if (str != null) {
            c0264.put(str, this);
        }
        matrix.set(c3536.f11087);
        ArrayList arrayList = c3536.f11079;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C3536) {
                this.f11079.add(new C3536((C3536) obj, c0264));
            } else {
                if (obj instanceof C3535) {
                    C3535 c3535 = (C3535) obj;
                    C3535 c3537 = new C3535(c3535);
                    c3537.f11068 = 0.0f;
                    c3537.f11070 = 1.0f;
                    c3537.f11071 = 1.0f;
                    c3537.f11072 = 0.0f;
                    c3537.f11073 = 1.0f;
                    c3537.f11074 = 0.0f;
                    c3537.f11075 = Paint.Cap.BUTT;
                    c3537.f11076 = Paint.Join.MITER;
                    c3537.f11077 = 4.0f;
                    c3537.f11067 = c3535.f11067;
                    c3537.f11068 = c3535.f11068;
                    c3537.f11070 = c3535.f11070;
                    c3537.f11069 = c3535.f11069;
                    c3537.f11091 = c3535.f11091;
                    c3537.f11071 = c3535.f11071;
                    c3537.f11072 = c3535.f11072;
                    c3537.f11073 = c3535.f11073;
                    c3537.f11074 = c3535.f11074;
                    c3537.f11075 = c3535.f11075;
                    c3537.f11076 = c3535.f11076;
                    c3537.f11077 = c3535.f11077;
                    c3534 = c3537;
                } else if (obj instanceof C3534) {
                    c3534 = new C3534((C3534) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f11079.add(c3534);
                Object obj2 = c3534.f11090;
                if (obj2 != null) {
                    c0264.put(obj2, c3534);
                }
            }
        }
    }
}
