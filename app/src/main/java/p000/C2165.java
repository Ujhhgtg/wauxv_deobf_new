package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2165 implements InterfaceC1436 {

    public final /* synthetic */ int f7125;

    public final /* synthetic */ InterfaceC1425 f7126;

    public /* synthetic */ C2165(InterfaceC1425 interfaceC1425, int i) {
        this.f7125 = i;
        this.f7126 = interfaceC1425;
    }

    public final void m3957(Integer num, Integer num2, String str, Object obj) {
        switch (this.f7125) {
            case 0:
                C2372 c2372 = (C2372) this.f7126;
                C2427 c2427 = C2427.f7718;
                
                Iterator it = ((C2219) c2427.m4387(C2219.Companion.serializer(), (byte[]) obj)).f7206.iterator();
                while (it.hasNext()) {
                    c2372.invoke(((C2218) it.next()).f7202);
                }
                break;
            default:
                C2372 c2373 = (C2372) this.f7126;
                C2427 c2428 = C2427.f7718;
                
                c2373.invoke(((C1696) c2428.m4387(C1696.Companion.serializer(), (byte[]) obj)).f5759);
                break;
        }
    }
}
