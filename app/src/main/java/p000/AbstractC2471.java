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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2471 extends ConstraintLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final RunnableC0563 f7899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f7900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final C1917 f7901;

    public AbstractC2471(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C1917 c1917 = new C1917();
        this.f7901 = c1917;
        C2530 c2530 = new C2530(0.5f);
        C2021 c2021M4691 = c1917.f6332.f6314.m4691();
        c2021M4691.f6766 = c2530;
        c2021M4691.f6767 = c2530;
        c2021M4691.f6768 = c2530;
        c2021M4691.f6769 = c2530;
        c1917.setShapeAppearanceModel(c2021M4691.m3876());
        this.f7901.m3716(ColorStateList.valueOf(-1));
        C1917 c1918 = this.f7901;
        Field field = AbstractC3578.f11184;
        setBackground(c1918);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7860, R.attr.materialClockStyle, 0);
        this.f7900 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7899 = new RunnableC0563(5, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = AbstractC3578.f11184;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0563 runnableC0563 = this.f7899;
            handler.removeCallbacks(runnableC0563);
            handler.post(runnableC0563);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo718();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0563 runnableC0563 = this.f7899;
            handler.removeCallbacks(runnableC0563);
            handler.post(runnableC0563);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f7901.m3716(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract void mo718();
}
