package p000;

import java.util.HashMap;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2173 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2173 f7134 = new C2173();

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
        return AbstractC1574.dexToCtor(C2172.f7133).newInstance(str, str2, Integer.valueOf(i), Integer.valueOf(z ? 1 : 0), map);
    }

    public static Object m3959(C2173 c2173, String str, String str2, int i) {
        
        return m3958(str, str2, i, false, C1189.f4329);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2172.f7133, dexKitBridge, new C2158(22));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
