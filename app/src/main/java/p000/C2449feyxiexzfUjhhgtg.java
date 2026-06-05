package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2449feyxiexzfUjhhgtg extends Drawable implements InterfaceC1971Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final WeakReference f7917Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f7918Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C1970Ujhhgtgfeyxiexzf f7919Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Rect f7920Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2451feyxiexzfUjhhgtg f7921Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f7922Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f7923Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f7924Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f7925Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f7926Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public float f7927Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public WeakReference f7928Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public WeakReference f7929Ujhhgtgfeyxiexzf;

    public C2449feyxiexzfUjhhgtg(Context context, C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg) {
        C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf;
        WeakReference weakReference = new WeakReference(context);
        this.f7917Ujhhgtgfeyxiexzf = weakReference;
        AbstractC1243feyxiexzfUjhhgtg.m2732Ujhhgtgfeyxiexzf(context, AbstractC1243feyxiexzfUjhhgtg.f4583Ujhhgtgfeyxiexzf, "Theme.MaterialComponents");
        this.f7920Ujhhgtgfeyxiexzf = new Rect();
        C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = new C1970Ujhhgtgfeyxiexzf(this);
        this.f7919Ujhhgtgfeyxiexzf = c1970Ujhhgtgfeyxiexzf;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf;
        textPaint.setTextAlign(align);
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = new C2451feyxiexzfUjhhgtg(context, c2452feyxiexzfUjhhgtg);
        this.f7921Ujhhgtgfeyxiexzf = c2451feyxiexzfUjhhgtg;
        boolean zM3686Ujhhgtgfeyxiexzf = m3686Ujhhgtgfeyxiexzf();
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg2 = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg.m2510Ujhhgtgfeyxiexzf(context, zM3686Ujhhgtgfeyxiexzf ? c2452feyxiexzfUjhhgtg2.f7952Ujhhgtgfeyxiexzf.intValue() : c2452feyxiexzfUjhhgtg2.f7950Ujhhgtgfeyxiexzf.intValue(), m3686Ujhhgtgfeyxiexzf() ? c2452feyxiexzfUjhhgtg2.f7953Ujhhgtgfeyxiexzf.intValue() : c2452feyxiexzfUjhhgtg2.f7951Ujhhgtgfeyxiexzf.intValue(), new C2923Ujhhgtgfeyxiexzf(0)).m2507Ujhhgtgfeyxiexzf());
        this.f7918Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf;
        m3688Ujhhgtgfeyxiexzf();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c1970Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf != (c1969Ujhhgtgfeyxiexzf = new C1969Ujhhgtgfeyxiexzf(context2, c2452feyxiexzfUjhhgtg2.f7949Ujhhgtgfeyxiexzf.intValue()))) {
            c1970Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(c1969Ujhhgtgfeyxiexzf, context2);
            textPaint.setColor(c2452feyxiexzfUjhhgtg2.f7948Ujhhgtgfeyxiexzf.intValue());
            invalidateSelf();
            m3690Ujhhgtgfeyxiexzf();
            invalidateSelf();
        }
        int i = c2452feyxiexzfUjhhgtg2.f7957Ujhhgtgfeyxiexzf;
        if (i != -2) {
            this.f7924Ujhhgtgfeyxiexzf = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f7924Ujhhgtgfeyxiexzf = c2452feyxiexzfUjhhgtg2.f7958Ujhhgtgfeyxiexzf;
        }
        c1970Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf = true;
        m3690Ujhhgtgfeyxiexzf();
        invalidateSelf();
        c1970Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf = true;
        m3688Ujhhgtgfeyxiexzf();
        m3690Ujhhgtgfeyxiexzf();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c2452feyxiexzfUjhhgtg2.f7947Ujhhgtgfeyxiexzf.intValue());
        if (c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf != colorStateListValueOf) {
            c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c2452feyxiexzfUjhhgtg2.f7948Ujhhgtgfeyxiexzf.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f7928Ujhhgtgfeyxiexzf;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f7928Ujhhgtgfeyxiexzf.get();
            WeakReference weakReference3 = this.f7929Ujhhgtgfeyxiexzf;
            m3689Ujhhgtgfeyxiexzf(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m3690Ujhhgtgfeyxiexzf();
        setVisible(c2452feyxiexzfUjhhgtg2.f7965Ujhhgtgfeyxiexzf.booleanValue(), false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM3682Ujhhgtgfeyxiexzf;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f7918Ujhhgtgfeyxiexzf.draw(canvas);
        if (!m3686Ujhhgtgfeyxiexzf() || (strM3682Ujhhgtgfeyxiexzf = m3682Ujhhgtgfeyxiexzf()) == null) {
            return;
        }
        Rect rect = new Rect();
        C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = this.f7919Ujhhgtgfeyxiexzf;
        c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf.getTextBounds(strM3682Ujhhgtgfeyxiexzf, 0, strM3682Ujhhgtgfeyxiexzf.length(), rect);
        float fExactCenterY = this.f7923Ujhhgtgfeyxiexzf - rect.exactCenterY();
        canvas.drawText(strM3682Ujhhgtgfeyxiexzf, this.f7922Ujhhgtgfeyxiexzf, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7921Ujhhgtgfeyxiexzf.f7936Ujhhgtgfeyxiexzf.f7954Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7920Ujhhgtgfeyxiexzf.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7920Ujhhgtgfeyxiexzf.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p000.InterfaceC1971Ujhhgtgfeyxiexzf
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf;
        c2451feyxiexzfUjhhgtg.f7935Ujhhgtgfeyxiexzf.f7954Ujhhgtgfeyxiexzf = i;
        c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7954Ujhhgtgfeyxiexzf = i;
        this.f7919Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // p000.InterfaceC1971Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1358Ujhhgtgfeyxiexzf() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m3682Ujhhgtgfeyxiexzf() {
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg2 = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        String str = c2452feyxiexzfUjhhgtg.f7955Ujhhgtgfeyxiexzf;
        WeakReference weakReference = this.f7917Ujhhgtgfeyxiexzf;
        if (str == null) {
            if (!m3687Ujhhgtgfeyxiexzf()) {
                return null;
            }
            if (this.f7924Ujhhgtgfeyxiexzf == -2 || m3685Ujhhgtgfeyxiexzf() <= this.f7924Ujhhgtgfeyxiexzf) {
                return NumberFormat.getInstance(c2452feyxiexzfUjhhgtg2.f7959Ujhhgtgfeyxiexzf).format(m3685Ujhhgtgfeyxiexzf());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c2452feyxiexzfUjhhgtg2.f7959Ujhhgtgfeyxiexzf, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f7924Ujhhgtgfeyxiexzf), "+");
        }
        int i = c2452feyxiexzfUjhhgtg.f7957Ujhhgtgfeyxiexzf;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final CharSequence m3683Ujhhgtgfeyxiexzf() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg2 = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        if (c2452feyxiexzfUjhhgtg.f7955Ujhhgtgfeyxiexzf != null) {
            CharSequence charSequence = c2452feyxiexzfUjhhgtg.f7960Ujhhgtgfeyxiexzf;
            return charSequence != null ? charSequence : c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7955Ujhhgtgfeyxiexzf;
        }
        if (!m3687Ujhhgtgfeyxiexzf()) {
            return c2452feyxiexzfUjhhgtg2.f7961Ujhhgtgfeyxiexzf;
        }
        if (c2452feyxiexzfUjhhgtg2.f7962Ujhhgtgfeyxiexzf == 0 || (context = (Context) this.f7917Ujhhgtgfeyxiexzf.get()) == null) {
            return null;
        }
        if (this.f7924Ujhhgtgfeyxiexzf != -2) {
            int iM3685Ujhhgtgfeyxiexzf = m3685Ujhhgtgfeyxiexzf();
            int i = this.f7924Ujhhgtgfeyxiexzf;
            if (iM3685Ujhhgtgfeyxiexzf > i) {
                return context.getString(c2452feyxiexzfUjhhgtg2.f7963Ujhhgtgfeyxiexzf, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(c2452feyxiexzfUjhhgtg2.f7962Ujhhgtgfeyxiexzf, m3685Ujhhgtgfeyxiexzf(), Integer.valueOf(m3685Ujhhgtgfeyxiexzf()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final FrameLayout m3684Ujhhgtgfeyxiexzf() {
        WeakReference weakReference = this.f7929Ujhhgtgfeyxiexzf;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m3685Ujhhgtgfeyxiexzf() {
        int i = this.f7921Ujhhgtgfeyxiexzf.f7936Ujhhgtgfeyxiexzf.f7956Ujhhgtgfeyxiexzf;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m3686Ujhhgtgfeyxiexzf() {
        return this.f7921Ujhhgtgfeyxiexzf.f7936Ujhhgtgfeyxiexzf.f7955Ujhhgtgfeyxiexzf != null || m3687Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m3687Ujhhgtgfeyxiexzf() {
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf.f7936Ujhhgtgfeyxiexzf;
        return c2452feyxiexzfUjhhgtg.f7955Ujhhgtgfeyxiexzf == null && c2452feyxiexzfUjhhgtg.f7956Ujhhgtgfeyxiexzf != -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m3688Ujhhgtgfeyxiexzf() {
        Context context = (Context) this.f7917Ujhhgtgfeyxiexzf.get();
        if (context == null) {
            return;
        }
        boolean zM3686Ujhhgtgfeyxiexzf = m3686Ujhhgtgfeyxiexzf();
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf;
        this.f7918Ujhhgtgfeyxiexzf.setShapeAppearanceModel(C1017feyxiexzfUjhhgtg.m2510Ujhhgtgfeyxiexzf(context, zM3686Ujhhgtgfeyxiexzf ? c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7952Ujhhgtgfeyxiexzf.intValue() : c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7950Ujhhgtgfeyxiexzf.intValue(), m3686Ujhhgtgfeyxiexzf() ? c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7953Ujhhgtgfeyxiexzf.intValue() : c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7951Ujhhgtgfeyxiexzf.intValue(), new C2923Ujhhgtgfeyxiexzf(0)).m2507Ujhhgtgfeyxiexzf());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3689Ujhhgtgfeyxiexzf(View view, FrameLayout frameLayout) {
        this.f7928Ujhhgtgfeyxiexzf = new WeakReference(view);
        this.f7929Ujhhgtgfeyxiexzf = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m3690Ujhhgtgfeyxiexzf();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:113:0x027d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3690Ujhhgtgfeyxiexzf() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.f7917Ujhhgtgfeyxiexzf;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f7928Ujhhgtgfeyxiexzf;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f7920Ujhhgtgfeyxiexzf;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f7929Ujhhgtgfeyxiexzf;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zM3686Ujhhgtgfeyxiexzf = m3686Ujhhgtgfeyxiexzf();
        C2451feyxiexzfUjhhgtg c2451feyxiexzfUjhhgtg = this.f7921Ujhhgtgfeyxiexzf;
        float f2 = zM3686Ujhhgtgfeyxiexzf ? c2451feyxiexzfUjhhgtg.f7938Ujhhgtgfeyxiexzf : c2451feyxiexzfUjhhgtg.f7937Ujhhgtgfeyxiexzf;
        this.f7925Ujhhgtgfeyxiexzf = f2;
        if (f2 != -1.0f) {
            this.f7926Ujhhgtgfeyxiexzf = f2;
            this.f7927Ujhhgtgfeyxiexzf = f2;
        } else {
            this.f7926Ujhhgtgfeyxiexzf = Math.round((m3686Ujhhgtgfeyxiexzf() ? c2451feyxiexzfUjhhgtg.f7941Ujhhgtgfeyxiexzf : c2451feyxiexzfUjhhgtg.f7939Ujhhgtgfeyxiexzf) / 2.0f);
            this.f7927Ujhhgtgfeyxiexzf = Math.round((m3686Ujhhgtgfeyxiexzf() ? c2451feyxiexzfUjhhgtg.f7942Ujhhgtgfeyxiexzf : c2451feyxiexzfUjhhgtg.f7940Ujhhgtgfeyxiexzf) / 2.0f);
        }
        if (m3686Ujhhgtgfeyxiexzf()) {
            String strM3682Ujhhgtgfeyxiexzf = m3682Ujhhgtgfeyxiexzf();
            float f3 = this.f7926Ujhhgtgfeyxiexzf;
            C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = this.f7919Ujhhgtgfeyxiexzf;
            this.f7926Ujhhgtgfeyxiexzf = Math.max(f3, (c1970Ujhhgtgfeyxiexzf.m3308Ujhhgtgfeyxiexzf(strM3682Ujhhgtgfeyxiexzf) / 2.0f) + c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7966Ujhhgtgfeyxiexzf.intValue());
            float f4 = this.f7927Ujhhgtgfeyxiexzf;
            if (c1970Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf) {
                c1970Ujhhgtgfeyxiexzf.m3309Ujhhgtgfeyxiexzf(strM3682Ujhhgtgfeyxiexzf);
                f = c1970Ujhhgtgfeyxiexzf.f6470Ujhhgtgfeyxiexzf;
            } else {
                f = c1970Ujhhgtgfeyxiexzf.f6470Ujhhgtgfeyxiexzf;
            }
            float fMax = Math.max(f4, (f / 2.0f) + c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf.f7967Ujhhgtgfeyxiexzf.intValue());
            this.f7927Ujhhgtgfeyxiexzf = fMax;
            this.f7926Ujhhgtgfeyxiexzf = Math.max(this.f7926Ujhhgtgfeyxiexzf, fMax);
        }
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg2 = c2451feyxiexzfUjhhgtg.f7936Ujhhgtgfeyxiexzf;
        int i = c2451feyxiexzfUjhhgtg.f7945Ujhhgtgfeyxiexzf;
        int iIntValue = c2452feyxiexzfUjhhgtg.f7969feyxiexzfUjhhgtg.intValue();
        if (m3686Ujhhgtgfeyxiexzf()) {
            iIntValue = c2452feyxiexzfUjhhgtg.f7971feyxiexzfUjhhgtg.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf(iIntValue, iIntValue - c2452feyxiexzfUjhhgtg.f7974feyxiexzfUjhhgtg.intValue(), AbstractC3036feyxiexzfUjhhgtg.m4510Ujhhgtgfeyxiexzf(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.f7927Ujhhgtgfeyxiexzf);
        }
        int iIntValue2 = c2452feyxiexzfUjhhgtg.f7973feyxiexzfUjhhgtg.intValue() + iIntValue;
        int iIntValue3 = c2452feyxiexzfUjhhgtg2.f7964Ujhhgtgfeyxiexzf.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f7923Ujhhgtgfeyxiexzf = rect3.bottom - iIntValue2;
        } else {
            this.f7923Ujhhgtgfeyxiexzf = rect3.top + iIntValue2;
        }
        int iIntValue4 = m3686Ujhhgtgfeyxiexzf() ? c2452feyxiexzfUjhhgtg.f7970feyxiexzfUjhhgtg.intValue() : c2452feyxiexzfUjhhgtg2.f7968feyxiexzfUjhhgtg.intValue();
        if (i == 1) {
            iIntValue4 += m3686Ujhhgtgfeyxiexzf() ? c2451feyxiexzfUjhhgtg.f7944Ujhhgtgfeyxiexzf : c2451feyxiexzfUjhhgtg.f7943Ujhhgtgfeyxiexzf;
        }
        int iIntValue5 = c2452feyxiexzfUjhhgtg.f7972feyxiexzfUjhhgtg.intValue() + iIntValue4;
        int iIntValue6 = c2452feyxiexzfUjhhgtg2.f7964Ujhhgtgfeyxiexzf.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            this.f7922Ujhhgtgfeyxiexzf = view.getLayoutDirection() == 0 ? (rect3.left - this.f7926Ujhhgtgfeyxiexzf) + iIntValue5 : (rect3.right + this.f7926Ujhhgtgfeyxiexzf) - iIntValue5;
        } else {
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            this.f7922Ujhhgtgfeyxiexzf = view.getLayoutDirection() == 0 ? (rect3.right + this.f7926Ujhhgtgfeyxiexzf) - iIntValue5 : (rect3.left - this.f7926Ujhhgtgfeyxiexzf) + iIntValue5;
        }
        if (c2452feyxiexzfUjhhgtg.f7975feyxiexzfUjhhgtg.booleanValue()) {
            View viewM3684Ujhhgtgfeyxiexzf = m3684Ujhhgtgfeyxiexzf();
            if (viewM3684Ujhhgtgfeyxiexzf != null) {
                FrameLayout frameLayoutM3684Ujhhgtgfeyxiexzf = m3684Ujhhgtgfeyxiexzf();
                if (frameLayoutM3684Ujhhgtgfeyxiexzf == null || frameLayoutM3684Ujhhgtgfeyxiexzf.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewM3684Ujhhgtgfeyxiexzf.getParent() instanceof View) {
                    y = viewM3684Ujhhgtgfeyxiexzf.getY();
                    x = viewM3684Ujhhgtgfeyxiexzf.getX();
                    viewM3684Ujhhgtgfeyxiexzf = (View) viewM3684Ujhhgtgfeyxiexzf.getParent();
                }
                y2 = viewM3684Ujhhgtgfeyxiexzf.getY() + (this.f7923Ujhhgtgfeyxiexzf - this.f7927Ujhhgtgfeyxiexzf) + y;
                x2 = viewM3684Ujhhgtgfeyxiexzf.getX() + (this.f7922Ujhhgtgfeyxiexzf - this.f7926Ujhhgtgfeyxiexzf) + x;
                if (viewM3684Ujhhgtgfeyxiexzf.getParent() instanceof View) {
                    height = ((this.f7923Ujhhgtgfeyxiexzf + this.f7927Ujhhgtgfeyxiexzf) - (((View) viewM3684Ujhhgtgfeyxiexzf.getParent()).getHeight() - viewM3684Ujhhgtgfeyxiexzf.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM3684Ujhhgtgfeyxiexzf.getParent() instanceof View) {
                    width = ((this.f7922Ujhhgtgfeyxiexzf + this.f7926Ujhhgtgfeyxiexzf) - (((View) viewM3684Ujhhgtgfeyxiexzf.getParent()).getWidth() - viewM3684Ujhhgtgfeyxiexzf.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f7923Ujhhgtgfeyxiexzf = Math.abs(y2) + this.f7923Ujhhgtgfeyxiexzf;
                }
                if (x2 < 0.0f) {
                    this.f7922Ujhhgtgfeyxiexzf = Math.abs(x2) + this.f7922Ujhhgtgfeyxiexzf;
                }
                if (height > 0.0f) {
                    this.f7923Ujhhgtgfeyxiexzf -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f7922Ujhhgtgfeyxiexzf -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewM3684Ujhhgtgfeyxiexzf = view2;
                y2 = viewM3684Ujhhgtgfeyxiexzf.getY() + (this.f7923Ujhhgtgfeyxiexzf - this.f7927Ujhhgtgfeyxiexzf) + y;
                x2 = viewM3684Ujhhgtgfeyxiexzf.getX() + (this.f7922Ujhhgtgfeyxiexzf - this.f7926Ujhhgtgfeyxiexzf) + x;
                if (viewM3684Ujhhgtgfeyxiexzf.getParent() instanceof View) {
                    height = ((this.f7923Ujhhgtgfeyxiexzf + this.f7927Ujhhgtgfeyxiexzf) - (((View) viewM3684Ujhhgtgfeyxiexzf.getParent()).getHeight() - viewM3684Ujhhgtgfeyxiexzf.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM3684Ujhhgtgfeyxiexzf.getParent() instanceof View) {
                    width = ((this.f7922Ujhhgtgfeyxiexzf + this.f7926Ujhhgtgfeyxiexzf) - (((View) viewM3684Ujhhgtgfeyxiexzf.getParent()).getWidth() - viewM3684Ujhhgtgfeyxiexzf.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f7923Ujhhgtgfeyxiexzf = Math.abs(y2) + this.f7923Ujhhgtgfeyxiexzf;
                }
                if (x2 < 0.0f) {
                    this.f7922Ujhhgtgfeyxiexzf = Math.abs(x2) + this.f7922Ujhhgtgfeyxiexzf;
                }
                if (height > 0.0f) {
                    this.f7923Ujhhgtgfeyxiexzf -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f7922Ujhhgtgfeyxiexzf -= Math.abs(width);
                }
            }
        }
        float f5 = this.f7922Ujhhgtgfeyxiexzf;
        float f6 = this.f7923Ujhhgtgfeyxiexzf;
        float f7 = this.f7926Ujhhgtgfeyxiexzf;
        float f8 = this.f7927Ujhhgtgfeyxiexzf;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.f7925Ujhhgtgfeyxiexzf;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f7918Ujhhgtgfeyxiexzf;
        if (f9 != -1.0f) {
            C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(f9);
            c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c0226Ujhhgtgfeyxiexzf.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
