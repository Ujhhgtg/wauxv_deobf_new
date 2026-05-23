package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2872 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2872 f9209 = new C2872();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f9210 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2871.f9208, dexKitBridge, new C2798(21));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f9209, Collections.singletonList(AbstractC1574.dexToMethod(C2871.f9208)));
        c3689M4172.m5350(new C2798(24));
        c3689M4172.applyHook();
    }
}
