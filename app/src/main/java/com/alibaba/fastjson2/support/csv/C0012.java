package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.reader.CharArrayValueConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0012 implements CharArrayValueConsumer {

    public final /* synthetic */ int f525;

    public final /* synthetic */ CSVReaderUTF16 f526;

    public /* synthetic */ C0012(CSVReaderUTF16 cSVReaderUTF16, int i) {
        this.f525 = i;
        this.f526 = cSVReaderUTF16;
    }

    @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
    public final void accept(int i, int i2, char[] cArr, int i3, int i4) {
        switch (this.f525) {
            case 0:
                this.f526.lambda$statAll$0(i, i2, cArr, i3, i4);
                break;
            default:
                this.f526.lambda$statAll$1(i, i2, cArr, i3, i4);
                break;
        }
    }
}
