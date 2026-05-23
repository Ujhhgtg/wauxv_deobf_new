package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1242 extends AbstractC2106 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f4507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f4508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object f4509;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242(int i, int i2) {
        super(i != 0);
        this.f4506 = i2;
        switch (i2) {
            case 1:
                super(true);
                this.f4508 = new C1660(i);
                this.f4509 = new C1660(i + 1);
                this.f4507 = i;
                break;
            default:
                this.f4508 = new InterfaceC3450[i];
                this.f4509 = new boolean[i];
                this.f4507 = 0;
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m2893(String str) {
        throw new C2704(AbstractC2784.m4757("stack: ", str), null);
    }

    @Override // p000.AbstractC2106
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo2894() {
        switch (this.f4506) {
            case 1:
                ((C1660) this.f4508).f6944 = false;
                ((C1660) this.f4509).f6944 = false;
                this.f6944 = false;
                break;
            default:
                super.mo2894();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m2895(C2704 c2704) {
        int i = this.f4507 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder sbM4679 = AbstractC2668.m4679("stack[", i2 == i ? "top0" : AbstractC1460.m3223(i - i2), "]: ");
            InterfaceC3450 interfaceC3450 = ((InterfaceC3450[]) this.f4508)[i2];
            sbM4679.append(interfaceC3450 == null ? "<invalid>" : interfaceC3450.toString());
            c2704.m2885(sbM4679.toString());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m2896(int i, InterfaceC3450 interfaceC3450) {
        InterfaceC3450[] interfaceC3450Arr = (InterfaceC3450[]) this.f4508;
        m3925();
        try {
            InterfaceC3450 interfaceC3450Mo4538 = interfaceC3450.mo4538();
            int i2 = (this.f4507 - i) - 1;
            InterfaceC3450 interfaceC3451 = interfaceC3450Arr[i2];
            if (interfaceC3451 != null && interfaceC3451.getType().m4966() == interfaceC3450Mo4538.getType().m4966()) {
                interfaceC3450Arr[i2] = interfaceC3450Mo4538;
                return;
            }
            StringBuilder sb = new StringBuilder("incompatible substitution: ");
            sb.append(interfaceC3451 == null ? "<invalid>" : interfaceC3451.toString());
            sb.append(" -> ");
            sb.append(interfaceC3450Mo4538 != null ? interfaceC3450Mo4538.toString() : "<invalid>");
            m2893(sb.toString());
            throw null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1242 m2897() {
        InterfaceC3450[] interfaceC3450Arr = (InterfaceC3450[]) this.f4508;
        C1242 c1242 = new C1242(interfaceC3450Arr.length, 0);
        System.arraycopy(interfaceC3450Arr, 0, (InterfaceC3450[]) c1242.f4508, 0, interfaceC3450Arr.length);
        boolean[] zArr = (boolean[]) this.f4509;
        System.arraycopy(zArr, 0, (boolean[]) c1242.f4509, 0, zArr.length);
        c1242.f4507 = this.f4507;
        return c1242;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public InterfaceC3450 m2898(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f4507;
        if (i < i2) {
            return ((InterfaceC3450[]) this.f4508)[(i2 - i) - 1];
        }
        m2893("underflow");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C3448 m2899(int i) {
        return m2898(i).getType();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m2900(InterfaceC3450 interfaceC3450) {
        m3925();
        try {
            InterfaceC3450 interfaceC3450Mo4538 = interfaceC3450.mo4538();
            int iM4966 = interfaceC3450Mo4538.getType().m4966();
            int i = this.f4507;
            int i2 = i + iM4966;
            InterfaceC3450[] interfaceC3450Arr = (InterfaceC3450[]) this.f4508;
            if (i2 > interfaceC3450Arr.length) {
                m2893("overflow");
                throw null;
            }
            if (iM4966 == 2) {
                interfaceC3450Arr[i] = null;
                this.f4507 = i + 1;
            }
            int i3 = this.f4507;
            interfaceC3450Arr[i3] = interfaceC3450Mo4538;
            this.f4507 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void m2901() {
        C1660 c1660 = (C1660) this.f4508;
        m3925();
        int i = this.f4507;
        C1660 c1661 = (C1660) this.f4509;
        if (i != c1661.f5610 - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iM3384 = c1661.m3384(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int iM3385 = c1661.m3384(i3);
            if (iM3385 != iM3384) {
                if (i3 != i2) {
                    c1661.m3386(i2, iM3385);
                    c1660.m3386(i2, c1660.m3384(i3));
                }
                i2++;
            }
        }
        if (i2 != i) {
            c1660.m3387(i2);
            c1661.m3386(i2, iM3384);
            c1661.m3387(i2 + 1);
            this.f4507 = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m2902(int i) {
        m3925();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C1660 c1660 = (C1660) this.f4509;
        if (c1660.f5610 != this.f4507) {
            throw new RuntimeException("non-default elements not all set");
        }
        c1660.m3382(i);
    }
}
