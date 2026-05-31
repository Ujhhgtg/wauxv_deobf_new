package p000;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1237 extends AbstractC0877 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f4461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f4462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0266 f4463;

    public abstract void shutdown();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m2995() {
        long j = this.f4461 - JSONWriter.MASK_IGNORE_NON_FIELD_GETTER;
        this.f4461 = j;
        if (j <= 0 && this.f4462) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public abstract Thread mo1744();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2996(boolean z) {
        this.f4461 = (z ? JSONWriter.MASK_IGNORE_NON_FIELD_GETTER : 1L) + this.f4461;
        if (z) {
            return;
        }
        this.f4462 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final boolean m2997() {
        C0266 c0266 = this.f4463;
        if (c0266 == null) {
            return false;
        }
        AbstractC1079 abstractC1079 = (AbstractC1079) (c0266.isEmpty() ? null : c0266.removeFirst());
        if (abstractC1079 == null) {
            return false;
        }
        abstractC1079.run();
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public void mo2673(long j, AbstractRunnableC1234 abstractRunnableC1234) {
        RunnableC0988.f3617.m2994(j, abstractRunnableC1234);
    }
}
