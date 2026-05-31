package bsh;

import java.util.concurrent.atomic.AtomicInteger;
import p000.C0278;
import p000.C1893;
import p000.C3581;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0002 extends C0012 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final AtomicInteger f466 = new AtomicInteger();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final C1893 f467 = new C1893(1, new C0278(1));

    public C0002(C0012 c0012, int i) {
        super(c0012, null, c0012.f520 + "/BlockNameSpace" + i);
        new AtomicInteger(1);
        this.f534 = c0012.f534;
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final This mo312(RunnableC0008 runnableC0008) {
        return m318().mo312(runnableC0008);
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final This mo313(RunnableC0008 runnableC0008) {
        return m318().mo313(runnableC0008);
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void mo314(String str) {
        this.f521.mo314(str);
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo315(String str) {
        this.f521.mo315(str);
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void mo316(BshMethod bshMethod) {
        this.f521.mo316(bshMethod);
    }

    @Override // bsh.C0012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Variable mo317(String str, Object obj, boolean z) {
        try {
            if (m377(str, false) != null) {
                return super.mo317(str, obj, false);
            }
        } catch (C3581 unused) {
        }
        return this.f521.mo317(str, obj, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final C0012 m318() {
        C0012 c0012 = this.f521;
        return c0012 instanceof C0002 ? ((C0002) c0012).m318() : c0012;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m319(String str, Throwable th) {
        super.mo317(str, th, false);
    }
}
