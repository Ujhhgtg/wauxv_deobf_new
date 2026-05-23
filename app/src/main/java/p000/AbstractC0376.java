package p000;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376 implements InterfaceC1997 {

    public final Object f1760;

    public AbstractC0376(int i) {
        switch (i) {
            case 1:
                this.f1760 = new LinkedHashMap();
                break;
            default:
                char[] cArr = AbstractC3522.f11032;
                this.f1760 = new ArrayDeque(20);
                break;
        }
    }

    public void m1519(InterfaceC2376 interfaceC2376) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1760;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC2376);
        }
    }

    @Override // p000.InterfaceC1997
    public InterfaceC1996 mo1115(C2103 c2103) {
        return new C0522(2, (C1227) this.f1760);
    }

    public AbstractC0376(C1227 c1227) {
        this.f1760 = c1227;
    }
}
