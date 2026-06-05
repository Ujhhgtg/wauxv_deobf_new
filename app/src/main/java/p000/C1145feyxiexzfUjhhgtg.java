package p000;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸能不能ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1145feyxiexzfUjhhgtg implements InterfaceC3256feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final char f4332Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f4333Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final LinkedList f4334Ujhhgtgfeyxiexzf = new LinkedList();

    public C1145feyxiexzfUjhhgtg(char c) {
        this.f4332Ujhhgtgfeyxiexzf = c;
    }

    @Override // p000.InterfaceC3256feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo2608Ujhhgtgfeyxiexzf(C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf, C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf2, int i) {
        LinkedList<InterfaceC3256feyxiexzfUjhhgtg> linkedList = this.f4334Ujhhgtgfeyxiexzf;
        for (InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg : linkedList) {
            if (interfaceC3256feyxiexzfUjhhgtg.mo2610Ujhhgtgfeyxiexzf() <= i) {
                interfaceC3256feyxiexzfUjhhgtg.mo2608Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf, c1964Ujhhgtgfeyxiexzf2, i);
            }
        }
        interfaceC3256feyxiexzfUjhhgtg = (InterfaceC3256feyxiexzfUjhhgtg) linkedList.getFirst();
        interfaceC3256feyxiexzfUjhhgtg.mo2608Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf, c1964Ujhhgtgfeyxiexzf2, i);
    }

    @Override // p000.InterfaceC3256feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final char mo2609Ujhhgtgfeyxiexzf() {
        return this.f4332Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3256feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int mo2610Ujhhgtgfeyxiexzf() {
        return this.f4333Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3256feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int mo2611Ujhhgtgfeyxiexzf(C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg, C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg2) {
        int i = c3255feyxiexzfUjhhgtg.f10214Ujhhgtgfeyxiexzf;
        LinkedList<InterfaceC3256feyxiexzfUjhhgtg> linkedList = this.f4334Ujhhgtgfeyxiexzf;
        for (InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg : linkedList) {
            if (interfaceC3256feyxiexzfUjhhgtg.mo2610Ujhhgtgfeyxiexzf() <= i) {
                return interfaceC3256feyxiexzfUjhhgtg.mo2611Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg, c3255feyxiexzfUjhhgtg2);
            }
        }
        interfaceC3256feyxiexzfUjhhgtg = (InterfaceC3256feyxiexzfUjhhgtg) linkedList.getFirst();
        return interfaceC3256feyxiexzfUjhhgtg.mo2611Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg, c3255feyxiexzfUjhhgtg2);
    }

    @Override // p000.InterfaceC3256feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final char mo2612Ujhhgtgfeyxiexzf() {
        return this.f4332Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m2613Ujhhgtgfeyxiexzf(InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg) {
        int iMo2610Ujhhgtgfeyxiexzf = interfaceC3256feyxiexzfUjhhgtg.mo2610Ujhhgtgfeyxiexzf();
        LinkedList linkedList = this.f4334Ujhhgtgfeyxiexzf;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iMo2610Ujhhgtgfeyxiexzf2 = ((InterfaceC3256feyxiexzfUjhhgtg) listIterator.next()).mo2610Ujhhgtgfeyxiexzf();
            if (iMo2610Ujhhgtgfeyxiexzf > iMo2610Ujhhgtgfeyxiexzf2) {
                listIterator.previous();
                listIterator.add(interfaceC3256feyxiexzfUjhhgtg);
                return;
            } else if (iMo2610Ujhhgtgfeyxiexzf == iMo2610Ujhhgtgfeyxiexzf2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f4332Ujhhgtgfeyxiexzf + "' and minimum length " + iMo2610Ujhhgtgfeyxiexzf);
            }
        }
        linkedList.add(interfaceC3256feyxiexzfUjhhgtg);
        this.f4333Ujhhgtgfeyxiexzf = iMo2610Ujhhgtgfeyxiexzf;
    }
}
