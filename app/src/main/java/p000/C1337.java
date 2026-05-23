package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲈᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1337 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1337 f4801 = new C1337();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f4802 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1335.f4799, dexKitBridge, new C1285(20));
        AbstractC1574.findMethod(C1336.f4800, dexKitBridge, new C1285(21));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1335.f4799));
        C1337 c1337 = f4801;
        C3689 c3689M4172 = C2309.createHook(c1337, listSingletonList);
        c3689M4172.m5351(new C1285(26));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c1337, Collections.singletonList(AbstractC1574.dexToMethod(C1336.f4800)));
        c3689M4173.m5351(new C1285(23));
        c3689M4173.applyHook();
    }
}
