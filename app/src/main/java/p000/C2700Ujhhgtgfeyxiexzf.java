package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱ要点脸ᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2700Ujhhgtgfeyxiexzf extends Property {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8617Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2700Ujhhgtgfeyxiexzf(Class cls, String str, int i) {
        super(cls, str);
        this.f8617Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f8617Ujhhgtgfeyxiexzf) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).f131feyxiexzfUjhhgtg);
            case 6:
                return Float.valueOf(AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3523Ujhhgtgfeyxiexzf((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f8617Ujhhgtgfeyxiexzf) {
            case 0:
                C2678Ujhhgtgfeyxiexzf c2678Ujhhgtgfeyxiexzf = (C2678Ujhhgtgfeyxiexzf) obj;
                PointF pointF = (PointF) obj2;
                c2678Ujhhgtgfeyxiexzf.getClass();
                c2678Ujhhgtgfeyxiexzf.f8555Ujhhgtgfeyxiexzf = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c2678Ujhhgtgfeyxiexzf.f8556Ujhhgtgfeyxiexzf = iRound;
                int i = c2678Ujhhgtgfeyxiexzf.f8560Ujhhgtgfeyxiexzf + 1;
                c2678Ujhhgtgfeyxiexzf.f8560Ujhhgtgfeyxiexzf = i;
                if (i == c2678Ujhhgtgfeyxiexzf.f8561Ujhhgtgfeyxiexzf) {
                    AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(c2678Ujhhgtgfeyxiexzf.f8559Ujhhgtgfeyxiexzf, c2678Ujhhgtgfeyxiexzf.f8555Ujhhgtgfeyxiexzf, iRound, c2678Ujhhgtgfeyxiexzf.f8557Ujhhgtgfeyxiexzf, c2678Ujhhgtgfeyxiexzf.f8558Ujhhgtgfeyxiexzf);
                    c2678Ujhhgtgfeyxiexzf.f8560Ujhhgtgfeyxiexzf = 0;
                    c2678Ujhhgtgfeyxiexzf.f8561Ujhhgtgfeyxiexzf = 0;
                }
                break;
            case 1:
                C2678Ujhhgtgfeyxiexzf c2678Ujhhgtgfeyxiexzf2 = (C2678Ujhhgtgfeyxiexzf) obj;
                PointF pointF2 = (PointF) obj2;
                c2678Ujhhgtgfeyxiexzf2.getClass();
                c2678Ujhhgtgfeyxiexzf2.f8557Ujhhgtgfeyxiexzf = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c2678Ujhhgtgfeyxiexzf2.f8558Ujhhgtgfeyxiexzf = iRound2;
                int i2 = c2678Ujhhgtgfeyxiexzf2.f8561Ujhhgtgfeyxiexzf + 1;
                c2678Ujhhgtgfeyxiexzf2.f8561Ujhhgtgfeyxiexzf = i2;
                if (c2678Ujhhgtgfeyxiexzf2.f8560Ujhhgtgfeyxiexzf == i2) {
                    AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(c2678Ujhhgtgfeyxiexzf2.f8559Ujhhgtgfeyxiexzf, c2678Ujhhgtgfeyxiexzf2.f8555Ujhhgtgfeyxiexzf, c2678Ujhhgtgfeyxiexzf2.f8556Ujhhgtgfeyxiexzf, c2678Ujhhgtgfeyxiexzf2.f8557Ujhhgtgfeyxiexzf, iRound2);
                    c2678Ujhhgtgfeyxiexzf2.f8560Ujhhgtgfeyxiexzf = 0;
                    c2678Ujhhgtgfeyxiexzf2.f8561Ujhhgtgfeyxiexzf = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3524Ujhhgtgfeyxiexzf((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
