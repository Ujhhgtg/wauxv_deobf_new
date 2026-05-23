package bsh;

import java.util.concurrent.atomic.AtomicInteger;
import p000.C0268;
import p000.C0501;
import p000.C1867;
import p000.C3523;
import p000.C3532;
import p000.RunnableC1668;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0003 extends C0007 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final AtomicInteger f470 = new AtomicInteger();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final C1867 f471 = new C1867(1, new C0268(1));

    public C0003(C0007 c0007, int i) {
        super(c0007, null, c0007.f493 + "/BlockNameSpace" + i);
        new AtomicInteger(1);
        this.f507 = c0007.f507;
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final This mo309(RunnableC1668 runnableC1668) {
        return m315().mo309(runnableC1668);
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final This mo310(RunnableC1668 runnableC1668) {
        return m315().mo310(runnableC1668);
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void mo311(String str) {
        this.f494.mo311(str);
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo312(String str) {
        this.f494.mo312(str);
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void mo313(C0501 c0501) {
        this.f494.mo313(c0501);
    }

    @Override // bsh.C0007
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final C3532 mo314(String str, Object obj, boolean z) {
        try {
            if (m357(str, false) != null) {
                return super.mo314(str, obj, false);
            }
        } catch (C3523 unused) {
        }
        return this.f494.mo314(str, obj, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final C0007 m315() {
        C0007 c0007 = this.f494;
        return c0007 instanceof C0003 ? ((C0003) c0007).m315() : c0007;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m316(String str, Throwable th) {
        super.mo314(str, th, false);
    }
}
