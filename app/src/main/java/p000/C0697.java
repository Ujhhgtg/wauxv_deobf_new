package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0697 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2644 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ DexKitBridge f2645;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0698 f2646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2647;

    public /* synthetic */ C0697(C0698 c0698, DexKitBridge dexKitBridge, int i) {
        this.f2646 = c0698;
        this.f2645 = dexKitBridge;
        this.f2647 = i;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i = 1;
        int i2 = this.f2647;
        C0698 c0698 = this.f2646;
        DexKitBridge dexKitBridge = this.f2645;
        switch (1) {
            case 0:
                Integer num = c0698.f2650;
                if (num == null) {
                    return null;
                }
                C0700 c0700M905 = dexKitBridge.m905(new long[]{(((long) i2) << 32) | ((long) num.intValue())});
                return (C0698) (c0700M905.isEmpty() ? null : c0700M905.first());
            default:
                ArrayList arrayList = c0698.f2651;
                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf((((long) i2) << 32) | ((long) ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m905(AbstractC0744.m2207(arrayList2));
        }
    }

    public /* synthetic */ C0697(DexKitBridge dexKitBridge, C0698 c0698, int i) {
        this.f2645 = dexKitBridge;
        this.f2646 = c0698;
        this.f2647 = i;
    }
}
