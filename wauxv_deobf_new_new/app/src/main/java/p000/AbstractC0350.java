package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0350 extends AbstractC0972 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m1624(), ((AbstractC0350) obj).m1624());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m1624()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final byte[] m1624() {
        C1353 c1353 = new C1353();
        mo1106(c1353);
        int i = c1353.f4835;
        int iCapacity = c1353.f4834.capacity() - c1353.f4835;
        if (!c1353.f4840) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c1353.f4834.position(i);
        c1353.f4834.get(bArr);
        return bArr;
    }
}
