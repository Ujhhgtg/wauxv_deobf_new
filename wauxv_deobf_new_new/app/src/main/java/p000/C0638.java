package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᤞᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0638 f2499 = new C0638();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f2500 = new LinkedHashSet();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0637.f2498, dexKitBridge, new C0635(3));
        AbstractC0972.m2592(C0636.f2497, dexKitBridge, new C0635(4));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C0637.f2498));
        C0638 c0638 = f2499;
        C3752 c3752M4301 = C2342.m4301(c0638, listSingletonList);
        c3752M4301.m5358(new C0635(5));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c0638, Collections.singletonList(AbstractC0972.m2610(C0636.f2497)));
        c3752M4302.m5358(new C0635(7));
        c3752M4302.m5360();
    }
}
