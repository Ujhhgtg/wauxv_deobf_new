package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.reader.ByteArrayValueConsumer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.alibaba.fastjson2.support.csv.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0013 implements ByteArrayValueConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f527;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ CSVReaderUTF8 f528;

    public /* synthetic */ C0013(CSVReaderUTF8 cSVReaderUTF8, int i) {
        this.f527 = i;
        this.f528 = cSVReaderUTF8;
    }

    @Override // com.alibaba.fastjson2.reader.ByteArrayValueConsumer
    public final void accept(int i, int i2, byte[] bArr, int i3, int i4, Charset charset) {
        switch (this.f527) {
            case 0:
                this.f528.lambda$statAll$1(i, i2, bArr, i3, i4, charset);
                break;
            default:
                this.f528.lambda$statAll$0(i, i2, bArr, i3, i4, charset);
                break;
        }
    }
}
