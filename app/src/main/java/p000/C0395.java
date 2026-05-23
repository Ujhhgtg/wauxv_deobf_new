package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0395 extends AbstractC0399 {

    public final String f1882;

    public C0395(String str) {
        this.f1882 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0395) && AbstractC2207.m4087(this.f1882, ((C0395) obj).f1882);
    }

    public final int hashCode() {
        return this.f1882.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Header(title=");
        return AbstractC1194.m2786(sb, this.f1882, ')');
    }
}
