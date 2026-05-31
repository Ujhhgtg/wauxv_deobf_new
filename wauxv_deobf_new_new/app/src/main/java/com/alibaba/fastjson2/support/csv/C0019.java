package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.reader.CharArrayValueConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.support.csv.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0019 implements CharArrayValueConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ CSVReaderUTF16 f578;

    public /* synthetic */ C0019(CSVReaderUTF16 cSVReaderUTF16, int i) {
        this.f577 = i;
        this.f578 = cSVReaderUTF16;
    }

    @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
    public final void accept(int i, int i2, char[] cArr, int i3, int i4) {
        switch (this.f577) {
            case 0:
                this.f578.lambda$statAll$0(i, i2, cArr, i3, i4);
                break;
            default:
                this.f578.lambda$statAll$1(i, i2, cArr, i3, i4);
                break;
        }
    }
}
