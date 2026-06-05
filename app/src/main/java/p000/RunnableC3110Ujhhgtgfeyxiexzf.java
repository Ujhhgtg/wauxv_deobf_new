package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3110Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9662Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f9663Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3116Ujhhgtgfeyxiexzf f9664Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3110Ujhhgtgfeyxiexzf(C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf, ArrayList arrayList, int i) {
        this.f9662Ujhhgtgfeyxiexzf = i;
        this.f9664Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf;
        this.f9663Ujhhgtgfeyxiexzf = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9662Ujhhgtgfeyxiexzf) {
            case 0:
                ArrayList arrayList = this.f9663Ujhhgtgfeyxiexzf;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = this.f9664Ujhhgtgfeyxiexzf;
                    if (!zHasNext) {
                        arrayList.clear();
                        c3116Ujhhgtgfeyxiexzf.f9688Ujhhgtgfeyxiexzf.remove(arrayList);
                    } else {
                        C3120Ujhhgtgfeyxiexzf c3120Ujhhgtgfeyxiexzf = (C3120Ujhhgtgfeyxiexzf) it.next();
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c3120Ujhhgtgfeyxiexzf.f9701Ujhhgtgfeyxiexzf;
                        int i = c3120Ujhhgtgfeyxiexzf.f9702Ujhhgtgfeyxiexzf;
                        int i2 = c3120Ujhhgtgfeyxiexzf.f9703Ujhhgtgfeyxiexzf;
                        int i3 = c3120Ujhhgtgfeyxiexzf.f9704Ujhhgtgfeyxiexzf;
                        int i4 = c3120Ujhhgtgfeyxiexzf.f9705Ujhhgtgfeyxiexzf;
                        c3116Ujhhgtgfeyxiexzf.getClass();
                        View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c3116Ujhhgtgfeyxiexzf.f9691Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg);
                        viewPropertyAnimatorAnimate.setDuration(c3116Ujhhgtgfeyxiexzf.f3109Ujhhgtgfeyxiexzf).setListener(new C3112Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf, abstractC0821feyxiexzfUjhhgtg, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f9663Ujhhgtgfeyxiexzf;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf2 = this.f9664Ujhhgtgfeyxiexzf;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c3116Ujhhgtgfeyxiexzf2.f9689Ujhhgtgfeyxiexzf.remove(arrayList2);
                        break;
                    } else {
                        C3119Ujhhgtgfeyxiexzf c3119Ujhhgtgfeyxiexzf = (C3119Ujhhgtgfeyxiexzf) it2.next();
                        ArrayList arrayList3 = c3116Ujhhgtgfeyxiexzf2.f9693Ujhhgtgfeyxiexzf;
                        long j = c3116Ujhhgtgfeyxiexzf2.f3110Ujhhgtgfeyxiexzf;
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = c3119Ujhhgtgfeyxiexzf.f9695Ujhhgtgfeyxiexzf;
                        View view2 = abstractC0821feyxiexzfUjhhgtg2 == null ? null : abstractC0821feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg3 = c3119Ujhhgtgfeyxiexzf.f9696Ujhhgtgfeyxiexzf;
                        View view3 = abstractC0821feyxiexzfUjhhgtg3 != null ? abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c3119Ujhhgtgfeyxiexzf.f9695Ujhhgtgfeyxiexzf);
                            duration.translationX(c3119Ujhhgtgfeyxiexzf.f9699Ujhhgtgfeyxiexzf - c3119Ujhhgtgfeyxiexzf.f9697Ujhhgtgfeyxiexzf);
                            duration.translationY(c3119Ujhhgtgfeyxiexzf.f9700Ujhhgtgfeyxiexzf - c3119Ujhhgtgfeyxiexzf.f9698Ujhhgtgfeyxiexzf);
                            duration.alpha(0.0f).setListener(new C3111Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf2, c3119Ujhhgtgfeyxiexzf, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c3119Ujhhgtgfeyxiexzf.f9696Ujhhgtgfeyxiexzf);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C3111Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf2, c3119Ujhhgtgfeyxiexzf, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f9663Ujhhgtgfeyxiexzf;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf3 = this.f9664Ujhhgtgfeyxiexzf;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c3116Ujhhgtgfeyxiexzf3.f9687Ujhhgtgfeyxiexzf.remove(arrayList4);
                    } else {
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg4 = (AbstractC0821feyxiexzfUjhhgtg) it3.next();
                        c3116Ujhhgtgfeyxiexzf3.getClass();
                        View view4 = abstractC0821feyxiexzfUjhhgtg4.f3241Ujhhgtgfeyxiexzf;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c3116Ujhhgtgfeyxiexzf3.f9690Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c3116Ujhhgtgfeyxiexzf3.f3107Ujhhgtgfeyxiexzf).setListener(new C3109Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf3, abstractC0821feyxiexzfUjhhgtg4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
