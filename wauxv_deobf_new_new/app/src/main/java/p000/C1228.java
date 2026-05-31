package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1228 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Class f4439;

    public C1228(Enum[] enumArr) {
        this.f4439 = enumArr.getClass().getComponentType();
    }

    private final Object readResolve() {
        return new C1227((Enum[]) this.f4439.getEnumConstants());
    }
}
