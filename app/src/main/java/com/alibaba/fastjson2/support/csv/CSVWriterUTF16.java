package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.support.csv.CSVWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class CSVWriterUTF16 extends CSVWriter {
    private static final int DOUBLE_QUOTE_2_UTF16 = 2228258;
    final char[] chars;
    final Writer out;

    public CSVWriterUTF16(Writer writer, ZoneId zoneId, CSVWriter.Feature... featureArr) {
        super(zoneId, featureArr);
        this.out = writer;
        this.chars = new char[524288];
    }

    public void checkCapacity(int i) {
        if (this.off + i >= this.chars.length) {
            flush();
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.off > 0) {
            flush();
        }
        this.out.close();
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter, java.io.Flushable
    public void flush() {
        try {
            this.out.write(this.chars, 0, this.off);
            this.off = 0;
            this.out.flush();
        } catch (IOException e) {
            throw new JSONException("write csv error", e);
        }
    }

    public String toString() {
        if (!(this.out instanceof StringWriter)) {
            return super.toString();
        }
        flush();
        return this.out.toString();
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeBoolean(boolean z) {
        checkCapacity(5);
        this.off = IOUtils.putBoolean(this.chars, this.off, z);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeComma() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i = this.off;
        this.off = i + 1;
        cArr[i] = ',';
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateTime19(int i, int i2, int i3, int i4, int i5, int i6) {
        checkCapacity(19);
        char[] cArr = this.chars;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, this.off, i, i2, i3);
        cArr[iWriteLocalDate] = ' ';
        IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, i4, i5, i6);
        this.off = iWriteLocalDate + 9;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateYYYMMDD10(int i, int i2, int i3) {
        checkCapacity(10);
        this.off = IOUtils.writeLocalDate(this.chars, this.off, i, i2, i3);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return;
        }
        String string = bigDecimal.toString();
        int length = string.length();
        checkCapacity(24);
        string.getChars(0, length, this.chars, this.off);
        this.off += length;
    }

    public void writeDirect(char[] cArr, int i, int i2) {
        try {
            this.out.write(cArr, i, i2);
        } catch (IOException e) {
            throw new JSONException("write csv error", e);
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDouble(double d) {
        checkCapacity(24);
        this.off = NumberUtils.writeDouble(this.chars, this.off, d, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeFloat(float f) {
        checkCapacity(15);
        this.off = NumberUtils.writeFloat(this.chars, this.off, f, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt32(int i) {
        checkCapacity(11);
        this.off = IOUtils.writeInt32(this.chars, this.off, i);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt64(long j) {
        checkCapacity(20);
        this.off = IOUtils.writeInt64(this.chars, this.off, j);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLine() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i = this.off;
        this.off = i + 1;
        cArr[i] = '\n';
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return;
        }
        int i = this.off;
        char[] cArr = this.chars;
        if (i + 19 > cArr.length) {
            flush();
            i = 0;
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        cArr[iWriteLocalDate] = ' ';
        this.off = IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeQuote() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i = this.off;
        this.off = i + 1;
        cArr[i] = '\"';
    }

    public void writeRaw(char[] cArr) {
        int length = cArr.length;
        int i = this.off;
        int i2 = length + i;
        char[] cArr2 = this.chars;
        if (i2 < cArr2.length) {
            System.arraycopy(cArr, 0, cArr2, i, cArr.length);
            this.off += cArr.length;
            return;
        }
        flush();
        int length2 = cArr.length;
        char[] cArr3 = this.chars;
        if (length2 >= cArr3.length) {
            writeDirect(cArr, 0, cArr.length);
        } else {
            System.arraycopy(cArr, 0, cArr3, this.off, cArr.length);
            this.off += cArr.length;
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(String str) {
        int i;
        boolean z;
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = str.length();
        int i2 = 0;
        if (str.charAt(0) == '\"') {
            i = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (str.charAt(i3) == '\"') {
                    i++;
                }
            }
            z = false;
        } else {
            i = 0;
            z = false;
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == ',') {
                    z = true;
                } else if (cCharAt == '\"' || cCharAt == '\n' || cCharAt == '\r') {
                    i++;
                }
            }
            if (!z) {
                i = 0;
            }
        }
        if (i == 0 && !z) {
            if (this.off + length >= this.chars.length) {
                flush();
                if (length > this.chars.length) {
                    try {
                        this.out.write(str);
                        return;
                    } catch (IOException e) {
                        throw new JSONException("write csv error", e);
                    }
                }
            }
            str.getChars(0, length, this.chars, this.off);
            this.off += length;
            return;
        }
        checkCapacity(length + 2 + i);
        char[] cArr = this.chars;
        int length2 = cArr.length - 2;
        int i5 = this.off;
        int i6 = i5 + 1;
        cArr[i5] = '\"';
        while (i2 < length) {
            int i7 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == '\"') {
                IOUtils.putIntUnaligned(cArr, i6, DOUBLE_QUOTE_2_UTF16);
                i6 += 2;
            } else {
                cArr[i6] = cCharAt2;
                i6++;
            }
            if (i6 >= length2) {
                flush();
                i6 = this.off;
            }
            i2 = i7;
        }
        cArr[i6] = '\"';
        this.off = i6 + 1;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(long j, int i) {
        if (i == 0) {
            writeInt64(j);
            return;
        }
        if (j != Long.MIN_VALUE && i < 20 && i >= 0) {
            int i2 = this.off;
            char[] cArr = this.chars;
            if (i2 + 24 > cArr.length) {
                flush();
                i2 = 0;
            }
            this.off = IOUtils.writeDecimal(cArr, i2, j, i);
            return;
        }
        writeDecimal(BigDecimal.valueOf(j, i));
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeRaw(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        checkCapacity(str.length());
        str.getChars(0, str.length(), this.chars, this.off);
        this.off = str.length() + this.off;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        writeString(new String(bArr, StandardCharsets.UTF_8));
    }
}
