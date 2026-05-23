package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3688 extends AbstractC0567 {

    public final /* synthetic */ C3689 f11586;

    public final /* synthetic */ Member f11587;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688(C2825 c2825, C3689 c3689, Member member, int i) {
        super(i);
        this.f11586 = c3689;
        this.f11587 = member;
    }

    @Override // p000.AbstractC0567
    public final void mo1332(C1676 c1676) {
        Object c2585;
        int i = 0;
        C3689 c3689 = this.f11586;
        C1563 c1563 = new C1563();
        c1563.f5438 = c1676;
        Member member = this.f11587;
        try {
            InterfaceC1425 interfaceC1425 = c3689.f11593;
            if (interfaceC1425 != null) {
                interfaceC1425.invoke(c1563);
            }
            if (c3689.f11593 != null) {
                ArrayList arrayList = C3678.f11549;
                StringBuilder sb = new StringBuilder("After Hook Member [");
                sb.append(member);
                sb.append("] done");
                C3678.m5307();
            }
            c2585 = Unit.INSTANCE;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            c3689.m5353(thM4594, member);
        }
    }

    @Override // p000.AbstractC0567
    public final void mo1333(C1676 c1676) {
        Object c2585;
        int i = 0;
        C3689 c3689 = this.f11586;
        C1563 c1563 = new C1563();
        c1563.f5438 = c1676;
        Member member = this.f11587;
        try {
            InterfaceC1425 interfaceC1425 = c3689.f11592;
            if (interfaceC1425 != null) {
                interfaceC1425.invoke(c1563);
            }
            Member member2 = ((C1559) c1676.f5658).f5430.method;
            Method method = member2 instanceof Method ? (Method) member2 : null;
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Object objMo1196 = ((C1560) c1676.f5659).mo1196(null, Boolean.FALSE);
            C3689.m5348(c3689, returnType, objMo1196 != null ? objMo1196.getClass() : null);
            if (c3689.f11592 != null) {
                ArrayList arrayList = C3678.f11549;
                StringBuilder sb = new StringBuilder("Before Hook Member [");
                sb.append(member);
                sb.append("] done");
                C3678.m5307();
            }
            c2585 = Unit.INSTANCE;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            c3689.m5353(thM4594, member);
        }
    }
}
