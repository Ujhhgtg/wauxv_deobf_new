package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲀᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1244 extends AbstractC2139 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f4507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f4508;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244(int i, int i2) {
        super(i != 0);
        this.f4505 = i2;
        switch (i2) {
            case 1:
                super(true);
                this.f4507 = new C1676(i);
                this.f4508 = new C1676(i + 1);
                this.f4506 = i;
                break;
            default:
                this.f4507 = new InterfaceC3507[i];
                this.f4508 = new boolean[i];
                this.f4506 = 0;
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m3012(String str) {
        throw new C2766(AbstractC2844.m4790("stack: ", str), null);
    }

    @Override // p000.AbstractC2139
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo3013() {
        switch (this.f4505) {
            case 1:
                ((C1676) this.f4507).f7068 = false;
                ((C1676) this.f4508).f7068 = false;
                this.f7068 = false;
                break;
            default:
                super.mo3013();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m3014(C2766 c2766) {
        int i = this.f4506 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder sbM4625 = AbstractC2647.m4625("stack[", i2 == i ? "top0" : AbstractC2902.m4906(i - i2), "]: ");
            InterfaceC3507 interfaceC3507 = ((InterfaceC3507[]) this.f4507)[i2];
            sbM4625.append(interfaceC3507 == null ? "<invalid>" : interfaceC3507.toString());
            c2766.m3004(sbM4625.toString());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m3015(int i, InterfaceC3507 interfaceC3507) {
        InterfaceC3507[] interfaceC3507Arr = (InterfaceC3507[]) this.f4507;
        m4109();
        try {
            InterfaceC3507 interfaceC3507Mo4560 = interfaceC3507.mo4560();
            int i2 = (this.f4506 - i) - 1;
            InterfaceC3507 interfaceC3508 = interfaceC3507Arr[i2];
            if (interfaceC3508 != null && interfaceC3508.getType().m5028() == interfaceC3507Mo4560.getType().m5028()) {
                interfaceC3507Arr[i2] = interfaceC3507Mo4560;
                return;
            }
            StringBuilder sb = new StringBuilder("incompatible substitution: ");
            sb.append(interfaceC3508 == null ? "<invalid>" : interfaceC3508.toString());
            sb.append(" -> ");
            sb.append(interfaceC3507Mo4560 != null ? interfaceC3507Mo4560.toString() : "<invalid>");
            m3012(sb.toString());
            throw null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1244 m3016() {
        InterfaceC3507[] interfaceC3507Arr = (InterfaceC3507[]) this.f4507;
        C1244 c1244 = new C1244(interfaceC3507Arr.length, 0);
        System.arraycopy(interfaceC3507Arr, 0, (InterfaceC3507[]) c1244.f4507, 0, interfaceC3507Arr.length);
        boolean[] zArr = (boolean[]) this.f4508;
        System.arraycopy(zArr, 0, (boolean[]) c1244.f4508, 0, zArr.length);
        c1244.f4506 = this.f4506;
        return c1244;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public InterfaceC3507 m3017(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f4506;
        if (i < i2) {
            return ((InterfaceC3507[]) this.f4507)[(i2 - i) - 1];
        }
        m3012("underflow");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C3505 m3018(int i) {
        return m3017(i).getType();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m3019(InterfaceC3507 interfaceC3507) {
        m4109();
        try {
            InterfaceC3507 interfaceC3507Mo4560 = interfaceC3507.mo4560();
            int iM5028 = interfaceC3507Mo4560.getType().m5028();
            int i = this.f4506;
            int i2 = i + iM5028;
            InterfaceC3507[] interfaceC3507Arr = (InterfaceC3507[]) this.f4507;
            if (i2 > interfaceC3507Arr.length) {
                m3012("overflow");
                throw null;
            }
            if (iM5028 == 2) {
                interfaceC3507Arr[i] = null;
                this.f4506 = i + 1;
            }
            int i3 = this.f4506;
            interfaceC3507Arr[i3] = interfaceC3507Mo4560;
            this.f4506 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void m3020() {
        C1676 c1676 = (C1676) this.f4507;
        m4109();
        int i = this.f4506;
        C1676 c1677 = (C1676) this.f4508;
        if (i != c1677.f5648 - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iM3548 = c1677.m3548(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int iM3549 = c1677.m3548(i3);
            if (iM3549 != iM3548) {
                if (i3 != i2) {
                    c1677.m3550(i2, iM3549);
                    c1676.m3550(i2, c1676.m3548(i3));
                }
                i2++;
            }
        }
        if (i2 != i) {
            c1676.m3551(i2);
            c1677.m3550(i2, iM3548);
            c1677.m3551(i2 + 1);
            this.f4506 = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m3021(int i) {
        m4109();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C1676 c1676 = (C1676) this.f4508;
        if (c1676.f5648 != this.f4506) {
            throw new RuntimeException("non-default elements not all set");
        }
        c1676.m3546(i);
    }
}
