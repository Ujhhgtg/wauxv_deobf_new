package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1246 extends InputStream implements DataInput {

    public static final ByteOrder f4513 = ByteOrder.LITTLE_ENDIAN;

    public static final ByteOrder f4514 = ByteOrder.BIG_ENDIAN;

    public final DataInputStream f4515;

    public ByteOrder f4516;

    public int f4517;

    public byte[] f4518;

    public C1246(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4515.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f4517++;
        return this.f4515.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f4517++;
        return this.f4515.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f4517++;
        int i = this.f4515.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f4517 += 2;
        return this.f4515.readChar();
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
        this.f4517 += i2;
        this.f4515.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f4517 += 4;
        DataInputStream dataInputStream = this.f4515;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4516;
        if (byteOrder == f4513) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f4514) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f4516);
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
        this.f4517 += 8;
        DataInputStream dataInputStream = this.f4515;
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
        ByteOrder byteOrder = this.f4516;
        if (byteOrder == f4513) {
            j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
            j2 = i;
        } else {
            if (byteOrder != f4514) {
                throw new IOException("Invalid byte order: " + this.f4516);
            }
            j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
            j2 = i8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f4517 += 2;
        DataInputStream dataInputStream = this.f4515;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4516;
        if (byteOrder == f4513) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f4514) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f4516);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f4517 += 2;
        return this.f4515.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f4517++;
        return this.f4515.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f4517 += 2;
        DataInputStream dataInputStream = this.f4515;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4516;
        if (byteOrder == f4513) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f4514) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f4516);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final void m2903(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f4515;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f4518 == null) {
                    this.f4518 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f4518, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC1194.m2780(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f4517 += i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1246(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C1246(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f4516 = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4515 = dataInputStream;
        dataInputStream.mark(0);
        this.f4517 = 0;
        this.f4516 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4515.read(bArr, i, i2);
        this.f4517 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f4517 += bArr.length;
        this.f4515.readFully(bArr);
    }
}
