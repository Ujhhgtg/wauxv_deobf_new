package p000;

import java.util.HashMap;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᲁᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2208 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2208 f7258 = new C2208();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m4151(String str, String str2, int i, boolean z, List list) {
        HashMap map;
        if (z) {
            String[] strArr = AbstractC1471.f5234;
            C2348[] c2348Arr = {new C2348("atuserlist", "<![CDATA[" + AbstractC0739.m2295(list, ",", null, null, null, 62) + "]]>")};
            map = new HashMap(AbstractC1924.m3872(1));
            AbstractC1924.m3874(map, c2348Arr);
        } else {
            map = null;
        }
        return AbstractC0972.m2609(C2207.f7257).newInstance(str, str2, Integer.valueOf(i), Integer.valueOf(z ? 1 : 0), map);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static Object m4152(C2208 c2208, String str, String str2, int i) {
        c2208.getClass();
        return m4151(str, str2, i, false, C1191.f4326);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2207.f7257, dexKitBridge, new C2200(8));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
