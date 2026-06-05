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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ能不能ᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0069Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f1088Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public RecyclerView f1089Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public AbstractC0822feyxiexzfUjhhgtg f1090Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f1091Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f1092Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public View f1093Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0815feyxiexzfUjhhgtg f1094Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f1095Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final LinearInterpolator f1096Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final DecelerateInterpolator f1097Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public PointF f1098Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final DisplayMetrics f1099Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f1100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public float f1101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1103Ujhhgtgfeyxiexzf;

    public C0069Ujhhgtgfeyxiexzf(Context context) {
        C0815feyxiexzfUjhhgtg c0815feyxiexzfUjhhgtg = new C0815feyxiexzfUjhhgtg();
        c0815feyxiexzfUjhhgtg.f3224Ujhhgtgfeyxiexzf = -1;
        c0815feyxiexzfUjhhgtg.f3226Ujhhgtgfeyxiexzf = false;
        c0815feyxiexzfUjhhgtg.f3227Ujhhgtgfeyxiexzf = 0;
        c0815feyxiexzfUjhhgtg.f3221Ujhhgtgfeyxiexzf = 0;
        c0815feyxiexzfUjhhgtg.f3222Ujhhgtgfeyxiexzf = 0;
        c0815feyxiexzfUjhhgtg.f3223Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        c0815feyxiexzfUjhhgtg.f3225Ujhhgtgfeyxiexzf = null;
        this.f1094Ujhhgtgfeyxiexzf = c0815feyxiexzfUjhhgtg;
        this.f1096Ujhhgtgfeyxiexzf = new LinearInterpolator();
        this.f1097Ujhhgtgfeyxiexzf = new DecelerateInterpolator();
        this.f1100Ujhhgtgfeyxiexzf = false;
        this.f1102Ujhhgtgfeyxiexzf = 0;
        this.f1103Ujhhgtgfeyxiexzf = 0;
        this.f1099Ujhhgtgfeyxiexzf = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static int m1079Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, int i5) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int mo1080Ujhhgtgfeyxiexzf(View view, int i) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f1090Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null || !abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf()) {
            return 0;
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        return m1079Ujhhgtgfeyxiexzf(AbstractC0822feyxiexzfUjhhgtg.m2191feyxiexzfUjhhgtg(view) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).leftMargin, AbstractC0822feyxiexzfUjhhgtg.m2194feyxiexzfUjhhgtg(view) + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).rightMargin, abstractC0822feyxiexzfUjhhgtg.m2206feyxiexzfUjhhgtg(), abstractC0822feyxiexzfUjhhgtg.f3273Ujhhgtgfeyxiexzf - abstractC0822feyxiexzfUjhhgtg.m2207feyxiexzfUjhhgtg(), i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int mo1081Ujhhgtgfeyxiexzf(View view, int i) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f1090Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null || !abstractC0822feyxiexzfUjhhgtg.mo153Ujhhgtgfeyxiexzf()) {
            return 0;
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        return m1079Ujhhgtgfeyxiexzf(AbstractC0822feyxiexzfUjhhgtg.m2195feyxiexzfUjhhgtg(view) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).topMargin, AbstractC0822feyxiexzfUjhhgtg.m2190feyxiexzfUjhhgtg(view) + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).bottomMargin, abstractC0822feyxiexzfUjhhgtg.m2208feyxiexzfUjhhgtg(), abstractC0822feyxiexzfUjhhgtg.f3274Ujhhgtgfeyxiexzf - abstractC0822feyxiexzfUjhhgtg.m2205feyxiexzfUjhhgtg(), i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int m1082Ujhhgtgfeyxiexzf(int i) {
        float fAbs = Math.abs(i);
        if (!this.f1100Ujhhgtgfeyxiexzf) {
            this.f1101Ujhhgtgfeyxiexzf = 25.0f / this.f1099Ujhhgtgfeyxiexzf.densityDpi;
            this.f1100Ujhhgtgfeyxiexzf = true;
        }
        return (int) Math.ceil(fAbs * this.f1101Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public PointF mo1083Ujhhgtgfeyxiexzf(int i) {
        Object obj = this.f1090Ujhhgtgfeyxiexzf;
        if (obj instanceof InterfaceC0814feyxiexzfUjhhgtg) {
            return ((InterfaceC0814feyxiexzfUjhhgtg) obj).mo150Ujhhgtgfeyxiexzf(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0814feyxiexzfUjhhgtg.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1084Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3;
        PointF pointFMo1083Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f1089Ujhhgtgfeyxiexzf;
        if (this.f1088Ujhhgtgfeyxiexzf == -1 || recyclerView == null) {
            m1085Ujhhgtgfeyxiexzf();
        }
        if (this.f1091Ujhhgtgfeyxiexzf && this.f1093Ujhhgtgfeyxiexzf == null && this.f1090Ujhhgtgfeyxiexzf != null && (pointFMo1083Ujhhgtgfeyxiexzf = mo1083Ujhhgtgfeyxiexzf(this.f1088Ujhhgtgfeyxiexzf)) != null) {
            float f = pointFMo1083Ujhhgtgfeyxiexzf.x;
            if (f != 0.0f || pointFMo1083Ujhhgtgfeyxiexzf.y != 0.0f) {
                recyclerView.m252feyxiexzfUjhhgtg((int) Math.signum(f), (int) Math.signum(pointFMo1083Ujhhgtgfeyxiexzf.y), null);
            }
        }
        this.f1091Ujhhgtgfeyxiexzf = false;
        View view = this.f1093Ujhhgtgfeyxiexzf;
        C0815feyxiexzfUjhhgtg c0815feyxiexzfUjhhgtg = this.f1094Ujhhgtgfeyxiexzf;
        if (view != null) {
            this.f1089Ujhhgtgfeyxiexzf.getClass();
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
            if ((abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null ? abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2173Ujhhgtgfeyxiexzf() : -1) == this.f1088Ujhhgtgfeyxiexzf) {
                View view2 = this.f1093Ujhhgtgfeyxiexzf;
                C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = recyclerView.f412feyxiexzfUjhhgtg;
                PointF pointF = this.f1098Ujhhgtgfeyxiexzf;
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
                int iMo1080Ujhhgtgfeyxiexzf = mo1080Ujhhgtgfeyxiexzf(view2, i3);
                PointF pointF2 = this.f1098Ujhhgtgfeyxiexzf;
                if (pointF2 != null) {
                    float f3 = pointF2.y;
                    if (f3 != 0.0f) {
                        i4 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int iMo1081Ujhhgtgfeyxiexzf = mo1081Ujhhgtgfeyxiexzf(view2, i4);
                int iCeil = (int) Math.ceil(((double) m1082Ujhhgtgfeyxiexzf((int) Math.sqrt((iMo1081Ujhhgtgfeyxiexzf * iMo1081Ujhhgtgfeyxiexzf) + (iMo1080Ujhhgtgfeyxiexzf * iMo1080Ujhhgtgfeyxiexzf)))) / 0.3356d);
                if (iCeil > 0) {
                    c0815feyxiexzfUjhhgtg.f3221Ujhhgtgfeyxiexzf = -iMo1080Ujhhgtgfeyxiexzf;
                    c0815feyxiexzfUjhhgtg.f3222Ujhhgtgfeyxiexzf = -iMo1081Ujhhgtgfeyxiexzf;
                    c0815feyxiexzfUjhhgtg.f3223Ujhhgtgfeyxiexzf = iCeil;
                    c0815feyxiexzfUjhhgtg.f3225Ujhhgtgfeyxiexzf = this.f1097Ujhhgtgfeyxiexzf;
                    c0815feyxiexzfUjhhgtg.f3226Ujhhgtgfeyxiexzf = true;
                }
                c0815feyxiexzfUjhhgtg.m2160Ujhhgtgfeyxiexzf(recyclerView);
                m1085Ujhhgtgfeyxiexzf();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1093Ujhhgtgfeyxiexzf = null;
            }
        }
        if (this.f1092Ujhhgtgfeyxiexzf) {
            C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg2 = recyclerView.f412feyxiexzfUjhhgtg;
            if (this.f1089Ujhhgtgfeyxiexzf.f370Ujhhgtgfeyxiexzf.m2203Ujhhgtgfeyxiexzf() == 0) {
                m1085Ujhhgtgfeyxiexzf();
            } else {
                int i5 = this.f1102Ujhhgtgfeyxiexzf;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1102Ujhhgtgfeyxiexzf = i6;
                int i7 = this.f1103Ujhhgtgfeyxiexzf;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f1103Ujhhgtgfeyxiexzf = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF pointFMo1083Ujhhgtgfeyxiexzf2 = mo1083Ujhhgtgfeyxiexzf(this.f1088Ujhhgtgfeyxiexzf);
                    if (pointFMo1083Ujhhgtgfeyxiexzf2 != null) {
                        float f4 = pointFMo1083Ujhhgtgfeyxiexzf2.x;
                        if (f4 == 0.0f && pointFMo1083Ujhhgtgfeyxiexzf2.y == 0.0f) {
                            c0815feyxiexzfUjhhgtg.f3224Ujhhgtgfeyxiexzf = this.f1088Ujhhgtgfeyxiexzf;
                            m1085Ujhhgtgfeyxiexzf();
                        } else {
                            float f5 = pointFMo1083Ujhhgtgfeyxiexzf2.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFMo1083Ujhhgtgfeyxiexzf2.x / fSqrt;
                            pointFMo1083Ujhhgtgfeyxiexzf2.x = f6;
                            float f7 = pointFMo1083Ujhhgtgfeyxiexzf2.y / fSqrt;
                            pointFMo1083Ujhhgtgfeyxiexzf2.y = f7;
                            this.f1098Ujhhgtgfeyxiexzf = pointFMo1083Ujhhgtgfeyxiexzf2;
                            this.f1102Ujhhgtgfeyxiexzf = (int) (f6 * 10000.0f);
                            this.f1103Ujhhgtgfeyxiexzf = (int) (f7 * 10000.0f);
                            int iM1082Ujhhgtgfeyxiexzf = m1082Ujhhgtgfeyxiexzf(10000);
                            int i9 = (int) (this.f1102Ujhhgtgfeyxiexzf * 1.2f);
                            int i10 = (int) (this.f1103Ujhhgtgfeyxiexzf * 1.2f);
                            c0815feyxiexzfUjhhgtg.f3221Ujhhgtgfeyxiexzf = i9;
                            c0815feyxiexzfUjhhgtg.f3222Ujhhgtgfeyxiexzf = i10;
                            c0815feyxiexzfUjhhgtg.f3223Ujhhgtgfeyxiexzf = (int) (iM1082Ujhhgtgfeyxiexzf * 1.2f);
                            c0815feyxiexzfUjhhgtg.f3225Ujhhgtgfeyxiexzf = this.f1096Ujhhgtgfeyxiexzf;
                            c0815feyxiexzfUjhhgtg.f3226Ujhhgtgfeyxiexzf = true;
                        }
                    } else {
                        c0815feyxiexzfUjhhgtg.f3224Ujhhgtgfeyxiexzf = this.f1088Ujhhgtgfeyxiexzf;
                        m1085Ujhhgtgfeyxiexzf();
                    }
                }
            }
            boolean z = c0815feyxiexzfUjhhgtg.f3224Ujhhgtgfeyxiexzf >= 0;
            c0815feyxiexzfUjhhgtg.m2160Ujhhgtgfeyxiexzf(recyclerView);
            if (z && this.f1092Ujhhgtgfeyxiexzf) {
                this.f1091Ujhhgtgfeyxiexzf = true;
                recyclerView.f409feyxiexzfUjhhgtg.m2162Ujhhgtgfeyxiexzf();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1085Ujhhgtgfeyxiexzf() {
        if (this.f1092Ujhhgtgfeyxiexzf) {
            this.f1092Ujhhgtgfeyxiexzf = false;
            this.f1103Ujhhgtgfeyxiexzf = 0;
            this.f1102Ujhhgtgfeyxiexzf = 0;
            this.f1098Ujhhgtgfeyxiexzf = null;
            this.f1089Ujhhgtgfeyxiexzf.f412feyxiexzfUjhhgtg.f3205Ujhhgtgfeyxiexzf = -1;
            this.f1093Ujhhgtgfeyxiexzf = null;
            this.f1088Ujhhgtgfeyxiexzf = -1;
            this.f1091Ujhhgtgfeyxiexzf = false;
            AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f1090Ujhhgtgfeyxiexzf;
            if (abstractC0822feyxiexzfUjhhgtg.f3264Ujhhgtgfeyxiexzf == this) {
                abstractC0822feyxiexzfUjhhgtg.f3264Ujhhgtgfeyxiexzf = null;
            }
            this.f1090Ujhhgtgfeyxiexzf = null;
            this.f1089Ujhhgtgfeyxiexzf = null;
        }
    }
}
