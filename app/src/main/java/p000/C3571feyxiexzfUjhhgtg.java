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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3571feyxiexzfUjhhgtg extends Drawable implements InterfaceC3578Ujhhgtgfeyxiexzf, Animatable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3034feyxiexzfUjhhgtg f11095Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f11096Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f11097Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f11098Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f11100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f11102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Paint f11103Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Rect f11104Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f11099Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f11101Ujhhgtgfeyxiexzf = -1;

    public C3571feyxiexzfUjhhgtg(C3034feyxiexzfUjhhgtg c3034feyxiexzfUjhhgtg) {
        this.f11095Ujhhgtgfeyxiexzf = c3034feyxiexzfUjhhgtg;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f11098Ujhhgtgfeyxiexzf) {
            return;
        }
        if (this.f11102Ujhhgtgfeyxiexzf) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f11104Ujhhgtgfeyxiexzf == null) {
                this.f11104Ujhhgtgfeyxiexzf = new Rect();
            }
            Gravity.apply(Opcodes.DNEG, intrinsicWidth, intrinsicHeight, bounds, this.f11104Ujhhgtgfeyxiexzf);
            this.f11102Ujhhgtgfeyxiexzf = false;
        }
        C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
        C3582feyxiexzfUjhhgtg c3582feyxiexzfUjhhgtg = c3580feyxiexzfUjhhgtg.f11133Ujhhgtgfeyxiexzf;
        Bitmap bitmap = c3582feyxiexzfUjhhgtg != null ? c3582feyxiexzfUjhhgtg.f11158Ujhhgtgfeyxiexzf : c3580feyxiexzfUjhhgtg.f11136Ujhhgtgfeyxiexzf;
        if (this.f11104Ujhhgtgfeyxiexzf == null) {
            this.f11104Ujhhgtgfeyxiexzf = new Rect();
        }
        Rect rect = this.f11104Ujhhgtgfeyxiexzf;
        if (this.f11103Ujhhgtgfeyxiexzf == null) {
            this.f11103Ujhhgtgfeyxiexzf = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f11103Ujhhgtgfeyxiexzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f11095Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11140Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11139Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f11096Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11102Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f11103Ujhhgtgfeyxiexzf == null) {
            this.f11103Ujhhgtgfeyxiexzf = new Paint(2);
        }
        this.f11103Ujhhgtgfeyxiexzf.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f11103Ujhhgtgfeyxiexzf == null) {
            this.f11103Ujhhgtgfeyxiexzf = new Paint(2);
        }
        this.f11103Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f11098Ujhhgtgfeyxiexzf);
        this.f11099Ujhhgtgfeyxiexzf = z;
        if (!z) {
            this.f11096Ujhhgtgfeyxiexzf = false;
            C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
            ArrayList arrayList = c3580feyxiexzfUjhhgtg.f11127Ujhhgtgfeyxiexzf;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c3580feyxiexzfUjhhgtg.f11130Ujhhgtgfeyxiexzf = false;
            }
        } else if (this.f11097Ujhhgtgfeyxiexzf) {
            m5107Ujhhgtgfeyxiexzf();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f11097Ujhhgtgfeyxiexzf = true;
        this.f11100Ujhhgtgfeyxiexzf = 0;
        if (this.f11099Ujhhgtgfeyxiexzf) {
            m5107Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f11097Ujhhgtgfeyxiexzf = false;
        this.f11096Ujhhgtgfeyxiexzf = false;
        C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c3580feyxiexzfUjhhgtg.f11127Ujhhgtgfeyxiexzf;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c3580feyxiexzfUjhhgtg.f11130Ujhhgtgfeyxiexzf = false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5107Ujhhgtgfeyxiexzf() {
        AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f11098Ujhhgtgfeyxiexzf);
        C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) this.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
        if (c3580feyxiexzfUjhhgtg.f11125Ujhhgtgfeyxiexzf.f4266Ujhhgtgfeyxiexzf.f11116Ujhhgtgfeyxiexzf == 1) {
            invalidateSelf();
            return;
        }
        if (this.f11096Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f11096Ujhhgtgfeyxiexzf = true;
        ArrayList arrayList = c3580feyxiexzfUjhhgtg.f11127Ujhhgtgfeyxiexzf;
        if (c3580feyxiexzfUjhhgtg.f11134Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c3580feyxiexzfUjhhgtg.f11130Ujhhgtgfeyxiexzf) {
            c3580feyxiexzfUjhhgtg.f11130Ujhhgtgfeyxiexzf = true;
            c3580feyxiexzfUjhhgtg.f11134Ujhhgtgfeyxiexzf = false;
            c3580feyxiexzfUjhhgtg.m5113Ujhhgtgfeyxiexzf();
        }
        invalidateSelf();
    }
}
