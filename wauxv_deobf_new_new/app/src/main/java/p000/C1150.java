package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1150 extends AbstractC2240 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2240 f4262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f4263;

    public C1150(AbstractC2240 abstractC2240, ThreadPoolExecutor threadPoolExecutor) {
        this.f4262 = abstractC2240;
        this.f4263 = threadPoolExecutor;
    }

    @Override // p000.AbstractC2240
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final void mo2878(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4263;
        try {
            this.f4262.mo2878(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC2240
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final void mo2879(C2136 c2136) {
        ThreadPoolExecutor threadPoolExecutor = this.f4263;
        try {
            this.f4262.mo2879(c2136);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
