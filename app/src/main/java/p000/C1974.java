package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲀᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1974 extends AbstractC0371 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f6546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2873 f6547;

    public C1974(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f6545 = i4;
        this.f6546 = str;
        this.f6547 = new C2873(new C0106(28, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1974) && AbstractC2207.m4087(((C1974) obj).f6546, this.f6546);
    }

    public final int hashCode() {
        return this.f6546.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6545;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m3801().f3757);
        sb.append(" ");
        sb.append(m3801().f3754);
        sb.append(".");
        sb.append(m3801().f3755);
        sb.append("(");
        return AbstractC2784.m4752(sb, AbstractC0744.m2196(m3801().f3756, ", ", null, null, null, 62), ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1025 m3801() {
        return (C1025) this.f6547.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method m3802(ClassLoader classLoader) {
        return m3801().m2598(classLoader, Boolean.valueOf(Modifier.isStatic(this.f6545)));
    }
}
