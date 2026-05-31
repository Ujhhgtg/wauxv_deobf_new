package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C0707;
import p000.C0709;
import p000.EnumC1792;
import p000.InterfaceC1797;
import p000.InterfaceC1799;
import p000.InterfaceC1800;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1797 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1799 f294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0707 f295;

    public ReflectiveGenericLifecycleObserver(InterfaceC1799 interfaceC1799) {
        this.f294 = interfaceC1799;
        C0709 c0709 = C0709.f2710;
        Class<?> cls = interfaceC1799.getClass();
        C0707 c0707 = (C0707) c0709.f2711.get(cls);
        this.f295 = c0707 == null ? c0709.m2234(cls, null) : c0707;
    }

    @Override // p000.InterfaceC1797
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        HashMap map = this.f295.f2706;
        List list = (List) map.get(enumC1792);
        InterfaceC1799 interfaceC1799 = this.f294;
        C0707.m2232(list, interfaceC1800, enumC1792, interfaceC1799);
        C0707.m2232((List) map.get(EnumC1792.ON_ANY), interfaceC1800, enumC1792, interfaceC1799);
    }
}
