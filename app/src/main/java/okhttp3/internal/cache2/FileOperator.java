package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import p000.C2598feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public final void read(long j, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j3, j4, c2598feyxiexzfUjhhgtg);
            j3 += jTransferTo;
            j4 -= jTransferTo;
        }
    }

    public final void write(long j, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j2) throws IOException {
        if (j2 < 0 || j2 > c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(c2598feyxiexzfUjhhgtg, j3, j4);
            j3 += jTransferFrom;
            j4 -= jTransferFrom;
        }
    }
}
