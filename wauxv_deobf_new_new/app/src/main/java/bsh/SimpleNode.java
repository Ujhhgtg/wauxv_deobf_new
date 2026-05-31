package bsh;

import java.io.Serializable;
import java.util.NoSuchElementException;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1684;
import p000.InterfaceC2376;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements Node, Serializable {
    private static final long serialVersionUID = 1;
    protected Node[] children;
    transient Token firstToken;
    protected int id;
    transient Token lastToken;
    protected Node parent;
    protected transient C0015 parser;
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
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        throw new C1684("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    @Override // bsh.Node
    public int getId() {
        return this.id;
    }

    @Override // bsh.Node
    public int getLineNumber() {
        Token token = this.firstToken;
        if (token != null) {
            return token.beginLine;
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
        Token token;
        Token token2 = this.firstToken;
        if (token2 == null) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(token2.image);
            if (token2 == this.lastToken || token2.image.equals("{") || token2.image.equals(";") || (token = token2.next) == null) {
                break;
            }
            if (token.beginLine > token2.endLine || token.beginColumn > token2.endColumn + 1) {
                sb.append(" ");
            }
            token2 = token;
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
        StringBuilder sbM4787 = AbstractC2844.m4787(str);
        sbM4787.append(toString());
        return sbM4787.toString();
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
        return InterfaceC2376.f7634[this.id];
    }

    @Override // bsh.Node
    public void jjtClose() {
    }

    @Override // bsh.Node
    public void jjtOpen() {
    }
}
