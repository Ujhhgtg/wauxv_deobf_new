package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᛸᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2673 implements InterfaceC2483 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC2483.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC2483) && 1 == ((InterfaceC2483) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return ("number".hashCode() * 127) ^ Integer.hashCode(1);
    }

    @Override // p000.InterfaceC2483
    public final /* synthetic */ int number() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return AbstractC2844.m4786(new StringBuilder(), "@kotlinx.serialization.protobuf.ProtoNumber(number=", "1)");
    }
}
