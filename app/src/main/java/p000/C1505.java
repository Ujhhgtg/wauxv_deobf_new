package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1505 extends View {
    public C1505(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0783 c0783 = (C0783) getLayoutParams();
        c0783.f2899 = i;
        setLayoutParams(c0783);
    }

    public void setGuidelineEnd(int i) {
        C0783 c0783 = (C0783) getLayoutParams();
        c0783.f2900 = i;
        setLayoutParams(c0783);
    }

    public void setGuidelinePercent(float f) {
        C0783 c0783 = (C0783) getLayoutParams();
        c0783.f2901 = f;
        setLayoutParams(c0783);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
