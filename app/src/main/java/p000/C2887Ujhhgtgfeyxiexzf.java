package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2887Ujhhgtgfeyxiexzf implements InterfaceC3739feyxiexzfUjhhgtg, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg f9153Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3737Ujhhgtgfeyxiexzf f9154Ujhhgtgfeyxiexzf;

    public C2887Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf) {
        this.f9153Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtg;
        this.f9154Ujhhgtgfeyxiexzf = interfaceC3737Ujhhgtgfeyxiexzf;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iM4275Ujhhgtgfeyxiexzf = m4275Ujhhgtgfeyxiexzf();
        InterfaceC3739feyxiexzfUjhhgtg[] interfaceC3739feyxiexzfUjhhgtgArr = new InterfaceC3739feyxiexzfUjhhgtg[iM4275Ujhhgtgfeyxiexzf];
        C0975feyxiexzfUjhhgtg c0975feyxiexzfUjhhgtg = new C0975feyxiexzfUjhhgtg();
        mo1763feyxiexzfUjhhgtg(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf, new C2860feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtgArr, c0975feyxiexzfUjhhgtg, 0));
        if (c0975feyxiexzfUjhhgtg.f3869Ujhhgtgfeyxiexzf == iM4275Ujhhgtgfeyxiexzf) {
            return new C2859feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtgArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        boolean zM4512Ujhhgtgfeyxiexzf;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2887Ujhhgtgfeyxiexzf) {
            C2887Ujhhgtgfeyxiexzf c2887Ujhhgtgfeyxiexzf = (C2887Ujhhgtgfeyxiexzf) obj;
            if (c2887Ujhhgtgfeyxiexzf.m4275Ujhhgtgfeyxiexzf() == m4275Ujhhgtgfeyxiexzf()) {
                C2887Ujhhgtgfeyxiexzf c2887Ujhhgtgfeyxiexzf2 = this;
                while (true) {
                    InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf = c2887Ujhhgtgfeyxiexzf2.f9154Ujhhgtgfeyxiexzf;
                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c2887Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(interfaceC3737Ujhhgtgfeyxiexzf.getKey()), interfaceC3737Ujhhgtgfeyxiexzf)) {
                        zM4512Ujhhgtgfeyxiexzf = false;
                        break;
                    }
                    InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = c2887Ujhhgtgfeyxiexzf2.f9153Ujhhgtgfeyxiexzf;
                    if (!(interfaceC3739feyxiexzfUjhhgtg instanceof C2887Ujhhgtgfeyxiexzf)) {
                        InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf2 = (InterfaceC3737Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg;
                        zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c2887Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(interfaceC3737Ujhhgtgfeyxiexzf2.getKey()), interfaceC3737Ujhhgtgfeyxiexzf2);
                        break;
                    }
                    c2887Ujhhgtgfeyxiexzf2 = (C2887Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg;
                }
                if (zM4512Ujhhgtgfeyxiexzf) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9154Ujhhgtgfeyxiexzf.hashCode() + this.f9153Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(new StringBuilder("["), (String) mo1763feyxiexzfUjhhgtg("", new C2432Ujhhgtgfeyxiexzf(1)), ']');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m4275Ujhhgtgfeyxiexzf() {
        int i = 2;
        C2887Ujhhgtgfeyxiexzf c2887Ujhhgtgfeyxiexzf = this;
        while (true) {
            InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = c2887Ujhhgtgfeyxiexzf.f9153Ujhhgtgfeyxiexzf;
            c2887Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtg instanceof C2887Ujhhgtgfeyxiexzf ? (C2887Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg : null;
            if (c2887Ujhhgtgfeyxiexzf == null) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo1762Ujhhgtgfeyxiexzf(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf = this.f9154Ujhhgtgfeyxiexzf;
        InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg = interfaceC3737Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(interfaceC3738Ujhhgtgfeyxiexzf);
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = this.f9153Ujhhgtgfeyxiexzf;
        if (interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg != null) {
            return interfaceC3739feyxiexzfUjhhgtg;
        }
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtg.mo1762Ujhhgtgfeyxiexzf(interfaceC3738Ujhhgtgfeyxiexzf);
        if (interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf == interfaceC3739feyxiexzfUjhhgtg) {
            return this;
        }
        return interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf == C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf ? interfaceC3737Ujhhgtgfeyxiexzf : new C2887Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf, interfaceC3737Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final Object mo1763feyxiexzfUjhhgtg(Object obj, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        return interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(this.f9153Ujhhgtgfeyxiexzf.mo1763feyxiexzfUjhhgtg(obj, interfaceC3553feyxiexzfUjhhgtg), this.f9154Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final /* bridge */ InterfaceC3739feyxiexzfUjhhgtg mo1764feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        return AbstractC3593Ujhhgtgfeyxiexzf.m5163feyxiexzfUjhhgtg(this, interfaceC3739feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public final InterfaceC3737Ujhhgtgfeyxiexzf mo1765feyxiexzfUjhhgtg(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        C2887Ujhhgtgfeyxiexzf c2887Ujhhgtgfeyxiexzf = this;
        while (true) {
            InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg = c2887Ujhhgtgfeyxiexzf.f9154Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(interfaceC3738Ujhhgtgfeyxiexzf);
            if (interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg != null) {
                return interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg;
            }
            InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = c2887Ujhhgtgfeyxiexzf.f9153Ujhhgtgfeyxiexzf;
            if (!(interfaceC3739feyxiexzfUjhhgtg instanceof C2887Ujhhgtgfeyxiexzf)) {
                return interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(interfaceC3738Ujhhgtgfeyxiexzf);
            }
            c2887Ujhhgtgfeyxiexzf = (C2887Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg;
        }
    }
}
