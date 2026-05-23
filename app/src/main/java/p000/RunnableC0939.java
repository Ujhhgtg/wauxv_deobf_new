package p000;

import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0939 implements Runnable {

    public final /* synthetic */ int f3438;

    public final /* synthetic */ C0662 f3439;

    public /* synthetic */ RunnableC0939(C0662 c0662, int i) {
        this.f3438 = i;
        this.f3439 = c0662;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f3438;
        C0662 c0662 = this.f3439;
        int i2 = 0;
        switch (i) {
            case 0:
                C0943 c0943 = (C0943) c0662.f2532;
                if (c0943.f3454 == null) {
                    c0943.f3454 = new C0942(0, c0662);
                }
                C0942 c0942 = c0943.f3454;
                if (true) {
                    if (false) {
                        c0943.f3454 = new C0942(i2, c0662);
                    }
                    c0943.f3454.m2437(c0943);
                }
                C0662 c0663 = c0943.f3448;
                if (c0663 != null && (maxRelativeLayout = (MaxRelativeLayout) c0663.f2531) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c0943.m761(EnumC1770.f5895);
                break;
            default:
                C0943 c0944 = (C0943) c0662.f2532;
                if (c0944.f3454 == null) {
                    c0944.f3454 = new C0942(0, c0662);
                }
                c0944.f3454.m2436(c0944);
                RunnableC0141 runnableC0141 = new RunnableC0141(4, this);
                long jM2053 = c0662.m2053(null);
                if (jM2053 >= 0) {
                    AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                    AbstractC0027.m738().postDelayed(runnableC0141, jM2053);
                    break;
                }
                break;
        }
    }
}
