package p000;

import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2230 implements InterfaceC2654 {

    public static final C2230 f7226 = new C2230();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return (C2851.f9114.hashCode() * 31) - 1818355776;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }

    @Override // p000.InterfaceC2654
    public final String mo1342() {
        return "kotlin.Nothing";
    }

    @Override // p000.InterfaceC2654
    public final int mo3471(String str) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p000.InterfaceC2654
    public final AbstractC1460 mo3472() {
        return C2851.f9114;
    }

    @Override // p000.InterfaceC2654
    public final int mo3473() {
        return 0;
    }

    @Override // p000.InterfaceC2654
    public final String mo3474(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p000.InterfaceC2654
    public final List mo3475(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p000.InterfaceC2654
    public final InterfaceC2654 mo3476(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3477(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }
}
