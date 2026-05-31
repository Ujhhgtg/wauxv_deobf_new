package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᛸᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3589 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2492 f11198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC3507[] f11199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C3505 f11201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f11202;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public AbstractC0775 f11203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f11204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1244 f11205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f11206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f11208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2581 f11209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final InterfaceC3507[] f11210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f11211;

    public AbstractC3589(C2492 c2492) {
        if (c2492 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f11198 = c2492;
        this.f11199 = new InterfaceC3507[10];
        this.f11210 = new InterfaceC3507[6];
        m5127();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3507 m5126(int i) {
        if (i >= this.f11200) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f11199[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m5127() {
        this.f11200 = 0;
        this.f11201 = null;
        this.f11202 = 0;
        this.f11203 = null;
        this.f11204 = 0;
        this.f11205 = null;
        this.f11206 = null;
        this.f11207 = -1;
        this.f11208 = false;
        this.f11209 = null;
        this.f11211 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2581 m5128(boolean z) {
        if (this.f11209 == null) {
            return null;
        }
        if (this.f11211 != 1) {
            throw new C2766(AbstractC2844.m4786(new StringBuilder("local target with "), this.f11211 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC3507 interfaceC3507 = this.f11210[0];
        C3505 type = interfaceC3507.getType();
        C3505 type2 = this.f11209.f8206.getType();
        if (type == type2) {
            return z ? this.f11209.m4567(interfaceC3507) : this.f11209;
        }
        if (AbstractC2727.m4703(type2, type)) {
            if (type2 == C3505.f11042) {
                this.f11209 = this.f11209.m4567(interfaceC3507);
            }
            return this.f11209;
        }
        throw new C2766("local variable type mismatch: attempt to set or access a value of type " + type.mo1360() + " using a local variable of type " + type2.mo1360() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m5129(C0253 c0253, int i) {
        C1244 c1244 = (C1244) c0253.f1479;
        m5127();
        if (i > this.f11199.length) {
            this.f11199 = new InterfaceC3507[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            InterfaceC3507[] interfaceC3507Arr = this.f11199;
            c1244.m4109();
            InterfaceC3507 interfaceC3507M3017 = c1244.m3017(0);
            InterfaceC3507[] interfaceC3507Arr2 = (InterfaceC3507[]) c1244.f4507;
            int i3 = c1244.f4506;
            int i4 = i3 - 1;
            interfaceC3507Arr2[i4] = null;
            ((boolean[]) c1244.f4508)[i4] = false;
            c1244.f4506 = i3 - interfaceC3507M3017.getType().m5028();
            interfaceC3507Arr[i2] = interfaceC3507M3017;
        }
        this.f11200 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m5130(C0253 c0253, C2492 c2492) {
        C2879 c2879 = c2492.f7900;
        int length = c2879.f4833.length;
        m5129(c0253, length);
        for (int i = 0; i < length; i++) {
            if (!AbstractC2727.m4703((C3505) c2879.m3165(i), this.f11199[i])) {
                throw new C2766("at stack depth " + ((length - 1) - i) + ", expected type " + ((C3505) c2879.m3165(i)).mo1360() + " but found " + this.f11199[i].getType().mo1360(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m5131(C0253 c0253, C3505 c3505) {
        m5129(c0253, 1);
        if (AbstractC2727.m4703(c3505, this.f11199[0])) {
            return;
        }
        throw new C2766("expected type " + c3505.mo1360() + " but found " + this.f11199[0].getType().mo1360(), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m5132(C0253 c0253, C3505 c3505, C3505 c3506) {
        m5129(c0253, 2);
        if (!AbstractC2727.m4703(c3505, this.f11199[0])) {
            throw new C2766("expected type " + c3505.mo1360() + " but found " + this.f11199[0].getType().mo1360(), null);
        }
        if (AbstractC2727.m4703(c3506, this.f11199[1])) {
            return;
        }
        throw new C2766("expected type " + c3506.mo1360() + " but found " + this.f11199[1].getType().mo1360(), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m5133(InterfaceC3507 interfaceC3507) {
        if (interfaceC3507 == null) {
            throw new NullPointerException("result == null");
        }
        this.f11210[0] = interfaceC3507;
        this.f11211 = 1;
    }
}
