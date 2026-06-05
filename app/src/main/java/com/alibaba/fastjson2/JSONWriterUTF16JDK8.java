package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16JDK8 extends JSONWriterUTF16 {
    public JSONWriterUTF16JDK8(JSONWriter.Context context) {
        super(context);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            if (isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                writeString("");
                return;
            } else {
                writeNull();
                return;
            }
        }
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        char[] charArray = JDKUtils.getCharArray(str);
        int length = charArray.length;
        for (char c : charArray) {
            if (c == this.quote || c == '\\' || c < ' ' || ((z && (c == '<' || c == '>' || c == '(' || c == ')')) || (z2 && c > 127))) {
                writeStringEscape(str);
                return;
            }
        }
        int i = this.off + length + 2;
        if (i >= this.chars.length) {
            grow0(i);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        int i3 = i2 + 1;
        this.off = i3;
        cArr[i2] = this.quote;
        System.arraycopy(charArray, 0, cArr, i3, charArray.length);
        int i4 = this.off + length;
        char[] cArr2 = this.chars;
        this.off = i4 + 1;
        cArr2[i4] = this.quote;
    }
}
