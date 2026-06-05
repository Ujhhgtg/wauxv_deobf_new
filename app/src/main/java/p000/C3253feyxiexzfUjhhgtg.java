package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3253feyxiexzfUjhhgtg implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f10200Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0682Ujhhgtgfeyxiexzf f10203Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3254feyxiexzfUjhhgtg f10204Ujhhgtgfeyxiexzf;

    public C3253feyxiexzfUjhhgtg(C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg) {
        this.f10204Ujhhgtgfeyxiexzf = c3254feyxiexzfUjhhgtg;
        int iM2794Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf(0, ((CharSequence) c3254feyxiexzfUjhhgtg.f10206Ujhhgtgfeyxiexzf).length());
        this.f10201Ujhhgtgfeyxiexzf = iM2794Ujhhgtgfeyxiexzf;
        this.f10202Ujhhgtgfeyxiexzf = iM2794Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10200Ujhhgtgfeyxiexzf == -1) {
            m4759Ujhhgtgfeyxiexzf();
        }
        return this.f10200Ujhhgtgfeyxiexzf == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10200Ujhhgtgfeyxiexzf == -1) {
            m4759Ujhhgtgfeyxiexzf();
        }
        if (this.f10200Ujhhgtgfeyxiexzf == 0) {
            throw new NoSuchElementException();
        }
        C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = this.f10203Ujhhgtgfeyxiexzf;
        this.f10203Ujhhgtgfeyxiexzf = null;
        this.f10200Ujhhgtgfeyxiexzf = -1;
        return c0682Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4759Ujhhgtgfeyxiexzf() {
        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg;
        C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg = this.f10204Ujhhgtgfeyxiexzf;
        CharSequence charSequence = (CharSequence) c3254feyxiexzfUjhhgtg.f10206Ujhhgtgfeyxiexzf;
        int i = this.f10202Ujhhgtgfeyxiexzf;
        if (i < 0) {
            this.f10200Ujhhgtgfeyxiexzf = 0;
            this.f10203Ujhhgtgfeyxiexzf = null;
            return;
        }
        if (i <= charSequence.length() && (c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) ((InterfaceC3553feyxiexzfUjhhgtg) c3254feyxiexzfUjhhgtg.f10207Ujhhgtgfeyxiexzf).mo1179Ujhhgtgfeyxiexzf(charSequence, Integer.valueOf(this.f10202Ujhhgtgfeyxiexzf))) != null) {
            int iIntValue = ((Number) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf).intValue();
            int iIntValue2 = ((Number) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).intValue();
            this.f10203Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(this.f10201Ujhhgtgfeyxiexzf, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f10201Ujhhgtgfeyxiexzf = i2;
            this.f10202Ujhhgtgfeyxiexzf = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f10203Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(this.f10201Ujhhgtgfeyxiexzf, AbstractC1152feyxiexzfUjhhgtg.m2625feyxiexzfUjhhgtg(charSequence), 1);
            this.f10202Ujhhgtgfeyxiexzf = -1;
        }
        this.f10200Ujhhgtgfeyxiexzf = 1;
    }
}
