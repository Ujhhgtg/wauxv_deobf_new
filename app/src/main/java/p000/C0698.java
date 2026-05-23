package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0698 extends AbstractC0371 {

    public final int f2648;

    public final String f2649;

    public final Integer f2650;

    public final ArrayList f2651;

    public final C2873 f2652;

    public final C2873 f2653;

    public final C2873 f2654;

    public C0698(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f2648 = i3;
        this.f2649 = str;
        this.f2650 = num;
        this.f2651 = arrayList;
        this.f2652 = new C2873(new C0106(11, this));
        this.f2653 = new C2873(new C0697(this, dexKitBridge, i2));
        this.f2654 = new C2873(new C0697(dexKitBridge, this, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0698) {
            return AbstractC2207.m4087(this.f2649, ((C0698) obj).f2649);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2649.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f2648;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m2115().f3730);
        C0698 c0698 = (C0698) this.f2653.getValue();
        if (c0698 != null) {
            sb.append(" extends ");
            sb.append(c0698.m2115().f3730);
        }
        if (this.f2651.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0744.m2196((C0700) this.f2654.getValue(), ", ", null, null, new C0679(3), 30));
        }
        return sb.toString();
    }

    public final C1019 m2115() {
        return (C1019) this.f2652.getValue();
    }
}
