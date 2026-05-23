package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤝᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3530 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2440 f11043;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC3450[] f11044;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11045;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C3448 f11046;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f11047;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public AbstractC0777 f11048;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f11049;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1242 f11050;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f11051;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11052;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f11053;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2525 f11054;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final InterfaceC3450[] f11055;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f11056;

    public AbstractC3530(C2440 c2440) {
        if (c2440 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f11043 = c2440;
        this.f11044 = new InterfaceC3450[10];
        this.f11055 = new InterfaceC3450[6];
        m5115();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3450 m5114(int i) {
        if (i >= this.f11045) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f11044[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m5115() {
        this.f11045 = 0;
        this.f11046 = null;
        this.f11047 = 0;
        this.f11048 = null;
        this.f11049 = 0;
        this.f11050 = null;
        this.f11051 = null;
        this.f11052 = -1;
        this.f11053 = false;
        this.f11054 = null;
        this.f11056 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2525 m5116(boolean z) {
        if (this.f11054 == null) {
            return null;
        }
        if (this.f11056 != 1) {
            throw new C2704(AbstractC2784.m4752(new StringBuilder("local target with "), this.f11056 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC3450 interfaceC3450 = this.f11055[0];
        C3448 type = interfaceC3450.getType();
        C3448 type2 = this.f11054.f8056.getType();
        if (type == type2) {
            return z ? this.f11054.m4545(interfaceC3450) : this.f11054;
        }
        if (AbstractC1270.m2984(type2, type)) {
            if (type2 == C3448.f10882) {
                this.f11054 = this.f11054.m4545(interfaceC3450);
            }
            return this.f11054;
        }
        throw new C2704("local variable type mismatch: attempt to set or access a value of type " + type.mo1214() + " using a local variable of type " + type2.mo1214() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m5117(C0243 c0243, int i) {
        C1242 c1242 = (C1242) c0243.f1405;
        m5115();
        if (i > this.f11044.length) {
            this.f11044 = new InterfaceC3450[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            InterfaceC3450[] interfaceC3450Arr = this.f11044;
            c1242.m3925();
            InterfaceC3450 interfaceC3450M2898 = c1242.m2898(0);
            InterfaceC3450[] interfaceC3450Arr2 = (InterfaceC3450[]) c1242.f4508;
            int i3 = c1242.f4507;
            int i4 = i3 - 1;
            interfaceC3450Arr2[i4] = null;
            ((boolean[]) c1242.f4509)[i4] = false;
            c1242.f4507 = i3 - interfaceC3450M2898.getType().m4966();
            interfaceC3450Arr[i2] = interfaceC3450M2898;
        }
        this.f11045 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m5118(C0243 c0243, C2440 c2440) {
        C2819 c2819 = c2440.f7756;
        int length = c2819.f4836.length;
        m5117(c0243, length);
        for (int i = 0; i < length; i++) {
            if (!AbstractC1270.m2984((C3448) c2819.m3062(i), this.f11044[i])) {
                throw new C2704("at stack depth " + ((length - 1) - i) + ", expected type " + ((C3448) c2819.m3062(i)).mo1214() + " but found " + this.f11044[i].getType().mo1214(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m5119(C0243 c0243, C3448 c3448) {
        m5117(c0243, 1);
        if (AbstractC1270.m2984(c3448, this.f11044[0])) {
            return;
        }
        throw new C2704("expected type " + c3448.mo1214() + " but found " + this.f11044[0].getType().mo1214(), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m5120(C0243 c0243, C3448 c3448, C3448 c3449) {
        m5117(c0243, 2);
        if (!AbstractC1270.m2984(c3448, this.f11044[0])) {
            throw new C2704("expected type " + c3448.mo1214() + " but found " + this.f11044[0].getType().mo1214(), null);
        }
        if (AbstractC1270.m2984(c3449, this.f11044[1])) {
            return;
        }
        throw new C2704("expected type " + c3449.mo1214() + " but found " + this.f11044[1].getType().mo1214(), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m5121(InterfaceC3450 interfaceC3450) {
        if (interfaceC3450 == null) {
            throw new NullPointerException("result == null");
        }
        this.f11055[0] = interfaceC3450;
        this.f11056 = 1;
    }
}
