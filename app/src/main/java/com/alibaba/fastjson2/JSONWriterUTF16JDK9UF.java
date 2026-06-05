package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16JDK9UF extends JSONWriterUTF16 {
    public JSONWriterUTF16JDK9UF(JSONWriter.Context context) {
        super(context);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z) {
        int iPutBoolean;
        int i = this.off + 5;
        if (i >= this.chars.length) {
            grow0(i);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        if ((this.context.features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
            iPutBoolean = i2 + 1;
            cArr[i2] = z ? '1' : '0';
        } else {
            iPutBoolean = IOUtils.putBoolean(cArr, i2, z);
        }
        this.off = iPutBoolean;
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        byte[] bArrApply = JDKUtils.STRING_VALUE.apply(str);
        if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
            writeStringLatin1(bArrApply);
        } else {
            writeStringUTF16(bArrApply);
        }
    }
}
