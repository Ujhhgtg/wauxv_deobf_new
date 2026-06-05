package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3369feyxiexzfUjhhgtg extends AbstractC2933Ujhhgtgfeyxiexzf implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Enum[] f10536Ujhhgtgfeyxiexzf;

    public C3369feyxiexzfUjhhgtg(Enum[] enumArr) {
        this.f10536Ujhhgtgfeyxiexzf = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C3370feyxiexzfUjhhgtg(this.f10536Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f10536Ujhhgtgfeyxiexzf;
            if (iOrdinal < enumArr.length) {
                r0 = enumArr[iOrdinal];
            } else {
                r0 = null;
            }
        } else {
            r0 = null;
        }
        return r0 == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f10536Ujhhgtgfeyxiexzf;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", length));
        }
        return enumArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f10536Ujhhgtgfeyxiexzf;
            if (iOrdinal < enumArr.length) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final int lastIndexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f10536Ujhhgtgfeyxiexzf;
            if (iOrdinal < enumArr.length) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1287Ujhhgtgfeyxiexzf() {
        return this.f10536Ujhhgtgfeyxiexzf.length;
    }
}
