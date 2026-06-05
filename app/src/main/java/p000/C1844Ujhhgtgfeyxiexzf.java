package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1844Ujhhgtgfeyxiexzf implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f6183Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f6184Ujhhgtgfeyxiexzf;

    private final Object readResolve() {
        long j = this.f6183Ujhhgtgfeyxiexzf;
        long j2 = this.f6184Ujhhgtgfeyxiexzf;
        return (j == 0 && j2 == 0) ? C1845Ujhhgtgfeyxiexzf.f6185Ujhhgtgfeyxiexzf : new C1845Ujhhgtgfeyxiexzf(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f6183Ujhhgtgfeyxiexzf = objectInput.readLong();
        this.f6184Ujhhgtgfeyxiexzf = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f6183Ujhhgtgfeyxiexzf);
        objectOutput.writeLong(this.f6184Ujhhgtgfeyxiexzf);
    }
}
