package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤞᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0507 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayDeque f2179;

    public C0507(int i) {
        switch (i) {
            case 1:
                this.f2179 = new ArrayDeque();
                break;
            default:
                char[] cArr = AbstractC3580.f11185;
                this.f2179 = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public synchronized void m1952(C1463 c1463) {
        c1463.f5204 = null;
        c1463.f5205 = null;
        this.f2179.offer(c1463);
    }
}
