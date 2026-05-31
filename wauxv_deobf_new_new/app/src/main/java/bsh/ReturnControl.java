package bsh;

import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ReturnControl implements InterfaceC2374 {
    public int kind;
    public String label;
    public Node returnPoint;
    public Object value;

    public ReturnControl(int i, Object obj, Node node) {
        this.label = null;
        Primitive primitive = Primitive.TRUE;
        this.kind = i;
        this.value = obj;
        this.returnPoint = node;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ReturnControl: ");
        int i = this.kind;
        if (i == 13) {
            str = "BREAK ";
        } else if (i == 47) {
            str = "RETURN ";
        } else if (i == 20) {
            str = "CONTINUE ";
        } else {
            str = "DUNNO?? " + this.kind;
        }
        sb.append(str);
        sb.append(this.label);
        sb.append(": from: ");
        sb.append(this.returnPoint);
        return sb.toString();
    }

    public ReturnControl(int i, String str, Node node) {
        this.label = null;
        this.value = Primitive.VOID;
        this.kind = i;
        this.label = str;
        this.returnPoint = node;
    }
}
