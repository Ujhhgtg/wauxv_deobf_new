package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᤞᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0816 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0815 f3193;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f3195 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final LinkedHashMap f3196 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f3197 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public String f3198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f3200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f3201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public String f3202;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C0807 f3203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public InterfaceC1429 f3204;

    public C0816(C0815 c0815) {
        this.f3193 = c0815;
        String[] strArr = AbstractC1574.f5469;
        this.f3198 = "";
        this.f3199 = R.drawable.ic_contact_confirm_24dp;
        this.f3200 = "取消";
        this.f3201 = R.drawable.ic_contact_cancel_24dp;
        this.f3202 = "确定";
        this.f3203 = new C0807(6);
        this.f3204 = new C0184(2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2367(String str, ArrayList arrayList) {
        this.f3196.put(str, arrayList);
        this.f3197.addAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList m2368() {
        ArrayList<C0801> arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (this.f3194) {
            arrayList = this.f3195;
            if (arrayList.isEmpty()) {
                arrayList = this.f3197;
            }
        } else {
            arrayList = this.f3197;
        }
        for (C0801 c0801 : arrayList) {
            if (c0801.f3163) {
                arrayList2.add(c0801);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List m2369(String str) {
        if (!AbstractC2207.m4087(str, "全部")) {
            List list = (List) this.f3196.get(str);
            return list == null ? C1189.f4329 : list;
        }
        if (this.f3194) {
            ArrayList arrayList = this.f3195;
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return this.f3197;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2370(ArrayList arrayList) {
        this.f3194 = true;
        this.f3195.addAll(arrayList);
    }
}
