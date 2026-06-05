package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1175feyxiexzfUjhhgtg extends C0731Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f4458Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    public C1175feyxiexzfUjhhgtg() {
        super(true);
        boolean z = true;
        m2061Ujhhgtgfeyxiexzf(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0731Ujhhgtgfeyxiexzf.f3005Ujhhgtgfeyxiexzf;
        InterfaceC2916feyxiexzfUjhhgtg interfaceC2916feyxiexzfUjhhgtg = (InterfaceC2916feyxiexzfUjhhgtg) atomicReferenceFieldUpdater.get(this);
        C2815Ujhhgtgfeyxiexzf c2815Ujhhgtgfeyxiexzf = interfaceC2916feyxiexzfUjhhgtg instanceof C2815Ujhhgtgfeyxiexzf ? (C2815Ujhhgtgfeyxiexzf) interfaceC2916feyxiexzfUjhhgtg : null;
        if (c2815Ujhhgtgfeyxiexzf == null) {
            z = false;
            break;
        }
        C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf = c2815Ujhhgtgfeyxiexzf.f2986Ujhhgtgfeyxiexzf;
        c0731Ujhhgtgfeyxiexzf = c0731Ujhhgtgfeyxiexzf == null ? null : c0731Ujhhgtgfeyxiexzf;
        if (c0731Ujhhgtgfeyxiexzf == null) {
            z = false;
            break;
        }
        while (!c0731Ujhhgtgfeyxiexzf.mo2057Ujhhgtgfeyxiexzf()) {
            InterfaceC2916feyxiexzfUjhhgtg interfaceC2916feyxiexzfUjhhgtg2 = (InterfaceC2916feyxiexzfUjhhgtg) atomicReferenceFieldUpdater.get(c0731Ujhhgtgfeyxiexzf);
            C2815Ujhhgtgfeyxiexzf c2815Ujhhgtgfeyxiexzf2 = interfaceC2916feyxiexzfUjhhgtg2 instanceof C2815Ujhhgtgfeyxiexzf ? (C2815Ujhhgtgfeyxiexzf) interfaceC2916feyxiexzfUjhhgtg2 : null;
            if (c2815Ujhhgtgfeyxiexzf2 != null) {
                c0731Ujhhgtgfeyxiexzf = c2815Ujhhgtgfeyxiexzf2.f2986Ujhhgtgfeyxiexzf;
                if (c0731Ujhhgtgfeyxiexzf == null) {
                    c0731Ujhhgtgfeyxiexzf = null;
                }
                if (c0731Ujhhgtgfeyxiexzf == null) {
                }
            }
            z = false;
        }
        this.f4458Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.C0731Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final boolean mo2053Ujhhgtgfeyxiexzf(Throwable th) {
        return false;
    }

    @Override // p000.C0731Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final boolean mo2057Ujhhgtgfeyxiexzf() {
        return this.f4458Ujhhgtgfeyxiexzf;
    }
}
