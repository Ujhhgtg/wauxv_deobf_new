package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0786feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3092Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f3093Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC0786feyxiexzfUjhhgtg(RecyclerView recyclerView, int i) {
        this.f3092Ujhhgtgfeyxiexzf = i;
        this.f3093Ujhhgtgfeyxiexzf = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f3092Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3093Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                if (recyclerView.f377Ujhhgtgfeyxiexzf && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f375Ujhhgtgfeyxiexzf) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.f380feyxiexzfUjhhgtg) {
                        recyclerView.f379feyxiexzfUjhhgtg = true;
                    } else {
                        recyclerView.m210Ujhhgtgfeyxiexzf();
                    }
                    break;
                }
                break;
            default:
                AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = recyclerView.f395feyxiexzfUjhhgtg;
                if (abstractC0793feyxiexzfUjhhgtg != null) {
                    C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = (C3116Ujhhgtgfeyxiexzf) abstractC0793feyxiexzfUjhhgtg;
                    long j = c3116Ujhhgtgfeyxiexzf.f3108Ujhhgtgfeyxiexzf;
                    ArrayList<AbstractC0821feyxiexzfUjhhgtg> arrayList = c3116Ujhhgtgfeyxiexzf.f9683Ujhhgtgfeyxiexzf;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c3116Ujhhgtgfeyxiexzf.f9685Ujhhgtgfeyxiexzf;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c3116Ujhhgtgfeyxiexzf.f9686Ujhhgtgfeyxiexzf;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c3116Ujhhgtgfeyxiexzf.f9684Ujhhgtgfeyxiexzf;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg : arrayList) {
                            View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c3116Ujhhgtgfeyxiexzf.f9692Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C3109Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf, abstractC0821feyxiexzfUjhhgtg, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c3116Ujhhgtgfeyxiexzf.f9688Ujhhgtgfeyxiexzf.add(arrayList5);
                            arrayList2.clear();
                            RunnableC3110Ujhhgtgfeyxiexzf runnableC3110Ujhhgtgfeyxiexzf = new RunnableC3110Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf, arrayList5, 0);
                            if (z2) {
                                runnableC3110Ujhhgtgfeyxiexzf.run();
                            } else {
                                View view2 = ((C3120Ujhhgtgfeyxiexzf) arrayList5.get(0)).f9701Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
                                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                                view2.postOnAnimationDelayed(runnableC3110Ujhhgtgfeyxiexzf, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c3116Ujhhgtgfeyxiexzf.f9689Ujhhgtgfeyxiexzf.add(arrayList6);
                            arrayList3.clear();
                            RunnableC3110Ujhhgtgfeyxiexzf runnableC3110Ujhhgtgfeyxiexzf2 = new RunnableC3110Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf, arrayList6, 1);
                            if (z2) {
                                runnableC3110Ujhhgtgfeyxiexzf2.run();
                            } else {
                                View view3 = ((C3119Ujhhgtgfeyxiexzf) arrayList6.get(0)).f9695Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
                                Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                                view3.postOnAnimationDelayed(runnableC3110Ujhhgtgfeyxiexzf2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c3116Ujhhgtgfeyxiexzf.f9687Ujhhgtgfeyxiexzf.add(arrayList7);
                            arrayList4.clear();
                            RunnableC3110Ujhhgtgfeyxiexzf runnableC3110Ujhhgtgfeyxiexzf3 = new RunnableC3110Ujhhgtgfeyxiexzf(c3116Ujhhgtgfeyxiexzf, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC3110Ujhhgtgfeyxiexzf3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c3116Ujhhgtgfeyxiexzf.f3109Ujhhgtgfeyxiexzf : 0L, zIsEmpty3 ? 0L : c3116Ujhhgtgfeyxiexzf.f3110Ujhhgtgfeyxiexzf) + j;
                                z = false;
                                View view4 = ((AbstractC0821feyxiexzfUjhhgtg) arrayList7.get(0)).f3241Ujhhgtgfeyxiexzf;
                                Field field3 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                                view4.postOnAnimationDelayed(runnableC3110Ujhhgtgfeyxiexzf3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.f418feyxiexzfUjhhgtg = z;
                break;
        }
    }
}
