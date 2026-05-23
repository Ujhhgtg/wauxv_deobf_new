package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1134 extends C2102 {

    public final /* synthetic */ int f4219;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1134(int i) {
        super(20);
        this.f4219 = i;
    }

    @Override // p000.C2102
    public final void mo2732(C2891 c2891, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f4219) {
            case 0:
                RectF rectFM3894 = C2102.m3894(c2891, view);
                RectF rectFM3895 = C2102.m3894(c2891, view2);
                if (rectFM3894.left < rectFM3895.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AbstractC0164.m1213((int) rectFM3894.left, (int) rectFM3895.left, fSin), drawable.getBounds().top, AbstractC0164.m1213((int) rectFM3894.right, (int) rectFM3895.right, fCos), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFM3896 = C2102.m3894(c2891, view);
                float fM1212 = f < 0.5f ? AbstractC0164.m1212(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC0164.m1212(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFM3896.left, drawable.getBounds().top, (int) rectFM3896.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fM1212 * 255.0f));
                break;
        }
    }
}
