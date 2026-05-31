package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤞᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2320 extends AbstractC1861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC3507[] f7501;

    public C2320(int i) {
        super(i != 0);
        this.f7501 = new InterfaceC3507[i];
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC3507[] interfaceC3507Arr = this.f7501;
            if (i >= interfaceC3507Arr.length) {
                return sb.toString();
            }
            InterfaceC3507 interfaceC3507 = interfaceC3507Arr[i];
            sb.append("locals[" + AbstractC2902.m4906(i) + "]: " + (interfaceC3507 == null ? "<invalid>" : interfaceC3507.toString()) + "\n");
            i++;
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo3765(C2766 c2766) {
        int i = 0;
        while (true) {
            InterfaceC3507[] interfaceC3507Arr = this.f7501;
            if (i >= interfaceC3507Arr.length) {
                return;
            }
            InterfaceC3507 interfaceC3507 = interfaceC3507Arr[i];
            c2766.m3004("locals[" + AbstractC2902.m4906(i) + "]: " + (interfaceC3507 == null ? "<invalid>" : interfaceC3507.toString()));
            i++;
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final AbstractC1861 mo3766() {
        InterfaceC3507[] interfaceC3507Arr = this.f7501;
        C2320 c2320 = new C2320(interfaceC3507Arr.length);
        System.arraycopy(interfaceC3507Arr, 0, c2320.f7501, 0, interfaceC3507Arr.length);
        return c2320;
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final InterfaceC3507 mo3767(int i) {
        InterfaceC3507 interfaceC3507 = this.f7501[i];
        if (interfaceC3507 != null) {
            return interfaceC3507;
        }
        throw new C2766("local " + AbstractC2902.m4906(i) + ": invalid", null);
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo3769(C3505 c3505) {
        InterfaceC3507[] interfaceC3507Arr = this.f7501;
        int length = interfaceC3507Arr.length;
        if (length == 0) {
            return;
        }
        m4109();
        C3505 c3505M5031 = c3505.m5031();
        for (int i = 0; i < length; i++) {
            if (interfaceC3507Arr[i] == c3505) {
                interfaceC3507Arr[i] = c3505M5031;
            }
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final AbstractC1861 mo3770(AbstractC1861 abstractC1861) {
        return abstractC1861 instanceof C2320 ? m4286((C2320) abstractC1861) : abstractC1861.mo3770(this);
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final C1862 mo3771(AbstractC1861 abstractC1861, int i) {
        return new C1862(this.f7501.length).mo3771(abstractC1861, i);
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo3772(int i, InterfaceC3507 interfaceC3507) {
        int i2;
        InterfaceC3507 interfaceC3508;
        m4109();
        try {
            InterfaceC3507 interfaceC3507Mo4560 = interfaceC3507.mo4560();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM5034 = interfaceC3507Mo4560.getType().m5034();
            InterfaceC3507[] interfaceC3507Arr = this.f7501;
            if (zM5034) {
                interfaceC3507Arr[i + 1] = null;
            }
            interfaceC3507Arr[i] = interfaceC3507Mo4560;
            if (i == 0 || (interfaceC3508 = interfaceC3507Arr[(i2 = i - 1)]) == null || !interfaceC3508.getType().m5034()) {
                return;
            }
            interfaceC3507Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3773(C2581 c2581) {
        mo3772(c2581.f8205, c2581);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2320 m4286(C2320 c2320) {
        try {
            return AbstractC2727.m4705(this, c2320);
        } catch (C2766 e) {
            e.m3004("underlay locals:");
            mo3765(e);
            e.m3004("overlay locals:");
            c2320.mo3765(e);
            throw e;
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final C2320 mo3768() {
        return this;
    }
}
