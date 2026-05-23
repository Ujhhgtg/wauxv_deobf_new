package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0991 implements Runnable {

    public final /* synthetic */ int f3611;

    public final /* synthetic */ ArrayList f3612;

    public final /* synthetic */ C0997 f3613;

    public /* synthetic */ RunnableC0991(C0997 c0997, ArrayList arrayList, int i) {
        this.f3611 = i;
        this.f3613 = c0997;
        this.f3612 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3611) {
            case 0:
                ArrayList arrayList = this.f3612;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C0997 c0997 = this.f3613;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0997.f3648.remove(arrayList);
                    } else {
                        C0996 c0996 = (C0996) it.next();
                        AbstractC2508 abstractC2508 = c0996.f3636;
                        int i = c0996.f3637;
                        int i2 = c0996.f3638;
                        int i3 = c0996.f3639;
                        int i4 = c0996.f3640;
                        
                        View view = abstractC2508.f8006;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0997.f3651.add(abstractC2508);
                        viewPropertyAnimatorAnimate.setDuration(c0997.f7933).setListener(new C0993(c0997, abstractC2508, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f3612;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0997 c0998 = this.f3613;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0998.f3649.remove(arrayList2);
                        break;
                    } else {
                        C0995 c0995 = (C0995) it2.next();
                        ArrayList arrayList3 = c0998.f3653;
                        long j = c0998.f7934;
                        AbstractC2508 abstractC2509 = c0995.f3630;
                        View view2 = abstractC2509 == null ? null : abstractC2509.f8006;
                        AbstractC2508 abstractC25010 = c0995.f3631;
                        View view3 = abstractC25010 != null ? abstractC25010.f8006 : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0995.f3630);
                            duration.translationX(c0995.f3634 - c0995.f3632);
                            duration.translationY(c0995.f3635 - c0995.f3633);
                            duration.alpha(0.0f).setListener(new C0994(c0998, c0995, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0995.f3631);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0994(c0998, c0995, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f3612;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C0997 c0999 = this.f3613;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0999.f3647.remove(arrayList4);
                    } else {
                        AbstractC2508 abstractC25011 = (AbstractC2508) it3.next();
                        
                        View view4 = abstractC25011.f8006;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0999.f3650.add(abstractC25011);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0999.f7931).setListener(new C0992(c0999, abstractC25011, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
