package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᤝᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2535 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8075;

    public /* synthetic */ RunnableC2535(RecyclerView recyclerView, int i) {
        this.f8074 = i;
        this.f8075 = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f8074;
        RecyclerView recyclerView = this.f8075;
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
                AbstractC2542 abstractC2542 = recyclerView.f394;
                if (abstractC2542 != null) {
                    C1001 c1001 = (C1001) abstractC2542;
                    long j = c1001.f8083;
                    ArrayList<AbstractC2563> arrayList = c1001.f3659;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1001.f3661;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1001.f3662;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1001.f3660;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (AbstractC2563 abstractC2563 : arrayList) {
                            View view = abstractC2563.f8157;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c1001.f3668.add(abstractC2563);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0996(c1001, abstractC2563, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c1001.f3664.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0995 runnableC0995 = new RunnableC0995(c1001, arrayList5, 0);
                            if (z2) {
                                runnableC0995.run();
                            } else {
                                View view2 = ((C1000) arrayList5.get(0)).f3652.f8157;
                                Field field = AbstractC3638.f11333;
                                view2.postOnAnimationDelayed(runnableC0995, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c1001.f3665.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0995 runnableC0996 = new RunnableC0995(c1001, arrayList6, 1);
                            if (z2) {
                                runnableC0996.run();
                            } else {
                                View view3 = ((C0999) arrayList6.get(0)).f3646.f8157;
                                Field field2 = AbstractC3638.f11333;
                                view3.postOnAnimationDelayed(runnableC0996, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c1001.f3663.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0995 runnableC0997 = new RunnableC0995(c1001, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC0997.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c1001.f8084 : 0L, zIsEmpty3 ? 0L : c1001.f8085) + j;
                                z = false;
                                View view4 = ((AbstractC2563) arrayList7.get(0)).f8157;
                                Field field3 = AbstractC3638.f11333;
                                view4.postOnAnimationDelayed(runnableC0997, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.f417 = z;
                break;
        }
    }
}
