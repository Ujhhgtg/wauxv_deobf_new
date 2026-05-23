package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p000.AbstractC1138;
import p000.AbstractC1270;
import p000.AbstractC2482;
import p000.AbstractC2491;
import p000.AbstractC3578;
import p000.C0091;
import p000.C0092;
import p000.C0542;
import p000.C1316;
import p000.C1439;
import p000.C1757;
import p000.C1790;
import p000.C2490;
import p000.C2492;
import p000.C2498;
import p000.C2504;
import p000.C2803;
import p000.C2804;
import p000.C2805;
import p000.C2806;
import p000.InterfaceC2503;
import p000.RunnableC0141;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2491 implements InterfaceC2503 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C1316[] f433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final AbstractC1138 f434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final AbstractC1138 f435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C1757 f438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final BitSet f441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C0542 f444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean f447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public C2806 f448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final Rect f450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final C2803 f451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean f453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int[] f454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final RunnableC0141 f455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f440 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f442 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f443 = -2147483648;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f432 = -1;
        this.f439 = false;
        C0542 c0542 = new C0542(29, false);
        this.f444 = c0542;
        this.f445 = 2;
        this.f450 = new Rect();
        this.f451 = new C2803(this);
        this.f452 = false;
        this.f453 = true;
        this.f455 = new RunnableC0141(15, this);
        C2490 c2490M4461 = AbstractC2491.m4461(context, attributeSet, i, i2);
        int i3 = c2490M4461.f7937;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo151(null);
        if (i3 != this.f436) {
            this.f436 = i3;
            AbstractC1138 abstractC1138 = this.f434;
            this.f434 = this.f435;
            this.f435 = abstractC1138;
            m4480();
        }
        int i4 = c2490M4461.f7938;
        mo151(null);
        if (i4 != -1) {
            c0542.m1884();
            m4480();
            this.f432 = i4;
            this.f441 = new BitSet(this.f432);
            this.f433 = new C1316[this.f432];
            for (int i5 = 0; i5 < this.f432; i5++) {
                this.f433[i5] = new C1316(this, i5);
            }
            m4480();
        }
        boolean z = c2490M4461.f7939;
        mo151(null);
        C2806 c2806 = this.f448;
        if (c2806 != null && c2806.f8956 != z) {
            c2806.f8956 = z;
        }
        this.f439 = z;
        m4480();
        C1757 c1757 = new C1757();
        c1757.f5872 = true;
        c1757.f5877 = 0;
        c1757.f5878 = 0;
        this.f438 = c1757;
        this.f434 = AbstractC1138.m2736(this, this.f436);
        this.f435 = AbstractC1138.m2736(this, 1 - this.f436);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᲀᤞ, reason: contains not printable characters */
    public static int m262(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == -2147483648 || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // p000.InterfaceC2503
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final PointF mo150(int i) {
        int i2 = -1;
        if (m4467() != 0) {
            if ((i < m274()) == this.f440) {
                i2 = 1;
            }
        } else if (this.f440) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (false) {
            return null;
        }
        if (this.f436 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo151(String str) {
        if (this.f448 == null) {
            super.mo151(str);
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo152() {
        return this.f436 == 0;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo153() {
        return this.f436 == 1;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo107(C2492 c2492) {
        return c2492 instanceof C2804;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo154(int i, int i2, C2504 c2504, C1439 c1439) {
        C1757 c1757;
        int iM3034;
        int iM3036;
        if (this.f436 != 0) {
            i = i2;
        }
        if (m4467() == 0 || i == 0) {
            return;
        }
        m284(i, c2504);
        int[] iArr = this.f454;
        if (iArr == null || iArr.length < this.f432) {
            this.f454 = new int[this.f432];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f432;
            c1757 = this.f438;
            if (i3 >= i5) {
                break;
            }
            if (c1757.f5875 == -1) {
                iM3034 = c1757.f5877;
                iM3036 = this.f433[i3].m3036(iM3034);
            } else {
                iM3034 = this.f433[i3].m3034(c1757.f5878);
                iM3036 = c1757.f5878;
            }
            int i6 = iM3034 - iM3036;
            if (i6 >= 0) {
                this.f454[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f454, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c1757.f5874;
            if (i8 < 0 || i8 >= c2504.m4505()) {
                return;
            }
            c1439.m3134(c1757.f5874, this.f454[i7]);
            c1757.f5874 += c1757.f5875;
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final int mo156(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1270.m2974(c2504, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo108(C2504 c2504) {
        return m268(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final int mo109(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1270.m2976(c2504, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo157(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1270.m2974(c2504, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo110(C2504 c2504) {
        return m268(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final int mo111(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1270.m2976(c2504, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final C2492 mo112() {
        return this.f436 == 0 ? new C2804(-2, -1) : new C2804(-1, -2);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final C2492 mo113(Context context, AttributeSet attributeSet) {
        return new C2804(context, attributeSet);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final C2492 mo114(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2804((ViewGroup.MarginLayoutParams) layoutParams) : new C2804(layoutParams);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final int mo115(C2498 c2498, C2504 c2504) {
        if (this.f436 == 1) {
            return Math.min(this.f432, c2504.m4505());
        }
        return -1;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final int mo116(C2498 c2498, C2504 c2504) {
        if (this.f436 == 0) {
            return Math.min(this.f432, c2504.m4505());
        }
        return -1;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final boolean mo159() {
        return this.f445 != 0;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public final boolean mo160() {
        return this.f439;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void mo263(int i) {
        super.mo263(i);
        for (int i2 = 0; i2 < this.f432; i2++) {
            C1316 c1316 = this.f433[i2];
            int i3 = c1316.f4757;
            if (i3 != -2147483648) {
                c1316.f4757 = i3 + i;
            }
            int i4 = c1316.f4758;
            if (i4 != -2147483648) {
                c1316.f4758 = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void mo264(int i) {
        super.mo264(i);
        for (int i2 = 0; i2 < this.f432; i2++) {
            C1316 c1316 = this.f433[i2];
            int i3 = c1316.f4757;
            if (i3 != -2147483648) {
                c1316.f4757 = i3 + i;
            }
            int i4 = c1316.f4758;
            if (i4 != -2147483648) {
                c1316.f4758 = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final void mo265(AbstractC2482 abstractC2482) {
        this.f444.m1884();
        for (int i = 0; i < this.f432; i++) {
            this.f433[i].m3029();
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7942;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f455);
        }
        for (int i = 0; i < this.f432; i++) {
            this.f433[i].m3029();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final View mo117(View view, int i, C2498 c2498, C2504 c2504) {
        View viewM225;
        int i2;
        View viewM3035;
        if (m4467() != 0) {
            RecyclerView recyclerView = this.f7942;
            if (recyclerView == null || (viewM225 = recyclerView.m225(view)) == null || ((ArrayList) this.f7941.f2345).contains(viewM225)) {
                viewM225 = null;
            }
            if (viewM225 != null) {
                m288();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f436 == 0 : !(i != 130 || this.f436 != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.f436 == 1) {
                                i2 = -1;
                            }
                            i2 = -2147483648;
                        } else if (this.f436 == 0) {
                            i2 = -1;
                        } else {
                            i2 = -2147483648;
                        }
                    } else if (this.f436 != 1 && m280()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (this.f436 != 1 && m280()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != -2147483648) {
                    C2804 c2804 = (C2804) viewM225.getLayoutParams();
                    boolean z = c2804.f8944;
                    C1316 c1316 = c2804.f8943;
                    int iM275 = i2 == 1 ? m275() : m274();
                    m292(iM275, c2504);
                    m290(i2);
                    C1757 c1757 = this.f438;
                    c1757.f5874 = c1757.f5875 + iM275;
                    c1757.f5873 = (int) (this.f434.mo2747() * 0.33333334f);
                    c1757.f5879 = true;
                    c1757.f5872 = false;
                    m269(c2498, c1757, c2504);
                    this.f446 = this.f440;
                    if (!z && (viewM3035 = c1316.m3035(iM275, i2)) != null && viewM3035 != viewM225) {
                        return viewM3035;
                    }
                    if (m283(i2)) {
                        for (int i3 = this.f432 - 1; i3 >= 0; i3--) {
                            View viewM3036 = this.f433[i3].m3035(iM275, i2);
                            if (viewM3036 != null && viewM3036 != viewM225) {
                                return viewM3036;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.f432; i4++) {
                            View viewM3037 = this.f433[i4].m3035(iM275, i2);
                            if (viewM3037 != null && viewM3037 != viewM225) {
                                return viewM3037;
                            }
                        }
                    }
                    boolean z2 = (this.f439 ^ true) == (i2 == -1);
                    if (!z) {
                        View viewMo158 = mo158(z2 ? c1316.m3030() : c1316.m3031());
                        if (viewMo158 != null && viewMo158 != viewM225) {
                            return viewMo158;
                        }
                    }
                    if (m283(i2)) {
                        for (int i5 = this.f432 - 1; i5 >= 0; i5--) {
                            if (i5 != c1316.f4760) {
                                View viewMo159 = mo158(z2 ? this.f433[i5].m3030() : this.f433[i5].m3031());
                                if (viewMo159 != null && viewMo159 != viewM225) {
                                    return viewMo159;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f432; i6++) {
                            View viewMo1510 = mo158(z2 ? this.f433[i6].m3030() : this.f433[i6].m3031());
                            if (viewMo1510 != null && viewMo1510 != viewM225) {
                                return viewMo1510;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4467() > 0) {
            View viewM271 = m271(false);
            View viewM270 = m270(false);
            if (viewM271 == null || viewM270 == null) {
                return;
            }
            int iM4460 = AbstractC2491.m4460(viewM271);
            int iM4461 = AbstractC2491.m4460(viewM270);
            if (iM4460 < iM4461) {
                accessibilityEvent.setFromIndex(iM4460);
                accessibilityEvent.setToIndex(iM4461);
            } else {
                accessibilityEvent.setFromIndex(iM4461);
                accessibilityEvent.setToIndex(iM4460);
            }
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public final void mo118(C2498 c2498, C2504 c2504, C0092 c0092) {
        super.mo118(c2498, c2504, c0092);
        c0092.m1095("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public final void mo119(C2498 c2498, C2504 c2504, View view, C0092 c0092) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2804)) {
            m4474(view, c0092);
            return;
        }
        C2804 c2804 = (C2804) layoutParams;
        if (this.f436 == 0) {
            C1316 c1316 = c2804.f8943;
            c0092.m1096(C0091.m1085(c1316 == null ? -1 : c1316.f4760, c2804.f8944 ? this.f432 : 1, -1, -1, false));
        } else {
            C1316 c1317 = c2804.f8943;
            c0092.m1096(C0091.m1085(-1, -1, c1317 == null ? -1 : c1317.f4760, c2804.f8944 ? this.f432 : 1, false));
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ */
    public final void mo120(int i, int i2) {
        m278(i, i2, 1);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ */
    public final void mo121() {
        this.f444.m1884();
        m4480();
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ */
    public final void mo122(int i, int i2) {
        m278(i, i2, 8);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ */
    public final void mo123(int i, int i2) {
        m278(i, i2, 2);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ */
    public final void mo124(int i, int i2) {
        m278(i, i2, 4);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public final void mo125(C2498 c2498, C2504 c2504) {
        m282(c2498, c2504, true);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public final void mo126(C2504 c2504) {
        this.f442 = -1;
        this.f443 = -2147483648;
        this.f448 = null;
        this.f451.m4781();
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ */
    public final void mo163(Parcelable parcelable) {
        if (parcelable instanceof C2806) {
            C2806 c2806 = (C2806) parcelable;
            this.f448 = c2806;
            if (this.f442 != -1) {
                c2806.f8949 = -1;
                c2806.f8950 = -1;
                c2806.f8952 = null;
                c2806.f8951 = 0;
                c2806.f8953 = 0;
                c2806.f8954 = null;
                c2806.f8955 = null;
            }
            m4480();
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ */
    public final Parcelable mo164() {
        int iM3036;
        int iMo2746;
        int[] iArr;
        C2806 c2806 = this.f448;
        if (c2806 != null) {
            C2806 c2807 = new C2806();
            c2807.f8951 = c2806.f8951;
            c2807.f8949 = c2806.f8949;
            c2807.f8950 = c2806.f8950;
            c2807.f8952 = c2806.f8952;
            c2807.f8953 = c2806.f8953;
            c2807.f8954 = c2806.f8954;
            c2807.f8956 = c2806.f8956;
            c2807.f8957 = c2806.f8957;
            c2807.f8958 = c2806.f8958;
            c2807.f8955 = c2806.f8955;
            return c2807;
        }
        C2806 c2808 = new C2806();
        c2808.f8956 = this.f439;
        c2808.f8957 = this.f446;
        c2808.f8958 = this.f447;
        C0542 c0542 = this.f444;
        if (c0542 == null || (iArr = (int[]) c0542.f2252) == null) {
            c2808.f8953 = 0;
        } else {
            c2808.f8954 = iArr;
            c2808.f8953 = iArr.length;
            c2808.f8955 = (ArrayList) c0542.f2253;
        }
        if (m4467() <= 0) {
            c2808.f8949 = -1;
            c2808.f8950 = -1;
            c2808.f8951 = 0;
            return c2808;
        }
        c2808.f8949 = this.f446 ? m275() : m274();
        View viewM270 = this.f440 ? m270(true) : m271(true);
        c2808.f8950 = viewM270 != null ? AbstractC2491.m4460(viewM270) : -1;
        int i = this.f432;
        c2808.f8951 = i;
        c2808.f8952 = new int[i];
        for (int i2 = 0; i2 < this.f432; i2++) {
            if (this.f446) {
                iM3036 = this.f433[i2].m3034(-2147483648);
                if (iM3036 != -2147483648) {
                    iMo2746 = this.f434.mo2742();
                    iM3036 -= iMo2746;
                }
            } else {
                iM3036 = this.f433[i2].m3036(-2147483648);
                if (iM3036 != -2147483648) {
                    iMo2746 = this.f434.mo2746();
                    iM3036 -= iMo2746;
                }
            }
            c2808.f8952[i2] = iM3036;
        }
        return c2808;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final void mo266(int i) {
        if (i == 0) {
            m267();
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public final int mo128(int i, C2498 c2498, C2504 c2504) {
        return m289(i, c2498, c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public final void mo165(int i) {
        C2806 c2806 = this.f448;
        if (c2806 != null && c2806.f8949 != i) {
            c2806.f8952 = null;
            c2806.f8951 = 0;
            c2806.f8949 = -1;
            c2806.f8950 = -1;
        }
        this.f442 = i;
        this.f443 = -2147483648;
        m4480();
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ */
    public final int mo129(int i, C2498 c2498, C2504 c2504) {
        return m289(i, c2498, c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ */
    public final void mo130(Rect rect, int i, int i2) {
        int iM4452;
        int iM4453;
        int iM4471 = m4471() + m4470();
        int iM4469 = m4469() + m4472();
        int i3 = this.f436;
        int i4 = this.f432;
        if (i3 == 1) {
            int iHeight = rect.height() + iM4469;
            RecyclerView recyclerView = this.f7942;
            Field field = AbstractC3578.f11184;
            iM4453 = AbstractC2491.m4452(i2, iHeight, recyclerView.getMinimumHeight());
            iM4452 = AbstractC2491.m4452(i, (this.f437 * i4) + iM4471, this.f7942.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4471;
            RecyclerView recyclerView2 = this.f7942;
            Field field2 = AbstractC3578.f11184;
            iM4452 = AbstractC2491.m4452(i, iWidth, recyclerView2.getMinimumWidth());
            iM4453 = AbstractC2491.m4452(i2, (this.f437 * i4) + iM4469, this.f7942.getMinimumHeight());
        }
        this.f7942.setMeasuredDimension(iM4452, iM4453);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ */
    public final void mo167(RecyclerView recyclerView, C2504 c2504, int i) {
        C1790 c1790 = new C1790(recyclerView.getContext());
        c1790.f5952 = i;
        m4487(c1790);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ */
    public final boolean mo131() {
        return this.f448 == null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public final boolean m267() {
        int iM274;
        int iM275;
        if (m4467() != 0 && this.f445 != 0 && this.f7947) {
            if (this.f440) {
                iM274 = m275();
                iM275 = m274();
            } else {
                iM274 = m274();
                iM275 = m275();
            }
            C0542 c0542 = this.f444;
            if (iM274 == 0 && m279() != null) {
                c0542.m1884();
                this.f7946 = true;
                m4480();
                return true;
            }
            if (this.f452) {
                int i = this.f440 ? -1 : 1;
                int i2 = iM275 + 1;
                C2805 c2805M1888 = c0542.m1888(iM274, i2, i);
                if (c2805M1888 == null) {
                    this.f452 = false;
                    c0542.m1886(i2);
                    return false;
                }
                C2805 c2805M1889 = c0542.m1888(iM274, c2805M1888.f8945, i * (-1));
                if (c2805M1889 == null) {
                    c0542.m1886(c2805M1888.f8945);
                } else {
                    c0542.m1886(c2805M1889.f8945 + 1);
                }
                this.f7946 = true;
                m4480();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public final int m268(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1270.m2975(c2504, this.f434, m271(z), m270(z), this, this.f453, this.f440);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a9 A[LOOP:2: B:141:0x02a7->B:142:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c5 A[LOOP:3: B:147:0x02c3->B:148:0x02c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x0303  */
    /* JADX WARN: Code duplicated, block: B:161:0x0307  */
    /* JADX WARN: Code duplicated, block: B:162:0x030f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0327  */
    /* JADX WARN: Code duplicated, block: B:167:0x032b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0332  */
    /* JADX WARN: Code duplicated, block: B:172:0x033a  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᤞᲀ, reason: contains not printable characters */
    public final int m269(C2498 c2498, C1757 c1757, C2504 c2504) {
        C1316 c1316;
        int i;
        int iM277;
        int iMo2738;
        int i2;
        int i3;
        int iMo2746;
        int iMo2739;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        C2498 c2499 = c2498;
        int i8 = 0;
        int i9 = 1;
        this.f441.set(0, this.f432, true);
        C1757 c1758 = this.f438;
        int i10 = c1758.f5880 ? c1757.f5876 == 1 ? 2147483647 : -2147483648 : c1757.f5876 == 1 ? c1757.f5878 + c1757.f5873 : c1757.f5877 - c1757.f5873;
        m291(c1757.f5876, i10);
        int iMo2742 = this.f440 ? this.f434.mo2742() : this.f434.mo2746();
        boolean z2 = false;
        while (true) {
            int i11 = c1757.f5874;
            if (i11 < 0 || i11 >= c2504.m4505() || (!c1758.f5880 && this.f441.isEmpty())) {
                break;
            }
            View view = c2499.m4500(c1757.f5874, 9223372036854775807L).f8006;
            c1757.f5874 += c1757.f5875;
            C2804 c2804 = (C2804) view.getLayoutParams();
            int iM4512 = c2804.f7956.m4512();
            C0542 c0542 = this.f444;
            int[] iArr = (int[]) c0542.f2252;
            int i12 = (iArr == null || iM4512 >= iArr.length) ? -1 : iArr[iM4512];
            int i13 = i12 == -1 ? 1 : 0;
            if (i13 != 0) {
                if (c2804.f8944) {
                    c1316 = this.f433[0];
                } else {
                    if (m283(c1757.f5876)) {
                        i7 = this.f432 - 1;
                        i6 = -1;
                        i5 = -1;
                    } else {
                        i5 = 1;
                        i6 = this.f432;
                        i7 = 0;
                    }
                    C1316 c1317 = null;
                    if (c1757.f5876 == 1) {
                        int iMo2747 = this.f434.mo2746();
                        int i14 = 2147483647;
                        while (i7 != i6) {
                            C1316 c1318 = this.f433[i7];
                            int i15 = i7;
                            int iM3034 = c1318.m3034(iMo2747);
                            if (iM3034 < i14) {
                                c1317 = c1318;
                                i14 = iM3034;
                            }
                            i7 = i15 + i5;
                        }
                    } else {
                        int iMo2743 = this.f434.mo2742();
                        int i16 = -2147483648;
                        while (i7 != i6) {
                            C1316 c1319 = this.f433[i7];
                            int i17 = i7;
                            int iM3036 = c1319.m3036(iMo2743);
                            if (iM3036 > i16) {
                                i16 = iM3036;
                                c1317 = c1319;
                            }
                            i7 = i17 + i5;
                        }
                    }
                    c1316 = c1317;
                }
                c0542.m1885(iM4512);
                ((int[]) c0542.f2252)[iM4512] = c1316.f4760;
            } else {
                c1316 = this.f433[i12];
            }
            c2804.f8943 = c1316;
            if (c1757.f5876 == 1) {
                m4464(view, -1, false);
            } else {
                m4464(view, 0, false);
            }
            if (!c2804.f8944) {
                i = i13;
                if (this.f436 == 1) {
                    m281(view, AbstractC2491.m4453(this.f437, this.f7952, 0, ((ViewGroup.MarginLayoutParams) c2804).width, false), AbstractC2491.m4453(this.f7955, this.f7953, m4469() + m4472(), ((ViewGroup.MarginLayoutParams) c2804).height, true));
                } else {
                    m281(view, AbstractC2491.m4453(this.f7954, this.f7952, m4471() + m4470(), ((ViewGroup.MarginLayoutParams) c2804).width, true), AbstractC2491.m4453(this.f437, this.f7953, 0, ((ViewGroup.MarginLayoutParams) c2804).height, false));
                }
            } else if (this.f436 == 1) {
                i = i13;
                m281(view, this.f449, AbstractC2491.m4453(this.f7955, this.f7953, m4469() + m4472(), ((ViewGroup.MarginLayoutParams) c2804).height, true));
            } else {
                i = i13;
                m281(view, AbstractC2491.m4453(this.f7954, this.f7952, m4471() + m4470(), ((ViewGroup.MarginLayoutParams) c2804).width, true), this.f449);
            }
            if (c1757.f5876 == 1) {
                iMo2738 = c2804.f8944 ? m276(iMo2742) : c1316.m3034(iMo2742);
                iM277 = this.f434.mo2738(view) + iMo2738;
                if (i != 0 && c2804.f8944) {
                    C2805 c2805 = new C2805();
                    c2805.f8947 = new int[this.f432];
                    for (int i18 = 0; i18 < this.f432; i18++) {
                        c2805.f8947[i18] = iMo2738 - this.f433[i18].m3034(iMo2738);
                    }
                    c2805.f8946 = -1;
                    c2805.f8945 = iM4512;
                    c0542.m1881(c2805);
                }
            } else {
                iM277 = c2804.f8944 ? m277(iMo2742) : c1316.m3036(iMo2742);
                iMo2738 = iM277 - this.f434.mo2738(view);
                if (i != 0 && c2804.f8944) {
                    C2805 c2806 = new C2805();
                    c2806.f8947 = new int[this.f432];
                    for (int i19 = 0; i19 < this.f432; i19++) {
                        c2806.f8947[i19] = this.f433[i19].m3036(iM277) - iM277;
                    }
                    c2806.f8946 = 1;
                    c2806.f8945 = iM4512;
                    c0542.m1881(c2806);
                }
            }
            if (c2804.f8944 && c1757.f5875 == -1) {
                if (i != 0) {
                    i2 = 1;
                    this.f452 = true;
                } else {
                    if (c1757.f5876 != 1) {
                        int iM3037 = this.f433[0].m3036(-2147483648);
                        int i20 = 1;
                        while (true) {
                            if (i20 >= this.f432) {
                                z = true;
                                break;
                            }
                            if (this.f433[i20].m3036(-2147483648) != iM3037) {
                                z = false;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        int iM3035 = this.f433[0].m3034(-2147483648);
                        int i21 = 1;
                        while (true) {
                            if (i21 >= this.f432) {
                                z = true;
                                break;
                            }
                            if (this.f433[i21].m3034(-2147483648) != iM3035) {
                                z = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    i2 = 1;
                    if (!z) {
                        C2805 c2805M1889 = c0542.m1889(iM4512);
                        if (c2805M1889 != null) {
                            c2805M1889.f8948 = true;
                        }
                        this.f452 = true;
                    }
                }
                if (c1757.f5876 == 1) {
                    if (c2804.f8944) {
                        for (i4 = this.f432 - 1; i4 >= 0; i4--) {
                            this.f433[i4].m3026(view);
                        }
                    } else {
                        c2804.f8943.m3026(view);
                    }
                } else if (c2804.f8944) {
                    for (i3 = this.f432 - 1; i3 >= 0; i3--) {
                        this.f433[i3].m3039(view);
                    }
                } else {
                    c2804.f8943.m3039(view);
                }
                if (m280() || this.f436 != 1) {
                    if (c2804.f8944) {
                        iMo2746 = this.f435.mo2746();
                    } else {
                        iMo2746 = this.f435.mo2746() + (c1316.f4760 * this.f437);
                    }
                    iMo2739 = this.f435.mo2738(view) + iMo2746;
                } else {
                    iMo2739 = c2804.f8944 ? this.f435.mo2742() : this.f435.mo2742() - (((this.f432 - 1) - c1316.f4760) * this.f437);
                    iMo2746 = iMo2739 - this.f435.mo2738(view);
                }
                if (this.f436 == 1) {
                    AbstractC2491.m4463(view, iMo2746, iMo2738, iMo2739, iM277);
                } else {
                    AbstractC2491.m4463(view, iMo2738, iMo2746, iM277, iMo2739);
                }
                if (c2804.f8944) {
                    m291(c1758.f5876, i10);
                } else {
                    m293(c1316, c1758.f5876, i10);
                }
                c2499 = c2498;
                m285(c2499, c1758);
                if (!c1758.f5879 && view.hasFocusable()) {
                    if (c2804.f8944) {
                        this.f441.clear();
                    } else {
                        this.f441.set(c1316.f4760, false);
                    }
                }
                i9 = 1;
                z2 = true;
                i8 = 0;
            } else {
                i2 = 1;
            }
            if (c1757.f5876 == 1) {
                if (c2804.f8944) {
                    while (i4 >= 0) {
                        this.f433[i4].m3026(view);
                    }
                } else {
                    c2804.f8943.m3026(view);
                }
            } else if (c2804.f8944) {
                while (i3 >= 0) {
                    this.f433[i3].m3039(view);
                }
            } else {
                c2804.f8943.m3039(view);
            }
            if (m280()) {
                if (c2804.f8944) {
                    iMo2746 = this.f435.mo2746();
                } else {
                    iMo2746 = this.f435.mo2746() + (c1316.f4760 * this.f437);
                }
                iMo2739 = this.f435.mo2738(view) + iMo2746;
            } else {
                if (c2804.f8944) {
                    iMo2746 = this.f435.mo2746();
                } else {
                    iMo2746 = this.f435.mo2746() + (c1316.f4760 * this.f437);
                }
                iMo2739 = this.f435.mo2738(view) + iMo2746;
            }
            if (this.f436 == 1) {
                AbstractC2491.m4463(view, iMo2746, iMo2738, iMo2739, iM277);
            } else {
                AbstractC2491.m4463(view, iMo2738, iMo2746, iM277, iMo2739);
            }
            if (c2804.f8944) {
                m291(c1758.f5876, i10);
            } else {
                m293(c1316, c1758.f5876, i10);
            }
            c2499 = c2498;
            m285(c2499, c1758);
            if (!c1758.f5879) {
            }
            i9 = 1;
            z2 = true;
            i8 = 0;
        }
        if (!z2) {
            m285(c2499, c1758);
        }
        int iMo2748 = c1758.f5876 == -1 ? this.f434.mo2746() - m277(this.f434.mo2746()) : m276(this.f434.mo2742()) - this.f434.mo2742();
        if (iMo2748 > 0) {
            return Math.min(c1757.f5873, iMo2748);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᲀᤞ, reason: contains not printable characters */
    public final View m270(boolean z) {
        int iMo2746 = this.f434.mo2746();
        int iMo2742 = this.f434.mo2742();
        View view = null;
        for (int iM4467 = m4467() - 1; iM4467 >= 0; iM4467--) {
            View viewM4466 = m4466(iM4467);
            int iMo2740 = this.f434.mo2740(viewM4466);
            int iMo2737 = this.f434.mo2737(viewM4466);
            if (iMo2737 > iMo2746 && iMo2740 < iMo2742) {
                if (iMo2737 <= iMo2742 || !z) {
                    return viewM4466;
                }
                if (view == null) {
                    view = viewM4466;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲀᲁ, reason: contains not printable characters */
    public final View m271(boolean z) {
        int iMo2746 = this.f434.mo2746();
        int iMo2742 = this.f434.mo2742();
        int iM4467 = m4467();
        View view = null;
        for (int i = 0; i < iM4467; i++) {
            View viewM4466 = m4466(i);
            int iMo2740 = this.f434.mo2740(viewM4466);
            if (this.f434.mo2737(viewM4466) > iMo2746 && iMo2740 < iMo2742) {
                if (iMo2740 >= iMo2746 || !z) {
                    return viewM4466;
                }
                if (view == null) {
                    view = viewM4466;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲁᲀ, reason: contains not printable characters */
    public final void m272(C2498 c2498, C2504 c2504, boolean z) {
        int iMo2742;
        int iM276 = m276(-2147483648);
        if (iM276 != -2147483648 && (iMo2742 = this.f434.mo2742() - iM276) > 0) {
            int i = iMo2742 - (-m289(-iMo2742, c2498, c2504));
            if (!z || i <= 0) {
                return;
            }
            this.f434.mo2750(i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᤞᲁ, reason: contains not printable characters */
    public final void m273(C2498 c2498, C2504 c2504, boolean z) {
        int iMo2746;
        int iM277 = m277(2147483647);
        if (iM277 != 2147483647 && (iMo2746 = iM277 - this.f434.mo2746()) > 0) {
            int iM289 = iMo2746 - m289(iMo2746, c2498, c2504);
            if (!z || iM289 <= 0) {
                return;
            }
            this.f434.mo2750(-iM289);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᲁᤞ, reason: contains not printable characters */
    public final int m274() {
        if (m4467() == 0) {
            return 0;
        }
        return AbstractC2491.m4460(m4466(0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᤞᲀ, reason: contains not printable characters */
    public final int m275() {
        int iM4467 = m4467();
        if (iM4467 == 0) {
            return 0;
        }
        return AbstractC2491.m4460(m4466(iM4467 - 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᲀᤞ, reason: contains not printable characters */
    public final int m276(int i) {
        int iM3034 = this.f433[0].m3034(i);
        for (int i2 = 1; i2 < this.f432; i2++) {
            int iM3035 = this.f433[i2].m3034(i);
            if (iM3035 > iM3034) {
                iM3034 = iM3035;
            }
        }
        return iM3034;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
    public final int m277(int i) {
        int iM3036 = this.f433[0].m3036(i);
        for (int i2 = 1; i2 < this.f432; i2++) {
            int iM3037 = this.f433[i2].m3036(i);
            if (iM3037 < iM3036) {
                iM3036 = iM3037;
            }
        }
        return iM3036;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ, reason: contains not printable characters */
    public final void m278(int i, int i2, int i3) {
        int i4;
        int i5;
        C0542 c0542;
        int iM275;
        int iM276 = this.f440 ? m275() : m274();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c0542 = this.f444;
            c0542.m1895(i5);
            if (true) {
                c0542.m1897(i, i2);
            } else if (i3 != 2) {
                c0542.m1898(i, i2);
            } else if (i3 == 8) {
                c0542.m1898(i, 1);
                c0542.m1897(i2, 1);
            }
            if (i4 <= iM276) {
                return;
            }
            if (this.f440) {
                iM275 = m274();
            } else {
                iM275 = m275();
            }
            if (i5 <= iM275) {
                m4480();
            }
        }
        i4 = i + i2;
        i5 = i;
        c0542 = this.f444;
        c0542.m1895(i5);
        if (i3 != 1) {
            c0542.m1897(i, i2);
        } else if (true) {
            c0542.m1898(i, i2);
        } else if (i3 == 8) {
            c0542.m1898(i, 1);
            c0542.m1897(i2, 1);
        }
        if (i4 <= iM276) {
            return;
        }
        if (this.f440) {
            iM275 = m274();
        } else {
            iM275 = m275();
        }
        if (i5 <= iM275) {
            m4480();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲀᲇ, reason: contains not printable characters */
    public final View m279() {
        int i;
        View viewM4466;
        int iMo2740;
        int iMo2741;
        boolean z;
        boolean z2;
        boolean z3;
        int iMo2737;
        int iMo2738;
        boolean z4;
        boolean z5;
        int iM4467 = m4467();
        int i2 = iM4467 - 1;
        BitSet bitSet = new BitSet(this.f432);
        bitSet.set(0, this.f432, true);
        byte b = (this.f436 == 1 && m280()) ? (byte) 1 : (byte) -1;
        if (this.f440) {
            iM4467 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM4467 ? 1 : -1;
        while (i2 != iM4467) {
            View viewM4467 = m4466(i2);
            C2804 c2804 = (C2804) viewM4467.getLayoutParams();
            if (bitSet.get(c2804.f8943.f4760)) {
                C1316 c1316 = c2804.f8943;
                if (this.f440) {
                    int i4 = c1316.f4758;
                    if (i4 == -2147483648) {
                        c1316.m3027();
                        i4 = c1316.f4758;
                    }
                    if (i4 < this.f434.mo2742()) {
                        ArrayList arrayList = (ArrayList) c1316.f4761;
                        z4 = ((C2804) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f8944;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                } else {
                    int i5 = c1316.f4757;
                    if (i5 == -2147483648) {
                        c1316.m3028();
                        i5 = c1316.f4757;
                    }
                    if (i5 > this.f434.mo2746()) {
                        z4 = ((C2804) ((View) ((ArrayList) c1316.f4761).get(0)).getLayoutParams()).f8944;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                }
                if (!z5) {
                    bitSet.clear(c2804.f8943.f4760);
                    if (!c2804.f8944 && (i = i2 + i3) != iM4467) {
                        viewM4466 = m4466(i);
                        if (this.f440) {
                            iMo2737 = this.f434.mo2737(viewM4467);
                            iMo2738 = this.f434.mo2737(viewM4466);
                            if (iMo2737 >= iMo2738) {
                                if (iMo2737 == iMo2738) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c2804.f8943.f4760 - ((C2804) viewM4466.getLayoutParams()).f8943.f4760 < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (b < 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 != z3) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            iMo2740 = this.f434.mo2740(viewM4467);
                            iMo2741 = this.f434.mo2740(viewM4466);
                            if (iMo2740 <= iMo2741) {
                                if (iMo2740 == iMo2741) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c2804.f8943.f4760 - ((C2804) viewM4466.getLayoutParams()).f8943.f4760 < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (b < 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 != z3) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2 += i3;
                }
            } else {
                if (!c2804.f8944) {
                    viewM4466 = m4466(i);
                    if (this.f440) {
                        iMo2737 = this.f434.mo2737(viewM4467);
                        iMo2738 = this.f434.mo2737(viewM4466);
                        if (iMo2737 >= iMo2738) {
                            if (iMo2737 == iMo2738) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c2804.f8943.f4760 - ((C2804) viewM4466.getLayoutParams()).f8943.f4760 < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo2740 = this.f434.mo2740(viewM4467);
                        iMo2741 = this.f434.mo2740(viewM4466);
                        if (iMo2740 <= iMo2741) {
                            if (iMo2740 == iMo2741) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c2804.f8943.f4760 - ((C2804) viewM4466.getLayoutParams()).f8943.f4760 < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2 += i3;
            }
            return viewM4467;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
    public final boolean m280() {
        return this.f7942.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲀᲁ, reason: contains not printable characters */
    public final void m281(View view, int i, int i2) {
        RecyclerView recyclerView = this.f7942;
        Rect rect = this.f450;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m233(view));
        }
        C2804 c2804 = (C2804) view.getLayoutParams();
        int iM262 = m262(i, ((ViewGroup.MarginLayoutParams) c2804).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c2804).rightMargin + rect.right);
        int iM263 = m262(i2, ((ViewGroup.MarginLayoutParams) c2804).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c2804).bottomMargin + rect.bottom);
        if (m4485(view, iM262, iM263, c2804)) {
            view.measure(iM262, iM263);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:262:0x042f  */
    /* JADX WARN: Code duplicated, block: B:273:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01fc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲁᲀ, reason: contains not printable characters */
    public final void m282(C2498 c2498, C2504 c2504, boolean z) {
        boolean z2;
        C2806 c2806;
        int iM4467;
        int i;
        int iM4460;
        int iM4461;
        int iM4468;
        int i2;
        boolean z3;
        C2806 c2807 = this.f448;
        C2803 c2803 = this.f451;
        if (!(c2807 == null && this.f442 == -1) && c2504.m4505() == 0) {
            m4475(c2498);
            c2803.m4781();
            return;
        }
        boolean z4 = c2803.f8940;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c2803.f8942;
        boolean z5 = (z4 && this.f442 == -1 && this.f448 == null) ? false : true;
        C0542 c0542 = this.f444;
        if (z5) {
            c2803.m4781();
            C2806 c2808 = this.f448;
            if (c2808 != null) {
                int i3 = c2808.f8951;
                if (i3 > 0) {
                    if (i3 == this.f432) {
                        for (int i4 = 0; i4 < this.f432; i4++) {
                            this.f433[i4].m3029();
                            C2806 c2809 = this.f448;
                            int iMo2742 = c2809.f8952[i4];
                            if (iMo2742 != -2147483648) {
                                iMo2742 += c2809.f8957 ? this.f434.mo2742() : this.f434.mo2746();
                            }
                            C1316 c1316 = this.f433[i4];
                            c1316.f4757 = iMo2742;
                            c1316.f4758 = iMo2742;
                        }
                    } else {
                        c2808.f8952 = null;
                        c2808.f8951 = 0;
                        c2808.f8953 = 0;
                        c2808.f8954 = null;
                        c2808.f8955 = null;
                        c2808.f8949 = c2808.f8950;
                    }
                }
                C2806 c28010 = this.f448;
                this.f447 = c28010.f8958;
                boolean z6 = c28010.f8956;
                mo151(null);
                C2806 c28011 = this.f448;
                if (c28011 != null && c28011.f8956 != z6) {
                    c28011.f8956 = z6;
                }
                this.f439 = z6;
                m4480();
                m288();
                C2806 c28012 = this.f448;
                int i5 = c28012.f8949;
                if (i5 != -1) {
                    this.f442 = i5;
                    c2803.f8938 = c28012.f8957;
                } else {
                    c2803.f8938 = this.f440;
                }
                if (c28012.f8953 > 1) {
                    c0542.f2252 = c28012.f8954;
                    c0542.f2253 = c28012.f8955;
                }
            } else {
                m288();
                c2803.f8938 = this.f440;
            }
            if (c2504.f7990 || (i2 = this.f442) == -1) {
                if (this.f446) {
                    int iM4505 = c2504.m4505();
                    iM4468 = m4467() - 1;
                    while (true) {
                        if (iM4468 < 0) {
                            iM4461 = 0;
                            break;
                        }
                        iM4461 = AbstractC2491.m4460(m4466(iM4468));
                        if (iM4461 < 0 && iM4461 < iM4505) {
                            break;
                        } else {
                            iM4468--;
                        }
                    }
                } else {
                    int iM4506 = c2504.m4505();
                    iM4467 = m4467();
                    i = 0;
                    while (true) {
                        if (i >= iM4467) {
                            iM4461 = 0;
                            break;
                        }
                        iM4460 = AbstractC2491.m4460(m4466(i));
                        if (iM4460 < 0 && iM4460 < iM4506) {
                            iM4461 = iM4460;
                            break;
                        }
                        i++;
                    }
                }
                c2803.f8936 = iM4461;
                c2803.f8937 = -2147483648;
            } else if (i2 < 0 || i2 >= c2504.m4505()) {
                this.f442 = -1;
                this.f443 = -2147483648;
                if (this.f446) {
                    int iM4507 = c2504.m4505();
                    iM4468 = m4467() - 1;
                    while (true) {
                        if (iM4468 < 0) {
                            iM4461 = 0;
                            break;
                        } else {
                            iM4461 = AbstractC2491.m4460(m4466(iM4468));
                            if (iM4461 < 0) {
                            }
                            iM4468--;
                        }
                    }
                } else {
                    int iM4508 = c2504.m4505();
                    iM4467 = m4467();
                    i = 0;
                    while (true) {
                        if (i >= iM4467) {
                            iM4461 = 0;
                            break;
                        } else {
                            iM4460 = AbstractC2491.m4460(m4466(i));
                            if (iM4460 < 0) {
                            }
                            i++;
                        }
                    }
                }
                c2803.f8936 = 0;
                c2803.f8937 = -2147483648;
            } else {
                C2806 c28013 = this.f448;
                if (c28013 == null || c28013.f8949 == -1 || c28013.f8951 < 1) {
                    View viewMo158 = mo158(this.f442);
                    if (viewMo158 != null) {
                        c2803.f8936 = this.f440 ? m275() : m274();
                        if (this.f443 != -2147483648) {
                            if (c2803.f8938) {
                                c2803.f8937 = (this.f434.mo2742() - this.f443) - this.f434.mo2737(viewMo158);
                            } else {
                                c2803.f8937 = (this.f434.mo2746() + this.f443) - this.f434.mo2740(viewMo158);
                            }
                        } else if (this.f434.mo2738(viewMo158) > this.f434.mo2747()) {
                            c2803.f8937 = c2803.f8938 ? this.f434.mo2742() : this.f434.mo2746();
                        } else {
                            int iMo2740 = this.f434.mo2740(viewMo158) - this.f434.mo2746();
                            if (iMo2740 < 0) {
                                c2803.f8937 = -iMo2740;
                            } else {
                                int iMo2743 = this.f434.mo2742() - this.f434.mo2737(viewMo158);
                                if (iMo2743 < 0) {
                                    c2803.f8937 = iMo2743;
                                } else {
                                    c2803.f8937 = -2147483648;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f442;
                        c2803.f8936 = i6;
                        int i7 = this.f443;
                        if (i7 == -2147483648) {
                            if (m4467() != 0) {
                                if ((i6 < m274()) != this.f440) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f440) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c2803.f8938 = z3;
                            c2803.f8937 = z3 ? staggeredGridLayoutManager.f434.mo2742() : staggeredGridLayoutManager.f434.mo2746();
                        } else if (c2803.f8938) {
                            c2803.f8937 = staggeredGridLayoutManager.f434.mo2742() - i7;
                        } else {
                            c2803.f8937 = staggeredGridLayoutManager.f434.mo2746() + i7;
                        }
                        c2803.f8939 = true;
                    }
                } else {
                    c2803.f8937 = -2147483648;
                    c2803.f8936 = this.f442;
                }
            }
            c2803.f8940 = true;
        }
        if (this.f448 == null && this.f442 == -1 && (c2803.f8938 != this.f446 || m280() != this.f447)) {
            c0542.m1884();
            c2803.f8939 = true;
        }
        if (m4467() > 0 && ((c2806 = this.f448) == null || c2806.f8951 < 1)) {
            if (c2803.f8939) {
                for (int i8 = 0; i8 < this.f432; i8++) {
                    this.f433[i8].m3029();
                    int i9 = c2803.f8937;
                    if (i9 != -2147483648) {
                        C1316 c1317 = this.f433[i8];
                        c1317.f4757 = i9;
                        c1317.f4758 = i9;
                    }
                }
            } else if (z5 || c2803.f8941 == null) {
                for (int i10 = 0; i10 < this.f432; i10++) {
                    C1316 c1318 = this.f433[i10];
                    boolean z7 = this.f440;
                    int i11 = c2803.f8937;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c1318.f4762;
                    int iM3034 = z7 ? c1318.m3034(-2147483648) : c1318.m3036(-2147483648);
                    c1318.m3029();
                    if (iM3034 != -2147483648 && ((!z7 || iM3034 >= staggeredGridLayoutManager2.f434.mo2742()) && (z7 || iM3034 <= staggeredGridLayoutManager2.f434.mo2746()))) {
                        if (i11 != -2147483648) {
                            iM3034 += i11;
                        }
                        c1318.f4758 = iM3034;
                        c1318.f4757 = iM3034;
                    }
                }
                C1316[] c1316Arr = this.f433;
                int length = c1316Arr.length;
                int[] iArr = c2803.f8941;
                if (iArr == null || iArr.length < length) {
                    c2803.f8941 = new int[staggeredGridLayoutManager.f433.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c2803.f8941[i12] = c1316Arr[i12].m3036(-2147483648);
                }
            } else {
                for (int i13 = 0; i13 < this.f432; i13++) {
                    C1316 c1319 = this.f433[i13];
                    c1319.m3029();
                    int i14 = c2803.f8941[i13];
                    c1319.f4757 = i14;
                    c1319.f4758 = i14;
                }
            }
        }
        m4465(c2498);
        C1757 c1757 = this.f438;
        c1757.f5872 = false;
        this.f452 = false;
        int iMo2747 = this.f435.mo2747();
        this.f437 = iMo2747 / this.f432;
        this.f449 = View.MeasureSpec.makeMeasureSpec(iMo2747, this.f435.mo2744());
        m292(c2803.f8936, c2504);
        if (c2803.f8938) {
            m290(-1);
            m269(c2498, c1757, c2504);
            m290(1);
            c1757.f5874 = c2803.f8936 + c1757.f5875;
            m269(c2498, c1757, c2504);
        } else {
            m290(1);
            m269(c2498, c1757, c2504);
            m290(-1);
            c1757.f5874 = c2803.f8936 + c1757.f5875;
            m269(c2498, c1757, c2504);
        }
        if (this.f435.mo2744() != 1073741824) {
            int iM4469 = m4467();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM4469; i15++) {
                View viewM4466 = m4466(i15);
                float fMo2738 = this.f435.mo2738(viewM4466);
                if (fMo2738 >= fMax) {
                    if (((C2804) viewM4466.getLayoutParams()).f8944) {
                        fMo2738 = (fMo2738 * 1.0f) / this.f432;
                    }
                    fMax = Math.max(fMax, fMo2738);
                }
            }
            int i16 = this.f437;
            int iRound = Math.round(fMax * this.f432);
            if (this.f435.mo2744() == -2147483648) {
                iRound = Math.min(iRound, this.f435.mo2747());
            }
            this.f437 = iRound / this.f432;
            this.f449 = View.MeasureSpec.makeMeasureSpec(iRound, this.f435.mo2744());
            if (this.f437 != i16) {
                for (int i17 = 0; i17 < iM4469; i17++) {
                    View viewM4467 = m4466(i17);
                    C2804 c2804 = (C2804) viewM4467.getLayoutParams();
                    if (!c2804.f8944) {
                        if (m280() && this.f436 == 1) {
                            int i18 = -((this.f432 - 1) - c2804.f8943.f4760);
                            viewM4467.offsetLeftAndRight((this.f437 * i18) - (i18 * i16));
                        } else {
                            int i19 = c2804.f8943.f4760;
                            int i20 = this.f437 * i19;
                            int i21 = i19 * i16;
                            if (this.f436 == 1) {
                                viewM4467.offsetLeftAndRight(i20 - i21);
                            } else {
                                viewM4467.offsetTopAndBottom(i20 - i21);
                            }
                        }
                    }
                }
            }
        }
        if (m4467() > 0) {
            if (this.f440) {
                m272(c2498, c2504, true);
                m273(c2498, c2504, false);
            } else {
                m273(c2498, c2504, true);
                m272(c2498, c2504, false);
            }
        }
        if (z && !c2504.f7990 && this.f445 != 0 && m4467() > 0 && (this.f452 || m279() != null)) {
            RecyclerView recyclerView = this.f7942;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f455);
            }
            z2 = m267();
        }
        if (c2504.f7990) {
            c2803.m4781();
        }
        this.f446 = c2803.f8938;
        this.f447 = m280();
        if (z2) {
            c2803.m4781();
            m282(c2498, c2504, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲁᲇ, reason: contains not printable characters */
    public final boolean m283(int i) {
        if (this.f436 == 0) {
            return (i == -1) != this.f440;
        }
        return ((i == -1) == this.f440) == m280();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲇᲁ, reason: contains not printable characters */
    public final void m284(int i, C2504 c2504) {
        int iM274;
        int i2;
        if (i > 0) {
            iM274 = m275();
            i2 = 1;
        } else {
            iM274 = m274();
            i2 = -1;
        }
        C1757 c1757 = this.f438;
        c1757.f5872 = true;
        m292(iM274, c2504);
        m290(i2);
        c1757.f5874 = iM274 + c1757.f5875;
        c1757.f5873 = Math.abs(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᤞᲇ, reason: contains not printable characters */
    public final void m285(C2498 c2498, C1757 c1757) {
        int iMin;
        if (!c1757.f5872 || c1757.f5880) {
            return;
        }
        if (c1757.f5873 == 0) {
            if (c1757.f5876 == -1) {
                m286(c1757.f5878, c2498);
                return;
            } else {
                m287(c1757.f5877, c2498);
                return;
            }
        }
        int i = 1;
        if (c1757.f5876 == -1) {
            int i2 = c1757.f5877;
            int iM3036 = this.f433[0].m3036(i2);
            while (i < this.f432) {
                int iM3037 = this.f433[i].m3036(i2);
                if (iM3037 > iM3036) {
                    iM3036 = iM3037;
                }
                i++;
            }
            int i3 = i2 - iM3036;
            m286(i3 < 0 ? c1757.f5878 : c1757.f5878 - Math.min(i3, c1757.f5873), c2498);
            return;
        }
        int i4 = c1757.f5878;
        int iM3034 = this.f433[0].m3034(i4);
        while (i < this.f432) {
            int iM3035 = this.f433[i].m3034(i4);
            if (iM3035 < iM3034) {
                iM3034 = iM3035;
            }
            i++;
        }
        int i5 = iM3034 - c1757.f5878;
        if (i5 < 0) {
            iMin = c1757.f5877;
        } else {
            iMin = Math.min(i5, c1757.f5873) + c1757.f5877;
        }
        m287(iMin, c2498);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ, reason: contains not printable characters */
    public final void m286(int i, C2498 c2498) {
        for (int iM4467 = m4467() - 1; iM4467 >= 0; iM4467--) {
            View viewM4466 = m4466(iM4467);
            if (this.f434.mo2740(viewM4466) < i || this.f434.mo2749(viewM4466) < i) {
                return;
            }
            C2804 c2804 = (C2804) viewM4466.getLayoutParams();
            if (c2804.f8944) {
                for (int i2 = 0; i2 < this.f432; i2++) {
                    if (((ArrayList) this.f433[i2].f4761).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f432; i3++) {
                    this.f433[i3].m3037();
                }
            } else if (((ArrayList) c2804.f8943.f4761).size() == 1) {
                return;
            } else {
                c2804.f8943.m3037();
            }
            m4477(viewM4466, c2498);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ, reason: contains not printable characters */
    public final void m287(int i, C2498 c2498) {
        while (m4467() > 0) {
            View viewM4466 = m4466(0);
            if (this.f434.mo2737(viewM4466) > i || this.f434.mo2748(viewM4466) > i) {
                return;
            }
            C2804 c2804 = (C2804) viewM4466.getLayoutParams();
            if (c2804.f8944) {
                for (int i2 = 0; i2 < this.f432; i2++) {
                    if (((ArrayList) this.f433[i2].f4761).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f432; i3++) {
                    this.f433[i3].m3038();
                }
            } else if (((ArrayList) c2804.f8943.f4761).size() == 1) {
                return;
            } else {
                c2804.f8943.m3038();
            }
            m4477(viewM4466, c2498);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᲁᤞ, reason: contains not printable characters */
    public final void m288() {
        if (this.f436 == 1 || !m280()) {
            this.f440 = this.f439;
        } else {
            this.f440 = !this.f439;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲀᲇ, reason: contains not printable characters */
    public final int m289(int i, C2498 c2498, C2504 c2504) {
        if (m4467() == 0 || i == 0) {
            return 0;
        }
        m284(i, c2504);
        C1757 c1757 = this.f438;
        int iM269 = m269(c2498, c1757, c2504);
        if (c1757.f5873 >= iM269) {
            i = i < 0 ? -iM269 : iM269;
        }
        this.f434.mo2750(-i);
        this.f446 = this.f440;
        c1757.f5873 = 0;
        m285(c2498, c1757);
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲇᲀ, reason: contains not printable characters */
    public final void m290(int i) {
        C1757 c1757 = this.f438;
        c1757.f5876 = i;
        c1757.f5875 = this.f440 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᤞᲇ, reason: contains not printable characters */
    public final void m291(int i, int i2) {
        for (int i3 = 0; i3 < this.f432; i3++) {
            if (!((ArrayList) this.f433[i3].f4761).isEmpty()) {
                m293(this.f433[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
    public final void m292(int i, C2504 c2504) {
        int iMo2747;
        int iMo2748;
        int i2;
        C1757 c1757 = this.f438;
        boolean z = false;
        c1757.f5873 = 0;
        c1757.f5874 = i;
        C1790 c1790 = this.f7945;
        if (c1790 == null || !c1790.f5956 || (i2 = c2504.f7984) == -1) {
            iMo2747 = 0;
            iMo2748 = 0;
        } else {
            if (this.f440 == (i2 < i)) {
                iMo2747 = this.f434.mo2747();
                iMo2748 = 0;
            } else {
                iMo2748 = this.f434.mo2747();
                iMo2747 = 0;
            }
        }
        RecyclerView recyclerView = this.f7942;
        if (recyclerView == null || !recyclerView.f363) {
            c1757.f5878 = this.f434.mo2741() + iMo2747;
            c1757.f5877 = -iMo2748;
        } else {
            c1757.f5877 = this.f434.mo2746() - iMo2748;
            c1757.f5878 = this.f434.mo2742() + iMo2747;
        }
        c1757.f5879 = false;
        c1757.f5872 = true;
        if (this.f434.mo2744() == 0 && this.f434.mo2741() == 0) {
            z = true;
        }
        c1757.f5880 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
    public final void m293(C1316 c1316, int i, int i2) {
        int i3 = c1316.f4759;
        int i4 = c1316.f4760;
        if (i == -1) {
            int i5 = c1316.f4757;
            if (i5 == -2147483648) {
                c1316.m3028();
                i5 = c1316.f4757;
            }
            if (i5 + i3 <= i2) {
                this.f441.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1316.f4758;
        if (i6 == -2147483648) {
            c1316.m3027();
            i6 = c1316.f4758;
        }
        if (i6 - i3 >= i2) {
            this.f441.set(i4, false);
        }
    }
}
