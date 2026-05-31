package p000;

import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲇᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1733 extends AbstractC1272 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C0154 f5868;

    public C1733(C0154 c0154) {
        this.f5868 = c0154;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final int mo2640() {
        C0154 c0154 = this.f5868;
        String strM1311 = c0154.m1311();
        try {
            C3534 c3534M4714 = AbstractC2727.m4714(strM1311);
            if (c3534M4714 != null) {
                return c3534M4714.f11124;
            }
            AbstractC2908.m4913(strM1311);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'UInt' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final long mo2643() {
        C0154 c0154 = this.f5868;
        String strM1311 = c0154.m1311();
        try {
            C3539 c3539M4715 = AbstractC2727.m4715(strM1311);
            if (c3539M4715 != null) {
                return c3539M4715.f11131;
            }
            AbstractC2908.m4913(strM1311);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'ULong' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public final byte mo2645() {
        C3529 c3529;
        C0154 c0154 = this.f5868;
        String strM1311 = c0154.m1311();
        try {
            C3534 c3534M4714 = AbstractC2727.m4714(strM1311);
            if (c3534M4714 != null) {
                int i = c3534M4714.f11124;
                c3529 = Integer.compareUnsigned(i, 255) > 0 ? null : new C3529((byte) i);
            }
            if (c3529 != null) {
                return c3529.f11117;
            }
            AbstractC2908.m4913(strM1311);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'UByte' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public final short mo2646() {
        C3544 c3544;
        C0154 c0154 = this.f5868;
        String strM1311 = c0154.m1311();
        try {
            C3534 c3534M4714 = AbstractC2727.m4714(strM1311);
            if (c3534M4714 != null) {
                int i = c3534M4714.f11124;
                c3544 = Integer.compareUnsigned(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE) > 0 ? null : new C3544((short) i);
            }
            if (c3544 != null) {
                return c3544.f11138;
            }
            AbstractC2908.m4913(strM1311);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'UShort' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }
}
