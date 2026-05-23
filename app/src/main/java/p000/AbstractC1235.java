package p000;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲀᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235 extends AbstractC0878 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f4463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f4464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0256 f4465;

    public abstract void shutdown();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m2873() {
        long j = this.f4463 - 4294967296L;
        this.f4463 = j;
        if (j <= 0 && this.f4464) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public abstract Thread mo1638();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2874(boolean z) {
        this.f4463 = (z ? 4294967296L : 1L) + this.f4463;
        if (z) {
            return;
        }
        this.f4464 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public void mo2549(long j, AbstractRunnableC1232 abstractRunnableC1232) {
        RunnableC0984.f3601.m2872(j, abstractRunnableC1232);
    }
}
