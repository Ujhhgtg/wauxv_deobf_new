package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲁᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0693 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2645 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ DexKitBridge f2646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0694 f2647;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2648;

    public /* synthetic */ C0693(C0694 c0694, DexKitBridge dexKitBridge, int i) {
        this.f2647 = c0694;
        this.f2646 = dexKitBridge;
        this.f2648 = i;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i = this.f2645;
        int i2 = this.f2648;
        C0694 c0694 = this.f2647;
        DexKitBridge dexKitBridge = this.f2646;
        switch (i) {
            case 0:
                Integer num = c0694.f2651;
                if (num == null) {
                    return null;
                }
                C0696 c0696M1049 = dexKitBridge.m1049(new long[]{(((long) i2) << 32) | ((long) num.intValue())});
                return (C0694) (c0696M1049.isEmpty() ? null : c0696M1049.first());
            default:
                ArrayList arrayList = c0694.f2652;
                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf((((long) i2) << 32) | ((long) ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m1049(AbstractC0739.m2306(arrayList2));
        }
    }

    public /* synthetic */ C0693(DexKitBridge dexKitBridge, C0694 c0694, int i) {
        this.f2646 = dexKitBridge;
        this.f2647 = c0694;
        this.f2648 = i;
    }
}
