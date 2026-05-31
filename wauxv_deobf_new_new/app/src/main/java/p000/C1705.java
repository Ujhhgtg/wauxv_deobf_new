package p000;

import bsh.Node;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲈᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1705 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ArrayList f5785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ArrayList f5786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f5789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3590() {
        while (this.f5787 > this.f5788) {
            m3594();
        }
        ArrayList arrayList = this.f5786;
        this.f5788 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3591(Node node) {
        ArrayList arrayList = this.f5786;
        int i = this.f5787 - this.f5788;
        this.f5788 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                node.jjtClose();
                this.f5785.add(node);
                this.f5787++;
                this.f5789 = true;
                return;
            }
            Node nodeM3594 = m3594();
            nodeM3594.jjtSetParent(node);
            node.jjtAddChild(nodeM3594, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3592(Node node, int i) {
        ArrayList arrayList = this.f5786;
        this.f5788 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                node.jjtClose();
                this.f5785.add(node);
                this.f5787++;
                this.f5789 = true;
                return;
            }
            Node nodeM3594 = m3594();
            nodeM3594.jjtSetParent(node);
            node.jjtAddChild(nodeM3594, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3593(Node node) {
        this.f5786.add(Integer.valueOf(this.f5788));
        this.f5788 = this.f5787;
        node.jjtOpen();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Node m3594() {
        int i = this.f5787 - 1;
        this.f5787 = i;
        if (i < this.f5788) {
            ArrayList arrayList = this.f5786;
            this.f5788 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        }
        ArrayList arrayList2 = this.f5785;
        return (Node) arrayList2.remove(arrayList2.size() - 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3595() {
        this.f5785.clear();
        this.f5786.clear();
        this.f5787 = 0;
        this.f5788 = 0;
    }
}
