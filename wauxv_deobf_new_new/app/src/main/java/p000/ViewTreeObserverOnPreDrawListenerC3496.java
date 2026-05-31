package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤝᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3496 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC3493 f11006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ViewGroup f11007;

    /* JADX WARN: Code duplicated, block: B:101:0x021e  */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:108:0x024a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f6 A[EDGE_INSN: B:135:0x01f6->B:91:0x01f6 BREAK  A[LOOP:1: B:19:0x0085->B:90:0x01ec], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C2136 c2136;
        C2136 c2137;
        C0274 c0274;
        C0274 c0275;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C0274 c0274M5007;
        int i5;
        Animator animator;
        C3489 c3489;
        C3501 c3501;
        C3501 c3502;
        int i6;
        C2136 c2138;
        boolean z2;
        int i7;
        View view;
        C3501 c3503;
        C0274 c0276;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        C1889 c1889;
        int iM3812;
        int i11;
        View view6;
        C2136 c2139;
        Iterator it;
        AbstractC3493 abstractC3493 = this.f11006;
        ViewGroup viewGroup = this.f11007;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!AbstractC3497.f11010.remove(viewGroup)) {
            return true;
        }
        C0274 c0274M5021 = AbstractC3497.m5021();
        ArrayList arrayList2 = (ArrayList) c0274M5021.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC3493);
            abstractC3493.m5009(new C3495(this, c0274M5021));
            i = 0;
            abstractC3493.m5011(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC3493) it.next()).mo1564(viewGroup);
                }
            }
            abstractC3493.f10990 = new ArrayList();
            abstractC3493.f10991 = new ArrayList();
            c2136 = abstractC3493.f10986;
            c2137 = abstractC3493.f10987;
            c0274 = new C0274((C0274) c2136.f7059);
            c0275 = new C0274((C0274) c2137.f7059);
            i2 = 0;
            while (true) {
                iArr = abstractC3493.f10989;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z3) {
                    c2138 = c2137;
                    z2 = z3;
                    for (i7 = c0274.f8887 - 1; i7 >= 0; i7--) {
                        view = (View) c0274.m4743(i7);
                        if (view == null && abstractC3493.m5017(view) && (c3503 = (C3501) c0275.remove(view)) != null && abstractC3493.m5017(c3503.f11015)) {
                            abstractC3493.f10990.add((C3501) c0274.mo2013(i7));
                            abstractC3493.f10991.add(c3503);
                        }
                    }
                } else if (i6 != 2) {
                    c2138 = c2137;
                    z2 = z3;
                    c0276 = (C0274) c2136.f7062;
                    C0274 c0277 = (C0274) c2138.f7062;
                    i8 = c0276.f8887;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) c0276.m4744(i9);
                        if (view2 == null && abstractC3493.m5017(view2) && (view3 = (View) c0277.get(c0276.m4743(i9))) != null && abstractC3493.m5017(view3)) {
                            C3501 c3504 = (C3501) c0274.get(view2);
                            C3501 c3505 = (C3501) c0275.get(view3);
                            if (c3504 != null && c3505 != null) {
                                abstractC3493.f10990.add(c3504);
                                abstractC3493.f10991.add(c3505);
                                c0274.remove(view2);
                                c0275.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) c2136.f7060;
                    c2138 = c2137;
                    SparseArray sparseArray2 = (SparseArray) c2138.f7060;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && abstractC3493.m5017(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC3493.m5017(view5)) {
                            C3501 c3506 = (C3501) c0274.get(view4);
                            C3501 c3507 = (C3501) c0275.get(view5);
                            if (c3506 != null && c3507 != null) {
                                abstractC3493.f10990.add(c3506);
                                abstractC3493.f10991.add(c3507);
                                c0274.remove(view4);
                                c0275.remove(view5);
                            }
                        }
                    }
                } else if (i6 != 4) {
                    c2138 = c2137;
                    z2 = z3;
                } else {
                    c1889 = (C1889) c2136.f7061;
                    C1889 c18810 = (C1889) c2137.f7061;
                    iM3812 = c1889.m3812();
                    i11 = i;
                    while (i11 < iM3812) {
                        view6 = (View) c1889.m3813(i11);
                        if (view6 == null && abstractC3493.m5017(view6)) {
                            c2139 = c2137;
                            View view7 = (View) c18810.m3809(c1889.m3810(i11));
                            if (view7 != null && abstractC3493.m5017(view7)) {
                                C3501 c3508 = (C3501) c0274.get(view6);
                                C3501 c3509 = (C3501) c0275.get(view7);
                                if (c3508 != null && c3509 != null) {
                                    abstractC3493.f10990.add(c3508);
                                    abstractC3493.f10991.add(c3509);
                                    c0274.remove(view6);
                                    c0275.remove(view7);
                                }
                            }
                            i11++;
                            c2137 = c2139;
                            z3 = z3;
                        } else {
                            c2139 = c2137;
                        }
                        i11++;
                        c2137 = c2139;
                        z3 = z3;
                    }
                    z2 = z3;
                    c2138 = c2137;
                }
                i2++;
                c2137 = c2138;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < c0274.f8887; i3++) {
                c3502 = (C3501) c0274.m4744(i3);
                if (abstractC3493.m5017(c3502.f11015)) {
                    abstractC3493.f10990.add(c3502);
                    abstractC3493.f10991.add(null);
                }
            }
            for (i4 = 0; i4 < c0275.f8887; i4++) {
                c3501 = (C3501) c0275.m4744(i4);
                if (abstractC3493.m5017(c3501.f11015)) {
                    abstractC3493.f10991.add(c3501);
                    abstractC3493.f10990.add(null);
                }
            }
            c0274M5007 = AbstractC3493.m5007();
            int i12 = c0274M5007.f8887;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) c0274M5007.m4743(i5);
                if (animator == null && (c3489 = (C3489) c0274M5007.get(animator)) != null) {
                    AbstractC3493 abstractC3494 = c3489.f10973;
                    View view8 = c3489.f10969;
                    if (view8 != null && windowId.equals(c3489.f10972)) {
                        C3501 c35010 = c3489.f10971;
                        boolean z4 = z;
                        C3501 c3501M5016 = abstractC3493.m5016(view8, z4);
                        C3501 c3501M5014 = abstractC3493.m5014(view8, z4);
                        if (c3501M5016 == null && c3501M5014 == null) {
                            c3501M5014 = (C3501) ((C0274) abstractC3493.f10987.f7059).get(view8);
                        }
                        if ((c3501M5016 != null || c3501M5014 != null) && abstractC3494.mo3073(c35010, c3501M5014)) {
                            abstractC3494.m5015().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0274M5007.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            abstractC3493.mo1559(viewGroup, abstractC3493.f10986, abstractC3493.f10987, abstractC3493.f10990, abstractC3493.f10991);
            abstractC3493.mo1565();
            return true;
        }
        arrayList2 = new ArrayList();
        c0274M5021.put(viewGroup, arrayList2);
        arrayList2.add(abstractC3493);
        abstractC3493.m5009(new C3495(this, c0274M5021));
        i = 0;
        abstractC3493.m5011(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3493) it.next()).mo1564(viewGroup);
            }
        }
        abstractC3493.f10990 = new ArrayList();
        abstractC3493.f10991 = new ArrayList();
        c2136 = abstractC3493.f10986;
        c2137 = abstractC3493.f10987;
        c0274 = new C0274((C0274) c2136.f7059);
        c0275 = new C0274((C0274) c2137.f7059);
        i2 = 0;
        while (true) {
            iArr = abstractC3493.f10989;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z3) {
                c2138 = c2137;
                z2 = z3;
                while (i7 >= 0) {
                    view = (View) c0274.m4743(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                c2138 = c2137;
                z2 = z3;
                c0276 = (C0274) c2136.f7062;
                C0274 c0278 = (C0274) c2138.f7062;
                i8 = c0276.f8887;
                while (i9 < i8) {
                    view2 = (View) c0276.m4744(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) c2136.f7060;
                c2138 = c2137;
                SparseArray sparseArray3 = (SparseArray) c2138.f7060;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            } else if (i6 != 4) {
                c2138 = c2137;
                z2 = z3;
            } else {
                c1889 = (C1889) c2136.f7061;
                C1889 c18811 = (C1889) c2137.f7061;
                iM3812 = c1889.m3812();
                i11 = i;
                while (i11 < iM3812) {
                    view6 = (View) c1889.m3813(i11);
                    if (view6 == null) {
                        c2139 = c2137;
                    } else {
                        c2139 = c2137;
                    }
                    i11++;
                    c2137 = c2139;
                    z3 = z3;
                }
                z2 = z3;
                c2138 = c2137;
            }
            i2++;
            c2137 = c2138;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < c0274.f8887) {
            c3502 = (C3501) c0274.m4744(i3);
            if (abstractC3493.m5017(c3502.f11015)) {
                abstractC3493.f10990.add(c3502);
                abstractC3493.f10991.add(null);
            }
        }
        while (i4 < c0275.f8887) {
            c3501 = (C3501) c0275.m4744(i4);
            if (abstractC3493.m5017(c3501.f11015)) {
                abstractC3493.f10991.add(c3501);
                abstractC3493.f10990.add(null);
            }
        }
        c0274M5007 = AbstractC3493.m5007();
        int i13 = c0274M5007.f8887;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) c0274M5007.m4743(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        abstractC3493.mo1559(viewGroup, abstractC3493.f10986, abstractC3493.f10987, abstractC3493.f10990, abstractC3493.f10991);
        abstractC3493.mo1565();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f11007;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC3497.f11010.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC3497.m5021().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3493) it.next()).mo1564(viewGroup);
            }
        }
        this.f11006.m5012(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
