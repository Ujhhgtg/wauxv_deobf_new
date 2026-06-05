package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.reader.CharArrayValueConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.support.csv.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Ujhhgtgfeyxiexzf implements CharArrayValueConsumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f591Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ CSVReaderUTF16 f592Ujhhgtgfeyxiexzf;

    public /* synthetic */ Ujhhgtgfeyxiexzf(CSVReaderUTF16 cSVReaderUTF16, int i) {
        this.f591Ujhhgtgfeyxiexzf = i;
        this.f592Ujhhgtgfeyxiexzf = cSVReaderUTF16;
    }

    @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
    public final void accept(int i, int i2, char[] cArr, int i3, int i4) {
        switch (this.f591Ujhhgtgfeyxiexzf) {
            case 0:
                this.f592Ujhhgtgfeyxiexzf.lambda$statAll$0(i, i2, cArr, i3, i4);
                break;
            default:
                this.f592Ujhhgtgfeyxiexzf.lambda$statAll$1(i, i2, cArr, i3, i4);
                break;
        }
    }
}
