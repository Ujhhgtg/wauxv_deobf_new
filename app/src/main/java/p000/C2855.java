package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2855 implements InterfaceC1589 {

    public volatile boolean f9123 = false;

    public final ConcurrentHashMap f9124 = new ConcurrentHashMap();

    public final LinkedBlockingQueue f9125 = new LinkedBlockingQueue();

    @Override // p000.InterfaceC1589
    public final synchronized InterfaceC1855 mo3338() {
        C2854 c2854;
        c2854 = (C2854) this.f9124.get("KavaRef");
        if (c2854 == null) {
            c2854 = new C2854(this.f9125, this.f9123);
            this.f9124.put("KavaRef", c2854);
        }
        return c2854;
    }
}
