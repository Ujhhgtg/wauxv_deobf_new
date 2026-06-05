package bsh;

import java.io.Serializable;
import java.util.NoSuchElementException;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1727Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.InterfaceC1409feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements Node, Serializable {
    private static final long serialVersionUID = 1;
    protected Node[] children;
    transient C1727Ujhhgtgfeyxiexzf firstToken;
    protected int id;
    transient C1727Ujhhgtgfeyxiexzf lastToken;
    protected Node parent;
    protected transient C0032Ujhhgtgfeyxiexzf parser;
    private String sourceFile;
    private int cursor = 0;
    private int lastRet = -1;

    public SimpleNode(int i) {
        this.id = i;
    }

    @Override // bsh.Node
    public void dump(String str) {
        System.out.println(toString(str));
        if (this.children == null) {
            return;
        }
        int i = 0;
        while (true) {
            Node[] nodeArr = this.children;
            if (i >= nodeArr.length) {
                return;
            }
            Node node = nodeArr[i];
            if (node != null) {
                node.dump(str + " ");
            }
            i++;
        }
    }

    @Override // bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        throw new C0712Ujhhgtgfeyxiexzf("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    @Override // bsh.Node
    public int getId() {
        return this.id;
    }

    @Override // bsh.Node
    public int getLineNumber() {
        C1727Ujhhgtgfeyxiexzf c1727Ujhhgtgfeyxiexzf = this.firstToken;
        if (c1727Ujhhgtgfeyxiexzf != null) {
            return c1727Ujhhgtgfeyxiexzf.f5796Ujhhgtgfeyxiexzf;
        }
        return -1;
    }

    @Override // bsh.Node
    public String getSourceFile() {
        String str = this.sourceFile;
        if (str != null) {
            return str;
        }
        Node node = this.parent;
        return node != null ? node.getSourceFile() : "<unknown file>";
    }

    @Override // bsh.Node
    public String getText() {
        C1727Ujhhgtgfeyxiexzf c1727Ujhhgtgfeyxiexzf;
        C1727Ujhhgtgfeyxiexzf c1727Ujhhgtgfeyxiexzf2 = this.firstToken;
        if (c1727Ujhhgtgfeyxiexzf2 == null) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(c1727Ujhhgtgfeyxiexzf2.f5800Ujhhgtgfeyxiexzf);
            if (c1727Ujhhgtgfeyxiexzf2 == this.lastToken || c1727Ujhhgtgfeyxiexzf2.f5800Ujhhgtgfeyxiexzf.equals("{") || c1727Ujhhgtgfeyxiexzf2.f5800Ujhhgtgfeyxiexzf.equals(";") || (c1727Ujhhgtgfeyxiexzf = c1727Ujhhgtgfeyxiexzf2.f5801Ujhhgtgfeyxiexzf) == null) {
                break;
            }
            if (c1727Ujhhgtgfeyxiexzf.f5796Ujhhgtgfeyxiexzf > c1727Ujhhgtgfeyxiexzf2.f5798Ujhhgtgfeyxiexzf || c1727Ujhhgtgfeyxiexzf.f5797Ujhhgtgfeyxiexzf > c1727Ujhhgtgfeyxiexzf2.f5799Ujhhgtgfeyxiexzf + 1) {
                sb.append(" ");
            }
            c1727Ujhhgtgfeyxiexzf2 = c1727Ujhhgtgfeyxiexzf;
        }
        return sb.toString();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.cursor < jjtGetNumChildren();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.cursor > 0;
    }

    @Override // bsh.Node
    public void jjtAddChild(Node node, int i) {
        Node[] nodeArr = this.children;
        if (nodeArr == null) {
            this.children = new Node[i + 1];
        } else if (i >= nodeArr.length) {
            Node[] nodeArr2 = new Node[i + 1];
            System.arraycopy(nodeArr, 0, nodeArr2, 0, nodeArr.length);
            this.children = nodeArr2;
        }
        this.children[i] = node;
    }

    @Override // bsh.Node
    public Node jjtGetChild(int i) {
        return this.children[i];
    }

    @Override // bsh.Node
    public Node[] jjtGetChildren() {
        if (this.children == null) {
            this.children = new Node[0];
        }
        return this.children;
    }

    @Override // bsh.Node
    public int jjtGetNumChildren() {
        return jjtGetChildren().length;
    }

    @Override // bsh.Node
    public Node jjtGetParent() {
        return this.parent;
    }

    @Override // bsh.Node
    public void jjtSetParent(Node node) {
        this.parent = node;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.cursor;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.cursor - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.lastRet;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.cursor = i;
        Node[] nodeArr = this.children;
        int length = nodeArr.length - 1;
        Node[] nodeArr2 = new Node[length];
        System.arraycopy(nodeArr, 0, nodeArr2, 0, i);
        Node[] nodeArr3 = this.children;
        int i2 = this.cursor;
        System.arraycopy(nodeArr3, i2 + 1, nodeArr2, i2, length - i2);
        this.children = nodeArr2;
        this.lastRet = -1;
    }

    @Override // bsh.Node
    public void setSourceFile(String str) {
        this.sourceFile = str;
    }

    @Override // bsh.Node
    public String toString(String str) {
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
        sbM2707Ujhhgtgfeyxiexzf.append(toString());
        return sbM2707Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public void add(Node node) {
        int iJjtGetNumChildren = jjtGetNumChildren() + 1;
        Node[] nodeArr = new Node[iJjtGetNumChildren];
        System.arraycopy(this.children, 0, nodeArr, 0, this.cursor);
        Node[] nodeArr2 = this.children;
        int i = this.cursor;
        System.arraycopy(nodeArr2, i, nodeArr, i + 1, (iJjtGetNumChildren - i) - 1);
        this.children = nodeArr;
        int i2 = this.cursor;
        this.cursor = i2 + 1;
        nodeArr[i2] = node;
        this.lastRet = -1;
        node.jjtSetParent(this);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Node next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Node[] nodeArr = this.children;
        int i = this.cursor;
        this.cursor = i + 1;
        this.lastRet = i;
        return nodeArr[i];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public Node previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Node[] nodeArr = this.children;
        int i = this.cursor - 1;
        this.cursor = i;
        this.lastRet = i;
        return nodeArr[i];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public void set(Node node) {
        int i = this.lastRet;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.children[i] = node;
    }

    public String toString() {
        return InterfaceC1409feyxiexzfUjhhgtg.f4947Ujhhgtgfeyxiexzf[this.id];
    }

    @Override // bsh.Node
    public void jjtClose() {
    }

    @Override // bsh.Node
    public void jjtOpen() {
    }
}
