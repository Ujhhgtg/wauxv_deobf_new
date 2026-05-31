package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import p000.AbstractC1095;
import p000.AbstractC1492;
import p000.AbstractC2537;
import p000.AbstractC2546;
import p000.AbstractC2563;
import p000.AbstractC2844;
import p000.AbstractC3638;
import p000.C0093;
import p000.C0099;
import p000.C0100;
import p000.C1447;
import p000.C1490;
import p000.C1491;
import p000.C1809;
import p000.C1810;
import p000.C1811;
import p000.C2547;
import p000.C2553;
import p000.C2559;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static final Set f320 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(Opcodes.IXOR))));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean f321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int[] f323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public View[] f324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final SparseIntArray f325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final SparseIntArray f326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public AbstractC1492 f327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final Rect f328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public int f329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public int f330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public int f331;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f321 = false;
        this.f322 = -1;
        this.f325 = new SparseIntArray();
        this.f326 = new SparseIntArray();
        this.f327 = new C1490();
        this.f328 = new Rect();
        this.f329 = -1;
        this.f330 = -1;
        this.f331 = -1;
        m148(AbstractC2546.m4483(context, attributeSet, i, i2).f8089);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo107(C2547 c2547) {
        return c2547 instanceof C1491;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int mo108(C2559 c2559) {
        return m170(c2559);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int mo109(C2559 c2559) {
        return m171(c2559);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int mo110(C2559 c2559) {
        return m170(c2559);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int mo111(C2559 c2559) {
        return m171(c2559);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C2547 mo112() {
        return this.f332 == 0 ? new C1491(-2, -1) : new C1491(-1, -2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final C2547 mo113(Context context, AttributeSet attributeSet) {
        C1491 c1491 = new C1491(context, attributeSet);
        c1491.f5285 = -1;
        c1491.f5286 = 0;
        return c1491;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2547 mo114(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1491 c1491 = new C1491((ViewGroup.MarginLayoutParams) layoutParams);
            c1491.f5285 = -1;
            c1491.f5286 = 0;
            return c1491;
        }
        C1491 c1492 = new C1491(layoutParams);
        c1492.f5285 = -1;
        c1492.f5286 = 0;
        return c1492;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int mo115(C2553 c2553, C2559 c2559) {
        if (this.f332 == 1) {
            return Math.min(this.f322, m4490());
        }
        if (c2559.m4527() < 1) {
            return 0;
        }
        return m144(c2559.m4527() - 1, c2553, c2559) + 1;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final int mo116(C2553 c2553, C2559 c2559) {
        if (this.f332 == 0) {
            return Math.min(this.f322, m4490());
        }
        if (c2559.m4527() < 1) {
            return 0;
        }
        return m144(c2559.m4527() - 1, c2553, c2559) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo117(View view, int i, C2553 c2553, C2559 c2559) {
        View viewM225;
        int iM4489;
        int i2;
        int iM44810;
        View view2;
        View view3;
        int i3;
        int i4;
        C2553 c2554 = c2553;
        C2559 c25510 = c2559;
        RecyclerView recyclerView = this.f8093;
        if (recyclerView == null || (viewM225 = recyclerView.m225(view)) == null || ((ArrayList) this.f8092.f2307).contains(viewM225)) {
            viewM225 = null;
        }
        if (viewM225 != null) {
            C1491 c1491 = (C1491) viewM225.getLayoutParams();
            int i5 = c1491.f5285;
            int i6 = c1491.f5286 + i5;
            if (super.mo117(view, i, c2553, c2559) != null) {
                if ((m172(i) == 1) != this.f337) {
                    iM44810 = m4489() - 1;
                    iM4489 = -1;
                    i2 = -1;
                } else {
                    iM4489 = m4489();
                    i2 = 1;
                    iM44810 = 0;
                }
                boolean z = this.f332 == 1 && m185();
                int iM144 = m144(iM44810, c2554, c25510);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM44810;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iM4489) {
                        break;
                    }
                    int iM145 = m144(i9, c2554, c25510);
                    View viewM4488 = m4488(i9);
                    if (viewM4488 == viewM225) {
                        break;
                    }
                    if (!viewM4488.hasFocusable() || iM145 == iM144) {
                        C1491 c1492 = (C1491) viewM4488.getLayoutParams();
                        int i10 = c1492.f5285;
                        view3 = viewM225;
                        int i11 = c1492.f5286 + i10;
                        if (viewM4488.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM4488;
                        }
                        if (!(viewM4488.hasFocusable() && view4 == null) && (viewM4488.hasFocusable() || view2 != null)) {
                            i3 = iM4489;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM4488.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view4 == null) {
                                i4 = iMin;
                                if (!this.f8094.m4838(viewM4488) || !this.f8095.m4838(viewM4488)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            c2554 = c2553;
                            c25510 = c2559;
                            viewM225 = view3;
                            iM4489 = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM4489;
                        }
                        if (viewM4488.hasFocusable()) {
                            int i12 = c1492.f5285;
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewM4488;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            int i13 = c1492.f5285;
                            view5 = viewM4488;
                            i7 = i13;
                            iMin = i4;
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                        }
                        i9 += i2;
                        c2554 = c2553;
                        c25510 = c2559;
                        viewM225 = view3;
                        iM4489 = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM225;
                        i4 = iMin;
                        i3 = iM4489;
                    }
                    view5 = view2;
                    iMin = i4;
                    i9 += i2;
                    c2554 = c2553;
                    c25510 = c2559;
                    viewM225 = view3;
                    iM4489 = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public final void mo118(C2553 c2553, C2559 c2559, C0100 c0100) {
        super.mo118(c2553, c2559, c0100);
        c0100.m1241(GridView.class.getName());
        AbstractC2537 abstractC2537 = this.f8093.f368;
        if (abstractC2537 == null || abstractC2537.mo2124() <= 1) {
            return;
        }
        c0100.m1235(C0093.f1105);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public final void mo119(C2553 c2553, C2559 c2559, View view, C0100 c0100) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1491)) {
            m4496(view, c0100);
            return;
        }
        C1491 c1491 = (C1491) layoutParams;
        int iM144 = m144(c1491.f8107.m4534(), c2553, c2559);
        if (this.f332 == 0) {
            c0100.m1242(C0099.m1231(c1491.f5285, c1491.f5286, iM144, 1, false));
        } else {
            c0100.m1242(C0099.m1231(iM144, 1, c1491.f5285, c1491.f5286, false));
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public final void mo120(int i, int i2) {
        this.f327.m3418();
        ((SparseIntArray) this.f327.f5288).clear();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final void mo121() {
        this.f327.m3418();
        ((SparseIntArray) this.f327.f5288).clear();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public final void mo122(int i, int i2) {
        this.f327.m3418();
        ((SparseIntArray) this.f327.f5288).clear();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public final void mo123(int i, int i2) {
        this.f327.m3418();
        ((SparseIntArray) this.f327.f5288).clear();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public final void mo124(int i, int i2) {
        this.f327.m3418();
        ((SparseIntArray) this.f327.f5288).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public final void mo125(C2553 c2553, C2559 c2559) {
        boolean z = c2559.f8141;
        SparseIntArray sparseIntArray = this.f326;
        SparseIntArray sparseIntArray2 = this.f325;
        if (z) {
            int iM4489 = m4489();
            for (int i = 0; i < iM4489; i++) {
                C1491 c1491 = (C1491) m4488(i).getLayoutParams();
                int iM4534 = c1491.f8107.m4534();
                sparseIntArray2.put(iM4534, c1491.f5286);
                sparseIntArray.put(iM4534, c1491.f5285);
            }
        }
        super.mo125(c2553, c2559);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final void mo126(C2559 c2559) {
        View viewMo158;
        super.mo126(c2559);
        this.f321 = false;
        int i = this.f329;
        if (i == -1 || (viewMo158 = mo158(i)) == null) {
            return;
        }
        viewMo158.sendAccessibilityEvent(67108864);
        this.f329 = -1;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a6 A[EDGE_INSN: B:122:0x01a6->B:166:0x0279 BREAK  A[LOOP:2: B:126:0x01b6->B:135:0x01df, LOOP_LABEL: LOOP:2: B:126:0x01b6->B:135:0x01df]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d7 A[LOOP:3: B:129:0x01c4->B:134:0x01d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x0210  */
    /* JADX WARN: Code duplicated, block: B:143:0x0212  */
    /* JADX WARN: Code duplicated, block: B:145:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0240  */
    /* JADX WARN: Code duplicated, block: B:163:0x025f  */
    /* JADX WARN: Code duplicated, block: B:167:0x027b  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ea->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x0259->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final boolean mo127(int i, Bundle bundle) {
        View viewM4488;
        AbstractC2563 abstractC2563M232;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == C0093.f1105.m1207() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= m4489()) {
                    viewM4488 = null;
                    break;
                }
                if (m4488(i5).isAccessibilityFocused()) {
                    viewM4488 = m4488(i5);
                    break;
                }
                i5++;
            }
            if (viewM4488 != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f320.contains(Integer.valueOf(i6)) && (abstractC2563M232 = this.f8093.m232(viewM4488)) != null) {
                    int iM4532 = abstractC2563M232.m4532();
                    int iM140 = m140(iM4532);
                    int iM139 = m139(iM4532);
                    if (iM140 >= 0 && iM139 >= 0) {
                        if (!m141(iM4532).contains(Integer.valueOf(this.f330)) || !m142(m139(iM4532), iM4532).contains(Integer.valueOf(this.f331))) {
                            this.f330 = iM140;
                            this.f331 = iM139;
                        }
                        int i7 = this.f330;
                        if (i7 == -1) {
                            i7 = iM140;
                        }
                        int i8 = this.f331;
                        if (i8 != -1) {
                            iM139 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iM4532 - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM141 = m140(iIntValue);
                                    int iM1310 = m139(iIntValue);
                                    if (iM141 >= 0 && iM1310 >= 0) {
                                        if (this.f332 != 1) {
                                            if (m141(iIntValue).contains(Integer.valueOf(i7)) && iM1310 < iM139) {
                                                this.f331 = iM1310;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iM141 == i7 && iM1310 < iM139) || iM141 < i7) {
                                                this.f330 = iM141;
                                                this.f331 = iM1310;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4490()) {
                                                    it2 = m141(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM140) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f330 = iIntValue2;
                                                                this.f331 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM140 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m4490()) {
                                                it4 = m141(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM140) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f330 = iIntValue3;
                                                            this.f331 = m139(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iM4532 - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM142 = m140(iIntValue);
                                    int iM1311 = m139(iIntValue);
                                    if (iM142 >= 0 && iM1311 >= 0) {
                                        if (this.f332 != 1) {
                                            if (iM142 < i7 && iM1311 == iM139) {
                                                this.f330 = ((Integer) Collections.max(m141(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iM142 < i7 && m142(m139(iIntValue), iIntValue).contains(Integer.valueOf(iM139))) {
                                                this.f330 = iM142;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4490()) {
                                                    it2 = m141(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM140) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f330 = iIntValue2;
                                                                this.f331 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM140 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m4490()) {
                                                it4 = m141(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM140) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f330 = iIntValue3;
                                                            this.f331 = m139(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iM4532 + 1;
                            while (true) {
                                if (iIntValue < m4490()) {
                                    int iM143 = m140(iIntValue);
                                    int iM1312 = m139(iIntValue);
                                    if (iM143 >= 0 && iM1312 >= 0) {
                                        if (this.f332 != 1) {
                                            if (iM1312 > iM139 && m141(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.f331 = iM1312;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iM143 == i7 && iM1312 > iM139) || iM143 > i7) {
                                                this.f330 = iM143;
                                                this.f331 = iM1312;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4490()) {
                                                    it2 = m141(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM140) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f330 = iIntValue2;
                                                                this.f331 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM140 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m4490()) {
                                                it4 = m141(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM140) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f330 = iIntValue3;
                                                            this.f331 = m139(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iM4532 + 1;
                            while (true) {
                                if (iIntValue < m4490()) {
                                    int iM144 = m140(iIntValue);
                                    int iM1313 = m139(iIntValue);
                                    if (iM144 >= 0 && iM1313 >= 0) {
                                        if (this.f332 != 1) {
                                            if (iM144 > i7 && iM1313 == iM139) {
                                                this.f330 = m140(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iM144 > i7 && (iM1313 == iM139 || m142(m139(iIntValue), iIntValue).contains(Integer.valueOf(iM139)))) {
                                                this.f330 = iM144;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.f332) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM140 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < m4490()) {
                                                it2 = m141(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iM140) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f330 = iIntValue2;
                                                            this.f331 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iM140 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < m4490()) {
                                            it4 = m141(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iM140) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f330 = iIntValue3;
                                                        this.f331 = m139(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo127(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMo2124 = this.f8093.f368.mo2124();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo2124) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f8093;
                    int iM145 = m145(i11, recyclerView.f358, recyclerView.f411);
                    RecyclerView recyclerView2 = this.f8093;
                    int iM146 = m144(i11, recyclerView2.f358, recyclerView2.f411);
                    if (this.f332 != 1) {
                        if (iM145 == i9 && iM146 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM145 == i10 && iM146 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    mo190(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public final int mo128(int i, C2553 c2553, C2559 c2559) {
        m149();
        m138();
        return super.mo128(i, c2553, c2559);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public final int mo129(int i, C2553 c2553, C2559 c2559) {
        m149();
        m138();
        return super.mo129(i, c2553, c2559);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public final void mo130(Rect rect, int i, int i2) {
        int iM4474;
        int iM4475;
        if (this.f323 == null) {
            super.mo130(rect, i, i2);
        }
        int iM4493 = m4493() + m4492();
        int iM4491 = m4491() + m4494();
        if (this.f332 == 1) {
            int iHeight = rect.height() + iM4491;
            RecyclerView recyclerView = this.f8093;
            Field field = AbstractC3638.f11333;
            iM4475 = AbstractC2546.m4474(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f323;
            iM4474 = AbstractC2546.m4474(i, iArr[iArr.length - 1] + iM4493, this.f8093.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4493;
            RecyclerView recyclerView2 = this.f8093;
            Field field2 = AbstractC3638.f11333;
            iM4474 = AbstractC2546.m4474(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f323;
            iM4475 = AbstractC2546.m4474(i2, iArr2[iArr2.length - 1] + iM4491, this.f8093.getMinimumHeight());
        }
        this.f8093.setMeasuredDimension(iM4474, iM4475);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
    public final boolean mo131() {
        return this.f342 == null && !this.f321;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public final void mo132(C2559 c2559, C1811 c1811, C1447 c1447) {
        int i;
        int iMo3416 = this.f322;
        for (int i2 = 0; i2 < this.f322 && (i = c1811.f5996) >= 0 && i < c2559.m4527() && iMo3416 > 0; i2++) {
            int i3 = c1811.f5996;
            c1447.m3241(i3, Math.max(0, c1811.f5999));
            iMo3416 -= this.f327.mo3416(i3);
            c1811.f5996 += c1811.f5997;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
    public final View mo133(C2553 c2553, C2559 c2559, boolean z, boolean z2) {
        int i;
        int iM4489;
        int iM44810 = m4489();
        int i2 = 1;
        if (z2) {
            iM4489 = m4489() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM44810;
            iM4489 = 0;
        }
        int iM4527 = c2559.m4527();
        m173();
        int iMo2890 = this.f334.mo2890();
        int iMo2886 = this.f334.mo2886();
        View view = null;
        View view2 = null;
        while (iM4489 != i) {
            View viewM4488 = m4488(iM4489);
            int iM4482 = AbstractC2546.m4482(viewM4488);
            if (iM4482 >= 0 && iM4482 < iM4527 && m145(iM4482, c2553, c2559) == 0) {
                if (((C2547) viewM4488.getLayoutParams()).f8107.m4540()) {
                    if (view2 == null) {
                        view2 = viewM4488;
                    }
                } else {
                    if (this.f334.mo2884(viewM4488) < iMo2886 && this.f334.mo2881(viewM4488) >= iMo2890) {
                        return viewM4488;
                    }
                    if (view == null) {
                        view = viewM4488;
                    }
                }
            }
            iM4489 += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ, reason: contains not printable characters */
    public final void mo134(C2553 c2553, C2559 c2559, C1811 c1811, C1810 c1810) {
        int i;
        int i2;
        int i3;
        int iMo2883;
        int iM4492;
        int iMo2884;
        int iM4475;
        int iM4476;
        ?? r12;
        int i4;
        View viewM3696;
        int iMo2889 = this.f334.mo2889();
        boolean z = iMo2889 != 1073741824;
        int i5 = m4489() > 0 ? this.f323[this.f322] : 0;
        if (z) {
            m149();
        }
        boolean z2 = c1811.f5997 == 1;
        int iM145 = this.f322;
        if (!z2) {
            iM145 = m145(c1811.f5996, c2553, c2559) + m146(c1811.f5996, c2553, c2559);
        }
        int i6 = 0;
        while (i6 < this.f322 && (i4 = c1811.f5996) >= 0 && i4 < c2559.m4527() && iM145 > 0) {
            int i7 = c1811.f5996;
            int iM146 = m146(i7, c2553, c2559);
            if (iM146 > this.f322) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iM146);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC2844.m4785(sb, this.f322, " spans."));
            }
            iM145 -= iM146;
            if (iM145 < 0 || (viewM3696 = c1811.m3696(c2553)) == null) {
                break;
            }
            this.f324[i6] = viewM3696;
            i6++;
        }
        if (i6 == 0) {
            c1810.f5990 = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f324[i];
            C1491 c1491 = (C1491) view.getLayoutParams();
            int iM147 = m146(AbstractC2546.m4482(view), c2553, c2559);
            c1491.f5286 = iM147;
            c1491.f5285 = i8;
            i8 += iM147;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f324[i10];
            if (c1811.f6003 != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m4486(view2, -1, true);
                } else {
                    m4486(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m4486(view2, -1, false);
            } else {
                r12 = 0;
                m4486(view2, 0, false);
            }
            RecyclerView recyclerView = this.f8093;
            Rect rect = this.f328;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m233(view2));
            }
            m147(view2, iMo2889, r12);
            int iMo2882 = this.f334.mo2882(view2);
            if (iMo2882 > i9) {
                i9 = iMo2882;
            }
            float fMo2883 = (this.f334.mo2883(view2) * 1.0f) / ((C1491) view2.getLayoutParams()).f5286;
            if (fMo2883 > f) {
                f = fMo2883;
            }
        }
        if (z) {
            m137(Math.max(Math.round(f * this.f322), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f324[i11];
                m147(view3, 1073741824, true);
                int iMo2885 = this.f334.mo2882(view3);
                if (iMo2885 > i9) {
                    i9 = iMo2885;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f324[i12];
            if (this.f334.mo2882(view4) != i9) {
                C1491 c1492 = (C1491) view4.getLayoutParams();
                Rect rect2 = c1492.f8108;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1492).topMargin + ((ViewGroup.MarginLayoutParams) c1492).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1492).leftMargin + ((ViewGroup.MarginLayoutParams) c1492).rightMargin;
                int iM143 = m143(c1492.f5285, c1492.f5286);
                if (this.f332 == 1) {
                    iM4476 = AbstractC2546.m4475(iM143, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c1492).width, false);
                    iM4475 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4475 = AbstractC2546.m4475(iM143, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c1492).height, false);
                    iM4476 = iMakeMeasureSpec;
                }
                if (m4507(view4, iM4476, iM4475, (C2547) view4.getLayoutParams())) {
                    view4.measure(iM4476, iM4475);
                }
            }
        }
        int iM4494 = 0;
        c1810.f5989 = i9;
        if (this.f332 != 1) {
            if (c1811.f5998 == -1) {
                int i15 = c1811.f5994;
                iM4492 = i15 - i9;
                iMo2883 = i15;
            } else {
                int i16 = c1811.f5994;
                iMo2883 = i16 + i9;
                iM4492 = i16;
            }
            iMo2884 = iM4494;
        } else if (c1811.f5998 == -1) {
            iMo2884 = c1811.f5994;
            iM4494 = iMo2884 - i9;
            iM4492 = 0;
            iMo2883 = 0;
        } else {
            int i17 = c1811.f5994;
            iMo2883 = 0;
            iM4494 = i17;
            iMo2884 = i17 + i9;
            iM4492 = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f324[i18];
            C1491 c1493 = (C1491) view5.getLayoutParams();
            if (this.f332 != 1) {
                iM4494 = m4494() + this.f323[c1493.f5285];
                iMo2884 = this.f334.mo2883(view5) + iM4494;
            } else if (m185()) {
                int iM4493 = m4492() + this.f323[this.f322 - c1493.f5285];
                iMo2883 = iM4493;
                iM4492 = iM4493 - this.f334.mo2883(view5);
            } else {
                iM4492 = m4492() + this.f323[c1493.f5285];
                iMo2883 = this.f334.mo2883(view5) + iM4492;
            }
            AbstractC2546.m4485(view5, iM4492, iM4494, iMo2883, iMo2884);
            if (c1493.f8107.m4540() || c1493.f8107.m4543()) {
                c1810.f5991 = true;
            }
            c1810.f5992 = view5.hasFocusable() | c1810.f5992;
        }
        Arrays.fill(this.f324, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ, reason: contains not printable characters */
    public final void mo135(C2553 c2553, C2559 c2559, C1809 c1809, int i) {
        m149();
        if (c2559.m4527() > 0 && !c2559.f8141) {
            boolean z = i == 1;
            int iM145 = m145(c1809.f5985, c2553, c2559);
            if (z) {
                while (iM145 > 0) {
                    int i2 = c1809.f5985;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1809.f5985 = i3;
                    iM145 = m145(i3, c2553, c2559);
                }
            } else {
                int iM4527 = c2559.m4527() - 1;
                int i4 = c1809.f5985;
                while (i4 < iM4527) {
                    int i5 = i4 + 1;
                    int iM146 = m145(i5, c2553, c2559);
                    if (iM146 <= iM145) {
                        break;
                    }
                    i4 = i5;
                    iM145 = iM146;
                }
                c1809.f5985 = i4;
            }
        }
        m138();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᲀᤞ, reason: contains not printable characters */
    public final void mo136(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo136(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᲁᤞ, reason: contains not printable characters */
    public final void m137(int i) {
        int i2;
        int[] iArr = this.f323;
        int i3 = this.f322;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f323 = iArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲁᤞᲀ, reason: contains not printable characters */
    public final void m138() {
        View[] viewArr = this.f324;
        if (viewArr == null || viewArr.length != this.f322) {
            this.f324 = new View[this.f322];
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲁᲀᤞ, reason: contains not printable characters */
    public final int m139(int i) {
        if (this.f332 == 0) {
            RecyclerView recyclerView = this.f8093;
            return m144(i, recyclerView.f358, recyclerView.f411);
        }
        RecyclerView recyclerView2 = this.f8093;
        return m145(i, recyclerView2.f358, recyclerView2.f411);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m140(int i) {
        if (this.f332 == 1) {
            RecyclerView recyclerView = this.f8093;
            return m144(i, recyclerView.f358, recyclerView.f411);
        }
        RecyclerView recyclerView2 = this.f8093;
        return m145(i, recyclerView2.f358, recyclerView2.f411);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashSet m141(int i) {
        return m142(m140(i), i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashSet m142(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f8093;
        int iM146 = m146(i2, recyclerView.f358, recyclerView.f411);
        for (int i3 = i; i3 < i + iM146; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m143(int i, int i2) {
        if (this.f332 != 1 || !m185()) {
            int[] iArr = this.f323;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f323;
        int i3 = this.f322;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m144(int i, C2553 c2553, C2559 c2559) {
        if (!c2559.f8141) {
            return this.f327.m3417(i, this.f322);
        }
        int iM4512 = c2553.m4512(i);
        if (iM4512 != -1) {
            return this.f327.m3417(iM4512, this.f322);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m145(int i, C2553 c2553, C2559 c2559) {
        if (!c2559.f8141) {
            return this.f327.mo3415(i, this.f322);
        }
        int i2 = this.f326.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4512 = c2553.m4512(i);
        if (iM4512 != -1) {
            return this.f327.mo3415(iM4512, this.f322);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m146(int i, C2553 c2553, C2559 c2559) {
        if (!c2559.f8141) {
            return this.f327.mo3416(i);
        }
        int i2 = this.f325.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4512 = c2553.m4512(i);
        if (iM4512 != -1) {
            return this.f327.mo3416(iM4512);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m147(View view, int i, boolean z) {
        int iM4475;
        int iM4476;
        C1491 c1491 = (C1491) view.getLayoutParams();
        Rect rect = c1491.f8108;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1491).topMargin + ((ViewGroup.MarginLayoutParams) c1491).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1491).leftMargin + ((ViewGroup.MarginLayoutParams) c1491).rightMargin;
        int iM143 = m143(c1491.f5285, c1491.f5286);
        if (this.f332 == 1) {
            iM4476 = AbstractC2546.m4475(iM143, i, i3, ((ViewGroup.MarginLayoutParams) c1491).width, false);
            iM4475 = AbstractC2546.m4475(this.f334.mo2891(), this.f8104, i2, ((ViewGroup.MarginLayoutParams) c1491).height, true);
        } else {
            int iM4477 = AbstractC2546.m4475(iM143, i, i2, ((ViewGroup.MarginLayoutParams) c1491).height, false);
            int iM4478 = AbstractC2546.m4475(this.f334.mo2891(), this.f8103, i3, ((ViewGroup.MarginLayoutParams) c1491).width, true);
            iM4475 = iM4477;
            iM4476 = iM4478;
        }
        C2547 c2547 = (C2547) view.getLayoutParams();
        if (z ? m4507(view, iM4476, iM4475, c2547) : m4506(view, iM4476, iM4475, c2547)) {
            view.measure(iM4476, iM4475);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m148(int i) {
        if (i == this.f322) {
            return;
        }
        this.f321 = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Span count should be at least 1. Provided "));
        }
        this.f322 = i;
        this.f327.m3418();
        m4501();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m149() {
        int iM4491;
        int iM4494;
        if (this.f332 == 1) {
            iM4491 = this.f8105 - m4493();
            iM4494 = m4492();
        } else {
            iM4491 = this.f8106 - m4491();
            iM4494 = m4494();
        }
        m137(iM4491 - iM4494);
    }

    public GridLayoutManager() {
        super(1);
        this.f321 = false;
        this.f322 = -1;
        this.f325 = new SparseIntArray();
        this.f326 = new SparseIntArray();
        this.f327 = new C1490();
        this.f328 = new Rect();
        this.f329 = -1;
        this.f330 = -1;
        this.f331 = -1;
        m148(2);
    }
}
