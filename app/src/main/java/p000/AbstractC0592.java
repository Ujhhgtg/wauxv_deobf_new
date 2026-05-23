package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0592 {

    public int f2399;

    public Object f2400;

    public AbstractC0592(int i, boolean z) {
        switch (i) {
            case 1:
                this.f2400 = new long[8];
                this.f2399 = -1;
                break;
            default:
                this.f2400 = new C0256();
                break;
        }
    }

    public long m2018() {
        int i = this.f2399;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f2400)[i];
    }

    public abstract void mo2019();

    public abstract void mo2020();

    public abstract C3669 mo2021(C3669 c3669, List list);

    public long m2023() {
        int i = this.f2399;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f2400;
        this.f2399 = i - 1;
        return jArr[i];
    }

    public void m2024(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f2399 + 1;
        this.f2399 = i;
        long[] jArr = (long[]) this.f2400;
        if (i >= jArr.length) {
            this.f2400 = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f2400)[i] = j;
    }

    public AbstractC0592(int i) {
        this.f2399 = i;
    }

    public C2825 mo2022(C2825 c2825) {
        return c2825;
    }
}
