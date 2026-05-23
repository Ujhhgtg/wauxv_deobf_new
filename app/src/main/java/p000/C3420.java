package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤞᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3420 extends C1917 implements InterfaceC2906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public CharSequence f10776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final Context f10777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final Paint.FontMetrics f10778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final C2907 f10779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0445 f10780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Rect f10781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f10782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f10783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f10784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f10785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public boolean f10786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int f10787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public int f10788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public float f10789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public float f10790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public float f10791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public float f10792;

    public C3420(Context context, int i) {
        super(context, null, 0, i);
        this.f10778 = new Paint.FontMetrics();
        C2907 c2907 = new C2907(this);
        this.f10779 = c2907;
        this.f10780 = new ViewOnLayoutChangeListenerC0445(3, this);
        this.f10781 = new Rect();
        this.f10789 = 1.0f;
        this.f10790 = 1.0f;
        this.f10791 = 0.5f;
        this.f10792 = 1.0f;
        this.f10777 = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = c2907.f9349;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fM4936 = m4936();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f10787)) - ((double) this.f10787)));
        canvas.scale(this.f10789, this.f10790, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f10791) + getBounds().top);
        canvas.translate(fM4936, f);
        super.draw(canvas);
        if (this.f10776 == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            C2907 c2907 = this.f10779;
            TextPaint textPaint = c2907.f9349;
            Paint.FontMetrics fontMetrics = this.f10778;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (c2907.f9355 != null) {
                textPaint.drawableState = getState();
                c2907.f9355.m4910(this.f10777, c2907.f9349, c2907.f9350);
                textPaint.setAlpha((int) (this.f10792 * 255.0f));
            }
            CharSequence charSequence = this.f10776;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f10779.f9349.getTextSize(), this.f10784);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f10782 * 2;
        CharSequence charSequence = this.f10776;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f10779.m4913(charSequence.toString())), this.f10783);
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f10786) {
            C2021 c2021M4691 = this.f6332.f6314.m4691();
            c2021M4691.f6772 = m4937();
            setShapeAppearanceModel(c2021M4691.m3876());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final float m4936() {
        int i;
        Rect rect = this.f10781;
        if (((rect.right - getBounds().right) - this.f10788) - this.f10785 < 0) {
            i = ((rect.right - getBounds().right) - this.f10788) - this.f10785;
        } else {
            if (((rect.left - getBounds().left) - this.f10788) + this.f10785 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f10788) + this.f10785;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C2269 m4937() {
        float f = -m4936();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f10787)))) / 2.0f;
        return new C2269(new C1900(this.f10787), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
