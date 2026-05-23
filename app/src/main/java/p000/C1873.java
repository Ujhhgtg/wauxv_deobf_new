package p000;

import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1873 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1873 f6220 = new C1873();

    public static String m3654(String str, boolean z) {
        String[] strArr = AbstractC1574.f5469;
        Object objInvoke = AbstractC1574.dexToMethod(C1872.f6219).invoke(null, str);
        String string = objInvoke instanceof String ? (String) objInvoke : null;
        if (string != null) {
            String str2 = "/";
            String str3 = MagicFactory.get(z ? -392306607782580L : -392315197717172L, strArr);
            int iM4837 = AbstractC2841.m4837(6, string, "/");
            if (iM4837 != -1) {
                int length = "/".length() + iM4837;
                int length2 = string.length();
                if (length2 < length) {
                    throw new IndexOutOfBoundsException("End index (" + length2 + ") is less than start index (" + length + ").");
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) string, 0, length);
                sb.append((CharSequence) str3);
                sb.append((CharSequence) string, length2, string.length());
                string = sb.toString();
            }
            if (true) {
                return string;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1872.f6219, dexKitBridge, new C1837(14));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
