package p000;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0351 implements InterfaceC2028 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1731;

    public AbstractC0351(int i) {
        switch (i) {
            case 1:
                this.f1731 = new LinkedHashMap();
                break;
            default:
                char[] cArr = AbstractC3580.f11185;
                this.f1731 = new ArrayDeque(20);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1625(InterfaceC2429 interfaceC2429) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1731;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC2429);
        }
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        return new C0499((C1224) this.f1731, 2);
    }

    public AbstractC0351(C1224 c1224) {
        this.f1731 = c1224;
    }
}
