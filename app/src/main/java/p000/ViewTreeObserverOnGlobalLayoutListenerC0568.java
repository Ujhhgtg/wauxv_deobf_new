package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0568 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final /* synthetic */ int f2301;

    public final /* synthetic */ AbstractC1947 f2302;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0568(AbstractC1947 abstractC1947, int i) {
        this.f2301 = i;
        this.f2302 = abstractC1947;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2301) {
            case 0:
                ViewOnKeyListenerC0572 viewOnKeyListenerC0572 = (ViewOnKeyListenerC0572) this.f2302;
                ArrayList arrayList = viewOnKeyListenerC0572.f2319;
                if (viewOnKeyListenerC0572.mo1967() && arrayList.size() > 0 && !((C0571) arrayList.get(0)).f2310.f6081) {
                    View view = viewOnKeyListenerC0572.f2326;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0571) it.next()).f2310.mo1968();
                        }
                    } else {
                        viewOnKeyListenerC0572.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC2808 viewOnKeyListenerC2808 = (ViewOnKeyListenerC2808) this.f2302;
                C1953 c1953 = viewOnKeyListenerC2808.f8985;
                if (viewOnKeyListenerC2808.mo1967() && !c1953.f6081) {
                    View view2 = viewOnKeyListenerC2808.f8990;
                    if (view2 != null && view2.isShown()) {
                        c1953.mo1968();
                    } else {
                        viewOnKeyListenerC2808.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
