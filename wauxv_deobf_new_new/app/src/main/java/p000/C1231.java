package p000;

import bsh.C0012;
import bsh.Node;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1231 extends Exception {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Node f4450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public String f4451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0527 f4452;

    public C1231(String str, Node node, C0527 c0527, Throwable th) {
        this(str, node, c0527);
        initCause(th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        if (this.f4450 != null) {
            string = "\n\tat " + this.f4450.getText() + " (" + this.f4450.getSourceFile() + ":" + this.f4450.getLineNumber() + ")";
        } else {
            string = ": <at unknown location>";
        }
        C0527 c0527 = this.f4452;
        if (c0527 != null) {
            StringBuilder sbM4787 = AbstractC2844.m4787(string);
            Stack stack = new Stack();
            stack.addAll(c0527.f2221);
            String string2 = "";
            while (stack.size() > 0) {
                try {
                    C0012 c0012 = (C0012) stack.pop();
                    Node nodeM373 = c0012.m373();
                    if (c0012.f534) {
                        StringBuilder sbM2803 = AbstractC1095.m2803(string2, "\nCalled from method: ");
                        sbM2803.append(c0012.f520);
                        string2 = sbM2803.toString();
                        if (nodeM373 != null) {
                            StringBuilder sbM2804 = AbstractC1095.m2803(string2, "\n\tat ");
                            sbM2804.append(nodeM373.getText());
                            sbM2804.append(" (");
                            sbM2804.append(nodeM373.getSourceFile());
                            sbM2804.append(":");
                            sbM2804.append(nodeM373.getLineNumber());
                            sbM2804.append(")");
                            string2 = sbM2804.toString();
                        }
                    }
                } catch (EmptyStackException unused) {
                    throw new C1684("pop on empty CallStack");
                }
            }
            sbM4787.append(string2);
            string = sbM4787.toString();
        }
        return AbstractC2844.m4786(new StringBuilder(), this.f4451, string);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2986(String str) {
        if (str == null) {
            return;
        }
        if (this.f4451 == null) {
            this.f4451 = str;
            return;
        }
        StringBuilder sbM2803 = AbstractC1095.m2803(str, " : ");
        sbM2803.append(this.f4451);
        this.f4451 = sbM2803.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1231 mo2987(String str) {
        m2986(str);
        return this;
    }

    public C1231(String str, Node node, C0527 c0527) {
        C0527 c0528;
        this.f4451 = str;
        this.f4450 = node;
        if (c0527 == null) {
            c0528 = null;
        } else {
            c0528 = new C0527();
            c0528.f2221.addAll(c0527.f2221);
        }
        this.f4452 = c0528;
    }
}
