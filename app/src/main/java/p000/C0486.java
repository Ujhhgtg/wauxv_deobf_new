package p000;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0486 implements Consumer {

    public final /* synthetic */ int f2102;

    public final /* synthetic */ ArrayList f2103;

    public /* synthetic */ C0486(ArrayList arrayList, int i) {
        this.f2102 = i;
        this.f2103 = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2102) {
            case 0:
                C0492 c0492 = (C0492) obj;
                
                ArrayList<URL> arrayList = new ArrayList();
                c0492.f2117.forEach(new C0486(arrayList, 0));
                arrayList.addAll(c0492.f2116);
                for (URL url : arrayList) {
                    ArrayList arrayList2 = this.f2103;
                    if (!arrayList2.contains(url)) {
                        arrayList2.add(url);
                    }
                }
                break;
            default:
                this.f2103.add((Constructor) obj);
                break;
        }
    }
}
