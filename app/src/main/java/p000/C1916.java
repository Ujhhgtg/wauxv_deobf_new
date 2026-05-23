package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1916 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2677 f6314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1136 f6315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f6316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f6317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f6318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f6319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Rect f6320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float f6321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f6322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f6323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f6325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f6326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f6327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f6328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f6329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Paint.Style f6330;

    public C1916(C2677 c2677) {
        this.f6316 = null;
        this.f6317 = null;
        this.f6318 = null;
        this.f6319 = PorterDuff.Mode.SRC_IN;
        this.f6320 = null;
        this.f6321 = 1.0f;
        this.f6322 = 1.0f;
        this.f6324 = 255;
        this.f6325 = 0.0f;
        this.f6326 = 0.0f;
        this.f6327 = 0;
        this.f6328 = 0;
        this.f6329 = 0;
        this.f6330 = Paint.Style.FILL_AND_STROKE;
        this.f6314 = c2677;
        this.f6315 = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1917 c1917 = new C1917(this);
        c1917.f6336 = true;
        return c1917;
    }

    public C1916(C1916 c1916) {
        this.f6316 = null;
        this.f6317 = null;
        this.f6318 = null;
        this.f6319 = PorterDuff.Mode.SRC_IN;
        this.f6320 = null;
        this.f6321 = 1.0f;
        this.f6322 = 1.0f;
        this.f6324 = 255;
        this.f6325 = 0.0f;
        this.f6326 = 0.0f;
        this.f6327 = 0;
        this.f6328 = 0;
        this.f6329 = 0;
        this.f6330 = Paint.Style.FILL_AND_STROKE;
        this.f6314 = c1916.f6314;
        this.f6315 = c1916.f6315;
        this.f6323 = c1916.f6323;
        this.f6316 = c1916.f6316;
        this.f6317 = c1916.f6317;
        this.f6319 = c1916.f6319;
        this.f6318 = c1916.f6318;
        this.f6324 = c1916.f6324;
        this.f6321 = c1916.f6321;
        this.f6329 = c1916.f6329;
        this.f6327 = c1916.f6327;
        this.f6322 = c1916.f6322;
        this.f6325 = c1916.f6325;
        this.f6326 = c1916.f6326;
        this.f6328 = c1916.f6328;
        this.f6330 = c1916.f6330;
        if (c1916.f6320 != null) {
            this.f6320 = new Rect(c1916.f6320);
        }
    }
}
