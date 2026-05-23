package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C0712;
import p000.C0714;
import p000.EnumC1769;
import p000.InterfaceC1774;
import p000.InterfaceC1776;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1774 {

    public final InterfaceC1776 f294;

    public final C0712 f295;

    public ReflectiveGenericLifecycleObserver(InterfaceC1776 interfaceC1776) {
        this.f294 = interfaceC1776;
        C0714 c0714 = C0714.f2716;
        Class<?> cls = interfaceC1776.getClass();
        C0712 c0712 = (C0712) c0714.f2717.get(cls);
        this.f295 = c0712 == null ? c0714.m2142(cls, null) : c0712;
    }

    @Override // p000.InterfaceC1774
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        HashMap map = this.f295.f2712;
        List list = (List) map.get(enumC1769);
        InterfaceC1776 interfaceC1776 = this.f294;
        C0712.m2140(list, interfaceC1777, enumC1769, interfaceC1776);
        C0712.m2140((List) map.get(EnumC1769.ON_ANY), interfaceC1777, enumC1769, interfaceC1776);
    }
}
