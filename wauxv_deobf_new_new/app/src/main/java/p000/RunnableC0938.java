package p000;

import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲈᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0938 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3446;

    public /* synthetic */ RunnableC0938(C0776 c0776, int i) {
        this.f3445 = i;
        this.f3446 = c0776;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f3445;
        C0776 c0776 = this.f3446;
        int i2 = 0;
        switch (i) {
            case 0:
                C0942 c0942 = (C0942) c0776.f2881;
                if (c0942.f3461 == null) {
                    c0942.f3461 = new C0941(c0776, i2);
                }
                C0941 c0941 = c0942.f3461;
                if (c0941 != null) {
                    if (c0941 == null) {
                        c0942.f3461 = new C0941(c0776, i2);
                    }
                    c0942.f3461.m2554(c0942);
                }
                C0776 c0777 = c0942.f3455;
                if (c0777 != null && (maxRelativeLayout = (MaxRelativeLayout) c0777.f2880) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c0942.m905(EnumC1793.f5951);
                break;
            default:
                C0942 c0943 = (C0942) c0776.f2881;
                if (c0943.f3461 == null) {
                    c0943.f3461 = new C0941(c0776, i2);
                }
                c0943.f3461.m2553(c0943);
                RunnableC0149 runnableC0149 = new RunnableC0149(this, 4);
                long jM2378 = c0776.m2378(null);
                if (jM2378 >= 0) {
                    AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                    AbstractC0034.m882().postDelayed(runnableC0149, jM2378);
                    break;
                }
                break;
        }
    }
}
