package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0386 implements Runnable {

    public final /* synthetic */ int f1789;

    public int f1790;

    public final Object f1791;

    public /* synthetic */ RunnableC0386(int i, int i2, Object obj) {
        this.f1789 = i2;
        this.f1791 = obj;
        this.f1790 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1789) {
            case 0:
                ((AbstractC0389) this.f1791).f1806.m2948(this.f1790, 4);
                break;
            case 1:
                C1744 c1744 = (C1744) this.f1791;
                int i = this.f1790;
                AbstractC3681 abstractC3681 = (AbstractC3681) c1744.f5843;
                if (abstractC3681 != null) {
                    abstractC3681.mo1280(i);
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f1791;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f1790 == 1) {
                    while (i2 < size) {
                        ((AbstractC1140) arrayList.get(i2)).mo2752();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((AbstractC1140) arrayList.get(i2)).mo2751();
                        i2++;
                    }
                }
                break;
            default:
                ((AbstractC2123) this.f1791).m3938(this.f1790);
                break;
        }
    }

    public RunnableC0386(List list, int i, Throwable th) {
        this.f1789 = 2;
        AbstractC2665.m4661(list, "initCallbacks cannot be null");
        this.f1791 = new ArrayList(list);
        this.f1790 = i;
    }

    public RunnableC0386(AbstractC0389 abstractC0389) {
        this.f1789 = 0;
        this.f1791 = abstractC0389;
        this.f1790 = -1;
    }
}
