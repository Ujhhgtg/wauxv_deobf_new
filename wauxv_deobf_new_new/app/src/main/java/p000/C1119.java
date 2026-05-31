package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᤞᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1119 implements InterfaceC2711, InterfaceC1120 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2711 f4170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4171;

    public C1119(InterfaceC2711 interfaceC2711, int i) {
        this.f4170 = interfaceC2711;
        this.f4171 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000.InterfaceC2711
    public final Iterator iterator() {
        return new C1118(this);
    }

    @Override // p000.InterfaceC1120
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2711 mo2835(int i) {
        int i2 = this.f4171 + i;
        return i2 < 0 ? new C1119(this, i) : new C1119(this.f4170, i2);
    }
}
