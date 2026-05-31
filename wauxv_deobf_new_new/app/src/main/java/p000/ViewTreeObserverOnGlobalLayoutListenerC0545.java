package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲀᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0545 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1978 f2264;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0545(AbstractC1978 abstractC1978, int i) {
        this.f2263 = i;
        this.f2264 = abstractC1978;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2263) {
            case 0:
                ViewOnKeyListenerC0549 viewOnKeyListenerC0549 = (ViewOnKeyListenerC0549) this.f2264;
                ArrayList arrayList = viewOnKeyListenerC0549.f2281;
                if (viewOnKeyListenerC0549.mo2064() && arrayList.size() > 0 && !((C0548) arrayList.get(0)).f2272.f6156) {
                    View view = viewOnKeyListenerC0549.f2288;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0548) it.next()).f2272.mo2065();
                        }
                    } else {
                        viewOnKeyListenerC0549.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC2867 viewOnKeyListenerC2867 = (ViewOnKeyListenerC2867) this.f2264;
                C1984 c1984 = viewOnKeyListenerC2867.f9146;
                if (viewOnKeyListenerC2867.mo2064() && !c1984.f6156) {
                    View view2 = viewOnKeyListenerC2867.f9151;
                    if (view2 != null && view2.isShown()) {
                        c1984.mo2065();
                    } else {
                        viewOnKeyListenerC2867.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
