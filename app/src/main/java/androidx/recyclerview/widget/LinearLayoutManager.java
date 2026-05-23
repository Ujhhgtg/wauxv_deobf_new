package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.r;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC1138;
import p000.AbstractC1194;
import p000.AbstractC1270;
import p000.AbstractC2482;
import p000.AbstractC2491;
import p000.AbstractC2508;
import p000.C0085;
import p000.C0092;
import p000.C1439;
import p000.C1786;
import p000.C1787;
import p000.C1788;
import p000.C1789;
import p000.C1790;
import p000.C2490;
import p000.C2492;
import p000.C2498;
import p000.C2504;
import p000.InterfaceC2503;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2491 implements InterfaceC2503 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C1788 f333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public AbstractC1138 f334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean f336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean f339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C1789 f342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C1786 f343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C1787 f344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final int[] f346;

    public LinearLayoutManager(int i) {
        this.f332 = 1;
        this.f336 = false;
        this.f337 = false;
        this.f338 = false;
        this.f339 = true;
        this.f340 = -1;
        this.f341 = Integer.MIN_VALUE;
        this.f342 = null;
        this.f343 = new C1786();
        this.f344 = new C1787();
        this.f345 = 2;
        this.f346 = new int[2];
        m191(i);
        mo151(null);
        if (this.f336) {
            this.f336 = false;
            m4480();
        }
    }

    @Override // p000.InterfaceC2503
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final PointF mo150(int i) {
        if (m4467() == 0) {
            return null;
        }
        int i2 = (i < AbstractC2491.m4460(m4466(0))) != this.f337 ? -1 : 1;
        return this.f332 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo151(String str) {
        if (this.f342 == null) {
            super.mo151(str);
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean mo152() {
        return this.f332 == 0;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean mo153() {
        return this.f332 == 1;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo154(int i, int i2, C2504 c2504, C1439 c1439) {
        if (this.f332 != 0) {
            i = i2;
        }
        if (m4467() == 0 || i == 0) {
            return;
        }
        m173();
        m192(i > 0 ? 1 : -1, Math.abs(i), true, c2504);
        mo132(c2504, this.f333, c1439);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo155(int i, C1439 c1439) {
        boolean z;
        int i2;
        C1789 c1789 = this.f342;
        if (c1789 == null || (i2 = c1789.f5949) < 0) {
            m188();
            z = this.f337;
            i2 = this.f340;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c1789.f5951;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f345 && i2 >= 0 && i2 < i; i4++) {
            c1439.m3134(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int mo156(C2504 c2504) {
        return m169(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo108(C2504 c2504) {
        return m170(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo109(C2504 c2504) {
        return m171(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int mo157(C2504 c2504) {
        return m169(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public int mo110(C2504 c2504) {
        return m170(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public int mo111(C2504 c2504) {
        return m171(c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final View mo158(int i) {
        int iM4467 = m4467();
        if (iM4467 == 0) {
            return null;
        }
        int iM4460 = i - AbstractC2491.m4460(m4466(0));
        if (iM4460 >= 0 && iM4460 < iM4467) {
            View viewM4466 = m4466(iM4460);
            if (AbstractC2491.m4460(viewM4466) == i) {
                return viewM4466;
            }
        }
        return super.mo158(i);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public C2492 mo112() {
        return new C2492(-2, -2);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final boolean mo159() {
        return true;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final boolean mo160() {
        return this.f336;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public View mo117(View view, int i, C2498 c2498, C2504 c2504) {
        int iM172;
        View viewM179;
        m188();
        if (m4467() != 0 && (iM172 = m172(i)) != Integer.MIN_VALUE) {
            m173();
            m192(iM172, (int) (this.f334.mo2747() * 0.33333334f), false, c2504);
            C1788 c1788 = this.f333;
            c1788.f5943 = Integer.MIN_VALUE;
            c1788.f5937 = false;
            m174(c2498, c1788, c2504, true);
            if (iM172 == -1) {
                viewM179 = this.f337 ? m179(m4467() - 1, -1) : m179(0, m4467());
            } else {
                viewM179 = this.f337 ? m179(0, m4467()) : m179(m4467() - 1, -1);
            }
            View viewM184 = iM172 == -1 ? m184() : m183();
            if (!viewM184.hasFocusable()) {
                return viewM179;
            }
            if (viewM179 != null) {
                return viewM184;
            }
        }
        return null;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4467() > 0) {
            accessibilityEvent.setFromIndex(mo177());
            accessibilityEvent.setToIndex(mo178());
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public void mo118(C2498 c2498, C2504 c2504, C0092 c0092) {
        super.mo118(c2498, c2504, c0092);
        AbstractC2482 abstractC2482 = this.f7942.f368;
        if (abstractC2482 == null || abstractC2482.mo2040() <= 0) {
            return;
        }
        c0092.m1089(C0085.f1033);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:135:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public void mo125(C2498 c2498, C2504 c2504) {
        View focusedChild;
        int iM4505;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo133;
        int iMo2740;
        int iMo2737;
        int iMo2746;
        int iMo2742;
        boolean z3;
        boolean z4;
        C2492 c2492;
        int i;
        int iMo2741;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iM181;
        int i6;
        View viewMo158;
        int iMo2743;
        int iMo2744;
        int i7;
        int i8 = -1;
        if (!(this.f342 == null && this.f340 == -1) && c2504.m4505() == 0) {
            m4475(c2498);
            return;
        }
        C1789 c1789 = this.f342;
        if (c1789 != null && (i7 = c1789.f5949) >= 0) {
            this.f340 = i7;
        }
        m173();
        this.f333.f5937 = false;
        m188();
        RecyclerView recyclerView2 = this.f7942;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f7941.f2345).contains(focusedChild)) {
            focusedChild = null;
        }
        C1786 c1786 = this.f343;
        if (!c1786.f5932 || this.f340 != -1 || this.f342 != null) {
            c1786.m3522();
            c1786.f5931 = this.f337 ^ this.f338;
            if (c2504.f7990 || (i = this.f340) == -1) {
                if (m4467() != 0) {
                    recyclerView = this.f7942;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f7941.f2345).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c2492 = (C2492) focusedChild2.getLayoutParams();
                        if (!c2492.f7956.m4518() || c2492.f7956.m4512() < 0 || c2492.f7956.m4512() >= c2504.m4505()) {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2 || (viewMo133 = mo133(c2498, c2504, c1786.f5931, z2)) == null) {
                                c1786.m3519();
                                if (this.f338) {
                                    iM4505 = c2504.m4505() - 1;
                                } else {
                                    iM4505 = 0;
                                }
                                c1786.f5929 = iM4505;
                            } else {
                                c1786.m3520(viewMo133, AbstractC2491.m4460(viewMo133));
                                if (!c2504.f7990 && mo131()) {
                                    iMo2740 = this.f334.mo2740(viewMo133);
                                    iMo2737 = this.f334.mo2737(viewMo133);
                                    iMo2746 = this.f334.mo2746();
                                    iMo2742 = this.f334.mo2742();
                                    if (iMo2737 <= iMo2746 || iMo2740 >= iMo2746) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (iMo2740 >= iMo2742 || iMo2737 <= iMo2742) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 || z4) {
                                        if (c1786.f5931) {
                                            iMo2746 = iMo2742;
                                        }
                                        c1786.f5930 = iMo2746;
                                    }
                                }
                            }
                        } else {
                            c1786.m3521(focusedChild2, AbstractC2491.m4460(focusedChild2));
                        }
                    } else {
                        z = this.f335;
                        z2 = this.f338;
                        if (z == z2) {
                            c1786.m3519();
                            if (this.f338) {
                                iM4505 = c2504.m4505() - 1;
                            } else {
                                iM4505 = 0;
                            }
                            c1786.f5929 = iM4505;
                        } else {
                            c1786.m3520(viewMo133, AbstractC2491.m4460(viewMo133));
                            if (!c2504.f7990) {
                                iMo2740 = this.f334.mo2740(viewMo133);
                                iMo2737 = this.f334.mo2737(viewMo133);
                                iMo2746 = this.f334.mo2746();
                                iMo2742 = this.f334.mo2742();
                                if (iMo2737 <= iMo2746) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2740 >= iMo2742) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c1786.f5931) {
                                        iMo2746 = iMo2742;
                                    }
                                    c1786.f5930 = iMo2746;
                                } else {
                                    if (c1786.f5931) {
                                        iMo2746 = iMo2742;
                                    }
                                    c1786.f5930 = iMo2746;
                                }
                            }
                        }
                    }
                } else {
                    c1786.m3519();
                    if (this.f338) {
                        iM4505 = c2504.m4505() - 1;
                    } else {
                        iM4505 = 0;
                    }
                    c1786.f5929 = iM4505;
                }
            } else if (i < 0 || i >= c2504.m4505()) {
                this.f340 = -1;
                this.f341 = Integer.MIN_VALUE;
                if (m4467() != 0) {
                    recyclerView = this.f7942;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c2492 = (C2492) focusedChild2.getLayoutParams();
                        if (c2492.f7956.m4518()) {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2) {
                                c1786.m3519();
                                if (this.f338) {
                                    iM4505 = c2504.m4505() - 1;
                                } else {
                                    iM4505 = 0;
                                }
                                c1786.f5929 = iM4505;
                            } else {
                                c1786.m3520(viewMo133, AbstractC2491.m4460(viewMo133));
                                if (!c2504.f7990) {
                                    iMo2740 = this.f334.mo2740(viewMo133);
                                    iMo2737 = this.f334.mo2737(viewMo133);
                                    iMo2746 = this.f334.mo2746();
                                    iMo2742 = this.f334.mo2742();
                                    if (iMo2737 <= iMo2746) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2740 >= iMo2742) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c1786.f5931) {
                                            iMo2746 = iMo2742;
                                        }
                                        c1786.f5930 = iMo2746;
                                    } else {
                                        if (c1786.f5931) {
                                            iMo2746 = iMo2742;
                                        }
                                        c1786.f5930 = iMo2746;
                                    }
                                }
                            }
                        } else {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2) {
                                c1786.m3519();
                                if (this.f338) {
                                    iM4505 = c2504.m4505() - 1;
                                } else {
                                    iM4505 = 0;
                                }
                                c1786.f5929 = iM4505;
                            } else {
                                c1786.m3520(viewMo133, AbstractC2491.m4460(viewMo133));
                                if (!c2504.f7990) {
                                    iMo2740 = this.f334.mo2740(viewMo133);
                                    iMo2737 = this.f334.mo2737(viewMo133);
                                    iMo2746 = this.f334.mo2746();
                                    iMo2742 = this.f334.mo2742();
                                    if (iMo2737 <= iMo2746) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2740 >= iMo2742) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c1786.f5931) {
                                            iMo2746 = iMo2742;
                                        }
                                        c1786.f5930 = iMo2746;
                                    } else {
                                        if (c1786.f5931) {
                                            iMo2746 = iMo2742;
                                        }
                                        c1786.f5930 = iMo2746;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.f335;
                        z2 = this.f338;
                        if (z == z2) {
                            c1786.m3519();
                            if (this.f338) {
                                iM4505 = c2504.m4505() - 1;
                            } else {
                                iM4505 = 0;
                            }
                            c1786.f5929 = iM4505;
                        } else {
                            c1786.m3520(viewMo133, AbstractC2491.m4460(viewMo133));
                            if (!c2504.f7990) {
                                iMo2740 = this.f334.mo2740(viewMo133);
                                iMo2737 = this.f334.mo2737(viewMo133);
                                iMo2746 = this.f334.mo2746();
                                iMo2742 = this.f334.mo2742();
                                if (iMo2737 <= iMo2746) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2740 >= iMo2742) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c1786.f5931) {
                                        iMo2746 = iMo2742;
                                    }
                                    c1786.f5930 = iMo2746;
                                } else {
                                    if (c1786.f5931) {
                                        iMo2746 = iMo2742;
                                    }
                                    c1786.f5930 = iMo2746;
                                }
                            }
                        }
                    }
                } else {
                    c1786.m3519();
                    if (this.f338) {
                        iM4505 = c2504.m4505() - 1;
                    } else {
                        iM4505 = 0;
                    }
                    c1786.f5929 = iM4505;
                }
            } else {
                int i9 = this.f340;
                c1786.f5929 = i9;
                C1789 c17810 = this.f342;
                if (c17810 != null && c17810.f5949 >= 0) {
                    boolean z5 = c17810.f5951;
                    c1786.f5931 = z5;
                    if (z5) {
                        c1786.f5930 = this.f334.mo2742() - this.f342.f5950;
                    } else {
                        c1786.f5930 = this.f334.mo2746() + this.f342.f5950;
                    }
                } else if (this.f341 == Integer.MIN_VALUE) {
                    View viewMo159 = mo158(i9);
                    if (viewMo159 == null) {
                        if (m4467() > 0) {
                            c1786.f5931 = (this.f340 < AbstractC2491.m4460(m4466(0))) == this.f337;
                        }
                        c1786.m3519();
                    } else if (this.f334.mo2738(viewMo159) > this.f334.mo2747()) {
                        c1786.m3519();
                    } else if (this.f334.mo2740(viewMo159) - this.f334.mo2746() < 0) {
                        c1786.f5930 = this.f334.mo2746();
                        c1786.f5931 = false;
                    } else if (this.f334.mo2742() - this.f334.mo2737(viewMo159) < 0) {
                        c1786.f5930 = this.f334.mo2742();
                        c1786.f5931 = true;
                    } else {
                        if (c1786.f5931) {
                            int iMo2738 = this.f334.mo2737(viewMo159);
                            AbstractC1138 abstractC1138 = this.f334;
                            iMo2741 = (Integer.MIN_VALUE == abstractC1138.f4232 ? 0 : abstractC1138.mo2747() - abstractC1138.f4232) + iMo2738;
                        } else {
                            iMo2741 = this.f334.mo2740(viewMo159);
                        }
                        c1786.f5930 = iMo2741;
                    }
                } else {
                    boolean z6 = this.f337;
                    c1786.f5931 = z6;
                    if (z6) {
                        c1786.f5930 = this.f334.mo2742() - this.f341;
                    } else {
                        c1786.f5930 = this.f334.mo2746() + this.f341;
                    }
                }
            }
            c1786.f5932 = true;
        } else if (focusedChild != null && (this.f334.mo2740(focusedChild) >= this.f334.mo2742() || this.f334.mo2737(focusedChild) <= this.f334.mo2746())) {
            c1786.m3521(focusedChild, AbstractC2491.m4460(focusedChild));
        }
        C1788 c1788 = this.f333;
        c1788.f5942 = c1788.f5946 >= 0 ? 1 : -1;
        int[] iArr = this.f346;
        iArr[0] = 0;
        iArr[1] = 0;
        m168(c2504, iArr);
        int iMo2747 = this.f334.mo2746() + Math.max(0, iArr[0]);
        int iMo2745 = this.f334.mo2743() + Math.max(0, iArr[1]);
        if (c2504.f7990 && (i6 = this.f340) != -1 && this.f341 != Integer.MIN_VALUE && (viewMo158 = mo158(i6)) != null) {
            if (this.f337) {
                iMo2744 = this.f334.mo2742() - this.f334.mo2737(viewMo158);
                iMo2743 = this.f341;
            } else {
                iMo2743 = this.f334.mo2740(viewMo158) - this.f334.mo2746();
                iMo2744 = this.f341;
            }
            int i10 = iMo2744 - iMo2743;
            if (i10 > 0) {
                iMo2747 += i10;
            } else {
                iMo2745 -= i10;
            }
        }
        if (!c1786.f5931 ? !this.f337 : this.f337) {
            i8 = 1;
        }
        mo135(c2498, c2504, c1786, i8);
        m4465(c2498);
        this.f333.f5948 = this.f334.mo2744() == 0 && this.f334.mo2741() == 0;
        this.f333.getClass();
        this.f333.f5945 = 0;
        if (c1786.f5931) {
            m194(c1786.f5929, c1786.f5930);
            C1788 c17811 = this.f333;
            c17811.f5944 = iMo2747;
            m174(c2498, c17811, c2504, false);
            C1788 c17812 = this.f333;
            i3 = c17812.f5938;
            int i11 = c17812.f5940;
            int i12 = c17812.f5939;
            if (i12 > 0) {
                iMo2745 += i12;
            }
            m193(c1786.f5929, c1786.f5930);
            C1788 c17813 = this.f333;
            c17813.f5944 = iMo2745;
            c17813.f5940 += c17813.f5941;
            m174(c2498, c17813, c2504, false);
            C1788 c17814 = this.f333;
            i2 = c17814.f5938;
            int i13 = c17814.f5939;
            if (i13 > 0) {
                m194(i11, i3);
                C1788 c17815 = this.f333;
                c17815.f5944 = i13;
                m174(c2498, c17815, c2504, false);
                i3 = this.f333.f5938;
            }
        } else {
            m193(c1786.f5929, c1786.f5930);
            C1788 c17816 = this.f333;
            c17816.f5944 = iMo2745;
            m174(c2498, c17816, c2504, false);
            C1788 c17817 = this.f333;
            i2 = c17817.f5938;
            int i14 = c17817.f5940;
            int i15 = c17817.f5939;
            if (i15 > 0) {
                iMo2747 += i15;
            }
            m194(c1786.f5929, c1786.f5930);
            C1788 c17818 = this.f333;
            c17818.f5944 = iMo2747;
            c17818.f5940 += c17818.f5941;
            m174(c2498, c17818, c2504, false);
            C1788 c17819 = this.f333;
            int i16 = c17819.f5938;
            int i17 = c17819.f5939;
            if (i17 > 0) {
                m193(i14, i2);
                C1788 c17820 = this.f333;
                c17820.f5944 = i17;
                m174(c2498, c17820, c2504, false);
                i2 = this.f333.f5938;
            }
            i3 = i16;
        }
        if (m4467() > 0) {
            if (this.f337 ^ this.f338) {
                int iM182 = m181(i2, c2498, c2504, true);
                i4 = i3 + iM182;
                i5 = i2 + iM182;
                iM181 = m182(i4, c2498, c2504, false);
            } else {
                int iM183 = m182(i3, c2498, c2504, true);
                i4 = i3 + iM183;
                i5 = i2 + iM183;
                iM181 = m181(i5, c2498, c2504, false);
            }
            i3 = i4 + iM181;
            i2 = i5 + iM181;
        }
        if (c2504.f7994 && m4467() != 0 && !c2504.f7990 && mo131()) {
            List list2 = c2498.f7970;
            int size = list2.size();
            int iM4460 = AbstractC2491.m4460(m4466(0));
            int iMo2739 = 0;
            int iMo27310 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                AbstractC2508 abstractC2508 = (AbstractC2508) list2.get(i18);
                boolean zM4518 = abstractC2508.m4518();
                View view = abstractC2508.f8006;
                if (!zM4518) {
                    if ((abstractC2508.m4512() < iM4460) != this.f337) {
                        iMo2739 += this.f334.mo2738(view);
                    } else {
                        iMo27310 += this.f334.mo2738(view);
                    }
                }
            }
            this.f333.f5947 = list2;
            if (iMo2739 > 0) {
                m194(AbstractC2491.m4460(m184()), i3);
                C1788 c17821 = this.f333;
                c17821.f5944 = iMo2739;
                c17821.f5939 = 0;
                c17821.m3523(null);
                m174(c2498, this.f333, c2504, false);
            }
            if (iMo27310 > 0) {
                m193(AbstractC2491.m4460(m183()), i2);
                C1788 c17822 = this.f333;
                c17822.f5944 = iMo27310;
                c17822.f5939 = 0;
                list = null;
                c17822.m3523(null);
                m174(c2498, this.f333, c2504, false);
            } else {
                list = null;
            }
            this.f333.f5947 = list;
        }
        if (c2504.f7990) {
            c1786.m3522();
        } else {
            AbstractC1138 abstractC1139 = this.f334;
            abstractC1139.f4232 = abstractC1139.mo2747();
        }
        this.f335 = this.f338;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public void mo126(C2504 c2504) {
        this.f342 = null;
        this.f340 = -1;
        this.f341 = Integer.MIN_VALUE;
        this.f343.m3522();
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final void mo163(Parcelable parcelable) {
        if (parcelable instanceof C1789) {
            C1789 c1789 = (C1789) parcelable;
            this.f342 = c1789;
            if (this.f340 != -1) {
                c1789.f5949 = -1;
            }
            m4480();
        }
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final Parcelable mo164() {
        C1789 c1789 = this.f342;
        if (c1789 != null) {
            C1789 c17810 = new C1789();
            c17810.f5949 = c1789.f5949;
            c17810.f5950 = c1789.f5950;
            c17810.f5951 = c1789.f5951;
            return c17810;
        }
        C1789 c17811 = new C1789();
        if (m4467() <= 0) {
            c17811.f5949 = -1;
            return c17811;
        }
        m173();
        boolean z = this.f335 ^ this.f337;
        c17811.f5951 = z;
        if (z) {
            View viewM183 = m183();
            c17811.f5950 = this.f334.mo2742() - this.f334.mo2737(viewM183);
            c17811.f5949 = AbstractC2491.m4460(viewM183);
            return c17811;
        }
        View viewM184 = m184();
        c17811.f5949 = AbstractC2491.m4460(viewM184);
        c17811.f5950 = this.f334.mo2740(viewM184) - this.f334.mo2746();
        return c17811;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ */
    public boolean mo127(int i, Bundle bundle) {
        int iMin;
        if (super.mo127(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f332 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f7942;
                iMin = Math.min(i2, mo116(recyclerView.f358, recyclerView.f411) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f7942;
                iMin = Math.min(i3, mo115(recyclerView2.f358, recyclerView2.f411) - 1);
            }
            if (iMin >= 0) {
                mo190(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public int mo128(int i, C2498 c2498, C2504 c2504) {
        if (this.f332 == 1) {
            return 0;
        }
        return m189(i, c2498, c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public void mo165(int i) {
        this.f340 = i;
        this.f341 = Integer.MIN_VALUE;
        C1789 c1789 = this.f342;
        if (c1789 != null) {
            c1789.f5949 = -1;
        }
        m4480();
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ */
    public int mo129(int i, C2498 c2498, C2504 c2504) {
        if (this.f332 == 0) {
            return 0;
        }
        return m189(i, c2498, c2504);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
    public final boolean mo166() {
        if (this.f7953 != 1073741824 && this.f7952 != 1073741824) {
            int iM4467 = m4467();
            for (int i = 0; i < iM4467; i++) {
                ViewGroup.LayoutParams layoutParams = m4466(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
    public void mo167(RecyclerView recyclerView, C2504 c2504, int i) {
        C1790 c1790 = new C1790(recyclerView.getContext());
        c1790.f5952 = i;
        m4487(c1790);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ */
    public boolean mo131() {
        return this.f342 == null && this.f335 == this.f338;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public void m168(C2504 c2504, int[] iArr) {
        int i;
        int iMo2747 = c2504.f7984 != -1 ? this.f334.mo2747() : 0;
        if (this.f333.f5942 == -1) {
            i = 0;
        } else {
            i = iMo2747;
            iMo2747 = 0;
        }
        iArr[0] = iMo2747;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ */
    public void mo132(C2504 c2504, C1788 c1788, C1439 c1439) {
        int i = c1788.f5940;
        if (i < 0 || i >= c2504.m4505()) {
            return;
        }
        c1439.m3134(i, Math.max(0, c1788.f5943));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᤞᲀ, reason: contains not printable characters */
    public final int m169(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        m173();
        AbstractC1138 abstractC1138 = this.f334;
        boolean z = !this.f339;
        return AbstractC1270.m2974(c2504, abstractC1138, m176(z), m175(z), this, this.f339);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᲀᤞ, reason: contains not printable characters */
    public final int m170(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        m173();
        AbstractC1138 abstractC1138 = this.f334;
        boolean z = !this.f339;
        return AbstractC1270.m2975(c2504, abstractC1138, m176(z), m175(z), this, this.f339, this.f337);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲀᲁ, reason: contains not printable characters */
    public final int m171(C2504 c2504) {
        if (m4467() == 0) {
            return 0;
        }
        m173();
        AbstractC1138 abstractC1138 = this.f334;
        boolean z = !this.f339;
        return AbstractC1270.m2976(c2504, abstractC1138, m176(z), m175(z), this, this.f339);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲁᲀ, reason: contains not printable characters */
    public final int m172(int i) {
        if (i == 1) {
            return (this.f332 != 1 && m185()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f332 != 1 && m185()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f332 == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f332 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f332 == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f332 == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᤞᲁ, reason: contains not printable characters */
    public final void m173() {
        if (this.f333 == null) {
            C1788 c1788 = new C1788();
            c1788.f5937 = true;
            c1788.f5944 = 0;
            c1788.f5945 = 0;
            c1788.f5947 = null;
            this.f333 = c1788;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᲁᤞ, reason: contains not printable characters */
    public final int m174(C2498 c2498, C1788 c1788, C2504 c2504, boolean z) {
        int i;
        int i2 = c1788.f5939;
        int i3 = c1788.f5943;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c1788.f5943 = i3 + i2;
            }
            m186(c2498, c1788);
        }
        int i4 = c1788.f5939 + c1788.f5944;
        while (true) {
            if ((!c1788.f5948 && i4 <= 0) || (i = c1788.f5940) < 0 || i >= c2504.m4505()) {
                break;
            }
            C1787 c1787 = this.f344;
            c1787.f5933 = 0;
            c1787.f5934 = false;
            c1787.f5935 = false;
            c1787.f5936 = false;
            mo134(c2498, c2504, c1788, c1787);
            if (!c1787.f5934) {
                int i5 = c1788.f5938;
                int i6 = c1787.f5933;
                c1788.f5938 = (c1788.f5942 * i6) + i5;
                if (!c1787.f5935 || c1788.f5947 != null || !c2504.f7990) {
                    c1788.f5939 -= i6;
                    i4 -= i6;
                }
                int i7 = c1788.f5943;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c1788.f5943 = i8;
                    int i9 = c1788.f5939;
                    if (i9 < 0) {
                        c1788.f5943 = i8 + i9;
                    }
                    m186(c2498, c1788);
                }
                if (z && c1787.f5936) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c1788.f5939;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᤞᲀ, reason: contains not printable characters */
    public final View m175(boolean z) {
        return this.f337 ? m180(0, m4467(), z) : m180(m4467() - 1, -1, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᲀᤞ, reason: contains not printable characters */
    public final View m176(boolean z) {
        return this.f337 ? m180(m4467() - 1, -1, z) : m180(0, m4467(), z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
    public int mo177() {
        View viewM180 = m180(0, m4467(), false);
        if (viewM180 == null) {
            return -1;
        }
        return AbstractC2491.m4460(viewM180);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ, reason: contains not printable characters */
    public int mo178() {
        View viewM180 = m180(m4467() - 1, -1, false);
        if (viewM180 == null) {
            return -1;
        }
        return AbstractC2491.m4460(viewM180);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲀᲇ, reason: contains not printable characters */
    public final View m179(int i, int i2) {
        int i3;
        int i4;
        m173();
        if (i2 <= i && i2 >= i) {
            return m4466(i);
        }
        if (this.f334.mo2740(m4466(i)) < this.f334.mo2746()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = r.a.a;
        }
        return this.f332 == 0 ? this.f7943.m4804(i, i2, i3, i4) : this.f7944.m4804(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
    public final View m180(int i, int i2, boolean z) {
        m173();
        int i3 = z ? 24579 : 320;
        return this.f332 == 0 ? this.f7943.m4804(i, i2, i3, 320) : this.f7944.m4804(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲀᲁ */
    public View mo133(C2498 c2498, C2504 c2504, boolean z, boolean z2) {
        int i;
        int iM4467;
        int i2;
        m173();
        int iM4468 = m4467();
        if (z2) {
            iM4467 = m4467() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM4468;
            iM4467 = 0;
            i2 = 1;
        }
        int iM4505 = c2504.m4505();
        int iMo2746 = this.f334.mo2746();
        int iMo2742 = this.f334.mo2742();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM4467 != i) {
            View viewM4466 = m4466(iM4467);
            int iM4460 = AbstractC2491.m4460(viewM4466);
            int iMo2740 = this.f334.mo2740(viewM4466);
            int iMo2737 = this.f334.mo2737(viewM4466);
            if (iM4460 >= 0 && iM4460 < iM4505) {
                if (!((C2492) viewM4466.getLayoutParams()).f7956.m4518()) {
                    boolean z3 = iMo2737 <= iMo2746 && iMo2740 < iMo2746;
                    boolean z4 = iMo2740 >= iMo2742 && iMo2737 > iMo2742;
                    if (!z3 && !z4) {
                        return viewM4466;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM4466;
                        } else if (view == null) {
                            view = viewM4466;
                        }
                    } else if (z3) {
                        view2 = viewM4466;
                    } else if (view == null) {
                        view = viewM4466;
                    }
                } else if (view3 == null) {
                    view3 = viewM4466;
                }
            }
            iM4467 += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲁᲀ, reason: contains not printable characters */
    public final int m181(int i, C2498 c2498, C2504 c2504, boolean z) {
        int iMo2742;
        int iMo2743 = this.f334.mo2742() - i;
        if (iMo2743 <= 0) {
            return 0;
        }
        int i2 = -m189(-iMo2743, c2498, c2504);
        int i3 = i + i2;
        if (!z || (iMo2742 = this.f334.mo2742() - i3) <= 0) {
            return i2;
        }
        this.f334.mo2750(iMo2742);
        return iMo2742 + i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲁᲇ, reason: contains not printable characters */
    public final int m182(int i, C2498 c2498, C2504 c2504, boolean z) {
        int iMo2746;
        int iMo2747 = i - this.f334.mo2746();
        if (iMo2747 <= 0) {
            return 0;
        }
        int i2 = -m189(iMo2747, c2498, c2504);
        int i3 = i + i2;
        if (!z || (iMo2746 = i3 - this.f334.mo2746()) <= 0) {
            return i2;
        }
        this.f334.mo2750(-iMo2746);
        return i2 - iMo2746;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲇᲁ, reason: contains not printable characters */
    public final View m183() {
        return m4466(this.f337 ? 0 : m4467() - 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᤞᲇ, reason: contains not printable characters */
    public final View m184() {
        return m4466(this.f337 ? m4467() - 1 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ, reason: contains not printable characters */
    public final boolean m185() {
        return this.f7942.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ */
    public void mo134(C2498 c2498, C2504 c2504, C1788 c1788, C1787 c1787) {
        int iM4470;
        int i;
        int i2;
        int iMo2739;
        View viewM3524 = c1788.m3524(c2498);
        if (viewM3524 == null) {
            c1787.f5934 = true;
            return;
        }
        C2492 c2492 = (C2492) viewM3524.getLayoutParams();
        if (c1788.f5947 == null) {
            if (this.f337 == (c1788.f5942 == -1)) {
                m4464(viewM3524, -1, false);
            } else {
                m4464(viewM3524, 0, false);
            }
        } else {
            if (this.f337 == (c1788.f5942 == -1)) {
                m4464(viewM3524, -1, true);
            } else {
                m4464(viewM3524, 0, true);
            }
        }
        C2492 c2493 = (C2492) viewM3524.getLayoutParams();
        Rect rectM233 = this.f7942.m233(viewM3524);
        int i3 = rectM233.left + rectM233.right;
        int i4 = rectM233.top + rectM233.bottom;
        int iM4453 = AbstractC2491.m4453(this.f7954, this.f7952, m4471() + m4470() + ((ViewGroup.MarginLayoutParams) c2493).leftMargin + ((ViewGroup.MarginLayoutParams) c2493).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c2493).width, mo152());
        int iM4454 = AbstractC2491.m4453(this.f7955, this.f7953, m4469() + m4472() + ((ViewGroup.MarginLayoutParams) c2493).topMargin + ((ViewGroup.MarginLayoutParams) c2493).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c2493).height, mo153());
        if (m4485(viewM3524, iM4453, iM4454, c2493)) {
            viewM3524.measure(iM4453, iM4454);
        }
        c1787.f5933 = this.f334.mo2738(viewM3524);
        if (this.f332 == 1) {
            if (m185()) {
                iMo2739 = this.f7954 - m4471();
                iM4470 = iMo2739 - this.f334.mo2739(viewM3524);
            } else {
                iM4470 = m4470();
                iMo2739 = this.f334.mo2739(viewM3524) + iM4470;
            }
            if (c1788.f5942 == -1) {
                i = c1788.f5938;
                i2 = i - c1787.f5933;
            } else {
                i2 = c1788.f5938;
                i = c1787.f5933 + i2;
            }
        } else {
            int iM4472 = m4472();
            int iMo27310 = this.f334.mo2739(viewM3524) + iM4472;
            if (c1788.f5942 == -1) {
                int i5 = c1788.f5938;
                int i6 = i5 - c1787.f5933;
                iMo2739 = i5;
                i = iMo27310;
                iM4470 = i6;
                i2 = iM4472;
            } else {
                int i7 = c1788.f5938;
                int i8 = c1787.f5933 + i7;
                iM4470 = i7;
                i = iMo27310;
                i2 = iM4472;
                iMo2739 = i8;
            }
        }
        AbstractC2491.m4463(viewM3524, iM4470, i2, iMo2739, i);
        if (c2492.f7956.m4518() || c2492.f7956.m4521()) {
            c1787.f5935 = true;
        }
        c1787.f5936 = viewM3524.hasFocusable();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲀᲇ, reason: contains not printable characters */
    public final void m186(C2498 c2498, C1788 c1788) {
        if (!c1788.f5937 || c1788.f5948) {
            return;
        }
        int i = c1788.f5943;
        int i2 = c1788.f5945;
        if (c1788.f5942 == -1) {
            int iM4467 = m4467();
            if (i < 0) {
                return;
            }
            int iMo2741 = (this.f334.mo2741() - i) + i2;
            if (this.f337) {
                for (int i3 = 0; i3 < iM4467; i3++) {
                    View viewM4466 = m4466(i3);
                    if (this.f334.mo2740(viewM4466) < iMo2741 || this.f334.mo2749(viewM4466) < iMo2741) {
                        m187(c2498, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4467 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM4467 = m4466(i5);
                if (this.f334.mo2740(viewM4467) < iMo2741 || this.f334.mo2749(viewM4467) < iMo2741) {
                    m187(c2498, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM4468 = m4467();
        if (!this.f337) {
            for (int i7 = 0; i7 < iM4468; i7++) {
                View viewM4468 = m4466(i7);
                if (this.f334.mo2737(viewM4468) > i6 || this.f334.mo2748(viewM4468) > i6) {
                    m187(c2498, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM4468 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM4469 = m4466(i9);
            if (this.f334.mo2737(viewM4469) > i6 || this.f334.mo2748(viewM4469) > i6) {
                m187(c2498, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲇᲀ, reason: contains not printable characters */
    public final void m187(C2498 c2498, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m4478(i, c2498);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m4478(i3, c2498);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᤞᲇ, reason: contains not printable characters */
    public final void m188() {
        if (this.f332 == 1 || !m185()) {
            this.f337 = this.f336;
        } else {
            this.f337 = !this.f336;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
    public final int m189(int i, C2498 c2498, C2504 c2504) {
        if (m4467() != 0 && i != 0) {
            m173();
            this.f333.f5937 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m192(i2, iAbs, true, c2504);
            C1788 c1788 = this.f333;
            int iM174 = m174(c2498, c1788, c2504, false) + c1788.f5943;
            if (iM174 >= 0) {
                if (iAbs > iM174) {
                    i = i2 * iM174;
                }
                this.f334.mo2750(-i);
                this.f333.f5946 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
    public void mo190(int i, int i2) {
        this.f340 = i;
        this.f341 = i2;
        C1789 c1789 = this.f342;
        if (c1789 != null) {
            c1789.f5949 = -1;
        }
        m4480();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᲀᤞ, reason: contains not printable characters */
    public final void m191(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "invalid orientation:"));
        }
        mo151(null);
        if (i != this.f332 || this.f334 == null) {
            AbstractC1138 abstractC1138M2736 = AbstractC1138.m2736(this, i);
            this.f334 = abstractC1138M2736;
            this.f343.f5928 = abstractC1138M2736;
            this.f332 = i;
            m4480();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᤞᲀᲁ */
    public void mo136(boolean z) {
        mo151(null);
        if (this.f338 == z) {
            return;
        }
        this.f338 = z;
        m4480();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᤞᲁᲀ, reason: contains not printable characters */
    public final void m192(int i, int i2, boolean z, C2504 c2504) {
        int iMo2746;
        this.f333.f5948 = this.f334.mo2744() == 0 && this.f334.mo2741() == 0;
        this.f333.f5942 = i;
        int[] iArr = this.f346;
        iArr[0] = 0;
        iArr[1] = 0;
        m168(c2504, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C1788 c1788 = this.f333;
        int i3 = z2 ? iMax2 : iMax;
        c1788.f5944 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c1788.f5945 = iMax;
        if (z2) {
            c1788.f5944 = this.f334.mo2743() + i3;
            View viewM183 = m183();
            C1788 c1789 = this.f333;
            c1789.f5941 = this.f337 ? -1 : 1;
            int iM4460 = AbstractC2491.m4460(viewM183);
            C1788 c17810 = this.f333;
            c1789.f5940 = iM4460 + c17810.f5941;
            c17810.f5938 = this.f334.mo2737(viewM183);
            iMo2746 = this.f334.mo2737(viewM183) - this.f334.mo2742();
        } else {
            View viewM184 = m184();
            C1788 c17811 = this.f333;
            c17811.f5944 = this.f334.mo2746() + c17811.f5944;
            C1788 c17812 = this.f333;
            c17812.f5941 = this.f337 ? 1 : -1;
            int iM4461 = AbstractC2491.m4460(viewM184);
            C1788 c17813 = this.f333;
            c17812.f5940 = iM4461 + c17813.f5941;
            c17813.f5938 = this.f334.mo2740(viewM184);
            iMo2746 = (-this.f334.mo2740(viewM184)) + this.f334.mo2746();
        }
        C1788 c17814 = this.f333;
        c17814.f5939 = i2;
        if (z) {
            c17814.f5939 = i2 - iMo2746;
        }
        c17814.f5943 = iMo2746;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᤞᲁ, reason: contains not printable characters */
    public final void m193(int i, int i2) {
        this.f333.f5939 = this.f334.mo2742() - i2;
        C1788 c1788 = this.f333;
        c1788.f5941 = this.f337 ? -1 : 1;
        c1788.f5940 = i;
        c1788.f5942 = 1;
        c1788.f5938 = i2;
        c1788.f5943 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᲁᤞ, reason: contains not printable characters */
    public final void m194(int i, int i2) {
        this.f333.f5939 = i2 - this.f334.mo2746();
        C1788 c1788 = this.f333;
        c1788.f5940 = i;
        c1788.f5941 = this.f337 ? 1 : -1;
        c1788.f5942 = -1;
        c1788.f5938 = i2;
        c1788.f5943 = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f332 = 1;
        this.f336 = false;
        this.f337 = false;
        this.f338 = false;
        this.f339 = true;
        this.f340 = -1;
        this.f341 = Integer.MIN_VALUE;
        this.f342 = null;
        this.f343 = new C1786();
        this.f344 = new C1787();
        this.f345 = 2;
        this.f346 = new int[2];
        C2490 c2490M4461 = AbstractC2491.m4461(context, attributeSet, i, i2);
        m191(c2490M4461.f7937);
        boolean z = c2490M4461.f7939;
        mo151(null);
        if (z != this.f336) {
            this.f336 = z;
            m4480();
        }
        mo136(c2490M4461.f7940);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public void mo161(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᲁᤞ */
    public void mo135(C2498 c2498, C2504 c2504, C1786 c1786, int i) {
    }
}
