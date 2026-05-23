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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1790 {

    public int f5952 = -1;

    public RecyclerView f5953;

    public AbstractC2491 f5954;

    public boolean f5955;

    public boolean f5956;

    public View f5957;

    public final C2502 f5958;

    public boolean f5959;

    public final LinearInterpolator f5960;

    public final DecelerateInterpolator f5961;

    public PointF f5962;

    public final DisplayMetrics f5963;

    public boolean f5964;

    public float f5965;

    public int f5966;

    public int f5967;

    public C1790(Context context) {
        C2502 c2502 = new C2502();
        c2502.f7980 = -1;
        c2502.f7982 = false;
        c2502.f7983 = 0;
        c2502.f7977 = 0;
        c2502.f7978 = 0;
        c2502.f7979 = -2147483648;
        c2502.f7981 = null;
        this.f5958 = c2502;
        this.f5960 = new LinearInterpolator();
        this.f5961 = new DecelerateInterpolator();
        this.f5964 = false;
        this.f5966 = 0;
        this.f5967 = 0;
        this.f5963 = context.getResources().getDisplayMetrics();
    }

    public static int m3525(int i, int i2, int i3, int i4, int i5) {
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

    public int mo1956(View view, int i) {
        AbstractC2491 abstractC2491 = this.f5954;
        if (abstractC2491 == null || !abstractC2491.mo152()) {
            return 0;
        }
        C2492 c2492 = (C2492) view.getLayoutParams();
        return m3525(AbstractC2491.m4455(view) - ((ViewGroup.MarginLayoutParams) c2492).leftMargin, AbstractC2491.m4458(view) + ((ViewGroup.MarginLayoutParams) c2492).rightMargin, abstractC2491.m4470(), abstractC2491.f7954 - abstractC2491.m4471(), i);
    }

    public int mo1957(View view, int i) {
        AbstractC2491 abstractC2491 = this.f5954;
        if (abstractC2491 == null || !abstractC2491.mo153()) {
            return 0;
        }
        C2492 c2492 = (C2492) view.getLayoutParams();
        return m3525(AbstractC2491.m4459(view) - ((ViewGroup.MarginLayoutParams) c2492).topMargin, AbstractC2491.m4454(view) + ((ViewGroup.MarginLayoutParams) c2492).bottomMargin, abstractC2491.m4472(), abstractC2491.f7955 - abstractC2491.m4469(), i);
    }

    public int m3526(int i) {
        float fAbs = Math.abs(i);
        if (!this.f5964) {
            this.f5965 = 25.0f / this.f5963.densityDpi;
            this.f5964 = true;
        }
        return (int) Math.ceil(fAbs * this.f5965);
    }

    public PointF mo1958(int i) {
        Object obj = this.f5954;
        if (obj instanceof InterfaceC2503) {
            return ((InterfaceC2503) obj).mo150(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC2503.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    public final void m3527(int i, int i2) {
        int i3;
        PointF pointFMo1958;
        RecyclerView recyclerView = this.f5953;
        if (this.f5952 == -1 || recyclerView == null) {
            m3528();
        }
        if (this.f5955 && this.f5957 == null && this.f5954 != null && (pointFMo1958 = mo1958(this.f5952)) != null) {
            float f = pointFMo1958.x;
            if (f != 0.0f || pointFMo1958.y != 0.0f) {
                recyclerView.m252((int) Math.signum(f), (int) Math.signum(pointFMo1958.y), null);
            }
        }
        this.f5955 = false;
        View view = this.f5957;
        C2502 c2502 = this.f5958;
        if (view != null) {
            
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
            if ((abstractC2508M204 != null ? abstractC2508M204.m4512() : -1) == this.f5952) {
                View view2 = this.f5957;
                C2504 c2504 = recyclerView.f411;
                PointF pointF = this.f5962;
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
                int iMo1956 = mo1956(view2, i3);
                PointF pointF2 = this.f5962;
                if (pointF2 != null) {
                    float f3 = pointF2.y;
                    if (f3 != 0.0f) {
                        i4 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int iMo1957 = mo1957(view2, i4);
                int iCeil = (int) Math.ceil(((double) m3526((int) Math.sqrt((iMo1957 * iMo1957) + (iMo1956 * iMo1956)))) / 0.3356d);
                if (iCeil > 0) {
                    c2502.f7977 = -iMo1956;
                    c2502.f7978 = -iMo1957;
                    c2502.f7979 = iCeil;
                    c2502.f7981 = this.f5961;
                    c2502.f7982 = true;
                }
                c2502.m4503(recyclerView);
                m3528();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5957 = null;
            }
        }
        if (this.f5956) {
            C2504 c2505 = recyclerView.f411;
            if (this.f5953.f369.m4467() == 0) {
                m3528();
            } else {
                int i5 = this.f5966;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f5966 = i6;
                int i7 = this.f5967;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f5967 = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF pointFMo1959 = mo1958(this.f5952);
                    if (pointFMo1959 != null) {
                        float f4 = pointFMo1959.x;
                        if (f4 == 0.0f && pointFMo1959.y == 0.0f) {
                            c2502.f7980 = this.f5952;
                            m3528();
                        } else {
                            float f5 = pointFMo1959.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFMo1959.x / fSqrt;
                            pointFMo1959.x = f6;
                            float f7 = pointFMo1959.y / fSqrt;
                            pointFMo1959.y = f7;
                            this.f5962 = pointFMo1959;
                            this.f5966 = (int) (f6 * 10000.0f);
                            this.f5967 = (int) (f7 * 10000.0f);
                            int iM3526 = m3526(10000);
                            int i9 = (int) (this.f5966 * 1.2f);
                            int i10 = (int) (this.f5967 * 1.2f);
                            c2502.f7977 = i9;
                            c2502.f7978 = i10;
                            c2502.f7979 = (int) (iM3526 * 1.2f);
                            c2502.f7981 = this.f5960;
                            c2502.f7982 = true;
                        }
                    } else {
                        c2502.f7980 = this.f5952;
                        m3528();
                    }
                }
            }
            boolean z = c2502.f7980 >= 0;
            c2502.m4503(recyclerView);
            if (z && this.f5956) {
                this.f5955 = true;
                recyclerView.f408.m4507();
            }
        }
    }

    public final void m3528() {
        if (this.f5956) {
            this.f5956 = false;
            this.f5967 = 0;
            this.f5966 = 0;
            this.f5962 = null;
            this.f5953.f411.f7984 = -1;
            this.f5957 = null;
            this.f5952 = -1;
            this.f5955 = false;
            AbstractC2491 abstractC2491 = this.f5954;
            if (abstractC2491.f7945 == this) {
                abstractC2491.f7945 = null;
            }
            this.f5954 = null;
            this.f5953 = null;
        }
    }
}
