package bsh;

import java.util.ListIterator;
import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface Node extends ListIterator<Node> {
    public static final Node JAVACODE = new C0013(-1);

    void dump(String str);

    Object eval(C0527 c0527, RunnableC0008 runnableC0008);

    int getId();

    int getLineNumber();

    String getSourceFile();

    String getText();

    void jjtAddChild(Node node, int i);

    void jjtClose();

    Node jjtGetChild(int i);

    Node[] jjtGetChildren();

    int jjtGetNumChildren();

    Node jjtGetParent();

    void jjtOpen();

    void jjtSetParent(Node node);

    void setSourceFile(String str);

    String toString(String str);
}
