package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1100feyxiexzfUjhhgtg implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0174Ujhhgtgfeyxiexzf f4182Ujhhgtgfeyxiexzf;

    private final Object readResolve() {
        return this.f4182Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = new C0174Ujhhgtgfeyxiexzf(i);
        for (int i2 = 0; i2 < i; i2++) {
            c0174Ujhhgtgfeyxiexzf.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f4182Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.m1236Ujhhgtgfeyxiexzf();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f4182Ujhhgtgfeyxiexzf.f1373Ujhhgtgfeyxiexzf);
        for (Map.Entry entry : (C0173Ujhhgtgfeyxiexzf) this.f4182Ujhhgtgfeyxiexzf.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
