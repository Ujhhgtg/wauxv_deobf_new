package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲀᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2063 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2063 f6911 = new C2063();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f6912 = new LinkedHashSet();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2061.f6909, dexKitBridge, new C2059(2));
        AbstractC0972.m2592(C2062.f6910, dexKitBridge, new C2059(3));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2061.f6909));
        C2063 c2063 = f6911;
        C3752 c3752M4301 = C2342.m4301(c2063, listSingletonList);
        c3752M4301.m5359(new C1898(23));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c2063, Collections.singletonList(AbstractC0972.m2610(C2062.f6910)));
        c3752M4302.m5358(new C2059(8));
        c3752M4302.m5360();
    }
}
