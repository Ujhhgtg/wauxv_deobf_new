package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 implements InterfaceC2650 {

    public final /* synthetic */ int f3682;

    public final Object f3683;

    public final Object f3684;

    public /* synthetic */ C1009(Object obj, InterfaceC1436 interfaceC1436, int i) {
        this.f3682 = i;
        this.f3683 = obj;
        this.f3684 = interfaceC1436;
    }

    @Override // p000.InterfaceC2650
    public final Iterator iterator() {
        switch (this.f3682) {
            case 0:
                return new C1008(this);
            case 1:
                return new C1444(this);
            default:
                return new C3430(this);
        }
    }
}
