package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2480 implements Runnable {

    public final /* synthetic */ int f7923;

    public final /* synthetic */ RecyclerView f7924;

    public /* synthetic */ RunnableC2480(RecyclerView recyclerView, int i) {
        this.f7923 = i;
        this.f7924 = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f7923;
        RecyclerView recyclerView = this.f7924;
        switch (i) {
            case 0:
                if (recyclerView.f376 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f374) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.f379) {
                        recyclerView.f378 = true;
                    } else {
                        recyclerView.m210();
                    }
                    break;
                }
                break;
            default:
                AbstractC2487 abstractC2487 = recyclerView.f394;
                if (abstractC2487 != null) {
                    C0997 c0997 = (C0997) abstractC2487;
                    long j = c0997.f7932;
                    ArrayList<AbstractC2508> arrayList = c0997.f3643;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0997.f3645;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0997.f3646;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0997.f3644;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (AbstractC2508 abstractC2508 : arrayList) {
                            View view = abstractC2508.f8006;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c0997.f3652.add(abstractC2508);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0992(c0997, abstractC2508, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = false;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c0997.f3648.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0991 runnableC0991 = new RunnableC0991(c0997, arrayList5, 0);
                            if (z2) {
                                runnableC0991.run();
                            } else {
                                View view2 = ((C0996) arrayList5.get(0)).f3636.f8006;
                                Field field = AbstractC3578.f11184;
                                view2.postOnAnimationDelayed(runnableC0991, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c0997.f3649.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0991 runnableC0992 = new RunnableC0991(c0997, arrayList6, 1);
                            if (z2) {
                                runnableC0992.run();
                            } else {
                                View view3 = ((C0995) arrayList6.get(0)).f3630.f8006;
                                Field field2 = AbstractC3578.f11184;
                                view3.postOnAnimationDelayed(runnableC0992, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c0997.f3647.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0991 runnableC0993 = new RunnableC0991(c0997, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC0993.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c0997.f7933 : 0L, zIsEmpty3 ? 0L : c0997.f7934) + j;
                                z = false;
                                View view4 = ((AbstractC2508) arrayList7.get(0)).f8006;
                                Field field3 = AbstractC3578.f11184;
                                view4.postOnAnimationDelayed(runnableC0993, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.f417 = false;
                break;
        }
    }
}
