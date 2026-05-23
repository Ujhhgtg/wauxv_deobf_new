package p000;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2802 implements InterfaceC1011 {

    public final char f8933;

    public int f8934 = 0;

    public final LinkedList f8935 = new LinkedList();

    public C2802(char c) {
        this.f8933 = c;
    }

    @Override // p000.InterfaceC1011
    public final void mo1396(C2901 c2901, C2901 c2902, int i) {
        LinkedList<InterfaceC1011> linkedList = this.f8935;
        for (InterfaceC1011 interfaceC1011 : linkedList) {
            if (interfaceC1011.mo1398() <= i) {
                interfaceC1011.mo1396(c2901, c2902, i);
            }
        }
        interfaceC1011 = (InterfaceC1011) linkedList.getFirst();
        interfaceC1011.mo1396(c2901, c2902, i);
    }

    @Override // p000.InterfaceC1011
    public final char mo1397() {
        return this.f8933;
    }

    @Override // p000.InterfaceC1011
    public final int mo1398() {
        return this.f8934;
    }

    @Override // p000.InterfaceC1011
    public final int mo1399(C1010 c1010, C1010 c1011) {
        int i = c1010.f3691;
        LinkedList<InterfaceC1011> linkedList = this.f8935;
        for (InterfaceC1011 interfaceC1011 : linkedList) {
            if (interfaceC1011.mo1398() <= i) {
                return interfaceC1011.mo1399(c1010, c1011);
            }
        }
        interfaceC1011 = (InterfaceC1011) linkedList.getFirst();
        return interfaceC1011.mo1399(c1010, c1011);
    }

    @Override // p000.InterfaceC1011
    public final char mo1400() {
        return this.f8933;
    }

    public final void m4780(InterfaceC1011 interfaceC1011) {
        int iMo1398 = interfaceC1011.mo1398();
        LinkedList linkedList = this.f8935;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iMo1399 = ((InterfaceC1011) listIterator.next()).mo1398();
            if (iMo1398 > iMo1399) {
                listIterator.previous();
                listIterator.add(interfaceC1011);
                return;
            } else if (iMo1398 == iMo1399) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f8933 + "' and minimum length " + iMo1398);
            }
        }
        linkedList.add(interfaceC1011);
        this.f8934 = iMo1398;
    }
}
