package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲀᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1343 f4809 = new C1343();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f4810 = new LinkedHashSet();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1341.f4807, dexKitBridge, new C1322(11));
        AbstractC0972.m2592(C1342.f4808, dexKitBridge, new C1322(12));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C1341.f4807));
        C1343 c1343 = f4809;
        C3752 c3752M4301 = C2342.m4301(c1343, listSingletonList);
        c3752M4301.m5359(new C1322(15));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c1343, Collections.singletonList(AbstractC0972.m2610(C1342.f4808)));
        c3752M4302.m5359(new C1322(16));
        c3752M4302.m5360();
    }
}
