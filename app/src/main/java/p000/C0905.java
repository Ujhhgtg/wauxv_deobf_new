package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0905 extends AbstractC0777 {

    public final int f3357;

    public final C0914 f3358;

    public final C2440 f3359;

    public C0918 f3360;

    public C0894 f3361;

    public final ArrayList f3362 = new ArrayList();

    public C0905(int i, C0914 c0914) {
        this.f3357 = i;
        this.f3358 = c0914;
        this.f3359 = C2440.m4419(c0914.f3375.mo1214());
    }

    public final String toString() {
        return mo1214();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        C0918 c0918 = this.f3360;
        StringBuilder sbM4679 = AbstractC2668.m4679("InvokeDynamic(", c0918 != null ? c0918.f3401.mo1214() : "Unknown", ":");
        sbM4679.append(this.f3357);
        sbM4679.append(", ");
        sbM4679.append(this.f3358.mo1214());
        sbM4679.append(")");
        return sbM4679.toString();
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        C0905 c0905 = (C0905) abstractC0777;
        int iCompare = Integer.compare(this.f3357, c0905.f3357);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f3358.compareTo(c0905.f3358);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f3360.compareTo(c0905.f3360);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f3361.compareTo(c0905.f3361);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "InvokeDynamic";
    }
}
