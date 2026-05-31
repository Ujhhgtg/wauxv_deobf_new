package p000;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0459 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2074;

    public /* synthetic */ C0459(ArrayList arrayList, int i) {
        this.f2073 = i;
        this.f2074 = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2073) {
            case 0:
                C0468 c0468 = (C0468) obj;
                c0468.getClass();
                ArrayList<URL> arrayList = new ArrayList();
                c0468.f2090.forEach(new C0459(arrayList, 0));
                arrayList.addAll(c0468.f2089);
                for (URL url : arrayList) {
                    ArrayList arrayList2 = this.f2074;
                    if (!arrayList2.contains(url)) {
                        arrayList2.add(url);
                    }
                }
                break;
            default:
                this.f2074.add((Constructor) obj);
                break;
        }
    }
}
