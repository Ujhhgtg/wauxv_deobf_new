package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1517 extends View {
    public C1517(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0782 c0782 = (C0782) getLayoutParams();
        c0782.f2906 = i;
        setLayoutParams(c0782);
    }

    public void setGuidelineEnd(int i) {
        C0782 c0782 = (C0782) getLayoutParams();
        c0782.f2907 = i;
        setLayoutParams(c0782);
    }

    public void setGuidelinePercent(float f) {
        C0782 c0782 = (C0782) getLayoutParams();
        c0782.f2908 = f;
        setLayoutParams(c0782);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
