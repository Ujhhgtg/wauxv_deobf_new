package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤞᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2896 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0734 f9313;

    public C2896(C1089 c1089, C2788 c2788, C2526 c2526, C0734 c0734) {
        super(c1089, c2788, c2526);
        if (c0734 == null) {
            throw new NullPointerException("target == null");
        }
        this.f9313 = c0734;
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1343() {
        C0734 c0734 = this.f9313;
        return c0734 == null ? "????" : c0734.m2443();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC0950 mo2416(C1089 c1089) {
        return new C2896(c1089, this.f3469, this.f3470, this.f9313);
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C2896(this.f3468, this.f3469, c2526, this.f9313);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m4903() {
        return this.f9313.m2442() - m2442();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m4904() {
        return this.f3467 >= 0 && this.f9313.f3467 >= 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2896 m4905(C0734 c0734) {
        C1089 c1089;
        C1089 c10810 = this.f3468;
        switch (c10810.f3926) {
            case Opcodes.AALOAD /* 50 */:
                c1089 = AbstractC1090.f3974;
                break;
            case Opcodes.BALOAD /* 51 */:
                c1089 = AbstractC1090.f3973;
                break;
            case 52:
                c1089 = AbstractC1090.f3976;
                break;
            case Opcodes.SALOAD /* 53 */:
                c1089 = AbstractC1090.f3975;
                break;
            case Opcodes.ISTORE /* 54 */:
                c1089 = AbstractC1090.f3978;
                break;
            case Opcodes.LSTORE /* 55 */:
                c1089 = AbstractC1090.f3977;
                break;
            case Opcodes.FSTORE /* 56 */:
                c1089 = AbstractC1090.f3980;
                break;
            case Opcodes.DSTORE /* 57 */:
                c1089 = AbstractC1090.f3979;
                break;
            case Opcodes.ASTORE /* 58 */:
                c1089 = AbstractC1090.f3982;
                break;
            case 59:
                c1089 = AbstractC1090.f3981;
                break;
            case 60:
                c1089 = AbstractC1090.f3984;
                break;
            case 61:
                c1089 = AbstractC1090.f3983;
                break;
            default:
                throw new IllegalArgumentException("bogus opcode: " + c10810);
        }
        return new C2896(c1089, this.f3469, this.f3470, c0734);
    }
}
