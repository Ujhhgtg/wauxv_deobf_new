package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2517 extends AbstractC0739 {

    public final C0707 f8044;

    public final C0254 f8045;

    public C2517(C0707 c0707) {
        super(C2839.f9108);
        this.f8044 = c0707;
        this.f8045 = new C0254(C2839.f9109, 0);
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return this.f8045;
    }

    @Override // p000.AbstractC0056
    public final Object mo925() {
        return new ArrayList();
    }

    @Override // p000.AbstractC0056
    public final int mo926(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // p000.AbstractC0056
    public final Iterator mo927(Object obj) {
        return new C0060(1, (Object[]) obj);
    }

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        return new ArrayList(Arrays.asList((Object[]) obj));
    }

    @Override // p000.AbstractC0056
    public final Object mo932(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f8044.mo2114(), arrayList.size()));
    }

    @Override // p000.AbstractC0739
    public final void mo1364(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
