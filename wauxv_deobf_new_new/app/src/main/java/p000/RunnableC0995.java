package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᛸᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0995 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1001 f3629;

    public /* synthetic */ RunnableC0995(C1001 c1001, ArrayList arrayList, int i) {
        this.f3627 = i;
        this.f3629 = c1001;
        this.f3628 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3627) {
            case 0:
                ArrayList arrayList = this.f3628;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1001 c1001 = this.f3629;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1001.f3664.remove(arrayList);
                    } else {
                        C1000 c1000 = (C1000) it.next();
                        AbstractC2563 abstractC2563 = c1000.f3652;
                        int i = c1000.f3653;
                        int i2 = c1000.f3654;
                        int i3 = c1000.f3655;
                        int i4 = c1000.f3656;
                        c1001.getClass();
                        View view = abstractC2563.f8157;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1001.f3667.add(abstractC2563);
                        viewPropertyAnimatorAnimate.setDuration(c1001.f8084).setListener(new C0997(c1001, abstractC2563, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f3628;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1001 c1002 = this.f3629;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1002.f3665.remove(arrayList2);
                        break;
                    } else {
                        C0999 c0999 = (C0999) it2.next();
                        ArrayList arrayList3 = c1002.f3669;
                        long j = c1002.f8085;
                        AbstractC2563 abstractC2564 = c0999.f3646;
                        View view2 = abstractC2564 == null ? null : abstractC2564.f8157;
                        AbstractC2563 abstractC2565 = c0999.f3647;
                        View view3 = abstractC2565 != null ? abstractC2565.f8157 : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0999.f3646);
                            duration.translationX(c0999.f3650 - c0999.f3648);
                            duration.translationY(c0999.f3651 - c0999.f3649);
                            duration.alpha(0.0f).setListener(new C0998(c1002, c0999, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0999.f3647);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0998(c1002, c0999, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f3628;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1001 c1003 = this.f3629;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1003.f3663.remove(arrayList4);
                    } else {
                        AbstractC2563 abstractC2566 = (AbstractC2563) it3.next();
                        c1003.getClass();
                        View view4 = abstractC2566.f8157;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1003.f3666.add(abstractC2566);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1003.f8082).setListener(new C0996(c1003, abstractC2566, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
