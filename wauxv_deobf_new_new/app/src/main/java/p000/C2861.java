package p000;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᲇᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2861 implements InterfaceC1014 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final char f9094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f9095 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final LinkedList f9096 = new LinkedList();

    public C2861(char c) {
        this.f9094 = c;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1542(C2960 c2960, C2960 c2961, int i) {
        LinkedList<InterfaceC1014> linkedList = this.f9096;
        for (InterfaceC1014 interfaceC1014 : linkedList) {
            if (interfaceC1014.mo1544() <= i) {
                interfaceC1014.mo1542(c2960, c2961, i);
            }
        }
        interfaceC1014 = (InterfaceC1014) linkedList.getFirst();
        interfaceC1014.mo1542(c2960, c2961, i);
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final char mo1543() {
        return this.f9094;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1544() {
        return this.f9095;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo1545(C1013 c1013, C1013 c1014) {
        int i = c1013.f3698;
        LinkedList<InterfaceC1014> linkedList = this.f9096;
        for (InterfaceC1014 interfaceC1014 : linkedList) {
            if (interfaceC1014.mo1544() <= i) {
                return interfaceC1014.mo1545(c1013, c1014);
            }
        }
        interfaceC1014 = (InterfaceC1014) linkedList.getFirst();
        return interfaceC1014.mo1545(c1013, c1014);
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final char mo1546() {
        return this.f9094;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4813(InterfaceC1014 interfaceC1014) {
        int iMo1544 = interfaceC1014.mo1544();
        LinkedList linkedList = this.f9096;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iMo1545 = ((InterfaceC1014) listIterator.next()).mo1544();
            if (iMo1544 > iMo1545) {
                listIterator.previous();
                listIterator.add(interfaceC1014);
                return;
            } else if (iMo1544 == iMo1545) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f9094 + "' and minimum length " + iMo1544);
            }
        }
        linkedList.add(interfaceC1014);
        this.f9095 = iMo1544;
    }
}
