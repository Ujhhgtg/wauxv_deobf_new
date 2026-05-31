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
import p000.AbstractC1095;
import p000.AbstractC1144;
import p000.AbstractC1586;
import p000.AbstractC2537;
import p000.AbstractC2546;
import p000.AbstractC2563;
import p000.C0093;
import p000.C0100;
import p000.C1447;
import p000.C1809;
import p000.C1810;
import p000.C1811;
import p000.C1812;
import p000.C1813;
import p000.C2545;
import p000.C2547;
import p000.C2553;
import p000.C2559;
import p000.InterfaceC2558;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2546 implements InterfaceC2558 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C1811 f333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public AbstractC1144 f334;

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
    public C1812 f342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C1809 f343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C1810 f344;

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
        this.f343 = new C1809();
        this.f344 = new C1810();
        this.f345 = 2;
        this.f346 = new int[2];
        m191(i);
        mo151(null);
        if (this.f336) {
            this.f336 = false;
            m4501();
        }
    }

    @Override // p000.InterfaceC2558
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final PointF mo150(int i) {
        if (m4489() == 0) {
            return null;
        }
        int i2 = (i < AbstractC2546.m4482(m4488(0))) != this.f337 ? -1 : 1;
        return this.f332 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo151(String str) {
        if (this.f342 == null) {
            super.mo151(str);
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean mo152() {
        return this.f332 == 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean mo153() {
        return this.f332 == 1;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo154(int i, int i2, C2559 c2559, C1447 c1447) {
        if (this.f332 != 0) {
            i = i2;
        }
        if (m4489() == 0 || i == 0) {
            return;
        }
        m173();
        m192(i > 0 ? 1 : -1, Math.abs(i), true, c2559);
        mo132(c2559, this.f333, c1447);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo155(int i, C1447 c1447) {
        boolean z;
        int i2;
        C1812 c1812 = this.f342;
        if (c1812 == null || (i2 = c1812.f6005) < 0) {
            m188();
            z = this.f337;
            i2 = this.f340;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c1812.f6007;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f345 && i2 >= 0 && i2 < i; i4++) {
            c1447.m3241(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int mo156(C2559 c2559) {
        return m169(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo108(C2559 c2559) {
        return m170(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo109(C2559 c2559) {
        return m171(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int mo157(C2559 c2559) {
        return m169(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public int mo110(C2559 c2559) {
        return m170(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public int mo111(C2559 c2559) {
        return m171(c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final View mo158(int i) {
        int iM4489 = m4489();
        if (iM4489 == 0) {
            return null;
        }
        int iM4482 = i - AbstractC2546.m4482(m4488(0));
        if (iM4482 >= 0 && iM4482 < iM4489) {
            View viewM4488 = m4488(iM4482);
            if (AbstractC2546.m4482(viewM4488) == i) {
                return viewM4488;
            }
        }
        return super.mo158(i);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public C2547 mo112() {
        return new C2547(-2, -2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final boolean mo159() {
        return true;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final boolean mo160() {
        return this.f336;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public View mo117(View view, int i, C2553 c2553, C2559 c2559) {
        int iM172;
        View viewM179;
        m188();
        if (m4489() != 0 && (iM172 = m172(i)) != Integer.MIN_VALUE) {
            m173();
            m192(iM172, (int) (this.f334.mo2891() * 0.33333334f), false, c2559);
            C1811 c1811 = this.f333;
            c1811.f5999 = Integer.MIN_VALUE;
            c1811.f5993 = false;
            m174(c2553, c1811, c2559, true);
            if (iM172 == -1) {
                viewM179 = this.f337 ? m179(m4489() - 1, -1) : m179(0, m4489());
            } else {
                viewM179 = this.f337 ? m179(0, m4489()) : m179(m4489() - 1, -1);
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

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4489() > 0) {
            accessibilityEvent.setFromIndex(mo177());
            accessibilityEvent.setToIndex(mo178());
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public void mo118(C2553 c2553, C2559 c2559, C0100 c0100) {
        super.mo118(c2553, c2559, c0100);
        AbstractC2537 abstractC2537 = this.f8093.f368;
        if (abstractC2537 == null || abstractC2537.mo2124() <= 0) {
            return;
        }
        c0100.m1235(C0093.f1101);
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
    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public void mo125(C2553 c2553, C2559 c2559) {
        View focusedChild;
        int iM4527;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo133;
        int iMo2884;
        int iMo2881;
        int iMo2890;
        int iMo2886;
        boolean z3;
        boolean z4;
        C2547 c2547;
        int i;
        int iMo2885;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iM181;
        int i6;
        View viewMo158;
        int iMo2887;
        int iMo2888;
        int i7;
        int i8 = -1;
        if (!(this.f342 == null && this.f340 == -1) && c2559.m4527() == 0) {
            m4497(c2553);
            return;
        }
        C1812 c1812 = this.f342;
        if (c1812 != null && (i7 = c1812.f6005) >= 0) {
            this.f340 = i7;
        }
        m173();
        this.f333.f5993 = false;
        m188();
        RecyclerView recyclerView2 = this.f8093;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f8092.f2307).contains(focusedChild)) {
            focusedChild = null;
        }
        C1809 c1809 = this.f343;
        if (!c1809.f5988 || this.f340 != -1 || this.f342 != null) {
            c1809.m3694();
            c1809.f5987 = this.f337 ^ this.f338;
            if (c2559.f8141 || (i = this.f340) == -1) {
                if (m4489() != 0) {
                    recyclerView = this.f8093;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f8092.f2307).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c2547 = (C2547) focusedChild2.getLayoutParams();
                        if (!c2547.f8107.m4540() || c2547.f8107.m4534() < 0 || c2547.f8107.m4534() >= c2559.m4527()) {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2 || (viewMo133 = mo133(c2553, c2559, c1809.f5987, z2)) == null) {
                                c1809.m3691();
                                if (this.f338) {
                                    iM4527 = c2559.m4527() - 1;
                                } else {
                                    iM4527 = 0;
                                }
                                c1809.f5985 = iM4527;
                            } else {
                                c1809.m3692(viewMo133, AbstractC2546.m4482(viewMo133));
                                if (!c2559.f8141 && mo131()) {
                                    iMo2884 = this.f334.mo2884(viewMo133);
                                    iMo2881 = this.f334.mo2881(viewMo133);
                                    iMo2890 = this.f334.mo2890();
                                    iMo2886 = this.f334.mo2886();
                                    if (iMo2881 <= iMo2890 || iMo2884 >= iMo2890) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (iMo2884 >= iMo2886 || iMo2881 <= iMo2886) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 || z4) {
                                        if (c1809.f5987) {
                                            iMo2890 = iMo2886;
                                        }
                                        c1809.f5986 = iMo2890;
                                    }
                                }
                            }
                        } else {
                            c1809.m3693(focusedChild2, AbstractC2546.m4482(focusedChild2));
                        }
                    } else {
                        z = this.f335;
                        z2 = this.f338;
                        if (z == z2) {
                            c1809.m3691();
                            if (this.f338) {
                                iM4527 = c2559.m4527() - 1;
                            } else {
                                iM4527 = 0;
                            }
                            c1809.f5985 = iM4527;
                        } else {
                            c1809.m3692(viewMo133, AbstractC2546.m4482(viewMo133));
                            if (!c2559.f8141) {
                                iMo2884 = this.f334.mo2884(viewMo133);
                                iMo2881 = this.f334.mo2881(viewMo133);
                                iMo2890 = this.f334.mo2890();
                                iMo2886 = this.f334.mo2886();
                                if (iMo2881 <= iMo2890) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2884 >= iMo2886) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c1809.f5987) {
                                        iMo2890 = iMo2886;
                                    }
                                    c1809.f5986 = iMo2890;
                                } else {
                                    if (c1809.f5987) {
                                        iMo2890 = iMo2886;
                                    }
                                    c1809.f5986 = iMo2890;
                                }
                            }
                        }
                    }
                } else {
                    c1809.m3691();
                    if (this.f338) {
                        iM4527 = c2559.m4527() - 1;
                    } else {
                        iM4527 = 0;
                    }
                    c1809.f5985 = iM4527;
                }
            } else if (i < 0 || i >= c2559.m4527()) {
                this.f340 = -1;
                this.f341 = Integer.MIN_VALUE;
                if (m4489() != 0) {
                    recyclerView = this.f8093;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c2547 = (C2547) focusedChild2.getLayoutParams();
                        if (c2547.f8107.m4540()) {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2) {
                                c1809.m3691();
                                if (this.f338) {
                                    iM4527 = c2559.m4527() - 1;
                                } else {
                                    iM4527 = 0;
                                }
                                c1809.f5985 = iM4527;
                            } else {
                                c1809.m3692(viewMo133, AbstractC2546.m4482(viewMo133));
                                if (!c2559.f8141) {
                                    iMo2884 = this.f334.mo2884(viewMo133);
                                    iMo2881 = this.f334.mo2881(viewMo133);
                                    iMo2890 = this.f334.mo2890();
                                    iMo2886 = this.f334.mo2886();
                                    if (iMo2881 <= iMo2890) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2884 >= iMo2886) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c1809.f5987) {
                                            iMo2890 = iMo2886;
                                        }
                                        c1809.f5986 = iMo2890;
                                    } else {
                                        if (c1809.f5987) {
                                            iMo2890 = iMo2886;
                                        }
                                        c1809.f5986 = iMo2890;
                                    }
                                }
                            }
                        } else {
                            z = this.f335;
                            z2 = this.f338;
                            if (z == z2) {
                                c1809.m3691();
                                if (this.f338) {
                                    iM4527 = c2559.m4527() - 1;
                                } else {
                                    iM4527 = 0;
                                }
                                c1809.f5985 = iM4527;
                            } else {
                                c1809.m3692(viewMo133, AbstractC2546.m4482(viewMo133));
                                if (!c2559.f8141) {
                                    iMo2884 = this.f334.mo2884(viewMo133);
                                    iMo2881 = this.f334.mo2881(viewMo133);
                                    iMo2890 = this.f334.mo2890();
                                    iMo2886 = this.f334.mo2886();
                                    if (iMo2881 <= iMo2890) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2884 >= iMo2886) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c1809.f5987) {
                                            iMo2890 = iMo2886;
                                        }
                                        c1809.f5986 = iMo2890;
                                    } else {
                                        if (c1809.f5987) {
                                            iMo2890 = iMo2886;
                                        }
                                        c1809.f5986 = iMo2890;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.f335;
                        z2 = this.f338;
                        if (z == z2) {
                            c1809.m3691();
                            if (this.f338) {
                                iM4527 = c2559.m4527() - 1;
                            } else {
                                iM4527 = 0;
                            }
                            c1809.f5985 = iM4527;
                        } else {
                            c1809.m3692(viewMo133, AbstractC2546.m4482(viewMo133));
                            if (!c2559.f8141) {
                                iMo2884 = this.f334.mo2884(viewMo133);
                                iMo2881 = this.f334.mo2881(viewMo133);
                                iMo2890 = this.f334.mo2890();
                                iMo2886 = this.f334.mo2886();
                                if (iMo2881 <= iMo2890) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2884 >= iMo2886) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c1809.f5987) {
                                        iMo2890 = iMo2886;
                                    }
                                    c1809.f5986 = iMo2890;
                                } else {
                                    if (c1809.f5987) {
                                        iMo2890 = iMo2886;
                                    }
                                    c1809.f5986 = iMo2890;
                                }
                            }
                        }
                    }
                } else {
                    c1809.m3691();
                    if (this.f338) {
                        iM4527 = c2559.m4527() - 1;
                    } else {
                        iM4527 = 0;
                    }
                    c1809.f5985 = iM4527;
                }
            } else {
                int i9 = this.f340;
                c1809.f5985 = i9;
                C1812 c1813 = this.f342;
                if (c1813 != null && c1813.f6005 >= 0) {
                    boolean z5 = c1813.f6007;
                    c1809.f5987 = z5;
                    if (z5) {
                        c1809.f5986 = this.f334.mo2886() - this.f342.f6006;
                    } else {
                        c1809.f5986 = this.f334.mo2890() + this.f342.f6006;
                    }
                } else if (this.f341 == Integer.MIN_VALUE) {
                    View viewMo159 = mo158(i9);
                    if (viewMo159 == null) {
                        if (m4489() > 0) {
                            c1809.f5987 = (this.f340 < AbstractC2546.m4482(m4488(0))) == this.f337;
                        }
                        c1809.m3691();
                    } else if (this.f334.mo2882(viewMo159) > this.f334.mo2891()) {
                        c1809.m3691();
                    } else if (this.f334.mo2884(viewMo159) - this.f334.mo2890() < 0) {
                        c1809.f5986 = this.f334.mo2890();
                        c1809.f5987 = false;
                    } else if (this.f334.mo2886() - this.f334.mo2881(viewMo159) < 0) {
                        c1809.f5986 = this.f334.mo2886();
                        c1809.f5987 = true;
                    } else {
                        if (c1809.f5987) {
                            int iMo2882 = this.f334.mo2881(viewMo159);
                            AbstractC1144 abstractC1144 = this.f334;
                            iMo2885 = (Integer.MIN_VALUE == abstractC1144.f4244 ? 0 : abstractC1144.mo2891() - abstractC1144.f4244) + iMo2882;
                        } else {
                            iMo2885 = this.f334.mo2884(viewMo159);
                        }
                        c1809.f5986 = iMo2885;
                    }
                } else {
                    boolean z6 = this.f337;
                    c1809.f5987 = z6;
                    if (z6) {
                        c1809.f5986 = this.f334.mo2886() - this.f341;
                    } else {
                        c1809.f5986 = this.f334.mo2890() + this.f341;
                    }
                }
            }
            c1809.f5988 = true;
        } else if (focusedChild != null && (this.f334.mo2884(focusedChild) >= this.f334.mo2886() || this.f334.mo2881(focusedChild) <= this.f334.mo2890())) {
            c1809.m3693(focusedChild, AbstractC2546.m4482(focusedChild));
        }
        C1811 c1811 = this.f333;
        c1811.f5998 = c1811.f6002 >= 0 ? 1 : -1;
        int[] iArr = this.f346;
        iArr[0] = 0;
        iArr[1] = 0;
        m168(c2559, iArr);
        int iMo2891 = this.f334.mo2890() + Math.max(0, iArr[0]);
        int iMo2889 = this.f334.mo2887() + Math.max(0, iArr[1]);
        if (c2559.f8141 && (i6 = this.f340) != -1 && this.f341 != Integer.MIN_VALUE && (viewMo158 = mo158(i6)) != null) {
            if (this.f337) {
                iMo2888 = this.f334.mo2886() - this.f334.mo2881(viewMo158);
                iMo2887 = this.f341;
            } else {
                iMo2887 = this.f334.mo2884(viewMo158) - this.f334.mo2890();
                iMo2888 = this.f341;
            }
            int i10 = iMo2888 - iMo2887;
            if (i10 > 0) {
                iMo2891 += i10;
            } else {
                iMo2889 -= i10;
            }
        }
        if (!c1809.f5987 ? !this.f337 : this.f337) {
            i8 = 1;
        }
        mo135(c2553, c2559, c1809, i8);
        m4487(c2553);
        this.f333.f6004 = this.f334.mo2888() == 0 && this.f334.mo2885() == 0;
        this.f333.getClass();
        this.f333.f6001 = 0;
        if (c1809.f5987) {
            m194(c1809.f5985, c1809.f5986);
            C1811 c1814 = this.f333;
            c1814.f6000 = iMo2891;
            m174(c2553, c1814, c2559, false);
            C1811 c1815 = this.f333;
            i3 = c1815.f5994;
            int i11 = c1815.f5996;
            int i12 = c1815.f5995;
            if (i12 > 0) {
                iMo2889 += i12;
            }
            m193(c1809.f5985, c1809.f5986);
            C1811 c1816 = this.f333;
            c1816.f6000 = iMo2889;
            c1816.f5996 += c1816.f5997;
            m174(c2553, c1816, c2559, false);
            C1811 c1817 = this.f333;
            i2 = c1817.f5994;
            int i13 = c1817.f5995;
            if (i13 > 0) {
                m194(i11, i3);
                C1811 c1818 = this.f333;
                c1818.f6000 = i13;
                m174(c2553, c1818, c2559, false);
                i3 = this.f333.f5994;
            }
        } else {
            m193(c1809.f5985, c1809.f5986);
            C1811 c1819 = this.f333;
            c1819.f6000 = iMo2889;
            m174(c2553, c1819, c2559, false);
            C1811 c18110 = this.f333;
            i2 = c18110.f5994;
            int i14 = c18110.f5996;
            int i15 = c18110.f5995;
            if (i15 > 0) {
                iMo2891 += i15;
            }
            m194(c1809.f5985, c1809.f5986);
            C1811 c18111 = this.f333;
            c18111.f6000 = iMo2891;
            c18111.f5996 += c18111.f5997;
            m174(c2553, c18111, c2559, false);
            C1811 c18112 = this.f333;
            int i16 = c18112.f5994;
            int i17 = c18112.f5995;
            if (i17 > 0) {
                m193(i14, i2);
                C1811 c18113 = this.f333;
                c18113.f6000 = i17;
                m174(c2553, c18113, c2559, false);
                i2 = this.f333.f5994;
            }
            i3 = i16;
        }
        if (m4489() > 0) {
            if (this.f337 ^ this.f338) {
                int iM182 = m181(i2, c2553, c2559, true);
                i4 = i3 + iM182;
                i5 = i2 + iM182;
                iM181 = m182(i4, c2553, c2559, false);
            } else {
                int iM183 = m182(i3, c2553, c2559, true);
                i4 = i3 + iM183;
                i5 = i2 + iM183;
                iM181 = m181(i5, c2553, c2559, false);
            }
            i3 = i4 + iM181;
            i2 = i5 + iM181;
        }
        if (c2559.f8145 && m4489() != 0 && !c2559.f8141 && mo131()) {
            List list2 = c2553.f8121;
            int size = list2.size();
            int iM4482 = AbstractC2546.m4482(m4488(0));
            int iMo2883 = 0;
            int iMo28810 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                AbstractC2563 abstractC2563 = (AbstractC2563) list2.get(i18);
                boolean zM4540 = abstractC2563.m4540();
                View view = abstractC2563.f8157;
                if (!zM4540) {
                    if ((abstractC2563.m4534() < iM4482) != this.f337) {
                        iMo2883 += this.f334.mo2882(view);
                    } else {
                        iMo28810 += this.f334.mo2882(view);
                    }
                }
            }
            this.f333.f6003 = list2;
            if (iMo2883 > 0) {
                m194(AbstractC2546.m4482(m184()), i3);
                C1811 c18114 = this.f333;
                c18114.f6000 = iMo2883;
                c18114.f5995 = 0;
                c18114.m3695(null);
                m174(c2553, this.f333, c2559, false);
            }
            if (iMo28810 > 0) {
                m193(AbstractC2546.m4482(m183()), i2);
                C1811 c18115 = this.f333;
                c18115.f6000 = iMo28810;
                c18115.f5995 = 0;
                list = null;
                c18115.m3695(null);
                m174(c2553, this.f333, c2559, false);
            } else {
                list = null;
            }
            this.f333.f6003 = list;
        }
        if (c2559.f8141) {
            c1809.m3694();
        } else {
            AbstractC1144 abstractC1145 = this.f334;
            abstractC1145.f4244 = abstractC1145.mo2891();
        }
        this.f335 = this.f338;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public void mo126(C2559 c2559) {
        this.f342 = null;
        this.f340 = -1;
        this.f341 = Integer.MIN_VALUE;
        this.f343.m3694();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final void mo163(Parcelable parcelable) {
        if (parcelable instanceof C1812) {
            C1812 c1812 = (C1812) parcelable;
            this.f342 = c1812;
            if (this.f340 != -1) {
                c1812.f6005 = -1;
            }
            m4501();
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final Parcelable mo164() {
        C1812 c1812 = this.f342;
        if (c1812 != null) {
            C1812 c1813 = new C1812();
            c1813.f6005 = c1812.f6005;
            c1813.f6006 = c1812.f6006;
            c1813.f6007 = c1812.f6007;
            return c1813;
        }
        C1812 c1814 = new C1812();
        if (m4489() <= 0) {
            c1814.f6005 = -1;
            return c1814;
        }
        m173();
        boolean z = this.f335 ^ this.f337;
        c1814.f6007 = z;
        if (z) {
            View viewM183 = m183();
            c1814.f6006 = this.f334.mo2886() - this.f334.mo2881(viewM183);
            c1814.f6005 = AbstractC2546.m4482(viewM183);
            return c1814;
        }
        View viewM184 = m184();
        c1814.f6005 = AbstractC2546.m4482(viewM184);
        c1814.f6006 = this.f334.mo2884(viewM184) - this.f334.mo2890();
        return c1814;
    }

    @Override // p000.AbstractC2546
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
                RecyclerView recyclerView = this.f8093;
                iMin = Math.min(i2, mo116(recyclerView.f358, recyclerView.f411) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f8093;
                iMin = Math.min(i3, mo115(recyclerView2.f358, recyclerView2.f411) - 1);
            }
            if (iMin >= 0) {
                mo190(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ */
    public int mo128(int i, C2553 c2553, C2559 c2559) {
        if (this.f332 == 1) {
            return 0;
        }
        return m189(i, c2553, c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public void mo165(int i) {
        this.f340 = i;
        this.f341 = Integer.MIN_VALUE;
        C1812 c1812 = this.f342;
        if (c1812 != null) {
            c1812.f6005 = -1;
        }
        m4501();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public int mo129(int i, C2553 c2553, C2559 c2559) {
        if (this.f332 == 0) {
            return 0;
        }
        return m189(i, c2553, c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public final boolean mo166() {
        if (this.f8104 != 1073741824 && this.f8103 != 1073741824) {
            int iM4489 = m4489();
            for (int i = 0; i < iM4489; i++) {
                ViewGroup.LayoutParams layoutParams = m4488(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
    public void mo167(RecyclerView recyclerView, C2559 c2559, int i) {
        C1813 c1813 = new C1813(recyclerView.getContext());
        c1813.f6008 = i;
        m4508(c1813);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ */
    public boolean mo131() {
        return this.f342 == null && this.f335 == this.f338;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public void m168(C2559 c2559, int[] iArr) {
        int i;
        int iMo2891 = c2559.f8135 != -1 ? this.f334.mo2891() : 0;
        if (this.f333.f5998 == -1) {
            i = 0;
        } else {
            i = iMo2891;
            iMo2891 = 0;
        }
        iArr[0] = iMo2891;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ */
    public void mo132(C2559 c2559, C1811 c1811, C1447 c1447) {
        int i = c1811.f5996;
        if (i < 0 || i >= c2559.m4527()) {
            return;
        }
        c1447.m3241(i, Math.max(0, c1811.f5999));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public final int m169(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        m173();
        AbstractC1144 abstractC1144 = this.f334;
        boolean z = !this.f339;
        return AbstractC1586.m3471(c2559, abstractC1144, m176(z), m175(z), this, this.f339);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᤞᲀ, reason: contains not printable characters */
    public final int m170(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        m173();
        AbstractC1144 abstractC1144 = this.f334;
        boolean z = !this.f339;
        return AbstractC1586.m3472(c2559, abstractC1144, m176(z), m175(z), this, this.f339, this.f337);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᲀᤞ, reason: contains not printable characters */
    public final int m171(C2559 c2559) {
        if (m4489() == 0) {
            return 0;
        }
        m173();
        AbstractC1144 abstractC1144 = this.f334;
        boolean z = !this.f339;
        return AbstractC1586.m3473(c2559, abstractC1144, m176(z), m175(z), this, this.f339);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲀᲁ, reason: contains not printable characters */
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲁᲀ, reason: contains not printable characters */
    public final void m173() {
        if (this.f333 == null) {
            C1811 c1811 = new C1811();
            c1811.f5993 = true;
            c1811.f6000 = 0;
            c1811.f6001 = 0;
            c1811.f6003 = null;
            this.f333 = c1811;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᤞᲁ, reason: contains not printable characters */
    public final int m174(C2553 c2553, C1811 c1811, C2559 c2559, boolean z) {
        int i;
        int i2 = c1811.f5995;
        int i3 = c1811.f5999;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c1811.f5999 = i3 + i2;
            }
            m186(c2553, c1811);
        }
        int i4 = c1811.f5995 + c1811.f6000;
        while (true) {
            if ((!c1811.f6004 && i4 <= 0) || (i = c1811.f5996) < 0 || i >= c2559.m4527()) {
                break;
            }
            C1810 c1810 = this.f344;
            c1810.f5989 = 0;
            c1810.f5990 = false;
            c1810.f5991 = false;
            c1810.f5992 = false;
            mo134(c2553, c2559, c1811, c1810);
            if (!c1810.f5990) {
                int i5 = c1811.f5994;
                int i6 = c1810.f5989;
                c1811.f5994 = (c1811.f5998 * i6) + i5;
                if (!c1810.f5991 || c1811.f6003 != null || !c2559.f8141) {
                    c1811.f5995 -= i6;
                    i4 -= i6;
                }
                int i7 = c1811.f5999;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c1811.f5999 = i8;
                    int i9 = c1811.f5995;
                    if (i9 < 0) {
                        c1811.f5999 = i8 + i9;
                    }
                    m186(c2553, c1811);
                }
                if (z && c1810.f5992) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c1811.f5995;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲀᲁᤞ, reason: contains not printable characters */
    public final View m175(boolean z) {
        return this.f337 ? m180(0, m4489(), z) : m180(m4489() - 1, -1, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᤞᲀ, reason: contains not printable characters */
    public final View m176(boolean z) {
        return this.f337 ? m180(m4489() - 1, -1, z) : m180(0, m4489(), z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᲀᤞ, reason: contains not printable characters */
    public int mo177() {
        View viewM180 = m180(0, m4489(), false);
        if (viewM180 == null) {
            return -1;
        }
        return AbstractC2546.m4482(viewM180);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
    public int mo178() {
        View viewM180 = m180(m4489() - 1, -1, false);
        if (viewM180 == null) {
            return -1;
        }
        return AbstractC2546.m4482(viewM180);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ, reason: contains not printable characters */
    public final View m179(int i, int i2) {
        int i3;
        int i4;
        m173();
        if (i2 <= i && i2 >= i) {
            return m4488(i);
        }
        if (this.f334.mo2884(m4488(i)) < this.f334.mo2890()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = r.a.a;
        }
        return this.f332 == 0 ? this.f8094.m4837(i, i2, i3, i4) : this.f8095.m4837(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲀᲇ, reason: contains not printable characters */
    public final View m180(int i, int i2, boolean z) {
        m173();
        int i3 = z ? 24579 : 320;
        return this.f332 == 0 ? this.f8094.m4837(i, i2, i3, 320) : this.f8095.m4837(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ */
    public View mo133(C2553 c2553, C2559 c2559, boolean z, boolean z2) {
        int i;
        int iM4489;
        int i2;
        m173();
        int iM44810 = m4489();
        if (z2) {
            iM4489 = m4489() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM44810;
            iM4489 = 0;
            i2 = 1;
        }
        int iM4527 = c2559.m4527();
        int iMo2890 = this.f334.mo2890();
        int iMo2886 = this.f334.mo2886();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM4489 != i) {
            View viewM4488 = m4488(iM4489);
            int iM4482 = AbstractC2546.m4482(viewM4488);
            int iMo2884 = this.f334.mo2884(viewM4488);
            int iMo2881 = this.f334.mo2881(viewM4488);
            if (iM4482 >= 0 && iM4482 < iM4527) {
                if (!((C2547) viewM4488.getLayoutParams()).f8107.m4540()) {
                    boolean z3 = iMo2881 <= iMo2890 && iMo2884 < iMo2890;
                    boolean z4 = iMo2884 >= iMo2886 && iMo2881 > iMo2886;
                    if (!z3 && !z4) {
                        return viewM4488;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM4488;
                        } else if (view == null) {
                            view = viewM4488;
                        }
                    } else if (z3) {
                        view2 = viewM4488;
                    } else if (view == null) {
                        view = viewM4488;
                    }
                } else if (view3 == null) {
                    view3 = viewM4488;
                }
            }
            iM4489 += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲀᲁ, reason: contains not printable characters */
    public final int m181(int i, C2553 c2553, C2559 c2559, boolean z) {
        int iMo2886;
        int iMo2887 = this.f334.mo2886() - i;
        if (iMo2887 <= 0) {
            return 0;
        }
        int i2 = -m189(-iMo2887, c2553, c2559);
        int i3 = i + i2;
        if (!z || (iMo2886 = this.f334.mo2886() - i3) <= 0) {
            return i2;
        }
        this.f334.mo2894(iMo2886);
        return iMo2886 + i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲁᲀ, reason: contains not printable characters */
    public final int m182(int i, C2553 c2553, C2559 c2559, boolean z) {
        int iMo2890;
        int iMo2891 = i - this.f334.mo2890();
        if (iMo2891 <= 0) {
            return 0;
        }
        int i2 = -m189(iMo2891, c2553, c2559);
        int i3 = i + i2;
        if (!z || (iMo2890 = i3 - this.f334.mo2890()) <= 0) {
            return i2;
        }
        this.f334.mo2894(-iMo2890);
        return i2 - iMo2890;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲁᲇ, reason: contains not printable characters */
    public final View m183() {
        return m4488(this.f337 ? 0 : m4489() - 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲇᲁ, reason: contains not printable characters */
    public final View m184() {
        return m4488(this.f337 ? m4489() - 1 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᤞᲇ, reason: contains not printable characters */
    public final boolean m185() {
        return this.f8093.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ */
    public void mo134(C2553 c2553, C2559 c2559, C1811 c1811, C1810 c1810) {
        int iM4492;
        int i;
        int i2;
        int iMo2883;
        View viewM3696 = c1811.m3696(c2553);
        if (viewM3696 == null) {
            c1810.f5990 = true;
            return;
        }
        C2547 c2547 = (C2547) viewM3696.getLayoutParams();
        if (c1811.f6003 == null) {
            if (this.f337 == (c1811.f5998 == -1)) {
                m4486(viewM3696, -1, false);
            } else {
                m4486(viewM3696, 0, false);
            }
        } else {
            if (this.f337 == (c1811.f5998 == -1)) {
                m4486(viewM3696, -1, true);
            } else {
                m4486(viewM3696, 0, true);
            }
        }
        C2547 c2548 = (C2547) viewM3696.getLayoutParams();
        Rect rectM233 = this.f8093.m233(viewM3696);
        int i3 = rectM233.left + rectM233.right;
        int i4 = rectM233.top + rectM233.bottom;
        int iM4475 = AbstractC2546.m4475(this.f8105, this.f8103, m4493() + m4492() + ((ViewGroup.MarginLayoutParams) c2548).leftMargin + ((ViewGroup.MarginLayoutParams) c2548).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c2548).width, mo152());
        int iM4476 = AbstractC2546.m4475(this.f8106, this.f8104, m4491() + m4494() + ((ViewGroup.MarginLayoutParams) c2548).topMargin + ((ViewGroup.MarginLayoutParams) c2548).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c2548).height, mo153());
        if (m4506(viewM3696, iM4475, iM4476, c2548)) {
            viewM3696.measure(iM4475, iM4476);
        }
        c1810.f5989 = this.f334.mo2882(viewM3696);
        if (this.f332 == 1) {
            if (m185()) {
                iMo2883 = this.f8105 - m4493();
                iM4492 = iMo2883 - this.f334.mo2883(viewM3696);
            } else {
                iM4492 = m4492();
                iMo2883 = this.f334.mo2883(viewM3696) + iM4492;
            }
            if (c1811.f5998 == -1) {
                i = c1811.f5994;
                i2 = i - c1810.f5989;
            } else {
                i2 = c1811.f5994;
                i = c1810.f5989 + i2;
            }
        } else {
            int iM4494 = m4494();
            int iMo2884 = this.f334.mo2883(viewM3696) + iM4494;
            if (c1811.f5998 == -1) {
                int i5 = c1811.f5994;
                int i6 = i5 - c1810.f5989;
                iMo2883 = i5;
                i = iMo2884;
                iM4492 = i6;
                i2 = iM4494;
            } else {
                int i7 = c1811.f5994;
                int i8 = c1810.f5989 + i7;
                iM4492 = i7;
                i = iMo2884;
                i2 = iM4494;
                iMo2883 = i8;
            }
        }
        AbstractC2546.m4485(viewM3696, iM4492, i2, iMo2883, i);
        if (c2547.f8107.m4540() || c2547.f8107.m4543()) {
            c1810.f5991 = true;
        }
        c1810.f5992 = viewM3696.hasFocusable();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᲁᤞ, reason: contains not printable characters */
    public final void m186(C2553 c2553, C1811 c1811) {
        if (!c1811.f5993 || c1811.f6004) {
            return;
        }
        int i = c1811.f5999;
        int i2 = c1811.f6001;
        if (c1811.f5998 == -1) {
            int iM4489 = m4489();
            if (i < 0) {
                return;
            }
            int iMo2885 = (this.f334.mo2885() - i) + i2;
            if (this.f337) {
                for (int i3 = 0; i3 < iM4489; i3++) {
                    View viewM4488 = m4488(i3);
                    if (this.f334.mo2884(viewM4488) < iMo2885 || this.f334.mo2893(viewM4488) < iMo2885) {
                        m187(c2553, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4489 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM4489 = m4488(i5);
                if (this.f334.mo2884(viewM4489) < iMo2885 || this.f334.mo2893(viewM4489) < iMo2885) {
                    m187(c2553, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM44810 = m4489();
        if (!this.f337) {
            for (int i7 = 0; i7 < iM44810; i7++) {
                View viewM44810 = m4488(i7);
                if (this.f334.mo2881(viewM44810) > i6 || this.f334.mo2892(viewM44810) > i6) {
                    m187(c2553, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM44810 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM44811 = m4488(i9);
            if (this.f334.mo2881(viewM44811) > i6 || this.f334.mo2892(viewM44811) > i6) {
                m187(c2553, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲀᲇ, reason: contains not printable characters */
    public final void m187(C2553 c2553, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM4488 = m4488(i);
                m4500(i);
                c2553.m4518(viewM4488);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM4489 = m4488(i3);
            m4500(i3);
            c2553.m4518(viewM4489);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲇᲀ, reason: contains not printable characters */
    public final void m188() {
        if (this.f332 == 1 || !m185()) {
            this.f337 = this.f336;
        } else {
            this.f337 = !this.f336;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᤞᲇ, reason: contains not printable characters */
    public final int m189(int i, C2553 c2553, C2559 c2559) {
        if (m4489() != 0 && i != 0) {
            m173();
            this.f333.f5993 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m192(i2, iAbs, true, c2559);
            C1811 c1811 = this.f333;
            int iM174 = m174(c2553, c1811, c2559, false) + c1811.f5999;
            if (iM174 >= 0) {
                if (iAbs > iM174) {
                    i = i2 * iM174;
                }
                this.f334.mo2894(-i);
                this.f333.f6002 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
    public void mo190(int i, int i2) {
        this.f340 = i;
        this.f341 = i2;
        C1812 c1812 = this.f342;
        if (c1812 != null) {
            c1812.f6005 = -1;
        }
        m4501();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
    public final void m191(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "invalid orientation:"));
        }
        mo151(null);
        if (i != this.f332 || this.f334 == null) {
            AbstractC1144 abstractC1144M2880 = AbstractC1144.m2880(this, i);
            this.f334 = abstractC1144M2880;
            this.f343.f5984 = abstractC1144M2880;
            this.f332 = i;
            m4501();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᲀᤞ */
    public void mo136(boolean z) {
        mo151(null);
        if (this.f338 == z) {
            return;
        }
        this.f338 = z;
        m4501();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᤞᲀᲁ, reason: contains not printable characters */
    public final void m192(int i, int i2, boolean z, C2559 c2559) {
        int iMo2890;
        this.f333.f6004 = this.f334.mo2888() == 0 && this.f334.mo2885() == 0;
        this.f333.f5998 = i;
        int[] iArr = this.f346;
        iArr[0] = 0;
        iArr[1] = 0;
        m168(c2559, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C1811 c1811 = this.f333;
        int i3 = z2 ? iMax2 : iMax;
        c1811.f6000 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c1811.f6001 = iMax;
        if (z2) {
            c1811.f6000 = this.f334.mo2887() + i3;
            View viewM183 = m183();
            C1811 c1812 = this.f333;
            c1812.f5997 = this.f337 ? -1 : 1;
            int iM4482 = AbstractC2546.m4482(viewM183);
            C1811 c1813 = this.f333;
            c1812.f5996 = iM4482 + c1813.f5997;
            c1813.f5994 = this.f334.mo2881(viewM183);
            iMo2890 = this.f334.mo2881(viewM183) - this.f334.mo2886();
        } else {
            View viewM184 = m184();
            C1811 c1814 = this.f333;
            c1814.f6000 = this.f334.mo2890() + c1814.f6000;
            C1811 c1815 = this.f333;
            c1815.f5997 = this.f337 ? 1 : -1;
            int iM4483 = AbstractC2546.m4482(viewM184);
            C1811 c1816 = this.f333;
            c1815.f5996 = iM4483 + c1816.f5997;
            c1816.f5994 = this.f334.mo2884(viewM184);
            iMo2890 = (-this.f334.mo2884(viewM184)) + this.f334.mo2890();
        }
        C1811 c1817 = this.f333;
        c1817.f5995 = i2;
        if (z) {
            c1817.f5995 = i2 - iMo2890;
        }
        c1817.f5999 = iMo2890;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᤞᲁᲀ, reason: contains not printable characters */
    public final void m193(int i, int i2) {
        this.f333.f5995 = this.f334.mo2886() - i2;
        C1811 c1811 = this.f333;
        c1811.f5997 = this.f337 ? -1 : 1;
        c1811.f5996 = i;
        c1811.f5998 = 1;
        c1811.f5994 = i2;
        c1811.f5999 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᤞᲁ, reason: contains not printable characters */
    public final void m194(int i, int i2) {
        this.f333.f5995 = i2 - this.f334.mo2890();
        C1811 c1811 = this.f333;
        c1811.f5996 = i;
        c1811.f5997 = this.f337 ? 1 : -1;
        c1811.f5998 = -1;
        c1811.f5994 = i2;
        c1811.f5999 = Integer.MIN_VALUE;
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
        this.f343 = new C1809();
        this.f344 = new C1810();
        this.f345 = 2;
        this.f346 = new int[2];
        C2545 c2545M4483 = AbstractC2546.m4483(context, attributeSet, i, i2);
        m191(c2545M4483.f8088);
        boolean z = c2545M4483.f8090;
        mo151(null);
        if (z != this.f336) {
            this.f336 = z;
            m4501();
        }
        mo136(c2545M4483.f8091);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public void mo161(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ */
    public void mo135(C2553 c2553, C2559 c2559, C1809 c1809, int i) {
    }
}
