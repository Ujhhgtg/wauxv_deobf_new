package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2802Ujhhgtgfeyxiexzf extends C0226Ujhhgtgfeyxiexzf implements Drawable.Callback, InterfaceC1971Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final int[] f8847Ujhhgtgfeyxiexzf = {R.attr.state_enabled};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final ShapeDrawable f8848feyxiexzfUjhhgtg = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public ColorStateList f8849feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public ColorStateList f8850feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f8851feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f8852feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public ColorStateList f8853feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public float f8854feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public ColorStateList f8855feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public CharSequence f8856feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f8857feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public Drawable f8858feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f8859feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public float f8860feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public boolean f8861feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f8862feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public Drawable f8863feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public RippleDrawable f8864feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f8865feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public float f8866feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public SpannableStringBuilder f8867feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public boolean f8868feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f8869feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public Drawable f8870feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f8871feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C0353Ujhhgtgfeyxiexzf f8872Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C0353Ujhhgtgfeyxiexzf f8873Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f8874Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f8875Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f8876Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f8877Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public float f8878feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public float f8879feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public float f8880feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f8881feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final Context f8882feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final Paint f8883feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Paint.FontMetrics f8884Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f8885Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final PointF f8886feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final Path f8887feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C1970Ujhhgtgfeyxiexzf f8888Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8889feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f8890Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8891Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f8892feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8893feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8894Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f8895feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f8896Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f8897Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorFilter f8898Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PorterDuffColorFilter f8899Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ColorStateList f8900Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PorterDuff.Mode f8901Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public int[] f8902feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public ColorStateList f8903feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public WeakReference f8904feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public TextUtils.TruncateAt f8905feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public boolean f8906feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8907feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f8908Ujhhgtgfeyxiexzf;

    public C2802Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f8852feyxiexzfUjhhgtg = -1.0f;
        this.f8883feyxiexzfUjhhgtg = new Paint(1);
        this.f8884Ujhhgtgfeyxiexzf = new Paint.FontMetrics();
        this.f8885Ujhhgtgfeyxiexzf = new RectF();
        this.f8886feyxiexzfUjhhgtg = new PointF();
        this.f8887feyxiexzfUjhhgtg = new Path();
        this.f8897Ujhhgtgfeyxiexzf = 255;
        this.f8901Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;
        this.f8904feyxiexzfUjhhgtg = new WeakReference(null);
        m1367Ujhhgtgfeyxiexzf(context);
        this.f8882feyxiexzfUjhhgtg = context;
        C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = new C1970Ujhhgtgfeyxiexzf(this);
        this.f8888Ujhhgtgfeyxiexzf = c1970Ujhhgtgfeyxiexzf;
        this.f8856feyxiexzfUjhhgtg = "";
        c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8847Ujhhgtgfeyxiexzf;
        setState(iArr);
        if (!Arrays.equals(this.f8902feyxiexzfUjhhgtg, iArr)) {
            this.f8902feyxiexzfUjhhgtg = iArr;
            if (m4123Ujhhgtgfeyxiexzf()) {
                m4100feyxiexzfUjhhgtg(getState(), iArr);
            }
        }
        this.f8906feyxiexzfUjhhgtg = true;
        int[] iArr2 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        f8848feyxiexzfUjhhgtg.setTint(-1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m4091feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean m4092feyxiexzfUjhhgtg(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m4093Ujhhgtgfeyxiexzf(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f8897Ujhhgtgfeyxiexzf) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f8908Ujhhgtgfeyxiexzf;
        Paint paint = this.f8883feyxiexzfUjhhgtg;
        RectF rectF = this.f8885Ujhhgtgfeyxiexzf;
        if (!z) {
            paint.setColor(this.f8889feyxiexzfUjhhgtg);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4098Ujhhgtgfeyxiexzf(), m4098Ujhhgtgfeyxiexzf(), paint);
        }
        if (!this.f8908Ujhhgtgfeyxiexzf) {
            paint.setColor(this.f8890Ujhhgtgfeyxiexzf);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f8898Ujhhgtgfeyxiexzf;
            if (colorFilter == null) {
                colorFilter = this.f8899Ujhhgtgfeyxiexzf;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4098Ujhhgtgfeyxiexzf(), m4098Ujhhgtgfeyxiexzf(), paint);
        }
        if (this.f8908Ujhhgtgfeyxiexzf) {
            super.draw(canvas);
        }
        if (this.f8854feyxiexzfUjhhgtg > 0.0f && !this.f8908Ujhhgtgfeyxiexzf) {
            paint.setColor(this.f8892feyxiexzfUjhhgtg);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f8908Ujhhgtgfeyxiexzf) {
                ColorFilter colorFilter2 = this.f8898Ujhhgtgfeyxiexzf;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f8899Ujhhgtgfeyxiexzf;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f8854feyxiexzfUjhhgtg / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f8852feyxiexzfUjhhgtg - (this.f8854feyxiexzfUjhhgtg / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f8893feyxiexzfUjhhgtg);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f8908Ujhhgtgfeyxiexzf) {
            RectF rectF2 = new RectF(bounds);
            C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = c0223Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf;
            float f4 = c0223Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f1543Ujhhgtgfeyxiexzf;
            C1024feyxiexzfUjhhgtg c1024feyxiexzfUjhhgtg = this.f1544Ujhhgtgfeyxiexzf;
            Path path = this.f8887feyxiexzfUjhhgtg;
            c1024feyxiexzfUjhhgtg.m2520Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg, f4, rectF2, c0709Ujhhgtgfeyxiexzf, path);
            m1362Ujhhgtgfeyxiexzf(canvas2, paint, path, this.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf, m1364Ujhhgtgfeyxiexzf());
        } else {
            canvas2.drawRoundRect(rectF, m4098Ujhhgtgfeyxiexzf(), m4098Ujhhgtgfeyxiexzf(), paint);
        }
        if (m4122Ujhhgtgfeyxiexzf()) {
            m4095Ujhhgtgfeyxiexzf(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f8858feyxiexzfUjhhgtg.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8858feyxiexzfUjhhgtg.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m4121Ujhhgtgfeyxiexzf()) {
            m4095Ujhhgtgfeyxiexzf(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f8870feyxiexzfUjhhgtg.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8870feyxiexzfUjhhgtg.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f8906feyxiexzfUjhhgtg && this.f8856feyxiexzfUjhhgtg != null) {
            PointF pointF = this.f8886feyxiexzfUjhhgtg;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f8856feyxiexzfUjhhgtg;
            C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = this.f8888Ujhhgtgfeyxiexzf;
            if (charSequence != null) {
                float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf() + this.f8874Ujhhgtgfeyxiexzf + this.f8877Ujhhgtgfeyxiexzf;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM4096Ujhhgtgfeyxiexzf;
                } else {
                    pointF.x = bounds.right - fM4096Ujhhgtgfeyxiexzf;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf;
                Paint.FontMetrics fontMetrics = this.f8884Ujhhgtgfeyxiexzf;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f8856feyxiexzfUjhhgtg != null) {
                float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf() + this.f8874Ujhhgtgfeyxiexzf + this.f8877Ujhhgtgfeyxiexzf;
                float fM4097Ujhhgtgfeyxiexzf = m4097Ujhhgtgfeyxiexzf() + this.f8881feyxiexzfUjhhgtg + this.f8878feyxiexzfUjhhgtg;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM4096Ujhhgtgfeyxiexzf2;
                    rectF.right = bounds.right - fM4097Ujhhgtgfeyxiexzf;
                } else {
                    rectF.left = bounds.left + fM4097Ujhhgtgfeyxiexzf;
                    rectF.right = bounds.right - fM4096Ujhhgtgfeyxiexzf2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = c1970Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf;
            TextPaint textPaint2 = c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf;
            if (c1969Ujhhgtgfeyxiexzf != null) {
                textPaint2.drawableState = getState();
                c1970Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf.m3305Ujhhgtgfeyxiexzf(this.f8882feyxiexzfUjhhgtg, textPaint2, c1970Ujhhgtgfeyxiexzf.f6468Ujhhgtgfeyxiexzf);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c1970Ujhhgtgfeyxiexzf.m3308Ujhhgtgfeyxiexzf(this.f8856feyxiexzfUjhhgtg.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f8856feyxiexzfUjhhgtg;
            if (z2 && this.f8905feyxiexzfUjhhgtg != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f8905feyxiexzfUjhhgtg);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m4123Ujhhgtgfeyxiexzf()) {
            rectF.setEmpty();
            if (m4123Ujhhgtgfeyxiexzf()) {
                float f9 = this.f8881feyxiexzfUjhhgtg + this.f8880feyxiexzfUjhhgtg;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f8866feyxiexzfUjhhgtg;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f8866feyxiexzfUjhhgtg;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f8866feyxiexzfUjhhgtg;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f8863feyxiexzfUjhhgtg.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
            this.f8864feyxiexzfUjhhgtg.setBounds(this.f8863feyxiexzfUjhhgtg.getBounds());
            this.f8864feyxiexzfUjhhgtg.jumpToCurrentState();
            this.f8864feyxiexzfUjhhgtg.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f8897Ujhhgtgfeyxiexzf < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8897Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8898Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f8851feyxiexzfUjhhgtg;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m4097Ujhhgtgfeyxiexzf() + this.f8888Ujhhgtgfeyxiexzf.m3308Ujhhgtgfeyxiexzf(this.f8856feyxiexzfUjhhgtg.toString()) + m4096Ujhhgtgfeyxiexzf() + this.f8874Ujhhgtgfeyxiexzf + this.f8877Ujhhgtgfeyxiexzf + this.f8878feyxiexzfUjhhgtg + this.f8881feyxiexzfUjhhgtg), this.f8907feyxiexzfUjhhgtg);
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f8908Ujhhgtgfeyxiexzf) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8851feyxiexzfUjhhgtg, this.f8852feyxiexzfUjhhgtg);
        } else {
            outline.setRoundRect(bounds, this.f8852feyxiexzfUjhhgtg);
            outline2 = outline;
        }
        outline2.setAlpha(this.f8897Ujhhgtgfeyxiexzf / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m4091feyxiexzfUjhhgtg(this.f8849feyxiexzfUjhhgtg) || m4091feyxiexzfUjhhgtg(this.f8850feyxiexzfUjhhgtg) || m4091feyxiexzfUjhhgtg(this.f8853feyxiexzfUjhhgtg)) {
            return true;
        }
        C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = this.f8888Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf;
        if (c1969Ujhhgtgfeyxiexzf == null || (colorStateList = c1969Ujhhgtgfeyxiexzf.f6462Ujhhgtgfeyxiexzf) == null || !colorStateList.isStateful()) {
            return (this.f8869feyxiexzfUjhhgtg && this.f8870feyxiexzfUjhhgtg != null && this.f8868feyxiexzfUjhhgtg) || m4092feyxiexzfUjhhgtg(this.f8858feyxiexzfUjhhgtg) || m4092feyxiexzfUjhhgtg(this.f8870feyxiexzfUjhhgtg) || m4091feyxiexzfUjhhgtg(this.f8900Ujhhgtgfeyxiexzf);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4122Ujhhgtgfeyxiexzf()) {
            zOnLayoutDirectionChanged |= this.f8858feyxiexzfUjhhgtg.setLayoutDirection(i);
        }
        if (m4121Ujhhgtgfeyxiexzf()) {
            zOnLayoutDirectionChanged |= this.f8870feyxiexzfUjhhgtg.setLayoutDirection(i);
        }
        if (m4123Ujhhgtgfeyxiexzf()) {
            zOnLayoutDirectionChanged |= this.f8863feyxiexzfUjhhgtg.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m4122Ujhhgtgfeyxiexzf()) {
            zOnLevelChange |= this.f8858feyxiexzfUjhhgtg.setLevel(i);
        }
        if (m4121Ujhhgtgfeyxiexzf()) {
            zOnLevelChange |= this.f8870feyxiexzfUjhhgtg.setLevel(i);
        }
        if (m4123Ujhhgtgfeyxiexzf()) {
            zOnLevelChange |= this.f8863feyxiexzfUjhhgtg.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f8908Ujhhgtgfeyxiexzf) {
            super.onStateChange(iArr);
        }
        return m4100feyxiexzfUjhhgtg(iArr, this.f8902feyxiexzfUjhhgtg);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8897Ujhhgtgfeyxiexzf != i) {
            this.f8897Ujhhgtgfeyxiexzf = i;
            invalidateSelf();
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8898Ujhhgtgfeyxiexzf != colorFilter) {
            this.f8898Ujhhgtgfeyxiexzf = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8900Ujhhgtgfeyxiexzf != colorStateList) {
            this.f8900Ujhhgtgfeyxiexzf = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f8901Ujhhgtgfeyxiexzf != mode) {
            this.f8901Ujhhgtgfeyxiexzf = mode;
            ColorStateList colorStateList = this.f8900Ujhhgtgfeyxiexzf;
            this.f8899Ujhhgtgfeyxiexzf = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4122Ujhhgtgfeyxiexzf()) {
            visible |= this.f8858feyxiexzfUjhhgtg.setVisible(z, z2);
        }
        if (m4121Ujhhgtgfeyxiexzf()) {
            visible |= this.f8870feyxiexzfUjhhgtg.setVisible(z, z2);
        }
        if (m4123Ujhhgtgfeyxiexzf()) {
            visible |= this.f8863feyxiexzfUjhhgtg.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // p000.C0226Ujhhgtgfeyxiexzf, p000.InterfaceC1971Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1358Ujhhgtgfeyxiexzf() {
        m4099feyxiexzfUjhhgtg();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m4094Ujhhgtgfeyxiexzf(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f8863feyxiexzfUjhhgtg) {
            if (drawable.isStateful()) {
                drawable.setState(this.f8902feyxiexzfUjhhgtg);
            }
            drawable.setTintList(this.f8865feyxiexzfUjhhgtg);
            return;
        }
        Drawable drawable2 = this.f8858feyxiexzfUjhhgtg;
        if (drawable == drawable2 && this.f8861feyxiexzfUjhhgtg) {
            drawable2.setTintList(this.f8859feyxiexzfUjhhgtg);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4095Ujhhgtgfeyxiexzf(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4122Ujhhgtgfeyxiexzf() || m4121Ujhhgtgfeyxiexzf()) {
            float f = this.f8874Ujhhgtgfeyxiexzf + this.f8875Ujhhgtgfeyxiexzf;
            Drawable drawable = this.f8895feyxiexzfUjhhgtg ? this.f8870feyxiexzfUjhhgtg : this.f8858feyxiexzfUjhhgtg;
            float intrinsicWidth = this.f8860feyxiexzfUjhhgtg;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f8895feyxiexzfUjhhgtg ? this.f8870feyxiexzfUjhhgtg : this.f8858feyxiexzfUjhhgtg;
            float fCeil = this.f8860feyxiexzfUjhhgtg;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(this.f8882feyxiexzfUjhhgtg, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final float m4096Ujhhgtgfeyxiexzf() {
        if (!m4122Ujhhgtgfeyxiexzf() && !m4121Ujhhgtgfeyxiexzf()) {
            return 0.0f;
        }
        float f = this.f8875Ujhhgtgfeyxiexzf;
        Drawable drawable = this.f8895feyxiexzfUjhhgtg ? this.f8870feyxiexzfUjhhgtg : this.f8858feyxiexzfUjhhgtg;
        float intrinsicWidth = this.f8860feyxiexzfUjhhgtg;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f8876Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final float m4097Ujhhgtgfeyxiexzf() {
        if (m4123Ujhhgtgfeyxiexzf()) {
            return this.f8879feyxiexzfUjhhgtg + this.f8866feyxiexzfUjhhgtg + this.f8880feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final float m4098Ujhhgtgfeyxiexzf() {
        return this.f8908Ujhhgtgfeyxiexzf ? m1365Ujhhgtgfeyxiexzf() : this.f8852feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4099feyxiexzfUjhhgtg() {
        InterfaceC2801Ujhhgtgfeyxiexzf interfaceC2801Ujhhgtgfeyxiexzf = (InterfaceC2801Ujhhgtgfeyxiexzf) this.f8904feyxiexzfUjhhgtg.get();
        if (interfaceC2801Ujhhgtgfeyxiexzf != null) {
            Chip chip = (Chip) interfaceC2801Ujhhgtgfeyxiexzf;
            chip.m817Ujhhgtgfeyxiexzf(chip.f770Ujhhgtgfeyxiexzf);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m4100feyxiexzfUjhhgtg(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f8849feyxiexzfUjhhgtg;
        int iM1360Ujhhgtgfeyxiexzf = m1360Ujhhgtgfeyxiexzf(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f8889feyxiexzfUjhhgtg) : 0);
        boolean state = true;
        if (this.f8889feyxiexzfUjhhgtg != iM1360Ujhhgtgfeyxiexzf) {
            this.f8889feyxiexzfUjhhgtg = iM1360Ujhhgtgfeyxiexzf;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f8850feyxiexzfUjhhgtg;
        int iM1360Ujhhgtgfeyxiexzf2 = m1360Ujhhgtgfeyxiexzf(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f8890Ujhhgtgfeyxiexzf) : 0);
        if (this.f8890Ujhhgtgfeyxiexzf != iM1360Ujhhgtgfeyxiexzf2) {
            this.f8890Ujhhgtgfeyxiexzf = iM1360Ujhhgtgfeyxiexzf2;
            zOnStateChange = true;
        }
        int iM4260Ujhhgtgfeyxiexzf = AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(iM1360Ujhhgtgfeyxiexzf2, iM1360Ujhhgtgfeyxiexzf);
        if ((this.f8891Ujhhgtgfeyxiexzf != iM4260Ujhhgtgfeyxiexzf) | (this.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf == null)) {
            this.f8891Ujhhgtgfeyxiexzf = iM4260Ujhhgtgfeyxiexzf;
            m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(iM4260Ujhhgtgfeyxiexzf));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f8853feyxiexzfUjhhgtg;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f8892feyxiexzfUjhhgtg) : 0;
        if (this.f8892feyxiexzfUjhhgtg != colorForState) {
            this.f8892feyxiexzfUjhhgtg = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f8903feyxiexzfUjhhgtg == null || !AbstractC0925feyxiexzfUjhhgtg.m2426Ujhhgtgfeyxiexzf(iArr)) ? 0 : this.f8903feyxiexzfUjhhgtg.getColorForState(iArr, this.f8893feyxiexzfUjhhgtg);
        if (this.f8893feyxiexzfUjhhgtg != colorForState2) {
            this.f8893feyxiexzfUjhhgtg = colorForState2;
        }
        C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = this.f8888Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf;
        int colorForState3 = (c1969Ujhhgtgfeyxiexzf == null || (colorStateList = c1969Ujhhgtgfeyxiexzf.f6462Ujhhgtgfeyxiexzf) == null) ? 0 : colorStateList.getColorForState(iArr, this.f8894Ujhhgtgfeyxiexzf);
        if (this.f8894Ujhhgtgfeyxiexzf != colorForState3) {
            this.f8894Ujhhgtgfeyxiexzf = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.f8868feyxiexzfUjhhgtg) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.f8895feyxiexzfUjhhgtg == z || this.f8870feyxiexzfUjhhgtg == null) {
            z2 = false;
        } else {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8895feyxiexzfUjhhgtg = z;
            if (fM4096Ujhhgtgfeyxiexzf != m4096Ujhhgtgfeyxiexzf()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f8900Ujhhgtgfeyxiexzf;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f8896Ujhhgtgfeyxiexzf) : 0;
        if (this.f8896Ujhhgtgfeyxiexzf != colorForState4) {
            this.f8896Ujhhgtgfeyxiexzf = colorForState4;
            ColorStateList colorStateList6 = this.f8900Ujhhgtgfeyxiexzf;
            PorterDuff.Mode mode = this.f8901Ujhhgtgfeyxiexzf;
            this.f8899Ujhhgtgfeyxiexzf = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m4092feyxiexzfUjhhgtg(this.f8858feyxiexzfUjhhgtg)) {
            state |= this.f8858feyxiexzfUjhhgtg.setState(iArr);
        }
        if (m4092feyxiexzfUjhhgtg(this.f8870feyxiexzfUjhhgtg)) {
            state |= this.f8870feyxiexzfUjhhgtg.setState(iArr);
        }
        if (m4092feyxiexzfUjhhgtg(this.f8863feyxiexzfUjhhgtg)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f8863feyxiexzfUjhhgtg.setState(iArr3);
        }
        int[] iArr4 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        if (m4092feyxiexzfUjhhgtg(this.f8864feyxiexzfUjhhgtg)) {
            state |= this.f8864feyxiexzfUjhhgtg.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m4099feyxiexzfUjhhgtg();
        }
        return state;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4101feyxiexzfUjhhgtg(boolean z) {
        if (this.f8868feyxiexzfUjhhgtg != z) {
            this.f8868feyxiexzfUjhhgtg = z;
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            if (!z && this.f8895feyxiexzfUjhhgtg) {
                this.f8895feyxiexzfUjhhgtg = false;
            }
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4102feyxiexzfUjhhgtg(Drawable drawable) {
        if (this.f8870feyxiexzfUjhhgtg != drawable) {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8870feyxiexzfUjhhgtg = drawable;
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            m4093Ujhhgtgfeyxiexzf(this.f8870feyxiexzfUjhhgtg);
            m4094Ujhhgtgfeyxiexzf(this.f8870feyxiexzfUjhhgtg);
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void m4103feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8871feyxiexzfUjhhgtg != colorStateList) {
            this.f8871feyxiexzfUjhhgtg = colorStateList;
            if (this.f8869feyxiexzfUjhhgtg && (drawable = this.f8870feyxiexzfUjhhgtg) != null && this.f8868feyxiexzfUjhhgtg) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void m4104feyxiexzfUjhhgtg(boolean z) {
        if (this.f8869feyxiexzfUjhhgtg != z) {
            boolean zM4121Ujhhgtgfeyxiexzf = m4121Ujhhgtgfeyxiexzf();
            this.f8869feyxiexzfUjhhgtg = z;
            boolean zM4121Ujhhgtgfeyxiexzf2 = m4121Ujhhgtgfeyxiexzf();
            if (zM4121Ujhhgtgfeyxiexzf != zM4121Ujhhgtgfeyxiexzf2) {
                if (zM4121Ujhhgtgfeyxiexzf2) {
                    m4094Ujhhgtgfeyxiexzf(this.f8870feyxiexzfUjhhgtg);
                } else {
                    m4093Ujhhgtgfeyxiexzf(this.f8870feyxiexzfUjhhgtg);
                }
                invalidateSelf();
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m4105feyxiexzfUjhhgtg(float f) {
        if (this.f8852feyxiexzfUjhhgtg != f) {
            this.f8852feyxiexzfUjhhgtg = f;
            C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(f);
            setShapeAppearanceModel(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4106feyxiexzfUjhhgtg(Drawable drawable) {
        Drawable drawable2 = this.f8858feyxiexzfUjhhgtg;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8858feyxiexzfUjhhgtg = drawable != null ? drawable.mutate() : null;
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            m4093Ujhhgtgfeyxiexzf(drawable2);
            if (m4122Ujhhgtgfeyxiexzf()) {
                m4094Ujhhgtgfeyxiexzf(this.f8858feyxiexzfUjhhgtg);
            }
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m4107feyxiexzfUjhhgtg(float f) {
        if (this.f8860feyxiexzfUjhhgtg != f) {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8860feyxiexzfUjhhgtg = f;
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4108feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        this.f8861feyxiexzfUjhhgtg = true;
        if (this.f8859feyxiexzfUjhhgtg != colorStateList) {
            this.f8859feyxiexzfUjhhgtg = colorStateList;
            if (m4122Ujhhgtgfeyxiexzf()) {
                this.f8858feyxiexzfUjhhgtg.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m4109feyxiexzfUjhhgtg(boolean z) {
        if (this.f8857feyxiexzfUjhhgtg != z) {
            boolean zM4122Ujhhgtgfeyxiexzf = m4122Ujhhgtgfeyxiexzf();
            this.f8857feyxiexzfUjhhgtg = z;
            boolean zM4122Ujhhgtgfeyxiexzf2 = m4122Ujhhgtgfeyxiexzf();
            if (zM4122Ujhhgtgfeyxiexzf != zM4122Ujhhgtgfeyxiexzf2) {
                if (zM4122Ujhhgtgfeyxiexzf2) {
                    m4094Ujhhgtgfeyxiexzf(this.f8858feyxiexzfUjhhgtg);
                } else {
                    m4093Ujhhgtgfeyxiexzf(this.f8858feyxiexzfUjhhgtg);
                }
                invalidateSelf();
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m4110feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        if (this.f8853feyxiexzfUjhhgtg != colorStateList) {
            this.f8853feyxiexzfUjhhgtg = colorStateList;
            if (this.f8908Ujhhgtgfeyxiexzf) {
                m1373Ujhhgtgfeyxiexzf(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m4111feyxiexzfUjhhgtg(float f) {
        if (this.f8854feyxiexzfUjhhgtg != f) {
            this.f8854feyxiexzfUjhhgtg = f;
            this.f8883feyxiexzfUjhhgtg.setStrokeWidth(f);
            if (this.f8908Ujhhgtgfeyxiexzf) {
                this.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4112feyxiexzfUjhhgtg(Drawable drawable) {
        Drawable drawable2 = this.f8863feyxiexzfUjhhgtg;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM4097Ujhhgtgfeyxiexzf = m4097Ujhhgtgfeyxiexzf();
            this.f8863feyxiexzfUjhhgtg = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
            this.f8864feyxiexzfUjhhgtg = new RippleDrawable(AbstractC0925feyxiexzfUjhhgtg.m2425Ujhhgtgfeyxiexzf(this.f8855feyxiexzfUjhhgtg), this.f8863feyxiexzfUjhhgtg, f8848feyxiexzfUjhhgtg);
            float fM4097Ujhhgtgfeyxiexzf2 = m4097Ujhhgtgfeyxiexzf();
            m4093Ujhhgtgfeyxiexzf(drawable2);
            if (m4123Ujhhgtgfeyxiexzf()) {
                m4094Ujhhgtgfeyxiexzf(this.f8863feyxiexzfUjhhgtg);
            }
            invalidateSelf();
            if (fM4097Ujhhgtgfeyxiexzf != fM4097Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m4113feyxiexzfUjhhgtg(float f) {
        if (this.f8880feyxiexzfUjhhgtg != f) {
            this.f8880feyxiexzfUjhhgtg = f;
            invalidateSelf();
            if (m4123Ujhhgtgfeyxiexzf()) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4114feyxiexzfUjhhgtg(float f) {
        if (this.f8866feyxiexzfUjhhgtg != f) {
            this.f8866feyxiexzfUjhhgtg = f;
            invalidateSelf();
            if (m4123Ujhhgtgfeyxiexzf()) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void m4115feyxiexzfUjhhgtg(float f) {
        if (this.f8879feyxiexzfUjhhgtg != f) {
            this.f8879feyxiexzfUjhhgtg = f;
            invalidateSelf();
            if (m4123Ujhhgtgfeyxiexzf()) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final void m4116feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        if (this.f8865feyxiexzfUjhhgtg != colorStateList) {
            this.f8865feyxiexzfUjhhgtg = colorStateList;
            if (m4123Ujhhgtgfeyxiexzf()) {
                this.f8863feyxiexzfUjhhgtg.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m4117feyxiexzfUjhhgtg(boolean z) {
        if (this.f8862feyxiexzfUjhhgtg != z) {
            boolean zM4123Ujhhgtgfeyxiexzf = m4123Ujhhgtgfeyxiexzf();
            this.f8862feyxiexzfUjhhgtg = z;
            boolean zM4123Ujhhgtgfeyxiexzf2 = m4123Ujhhgtgfeyxiexzf();
            if (zM4123Ujhhgtgfeyxiexzf != zM4123Ujhhgtgfeyxiexzf2) {
                if (zM4123Ujhhgtgfeyxiexzf2) {
                    m4094Ujhhgtgfeyxiexzf(this.f8863feyxiexzfUjhhgtg);
                } else {
                    m4093Ujhhgtgfeyxiexzf(this.f8863feyxiexzfUjhhgtg);
                }
                invalidateSelf();
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4118feyxiexzfUjhhgtg(float f) {
        if (this.f8876Ujhhgtgfeyxiexzf != f) {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8876Ujhhgtgfeyxiexzf = f;
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m4119feyxiexzfUjhhgtg(float f) {
        if (this.f8875Ujhhgtgfeyxiexzf != f) {
            float fM4096Ujhhgtgfeyxiexzf = m4096Ujhhgtgfeyxiexzf();
            this.f8875Ujhhgtgfeyxiexzf = f;
            float fM4096Ujhhgtgfeyxiexzf2 = m4096Ujhhgtgfeyxiexzf();
            invalidateSelf();
            if (fM4096Ujhhgtgfeyxiexzf != fM4096Ujhhgtgfeyxiexzf2) {
                m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4120feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        if (this.f8855feyxiexzfUjhhgtg != colorStateList) {
            this.f8855feyxiexzfUjhhgtg = colorStateList;
            this.f8903feyxiexzfUjhhgtg = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m4121Ujhhgtgfeyxiexzf() {
        return this.f8869feyxiexzfUjhhgtg && this.f8870feyxiexzfUjhhgtg != null && this.f8895feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m4122Ujhhgtgfeyxiexzf() {
        return this.f8857feyxiexzfUjhhgtg && this.f8858feyxiexzfUjhhgtg != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m4123Ujhhgtgfeyxiexzf() {
        return this.f8862feyxiexzfUjhhgtg && this.f8863feyxiexzfUjhhgtg != null;
    }
}
