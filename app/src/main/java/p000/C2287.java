package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤞᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2287 extends AbstractC1834 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC3450[] f7379;

    public C2287(int i) {
        super(i != 0);
        this.f7379 = new InterfaceC3450[i];
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC3450[] interfaceC3450Arr = this.f7379;
            if (i >= interfaceC3450Arr.length) {
                return sb.toString();
            }
            InterfaceC3450 interfaceC3450 = interfaceC3450Arr[i];
            sb.append("locals[" + AbstractC1460.m3223(i) + "]: " + (interfaceC3450 == null ? "<invalid>" : interfaceC3450.toString()) + "\n");
            i++;
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo3587(C2704 c2704) {
        int i = 0;
        while (true) {
            InterfaceC3450[] interfaceC3450Arr = this.f7379;
            if (i >= interfaceC3450Arr.length) {
                return;
            }
            InterfaceC3450 interfaceC3450 = interfaceC3450Arr[i];
            c2704.m2885("locals[" + AbstractC1460.m3223(i) + "]: " + (interfaceC3450 == null ? "<invalid>" : interfaceC3450.toString()));
            i++;
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final AbstractC1834 mo3588() {
        InterfaceC3450[] interfaceC3450Arr = this.f7379;
        C2287 c2287 = new C2287(interfaceC3450Arr.length);
        System.arraycopy(interfaceC3450Arr, 0, c2287.f7379, 0, interfaceC3450Arr.length);
        return c2287;
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final InterfaceC3450 mo3589(int i) {
        InterfaceC3450 interfaceC3450 = this.f7379[i];
        if (interfaceC3450 != null) {
            return interfaceC3450;
        }
        throw new C2704("local " + AbstractC1460.m3223(i) + ": invalid", null);
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo3591(C3448 c3448) {
        InterfaceC3450[] interfaceC3450Arr = this.f7379;
        int length = interfaceC3450Arr.length;
        if (length == 0) {
            return;
        }
        m3925();
        C3448 c3448M4969 = c3448.m4969();
        for (int i = 0; i < length; i++) {
            if (interfaceC3450Arr[i] == c3448) {
                interfaceC3450Arr[i] = c3448M4969;
            }
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final AbstractC1834 mo3592(AbstractC1834 abstractC1834) {
        return abstractC1834 instanceof C2287 ? m4157((C2287) abstractC1834) : abstractC1834.mo3592(this);
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final C1835 mo3593(AbstractC1834 abstractC1834, int i) {
        return new C1835(this.f7379.length).mo3593(abstractC1834, i);
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo3594(int i, InterfaceC3450 interfaceC3450) {
        int i2;
        InterfaceC3450 interfaceC3451;
        m3925();
        try {
            InterfaceC3450 interfaceC3450Mo4538 = interfaceC3450.mo4538();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM4972 = interfaceC3450Mo4538.getType().m4972();
            InterfaceC3450[] interfaceC3450Arr = this.f7379;
            if (zM4972) {
                interfaceC3450Arr[i + 1] = null;
            }
            interfaceC3450Arr[i] = interfaceC3450Mo4538;
            if (i == 0 || (interfaceC3451 = interfaceC3450Arr[(i2 = i - 1)]) == null || !interfaceC3451.getType().m4972()) {
                return;
            }
            interfaceC3450Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3595(C2525 c2525) {
        mo3594(c2525.f8055, c2525);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2287 m4157(C2287 c2287) {
        try {
            return AbstractC1270.m2986(this, c2287);
        } catch (C2704 e) {
            e.m2885("underlay locals:");
            mo3587(e);
            e.m2885("overlay locals:");
            c2287.mo3587(e);
            throw e;
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final C2287 mo3590() {
        return this;
    }
}
