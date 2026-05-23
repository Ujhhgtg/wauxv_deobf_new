package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138 {

    public int f4232;

    public final Object f4233;

    public final Object f4234;

    public AbstractC1138(AbstractC2491 abstractC2491) {
        this.f4232 = -2147483648;
        this.f4234 = new Rect();
        this.f4233 = abstractC2491;
    }

    public static AbstractC1138 m2736(AbstractC2491 abstractC2491, int i) {
        if (i == 0) {
            return new C2306(abstractC2491, 0);
        }
        if (i == 1) {
            return new C2306(abstractC2491, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int mo2737(View view);

    public abstract int mo2738(View view);

    public abstract int mo2739(View view);

    public abstract int mo2740(View view);

    public abstract int mo2741();

    public abstract int mo2742();

    public abstract int mo2743();

    public abstract int mo2744();

    public abstract int mo2745();

    public abstract int mo2746();

    public abstract int mo2747();

    public abstract int mo2748(View view);

    public abstract int mo2749(View view);

    public abstract void mo2750(int i);

    public AbstractC1138(InterfaceC1141 interfaceC1141) {
        this.f4232 = 0;
        this.f4234 = new C0986();
        this.f4233 = interfaceC1141;
    }
}
