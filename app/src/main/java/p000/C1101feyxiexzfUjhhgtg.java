package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛴ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1101feyxiexzfUjhhgtg implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public AbstractCollection f4183Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f4184Ujhhgtgfeyxiexzf;

    public C1101feyxiexzfUjhhgtg(AbstractCollection abstractCollection, int i) {
        this.f4183Ujhhgtgfeyxiexzf = abstractCollection;
        this.f4184Ujhhgtgfeyxiexzf = i;
    }

    private final Object readResolve() {
        return this.f4183Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        AbstractCollection abstractCollectionM2746Ujhhgtgfeyxiexzf;
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        if (i == 0) {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(i2);
            while (i3 < i2) {
                c0094Ujhhgtgfeyxiexzf.add(objectInput.readObject());
                i3++;
            }
            abstractCollectionM2746Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            C1107feyxiexzfUjhhgtg c1107feyxiexzfUjhhgtg = new C1107feyxiexzfUjhhgtg(new C0174Ujhhgtgfeyxiexzf(i2));
            while (i3 < i2) {
                c1107feyxiexzfUjhhgtg.add(objectInput.readObject());
                i3++;
            }
            C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = c1107feyxiexzfUjhhgtg.f4202Ujhhgtgfeyxiexzf;
            c0174Ujhhgtgfeyxiexzf.m1236Ujhhgtgfeyxiexzf();
            abstractCollectionM2746Ujhhgtgfeyxiexzf = c1107feyxiexzfUjhhgtg;
            if (c0174Ujhhgtgfeyxiexzf.f1373Ujhhgtgfeyxiexzf <= 0) {
                abstractCollectionM2746Ujhhgtgfeyxiexzf = C1107feyxiexzfUjhhgtg.f4201Ujhhgtgfeyxiexzf;
            }
        }
        this.f4183Ujhhgtgfeyxiexzf = abstractCollectionM2746Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f4184Ujhhgtgfeyxiexzf);
        objectOutput.writeInt(this.f4183Ujhhgtgfeyxiexzf.size());
        Iterator it = this.f4183Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
