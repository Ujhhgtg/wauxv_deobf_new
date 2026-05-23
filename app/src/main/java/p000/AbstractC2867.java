package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2867 extends AbstractC1557 {

    public final String f9185;

    public final boolean f9186;

    public final boolean f9187;

    public final String[] f9188;

    public AbstractC2867(String str) {
        StringBuilder sbM4753 = AbstractC2784.m4753(str);
        sbM4753.append(".enabled");
        this.f9185 = sbM4753.toString();
        this.f9186 = true;
        this.f9187 = true;
        this.f9188 = new String[]{EnumC3675.f11514.f11518};
    }

    @Override // p000.AbstractC1557
    public String[] mo1238() {
        return this.f9188;
    }

    @Override // p000.AbstractC1557
    public final boolean mo3264() {
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getBoolean(this.f9185, false);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    public String mo1127() {
        return null;
    }

    public abstract String mo1128();

    public abstract String mo1129();

    public InterfaceC1425 mo1130() {
        return null;
    }

    public boolean mo4142() {
        return this.f9187;
    }

    public boolean mo1131() {
        return false;
    }

    public boolean mo2591() {
        return this.f9186;
    }
}
