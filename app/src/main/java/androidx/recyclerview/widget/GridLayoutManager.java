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
import p000.AbstractC1194;
import p000.AbstractC1481;
import p000.AbstractC2482;
import p000.AbstractC2491;
import p000.AbstractC2508;
import p000.AbstractC2784;
import p000.AbstractC3578;
import p000.C0085;
import p000.C0091;
import p000.C0092;
import p000.C1439;
import p000.C1479;
import p000.C1480;
import p000.C1786;
import p000.C1787;
import p000.C1788;
import p000.C2492;
import p000.C2498;
import p000.C2504;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    public static final Set f320 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(130))));

    public boolean f321;

    public int f322;

    public int[] f323;

    public View[] f324;

    public final SparseIntArray f325;

    public final SparseIntArray f326;

    public AbstractC1481 f327;

    public final Rect f328;

    public int f329;

    public int f330;

    public int f331;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f321 = false;
        this.f322 = -1;
        this.f325 = new SparseIntArray();
        this.f326 = new SparseIntArray();
        this.f327 = new C1479();
        this.f328 = new Rect();
        this.f329 = -1;
        this.f330 = -1;
        this.f331 = -1;
        m148(AbstractC2491.m4461(context, attributeSet, i, i2).f7938);
    }

    @Override // p000.AbstractC2491
    public final boolean mo107(C2492 c2492) {
        return c2492 instanceof C1480;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo108(C2504 c2504) {
        return m170(c2504);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo109(C2504 c2504) {
        return m171(c2504);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo110(C2504 c2504) {
        return m170(c2504);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo111(C2504 c2504) {
        return m171(c2504);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final C2492 mo112() {
        return this.f332 == 0 ? new C1480(-2, -1) : new C1480(-1, -2);
    }

    @Override // p000.AbstractC2491
    public final C2492 mo113(Context context, AttributeSet attributeSet) {
        C1480 c1480 = new C1480(context, attributeSet);
        c1480.f5253 = -1;
        c1480.f5254 = 0;
        return c1480;
    }

    @Override // p000.AbstractC2491
    public final C2492 mo114(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1480 c1480 = new C1480((ViewGroup.MarginLayoutParams) layoutParams);
            c1480.f5253 = -1;
            c1480.f5254 = 0;
            return c1480;
        }
        C1480 c1481 = new C1480(layoutParams);
        c1481.f5253 = -1;
        c1481.f5254 = 0;
        return c1481;
    }

    @Override // p000.AbstractC2491
    public final int mo115(C2498 c2498, C2504 c2504) {
        if (this.f332 == 1) {
            return Math.min(this.f322, m4468());
        }
        if (c2504.m4505() < 1) {
            return 0;
        }
        return m144(c2504.m4505() - 1, c2498, c2504) + 1;
    }

    @Override // p000.AbstractC2491
    public final int mo116(C2498 c2498, C2504 c2504) {
        if (this.f332 == 0) {
            return Math.min(this.f322, m4468());
        }
        if (c2504.m4505() < 1) {
            return 0;
        }
        return m144(c2504.m4505() - 1, c2498, c2504) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo117(View view, int i, C2498 c2498, C2504 c2504) {
        View viewM225;
        int iM4467;
        int i2;
        int iM4468;
        View view2;
        View view3;
        int i3;
        int i4;
        C2498 c2499 = c2498;
        C2504 c2505 = c2504;
        RecyclerView recyclerView = this.f7942;
        if (recyclerView == null || (viewM225 = recyclerView.m225(view)) == null || ((ArrayList) this.f7941.f2345).contains(viewM225)) {
            viewM225 = null;
        }
        if (viewM225 != null) {
            C1480 c1480 = (C1480) viewM225.getLayoutParams();
            int i5 = c1480.f5253;
            int i6 = c1480.f5254 + i5;
            if (super.mo117(view, i, c2498, c2504) != null) {
                if ((m172(i) == 1) != this.f337) {
                    iM4468 = m4467() - 1;
                    iM4467 = -1;
                    i2 = -1;
                } else {
                    iM4467 = m4467();
                    i2 = 1;
                    iM4468 = 0;
                }
                boolean z = this.f332 == 1 && m185();
                int iM144 = m144(iM4468, c2499, c2505);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM4468;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iM4467) {
                        break;
                    }
                    int iM145 = m144(i9, c2499, c2505);
                    View viewM4466 = m4466(i9);
                    if (viewM4466 == viewM225) {
                        break;
                    }
                    if (!viewM4466.hasFocusable() || iM145 == iM144) {
                        C1480 c1481 = (C1480) viewM4466.getLayoutParams();
                        int i10 = c1481.f5253;
                        view3 = viewM225;
                        int i11 = c1481.f5254 + i10;
                        if (viewM4466.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM4466;
                        }
                        if (!(viewM4466.hasFocusable() && view4 == null) && (viewM4466.hasFocusable() || false)) {
                            i3 = iM4467;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM4466.hasFocusable()) {
                                if (iMin3 <= 0) {
                                    if (iMin3 == 0) {
                                    }
                                    i4 = 0;
                                }
                                i4 = 0;
                            } else if (view4 == null) {
                                i4 = 0;
                                if (!this.f7943.m4805(viewM4466) || !this.f7944.m4805(viewM4466)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = 0;
                            }
                            i9 += i2;
                            c2499 = c2498;
                            c2505 = c2504;
                            viewM225 = view3;
                            iM4467 = i3;
                        } else {
                            i4 = 0;
                            i3 = iM4467;
                        }
                        if (viewM4466.hasFocusable()) {
                            int i12 = c1481.f5253;
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewM4466;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            int i13 = c1481.f5253;
                            view5 = viewM4466;
                            i7 = i13;
                            iMin = 0;
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                        }
                        i9 += i2;
                        c2499 = c2498;
                        c2505 = c2504;
                        viewM225 = view3;
                        iM4467 = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM225;
                        i4 = 0;
                        i3 = iM4467;
                    }
                    view5 = view2;
                    iMin = 0;
                    i9 += i2;
                    c2499 = c2498;
                    c2505 = c2504;
                    viewM225 = view3;
                    iM4467 = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final void mo118(C2498 c2498, C2504 c2504, C0092 c0092) {
        super.mo118(c2498, c2504, c0092);
        c0092.m1095(GridView.class.getName());
        AbstractC2482 abstractC2482 = this.f7942.f368;
        if (abstractC2482 == null || abstractC2482.mo2040() <= 1) {
            return;
        }
        c0092.m1089(C0085.f1037);
    }

    @Override // p000.AbstractC2491
    public final void mo119(C2498 c2498, C2504 c2504, View view, C0092 c0092) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1480)) {
            m4474(view, c0092);
            return;
        }
        C1480 c1480 = (C1480) layoutParams;
        int iM144 = m144(c1480.f7956.m4512(), c2498, c2504);
        if (this.f332 == 0) {
            c0092.m1096(C0091.m1085(c1480.f5253, c1480.f5254, iM144, 1, false));
        } else {
            c0092.m1096(C0091.m1085(iM144, 1, c1480.f5253, c1480.f5254, false));
        }
    }

    @Override // p000.AbstractC2491
    public final void mo120(int i, int i2) {
        this.f327.m3241();
        ((SparseIntArray) this.f327.f5256).clear();
    }

    @Override // p000.AbstractC2491
    public final void mo121() {
        this.f327.m3241();
        ((SparseIntArray) this.f327.f5256).clear();
    }

    @Override // p000.AbstractC2491
    public final void mo122(int i, int i2) {
        this.f327.m3241();
        ((SparseIntArray) this.f327.f5256).clear();
    }

    @Override // p000.AbstractC2491
    public final void mo123(int i, int i2) {
        this.f327.m3241();
        ((SparseIntArray) this.f327.f5256).clear();
    }

    @Override // p000.AbstractC2491
    public final void mo124(int i, int i2) {
        this.f327.m3241();
        ((SparseIntArray) this.f327.f5256).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final void mo125(C2498 c2498, C2504 c2504) {
        boolean z = c2504.f7990;
        SparseIntArray sparseIntArray = this.f326;
        SparseIntArray sparseIntArray2 = this.f325;
        if (z) {
            int iM4467 = m4467();
            for (int i = 0; i < iM4467; i++) {
                C1480 c1480 = (C1480) m4466(i).getLayoutParams();
                int iM4512 = c1480.f7956.m4512();
                sparseIntArray2.put(iM4512, c1480.f5254);
                sparseIntArray.put(iM4512, c1480.f5253);
            }
        }
        super.mo125(c2498, c2504);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final void mo126(C2504 c2504) {
        View viewMo158;
        super.mo126(c2504);
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final boolean mo127(int i, Bundle bundle) {
        View viewM4466;
        AbstractC2508 abstractC2508M232;
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
        if (i == C0085.f1037.m1062() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= m4467()) {
                    viewM4466 = null;
                    break;
                }
                if (m4466(i5).isAccessibilityFocused()) {
                    viewM4466 = m4466(i5);
                    break;
                }
                i5++;
            }
            if (viewM4466 != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f320.contains(Integer.valueOf(i6)) && (abstractC2508M232 = this.f7942.m232(viewM4466)) != null) {
                    int iM4510 = abstractC2508M232.m4510();
                    int iM140 = m140(iM4510);
                    int iM139 = m139(iM4510);
                    if (iM140 >= 0 && iM139 >= 0) {
                        if (!m141(iM4510).contains(Integer.valueOf(this.f330)) || !m142(m139(iM4510), iM4510).contains(Integer.valueOf(this.f331))) {
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
                            iIntValue = iM4510 - 1;
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
                                if (true) {
                                    if (false) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4468()) {
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
                                            if (i4 < m4468()) {
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
                            iIntValue = iM4510 - 1;
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
                                if (false) {
                                    if (i6 == 66) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4468()) {
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
                                    if (false) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m4468()) {
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
                            if (true) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iM4510 + 1;
                            while (true) {
                                if (iIntValue < m4468()) {
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
                                if (false) {
                                    if (i6 == 66) {
                                        if (iM140 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m4468()) {
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
                                    if (false) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m4468()) {
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
                            if (true) {
                                mo165(iIntValue);
                                this.f329 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iM4510 + 1;
                            while (true) {
                                if (iIntValue < m4468()) {
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
                                if (false) {
                                    if (i6 == 66) {
                                        if (iM140 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < m4468()) {
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
                                    if (false) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (0 < m4468()) {
                                            it4 = m141(0).iterator();
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
                int iMo2040 = this.f7942.f368.mo2040();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo2040) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f7942;
                    int iM145 = m145(i11, recyclerView.f358, recyclerView.f411);
                    RecyclerView recyclerView2 = this.f7942;
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo128(int i, C2498 c2498, C2504 c2504) {
        m149();
        m138();
        return super.mo128(i, c2498, c2504);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final int mo129(int i, C2498 c2498, C2504 c2504) {
        m149();
        m138();
        return super.mo129(i, c2498, c2504);
    }

    @Override // p000.AbstractC2491
    public final void mo130(Rect rect, int i, int i2) {
        int iM4452;
        int iM4453;
        if (this.f323 == null) {
            super.mo130(rect, i, i2);
        }
        int iM4471 = m4471() + m4470();
        int iM4469 = m4469() + m4472();
        if (this.f332 == 1) {
            int iHeight = rect.height() + iM4469;
            RecyclerView recyclerView = this.f7942;
            Field field = AbstractC3578.f11184;
            iM4453 = AbstractC2491.m4452(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f323;
            iM4452 = AbstractC2491.m4452(i, iArr[iArr.length - 1] + iM4471, this.f7942.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4471;
            RecyclerView recyclerView2 = this.f7942;
            Field field2 = AbstractC3578.f11184;
            iM4452 = AbstractC2491.m4452(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f323;
            iM4453 = AbstractC2491.m4452(i2, iArr2[iArr2.length - 1] + iM4469, this.f7942.getMinimumHeight());
        }
        this.f7942.setMeasuredDimension(iM4452, iM4453);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    public final boolean mo131() {
        return this.f342 == null && !this.f321;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void mo132(C2504 c2504, C1788 c1788, C1439 c1439) {
        int i;
        int iMo3239 = this.f322;
        for (int i2 = 0; i2 < this.f322 && (i = c1788.f5940) >= 0 && i < c2504.m4505() && iMo3239 > 0; i2++) {
            int i3 = c1788.f5940;
            c1439.m3134(i3, Math.max(0, c1788.f5943));
            iMo3239 -= this.f327.mo3239(i3);
            c1788.f5940 += c1788.f5941;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View mo133(C2498 c2498, C2504 c2504, boolean z, boolean z2) {
        int i;
        int iM4467;
        int iM4468 = m4467();
        int i2 = 1;
        if (z2) {
            iM4467 = m4467() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM4468;
            iM4467 = 0;
        }
        int iM4505 = c2504.m4505();
        m173();
        int iMo2746 = this.f334.mo2746();
        int iMo2742 = this.f334.mo2742();
        View view = null;
        View view2 = null;
        while (iM4467 != i) {
            View viewM4466 = m4466(iM4467);
            int iM4460 = AbstractC2491.m4460(viewM4466);
            if (iM4460 >= 0 && iM4460 < iM4505 && m145(iM4460, c2498, c2504) == 0) {
                if (((C2492) viewM4466.getLayoutParams()).f7956.m4518()) {
                    if (view2 == null) {
                        view2 = viewM4466;
                    }
                } else {
                    if (this.f334.mo2740(viewM4466) < iMo2742 && this.f334.mo2737(viewM4466) >= iMo2746) {
                        return viewM4466;
                    }
                    if (view == null) {
                        view = viewM4466;
                    }
                }
            }
            iM4467 += i2;
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
    public final void mo134(C2498 c2498, C2504 c2504, C1788 c1788, C1787 c1787) {
        int i;
        int i2;
        int i3;
        int iMo2739;
        int iM4470;
        int iMo27310;
        int iM4453;
        int iM4454;
        ?? r12;
        int i4;
        View viewM3524;
        int iMo2745 = this.f334.mo2745();
        boolean z = iMo2745 != 1073741824;
        int i5 = m4467() > 0 ? this.f323[this.f322] : 0;
        if (z) {
            m149();
        }
        boolean z2 = c1788.f5941 == 1;
        int iM145 = this.f322;
        if (!z2) {
            iM145 = m145(c1788.f5940, c2498, c2504) + m146(c1788.f5940, c2498, c2504);
        }
        int i6 = 0;
        while (i6 < this.f322 && (i4 = c1788.f5940) >= 0 && i4 < c2504.m4505() && iM145 > 0) {
            int i7 = c1788.f5940;
            int iM146 = m146(i7, c2498, c2504);
            if (iM146 > this.f322) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iM146);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC2784.m4751(sb, this.f322, " spans."));
            }
            iM145 -= iM146;
            if (iM145 < 0 || (viewM3524 = c1788.m3524(c2498)) == null) {
                break;
            }
            this.f324[i6] = viewM3524;
            i6++;
        }
        if (i6 == 0) {
            c1787.f5934 = true;
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
            C1480 c1480 = (C1480) view.getLayoutParams();
            int iM147 = m146(AbstractC2491.m4460(view), c2498, c2504);
            c1480.f5254 = iM147;
            c1480.f5253 = i8;
            i8 += iM147;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f324[i10];
            if (c1788.f5947 != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m4464(view2, -1, true);
                } else {
                    m4464(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m4464(view2, -1, false);
            } else {
                r12 = 0;
                m4464(view2, 0, false);
            }
            RecyclerView recyclerView = this.f7942;
            Rect rect = this.f328;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m233(view2));
            }
            m147(view2, iMo2745, r12);
            int iMo2738 = this.f334.mo2738(view2);
            if (iMo2738 > i9) {
                i9 = iMo2738;
            }
            float fMo2739 = (this.f334.mo2739(view2) * 1.0f) / ((C1480) view2.getLayoutParams()).f5254;
            if (fMo2739 > f) {
                f = fMo2739;
            }
        }
        if (z) {
            m137(Math.max(Math.round(f * this.f322), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f324[i11];
                m147(view3, 1073741824, true);
                int iMo27311 = this.f334.mo2738(view3);
                if (iMo27311 > i9) {
                    i9 = iMo27311;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f324[i12];
            if (this.f334.mo2738(view4) != i9) {
                C1480 c1481 = (C1480) view4.getLayoutParams();
                Rect rect2 = c1481.f7957;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1481).topMargin + ((ViewGroup.MarginLayoutParams) c1481).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1481).leftMargin + ((ViewGroup.MarginLayoutParams) c1481).rightMargin;
                int iM143 = m143(c1481.f5253, c1481.f5254);
                if (this.f332 == 1) {
                    iM4454 = AbstractC2491.m4453(iM143, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c1481).width, false);
                    iM4453 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4453 = AbstractC2491.m4453(iM143, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c1481).height, false);
                    iM4454 = iMakeMeasureSpec;
                }
                if (m4486(view4, iM4454, iM4453, (C2492) view4.getLayoutParams())) {
                    view4.measure(iM4454, iM4453);
                }
            }
        }
        int iM4472 = 0;
        c1787.f5933 = i9;
        if (this.f332 != 1) {
            if (c1788.f5942 == -1) {
                int i15 = c1788.f5938;
                iM4470 = i15 - i9;
                iMo2739 = i15;
            } else {
                int i16 = c1788.f5938;
                iMo2739 = i16 + i9;
                iM4470 = i16;
            }
            iMo27310 = 0;
        } else if (c1788.f5942 == -1) {
            iMo27310 = c1788.f5938;
            iM4472 = iMo27310 - i9;
            iM4470 = 0;
            iMo2739 = 0;
        } else {
            int i17 = c1788.f5938;
            iMo2739 = 0;
            iM4472 = i17;
            iMo27310 = i17 + i9;
            iM4470 = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f324[i18];
            C1480 c1482 = (C1480) view5.getLayoutParams();
            if (this.f332 != 1) {
                iM4472 = m4472() + this.f323[c1482.f5253];
                iMo27310 = this.f334.mo2739(view5) + iM4472;
            } else if (m185()) {
                int iM4471 = m4470() + this.f323[this.f322 - c1482.f5253];
                iMo2739 = iM4471;
                iM4470 = iM4471 - this.f334.mo2739(view5);
            } else {
                iM4470 = m4470() + this.f323[c1482.f5253];
                iMo2739 = this.f334.mo2739(view5) + iM4470;
            }
            AbstractC2491.m4463(view5, iM4470, iM4472, iMo2739, iMo27310);
            if (c1482.f7956.m4518() || c1482.f7956.m4521()) {
                c1787.f5935 = true;
            }
            c1787.f5936 = view5.hasFocusable() | c1787.f5936;
        }
        Arrays.fill(this.f324, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void mo135(C2498 c2498, C2504 c2504, C1786 c1786, int i) {
        m149();
        if (c2504.m4505() > 0 && !c2504.f7990) {
            boolean z = i == 1;
            int iM145 = m145(c1786.f5929, c2498, c2504);
            if (z) {
                while (iM145 > 0) {
                    int i2 = c1786.f5929;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1786.f5929 = i3;
                    iM145 = m145(i3, c2498, c2504);
                }
            } else {
                int iM4505 = c2504.m4505() - 1;
                int i4 = c1786.f5929;
                while (i4 < iM4505) {
                    int i5 = i4 + 1;
                    int iM146 = m145(i5, c2498, c2504);
                    if (iM146 <= iM145) {
                        break;
                    }
                    i4 = i5;
                    iM145 = iM146;
                }
                c1786.f5929 = i4;
            }
        }
        m138();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void mo136(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo136(false);
    }

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

    public final void m138() {
        View[] viewArr = this.f324;
        if (viewArr == null || viewArr.length != this.f322) {
            this.f324 = new View[this.f322];
        }
    }

    public final int m139(int i) {
        if (this.f332 == 0) {
            RecyclerView recyclerView = this.f7942;
            return m144(i, recyclerView.f358, recyclerView.f411);
        }
        RecyclerView recyclerView2 = this.f7942;
        return m145(i, recyclerView2.f358, recyclerView2.f411);
    }

    public final int m140(int i) {
        if (this.f332 == 1) {
            RecyclerView recyclerView = this.f7942;
            return m144(i, recyclerView.f358, recyclerView.f411);
        }
        RecyclerView recyclerView2 = this.f7942;
        return m145(i, recyclerView2.f358, recyclerView2.f411);
    }

    public final HashSet m141(int i) {
        return m142(m140(i), i);
    }

    public final HashSet m142(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f7942;
        int iM146 = m146(i2, recyclerView.f358, recyclerView.f411);
        for (int i3 = i; i3 < i + iM146; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int m143(int i, int i2) {
        if (this.f332 != 1 || !m185()) {
            int[] iArr = this.f323;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f323;
        int i3 = this.f322;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int m144(int i, C2498 c2498, C2504 c2504) {
        if (!c2504.f7990) {
            return this.f327.m3240(i, this.f322);
        }
        int iM4491 = c2498.m4491(i);
        if (iM4491 != -1) {
            return this.f327.m3240(iM4491, this.f322);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int m145(int i, C2498 c2498, C2504 c2504) {
        if (!c2504.f7990) {
            return this.f327.mo3238(i, this.f322);
        }
        int i2 = this.f326.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4491 = c2498.m4491(i);
        if (iM4491 != -1) {
            return this.f327.mo3238(iM4491, this.f322);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int m146(int i, C2498 c2498, C2504 c2504) {
        if (!c2504.f7990) {
            return this.f327.mo3239(i);
        }
        int i2 = this.f325.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4491 = c2498.m4491(i);
        if (iM4491 != -1) {
            return this.f327.mo3239(iM4491);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m147(View view, int i, boolean z) {
        int iM4453;
        int iM4454;
        C1480 c1480 = (C1480) view.getLayoutParams();
        Rect rect = c1480.f7957;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1480).topMargin + ((ViewGroup.MarginLayoutParams) c1480).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1480).leftMargin + ((ViewGroup.MarginLayoutParams) c1480).rightMargin;
        int iM143 = m143(c1480.f5253, c1480.f5254);
        if (this.f332 == 1) {
            iM4454 = AbstractC2491.m4453(iM143, i, i3, ((ViewGroup.MarginLayoutParams) c1480).width, false);
            iM4453 = AbstractC2491.m4453(this.f334.mo2747(), this.f7953, i2, ((ViewGroup.MarginLayoutParams) c1480).height, true);
        } else {
            int iM4455 = AbstractC2491.m4453(iM143, i, i2, ((ViewGroup.MarginLayoutParams) c1480).height, false);
            int iM4456 = AbstractC2491.m4453(this.f334.mo2747(), this.f7952, i3, ((ViewGroup.MarginLayoutParams) c1480).width, true);
            iM4453 = iM4455;
            iM4454 = iM4456;
        }
        C2492 c2492 = (C2492) view.getLayoutParams();
        if (z ? m4486(view, iM4454, iM4453, c2492) : m4485(view, iM4454, iM4453, c2492)) {
            view.measure(iM4454, iM4453);
        }
    }

    public final void m148(int i) {
        if (i == this.f322) {
            return;
        }
        this.f321 = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Span count should be at least 1. Provided "));
        }
        this.f322 = i;
        this.f327.m3241();
        m4480();
    }

    public final void m149() {
        int iM4469;
        int iM4472;
        if (this.f332 == 1) {
            iM4469 = this.f7954 - m4471();
            iM4472 = m4470();
        } else {
            iM4469 = this.f7955 - m4469();
            iM4472 = m4472();
        }
        m137(iM4469 - iM4472);
    }

    public GridLayoutManager() {
        super(1);
        this.f321 = false;
        this.f322 = -1;
        this.f325 = new SparseIntArray();
        this.f326 = new SparseIntArray();
        this.f327 = new C1479();
        this.f328 = new Rect();
        this.f329 = -1;
        this.f330 = -1;
        this.f331 = -1;
        m148(2);
    }
}
