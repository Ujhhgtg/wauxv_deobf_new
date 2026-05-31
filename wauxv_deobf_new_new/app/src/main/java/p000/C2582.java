package p000;

import java.util.BitSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2582 extends AbstractC1352 implements InterfaceC3510 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2582 f8208 = new C2582(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C2582 m4568(C2581 c2581) {
        C2582 c2582 = new C2582(1);
        c2582.m3166(0, c2581);
        return c2582;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static C2582 m4569(C2581 c2581, C2581 c2582) {
        C2582 c2583 = new C2582(2);
        c2583.m3166(0, c2581);
        c2583.m3166(1, c2582);
        return c2583;
    }

    @Override // p000.AbstractC1352, p000.InterfaceC3510
    public final C3505 getType(int i) {
        C3505 type = ((C2581) m3165(i)).f8206.getType();
        type.getClass();
        return type;
    }

    @Override // p000.InterfaceC3510
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3510 mo1408(C3505 c3505) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m4570() {
        int length = this.f4833.length;
        int iM5028 = 0;
        for (int i = 0; i < length; i++) {
            iM5028 += getType(i).m5028();
        }
        return iM5028;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C2582 m4571(boolean z, BitSet bitSet) {
        Object[] objArr = this.f4833;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        C2582 c2582 = new C2582(objArr.length);
        int i = 0;
        int iM4562 = 0;
        while (i < length) {
            C2581 c2581M4566 = (C2581) m3165(i);
            if (bitSet == null || !bitSet.get(i)) {
                c2581M4566 = c2581M4566.m4566(iM4562);
                if (!z) {
                    iM4562 += c2581M4566.m4562();
                }
            }
            c2582.m3166(i, c2581M4566);
            i++;
            z = false;
        }
        if (!this.f7068) {
            c2582.f7068 = false;
        }
        return c2582;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C2582 m4572(int i) {
        int length = this.f4833.length;
        if (length == 0) {
            return this;
        }
        C2582 c2582 = new C2582(length);
        for (int i2 = 0; i2 < length; i2++) {
            C2581 c2581M4566 = (C2581) m3165(i2);
            if (i != 0) {
                c2581M4566 = c2581M4566.m4566(c2581M4566.f8205 + i);
            }
            c2582.m3166(i2, c2581M4566);
        }
        if (!this.f7068) {
            c2582.f7068 = false;
        }
        return c2582;
    }
}
