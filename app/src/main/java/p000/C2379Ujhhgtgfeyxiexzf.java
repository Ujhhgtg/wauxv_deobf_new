package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2379Ujhhgtgfeyxiexzf extends AbstractC2846Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7742Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final AbstractC0091Ujhhgtgfeyxiexzf f7743Ujhhgtgfeyxiexzf;

    public C2379Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf) {
        super(interfaceC0146Ujhhgtgfeyxiexzf);
        this.f7743Ujhhgtgfeyxiexzf = new C2382Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf(), 1);
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                break;
        }
        return (C2382Ujhhgtgfeyxiexzf) this.f7743Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final Object mo1108Ujhhgtgfeyxiexzf() {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo1109Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final Iterator mo1110Ujhhgtgfeyxiexzf(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
                return arrayList == null ? new ArrayList(list) : arrayList;
            default:
                Set set = (Set) obj;
                LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
                return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
        }
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final Object mo1114Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final void mo2245Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        switch (this.f7742Ujhhgtgfeyxiexzf) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }

    public C2379Ujhhgtgfeyxiexzf(C0204Ujhhgtgfeyxiexzf c0204Ujhhgtgfeyxiexzf) {
        super(c0204Ujhhgtgfeyxiexzf);
        this.f7743Ujhhgtgfeyxiexzf = new C2382Ujhhgtgfeyxiexzf((C1103feyxiexzfUjhhgtg) c0204Ujhhgtgfeyxiexzf.f1457Ujhhgtgfeyxiexzf, 2);
    }
}
