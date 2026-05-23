package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1144 extends AbstractC1458 {

    public final /* synthetic */ AbstractC1458 f4250;

    public final /* synthetic */ ThreadPoolExecutor f4251;

    public C1144(AbstractC1458 abstractC1458, ThreadPoolExecutor threadPoolExecutor) {
        this.f4250 = abstractC1458;
        this.f4251 = threadPoolExecutor;
    }

    @Override // p000.AbstractC1458
    public final void mo2734(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4251;
        try {
            this.f4250.mo2734(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC1458
    public final void mo2735(C2103 c2103) {
        ThreadPoolExecutor threadPoolExecutor = this.f4251;
        try {
            this.f4250.mo2735(c2103);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
