package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲈᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2955 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0729 f9480;

    public C2955(C1094 c1094, C2848 c2848, C2582 c2582, C0729 c0729) {
        super(c1094, c2848, c2582);
        if (c0729 == null) {
            throw new NullPointerException("target == null");
        }
        this.f9480 = c0729;
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        C0729 c0729 = this.f9480;
        return c0729 == null ? "????" : c0729.m2562();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC0953 mo2533(C1094 c1094) {
        return new C2955(c1094, this.f3484, this.f3485, this.f9480);
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C2955(this.f3483, this.f3484, c2582, this.f9480);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m4965() {
        return this.f9480.m2561() - m2561();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m4966() {
        return this.f3482 >= 0 && this.f9480.f3482 >= 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2955 m4967(C0729 c0729) {
        C1094 c1094;
        C1094 c1095 = this.f3483;
        switch (c1095.f3937) {
            case Opcodes.AALOAD /* 50 */:
                c1094 = AbstractC1096.f3985;
                break;
            case Opcodes.BALOAD /* 51 */:
                c1094 = AbstractC1096.f3984;
                break;
            case 52:
                c1094 = AbstractC1096.f3987;
                break;
            case Opcodes.SALOAD /* 53 */:
                c1094 = AbstractC1096.f3986;
                break;
            case Opcodes.ISTORE /* 54 */:
                c1094 = AbstractC1096.f3989;
                break;
            case Opcodes.LSTORE /* 55 */:
                c1094 = AbstractC1096.f3988;
                break;
            case Opcodes.FSTORE /* 56 */:
                c1094 = AbstractC1096.f3991;
                break;
            case Opcodes.DSTORE /* 57 */:
                c1094 = AbstractC1096.f3990;
                break;
            case Opcodes.ASTORE /* 58 */:
                c1094 = AbstractC1096.f3993;
                break;
            case 59:
                c1094 = AbstractC1096.f3992;
                break;
            case 60:
                c1094 = AbstractC1096.f3995;
                break;
            case 61:
                c1094 = AbstractC1096.f3994;
                break;
            default:
                throw new IllegalArgumentException("bogus opcode: " + c1095);
        }
        return new C2955(c1094, this.f3484, this.f3485, c0729);
    }
}
