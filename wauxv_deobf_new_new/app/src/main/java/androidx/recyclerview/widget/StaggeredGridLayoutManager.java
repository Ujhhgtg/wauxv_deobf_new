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
import p000.AbstractC1144;
import p000.AbstractC1586;
import p000.AbstractC2537;
import p000.AbstractC2546;
import p000.AbstractC3638;
import p000.C0099;
import p000.C0100;
import p000.C0519;
import p000.C1317;
import p000.C1447;
import p000.C1779;
import p000.C1813;
import p000.C2545;
import p000.C2547;
import p000.C2553;
import p000.C2559;
import p000.C2862;
import p000.C2863;
import p000.C2864;
import p000.C2865;
import p000.InterfaceC2558;
import p000.RunnableC0149;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2546 implements InterfaceC2558 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C1317[] f433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final AbstractC1144 f434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final AbstractC1144 f435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C1779 f438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final BitSet f441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C0519 f444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean f447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public C2865 f448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final Rect f450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final C2862 f451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean f453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int[] f454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final RunnableC0149 f455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f440 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f442 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f443 = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f432 = -1;
        this.f439 = false;
        C0519 c0519 = new C0519(29, false);
        this.f444 = c0519;
        this.f445 = 2;
        this.f450 = new Rect();
        this.f451 = new C2862(this);
        this.f452 = false;
        this.f453 = true;
        this.f455 = new RunnableC0149(this, 15);
        C2545 c2545M4483 = AbstractC2546.m4483(context, attributeSet, i, i2);
        int i3 = c2545M4483.f8088;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo151(null);
        if (i3 != this.f436) {
            this.f436 = i3;
            AbstractC1144 abstractC1144 = this.f434;
            this.f434 = this.f435;
            this.f435 = abstractC1144;
            m4501();
        }
        int i4 = c2545M4483.f8089;
        mo151(null);
        if (i4 != this.f432) {
            c0519.m1978();
            m4501();
            this.f432 = i4;
            this.f441 = new BitSet(this.f432);
            this.f433 = new C1317[this.f432];
            for (int i5 = 0; i5 < this.f432; i5++) {
                this.f433[i5] = new C1317(this, i5);
            }
            m4501();
        }
        boolean z = c2545M4483.f8090;
        mo151(null);
        C2865 c2865 = this.f448;
        if (c2865 != null && c2865.f9117 != z) {
            c2865.f9117 = z;
        }
        this.f439 = z;
        m4501();
        C1779 c1779 = new C1779();
        c1779.f5925 = true;
        c1779.f5930 = 0;
        c1779.f5931 = 0;
        this.f438 = c1779;
        this.f434 = AbstractC1144.m2880(this, this.f436);
        this.f435 = AbstractC1144.m2880(this, 1 - this.f436);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
    public static int m262(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // p000.InterfaceC2558
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final PointF mo150(int i) {
        int i2 = -1;
        if (m4489() != 0) {
            if ((i < m274()) == this.f440) {
                i2 = 1;
            }
        } else if (this.f440) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
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

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo151(String str) {
        if (this.f448 == null) {
            super.mo151(str);
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo152() {
        return this.f436 == 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo153() {
        return this.f436 == 1;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo107(C2547 c2547) {
        return c2547 instanceof C2863;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo154(int i, int i2, C2559 c2559, C1447 c1447) {
        C1779 c1779;
        int iM3137;
        int iM3139;
        if (this.f436 != 0) {
            i = i2;
        }
        if (m4489() == 0 || i == 0) {
            return;
        }
        m284(i, c2559);
        int[] iArr = this.f454;
        if (iArr == null || iArr.length < this.f432) {
            this.f454 = new int[this.f432];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f432;
            c1779 = this.f438;
            if (i3 >= i5) {
                break;
            }
            if (c1779.f5928 == -1) {
                iM3137 = c1779.f5930;
                iM3139 = this.f433[i3].m3139(iM3137);
            } else {
                iM3137 = this.f433[i3].m3137(c1779.f5931);
                iM3139 = c1779.f5931;
            }
            int i6 = iM3137 - iM3139;
            if (i6 >= 0) {
                this.f454[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f454, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c1779.f5927;
            if (i8 < 0 || i8 >= c2559.m4527()) {
                return;
            }
            c1447.m3241(c1779.f5927, this.f454[i7]);
            c1779.f5927 += c1779.f5928;
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final int mo156(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1586.m3471(c2559, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo108(C2559 c2559) {
        return m268(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final int mo109(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1586.m3473(c2559, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo157(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1586.m3471(c2559, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo110(C2559 c2559) {
        return m268(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final int mo111(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1586.m3473(c2559, this.f434, m271(z), m270(z), this, this.f453);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final C2547 mo112() {
        return this.f436 == 0 ? new C2863(-2, -1) : new C2863(-1, -2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final C2547 mo113(Context context, AttributeSet attributeSet) {
        return new C2863(context, attributeSet);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final C2547 mo114(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2863((ViewGroup.MarginLayoutParams) layoutParams) : new C2863(layoutParams);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final int mo115(C2553 c2553, C2559 c2559) {
        if (this.f436 == 1) {
            return Math.min(this.f432, c2559.m4527());
        }
        return -1;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final int mo116(C2553 c2553, C2559 c2559) {
        if (this.f436 == 0) {
            return Math.min(this.f432, c2559.m4527());
        }
        return -1;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final boolean mo159() {
        return this.f445 != 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public final boolean mo160() {
        return this.f439;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void mo263(int i) {
        super.mo263(i);
        for (int i2 = 0; i2 < this.f432; i2++) {
            C1317 c1317 = this.f433[i2];
            int i3 = c1317.f4756;
            if (i3 != Integer.MIN_VALUE) {
                c1317.f4756 = i3 + i;
            }
            int i4 = c1317.f4757;
            if (i4 != Integer.MIN_VALUE) {
                c1317.f4757 = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void mo264(int i) {
        super.mo264(i);
        for (int i2 = 0; i2 < this.f432; i2++) {
            C1317 c1317 = this.f433[i2];
            int i3 = c1317.f4756;
            if (i3 != Integer.MIN_VALUE) {
                c1317.f4756 = i3 + i;
            }
            int i4 = c1317.f4757;
            if (i4 != Integer.MIN_VALUE) {
                c1317.f4757 = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final void mo265(AbstractC2537 abstractC2537) {
        this.f444.m1978();
        for (int i = 0; i < this.f432; i++) {
            this.f433[i].m3132();
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8093;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f455);
        }
        for (int i = 0; i < this.f432; i++) {
            this.f433[i].m3132();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final View mo117(View view, int i, C2553 c2553, C2559 c2559) {
        View viewM225;
        int i2;
        View viewM3138;
        if (m4489() != 0) {
            RecyclerView recyclerView = this.f8093;
            if (recyclerView == null || (viewM225 = recyclerView.m225(view)) == null || ((ArrayList) this.f8092.f2307).contains(viewM225)) {
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
                            i2 = Integer.MIN_VALUE;
                        } else if (this.f436 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
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
                if (i2 != Integer.MIN_VALUE) {
                    C2863 c2863 = (C2863) viewM225.getLayoutParams();
                    boolean z = c2863.f9105;
                    C1317 c1317 = c2863.f9104;
                    int iM275 = i2 == 1 ? m275() : m274();
                    m292(iM275, c2559);
                    m290(i2);
                    C1779 c1779 = this.f438;
                    c1779.f5927 = c1779.f5928 + iM275;
                    c1779.f5926 = (int) (this.f434.mo2891() * 0.33333334f);
                    c1779.f5932 = true;
                    c1779.f5925 = false;
                    m269(c2553, c1779, c2559);
                    this.f446 = this.f440;
                    if (!z && (viewM3138 = c1317.m3138(iM275, i2)) != null && viewM3138 != viewM225) {
                        return viewM3138;
                    }
                    if (m283(i2)) {
                        for (int i3 = this.f432 - 1; i3 >= 0; i3--) {
                            View viewM3139 = this.f433[i3].m3138(iM275, i2);
                            if (viewM3139 != null && viewM3139 != viewM225) {
                                return viewM3139;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.f432; i4++) {
                            View viewM31310 = this.f433[i4].m3138(iM275, i2);
                            if (viewM31310 != null && viewM31310 != viewM225) {
                                return viewM31310;
                            }
                        }
                    }
                    boolean z2 = (this.f439 ^ true) == (i2 == -1);
                    if (!z) {
                        View viewMo158 = mo158(z2 ? c1317.m3133() : c1317.m3134());
                        if (viewMo158 != null && viewMo158 != viewM225) {
                            return viewMo158;
                        }
                    }
                    if (m283(i2)) {
                        for (int i5 = this.f432 - 1; i5 >= 0; i5--) {
                            if (i5 != c1317.f4759) {
                                View viewMo159 = mo158(z2 ? this.f433[i5].m3133() : this.f433[i5].m3134());
                                if (viewMo159 != null && viewMo159 != viewM225) {
                                    return viewMo159;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f432; i6++) {
                            View viewMo1510 = mo158(z2 ? this.f433[i6].m3133() : this.f433[i6].m3134());
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

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4489() > 0) {
            View viewM271 = m271(false);
            View viewM270 = m270(false);
            if (viewM271 == null || viewM270 == null) {
                return;
            }
            int iM4482 = AbstractC2546.m4482(viewM271);
            int iM4483 = AbstractC2546.m4482(viewM270);
            if (iM4482 < iM4483) {
                accessibilityEvent.setFromIndex(iM4482);
                accessibilityEvent.setToIndex(iM4483);
            } else {
                accessibilityEvent.setFromIndex(iM4483);
                accessibilityEvent.setToIndex(iM4482);
            }
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public final void mo118(C2553 c2553, C2559 c2559, C0100 c0100) {
        super.mo118(c2553, c2559, c0100);
        c0100.m1241("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public final void mo119(C2553 c2553, C2559 c2559, View view, C0100 c0100) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2863)) {
            m4496(view, c0100);
            return;
        }
        C2863 c2863 = (C2863) layoutParams;
        if (this.f436 == 0) {
            C1317 c1317 = c2863.f9104;
            c0100.m1242(C0099.m1231(c1317 == null ? -1 : c1317.f4759, c2863.f9105 ? this.f432 : 1, -1, -1, false));
        } else {
            C1317 c1318 = c2863.f9104;
            c0100.m1242(C0099.m1231(-1, -1, c1318 == null ? -1 : c1318.f4759, c2863.f9105 ? this.f432 : 1, false));
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ */
    public final void mo120(int i, int i2) {
        m278(i, i2, 1);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ */
    public final void mo121() {
        this.f444.m1978();
        m4501();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ */
    public final void mo122(int i, int i2) {
        m278(i, i2, 8);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ */
    public final void mo123(int i, int i2) {
        m278(i, i2, 2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ */
    public final void mo124(int i, int i2) {
        m278(i, i2, 4);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public final void mo125(C2553 c2553, C2559 c2559) {
        m282(c2553, c2559, true);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public final void mo126(C2559 c2559) {
        this.f442 = -1;
        this.f443 = Integer.MIN_VALUE;
        this.f448 = null;
        this.f451.m4814();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ */
    public final void mo163(Parcelable parcelable) {
        if (parcelable instanceof C2865) {
            C2865 c2865 = (C2865) parcelable;
            this.f448 = c2865;
            if (this.f442 != -1) {
                c2865.f9110 = -1;
                c2865.f9111 = -1;
                c2865.f9113 = null;
                c2865.f9112 = 0;
                c2865.f9114 = 0;
                c2865.f9115 = null;
                c2865.f9116 = null;
            }
            m4501();
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ */
    public final Parcelable mo164() {
        int iM3139;
        int iMo2890;
        int[] iArr;
        C2865 c2865 = this.f448;
        if (c2865 != null) {
            C2865 c2866 = new C2865();
            c2866.f9112 = c2865.f9112;
            c2866.f9110 = c2865.f9110;
            c2866.f9111 = c2865.f9111;
            c2866.f9113 = c2865.f9113;
            c2866.f9114 = c2865.f9114;
            c2866.f9115 = c2865.f9115;
            c2866.f9117 = c2865.f9117;
            c2866.f9118 = c2865.f9118;
            c2866.f9119 = c2865.f9119;
            c2866.f9116 = c2865.f9116;
            return c2866;
        }
        C2865 c2867 = new C2865();
        c2867.f9117 = this.f439;
        c2867.f9118 = this.f446;
        c2867.f9119 = this.f447;
        C0519 c0519 = this.f444;
        if (c0519 == null || (iArr = (int[]) c0519.f2208) == null) {
            c2867.f9114 = 0;
        } else {
            c2867.f9115 = iArr;
            c2867.f9114 = iArr.length;
            c2867.f9116 = (ArrayList) c0519.f2209;
        }
        if (m4489() <= 0) {
            c2867.f9110 = -1;
            c2867.f9111 = -1;
            c2867.f9112 = 0;
            return c2867;
        }
        c2867.f9110 = this.f446 ? m275() : m274();
        View viewM270 = this.f440 ? m270(true) : m271(true);
        c2867.f9111 = viewM270 != null ? AbstractC2546.m4482(viewM270) : -1;
        int i = this.f432;
        c2867.f9112 = i;
        c2867.f9113 = new int[i];
        for (int i2 = 0; i2 < this.f432; i2++) {
            if (this.f446) {
                iM3139 = this.f433[i2].m3137(Integer.MIN_VALUE);
                if (iM3139 != Integer.MIN_VALUE) {
                    iMo2890 = this.f434.mo2886();
                    iM3139 -= iMo2890;
                }
            } else {
                iM3139 = this.f433[i2].m3139(Integer.MIN_VALUE);
                if (iM3139 != Integer.MIN_VALUE) {
                    iMo2890 = this.f434.mo2890();
                    iM3139 -= iMo2890;
                }
            }
            c2867.f9113[i2] = iM3139;
        }
        return c2867;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final void mo266(int i) {
        if (i == 0) {
            m267();
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ */
    public final int mo128(int i, C2553 c2553, C2559 c2559) {
        return m289(i, c2553, c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public final void mo165(int i) {
        C2865 c2865 = this.f448;
        if (c2865 != null && c2865.f9110 != i) {
            c2865.f9113 = null;
            c2865.f9112 = 0;
            c2865.f9110 = -1;
            c2865.f9111 = -1;
        }
        this.f442 = i;
        this.f443 = Integer.MIN_VALUE;
        m4501();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public final int mo129(int i, C2553 c2553, C2559 c2559) {
        return m289(i, c2553, c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ */
    public final void mo130(Rect rect, int i, int i2) {
        int iM4474;
        int iM4475;
        int iM4493 = m4493() + m4492();
        int iM4491 = m4491() + m4494();
        int i3 = this.f436;
        int i4 = this.f432;
        if (i3 == 1) {
            int iHeight = rect.height() + iM4491;
            RecyclerView recyclerView = this.f8093;
            Field field = AbstractC3638.f11333;
            iM4475 = AbstractC2546.m4474(i2, iHeight, recyclerView.getMinimumHeight());
            iM4474 = AbstractC2546.m4474(i, (this.f437 * i4) + iM4493, this.f8093.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4493;
            RecyclerView recyclerView2 = this.f8093;
            Field field2 = AbstractC3638.f11333;
            iM4474 = AbstractC2546.m4474(i, iWidth, recyclerView2.getMinimumWidth());
            iM4475 = AbstractC2546.m4474(i2, (this.f437 * i4) + iM4491, this.f8093.getMinimumHeight());
        }
        this.f8093.setMeasuredDimension(iM4474, iM4475);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ */
    public final void mo167(RecyclerView recyclerView, C2559 c2559, int i) {
        C1813 c1813 = new C1813(recyclerView.getContext());
        c1813.f6008 = i;
        m4508(c1813);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ */
    public final boolean mo131() {
        return this.f448 == null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public final boolean m267() {
        int iM274;
        int iM275;
        if (m4489() != 0 && this.f445 != 0 && this.f8098) {
            if (this.f440) {
                iM274 = m275();
                iM275 = m274();
            } else {
                iM274 = m274();
                iM275 = m275();
            }
            C0519 c0519 = this.f444;
            if (iM274 == 0 && m279() != null) {
                c0519.m1978();
                this.f8097 = true;
                m4501();
                return true;
            }
            if (this.f452) {
                int i = this.f440 ? -1 : 1;
                int i2 = iM275 + 1;
                C2864 c2864M1982 = c0519.m1982(iM274, i2, i);
                if (c2864M1982 == null) {
                    this.f452 = false;
                    c0519.m1980(i2);
                    return false;
                }
                C2864 c2864M1983 = c0519.m1982(iM274, c2864M1982.f9106, i * (-1));
                if (c2864M1983 == null) {
                    c0519.m1980(c2864M1982.f9106);
                } else {
                    c0519.m1980(c2864M1983.f9106 + 1);
                }
                this.f8097 = true;
                m4501();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public final int m268(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        boolean z = !this.f453;
        return AbstractC1586.m3472(c2559, this.f434, m271(z), m270(z), this, this.f453, this.f440);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public final int m269(C2553 c2553, C1779 c1779, C2559 c2559) {
        C1317 c1317;
        int i;
        int iM277;
        int iMo2882;
        int i2;
        int i3;
        int iMo2890;
        int iMo2883;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        C2553 c2554 = c2553;
        int i8 = 0;
        int i9 = 1;
        this.f441.set(0, this.f432, true);
        C1779 c17710 = this.f438;
        int i10 = c17710.f5933 ? c1779.f5929 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1779.f5929 == 1 ? c1779.f5931 + c1779.f5926 : c1779.f5930 - c1779.f5926;
        m291(c1779.f5929, i10);
        int iMo2886 = this.f440 ? this.f434.mo2886() : this.f434.mo2890();
        boolean z2 = false;
        while (true) {
            int i11 = c1779.f5927;
            if (i11 < 0 || i11 >= c2559.m4527() || (!c17710.f5933 && this.f441.isEmpty())) {
                break;
            }
            View view = c2554.m4521(c1779.f5927, Long.MAX_VALUE).f8157;
            c1779.f5927 += c1779.f5928;
            C2863 c2863 = (C2863) view.getLayoutParams();
            int iM4534 = c2863.f8107.m4534();
            C0519 c0519 = this.f444;
            int[] iArr = (int[]) c0519.f2208;
            int i12 = (iArr == null || iM4534 >= iArr.length) ? -1 : iArr[iM4534];
            int i13 = i12 == -1 ? i9 : i8;
            if (i13 != 0) {
                if (c2863.f9105) {
                    c1317 = this.f433[i8];
                } else {
                    if (m283(c1779.f5929)) {
                        i7 = this.f432 - i9;
                        i6 = -1;
                        i5 = -1;
                    } else {
                        i5 = i9;
                        i6 = this.f432;
                        i7 = i8;
                    }
                    C1317 c1318 = null;
                    if (c1779.f5929 == i9) {
                        int iMo2891 = this.f434.mo2890();
                        int i14 = Integer.MAX_VALUE;
                        while (i7 != i6) {
                            C1317 c1319 = this.f433[i7];
                            int i15 = i7;
                            int iM3137 = c1319.m3137(iMo2891);
                            if (iM3137 < i14) {
                                c1318 = c1319;
                                i14 = iM3137;
                            }
                            i7 = i15 + i5;
                        }
                    } else {
                        int iMo2887 = this.f434.mo2886();
                        int i16 = Integer.MIN_VALUE;
                        while (i7 != i6) {
                            C1317 c13110 = this.f433[i7];
                            int i17 = i7;
                            int iM3139 = c13110.m3139(iMo2887);
                            if (iM3139 > i16) {
                                i16 = iM3139;
                                c1318 = c13110;
                            }
                            i7 = i17 + i5;
                        }
                    }
                    c1317 = c1318;
                }
                c0519.m1979(iM4534);
                ((int[]) c0519.f2208)[iM4534] = c1317.f4759;
            } else {
                c1317 = this.f433[i12];
            }
            c2863.f9104 = c1317;
            if (c1779.f5929 == 1) {
                m4486(view, -1, false);
            } else {
                m4486(view, 0, false);
            }
            if (!c2863.f9105) {
                i = i13;
                if (this.f436 == 1) {
                    m281(view, AbstractC2546.m4475(this.f437, this.f8103, 0, ((ViewGroup.MarginLayoutParams) c2863).width, false), AbstractC2546.m4475(this.f8106, this.f8104, m4491() + m4494(), ((ViewGroup.MarginLayoutParams) c2863).height, true));
                } else {
                    m281(view, AbstractC2546.m4475(this.f8105, this.f8103, m4493() + m4492(), ((ViewGroup.MarginLayoutParams) c2863).width, true), AbstractC2546.m4475(this.f437, this.f8104, 0, ((ViewGroup.MarginLayoutParams) c2863).height, false));
                }
            } else if (this.f436 == 1) {
                i = i13;
                m281(view, this.f449, AbstractC2546.m4475(this.f8106, this.f8104, m4491() + m4494(), ((ViewGroup.MarginLayoutParams) c2863).height, true));
            } else {
                i = i13;
                m281(view, AbstractC2546.m4475(this.f8105, this.f8103, m4493() + m4492(), ((ViewGroup.MarginLayoutParams) c2863).width, true), this.f449);
            }
            if (c1779.f5929 == 1) {
                iMo2882 = c2863.f9105 ? m276(iMo2886) : c1317.m3137(iMo2886);
                iM277 = this.f434.mo2882(view) + iMo2882;
                if (i != 0 && c2863.f9105) {
                    C2864 c2864 = new C2864();
                    c2864.f9108 = new int[this.f432];
                    for (int i18 = 0; i18 < this.f432; i18++) {
                        c2864.f9108[i18] = iMo2882 - this.f433[i18].m3137(iMo2882);
                    }
                    c2864.f9107 = -1;
                    c2864.f9106 = iM4534;
                    c0519.m1975(c2864);
                }
            } else {
                iM277 = c2863.f9105 ? m277(iMo2886) : c1317.m3139(iMo2886);
                iMo2882 = iM277 - this.f434.mo2882(view);
                if (i != 0 && c2863.f9105) {
                    C2864 c2865 = new C2864();
                    c2865.f9108 = new int[this.f432];
                    for (int i19 = 0; i19 < this.f432; i19++) {
                        c2865.f9108[i19] = this.f433[i19].m3139(iM277) - iM277;
                    }
                    c2865.f9107 = 1;
                    c2865.f9106 = iM4534;
                    c0519.m1975(c2865);
                }
            }
            if (c2863.f9105 && c1779.f5928 == -1) {
                if (i != 0) {
                    i2 = 1;
                    this.f452 = true;
                } else {
                    if (c1779.f5929 != 1) {
                        int iM31310 = this.f433[0].m3139(Integer.MIN_VALUE);
                        int i20 = 1;
                        while (true) {
                            if (i20 >= this.f432) {
                                z = true;
                                break;
                            }
                            if (this.f433[i20].m3139(Integer.MIN_VALUE) != iM31310) {
                                z = false;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        int iM3138 = this.f433[0].m3137(Integer.MIN_VALUE);
                        int i21 = 1;
                        while (true) {
                            if (i21 >= this.f432) {
                                z = true;
                                break;
                            }
                            if (this.f433[i21].m3137(Integer.MIN_VALUE) != iM3138) {
                                z = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    i2 = 1;
                    if (!z) {
                        C2864 c2864M1983 = c0519.m1983(iM4534);
                        if (c2864M1983 != null) {
                            c2864M1983.f9109 = true;
                        }
                        this.f452 = true;
                    }
                }
                if (c1779.f5929 == i2) {
                    if (c2863.f9105) {
                        for (i4 = this.f432 - i2; i4 >= 0; i4--) {
                            this.f433[i4].m3129(view);
                        }
                    } else {
                        c2863.f9104.m3129(view);
                    }
                } else if (c2863.f9105) {
                    for (i3 = this.f432 - 1; i3 >= 0; i3--) {
                        this.f433[i3].m3142(view);
                    }
                } else {
                    c2863.f9104.m3142(view);
                }
                if (m280() || this.f436 != 1) {
                    if (c2863.f9105) {
                        iMo2890 = this.f435.mo2890();
                    } else {
                        iMo2890 = this.f435.mo2890() + (c1317.f4759 * this.f437);
                    }
                    iMo2883 = this.f435.mo2882(view) + iMo2890;
                } else {
                    iMo2883 = c2863.f9105 ? this.f435.mo2886() : this.f435.mo2886() - (((this.f432 - 1) - c1317.f4759) * this.f437);
                    iMo2890 = iMo2883 - this.f435.mo2882(view);
                }
                if (this.f436 == 1) {
                    AbstractC2546.m4485(view, iMo2890, iMo2882, iMo2883, iM277);
                } else {
                    AbstractC2546.m4485(view, iMo2882, iMo2890, iM277, iMo2883);
                }
                if (c2863.f9105) {
                    m291(c17710.f5929, i10);
                } else {
                    m293(c1317, c17710.f5929, i10);
                }
                c2554 = c2553;
                m285(c2554, c17710);
                if (!c17710.f5932 && view.hasFocusable()) {
                    if (c2863.f9105) {
                        this.f441.clear();
                    } else {
                        this.f441.set(c1317.f4759, false);
                    }
                }
                i9 = 1;
                z2 = true;
                i8 = 0;
            } else {
                i2 = 1;
            }
            if (c1779.f5929 == i2) {
                if (c2863.f9105) {
                    while (i4 >= 0) {
                        this.f433[i4].m3129(view);
                    }
                } else {
                    c2863.f9104.m3129(view);
                }
            } else if (c2863.f9105) {
                while (i3 >= 0) {
                    this.f433[i3].m3142(view);
                }
            } else {
                c2863.f9104.m3142(view);
            }
            if (m280()) {
                if (c2863.f9105) {
                    iMo2890 = this.f435.mo2890();
                } else {
                    iMo2890 = this.f435.mo2890() + (c1317.f4759 * this.f437);
                }
                iMo2883 = this.f435.mo2882(view) + iMo2890;
            } else {
                if (c2863.f9105) {
                    iMo2890 = this.f435.mo2890();
                } else {
                    iMo2890 = this.f435.mo2890() + (c1317.f4759 * this.f437);
                }
                iMo2883 = this.f435.mo2882(view) + iMo2890;
            }
            if (this.f436 == 1) {
                AbstractC2546.m4485(view, iMo2890, iMo2882, iMo2883, iM277);
            } else {
                AbstractC2546.m4485(view, iMo2882, iMo2890, iM277, iMo2883);
            }
            if (c2863.f9105) {
                m291(c17710.f5929, i10);
            } else {
                m293(c1317, c17710.f5929, i10);
            }
            c2554 = c2553;
            m285(c2554, c17710);
            if (!c17710.f5932) {
            }
            i9 = 1;
            z2 = true;
            i8 = 0;
        }
        if (!z2) {
            m285(c2554, c17710);
        }
        int iMo2892 = c17710.f5929 == -1 ? this.f434.mo2890() - m277(this.f434.mo2890()) : m276(this.f434.mo2886()) - this.f434.mo2886();
        if (iMo2892 > 0) {
            return Math.min(c1779.f5926, iMo2892);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᤞᲀ, reason: contains not printable characters */
    public final View m270(boolean z) {
        int iMo2890 = this.f434.mo2890();
        int iMo2886 = this.f434.mo2886();
        View view = null;
        for (int iM4489 = m4489() - 1; iM4489 >= 0; iM4489--) {
            View viewM4488 = m4488(iM4489);
            int iMo2884 = this.f434.mo2884(viewM4488);
            int iMo2881 = this.f434.mo2881(viewM4488);
            if (iMo2881 > iMo2890 && iMo2884 < iMo2886) {
                if (iMo2881 <= iMo2886 || !z) {
                    return viewM4488;
                }
                if (view == null) {
                    view = viewM4488;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᲀᤞ, reason: contains not printable characters */
    public final View m271(boolean z) {
        int iMo2890 = this.f434.mo2890();
        int iMo2886 = this.f434.mo2886();
        int iM4489 = m4489();
        View view = null;
        for (int i = 0; i < iM4489; i++) {
            View viewM4488 = m4488(i);
            int iMo2884 = this.f434.mo2884(viewM4488);
            if (this.f434.mo2881(viewM4488) > iMo2890 && iMo2884 < iMo2886) {
                if (iMo2884 >= iMo2890 || !z) {
                    return viewM4488;
                }
                if (view == null) {
                    view = viewM4488;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲀᲁ, reason: contains not printable characters */
    public final void m272(C2553 c2553, C2559 c2559, boolean z) {
        int iMo2886;
        int iM276 = m276(Integer.MIN_VALUE);
        if (iM276 != Integer.MIN_VALUE && (iMo2886 = this.f434.mo2886() - iM276) > 0) {
            int i = iMo2886 - (-m289(-iMo2886, c2553, c2559));
            if (!z || i <= 0) {
                return;
            }
            this.f434.mo2894(i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲁᲀ, reason: contains not printable characters */
    public final void m273(C2553 c2553, C2559 c2559, boolean z) {
        int iMo2890;
        int iM277 = m277(Integer.MAX_VALUE);
        if (iM277 != Integer.MAX_VALUE && (iMo2890 = iM277 - this.f434.mo2890()) > 0) {
            int iM289 = iMo2890 - m289(iMo2890, c2553, c2559);
            if (!z || iM289 <= 0) {
                return;
            }
            this.f434.mo2894(-iM289);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᤞᲁ, reason: contains not printable characters */
    public final int m274() {
        if (m4489() == 0) {
            return 0;
        }
        return AbstractC2546.m4482(m4488(0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᲁᤞ, reason: contains not printable characters */
    public final int m275() {
        int iM4489 = m4489();
        if (iM4489 == 0) {
            return 0;
        }
        return AbstractC2546.m4482(m4488(iM4489 - 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᤞᲀ, reason: contains not printable characters */
    public final int m276(int i) {
        int iM3137 = this.f433[0].m3137(i);
        for (int i2 = 1; i2 < this.f432; i2++) {
            int iM3138 = this.f433[i2].m3137(i);
            if (iM3138 > iM3137) {
                iM3137 = iM3138;
            }
        }
        return iM3137;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᲀᤞ, reason: contains not printable characters */
    public final int m277(int i) {
        int iM3139 = this.f433[0].m3139(i);
        for (int i2 = 1; i2 < this.f432; i2++) {
            int iM31310 = this.f433[i2].m3139(i);
            if (iM31310 < iM3139) {
                iM3139 = iM31310;
            }
        }
        return iM3139;
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
    public final void m278(int i, int i2, int i3) {
        int i4;
        int i5;
        C0519 c0519;
        int iM275;
        int iM276 = this.f440 ? m275() : m274();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c0519 = this.f444;
            c0519.m1989(i5);
            if (i3 != 1) {
                c0519.m1991(i, i2);
            } else if (i3 != 2) {
                c0519.m1992(i, i2);
            } else if (i3 == 8) {
                c0519.m1992(i, 1);
                c0519.m1991(i2, 1);
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
                m4501();
            }
        }
        i4 = i + i2;
        i5 = i;
        c0519 = this.f444;
        c0519.m1989(i5);
        if (i3 != 1) {
            c0519.m1991(i, i2);
        } else if (i3 != 2) {
            c0519.m1992(i, i2);
        } else if (i3 == 8) {
            c0519.m1992(i, 1);
            c0519.m1991(i2, 1);
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
            m4501();
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ, reason: contains not printable characters */
    public final View m279() {
        int i;
        View viewM4488;
        int iMo2884;
        int iMo2885;
        boolean z;
        boolean z2;
        boolean z3;
        int iMo2881;
        int iMo2882;
        boolean z4;
        boolean z5;
        int iM4489 = m4489();
        int i2 = iM4489 - 1;
        BitSet bitSet = new BitSet(this.f432);
        bitSet.set(0, this.f432, true);
        byte b = (this.f436 == 1 && m280()) ? (byte) 1 : (byte) -1;
        if (this.f440) {
            iM4489 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM4489 ? 1 : -1;
        while (i2 != iM4489) {
            View viewM4489 = m4488(i2);
            C2863 c2863 = (C2863) viewM4489.getLayoutParams();
            if (bitSet.get(c2863.f9104.f4759)) {
                C1317 c1317 = c2863.f9104;
                if (this.f440) {
                    int i4 = c1317.f4757;
                    if (i4 == Integer.MIN_VALUE) {
                        c1317.m3130();
                        i4 = c1317.f4757;
                    }
                    if (i4 < this.f434.mo2886()) {
                        ArrayList arrayList = (ArrayList) c1317.f4760;
                        z4 = ((C2863) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f9105;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                } else {
                    int i5 = c1317.f4756;
                    if (i5 == Integer.MIN_VALUE) {
                        c1317.m3131();
                        i5 = c1317.f4756;
                    }
                    if (i5 > this.f434.mo2890()) {
                        z4 = ((C2863) ((View) ((ArrayList) c1317.f4760).get(0)).getLayoutParams()).f9105;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                }
                if (!z5) {
                    bitSet.clear(c2863.f9104.f4759);
                    if (!c2863.f9105 && (i = i2 + i3) != iM4489) {
                        viewM4488 = m4488(i);
                        if (this.f440) {
                            iMo2881 = this.f434.mo2881(viewM4489);
                            iMo2882 = this.f434.mo2881(viewM4488);
                            if (iMo2881 >= iMo2882) {
                                if (iMo2881 == iMo2882) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c2863.f9104.f4759 - ((C2863) viewM4488.getLayoutParams()).f9104.f4759 < 0) {
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
                            iMo2884 = this.f434.mo2884(viewM4489);
                            iMo2885 = this.f434.mo2884(viewM4488);
                            if (iMo2884 <= iMo2885) {
                                if (iMo2884 == iMo2885) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c2863.f9104.f4759 - ((C2863) viewM4488.getLayoutParams()).f9104.f4759 < 0) {
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
                if (!c2863.f9105) {
                    viewM4488 = m4488(i);
                    if (this.f440) {
                        iMo2881 = this.f434.mo2881(viewM4489);
                        iMo2882 = this.f434.mo2881(viewM4488);
                        if (iMo2881 >= iMo2882) {
                            if (iMo2881 == iMo2882) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c2863.f9104.f4759 - ((C2863) viewM4488.getLayoutParams()).f9104.f4759 < 0) {
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
                        iMo2884 = this.f434.mo2884(viewM4489);
                        iMo2885 = this.f434.mo2884(viewM4488);
                        if (iMo2884 <= iMo2885) {
                            if (iMo2884 == iMo2885) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c2863.f9104.f4759 - ((C2863) viewM4488.getLayoutParams()).f9104.f4759 < 0) {
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
            return viewM4489;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲀᲇ, reason: contains not printable characters */
    public final boolean m280() {
        return this.f8093.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
    public final void m281(View view, int i, int i2) {
        RecyclerView recyclerView = this.f8093;
        Rect rect = this.f450;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m233(view));
        }
        C2863 c2863 = (C2863) view.getLayoutParams();
        int iM262 = m262(i, ((ViewGroup.MarginLayoutParams) c2863).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c2863).rightMargin + rect.right);
        int iM263 = m262(i2, ((ViewGroup.MarginLayoutParams) c2863).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c2863).bottomMargin + rect.bottom);
        if (m4506(view, iM262, iM263, c2863)) {
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲀᲁ, reason: contains not printable characters */
    public final void m282(C2553 c2553, C2559 c2559, boolean z) {
        boolean z2;
        C2865 c2865;
        int iM4489;
        int i;
        int iM4482;
        int iM4483;
        int iM44810;
        int i2;
        boolean z3;
        C2865 c2866 = this.f448;
        C2862 c2862 = this.f451;
        if (!(c2866 == null && this.f442 == -1) && c2559.m4527() == 0) {
            m4497(c2553);
            c2862.m4814();
            return;
        }
        boolean z4 = c2862.f9101;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c2862.f9103;
        boolean z5 = (z4 && this.f442 == -1 && this.f448 == null) ? false : true;
        C0519 c0519 = this.f444;
        if (z5) {
            c2862.m4814();
            C2865 c2867 = this.f448;
            if (c2867 != null) {
                int i3 = c2867.f9112;
                if (i3 > 0) {
                    if (i3 == this.f432) {
                        for (int i4 = 0; i4 < this.f432; i4++) {
                            this.f433[i4].m3132();
                            C2865 c2868 = this.f448;
                            int iMo2886 = c2868.f9113[i4];
                            if (iMo2886 != Integer.MIN_VALUE) {
                                iMo2886 += c2868.f9118 ? this.f434.mo2886() : this.f434.mo2890();
                            }
                            C1317 c1317 = this.f433[i4];
                            c1317.f4756 = iMo2886;
                            c1317.f4757 = iMo2886;
                        }
                    } else {
                        c2867.f9113 = null;
                        c2867.f9112 = 0;
                        c2867.f9114 = 0;
                        c2867.f9115 = null;
                        c2867.f9116 = null;
                        c2867.f9110 = c2867.f9111;
                    }
                }
                C2865 c2869 = this.f448;
                this.f447 = c2869.f9119;
                boolean z6 = c2869.f9117;
                mo151(null);
                C2865 c28610 = this.f448;
                if (c28610 != null && c28610.f9117 != z6) {
                    c28610.f9117 = z6;
                }
                this.f439 = z6;
                m4501();
                m288();
                C2865 c28611 = this.f448;
                int i5 = c28611.f9110;
                if (i5 != -1) {
                    this.f442 = i5;
                    c2862.f9099 = c28611.f9118;
                } else {
                    c2862.f9099 = this.f440;
                }
                if (c28611.f9114 > 1) {
                    c0519.f2208 = c28611.f9115;
                    c0519.f2209 = c28611.f9116;
                }
            } else {
                m288();
                c2862.f9099 = this.f440;
            }
            if (c2559.f8141 || (i2 = this.f442) == -1) {
                if (this.f446) {
                    int iM4527 = c2559.m4527();
                    iM44810 = m4489() - 1;
                    while (true) {
                        if (iM44810 < 0) {
                            iM4483 = 0;
                            break;
                        }
                        iM4483 = AbstractC2546.m4482(m4488(iM44810));
                        if (iM4483 < 0 && iM4483 < iM4527) {
                            break;
                        } else {
                            iM44810--;
                        }
                    }
                } else {
                    int iM4528 = c2559.m4527();
                    iM4489 = m4489();
                    i = 0;
                    while (true) {
                        if (i >= iM4489) {
                            iM4483 = 0;
                            break;
                        }
                        iM4482 = AbstractC2546.m4482(m4488(i));
                        if (iM4482 < 0 && iM4482 < iM4528) {
                            iM4483 = iM4482;
                            break;
                        }
                        i++;
                    }
                }
                c2862.f9097 = iM4483;
                c2862.f9098 = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c2559.m4527()) {
                this.f442 = -1;
                this.f443 = Integer.MIN_VALUE;
                if (this.f446) {
                    int iM4529 = c2559.m4527();
                    iM44810 = m4489() - 1;
                    while (true) {
                        if (iM44810 < 0) {
                            iM4483 = 0;
                            break;
                        } else {
                            iM4483 = AbstractC2546.m4482(m4488(iM44810));
                            if (iM4483 < 0) {
                            }
                            iM44810--;
                        }
                    }
                } else {
                    int iM45210 = c2559.m4527();
                    iM4489 = m4489();
                    i = 0;
                    while (true) {
                        if (i >= iM4489) {
                            iM4483 = 0;
                            break;
                        } else {
                            iM4482 = AbstractC2546.m4482(m4488(i));
                            if (iM4482 < 0) {
                            }
                            i++;
                        }
                    }
                }
                c2862.f9097 = iM4483;
                c2862.f9098 = Integer.MIN_VALUE;
            } else {
                C2865 c28612 = this.f448;
                if (c28612 == null || c28612.f9110 == -1 || c28612.f9112 < 1) {
                    View viewMo158 = mo158(this.f442);
                    if (viewMo158 != null) {
                        c2862.f9097 = this.f440 ? m275() : m274();
                        if (this.f443 != Integer.MIN_VALUE) {
                            if (c2862.f9099) {
                                c2862.f9098 = (this.f434.mo2886() - this.f443) - this.f434.mo2881(viewMo158);
                            } else {
                                c2862.f9098 = (this.f434.mo2890() + this.f443) - this.f434.mo2884(viewMo158);
                            }
                        } else if (this.f434.mo2882(viewMo158) > this.f434.mo2891()) {
                            c2862.f9098 = c2862.f9099 ? this.f434.mo2886() : this.f434.mo2890();
                        } else {
                            int iMo2884 = this.f434.mo2884(viewMo158) - this.f434.mo2890();
                            if (iMo2884 < 0) {
                                c2862.f9098 = -iMo2884;
                            } else {
                                int iMo2887 = this.f434.mo2886() - this.f434.mo2881(viewMo158);
                                if (iMo2887 < 0) {
                                    c2862.f9098 = iMo2887;
                                } else {
                                    c2862.f9098 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f442;
                        c2862.f9097 = i6;
                        int i7 = this.f443;
                        if (i7 == Integer.MIN_VALUE) {
                            if (m4489() != 0) {
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
                            c2862.f9099 = z3;
                            c2862.f9098 = z3 ? staggeredGridLayoutManager.f434.mo2886() : staggeredGridLayoutManager.f434.mo2890();
                        } else if (c2862.f9099) {
                            c2862.f9098 = staggeredGridLayoutManager.f434.mo2886() - i7;
                        } else {
                            c2862.f9098 = staggeredGridLayoutManager.f434.mo2890() + i7;
                        }
                        c2862.f9100 = true;
                    }
                } else {
                    c2862.f9098 = Integer.MIN_VALUE;
                    c2862.f9097 = this.f442;
                }
            }
            c2862.f9101 = true;
        }
        if (this.f448 == null && this.f442 == -1 && (c2862.f9099 != this.f446 || m280() != this.f447)) {
            c0519.m1978();
            c2862.f9100 = true;
        }
        if (m4489() > 0 && ((c2865 = this.f448) == null || c2865.f9112 < 1)) {
            if (c2862.f9100) {
                for (int i8 = 0; i8 < this.f432; i8++) {
                    this.f433[i8].m3132();
                    int i9 = c2862.f9098;
                    if (i9 != Integer.MIN_VALUE) {
                        C1317 c1318 = this.f433[i8];
                        c1318.f4756 = i9;
                        c1318.f4757 = i9;
                    }
                }
            } else if (z5 || c2862.f9102 == null) {
                for (int i10 = 0; i10 < this.f432; i10++) {
                    C1317 c1319 = this.f433[i10];
                    boolean z7 = this.f440;
                    int i11 = c2862.f9098;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c1319.f4761;
                    int iM3137 = z7 ? c1319.m3137(Integer.MIN_VALUE) : c1319.m3139(Integer.MIN_VALUE);
                    c1319.m3132();
                    if (iM3137 != Integer.MIN_VALUE && ((!z7 || iM3137 >= staggeredGridLayoutManager2.f434.mo2886()) && (z7 || iM3137 <= staggeredGridLayoutManager2.f434.mo2890()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM3137 += i11;
                        }
                        c1319.f4757 = iM3137;
                        c1319.f4756 = iM3137;
                    }
                }
                C1317[] c1317Arr = this.f433;
                int length = c1317Arr.length;
                int[] iArr = c2862.f9102;
                if (iArr == null || iArr.length < length) {
                    c2862.f9102 = new int[staggeredGridLayoutManager.f433.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c2862.f9102[i12] = c1317Arr[i12].m3139(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f432; i13++) {
                    C1317 c13110 = this.f433[i13];
                    c13110.m3132();
                    int i14 = c2862.f9102[i13];
                    c13110.f4756 = i14;
                    c13110.f4757 = i14;
                }
            }
        }
        m4487(c2553);
        C1779 c1779 = this.f438;
        c1779.f5925 = false;
        this.f452 = false;
        int iMo2891 = this.f435.mo2891();
        this.f437 = iMo2891 / this.f432;
        this.f449 = View.MeasureSpec.makeMeasureSpec(iMo2891, this.f435.mo2888());
        m292(c2862.f9097, c2559);
        if (c2862.f9099) {
            m290(-1);
            m269(c2553, c1779, c2559);
            m290(1);
            c1779.f5927 = c2862.f9097 + c1779.f5928;
            m269(c2553, c1779, c2559);
        } else {
            m290(1);
            m269(c2553, c1779, c2559);
            m290(-1);
            c1779.f5927 = c2862.f9097 + c1779.f5928;
            m269(c2553, c1779, c2559);
        }
        if (this.f435.mo2888() != 1073741824) {
            int iM44811 = m4489();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM44811; i15++) {
                View viewM4488 = m4488(i15);
                float fMo2882 = this.f435.mo2882(viewM4488);
                if (fMo2882 >= fMax) {
                    if (((C2863) viewM4488.getLayoutParams()).f9105) {
                        fMo2882 = (fMo2882 * 1.0f) / this.f432;
                    }
                    fMax = Math.max(fMax, fMo2882);
                }
            }
            int i16 = this.f437;
            int iRound = Math.round(fMax * this.f432);
            if (this.f435.mo2888() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f435.mo2891());
            }
            this.f437 = iRound / this.f432;
            this.f449 = View.MeasureSpec.makeMeasureSpec(iRound, this.f435.mo2888());
            if (this.f437 != i16) {
                for (int i17 = 0; i17 < iM44811; i17++) {
                    View viewM4489 = m4488(i17);
                    C2863 c2863 = (C2863) viewM4489.getLayoutParams();
                    if (!c2863.f9105) {
                        if (m280() && this.f436 == 1) {
                            int i18 = -((this.f432 - 1) - c2863.f9104.f4759);
                            viewM4489.offsetLeftAndRight((this.f437 * i18) - (i18 * i16));
                        } else {
                            int i19 = c2863.f9104.f4759;
                            int i20 = this.f437 * i19;
                            int i21 = i19 * i16;
                            if (this.f436 == 1) {
                                viewM4489.offsetLeftAndRight(i20 - i21);
                            } else {
                                viewM4489.offsetTopAndBottom(i20 - i21);
                            }
                        }
                    }
                }
            }
        }
        if (m4489() > 0) {
            if (this.f440) {
                m272(c2553, c2559, true);
                m273(c2553, c2559, false);
            } else {
                m273(c2553, c2559, true);
                m272(c2553, c2559, false);
            }
        }
        if (z && !c2559.f8141 && this.f445 != 0 && m4489() > 0 && (this.f452 || m279() != null)) {
            RecyclerView recyclerView = this.f8093;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f455);
            }
            z2 = m267();
        }
        if (c2559.f8141) {
            c2862.m4814();
        }
        this.f446 = c2862.f9099;
        this.f447 = m280();
        if (z2) {
            c2862.m4814();
            m282(c2553, c2559, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲁᲀ, reason: contains not printable characters */
    public final boolean m283(int i) {
        if (this.f436 == 0) {
            return (i == -1) != this.f440;
        }
        return ((i == -1) == this.f440) == m280();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲁᲇ, reason: contains not printable characters */
    public final void m284(int i, C2559 c2559) {
        int iM274;
        int i2;
        if (i > 0) {
            iM274 = m275();
            i2 = 1;
        } else {
            iM274 = m274();
            i2 = -1;
        }
        C1779 c1779 = this.f438;
        c1779.f5925 = true;
        m292(iM274, c2559);
        m290(i2);
        c1779.f5927 = iM274 + c1779.f5928;
        c1779.f5926 = Math.abs(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲇᲁ, reason: contains not printable characters */
    public final void m285(C2553 c2553, C1779 c1779) {
        int iMin;
        if (!c1779.f5925 || c1779.f5933) {
            return;
        }
        if (c1779.f5926 == 0) {
            if (c1779.f5929 == -1) {
                m286(c2553, c1779.f5931);
                return;
            } else {
                m287(c2553, c1779.f5930);
                return;
            }
        }
        int i = 1;
        if (c1779.f5929 == -1) {
            int i2 = c1779.f5930;
            int iM3139 = this.f433[0].m3139(i2);
            while (i < this.f432) {
                int iM31310 = this.f433[i].m3139(i2);
                if (iM31310 > iM3139) {
                    iM3139 = iM31310;
                }
                i++;
            }
            int i3 = i2 - iM3139;
            m286(c2553, i3 < 0 ? c1779.f5931 : c1779.f5931 - Math.min(i3, c1779.f5926));
            return;
        }
        int i4 = c1779.f5931;
        int iM3137 = this.f433[0].m3137(i4);
        while (i < this.f432) {
            int iM3138 = this.f433[i].m3137(i4);
            if (iM3138 < iM3137) {
                iM3137 = iM3138;
            }
            i++;
        }
        int i5 = iM3137 - c1779.f5931;
        if (i5 < 0) {
            iMin = c1779.f5930;
        } else {
            iMin = Math.min(i5, c1779.f5926) + c1779.f5930;
        }
        m287(c2553, iMin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᤞᲇ, reason: contains not printable characters */
    public final void m286(C2553 c2553, int i) {
        for (int iM4489 = m4489() - 1; iM4489 >= 0; iM4489--) {
            View viewM4488 = m4488(iM4489);
            if (this.f434.mo2884(viewM4488) < i || this.f434.mo2893(viewM4488) < i) {
                return;
            }
            C2863 c2863 = (C2863) viewM4488.getLayoutParams();
            if (c2863.f9105) {
                for (int i2 = 0; i2 < this.f432; i2++) {
                    if (((ArrayList) this.f433[i2].f4760).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f432; i3++) {
                    this.f433[i3].m3140();
                }
            } else if (((ArrayList) c2863.f9104.f4760).size() == 1) {
                return;
            } else {
                c2863.f9104.m3140();
            }
            m4499(viewM4488, c2553);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ, reason: contains not printable characters */
    public final void m287(C2553 c2553, int i) {
        while (m4489() > 0) {
            View viewM4488 = m4488(0);
            if (this.f434.mo2881(viewM4488) > i || this.f434.mo2892(viewM4488) > i) {
                return;
            }
            C2863 c2863 = (C2863) viewM4488.getLayoutParams();
            if (c2863.f9105) {
                for (int i2 = 0; i2 < this.f432; i2++) {
                    if (((ArrayList) this.f433[i2].f4760).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f432; i3++) {
                    this.f433[i3].m3141();
                }
            } else if (((ArrayList) c2863.f9104.f4760).size() == 1) {
                return;
            } else {
                c2863.f9104.m3141();
            }
            m4499(viewM4488, c2553);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ, reason: contains not printable characters */
    public final void m288() {
        if (this.f436 == 1 || !m280()) {
            this.f440 = this.f439;
        } else {
            this.f440 = !this.f439;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᲁᤞ, reason: contains not printable characters */
    public final int m289(int i, C2553 c2553, C2559 c2559) {
        if (m4489() == 0 || i == 0) {
            return 0;
        }
        m284(i, c2559);
        C1779 c1779 = this.f438;
        int iM269 = m269(c2553, c1779, c2559);
        if (c1779.f5926 >= iM269) {
            i = i < 0 ? -iM269 : iM269;
        }
        this.f434.mo2894(-i);
        this.f446 = this.f440;
        c1779.f5926 = 0;
        m285(c2553, c1779);
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲀᲇ, reason: contains not printable characters */
    public final void m290(int i) {
        C1779 c1779 = this.f438;
        c1779.f5929 = i;
        c1779.f5928 = this.f440 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲇᲀ, reason: contains not printable characters */
    public final void m291(int i, int i2) {
        for (int i3 = 0; i3 < this.f432; i3++) {
            if (!((ArrayList) this.f433[i3].f4760).isEmpty()) {
                m293(this.f433[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᤞᲇ, reason: contains not printable characters */
    public final void m292(int i, C2559 c2559) {
        int iMo2891;
        int iMo2892;
        int i2;
        C1779 c1779 = this.f438;
        boolean z = false;
        c1779.f5926 = 0;
        c1779.f5927 = i;
        C1813 c1813 = this.f8096;
        if (c1813 == null || !c1813.f6012 || (i2 = c2559.f8135) == -1) {
            iMo2891 = 0;
            iMo2892 = 0;
        } else {
            if (this.f440 == (i2 < i)) {
                iMo2891 = this.f434.mo2891();
                iMo2892 = 0;
            } else {
                iMo2892 = this.f434.mo2891();
                iMo2891 = 0;
            }
        }
        RecyclerView recyclerView = this.f8093;
        if (recyclerView == null || !recyclerView.f363) {
            c1779.f5931 = this.f434.mo2885() + iMo2891;
            c1779.f5930 = -iMo2892;
        } else {
            c1779.f5930 = this.f434.mo2890() - iMo2892;
            c1779.f5931 = this.f434.mo2886() + iMo2891;
        }
        c1779.f5932 = false;
        c1779.f5925 = true;
        if (this.f434.mo2888() == 0 && this.f434.mo2885() == 0) {
            z = true;
        }
        c1779.f5933 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
    public final void m293(C1317 c1317, int i, int i2) {
        int i3 = c1317.f4758;
        int i4 = c1317.f4759;
        if (i == -1) {
            int i5 = c1317.f4756;
            if (i5 == Integer.MIN_VALUE) {
                c1317.m3131();
                i5 = c1317.f4756;
            }
            if (i5 + i3 <= i2) {
                this.f441.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1317.f4757;
        if (i6 == Integer.MIN_VALUE) {
            c1317.m3130();
            i6 = c1317.f4757;
        }
        if (i6 - i3 >= i2) {
            this.f441.set(i4, false);
        }
    }
}
