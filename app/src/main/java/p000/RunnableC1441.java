package p000;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1441 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final ThreadLocal f5104 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0171 f5105 = new C0171(8);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f5107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f5108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f5106 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f5109 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static AbstractC2508 m3136(RecyclerView recyclerView, int i, long j) {
        int iM1997 = recyclerView.f361.m1997();
        for (int i2 = 0; i2 < iM1997; i2++) {
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(recyclerView.f361.m1996(i2));
            if (abstractC2508M204.f8008 == i && !abstractC2508M204.m4516()) {
                return null;
            }
        }
        C2498 c2498 = recyclerView.f358;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC3422.m4939()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.m240(false);
                Trace.endSection();
            }
        }
        recyclerView.m239();
        AbstractC2508 abstractC2508M4500 = c2498.m4500(i, j);
        if (abstractC2508M4500 != null) {
            if (!abstractC2508M4500.m4515() || abstractC2508M4500.m4516()) {
                c2498.m4490(abstractC2508M4500, false);
            } else {
                c2498.m4497(abstractC2508M4500.f8006);
            }
        }
        return abstractC2508M4500;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5106;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m3138(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5108);
                }
            }
        } finally {
            this.f5107 = 0L;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3137(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f374) {
            if (RecyclerView.f347 && !this.f5106.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5107 == 0) {
                this.f5107 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1439 c1439 = recyclerView.f410;
        c1439.f5095 = i;
        c1439.f5096 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3138(long j) {
        C1440 c1440;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1440 c1441;
        ArrayList arrayList = this.f5106;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C1439 c1439 = recyclerView3.f410;
            if (windowVisibility == 0) {
                c1439.m3135(recyclerView3, false);
                i2 += c1439.f5098;
            }
        }
        ArrayList arrayList2 = this.f5109;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1439 c14310 = recyclerView4.f410;
                int iAbs = Math.abs(c14310.f5096) + Math.abs(c14310.f5095);
                for (int i6 = i; i6 < c14310.f5098 * 2; i6 += 2) {
                    if (i5 >= arrayList2.size()) {
                        c1441 = new C1440();
                        arrayList2.add(c1441);
                    } else {
                        c1441 = (C1440) arrayList2.get(i5);
                    }
                    int[] iArr = c14310.f5097;
                    int i7 = iArr[i6 + 1];
                    c1441.f5099 = i7 <= iAbs;
                    c1441.f5100 = iAbs;
                    c1441.f5101 = i7;
                    c1441.f5102 = recyclerView4;
                    c1441.f5103 = iArr[i6];
                    i5++;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, f5105);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (c1440 = (C1440) arrayList2.get(i8)).f5102) != null; i8++) {
            AbstractC2508 abstractC2508M3136 = m3136(recyclerView, c1440.f5103, c1440.f5099 ? Long.MAX_VALUE : j);
            if (abstractC2508M3136 != null && abstractC2508M3136.f8007 != null && abstractC2508M3136.m4515() && !abstractC2508M3136.m4516() && (recyclerView2 = (RecyclerView) abstractC2508M3136.f8007.get()) != null) {
                if (recyclerView2.f385 && recyclerView2.f361.m1997() != 0) {
                    C2498 c2498 = recyclerView2.f358;
                    AbstractC2487 abstractC2487 = recyclerView2.f394;
                    if (abstractC2487 != null) {
                        abstractC2487.mo2567();
                    }
                    AbstractC2491 abstractC2491 = recyclerView2.f369;
                    if (abstractC2491 != null) {
                        abstractC2491.m4475(c2498);
                        recyclerView2.f369.m4476(c2498);
                    }
                    c2498.f7967.clear();
                    c2498.m4495();
                }
                C1439 c14311 = recyclerView2.f410;
                c14311.m3135(recyclerView2, true);
                if (c14311.f5098 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C2504 c2504 = recyclerView2.f411;
                        AbstractC2482 abstractC2482 = recyclerView2.f368;
                        c2504.f7987 = 1;
                        c2504.f7988 = abstractC2482.mo2040();
                        c2504.f7990 = false;
                        c2504.f7991 = false;
                        c2504.f7992 = false;
                        for (int i9 = 0; i9 < c14311.f5098 * 2; i9 += 2) {
                            m3136(recyclerView2, c14311.f5097[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1440.f5099 = false;
            c1440.f5100 = 0;
            c1440.f5101 = 0;
            c1440.f5102 = null;
            c1440.f5103 = 0;
        }
    }
}
