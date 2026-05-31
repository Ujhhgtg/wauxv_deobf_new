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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1454 extends Drawable implements InterfaceC1459, Animatable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0170 f5143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f5145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f5146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f5150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Paint f5151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Rect f5152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f5147 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f5149 = -1;

    public C1454(C0170 c0170) {
        this.f5143 = c0170;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f5146) {
            return;
        }
        if (this.f5150) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f5152 == null) {
                this.f5152 = new Rect();
            }
            Gravity.apply(Opcodes.DNEG, intrinsicWidth, intrinsicHeight, bounds, this.f5152);
            this.f5150 = false;
        }
        C1461 c1461 = (C1461) this.f5143.f1247;
        C1458 c1458 = c1461.f5184;
        Bitmap bitmap = c1458 != null ? c1458.f5173 : c1461.f5187;
        if (this.f5152 == null) {
            this.f5152 = new Rect();
        }
        Rect rect = this.f5152;
        if (this.f5151 == null) {
            this.f5151 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f5151);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5143;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1461) this.f5143.f1247).f5191;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C1461) this.f5143.f1247).f5190;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5144;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5150 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5151 == null) {
            this.f5151 = new Paint(2);
        }
        this.f5151.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5151 == null) {
            this.f5151 = new Paint(2);
        }
        this.f5151.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC2727.m4691("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f5146);
        this.f5147 = z;
        if (!z) {
            this.f5144 = false;
            C1461 c1461 = (C1461) this.f5143.f1247;
            ArrayList arrayList = c1461.f5178;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1461.f5181 = false;
            }
        } else if (this.f5145) {
            m3250();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f5145 = true;
        this.f5148 = 0;
        if (this.f5147) {
            m3250();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f5145 = false;
        this.f5144 = false;
        C1461 c1461 = (C1461) this.f5143.f1247;
        ArrayList arrayList = c1461.f5178;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1461.f5181 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3250() {
        AbstractC2727.m4691("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f5146);
        C1461 c1461 = (C1461) this.f5143.f1247;
        if (c1461.f5176.f9131.f5194 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f5144) {
            return;
        }
        this.f5144 = true;
        ArrayList arrayList = c1461.f5178;
        if (c1461.f5185) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1461.f5181) {
            c1461.f5181 = true;
            c1461.f5185 = false;
            c1461.m3252();
        }
        invalidateSelf();
    }
}
