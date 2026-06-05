package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ能不能要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1882feyxiexzfUjhhgtg extends AbstractC1883feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Matrix f6293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList f6294Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f6295Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f6296Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f6297Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f6298Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f6299Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f6300Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f6301Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Matrix f6302Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public String f6303Ujhhgtgfeyxiexzf;

    public C1882feyxiexzfUjhhgtg() {
        this.f6293Ujhhgtgfeyxiexzf = new Matrix();
        this.f6294Ujhhgtgfeyxiexzf = new ArrayList();
        this.f6295Ujhhgtgfeyxiexzf = 0.0f;
        this.f6296Ujhhgtgfeyxiexzf = 0.0f;
        this.f6297Ujhhgtgfeyxiexzf = 0.0f;
        this.f6298Ujhhgtgfeyxiexzf = 1.0f;
        this.f6299Ujhhgtgfeyxiexzf = 1.0f;
        this.f6300Ujhhgtgfeyxiexzf = 0.0f;
        this.f6301Ujhhgtgfeyxiexzf = 0.0f;
        this.f6302Ujhhgtgfeyxiexzf = new Matrix();
        this.f6303Ujhhgtgfeyxiexzf = null;
    }

    public String getGroupName() {
        return this.f6303Ujhhgtgfeyxiexzf;
    }

    public Matrix getLocalMatrix() {
        return this.f6302Ujhhgtgfeyxiexzf;
    }

    public float getPivotX() {
        return this.f6296Ujhhgtgfeyxiexzf;
    }

    public float getPivotY() {
        return this.f6297Ujhhgtgfeyxiexzf;
    }

    public float getRotation() {
        return this.f6295Ujhhgtgfeyxiexzf;
    }

    public float getScaleX() {
        return this.f6298Ujhhgtgfeyxiexzf;
    }

    public float getScaleY() {
        return this.f6299Ujhhgtgfeyxiexzf;
    }

    public float getTranslateX() {
        return this.f6300Ujhhgtgfeyxiexzf;
    }

    public float getTranslateY() {
        return this.f6301Ujhhgtgfeyxiexzf;
    }

    public void setPivotX(float f) {
        if (f != this.f6296Ujhhgtgfeyxiexzf) {
            this.f6296Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f6297Ujhhgtgfeyxiexzf) {
            this.f6297Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setRotation(float f) {
        if (f != this.f6295Ujhhgtgfeyxiexzf) {
            this.f6295Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f6298Ujhhgtgfeyxiexzf) {
            this.f6298Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f6299Ujhhgtgfeyxiexzf) {
            this.f6299Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f6300Ujhhgtgfeyxiexzf) {
            this.f6300Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f6301Ujhhgtgfeyxiexzf) {
            this.f6301Ujhhgtgfeyxiexzf = f;
            m3207Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC1883feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo3175Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6294Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1883feyxiexzfUjhhgtg) arrayList.get(i)).mo3175Ujhhgtgfeyxiexzf()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.AbstractC1883feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo3176Ujhhgtgfeyxiexzf(int[] iArr) {
        int i = 0;
        boolean zMo3176Ujhhgtgfeyxiexzf = false;
        while (true) {
            ArrayList arrayList = this.f6294Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return zMo3176Ujhhgtgfeyxiexzf;
            }
            zMo3176Ujhhgtgfeyxiexzf |= ((AbstractC1883feyxiexzfUjhhgtg) arrayList.get(i)).mo3176Ujhhgtgfeyxiexzf(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3207Ujhhgtgfeyxiexzf() {
        Matrix matrix = this.f6302Ujhhgtgfeyxiexzf;
        matrix.reset();
        matrix.postTranslate(-this.f6296Ujhhgtgfeyxiexzf, -this.f6297Ujhhgtgfeyxiexzf);
        matrix.postScale(this.f6298Ujhhgtgfeyxiexzf, this.f6299Ujhhgtgfeyxiexzf);
        matrix.postRotate(this.f6295Ujhhgtgfeyxiexzf, 0.0f, 0.0f);
        matrix.postTranslate(this.f6300Ujhhgtgfeyxiexzf + this.f6296Ujhhgtgfeyxiexzf, this.f6301Ujhhgtgfeyxiexzf + this.f6297Ujhhgtgfeyxiexzf);
    }

    public C1882feyxiexzfUjhhgtg(C1882feyxiexzfUjhhgtg c1882feyxiexzfUjhhgtg, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        AbstractC1879feyxiexzfUjhhgtg c1848Ujhhgtgfeyxiexzf;
        this.f6293Ujhhgtgfeyxiexzf = new Matrix();
        this.f6294Ujhhgtgfeyxiexzf = new ArrayList();
        this.f6295Ujhhgtgfeyxiexzf = 0.0f;
        this.f6296Ujhhgtgfeyxiexzf = 0.0f;
        this.f6297Ujhhgtgfeyxiexzf = 0.0f;
        this.f6298Ujhhgtgfeyxiexzf = 1.0f;
        this.f6299Ujhhgtgfeyxiexzf = 1.0f;
        this.f6300Ujhhgtgfeyxiexzf = 0.0f;
        this.f6301Ujhhgtgfeyxiexzf = 0.0f;
        Matrix matrix = new Matrix();
        this.f6302Ujhhgtgfeyxiexzf = matrix;
        this.f6303Ujhhgtgfeyxiexzf = null;
        this.f6295Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6295Ujhhgtgfeyxiexzf;
        this.f6296Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6296Ujhhgtgfeyxiexzf;
        this.f6297Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6297Ujhhgtgfeyxiexzf;
        this.f6298Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6298Ujhhgtgfeyxiexzf;
        this.f6299Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6299Ujhhgtgfeyxiexzf;
        this.f6300Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6300Ujhhgtgfeyxiexzf;
        this.f6301Ujhhgtgfeyxiexzf = c1882feyxiexzfUjhhgtg.f6301Ujhhgtgfeyxiexzf;
        String str = c1882feyxiexzfUjhhgtg.f6303Ujhhgtgfeyxiexzf;
        this.f6303Ujhhgtgfeyxiexzf = str;
        if (str != null) {
            c2412Ujhhgtgfeyxiexzf.put(str, this);
        }
        matrix.set(c1882feyxiexzfUjhhgtg.f6302Ujhhgtgfeyxiexzf);
        ArrayList arrayList = c1882feyxiexzfUjhhgtg.f6294Ujhhgtgfeyxiexzf;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C1882feyxiexzfUjhhgtg) {
                this.f6294Ujhhgtgfeyxiexzf.add(new C1882feyxiexzfUjhhgtg((C1882feyxiexzfUjhhgtg) obj, c2412Ujhhgtgfeyxiexzf));
            } else {
                if (obj instanceof C1849Ujhhgtgfeyxiexzf) {
                    C1849Ujhhgtgfeyxiexzf c1849Ujhhgtgfeyxiexzf = (C1849Ujhhgtgfeyxiexzf) obj;
                    C1849Ujhhgtgfeyxiexzf c1849Ujhhgtgfeyxiexzf2 = new C1849Ujhhgtgfeyxiexzf(c1849Ujhhgtgfeyxiexzf);
                    c1849Ujhhgtgfeyxiexzf2.f6192Ujhhgtgfeyxiexzf = 0.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6194Ujhhgtgfeyxiexzf = 1.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6195Ujhhgtgfeyxiexzf = 1.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6196Ujhhgtgfeyxiexzf = 0.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6197Ujhhgtgfeyxiexzf = 1.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6198Ujhhgtgfeyxiexzf = 0.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6199Ujhhgtgfeyxiexzf = Paint.Cap.BUTT;
                    c1849Ujhhgtgfeyxiexzf2.f6200Ujhhgtgfeyxiexzf = Paint.Join.MITER;
                    c1849Ujhhgtgfeyxiexzf2.f6201Ujhhgtgfeyxiexzf = 4.0f;
                    c1849Ujhhgtgfeyxiexzf2.f6191Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6191Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6192Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6192Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6194Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6193Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6193Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6279Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6279Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6195Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6196Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6196Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6197Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6198Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6198Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6199Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6199Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6200Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6200Ujhhgtgfeyxiexzf;
                    c1849Ujhhgtgfeyxiexzf2.f6201Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6201Ujhhgtgfeyxiexzf;
                    c1848Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf2;
                } else if (obj instanceof C1848Ujhhgtgfeyxiexzf) {
                    c1848Ujhhgtgfeyxiexzf = new C1848Ujhhgtgfeyxiexzf((C1848Ujhhgtgfeyxiexzf) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f6294Ujhhgtgfeyxiexzf.add(c1848Ujhhgtgfeyxiexzf);
                Object obj2 = c1848Ujhhgtgfeyxiexzf.f6278Ujhhgtgfeyxiexzf;
                if (obj2 != null) {
                    c2412Ujhhgtgfeyxiexzf.put(obj2, c1848Ujhhgtgfeyxiexzf);
                }
            }
        }
    }
}
