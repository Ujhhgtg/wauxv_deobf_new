package p000;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235 extends AbstractC0878 {

    public long f4463;

    public boolean f4464;

    public C0256 f4465;

    public abstract void shutdown();

    public final void m2873() {
        long j = this.f4463 - 4294967296L;
        this.f4463 = j;
        if (j <= 0 && this.f4464) {
            shutdown();
        }
    }

    public abstract Thread mo1638();

    public final void m2874(boolean z) {
        this.f4463 = (z ? 4294967296L : 1L) + this.f4463;
        if (z) {
            return;
        }
        this.f4464 = true;
    }

    public final boolean m2875() {
        C0256 c0256 = this.f4465;
        if (c0256 == null) {
            return false;
        }
        AbstractC1074 abstractC1074 = (AbstractC1074) (c0256.isEmpty() ? null : c0256.removeFirst());
        if (abstractC1074 == null) {
            return false;
        }
        abstractC1074.run();
        return true;
    }

    public void mo2549(long j, AbstractRunnableC1232 abstractRunnableC1232) {
        RunnableC0984.f3601.m2872(j, abstractRunnableC1232);
    }
}
