package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1339 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1339 f4801 = new C1339();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f4802 = new LinkedHashSet();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1337.f4799, dexKitBridge, new C1322(3));
        AbstractC0972.m2592(C1338.f4800, dexKitBridge, new C1322(4));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C1337.f4799));
        C1339 c1339 = f4801;
        C3752 c3752M4301 = C2342.m4301(c1339, listSingletonList);
        c3752M4301.m5359(new C1322(9));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c1339, Collections.singletonList(AbstractC0972.m2610(C1338.f4800)));
        c3752M4302.m5359(new C1322(6));
        c3752M4302.m5360();
    }
}
