package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0530 {

    public final ArrayDeque f2223;

    public C0530(int i) {
        switch (i) {
            case 1:
                this.f2223 = new ArrayDeque();
                break;
            default:
                char[] cArr = AbstractC3522.f11032;
                this.f2223 = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void m1858(C1455 c1455) {
        c1455.f5175 = null;
        c1455.f5176 = null;
        this.f2223.offer(c1455);
    }
}
