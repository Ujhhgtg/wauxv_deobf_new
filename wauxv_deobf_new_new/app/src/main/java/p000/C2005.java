package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2005 extends AbstractC0346 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f6651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2933 f6652;

    public C2005(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f6650 = i4;
        this.f6651 = str;
        this.f6652 = new C2933(new C0114(this, 29));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2005) && AbstractC1469.m3322(((C2005) obj).f6651, this.f6651);
    }

    public final int hashCode() {
        return this.f6651.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6650;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m3995().f3764);
        sb.append(" ");
        sb.append(m3995().f3761);
        sb.append(".");
        sb.append(m3995().f3762);
        sb.append("(");
        return AbstractC2844.m4786(sb, AbstractC0739.m2295(m3995().f3763, ", ", null, null, null, 62), ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1028 m3995() {
        return (C1028) this.f6652.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method m3996(ClassLoader classLoader) {
        return m3995().m2722(classLoader, Boolean.valueOf(Modifier.isStatic(this.f6650)));
    }
}
