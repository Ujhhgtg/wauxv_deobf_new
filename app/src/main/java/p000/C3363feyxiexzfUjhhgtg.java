package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3363feyxiexzfUjhhgtg extends InputStream implements DataInput {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final ByteOrder f10513Ujhhgtgfeyxiexzf = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final ByteOrder f10514Ujhhgtgfeyxiexzf = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final DataInputStream f10515Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ByteOrder f10516Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10517Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public byte[] f10518Ujhhgtgfeyxiexzf;

    public C3363feyxiexzfUjhhgtg(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10515Ujhhgtgfeyxiexzf.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f10517Ujhhgtgfeyxiexzf++;
        return this.f10515Ujhhgtgfeyxiexzf.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10517Ujhhgtgfeyxiexzf++;
        return this.f10515Ujhhgtgfeyxiexzf.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f10517Ujhhgtgfeyxiexzf++;
        int i = this.f10515Ujhhgtgfeyxiexzf.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f10517Ujhhgtgfeyxiexzf += 2;
        return this.f10515Ujhhgtgfeyxiexzf.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f10517Ujhhgtgfeyxiexzf += i2;
        this.f10515Ujhhgtgfeyxiexzf.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f10517Ujhhgtgfeyxiexzf += 4;
        DataInputStream dataInputStream = this.f10515Ujhhgtgfeyxiexzf;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10516Ujhhgtgfeyxiexzf;
        if (byteOrder == f10513Ujhhgtgfeyxiexzf) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f10514Ujhhgtgfeyxiexzf) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f10516Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        this.f10517Ujhhgtgfeyxiexzf += 8;
        DataInputStream dataInputStream = this.f10515Ujhhgtgfeyxiexzf;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10516Ujhhgtgfeyxiexzf;
        if (byteOrder == f10513Ujhhgtgfeyxiexzf) {
            j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
            j2 = i;
        } else {
            if (byteOrder != f10514Ujhhgtgfeyxiexzf) {
                throw new IOException("Invalid byte order: " + this.f10516Ujhhgtgfeyxiexzf);
            }
            j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
            j2 = i8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f10517Ujhhgtgfeyxiexzf += 2;
        DataInputStream dataInputStream = this.f10515Ujhhgtgfeyxiexzf;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10516Ujhhgtgfeyxiexzf;
        if (byteOrder == f10513Ujhhgtgfeyxiexzf) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f10514Ujhhgtgfeyxiexzf) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f10516Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f10517Ujhhgtgfeyxiexzf += 2;
        return this.f10515Ujhhgtgfeyxiexzf.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10517Ujhhgtgfeyxiexzf++;
        return this.f10515Ujhhgtgfeyxiexzf.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f10517Ujhhgtgfeyxiexzf += 2;
        DataInputStream dataInputStream = this.f10515Ujhhgtgfeyxiexzf;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10516Ujhhgtgfeyxiexzf;
        if (byteOrder == f10513Ujhhgtgfeyxiexzf) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f10514Ujhhgtgfeyxiexzf) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f10516Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4867Ujhhgtgfeyxiexzf(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f10515Ujhhgtgfeyxiexzf;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f10518Ujhhgtgfeyxiexzf == null) {
                    this.f10518Ujhhgtgfeyxiexzf = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f10518Ujhhgtgfeyxiexzf, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f10517Ujhhgtgfeyxiexzf += i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3363feyxiexzfUjhhgtg(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C3363feyxiexzfUjhhgtg(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f10516Ujhhgtgfeyxiexzf = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10515Ujhhgtgfeyxiexzf = dataInputStream;
        dataInputStream.mark(0);
        this.f10517Ujhhgtgfeyxiexzf = 0;
        this.f10516Ujhhgtgfeyxiexzf = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f10515Ujhhgtgfeyxiexzf.read(bArr, i, i2);
        this.f10517Ujhhgtgfeyxiexzf += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f10517Ujhhgtgfeyxiexzf += bArr.length;
        this.f10515Ujhhgtgfeyxiexzf.readFully(bArr);
    }
}
