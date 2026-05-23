package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0765 extends C0452 {

    public final boolean f2864;

    public C0765(C0408 c0408, boolean z) {
        super(c0408);
        this.f2864 = z;
    }

    @Override // p000.C0452
    public final void mo1673(byte b) {
        if (this.f2864) {
            mo1679(String.valueOf(b & 255));
        } else {
            m1677(String.valueOf(b & 255));
        }
    }

    @Override // p000.C0452
    public final void mo1675(int i) {
        boolean z = this.f2864;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo1679(unsignedString);
        } else {
            m1677(unsignedString);
        }
    }

    @Override // p000.C0452
    public final void mo1676(long j) {
        boolean z = this.f2864;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo1679(unsignedString);
        } else {
            m1677(unsignedString);
        }
    }

    @Override // p000.C0452
    public final void mo1678(short s) {
        if (this.f2864) {
            mo1679(String.valueOf(s & 65535));
        } else {
            m1677(String.valueOf(s & 65535));
        }
    }
}
