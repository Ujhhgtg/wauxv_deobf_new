package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2676 {

    public static final int[] f8616 = new int[3];

    public static final float[] f8617 = {0.0f, 0.5f, 1.0f};

    public static final int[] f8618 = new int[4];

    public static final float[] f8619 = {0.0f, 0.0f, 0.5f, 1.0f};

    public final Paint f8620;

    public final Paint f8621;

    public final Paint f8622;

    public final int f8623;

    public final int f8624;

    public final int f8625;

    public final Path f8626 = new Path();

    public final Paint f8627;

    public C2676() {
        Paint paint = new Paint();
        this.f8627 = paint;
        Paint paint2 = new Paint();
        this.f8620 = paint2;
        this.f8623 = AbstractC0752.m2226(-16777216, 68);
        this.f8624 = AbstractC0752.m2226(-16777216, 20);
        this.f8625 = AbstractC0752.m2226(-16777216, 0);
        paint2.setColor(this.f8623);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f8621 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f8622 = new Paint(paint3);
    }
}
