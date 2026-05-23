package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2524 {

    public int f8050;

    public InterfaceC3450 f8051;

    public C1826 f8052;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2525)) {
            return false;
        }
        int i = this.f8050;
        InterfaceC3450 interfaceC3450 = this.f8051;
        C1826 c1826 = this.f8052;
        ConcurrentHashMap concurrentHashMap = C2525.f8053;
        return ((C2525) obj).m4537(i, interfaceC3450, c1826);
    }

    public final int hashCode() {
        int i = this.f8050;
        InterfaceC3450 interfaceC3450 = this.f8051;
        C1826 c1826 = this.f8052;
        ConcurrentHashMap concurrentHashMap = C2525.f8053;
        return ((interfaceC3450.hashCode() + ((c1826 != null ? c1826.hashCode() : 0) * 31)) * 31) + i;
    }
}
