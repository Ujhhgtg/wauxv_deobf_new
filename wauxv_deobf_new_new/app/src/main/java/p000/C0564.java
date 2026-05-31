package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0564 extends Property {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2339;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0564(Class cls, String str, int i) {
        super(cls, str);
        this.f2339 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2339) {
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
                return Float.valueOf(AbstractC3655.f11380.mo3495((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2339) {
            case 0:
                C0567 c0567 = (C0567) obj;
                PointF pointF = (PointF) obj2;
                c0567.getClass();
                c0567.f2342 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0567.f2343 = iRound;
                int i = c0567.f2347 + 1;
                c0567.f2347 = i;
                if (i == c0567.f2348) {
                    AbstractC3655.m5210(c0567.f2346, c0567.f2342, iRound, c0567.f2344, c0567.f2345);
                    c0567.f2347 = 0;
                    c0567.f2348 = 0;
                }
                break;
            case 1:
                C0567 c0568 = (C0567) obj;
                PointF pointF2 = (PointF) obj2;
                c0568.getClass();
                c0568.f2344 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0568.f2345 = iRound2;
                int i2 = c0568.f2348 + 1;
                c0568.f2348 = i2;
                if (c0568.f2347 == i2) {
                    AbstractC3655.m5210(c0568.f2346, c0568.f2342, c0568.f2343, c0568.f2344, iRound2);
                    c0568.f2347 = 0;
                    c0568.f2348 = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC3655.m5210(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC3655.m5210(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC3655.m5210(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC3655.f11380.mo3496((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
