package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONWriterUTF16JDK8UF extends JSONWriterUTF16 {
    public JSONWriterUTF16JDK8UF(JSONWriter.Context context) {
        super(context);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public /* bridge */ /* synthetic */ void writeBool(boolean z) {
        super.writeBool(z);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        writeString(str == null ? null : (char[]) JDKUtils.UNSAFE.getObject(str, JDKUtils.FIELD_STRING_VALUE_OFFSET));
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public /* bridge */ /* synthetic */ void writeStringLatin1(byte[] bArr) {
        super.writeStringLatin1(bArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public /* bridge */ /* synthetic */ void writeStringUTF16(byte[] bArr) {
        super.writeStringUTF16(bArr);
    }
}
