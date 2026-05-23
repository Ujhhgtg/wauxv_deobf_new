package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.support.csv.CSVWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class CSVWriterUTF8 extends CSVWriter {
    private static final short DOUBLE_QUOTE_2_LATIN1 = 8738;
    final byte[] bytes;
    final Charset charset;
    final OutputStream out;

    public CSVWriterUTF8(OutputStream outputStream, Charset charset, ZoneId zoneId, CSVWriter.Feature... featureArr) {
        super(zoneId, featureArr);
        this.out = outputStream;
        this.charset = charset;
        this.bytes = new byte[524288];
    }

    private void writeRaw(byte[] bArr) {
        int length = bArr.length;
        int i = this.off;
        int i2 = length + i;
        byte[] bArr2 = this.bytes;
        if (i2 < bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            this.off += bArr.length;
            return;
        }
        flush();
        int length2 = bArr.length;
        byte[] bArr3 = this.bytes;
        if (length2 >= bArr3.length) {
            writeDirect(bArr, 0, bArr.length);
        } else {
            System.arraycopy(bArr, 0, bArr3, this.off, bArr.length);
            this.off += bArr.length;
        }
    }

    public void checkCapacity(int i) {
        if (this.off + i >= this.bytes.length) {
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
            this.out.write(this.bytes, 0, this.off);
            this.off = 0;
            this.out.flush();
        } catch (IOException e) {
            throw new JSONException("write csv error", e);
        }
    }

    public String toString() {
        if (!(this.out instanceof ByteArrayOutputStream)) {
            return super.toString();
        }
        flush();
        return new String(((ByteArrayOutputStream) this.out).toByteArray(), StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeBoolean(boolean z) {
        checkCapacity(5);
        this.off = IOUtils.putBoolean(this.bytes, this.off, z);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeComma() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i = this.off;
        this.off = i + 1;
        bArr[i] = 44;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateTime19(int i, int i2, int i3, int i4, int i5, int i6) {
        checkCapacity(19);
        byte[] bArr = this.bytes;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, this.off, i, i2, i3);
        bArr[iWriteLocalDate] = 32;
        IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, i4, i5, i6);
        this.off = iWriteLocalDate + 9;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateYYYMMDD10(int i, int i2, int i3) {
        checkCapacity(10);
        this.off = IOUtils.writeLocalDate(this.bytes, this.off, i, i2, i3);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return;
        }
        String string = bigDecimal.toString();
        int length = string.length();
        checkCapacity(24);
        string.getBytes(0, length, this.bytes, this.off);
        this.off += length;
    }

    public void writeDirect(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            throw new JSONException("write csv error", e);
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDouble(double d) {
        checkCapacity(24);
        this.off = NumberUtils.writeDouble(this.bytes, this.off, d, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeFloat(float f) {
        checkCapacity(15);
        this.off = NumberUtils.writeFloat(this.bytes, this.off, f, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt32(int i) {
        checkCapacity(11);
        this.off = IOUtils.writeInt32(this.bytes, this.off, i);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt64(long j) {
        checkCapacity(20);
        this.off = IOUtils.writeInt64(this.bytes, this.off, j);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLine() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i = this.off;
        this.off = i + 1;
        bArr[i] = 10;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return;
        }
        int i = this.off;
        byte[] bArr = this.bytes;
        if (i + 19 > bArr.length) {
            flush();
            i = 0;
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        bArr[iWriteLocalDate] = 32;
        this.off = IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeQuote() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i = this.off;
        this.off = i + 1;
        bArr[i] = 34;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(String str) {
        Function<String, byte[]> function;
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        writeString((toIntFunction == null || (function = JDKUtils.STRING_VALUE) == null || toIntFunction.applyAsInt(str) != JDKUtils.LATIN1.byteValue()) ? str.getBytes(this.charset) : function.apply(str));
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(long j, int i) {
        if (i == 0) {
            writeInt64(j);
            return;
        }
        if (j != -9223372036854775808L && i < 20 && i >= 0) {
            int i2 = this.off;
            byte[] bArr = this.bytes;
            if (i2 + 24 > bArr.length) {
                flush();
                i2 = 0;
            }
            this.off = IOUtils.writeDecimal(bArr, i2, j, i);
            return;
        }
        writeDecimal(BigDecimal.valueOf(j, i));
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(byte[] bArr) {
        int i;
        boolean z;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int length = bArr.length;
        if (bArr[0] == 34) {
            i = 0;
            for (byte b : bArr) {
                if (b == 34) {
                    i++;
                }
            }
            z = false;
        } else {
            i = 0;
            z = false;
            for (byte b2 : bArr) {
                if (b2 == 44) {
                    z = true;
                } else if (b2 == 34 || b2 == 10 || b2 == 13) {
                    i++;
                }
            }
            if (!z) {
                i = 0;
            }
        }
        if (i == 0 && !z) {
            writeRaw(bArr);
            return;
        }
        checkCapacity(length + 2 + i);
        byte[] bArr2 = this.bytes;
        int length2 = bArr2.length - 2;
        int i2 = this.off;
        int i3 = i2 + 1;
        bArr2[i2] = 34;
        for (byte b3 : bArr) {
            if (b3 == 34) {
                IOUtils.putShortUnaligned(bArr2, i3, 8738);
                i3 += 2;
            } else {
                bArr2[i3] = b3;
                i3++;
            }
            if (i3 >= length2) {
                flush();
                i3 = this.off;
            }
        }
        bArr2[i3] = 34;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeRaw(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        writeRaw(str.getBytes(this.charset));
    }
}
