package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᲈᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2524 extends ConstraintLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final RunnableC0541 f8048;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f8049;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C1948 f8050;

    public AbstractC2524(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C1948 c1948 = new C1948();
        this.f8050 = c1948;
        C2586 c2586 = new C2586(0.5f);
        C2737 c2737M4728 = c1948.f6437.f6419.m4728();
        c2737M4728.f8790 = c2586;
        c2737M4728.f8791 = c2586;
        c2737M4728.f8792 = c2586;
        c2737M4728.f8793 = c2586;
        c1948.setShapeAppearanceModel(c2737M4728.m4722());
        this.f8050.m3914(ColorStateList.valueOf(-1));
        C1948 c1949 = this.f8050;
        Field field = AbstractC3638.f11333;
        setBackground(c1949);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f8010, R.attr.materialClockStyle, 0);
        this.f8049 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f8048 = new RunnableC0541(this, 5);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = AbstractC3638.f11333;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0541 runnableC0541 = this.f8048;
            handler.removeCallbacks(runnableC0541);
            handler.post(runnableC0541);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo862();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0541 runnableC0541 = this.f8048;
            handler.removeCallbacks(runnableC0541);
            handler.post(runnableC0541);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f8050.m3914(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract void mo862();
}
