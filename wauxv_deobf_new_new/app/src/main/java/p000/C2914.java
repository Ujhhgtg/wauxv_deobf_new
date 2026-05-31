package p000;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2914 implements InterfaceC1881 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile InterfaceC1881 f9287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Boolean f9288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Method f9289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1238 f9290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Queue f9291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f9292;

    public C2914(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f9286 = str;
        this.f9291 = linkedBlockingQueue;
        this.f9292 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2914.class == obj.getClass() && this.f9286.equals(((C2914) obj).f9286);
    }

    public final int hashCode() {
        return this.f9286.hashCode();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1088(String str) {
        m4919().mo1088(str);
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2998() {
        return m4919().mo2998();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo2999() {
        return m4919().mo2999();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo3000() {
        return m4919().mo3000();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo3001() {
        return m4919().mo3001();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo3002() {
        return m4919().mo3002();
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo1089(String str, Throwable th) {
        m4919().mo1089(str, th);
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo3800(int i) {
        return m4919().mo3800(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final InterfaceC1881 m4919() {
        if (this.f9287 != null) {
            return this.f9287;
        }
        if (this.f9292) {
            return C2147.f7090;
        }
        if (this.f9290 == null) {
            Queue queue = this.f9291;
            C1238 c1238 = new C1238();
            c1238.f4465 = this;
            c1238.f4464 = this.f9286;
            c1238.f4466 = queue;
            this.f9290 = c1238;
        }
        return this.f9290;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m4920() {
        Boolean bool = this.f9288;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f9289 = this.f9287.getClass().getMethod("log", C2916.class);
            this.f9288 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f9288 = Boolean.FALSE;
        }
        return this.f9288.booleanValue();
    }
}
