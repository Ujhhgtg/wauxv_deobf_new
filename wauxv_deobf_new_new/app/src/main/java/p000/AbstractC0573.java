package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲁᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f2365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object f2366;

    public AbstractC0573(int i, boolean z) {
        switch (i) {
            case 1:
                this.f2366 = new long[8];
                this.f2365 = -1;
                break;
            default:
                this.f2366 = new C0266();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public long m2115() {
        int i = this.f2365;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f2366)[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public abstract void mo2116();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public abstract void mo2117();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public abstract C3729 mo2118(C3729 c3729, List list);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public long m2120() {
        int i = this.f2365;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f2366;
        this.f2365 = i - 1;
        return jArr[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public void m2121(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f2365 + 1;
        this.f2365 = i;
        long[] jArr = (long[]) this.f2366;
        if (i >= jArr.length) {
            this.f2366 = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f2366)[i] = j;
    }

    public AbstractC0573(int i) {
        this.f2365 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public C2885 mo2119(C2885 c2885) {
        return c2885;
    }
}
