package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3383feyxiexzfUjhhgtg extends C0420Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10573Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3383feyxiexzfUjhhgtg(int i) {
        super(20);
        this.f10573Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.C0420Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1744Ujhhgtgfeyxiexzf(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f10573Ujhhgtgfeyxiexzf) {
            case 0:
                RectF rectFM1732Ujhhgtgfeyxiexzf = C0420Ujhhgtgfeyxiexzf.m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view);
                RectF rectFM1732Ujhhgtgfeyxiexzf2 = C0420Ujhhgtgfeyxiexzf.m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view2);
                if (rectFM1732Ujhhgtgfeyxiexzf.left < rectFM1732Ujhhgtgfeyxiexzf2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf((int) rectFM1732Ujhhgtgfeyxiexzf.left, (int) rectFM1732Ujhhgtgfeyxiexzf2.left, fSin), drawable.getBounds().top, AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf((int) rectFM1732Ujhhgtgfeyxiexzf.right, (int) rectFM1732Ujhhgtgfeyxiexzf2.right, fCos), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFM1732Ujhhgtgfeyxiexzf3 = C0420Ujhhgtgfeyxiexzf.m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view);
                float fM4510Ujhhgtgfeyxiexzf = f < 0.5f ? AbstractC3036feyxiexzfUjhhgtg.m4510Ujhhgtgfeyxiexzf(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC3036feyxiexzfUjhhgtg.m4510Ujhhgtgfeyxiexzf(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFM1732Ujhhgtgfeyxiexzf3.left, drawable.getBounds().top, (int) rectFM1732Ujhhgtgfeyxiexzf3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fM4510Ujhhgtgfeyxiexzf * 255.0f));
                break;
        }
    }
}
