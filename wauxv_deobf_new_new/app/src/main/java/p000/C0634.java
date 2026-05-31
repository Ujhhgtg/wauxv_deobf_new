package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᤝᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0634 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0634 f2494 = new C0634();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f2495 = new LinkedHashSet();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0632.f2492, dexKitBridge, new C0581(23));
        AbstractC0972.m2592(C0633.f2493, dexKitBridge, new C0581(24));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C0632.f2492));
        C0634 c0634 = f2494;
        C3752 c3752M4301 = C2342.m4301(c0634, listSingletonList);
        c3752M4301.m5359(new C0581(25));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c0634, Collections.singletonList(AbstractC0972.m2610(C0633.f2493)));
        c3752M4302.m5359(new C0581(26));
        c3752M4302.m5360();
    }
}
