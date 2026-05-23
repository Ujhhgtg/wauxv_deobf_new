package p000;

import bsh.C0007;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1229 extends Exception {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC2225 f4452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f4453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0550 f4454;

    public C1229(String str, InterfaceC2225 interfaceC2225, C0550 c0550, Throwable th) {
        this(str, interfaceC2225, c0550);
        initCause(th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        if (this.f4452 != null) {
            string = " : at Line: " + this.f4452.getLineNumber() + " : in file: " + this.f4452.mo1450() + " : " + this.f4452.getText();
        } else {
            string = ": <at unknown location>";
        }
        C0550 c0550 = this.f4454;
        if (c0550 != null) {
            StringBuilder sbM2788 = AbstractC1194.m2788(string, "\n");
            Stack stack = new Stack();
            stack.addAll(c0550.f2265);
            String string2 = "";
            while (stack.size() > 0) {
                try {
                    C0007 c0007 = (C0007) stack.pop();
                    InterfaceC2225 interfaceC2225M353 = c0007.m353();
                    if (c0007.f507) {
                        StringBuilder sbM2789 = AbstractC1194.m2788(string2, "\nCalled from method: ");
                        sbM2789.append(c0007.f493);
                        string2 = sbM2789.toString();
                        if (interfaceC2225M353 != null) {
                            StringBuilder sbM27810 = AbstractC1194.m2788(string2, " : at Line: ");
                            sbM27810.append(interfaceC2225M353.getLineNumber());
                            sbM27810.append(" : in file: ");
                            sbM27810.append(interfaceC2225M353.mo1450());
                            sbM27810.append(" : ");
                            sbM27810.append(interfaceC2225M353.getText());
                            string2 = sbM27810.toString();
                        }
                    }
                } catch (EmptyStackException unused) {
                    throw new C1669("pop on empty CallStack");
                }
            }
            sbM2788.append(string2);
            string = sbM2788.toString();
        }
        return AbstractC2784.m4752(new StringBuilder(), this.f4453, string);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2864(String str) {
        if (str == null) {
            return;
        }
        if (this.f4453 == null) {
            this.f4453 = str;
            return;
        }
        StringBuilder sbM2788 = AbstractC1194.m2788(str, " : ");
        sbM2788.append(this.f4453);
        this.f4453 = sbM2788.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1229 mo2865(String str) {
        m2864(str);
        return this;
    }

    public C1229(String str, InterfaceC2225 interfaceC2225, C0550 c0550) {
        C0550 c0551;
        this.f4453 = str;
        this.f4452 = interfaceC2225;
        if (c0550 == null) {
            c0551 = null;
        } else {
            c0551 = new C0550();
            c0551.f2265.addAll(c0550.f2265);
        }
        this.f4454 = c0551;
    }
}
