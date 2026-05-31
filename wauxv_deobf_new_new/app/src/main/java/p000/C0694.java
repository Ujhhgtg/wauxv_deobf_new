package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲁᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0694 extends AbstractC0346 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f2649;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f2650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f2651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f2652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2933 f2653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2933 f2654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2933 f2655;

    public C0694(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f2649 = i3;
        this.f2650 = str;
        this.f2651 = num;
        this.f2652 = arrayList;
        this.f2653 = new C2933(new C0114(this, 12));
        this.f2654 = new C2933(new C0693(this, dexKitBridge, i2));
        this.f2655 = new C2933(new C0693(dexKitBridge, this, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0694) {
            return AbstractC1469.m3322(this.f2650, ((C0694) obj).f2650);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2650.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f2649;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m2210().f3737);
        C0694 c0694 = (C0694) this.f2654.getValue();
        if (c0694 != null) {
            sb.append(" extends ");
            sb.append(c0694.m2210().f3737);
        }
        if (this.f2652.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0739.m2295((C0696) this.f2655.getValue(), ", ", null, null, new C0661(12), 30));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1022 m2210() {
        return (C1022) this.f2653.getValue();
    }
}
