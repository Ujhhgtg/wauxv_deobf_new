package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲈᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2612 implements InterfaceC2430 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC2430.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC2430) && 1 == ((InterfaceC2430) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return ("number".hashCode() * 127) ^ Integer.hashCode(1);
    }

    @Override // p000.InterfaceC2430
    public final /* synthetic */ int number() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return AbstractC2784.m4752(new StringBuilder(), "@kotlinx.serialization.protobuf.ProtoNumber(number=", "1)");
    }
}
