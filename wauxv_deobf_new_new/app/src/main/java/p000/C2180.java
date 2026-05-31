package p000;

import com.drake.net.exception.NetException;
import com.drake.net.exception.URLParseException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲀᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2180 implements InterfaceC1716 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1008 f7221;

    public C2180(C1008 c1008) {
        this.f7221 = c1008;
    }

    @Override // p000.InterfaceC0874
    public final InterfaceC0875 getKey() {
        return C1139.f4219;
    }

    @Override // p000.InterfaceC1716
    public final boolean start() {
        return this.f7221.start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4138(InterfaceC0841 interfaceC0841) throws Exception {
        C2179 c2179;
        String str;
        String str2;
        Exception e;
        if (interfaceC0841 instanceof C2179) {
            c2179 = (C2179) interfaceC0841;
            int i = c2179.f7220;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2179.f7220 = i - Integer.MIN_VALUE;
            } else {
                c2179 = new C2179(this, interfaceC0841);
            }
        } else {
            c2179 = new C2179(this, interfaceC0841);
        }
        Object obj = c2179.f7218;
        int i2 = c2179.f7220;
        if (i2 == 0) {
            AbstractC1470.m3372(obj);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
            if (stackTraceElement != null) {
                str = " ...(" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
            } else {
                str = null;
            }
            try {
                C1008 c1008 = this.f7221;
                c2179.f7217 = str;
                c2179.f7220 = 1;
                Object objM2699 = c1008.m2699(c2179);
                EnumC0883 enumC0883 = EnumC0883.f3332;
                return objM2699 == enumC0883 ? enumC0883 : objM2699;
            } catch (Exception e2) {
                str2 = str;
                e = e2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c2179.f7217;
            try {
                AbstractC1470.m3372(obj);
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

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo3605() {
        return this.f7221.mo3605();
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC0678 mo3606(C1723 c1723) {
        return this.f7221.mo3606(c1723);
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final InterfaceC1085 mo3607(boolean z, boolean z2, C1718 c1718) {
        return this.f7221.mo3607(z, z2, c1718);
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final CancellationException mo3608() {
        return this.f7221.mo3608();
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0876 mo1083(InterfaceC0875 interfaceC0875) {
        return this.f7221.mo1083(interfaceC0875);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo1084(Object obj, InterfaceC1437 interfaceC1437) {
        return interfaceC1437.mo1342(obj, this.f7221);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final InterfaceC0876 mo1085(InterfaceC0876 interfaceC0876) {
        return AbstractC1586.m3481(this.f7221, interfaceC0876);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0874 mo1086(InterfaceC0875 interfaceC0875) {
        return this.f7221.mo1086(interfaceC0875);
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo3609(CancellationException cancellationException) {
        this.f7221.mo3609(cancellationException);
    }
}
