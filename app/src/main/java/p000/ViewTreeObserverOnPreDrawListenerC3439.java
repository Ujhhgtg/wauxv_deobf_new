package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3439 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC3436 f10846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ViewGroup f10847;

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
        C2103 c2103;
        C2103 c2104;
        C0264 c0264;
        C0264 c0265;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C0264 c0264M4945;
        int i5;
        Animator animator;
        C3432 c3432;
        C3444 c3444;
        C3444 c3445;
        int i6;
        C2103 c2105;
        boolean z2;
        int i7;
        View view;
        C3444 c3446;
        C0264 c0266;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        C1863 c1863;
        int iM3634;
        int i11;
        View view6;
        C2103 c2106;
        Iterator it;
        AbstractC3436 abstractC3436 = this.f10846;
        ViewGroup viewGroup = this.f10847;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!AbstractC3440.f10850.remove(viewGroup)) {
            return true;
        }
        C0264 c0264M4959 = AbstractC3440.m4959();
        ArrayList arrayList2 = (ArrayList) c0264M4959.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC3436);
            abstractC3436.m4947(new C3438(this, c0264M4959));
            i = 0;
            abstractC3436.m4949(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC3436) it.next()).mo1418(viewGroup);
                }
            }
            abstractC3436.f10830 = new ArrayList();
            abstractC3436.f10831 = new ArrayList();
            c2103 = abstractC3436.f10826;
            c2104 = abstractC3436.f10827;
            c0264 = new C0264((C0264) c2103.f6935);
            c0265 = new C0264((C0264) c2104.f6935);
            i2 = 0;
            while (true) {
                iArr = abstractC3436.f10829;
                if (0 < iArr.length) {
                    break;
                }
                i6 = iArr[0];
                if (i6 != z3) {
                    c2105 = c2104;
                    z2 = z3;
                    for (i7 = c0264.f8716 - 1; i7 >= 0; i7--) {
                        view = (View) c0264.m4706(i7);
                        if (view == null && abstractC3436.m4955(view) && (c3446 = (C3444) c0265.remove(view)) != null && abstractC3436.m4955(c3446.f10855)) {
                            abstractC3436.f10830.add((C3444) c0264.mo1918(i7));
                            abstractC3436.f10831.add(c3446);
                        }
                    }
                } else if (i6 != 2) {
                    c2105 = c2104;
                    z2 = z3;
                    c0266 = (C0264) c2103.f6938;
                    C0264 c0267 = (C0264) c2105.f6938;
                    i8 = c0266.f8716;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) c0266.m4707(i9);
                        if (view2 == null && abstractC3436.m4955(view2) && (view3 = (View) c0267.get(c0266.m4706(i9))) != null && abstractC3436.m4955(view3)) {
                            C3444 c3447 = (C3444) c0264.get(view2);
                            C3444 c3448 = (C3444) c0265.get(view3);
                            if (c3447 != null && c3448 != null) {
                                abstractC3436.f10830.add(c3447);
                                abstractC3436.f10831.add(c3448);
                                c0264.remove(view2);
                                c0265.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) c2103.f6936;
                    c2105 = c2104;
                    SparseArray sparseArray2 = (SparseArray) c2105.f6936;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && abstractC3436.m4955(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC3436.m4955(view5)) {
                            C3444 c3449 = (C3444) c0264.get(view4);
                            C3444 c34410 = (C3444) c0265.get(view5);
                            if (c3449 != null && c34410 != null) {
                                abstractC3436.f10830.add(c3449);
                                abstractC3436.f10831.add(c34410);
                                c0264.remove(view4);
                                c0265.remove(view5);
                            }
                        }
                    }
                } else if (i6 != 4) {
                    c2105 = c2104;
                    z2 = z3;
                } else {
                    c1863 = (C1863) c2103.f6937;
                    C1863 c1864 = (C1863) c2104.f6937;
                    iM3634 = c1863.m3634();
                    i11 = i;
                    while (i11 < iM3634) {
                        view6 = (View) c1863.m3635(i11);
                        if (view6 == null && abstractC3436.m4955(view6)) {
                            c2106 = c2104;
                            View view7 = (View) c1864.m3631(c1863.m3632(i11));
                            if (view7 != null && abstractC3436.m4955(view7)) {
                                C3444 c34411 = (C3444) c0264.get(view6);
                                C3444 c34412 = (C3444) c0265.get(view7);
                                if (c34411 != null && c34412 != null) {
                                    abstractC3436.f10830.add(c34411);
                                    abstractC3436.f10831.add(c34412);
                                    c0264.remove(view6);
                                    c0265.remove(view7);
                                }
                            }
                            i11++;
                            c2104 = c2106;
                            z3 = z3;
                        } else {
                            c2106 = c2104;
                        }
                        i11++;
                        c2104 = c2106;
                        z3 = z3;
                    }
                    z2 = z3;
                    c2105 = c2104;
                }
                i2++;
                c2104 = c2105;
                z3 = z2;
                i = 0;
            }
            z = true;
            for (i3 = 0; i3 < c0264.f8716; i3++) {
                c3445 = (C3444) c0264.m4707(i3);
                if (abstractC3436.m4955(c3445.f10855)) {
                    abstractC3436.f10830.add(c3445);
                    abstractC3436.f10831.add(null);
                }
            }
            for (i4 = 0; i4 < c0265.f8716; i4++) {
                c3444 = (C3444) c0265.m4707(i4);
                if (abstractC3436.m4955(c3444.f10855)) {
                    abstractC3436.f10831.add(c3444);
                    abstractC3436.f10830.add(null);
                }
            }
            c0264M4945 = AbstractC3436.m4945();
            int i12 = c0264M4945.f8716;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) c0264M4945.m4706(i5);
                if (animator == null && (c3432 = (C3432) c0264M4945.get(animator)) != null) {
                    AbstractC3436 abstractC3437 = c3432.f10813;
                    View view8 = c3432.f10809;
                    if (view8 != null && windowId.equals(c3432.f10812)) {
                        C3444 c34413 = c3432.f10811;
                        boolean z4 = true;
                        C3444 c3444M4954 = abstractC3436.m4954(view8, true);
                        C3444 c3444M4952 = abstractC3436.m4952(view8, true);
                        if (c3444M4954 == null && c3444M4952 == null) {
                            c3444M4952 = (C3444) ((C0264) abstractC3436.f10827.f6935).get(view8);
                        }
                        if ((c3444M4954 != null || c3444M4952 != null) && abstractC3437.mo2954(c34413, c3444M4952)) {
                            
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0264M4945.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            abstractC3436.mo1413(viewGroup, abstractC3436.f10826, abstractC3436.f10827, abstractC3436.f10830, abstractC3436.f10831);
            abstractC3436.mo1419();
            return true;
        }
        arrayList2 = new ArrayList();
        c0264M4959.put(viewGroup, arrayList2);
        arrayList2.add(abstractC3436);
        abstractC3436.m4947(new C3438(this, c0264M4959));
        i = 0;
        abstractC3436.m4949(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3436) it.next()).mo1418(viewGroup);
            }
        }
        abstractC3436.f10830 = new ArrayList();
        abstractC3436.f10831 = new ArrayList();
        c2103 = abstractC3436.f10826;
        c2104 = abstractC3436.f10827;
        c0264 = new C0264((C0264) c2103.f6935);
        c0265 = new C0264((C0264) c2104.f6935);
        i2 = 0;
        while (true) {
            iArr = abstractC3436.f10829;
            if (0 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[0];
            if (i6 != z3) {
                c2105 = c2104;
                z2 = z3;
                while (i7 >= 0) {
                    view = (View) c0264.m4706(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                c2105 = c2104;
                z2 = z3;
                c0266 = (C0264) c2103.f6938;
                C0264 c0268 = (C0264) c2105.f6938;
                i8 = c0266.f8716;
                while (i9 < i8) {
                    view2 = (View) c0266.m4707(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) c2103.f6936;
                c2105 = c2104;
                SparseArray sparseArray3 = (SparseArray) c2105.f6936;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            } else if (i6 != 4) {
                c2105 = c2104;
                z2 = z3;
            } else {
                c1863 = (C1863) c2103.f6937;
                C1863 c1865 = (C1863) c2104.f6937;
                iM3634 = c1863.m3634();
                i11 = i;
                while (i11 < iM3634) {
                    view6 = (View) c1863.m3635(i11);
                    if (view6 == null) {
                        c2106 = c2104;
                    } else {
                        c2106 = c2104;
                    }
                    i11++;
                    c2104 = c2106;
                    z3 = z3;
                }
                z2 = z3;
                c2105 = c2104;
            }
            i2++;
            c2104 = c2105;
            z3 = z2;
            i = 0;
        }
        z = true;
        while (i3 < c0264.f8716) {
            c3445 = (C3444) c0264.m4707(i3);
            if (abstractC3436.m4955(c3445.f10855)) {
                abstractC3436.f10830.add(c3445);
                abstractC3436.f10831.add(null);
            }
        }
        while (i4 < c0265.f8716) {
            c3444 = (C3444) c0265.m4707(i4);
            if (abstractC3436.m4955(c3444.f10855)) {
                abstractC3436.f10831.add(c3444);
                abstractC3436.f10830.add(null);
            }
        }
        c0264M4945 = AbstractC3436.m4945();
        int i13 = c0264M4945.f8716;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) c0264M4945.m4706(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        abstractC3436.mo1413(viewGroup, abstractC3436.f10826, abstractC3436.f10827, abstractC3436.f10830, abstractC3436.f10831);
        abstractC3436.mo1419();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f10847;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC3440.f10850.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC3440.m4959().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3436) it.next()).mo1418(viewGroup);
            }
        }
        this.f10846.m4950(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
