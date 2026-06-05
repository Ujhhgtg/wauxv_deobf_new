package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱfeyxiexzfᛱᛴ要点脸能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public AbstractC1747feyxiexzfUjhhgtg f5900Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ViewGroup f5901Ujhhgtgfeyxiexzf;

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
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf2;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C2412Ujhhgtgfeyxiexzf c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf;
        int i5;
        Animator animator;
        C1748feyxiexzfUjhhgtg c1748feyxiexzfUjhhgtg;
        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg;
        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2;
        int i6;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf3;
        boolean z2;
        int i7;
        View view;
        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg3;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf;
        int iM1453Ujhhgtgfeyxiexzf;
        int i11;
        View view6;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf4;
        Iterator it;
        AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg = this.f5900Ujhhgtgfeyxiexzf;
        ViewGroup viewGroup = this.f5901Ujhhgtgfeyxiexzf;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!AbstractC1756feyxiexzfUjhhgtg.f5899Ujhhgtgfeyxiexzf.remove(viewGroup)) {
            return true;
        }
        C2412Ujhhgtgfeyxiexzf c2412UjhhgtgfeyxiexzfM3051Ujhhgtgfeyxiexzf = AbstractC1756feyxiexzfUjhhgtg.m3051Ujhhgtgfeyxiexzf();
        ArrayList arrayList2 = (ArrayList) c2412UjhhgtgfeyxiexzfM3051Ujhhgtgfeyxiexzf.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC1747feyxiexzfUjhhgtg);
            abstractC1747feyxiexzfUjhhgtg.m3014Ujhhgtgfeyxiexzf(new C1754feyxiexzfUjhhgtg(this, c2412UjhhgtgfeyxiexzfM3051Ujhhgtgfeyxiexzf));
            i = 0;
            abstractC1747feyxiexzfUjhhgtg.m3019Ujhhgtgfeyxiexzf(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC1747feyxiexzfUjhhgtg) it.next()).mo3036feyxiexzfUjhhgtg(viewGroup);
                }
            }
            abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf = new ArrayList();
            abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf = new ArrayList();
            c0416Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtg.f5865Ujhhgtgfeyxiexzf;
            c0416Ujhhgtgfeyxiexzf2 = abstractC1747feyxiexzfUjhhgtg.f5866Ujhhgtgfeyxiexzf;
            c2412Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf((C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf);
            c2412Ujhhgtgfeyxiexzf2 = new C2412Ujhhgtgfeyxiexzf((C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf2.f2243Ujhhgtgfeyxiexzf);
            i2 = 0;
            while (true) {
                iArr = abstractC1747feyxiexzfUjhhgtg.f5868Ujhhgtgfeyxiexzf;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z3) {
                    c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                    z2 = z3;
                    for (i7 = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf - 1; i7 >= 0; i7--) {
                        view = (View) c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i7);
                        if (view == null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view) && (c1787feyxiexzfUjhhgtg3 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.remove(view)) != null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg3.f6029Ujhhgtgfeyxiexzf)) {
                            abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add((C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(i7));
                            abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg3);
                        }
                    }
                } else if (i6 != 2) {
                    c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                    z2 = z3;
                    c2412Ujhhgtgfeyxiexzf3 = (C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
                    C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf4 = (C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf3.f2246Ujhhgtgfeyxiexzf;
                    i8 = c2412Ujhhgtgfeyxiexzf3.f4069Ujhhgtgfeyxiexzf;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) c2412Ujhhgtgfeyxiexzf3.m2540Ujhhgtgfeyxiexzf(i9);
                        if (view2 == null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view2) && (view3 = (View) c2412Ujhhgtgfeyxiexzf4.get(c2412Ujhhgtgfeyxiexzf3.m2536Ujhhgtgfeyxiexzf(i9))) != null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view3)) {
                            C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg4 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.get(view2);
                            C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg5 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.get(view3);
                            if (c1787feyxiexzfUjhhgtg4 != null && c1787feyxiexzfUjhhgtg5 != null) {
                                abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg4);
                                abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg5);
                                c2412Ujhhgtgfeyxiexzf.remove(view2);
                                c2412Ujhhgtgfeyxiexzf2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf;
                    c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                    SparseArray sparseArray2 = (SparseArray) c0416Ujhhgtgfeyxiexzf3.f2244Ujhhgtgfeyxiexzf;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view5)) {
                            C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg6 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.get(view4);
                            C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg7 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.get(view5);
                            if (c1787feyxiexzfUjhhgtg6 != null && c1787feyxiexzfUjhhgtg7 != null) {
                                abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg6);
                                abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg7);
                                c2412Ujhhgtgfeyxiexzf.remove(view4);
                                c2412Ujhhgtgfeyxiexzf2.remove(view5);
                            }
                        }
                    }
                } else if (i6 != 4) {
                    c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                    z2 = z3;
                } else {
                    c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                    C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf2 = (C0267Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf2.f2245Ujhhgtgfeyxiexzf;
                    iM1453Ujhhgtgfeyxiexzf = c0267Ujhhgtgfeyxiexzf.m1453Ujhhgtgfeyxiexzf();
                    i11 = i;
                    while (i11 < iM1453Ujhhgtgfeyxiexzf) {
                        view6 = (View) c0267Ujhhgtgfeyxiexzf.m1454Ujhhgtgfeyxiexzf(i11);
                        if (view6 == null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view6)) {
                            c0416Ujhhgtgfeyxiexzf4 = c0416Ujhhgtgfeyxiexzf2;
                            View view7 = (View) c0267Ujhhgtgfeyxiexzf2.m1450Ujhhgtgfeyxiexzf(c0267Ujhhgtgfeyxiexzf.m1451Ujhhgtgfeyxiexzf(i11));
                            if (view7 != null && abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view7)) {
                                C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg8 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.get(view6);
                                C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg9 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.get(view7);
                                if (c1787feyxiexzfUjhhgtg8 != null && c1787feyxiexzfUjhhgtg9 != null) {
                                    abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg8);
                                    abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg9);
                                    c2412Ujhhgtgfeyxiexzf.remove(view6);
                                    c2412Ujhhgtgfeyxiexzf2.remove(view7);
                                }
                            }
                            i11++;
                            c0416Ujhhgtgfeyxiexzf2 = c0416Ujhhgtgfeyxiexzf4;
                            z3 = z3;
                        } else {
                            c0416Ujhhgtgfeyxiexzf4 = c0416Ujhhgtgfeyxiexzf2;
                        }
                        i11++;
                        c0416Ujhhgtgfeyxiexzf2 = c0416Ujhhgtgfeyxiexzf4;
                        z3 = z3;
                    }
                    z2 = z3;
                    c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                }
                i2++;
                c0416Ujhhgtgfeyxiexzf2 = c0416Ujhhgtgfeyxiexzf3;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf; i3++) {
                c1787feyxiexzfUjhhgtg2 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i3);
                if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf)) {
                    abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg2);
                    abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(null);
                }
            }
            for (i4 = 0; i4 < c2412Ujhhgtgfeyxiexzf2.f4069Ujhhgtgfeyxiexzf; i4++) {
                c1787feyxiexzfUjhhgtg = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.m2540Ujhhgtgfeyxiexzf(i4);
                if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf)) {
                    abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg);
                    abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(null);
                }
            }
            c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf = AbstractC1747feyxiexzfUjhhgtg.m3012Ujhhgtgfeyxiexzf();
            int i12 = c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i5);
                if (animator == null && (c1748feyxiexzfUjhhgtg = (C1748feyxiexzfUjhhgtg) c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.get(animator)) != null) {
                    AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg2 = c1748feyxiexzfUjhhgtg.f5887Ujhhgtgfeyxiexzf;
                    View view8 = c1748feyxiexzfUjhhgtg.f5883Ujhhgtgfeyxiexzf;
                    if (view8 != null && windowId.equals(c1748feyxiexzfUjhhgtg.f5886Ujhhgtgfeyxiexzf)) {
                        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg10 = c1748feyxiexzfUjhhgtg.f5885Ujhhgtgfeyxiexzf;
                        boolean z4 = z;
                        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtgM3028Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtg.m3028Ujhhgtgfeyxiexzf(view8, z4);
                        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtgM3025Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtg.m3025Ujhhgtgfeyxiexzf(view8, z4);
                        if (c1787feyxiexzfUjhhgtgM3028Ujhhgtgfeyxiexzf == null && c1787feyxiexzfUjhhgtgM3025Ujhhgtgfeyxiexzf == null) {
                            c1787feyxiexzfUjhhgtgM3025Ujhhgtgfeyxiexzf = (C1787feyxiexzfUjhhgtg) ((C2412Ujhhgtgfeyxiexzf) abstractC1747feyxiexzfUjhhgtg.f5866Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf).get(view8);
                        }
                        if ((c1787feyxiexzfUjhhgtgM3028Ujhhgtgfeyxiexzf != null || c1787feyxiexzfUjhhgtgM3025Ujhhgtgfeyxiexzf != null) && abstractC1747feyxiexzfUjhhgtg2.mo3030Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg10, c1787feyxiexzfUjhhgtgM3025Ujhhgtgfeyxiexzf)) {
                            abstractC1747feyxiexzfUjhhgtg2.m3026Ujhhgtgfeyxiexzf().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            abstractC1747feyxiexzfUjhhgtg.mo3023Ujhhgtgfeyxiexzf(viewGroup, abstractC1747feyxiexzfUjhhgtg.f5865Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5866Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf);
            abstractC1747feyxiexzfUjhhgtg.mo3037feyxiexzfUjhhgtg();
            return true;
        }
        arrayList2 = new ArrayList();
        c2412UjhhgtgfeyxiexzfM3051Ujhhgtgfeyxiexzf.put(viewGroup, arrayList2);
        arrayList2.add(abstractC1747feyxiexzfUjhhgtg);
        abstractC1747feyxiexzfUjhhgtg.m3014Ujhhgtgfeyxiexzf(new C1754feyxiexzfUjhhgtg(this, c2412UjhhgtgfeyxiexzfM3051Ujhhgtgfeyxiexzf));
        i = 0;
        abstractC1747feyxiexzfUjhhgtg.m3019Ujhhgtgfeyxiexzf(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1747feyxiexzfUjhhgtg) it.next()).mo3036feyxiexzfUjhhgtg(viewGroup);
            }
        }
        abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf = new ArrayList();
        abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf = new ArrayList();
        c0416Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtg.f5865Ujhhgtgfeyxiexzf;
        c0416Ujhhgtgfeyxiexzf2 = abstractC1747feyxiexzfUjhhgtg.f5866Ujhhgtgfeyxiexzf;
        c2412Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf((C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf);
        c2412Ujhhgtgfeyxiexzf2 = new C2412Ujhhgtgfeyxiexzf((C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf2.f2243Ujhhgtgfeyxiexzf);
        i2 = 0;
        while (true) {
            iArr = abstractC1747feyxiexzfUjhhgtg.f5868Ujhhgtgfeyxiexzf;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z3) {
                c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                z2 = z3;
                while (i7 >= 0) {
                    view = (View) c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                z2 = z3;
                c2412Ujhhgtgfeyxiexzf3 = (C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
                C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf5 = (C2412Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf3.f2246Ujhhgtgfeyxiexzf;
                i8 = c2412Ujhhgtgfeyxiexzf3.f4069Ujhhgtgfeyxiexzf;
                while (i9 < i8) {
                    view2 = (View) c2412Ujhhgtgfeyxiexzf3.m2540Ujhhgtgfeyxiexzf(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf;
                c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                SparseArray sparseArray3 = (SparseArray) c0416Ujhhgtgfeyxiexzf3.f2244Ujhhgtgfeyxiexzf;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            } else if (i6 != 4) {
                c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
                z2 = z3;
            } else {
                c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf3 = (C0267Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf2.f2245Ujhhgtgfeyxiexzf;
                iM1453Ujhhgtgfeyxiexzf = c0267Ujhhgtgfeyxiexzf.m1453Ujhhgtgfeyxiexzf();
                i11 = i;
                while (i11 < iM1453Ujhhgtgfeyxiexzf) {
                    view6 = (View) c0267Ujhhgtgfeyxiexzf.m1454Ujhhgtgfeyxiexzf(i11);
                    if (view6 == null) {
                        c0416Ujhhgtgfeyxiexzf4 = c0416Ujhhgtgfeyxiexzf2;
                    } else {
                        c0416Ujhhgtgfeyxiexzf4 = c0416Ujhhgtgfeyxiexzf2;
                    }
                    i11++;
                    c0416Ujhhgtgfeyxiexzf2 = c0416Ujhhgtgfeyxiexzf4;
                    z3 = z3;
                }
                z2 = z3;
                c0416Ujhhgtgfeyxiexzf3 = c0416Ujhhgtgfeyxiexzf2;
            }
            i2++;
            c0416Ujhhgtgfeyxiexzf2 = c0416Ujhhgtgfeyxiexzf3;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf) {
            c1787feyxiexzfUjhhgtg2 = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i3);
            if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf)) {
                abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg2);
                abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(null);
            }
        }
        while (i4 < c2412Ujhhgtgfeyxiexzf2.f4069Ujhhgtgfeyxiexzf) {
            c1787feyxiexzfUjhhgtg = (C1787feyxiexzfUjhhgtg) c2412Ujhhgtgfeyxiexzf2.m2540Ujhhgtgfeyxiexzf(i4);
            if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf)) {
                abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf.add(c1787feyxiexzfUjhhgtg);
                abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf.add(null);
            }
        }
        c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf = AbstractC1747feyxiexzfUjhhgtg.m3012Ujhhgtgfeyxiexzf();
        int i13 = c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) c2412UjhhgtgfeyxiexzfM3012Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        abstractC1747feyxiexzfUjhhgtg.mo3023Ujhhgtgfeyxiexzf(viewGroup, abstractC1747feyxiexzfUjhhgtg.f5865Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5866Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5869Ujhhgtgfeyxiexzf, abstractC1747feyxiexzfUjhhgtg.f5870Ujhhgtgfeyxiexzf);
        abstractC1747feyxiexzfUjhhgtg.mo3037feyxiexzfUjhhgtg();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f5901Ujhhgtgfeyxiexzf;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC1756feyxiexzfUjhhgtg.f5899Ujhhgtgfeyxiexzf.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC1756feyxiexzfUjhhgtg.m3051Ujhhgtgfeyxiexzf().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1747feyxiexzfUjhhgtg) it.next()).mo3036feyxiexzfUjhhgtg(viewGroup);
            }
        }
        this.f5900Ujhhgtgfeyxiexzf.m3020Ujhhgtgfeyxiexzf(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
