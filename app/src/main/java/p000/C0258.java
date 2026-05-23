package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0258 extends AbstractC0739 {

    public final /* synthetic */ int f1444 = 0;

    public final AbstractC1813 f1445;

    public C0258(InterfaceC1743 interfaceC1743) {
        super(interfaceC1743);
        this.f1445 = new C0254(interfaceC1743.mo1363(), 1);
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        switch (0) {
            case 0:
                break;
        }
        return (C0254) this.f1445;
    }

    @Override // p000.AbstractC0056
    public final Object mo925() {
        switch (0) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p000.AbstractC0056
    public final int mo926(Object obj) {
        switch (0) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // p000.AbstractC0056
    public final Iterator mo927(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        switch (0) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
                return arrayList == null ? new ArrayList(list) : arrayList;
            default:
                Set set = (Set) obj;
                LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
                return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
        }
    }

    @Override // p000.AbstractC0056
    public final Object mo932(Object obj) {
        switch (0) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // p000.AbstractC0739
    public final void mo1364(Object obj, int i, Object obj2) {
        switch (0) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }

    public C0258(C1895 c1895) {
        super(c1895);
        this.f1445 = new C0254((C2656) c1895.f6263, 2);
    }
}
