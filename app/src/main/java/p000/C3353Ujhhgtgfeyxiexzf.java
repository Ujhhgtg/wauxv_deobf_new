package p000;

import bsh.C0029Ujhhgtgfeyxiexzf;
import bsh.Node;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3353Ujhhgtgfeyxiexzf extends Exception {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Node f10469Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public String f10470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2637feyxiexzfUjhhgtg f10471Ujhhgtgfeyxiexzf;

    public C3353Ujhhgtgfeyxiexzf(String str, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Throwable th) {
        this(str, node, c2637feyxiexzfUjhhgtg);
        initCause(th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        if (this.f10469Ujhhgtgfeyxiexzf != null) {
            string = "\n\tat " + this.f10469Ujhhgtgfeyxiexzf.getText() + " (" + this.f10469Ujhhgtgfeyxiexzf.getSourceFile() + ":" + this.f10469Ujhhgtgfeyxiexzf.getLineNumber() + ")";
        } else {
            string = ": <at unknown location>";
        }
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = this.f10471Ujhhgtgfeyxiexzf;
        if (c2637feyxiexzfUjhhgtg != null) {
            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(string);
            Stack stack = new Stack();
            stack.addAll(c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf);
            String string2 = "";
            while (stack.size() > 0) {
                try {
                    C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = (C0029Ujhhgtgfeyxiexzf) stack.pop();
                    Node nodeM372Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m372Ujhhgtgfeyxiexzf();
                    if (c0029Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf) {
                        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(string2, "\nCalled from method: ");
                        sbM4805Ujhhgtgfeyxiexzf.append(c0029Ujhhgtgfeyxiexzf.f534Ujhhgtgfeyxiexzf);
                        string2 = sbM4805Ujhhgtgfeyxiexzf.toString();
                        if (nodeM372Ujhhgtgfeyxiexzf != null) {
                            StringBuilder sbM4805Ujhhgtgfeyxiexzf2 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(string2, "\n\tat ");
                            sbM4805Ujhhgtgfeyxiexzf2.append(nodeM372Ujhhgtgfeyxiexzf.getText());
                            sbM4805Ujhhgtgfeyxiexzf2.append(" (");
                            sbM4805Ujhhgtgfeyxiexzf2.append(nodeM372Ujhhgtgfeyxiexzf.getSourceFile());
                            sbM4805Ujhhgtgfeyxiexzf2.append(":");
                            sbM4805Ujhhgtgfeyxiexzf2.append(nodeM372Ujhhgtgfeyxiexzf.getLineNumber());
                            sbM4805Ujhhgtgfeyxiexzf2.append(")");
                            string2 = sbM4805Ujhhgtgfeyxiexzf2.toString();
                        }
                    }
                } catch (EmptyStackException unused) {
                    throw new C0712Ujhhgtgfeyxiexzf("pop on empty CallStack");
                }
            }
            sbM2707Ujhhgtgfeyxiexzf.append(string2);
            string = sbM2707Ujhhgtgfeyxiexzf.toString();
        }
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.f10470Ujhhgtgfeyxiexzf, string);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4858Ujhhgtgfeyxiexzf(String str) {
        if (str == null) {
            return;
        }
        if (this.f10470Ujhhgtgfeyxiexzf == null) {
            this.f10470Ujhhgtgfeyxiexzf = str;
            return;
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, " : ");
        sbM4805Ujhhgtgfeyxiexzf.append(this.f10470Ujhhgtgfeyxiexzf);
        this.f10470Ujhhgtgfeyxiexzf = sbM4805Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3353Ujhhgtgfeyxiexzf mo4859Ujhhgtgfeyxiexzf(String str) {
        m4858Ujhhgtgfeyxiexzf(str);
        return this;
    }

    public C3353Ujhhgtgfeyxiexzf(String str, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2;
        this.f10470Ujhhgtgfeyxiexzf = str;
        this.f10469Ujhhgtgfeyxiexzf = node;
        if (c2637feyxiexzfUjhhgtg == null) {
            c2637feyxiexzfUjhhgtg2 = null;
        } else {
            c2637feyxiexzfUjhhgtg2 = new C2637feyxiexzfUjhhgtg();
            c2637feyxiexzfUjhhgtg2.f8478Ujhhgtgfeyxiexzf.addAll(c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf);
        }
        this.f10471Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg2;
    }
}
