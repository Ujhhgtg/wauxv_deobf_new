package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3751 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C3752 f11743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Member f11744;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751(C2885 c2885, C3752 c3752, Member member, int i) {
        super(i);
        this.f11743 = c3752;
        this.f11744 = member;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1478(C1927 c1927) {
        Object c2641;
        int i = C1574.f5467;
        C3752 c3752 = this.f11743;
        C1574 c1574 = new C1574();
        c1574.f5468 = c1927;
        Member member = this.f11744;
        try {
            InterfaceC1433 interfaceC1433 = c3752.f11750;
            if (interfaceC1433 != null) {
                interfaceC1433.invoke(c1574);
            }
            if (c3752.f11750 != null) {
                ArrayList arrayList = C3741.f11709;
                StringBuilder sb = new StringBuilder("After Hook Member [");
                sb.append(member);
                sb.append("] done");
                C3741.m5316();
            }
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            c3752.m5361(thM4616, member);
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1479(C1927 c1927) {
        Object c2641;
        int i = C1574.f5467;
        C3752 c3752 = this.f11743;
        C1574 c1574 = new C1574();
        c1574.f5468 = c1927;
        Member member = this.f11744;
        try {
            InterfaceC1433 interfaceC1433 = c3752.f11749;
            if (interfaceC1433 != null) {
                interfaceC1433.invoke(c1574);
            }
            Member member2 = ((C1571) c1927.f6344).f5461.method;
            Method method = member2 instanceof Method ? (Method) member2 : null;
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Object objMo1342 = ((C1572) c1927.f6347).mo1342(null, Boolean.FALSE);
            C3752.m5356(c3752, returnType, objMo1342 != null ? objMo1342.getClass() : null);
            if (c3752.f11749 != null) {
                ArrayList arrayList = C3741.f11709;
                StringBuilder sb = new StringBuilder("Before Hook Member [");
                sb.append(member);
                sb.append("] done");
                C3741.m5316();
            }
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            c3752.m5361(thM4616, member);
        }
    }
}
