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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能ᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800feyxiexzfUjhhgtg extends ConstraintLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final RunnableC2779feyxiexzfUjhhgtg f3155Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f3156Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f3157Ujhhgtgfeyxiexzf;

    public AbstractC0800feyxiexzfUjhhgtg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
        this.f3157Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf;
        C0971feyxiexzfUjhhgtg c0971feyxiexzfUjhhgtg = new C0971feyxiexzfUjhhgtg(0.5f);
        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3952Ujhhgtgfeyxiexzf = c0971feyxiexzfUjhhgtg;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = c0971feyxiexzfUjhhgtg;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = c0971feyxiexzfUjhhgtg;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3955Ujhhgtgfeyxiexzf = c0971feyxiexzfUjhhgtg;
        c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        this.f3157Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(-1));
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = this.f3157Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setBackground(c0226Ujhhgtgfeyxiexzf2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3141feyxiexzfUjhhgtg, R.attr.materialClockStyle, 0);
        this.f3156Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3155Ujhhgtgfeyxiexzf = new RunnableC2779feyxiexzfUjhhgtg(5, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC2779feyxiexzfUjhhgtg runnableC2779feyxiexzfUjhhgtg = this.f3155Ujhhgtgfeyxiexzf;
            handler.removeCallbacks(runnableC2779feyxiexzfUjhhgtg);
            handler.post(runnableC2779feyxiexzfUjhhgtg);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo861Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC2779feyxiexzfUjhhgtg runnableC2779feyxiexzfUjhhgtg = this.f3155Ujhhgtgfeyxiexzf;
            handler.removeCallbacks(runnableC2779feyxiexzfUjhhgtg);
            handler.post(runnableC2779feyxiexzfUjhhgtg);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3157Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public abstract void mo861Ujhhgtgfeyxiexzf();
}
