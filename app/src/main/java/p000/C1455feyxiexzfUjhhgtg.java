package p000;

import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛴ能不能ᛲᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1455feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5065Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f5066Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1455feyxiexzfUjhhgtg(Consumer consumer, int i) {
        this.f5065Ujhhgtgfeyxiexzf = i;
        this.f5066Ujhhgtgfeyxiexzf = consumer;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        switch (this.f5065Ujhhgtgfeyxiexzf) {
            case 0:
                this.f5066Ujhhgtgfeyxiexzf.accept((Long) obj);
                break;
            default:
                this.f5066Ujhhgtgfeyxiexzf.accept((String) obj);
                break;
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
