package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1446 extends Drawable implements InterfaceC1451, Animatable {

    public final C0162 f5114;

    public boolean f5115;

    public boolean f5116;

    public boolean f5117;

    public int f5119;

    public boolean f5121;

    public Paint f5122;

    public Rect f5123;

    public boolean f5118 = true;

    public final int f5120 = -1;

    public C1446(C0162 c0162) {
        this.f5114 = c0162;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f5117) {
            return;
        }
        if (this.f5121) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f5123 == null) {
                this.f5123 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f5123);
            this.f5121 = false;
        }
        C1453 c1453 = (C1453) this.f5114.f1179;
        C1450 c1450 = c1453.f5155;
        Bitmap bitmap = c1450 != null ? c1450.f5144 : c1453.f5158;
        if (this.f5123 == null) {
            this.f5123 = new Rect();
        }
        Rect rect = this.f5123;
        if (this.f5122 == null) {
            this.f5122 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f5122);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5114;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1453) this.f5114.f1179).f5162;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C1453) this.f5114.f1179).f5161;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5115;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5121 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5122 == null) {
            this.f5122 = new Paint(2);
        }
        this.f5122.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5122 == null) {
            this.f5122 = new Paint(2);
        }
        this.f5122.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC1460.m3208("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f5117);
        this.f5118 = z;
        if (!z) {
            this.f5115 = false;
            C1453 c1453 = (C1453) this.f5114.f1179;
            ArrayList arrayList = c1453.f5149;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1453.f5152 = false;
            }
        } else if (this.f5116) {
            m3143();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f5116 = true;
        this.f5119 = 0;
        if (this.f5118) {
            m3143();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f5116 = false;
        this.f5115 = false;
        C1453 c1453 = (C1453) this.f5114.f1179;
        ArrayList arrayList = c1453.f5149;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1453.f5152 = false;
        }
    }

    public final void m3143() {
        AbstractC1460.m3208("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f5117);
        C1453 c1453 = (C1453) this.f5114.f1179;
        if (c1453.f5147.f8970.f5165 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f5115) {
            return;
        }
        this.f5115 = true;
        ArrayList arrayList = c1453.f5149;
        if (c1453.f5156) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1453.f5152) {
            c1453.f5152 = true;
            c1453.f5156 = false;
            c1453.m3145();
        }
        invalidateSelf();
    }
}
