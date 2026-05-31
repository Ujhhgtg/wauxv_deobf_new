package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᲀᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3478 extends C1948 implements InterfaceC2965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public CharSequence f10937;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final Context f10938;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final Paint.FontMetrics f10939;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final C2966 f10940;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0420 f10941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final Rect f10942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f10943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f10944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f10945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f10946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f10947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public int f10948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int f10949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public float f10950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public float f10951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public float f10952;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public float f10953;

    public C3478(Context context, int i) {
        super(context, null, 0, i);
        this.f10939 = new Paint.FontMetrics();
        C2966 c2966 = new C2966(this);
        this.f10940 = c2966;
        this.f10941 = new ViewOnLayoutChangeListenerC0420(this, 3);
        this.f10942 = new Rect();
        this.f10950 = 1.0f;
        this.f10951 = 1.0f;
        this.f10952 = 0.5f;
        this.f10953 = 1.0f;
        this.f10938 = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = c2966.f9516;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fM4998 = m4998();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f10948)) - ((double) this.f10948)));
        canvas.scale(this.f10950, this.f10951, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f10952) + getBounds().top);
        canvas.translate(fM4998, f);
        super.draw(canvas);
        if (this.f10937 == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            C2966 c2966 = this.f10940;
            TextPaint textPaint = c2966.f9516;
            Paint.FontMetrics fontMetrics = this.f10939;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (c2966.f9522 != null) {
                textPaint.drawableState = getState();
                c2966.f9522.m4972(this.f10938, c2966.f9516, c2966.f9517);
                textPaint.setAlpha((int) (this.f10953 * 255.0f));
            }
            CharSequence charSequence = this.f10937;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f10940.f9516.getTextSize(), this.f10945);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f10943 * 2;
        CharSequence charSequence = this.f10937;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f10940.m4975(charSequence.toString())), this.f10944);
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f10947) {
            C2737 c2737M4728 = this.f6437.f6419.m4728();
            c2737M4728.f8796 = m4999();
            setShapeAppearanceModel(c2737M4728.m4722());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final float m4998() {
        int i;
        Rect rect = this.f10942;
        if (((rect.right - getBounds().right) - this.f10949) - this.f10946 < 0) {
            i = ((rect.right - getBounds().right) - this.f10949) - this.f10946;
        } else {
            if (((rect.left - getBounds().left) - this.f10949) + this.f10946 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f10949) + this.f10946;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C2301 m4999() {
        float f = -m4998();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f10948)))) / 2.0f;
        return new C2301(new C1926(this.f10948), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
