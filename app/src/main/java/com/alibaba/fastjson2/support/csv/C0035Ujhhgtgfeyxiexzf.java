package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.reader.ByteArrayValueConsumer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.alibaba.fastjson2.support.csv.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0035Ujhhgtgfeyxiexzf implements ByteArrayValueConsumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f593Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ CSVReaderUTF8 f594Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0035Ujhhgtgfeyxiexzf(CSVReaderUTF8 cSVReaderUTF8, int i) {
        this.f593Ujhhgtgfeyxiexzf = i;
        this.f594Ujhhgtgfeyxiexzf = cSVReaderUTF8;
    }

    @Override // com.alibaba.fastjson2.reader.ByteArrayValueConsumer
    public final void accept(int i, int i2, byte[] bArr, int i3, int i4, Charset charset) {
        switch (this.f593Ujhhgtgfeyxiexzf) {
            case 0:
                this.f594Ujhhgtgfeyxiexzf.lambda$statAll$1(i, i2, bArr, i3, i4, charset);
                break;
            default:
                this.f594Ujhhgtgfeyxiexzf.lambda$statAll$0(i, i2, bArr, i3, i4, charset);
                break;
        }
    }
}
