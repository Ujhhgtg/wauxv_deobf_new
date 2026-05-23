package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0375 extends AbstractC1460 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m1518(), ((AbstractC0375) obj).m1518());
    }

    @Override // p000.AbstractC1460
    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m1518()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    public final byte[] m1518() {
        C1353 c1353 = new C1353();
        mo961(c1353);
        int i = c1353.f4838;
        int iCapacity = c1353.f4837.capacity() - c1353.f4838;
        if (!c1353.f4843) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c1353.f4837.position(i);
        c1353.f4837.get(bArr);
        return bArr;
    }
}
