package p000;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3565Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final ThreadLocal f11079Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C2419Ujhhgtgfeyxiexzf f11080Ujhhgtgfeyxiexzf = new C2419Ujhhgtgfeyxiexzf(12);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f11082Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public long f11083Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f11081Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f11084Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static AbstractC0821feyxiexzfUjhhgtg m5102Ujhhgtgfeyxiexzf(RecyclerView recyclerView, int i, long j) {
        int iM4087Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i2 = 0; i2 < iM4087Ujhhgtgfeyxiexzf; i2++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(recyclerView.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i2));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf == i && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf()) {
                return null;
            }
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = recyclerView.f359Ujhhgtgfeyxiexzf;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC1761feyxiexzfUjhhgtg.m3055Ujhhgtgfeyxiexzf()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.m240feyxiexzfUjhhgtg(false);
                Trace.endSection();
            }
        }
        recyclerView.m239feyxiexzfUjhhgtg();
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf = c0831feyxiexzfUjhhgtg.m2239Ujhhgtgfeyxiexzf(i, j);
        if (abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf != null) {
            if (!abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf.m2176Ujhhgtgfeyxiexzf() || abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf.m2177Ujhhgtgfeyxiexzf()) {
                c0831feyxiexzfUjhhgtg.m2229Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf, false);
            } else {
                c0831feyxiexzfUjhhgtg.m2236Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf);
            }
        }
        return abstractC0821feyxiexzfUjhhgtgM2239Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f11081Ujhhgtgfeyxiexzf;
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
                    m5104Ujhhgtgfeyxiexzf(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f11083Ujhhgtgfeyxiexzf);
                }
            }
        } finally {
            this.f11082Ujhhgtgfeyxiexzf = 0L;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5103Ujhhgtgfeyxiexzf(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f375Ujhhgtgfeyxiexzf) {
            if (RecyclerView.f348feyxiexzfUjhhgtg && !this.f11081Ujhhgtgfeyxiexzf.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f11082Ujhhgtgfeyxiexzf == 0) {
                this.f11082Ujhhgtgfeyxiexzf = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf = recyclerView.f411feyxiexzfUjhhgtg;
        c3570Ujhhgtgfeyxiexzf.f11091Ujhhgtgfeyxiexzf = i;
        c3570Ujhhgtgfeyxiexzf.f11092Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5104Ujhhgtgfeyxiexzf(long j) {
        C3566Ujhhgtgfeyxiexzf c3566Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C3566Ujhhgtgfeyxiexzf c3566Ujhhgtgfeyxiexzf2;
        ArrayList arrayList = this.f11081Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf = recyclerView3.f411feyxiexzfUjhhgtg;
            if (windowVisibility == 0) {
                c3570Ujhhgtgfeyxiexzf.m5106Ujhhgtgfeyxiexzf(recyclerView3, false);
                i2 += c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf;
            }
        }
        ArrayList arrayList2 = this.f11084Ujhhgtgfeyxiexzf;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf2 = recyclerView4.f411feyxiexzfUjhhgtg;
                int iAbs = Math.abs(c3570Ujhhgtgfeyxiexzf2.f11092Ujhhgtgfeyxiexzf) + Math.abs(c3570Ujhhgtgfeyxiexzf2.f11091Ujhhgtgfeyxiexzf);
                for (int i6 = i; i6 < c3570Ujhhgtgfeyxiexzf2.f11094Ujhhgtgfeyxiexzf * 2; i6 += 2) {
                    if (i5 >= arrayList2.size()) {
                        c3566Ujhhgtgfeyxiexzf2 = new C3566Ujhhgtgfeyxiexzf();
                        arrayList2.add(c3566Ujhhgtgfeyxiexzf2);
                    } else {
                        c3566Ujhhgtgfeyxiexzf2 = (C3566Ujhhgtgfeyxiexzf) arrayList2.get(i5);
                    }
                    int[] iArr = c3570Ujhhgtgfeyxiexzf2.f11093Ujhhgtgfeyxiexzf;
                    int i7 = iArr[i6 + 1];
                    c3566Ujhhgtgfeyxiexzf2.f11085Ujhhgtgfeyxiexzf = i7 <= iAbs;
                    c3566Ujhhgtgfeyxiexzf2.f11086Ujhhgtgfeyxiexzf = iAbs;
                    c3566Ujhhgtgfeyxiexzf2.f11087Ujhhgtgfeyxiexzf = i7;
                    c3566Ujhhgtgfeyxiexzf2.f11088Ujhhgtgfeyxiexzf = recyclerView4;
                    c3566Ujhhgtgfeyxiexzf2.f11089Ujhhgtgfeyxiexzf = iArr[i6];
                    i5++;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, f11080Ujhhgtgfeyxiexzf);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (c3566Ujhhgtgfeyxiexzf = (C3566Ujhhgtgfeyxiexzf) arrayList2.get(i8)).f11088Ujhhgtgfeyxiexzf) != null; i8++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf = m5102Ujhhgtgfeyxiexzf(recyclerView, c3566Ujhhgtgfeyxiexzf.f11089Ujhhgtgfeyxiexzf, c3566Ujhhgtgfeyxiexzf.f11085Ujhhgtgfeyxiexzf ? Long.MAX_VALUE : j);
            if (abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf != null && abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf.f3242Ujhhgtgfeyxiexzf != null && abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf.m2176Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf.m2177Ujhhgtgfeyxiexzf() && (recyclerView2 = (RecyclerView) abstractC0821feyxiexzfUjhhgtgM5102Ujhhgtgfeyxiexzf.f3242Ujhhgtgfeyxiexzf.get()) != null) {
                if (recyclerView2.f386feyxiexzfUjhhgtg && recyclerView2.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf() != 0) {
                    C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = recyclerView2.f359Ujhhgtgfeyxiexzf;
                    AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = recyclerView2.f395feyxiexzfUjhhgtg;
                    if (abstractC0793feyxiexzfUjhhgtg != null) {
                        abstractC0793feyxiexzfUjhhgtg.mo2128Ujhhgtgfeyxiexzf();
                    }
                    AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = recyclerView2.f370Ujhhgtgfeyxiexzf;
                    if (abstractC0822feyxiexzfUjhhgtg != null) {
                        abstractC0822feyxiexzfUjhhgtg.m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
                        recyclerView2.f370Ujhhgtgfeyxiexzf.m2212Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
                    }
                    c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf.clear();
                    c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
                }
                C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf3 = recyclerView2.f411feyxiexzfUjhhgtg;
                c3570Ujhhgtgfeyxiexzf3.m5106Ujhhgtgfeyxiexzf(recyclerView2, true);
                if (c3570Ujhhgtgfeyxiexzf3.f11094Ujhhgtgfeyxiexzf != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = recyclerView2.f412feyxiexzfUjhhgtg;
                        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = recyclerView2.f369Ujhhgtgfeyxiexzf;
                        c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf = 1;
                        c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf();
                        c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = false;
                        c0810feyxiexzfUjhhgtg.f3212Ujhhgtgfeyxiexzf = false;
                        c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = false;
                        for (int i9 = 0; i9 < c3570Ujhhgtgfeyxiexzf3.f11094Ujhhgtgfeyxiexzf * 2; i9 += 2) {
                            m5102Ujhhgtgfeyxiexzf(recyclerView2, c3570Ujhhgtgfeyxiexzf3.f11093Ujhhgtgfeyxiexzf[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c3566Ujhhgtgfeyxiexzf.f11085Ujhhgtgfeyxiexzf = false;
            c3566Ujhhgtgfeyxiexzf.f11086Ujhhgtgfeyxiexzf = 0;
            c3566Ujhhgtgfeyxiexzf.f11087Ujhhgtgfeyxiexzf = 0;
            c3566Ujhhgtgfeyxiexzf.f11088Ujhhgtgfeyxiexzf = null;
            c3566Ujhhgtgfeyxiexzf.f11089Ujhhgtgfeyxiexzf = 0;
        }
    }
}
