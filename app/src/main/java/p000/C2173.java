package p000;

import java.util.HashMap;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲀᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2173 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2173 f7134 = new C2173();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m3958(String str, String str2, int i, boolean z, List list) {
        HashMap map;
        if (z) {
            String[] strArr = AbstractC1574.f5469;
            C2315[] c2315Arr = {new C2315("atuserlist", "<![CDATA[" + AbstractC0744.m2196(list, ",", null, null, null, 62) + "]]>")};
            map = new HashMap(AbstractC1898.m3693(1));
            AbstractC1898.m3695(map, c2315Arr);
        } else {
            map = null;
        }
        return AbstractC1574.m3314(C2172.f7133).newInstance(str, str2, Integer.valueOf(i), Integer.valueOf(z ? 1 : 0), map);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static Object m3959(C2173 c2173, String str, String str2, int i) {
        c2173.getClass();
        return m3958(str, str2, i, false, C1189.f4329);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C2172.f7133, dexKitBridge, new C2158(22));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
