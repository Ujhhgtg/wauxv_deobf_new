package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0546Ujhhgtgfeyxiexzf extends View {
    public C0546Ujhhgtgfeyxiexzf(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) getLayoutParams();
        c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf = i;
        setLayoutParams(c3645Ujhhgtgfeyxiexzf);
    }

    public void setGuidelineEnd(int i) {
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) getLayoutParams();
        c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf = i;
        setLayoutParams(c3645Ujhhgtgfeyxiexzf);
    }

    public void setGuidelinePercent(float f) {
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) getLayoutParams();
        c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf = f;
        setLayoutParams(c3645Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
