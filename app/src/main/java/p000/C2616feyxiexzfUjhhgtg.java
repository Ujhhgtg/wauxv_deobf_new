package p000;

import java.io.File;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱfeyxiexzfᛱ要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2616feyxiexzfUjhhgtg implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8435Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f8436Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2616feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8435Ujhhgtgfeyxiexzf = i;
        this.f8436Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f8435Ujhhgtgfeyxiexzf) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8435Ujhhgtgfeyxiexzf) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(bArr), new C0231Ujhhgtgfeyxiexzf(bArr, 1, (C2466feyxiexzfUjhhgtg) this.f8436Ujhhgtgfeyxiexzf));
            case 1:
                return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(obj), new C3108Ujhhgtgfeyxiexzf(obj.toString(), (C2466feyxiexzfUjhhgtg) this.f8436Ujhhgtgfeyxiexzf, 0));
            default:
                File file = (File) obj;
                return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(file), new C3108Ujhhgtgfeyxiexzf(file, (C3339feyxiexzfUjhhgtg) this.f8436Ujhhgtgfeyxiexzf, 1));
        }
    }
}
