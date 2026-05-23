package p000;

import com.drake.net.exception.NetException;
import com.drake.net.exception.URLParseException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2146 implements InterfaceC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1004 f7097;

    public C2146(C1004 c1004) {
        this.f7097 = c1004;
    }

    @Override // p000.InterfaceC0875
    public final InterfaceC0876 getKey() {
        return C1133.f4207;
    }

    @Override // p000.InterfaceC1698
    public final boolean start() {
        return this.f7097.start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m3954(InterfaceC0842 interfaceC0842) throws Exception {
        C2145 c2145;
        String str;
        String str2;
        Exception e;
        if (interfaceC0842 instanceof C2145) {
            c2145 = (C2145) interfaceC0842;
            int i = c2145.f7096;
            if ((i & -2147483648) != 0) {
                c2145.f7096 = i - -2147483648;
            } else {
                c2145 = new C2145(this, interfaceC0842);
            }
        } else {
            c2145 = new C2145(this, interfaceC0842);
        }
        Object obj = c2145.f7094;
        int i2 = c2145.f7096;
        if (i2 == 0) {
            AbstractC0743.m2188(obj);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
            if (stackTraceElement != null) {
                str = " ...(" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
            } else {
                str = null;
            }
            try {
                C1004 c1004 = this.f7097;
                c2145.f7093 = str;
                c2145.f7096 = 1;
                Object objM2575 = c1004.m2575(c2145);
                EnumC0884 enumC0884 = EnumC0884.f3325;
                return objM2575 == enumC0884 ? enumC0884 : objM2575;
            } catch (Exception e2) {
                str2 = str;
                e = e2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c2145.f7093;
            try {
                AbstractC0743.m2188(obj);
                return obj;
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (str2 != null && (e instanceof NetException)) {
            ((NetException) e).setOccurred(str2);
        } else if (str2 != null && (e instanceof URLParseException)) {
            ((URLParseException) e).setOccurred(str2);
        }
        throw e;
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo3437() {
        return this.f7097.mo3437();
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC0687 mo3438(C1705 c1705) {
        return this.f7097.mo3438(c1705);
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final InterfaceC1080 mo3439(boolean z, boolean z2, C1700 c1700) {
        return this.f7097.mo3439(z, z2, c1700);
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final CancellationException mo3440() {
        return this.f7097.mo3440();
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0877 mo939(InterfaceC0876 interfaceC0876) {
        return this.f7097.mo939(interfaceC0876);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo940(Object obj, InterfaceC1429 interfaceC1429) {
        return interfaceC1429.mo1196(obj, this.f7097);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final InterfaceC0877 mo941(InterfaceC0877 interfaceC0877) {
        return AbstractC2209.m4140(this.f7097, interfaceC0877);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0875 mo942(InterfaceC0876 interfaceC0876) {
        return this.f7097.mo942(interfaceC0876);
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo3441(CancellationException cancellationException) {
        this.f7097.mo3441(cancellationException);
    }
}
