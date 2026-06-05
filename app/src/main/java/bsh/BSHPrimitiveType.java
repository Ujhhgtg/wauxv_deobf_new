package bsh;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimitiveType extends SimpleNode {
    private static final long serialVersionUID = 1;
    public Class<?> type;

    public BSHPrimitiveType(int i) {
        super(i);
    }

    public Class<?> getType() {
        return this.type;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.type;
    }
}
