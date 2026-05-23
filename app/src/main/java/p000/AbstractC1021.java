package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1021 {

    public final String f3735;

    public final C2873 f3736 = new C2873(new C0106(17, this));

    public AbstractC1021(String str) {
        this.f3735 = str;
    }

    public final String m2594() {
        String[] strArr = AbstractC1574.f5469;
        String str = (String) this.f3736.getValue();
        String str2 = "";
        C0542 c0542 = AbstractC2665.f8589;
        if (c0542 != null) {
            return c0542.m1891().getString(str, "");
        }
        throw new IllegalArgumentException("DexDescConfig must be init".toString());
    }
}
