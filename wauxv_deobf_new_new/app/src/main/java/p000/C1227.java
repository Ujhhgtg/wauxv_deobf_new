package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1227 extends AbstractC0070 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Enum[] f4438;

    public C1227(Enum[] enumArr) {
        this.f4438 = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C1228(this.f4438);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // p000.AbstractC0070, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f4438;
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
        Enum[] enumArr = this.f4438;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", length));
        }
        return enumArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // p000.AbstractC0070, java.util.List
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f4438;
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
    @Override // p000.AbstractC0070, java.util.List
    public final int lastIndexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f4438;
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

    @Override // p000.AbstractC0070
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1087() {
        return this.f4438.length;
    }
}
