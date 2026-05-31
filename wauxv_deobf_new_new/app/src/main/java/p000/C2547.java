package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲈᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2547 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC2563 f8107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Rect f8108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f8109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8110;

    public C2547(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8108 = new Rect();
        this.f8109 = true;
        this.f8110 = false;
    }

    public C2547(int i, int i2) {
        super(i, i2);
        this.f8108 = new Rect();
        this.f8109 = true;
        this.f8110 = false;
    }

    public C2547(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f8108 = new Rect();
        this.f8109 = true;
        this.f8110 = false;
    }

    public C2547(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f8108 = new Rect();
        this.f8109 = true;
        this.f8110 = false;
    }

    public C2547(C2547 c2547) {
        super((ViewGroup.LayoutParams) c2547);
        this.f8108 = new Rect();
        this.f8109 = true;
        this.f8110 = false;
    }
}
