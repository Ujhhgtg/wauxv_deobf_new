package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1140 extends C2135 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4231;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1140(int i) {
        super(20);
        this.f4231 = i;
    }

    @Override // p000.C2135
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo2875(C2950 c2950, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f4231) {
            case 0:
                RectF rectFM4077 = C2135.m4077(c2950, view);
                RectF rectFM4078 = C2135.m4077(c2950, view2);
                if (rectFM4077.left < rectFM4078.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AbstractC0172.m1359((int) rectFM4077.left, (int) rectFM4078.left, fSin), drawable.getBounds().top, AbstractC0172.m1359((int) rectFM4077.right, (int) rectFM4078.right, fCos), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFM4079 = C2135.m4077(c2950, view);
                float fM1358 = f < 0.5f ? AbstractC0172.m1358(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC0172.m1358(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFM4079.left, drawable.getBounds().top, (int) rectFM4079.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fM1358 * 255.0f));
                break;
        }
    }
}
