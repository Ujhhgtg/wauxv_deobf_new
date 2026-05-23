package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 extends AbstractC0843 {

    public C0977 f5835;

    public C0408 f5836;

    public LinkedHashMap f5837;

    public String f5838;

    public int f5839;

    public /* synthetic */ Object f5840;

    public final /* synthetic */ C0408 f5841;

    public int f5842;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734(C0408 c0408, AbstractC0370 abstractC0370) {
        super(abstractC0370);
        this.f5841 = c0408;
    }

    @Override // p000.AbstractC0370
    public final Object mo1198(Object obj) {
        this.f5840 = obj;
        this.f5842 |= -2147483648;
        return C0408.m1601(this.f5841, null, this);
    }
}
