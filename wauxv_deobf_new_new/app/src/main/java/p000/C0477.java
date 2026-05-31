package p000;

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
        if (AbstractC0478.m1849(clsResolveClass)) {
            return clsResolveClass;
        }
        throw new InvalidClassException("BeanShell snapshot rejected class: ".concat(clsResolveClass.getName()));
    }
}
