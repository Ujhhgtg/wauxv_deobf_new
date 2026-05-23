package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲈᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2492 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC2508 f7956;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Rect f7957;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f7958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7959;

    public C2492(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7957 = new Rect();
        this.f7958 = true;
        this.f7959 = false;
    }

    public C2492(int i, int i2) {
        super(i, i2);
        this.f7957 = new Rect();
        this.f7958 = true;
        this.f7959 = false;
    }

    public C2492(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7957 = new Rect();
        this.f7958 = true;
        this.f7959 = false;
    }

    public C2492(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7957 = new Rect();
        this.f7958 = true;
        this.f7959 = false;
    }

    public C2492(C2492 c2492) {
        super((ViewGroup.LayoutParams) c2492);
        this.f7957 = new Rect();
        this.f7958 = true;
        this.f7959 = false;
    }
}
