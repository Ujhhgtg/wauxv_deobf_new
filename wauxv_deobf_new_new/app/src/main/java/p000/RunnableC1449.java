package p000;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1449 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f5133 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0179 f5134 = new C0179(12);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f5136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f5137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f5135 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f5138 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static AbstractC2563 m3243(RecyclerView recyclerView, int i, long j) {
        int iM2094 = recyclerView.f361.m2094();
        for (int i2 = 0; i2 < iM2094; i2++) {
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(recyclerView.f361.m2093(i2));
            if (abstractC2563M204.f8159 == i && !abstractC2563M204.m4538()) {
                return null;
            }
        }
        C2553 c2553 = recyclerView.f358;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC3480.m5001()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.m240(false);
                Trace.endSection();
            }
        }
        recyclerView.m239();
        AbstractC2563 abstractC2563M4521 = c2553.m4521(i, j);
        if (abstractC2563M4521 != null) {
            if (!abstractC2563M4521.m4537() || abstractC2563M4521.m4538()) {
                c2553.m4511(abstractC2563M4521, false);
            } else {
                c2553.m4518(abstractC2563M4521.f8157);
            }
        }
        return abstractC2563M4521;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5135;
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
                    m3245(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5137);
                }
            }
        } finally {
            this.f5136 = 0L;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3244(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f374) {
            if (RecyclerView.f347 && !this.f5135.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5136 == 0) {
                this.f5136 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1447 c1447 = recyclerView.f410;
        c1447.f5124 = i;
        c1447.f5125 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3245(long j) {
        C1448 c1448;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1448 c1449;
        ArrayList arrayList = this.f5135;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C1447 c1447 = recyclerView3.f410;
            if (windowVisibility == 0) {
                c1447.m3242(recyclerView3, false);
                i2 += c1447.f5127;
            }
        }
        ArrayList arrayList2 = this.f5138;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1447 c14410 = recyclerView4.f410;
                int iAbs = Math.abs(c14410.f5125) + Math.abs(c14410.f5124);
                for (int i6 = i; i6 < c14410.f5127 * 2; i6 += 2) {
                    if (i5 >= arrayList2.size()) {
                        c1449 = new C1448();
                        arrayList2.add(c1449);
                    } else {
                        c1449 = (C1448) arrayList2.get(i5);
                    }
                    int[] iArr = c14410.f5126;
                    int i7 = iArr[i6 + 1];
                    c1449.f5128 = i7 <= iAbs;
                    c1449.f5129 = iAbs;
                    c1449.f5130 = i7;
                    c1449.f5131 = recyclerView4;
                    c1449.f5132 = iArr[i6];
                    i5++;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, f5134);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (c1448 = (C1448) arrayList2.get(i8)).f5131) != null; i8++) {
            AbstractC2563 abstractC2563M3243 = m3243(recyclerView, c1448.f5132, c1448.f5128 ? Long.MAX_VALUE : j);
            if (abstractC2563M3243 != null && abstractC2563M3243.f8158 != null && abstractC2563M3243.m4537() && !abstractC2563M3243.m4538() && (recyclerView2 = (RecyclerView) abstractC2563M3243.f8158.get()) != null) {
                if (recyclerView2.f385 && recyclerView2.f361.m2094() != 0) {
                    C2553 c2553 = recyclerView2.f358;
                    AbstractC2542 abstractC2542 = recyclerView2.f394;
                    if (abstractC2542 != null) {
                        abstractC2542.mo2691();
                    }
                    AbstractC2546 abstractC2546 = recyclerView2.f369;
                    if (abstractC2546 != null) {
                        abstractC2546.m4497(c2553);
                        recyclerView2.f369.m4498(c2553);
                    }
                    c2553.f8118.clear();
                    c2553.m4516();
                }
                C1447 c14411 = recyclerView2.f410;
                c14411.m3242(recyclerView2, true);
                if (c14411.f5127 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C2559 c2559 = recyclerView2.f411;
                        AbstractC2537 abstractC2537 = recyclerView2.f368;
                        c2559.f8138 = 1;
                        c2559.f8139 = abstractC2537.mo2124();
                        c2559.f8141 = false;
                        c2559.f8142 = false;
                        c2559.f8143 = false;
                        for (int i9 = 0; i9 < c14411.f5127 * 2; i9 += 2) {
                            m3243(recyclerView2, c14411.f5126[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1448.f5128 = false;
            c1448.f5129 = 0;
            c1448.f5130 = 0;
            c1448.f5131 = null;
            c1448.f5132 = 0;
        }
    }
}
