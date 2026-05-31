package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲈᤝᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1947 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2738 f6419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1142 f6420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f6421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f6422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f6423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f6424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Rect f6425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float f6426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f6427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f6428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f6430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f6431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f6432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f6433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f6434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Paint.Style f6435;

    public C1947(C2738 c2738) {
        this.f6421 = null;
        this.f6422 = null;
        this.f6423 = null;
        this.f6424 = PorterDuff.Mode.SRC_IN;
        this.f6425 = null;
        this.f6426 = 1.0f;
        this.f6427 = 1.0f;
        this.f6429 = 255;
        this.f6430 = 0.0f;
        this.f6431 = 0.0f;
        this.f6432 = 0;
        this.f6433 = 0;
        this.f6434 = 0;
        this.f6435 = Paint.Style.FILL_AND_STROKE;
        this.f6419 = c2738;
        this.f6420 = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1948 c1948 = new C1948(this);
        c1948.f6441 = true;
        return c1948;
    }

    public C1947(C1947 c1947) {
        this.f6421 = null;
        this.f6422 = null;
        this.f6423 = null;
        this.f6424 = PorterDuff.Mode.SRC_IN;
        this.f6425 = null;
        this.f6426 = 1.0f;
        this.f6427 = 1.0f;
        this.f6429 = 255;
        this.f6430 = 0.0f;
        this.f6431 = 0.0f;
        this.f6432 = 0;
        this.f6433 = 0;
        this.f6434 = 0;
        this.f6435 = Paint.Style.FILL_AND_STROKE;
        this.f6419 = c1947.f6419;
        this.f6420 = c1947.f6420;
        this.f6428 = c1947.f6428;
        this.f6421 = c1947.f6421;
        this.f6422 = c1947.f6422;
        this.f6424 = c1947.f6424;
        this.f6423 = c1947.f6423;
        this.f6429 = c1947.f6429;
        this.f6426 = c1947.f6426;
        this.f6434 = c1947.f6434;
        this.f6432 = c1947.f6432;
        this.f6427 = c1947.f6427;
        this.f6430 = c1947.f6430;
        this.f6431 = c1947.f6431;
        this.f6433 = c1947.f6433;
        this.f6435 = c1947.f6435;
        if (c1947.f6425 != null) {
            this.f6425 = new Rect(c1947.f6425);
        }
    }
}
