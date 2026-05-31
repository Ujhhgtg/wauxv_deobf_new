package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᛸᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2720 implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractCollection f8738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8739;

    public C2720(AbstractCollection abstractCollection, int i) {
        this.f8738 = abstractCollection;
        this.f8739 = i;
    }

    private final Object readResolve() {
        return this.f8738;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        AbstractCollection abstractCollectionM5324;
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
            C1836 c1836 = new C1836(i2);
            while (i3 < i2) {
                c1836.add(objectInput.readObject());
                i3++;
            }
            abstractCollectionM5324 = AbstractC3744.m5324(c1836);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            C2726 c2726 = new C2726(new C1916(i2));
            while (i3 < i2) {
                c2726.add(objectInput.readObject());
                i3++;
            }
            C1916 c1916 = c2726.f8746;
            c1916.m3860();
            abstractCollectionM5324 = c2726;
            if (c1916.f6325 <= 0) {
                abstractCollectionM5324 = C2726.f8745;
            }
        }
        this.f8738 = abstractCollectionM5324;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f8739);
        objectOutput.writeInt(this.f8738.size());
        Iterator it = this.f8738.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
