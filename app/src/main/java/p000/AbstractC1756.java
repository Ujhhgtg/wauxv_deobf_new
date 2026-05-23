package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1756 implements InterfaceC1437, Serializable {
    private final int arity;

    public AbstractC1756(int i) {
        this.arity = i;
    }

    @Override // p000.InterfaceC1437
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        
        return C2520.m4529(this);
    }
}
