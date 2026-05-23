package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0583 extends Property {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2373;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0583(Class cls, String str, int i) {
        super(cls, str);
        this.f2373 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2373) {
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
                return Float.valueOf(((SwitchCompat) obj).f130);
            case 6:
                return Float.valueOf(AbstractC3595.f11231.mo3226((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2373) {
            case 0:
                C0586 c0586 = (C0586) obj;
                PointF pointF = (PointF) obj2;
                
                c0586.f2376 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0586.f2377 = iRound;
                int i = c0586.f2381 + 1;
                c0586.f2381 = i;
                if (i == c0586.f2382) {
                    AbstractC3595.m5204(c0586.f2380, c0586.f2376, iRound, c0586.f2378, c0586.f2379);
                    c0586.f2381 = 0;
                    c0586.f2382 = 0;
                }
                break;
            case 1:
                C0586 c0587 = (C0586) obj;
                PointF pointF2 = (PointF) obj2;
                
                c0587.f2378 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0587.f2379 = iRound2;
                int i2 = c0587.f2382 + 1;
                c0587.f2382 = i2;
                if (c0587.f2381 == i2) {
                    AbstractC3595.m5204(c0587.f2380, c0587.f2376, c0587.f2377, c0587.f2378, iRound2);
                    c0587.f2381 = 0;
                    c0587.f2382 = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC3595.m5204(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC3595.m5204(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC3595.m5204(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC3595.f11231.mo3227((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
