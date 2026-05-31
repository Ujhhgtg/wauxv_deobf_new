package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᤝᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1813 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f6008 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public RecyclerView f6009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC2546 f6010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f6011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f6012;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public View f6013;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2557 f6014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f6015;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final LinearInterpolator f6016;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final DecelerateInterpolator f6017;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public PointF f6018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final DisplayMetrics f6019;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f6020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f6021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f6022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f6023;

    public C1813(Context context) {
        C2557 c2557 = new C2557();
        c2557.f8131 = -1;
        c2557.f8133 = false;
        c2557.f8134 = 0;
        c2557.f8128 = 0;
        c2557.f8129 = 0;
        c2557.f8130 = Integer.MIN_VALUE;
        c2557.f8132 = null;
        this.f6014 = c2557;
        this.f6016 = new LinearInterpolator();
        this.f6017 = new DecelerateInterpolator();
        this.f6020 = false;
        this.f6022 = 0;
        this.f6023 = 0;
        this.f6019 = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m3697(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public int mo2052(View view, int i) {
        AbstractC2546 abstractC2546 = this.f6010;
        if (abstractC2546 == null || !abstractC2546.mo152()) {
            return 0;
        }
        C2547 c2547 = (C2547) view.getLayoutParams();
        return m3697(AbstractC2546.m4477(view) - ((ViewGroup.MarginLayoutParams) c2547).leftMargin, AbstractC2546.m4480(view) + ((ViewGroup.MarginLayoutParams) c2547).rightMargin, abstractC2546.m4492(), abstractC2546.f8105 - abstractC2546.m4493(), i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public int mo2053(View view, int i) {
        AbstractC2546 abstractC2546 = this.f6010;
        if (abstractC2546 == null || !abstractC2546.mo153()) {
            return 0;
        }
        C2547 c2547 = (C2547) view.getLayoutParams();
        return m3697(AbstractC2546.m4481(view) - ((ViewGroup.MarginLayoutParams) c2547).topMargin, AbstractC2546.m4476(view) + ((ViewGroup.MarginLayoutParams) c2547).bottomMargin, abstractC2546.m4494(), abstractC2546.f8106 - abstractC2546.m4491(), i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int m3698(int i) {
        float fAbs = Math.abs(i);
        if (!this.f6020) {
            this.f6021 = 25.0f / this.f6019.densityDpi;
            this.f6020 = true;
        }
        return (int) Math.ceil(fAbs * this.f6021);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public PointF mo2054(int i) {
        Object obj = this.f6010;
        if (obj instanceof InterfaceC2558) {
            return ((InterfaceC2558) obj).mo150(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC2558.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3699(int i, int i2) {
        int i3;
        PointF pointFMo2054;
        RecyclerView recyclerView = this.f6009;
        if (this.f6008 == -1 || recyclerView == null) {
            m3700();
        }
        if (this.f6011 && this.f6013 == null && this.f6010 != null && (pointFMo2054 = mo2054(this.f6008)) != null) {
            float f = pointFMo2054.x;
            if (f != 0.0f || pointFMo2054.y != 0.0f) {
                recyclerView.m252((int) Math.signum(f), (int) Math.signum(pointFMo2054.y), null);
            }
        }
        this.f6011 = false;
        View view = this.f6013;
        C2557 c2557 = this.f6014;
        if (view != null) {
            this.f6009.getClass();
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
            if ((abstractC2563M204 != null ? abstractC2563M204.m4534() : -1) == this.f6008) {
                View view2 = this.f6013;
                C2559 c2559 = recyclerView.f411;
                PointF pointF = this.f6018;
                int i4 = 0;
                if (pointF != null) {
                    float f2 = pointF.x;
                    if (f2 == 0.0f) {
                        i3 = 0;
                    } else {
                        i3 = f2 > 0.0f ? 1 : -1;
                    }
                } else {
                    i3 = 0;
                }
                int iMo2052 = mo2052(view2, i3);
                PointF pointF2 = this.f6018;
                if (pointF2 != null) {
                    float f3 = pointF2.y;
                    if (f3 != 0.0f) {
                        i4 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int iMo2053 = mo2053(view2, i4);
                int iCeil = (int) Math.ceil(((double) m3698((int) Math.sqrt((iMo2053 * iMo2053) + (iMo2052 * iMo2052)))) / 0.3356d);
                if (iCeil > 0) {
                    c2557.f8128 = -iMo2052;
                    c2557.f8129 = -iMo2053;
                    c2557.f8130 = iCeil;
                    c2557.f8132 = this.f6017;
                    c2557.f8133 = true;
                }
                c2557.m4525(recyclerView);
                m3700();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f6013 = null;
            }
        }
        if (this.f6012) {
            C2559 c25510 = recyclerView.f411;
            if (this.f6009.f369.m4489() == 0) {
                m3700();
            } else {
                int i5 = this.f6022;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f6022 = i6;
                int i7 = this.f6023;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f6023 = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF pointFMo2055 = mo2054(this.f6008);
                    if (pointFMo2055 != null) {
                        float f4 = pointFMo2055.x;
                        if (f4 == 0.0f && pointFMo2055.y == 0.0f) {
                            c2557.f8131 = this.f6008;
                            m3700();
                        } else {
                            float f5 = pointFMo2055.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFMo2055.x / fSqrt;
                            pointFMo2055.x = f6;
                            float f7 = pointFMo2055.y / fSqrt;
                            pointFMo2055.y = f7;
                            this.f6018 = pointFMo2055;
                            this.f6022 = (int) (f6 * 10000.0f);
                            this.f6023 = (int) (f7 * 10000.0f);
                            int iM3698 = m3698(10000);
                            int i9 = (int) (this.f6022 * 1.2f);
                            int i10 = (int) (this.f6023 * 1.2f);
                            c2557.f8128 = i9;
                            c2557.f8129 = i10;
                            c2557.f8130 = (int) (iM3698 * 1.2f);
                            c2557.f8132 = this.f6016;
                            c2557.f8133 = true;
                        }
                    } else {
                        c2557.f8131 = this.f6008;
                        m3700();
                    }
                }
            }
            boolean z = c2557.f8131 >= 0;
            c2557.m4525(recyclerView);
            if (z && this.f6012) {
                this.f6011 = true;
                recyclerView.f408.m4529();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3700() {
        if (this.f6012) {
            this.f6012 = false;
            this.f6023 = 0;
            this.f6022 = 0;
            this.f6018 = null;
            this.f6009.f411.f8135 = -1;
            this.f6013 = null;
            this.f6008 = -1;
            this.f6011 = false;
            AbstractC2546 abstractC2546 = this.f6010;
            if (abstractC2546.f8096 == this) {
                abstractC2546.f8096 = null;
            }
            this.f6010 = null;
            this.f6009 = null;
        }
    }
}
