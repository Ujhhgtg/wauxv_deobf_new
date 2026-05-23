package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2324 implements InterfaceC3407, Comparable {

    public final C0913 f7462;

    public final C3496 f7463;

    public C2324(C0913 c0913, C0179 c0179, C1023 c1023) {
        this.f7462 = c0913;
        int length = c0179.f4836.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            C0174 c0174 = new C0174((C0177) c0179.m3062(i), c1023);
            C0175 c0175 = new C0175(4, 4);
            c0175.f1211 = c0174;
            arrayList.add(c0175);
        }
        this.f7463 = new C3496(EnumC1683.f5724, arrayList);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7462.compareTo(((C2324) obj).f7462);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2324)) {
            return false;
        }
        return this.f7462.equals(((C2324) obj).f7462);
    }

    public final int hashCode() {
        return this.f7462.hashCode();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7462.mo1214());
        sb.append(": ");
        boolean z = true;
        for (C0175 c0175 : this.f7463.f10996) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0175.f1211.f1209.toString());
        }
        return sb.toString();
    }
}
