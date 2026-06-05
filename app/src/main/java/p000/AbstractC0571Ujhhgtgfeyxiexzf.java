package p000;

import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛱfeyxiexzfᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0571Ujhhgtgfeyxiexzf extends AbstractC2292feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f2585Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC2292feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo1843feyxiexzfUjhhgtg() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (this.f2585Ujhhgtgfeyxiexzf) {
            return;
        }
        try {
            mo1074feyxiexzfUjhhgtg();
        } catch (Exception e) {
            ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
            StringBuilder sb = new StringBuilder();
            sb.append("initOnce ");
            sb.append(this instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) this).mo1479feyxiexzfUjhhgtg() : "LoadHook");
            AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
        }
        this.f2585Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1844feyxiexzfUjhhgtg(C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        c2285feyxiexzfUjhhgtg.m3483Ujhhgtgfeyxiexzf(new C0572Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg, this, 0));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1845feyxiexzfUjhhgtg(C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        c2285feyxiexzfUjhhgtg.m3484Ujhhgtgfeyxiexzf(new C0572Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg, this, 1));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ */
    public abstract String[] mo1423feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public abstract void mo1074feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public abstract boolean mo1424feyxiexzfUjhhgtg();
}
