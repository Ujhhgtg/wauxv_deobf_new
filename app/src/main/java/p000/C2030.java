package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲁᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2030 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2030 f6787 = new C2030();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f6788 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2028.f6785, dexKitBridge, new C1884(16));
        AbstractC1574.findMethod(C2029.f6786, dexKitBridge, new C1884(17));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2028.f6785));
        C2030 c2030 = f6787;
        C3689 c3689M4172 = C2309.createHook(c2030, listSingletonList);
        c3689M4172.m5351(new C1884(7));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c2030, Collections.singletonList(AbstractC1574.dexToMethod(C2029.f6786)));
        c3689M4173.m5350(new C1884(22));
        c3689M4173.applyHook();
    }
}
