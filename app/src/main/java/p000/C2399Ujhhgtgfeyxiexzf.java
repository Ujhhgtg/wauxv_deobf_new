package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛲ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2399Ujhhgtgfeyxiexzf implements InterfaceC1117feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7791Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f7792Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2399Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f7791Ujhhgtgfeyxiexzf = i;
        this.f7792Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC1117feyxiexzfUjhhgtg
    public final Iterator iterator() {
        switch (this.f7791Ujhhgtgfeyxiexzf) {
            case 0:
                return new C2930Ujhhgtgfeyxiexzf(1, (Object[]) this.f7792Ujhhgtgfeyxiexzf);
            case 1:
                return ((Iterable) this.f7792Ujhhgtgfeyxiexzf).iterator();
            case 2:
                return (Iterator) this.f7792Ujhhgtgfeyxiexzf;
            default:
                return new C2930Ujhhgtgfeyxiexzf(7, (C1177feyxiexzfUjhhgtg) this.f7792Ujhhgtgfeyxiexzf);
        }
    }
}
