package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ能不能要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1173feyxiexzfUjhhgtg implements InterfaceC0603Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile boolean f4452Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ConcurrentHashMap f4453Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final LinkedBlockingQueue f4454Ujhhgtgfeyxiexzf = new LinkedBlockingQueue();

    @Override // p000.InterfaceC0603Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final synchronized InterfaceC0259Ujhhgtgfeyxiexzf mo1741Ujhhgtgfeyxiexzf(String str) {
        C1190feyxiexzfUjhhgtg c1190feyxiexzfUjhhgtg;
        c1190feyxiexzfUjhhgtg = (C1190feyxiexzfUjhhgtg) this.f4453Ujhhgtgfeyxiexzf.get(str);
        if (c1190feyxiexzfUjhhgtg == null) {
            c1190feyxiexzfUjhhgtg = new C1190feyxiexzfUjhhgtg(str, this.f4454Ujhhgtgfeyxiexzf, this.f4452Ujhhgtgfeyxiexzf);
            this.f4453Ujhhgtgfeyxiexzf.put(str, c1190feyxiexzfUjhhgtg);
        }
        return c1190feyxiexzfUjhhgtg;
    }
}
