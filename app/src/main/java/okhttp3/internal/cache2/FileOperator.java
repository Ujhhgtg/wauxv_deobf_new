package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import p000.C0504;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public final void read(long j, C0504 c0504, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j3, j4, c0504);
            j3 += jTransferTo;
            j4 -= jTransferTo;
        }
    }

    public final void write(long j, C0504 c0504, long j2) throws IOException {
        if (j2 < 0 || j2 > c0504.f2172) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(c0504, j3, j4);
            j3 += jTransferFrom;
            j4 -= jTransferFrom;
        }
    }
}
