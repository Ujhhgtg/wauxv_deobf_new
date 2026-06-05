package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0673Ujhhgtgfeyxiexzf implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f2791Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f2792Ujhhgtgfeyxiexzf;

    private final Object readResolve() {
        C0667Ujhhgtgfeyxiexzf c0667Ujhhgtgfeyxiexzf = C0667Ujhhgtgfeyxiexzf.f2779Ujhhgtgfeyxiexzf;
        return AbstractC1937feyxiexzfUjhhgtg.m3279Ujhhgtgfeyxiexzf(this.f2792Ujhhgtgfeyxiexzf, this.f2791Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f2791Ujhhgtgfeyxiexzf = objectInput.readLong();
        this.f2792Ujhhgtgfeyxiexzf = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f2791Ujhhgtgfeyxiexzf);
        objectOutput.writeInt(this.f2792Ujhhgtgfeyxiexzf);
    }
}
