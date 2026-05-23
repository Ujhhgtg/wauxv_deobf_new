package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1209 {

    public final ArrayList f4348;

    public C1209(int i) {
        switch (i) {
            case 1:
                this.f4348 = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.f4348 = new ArrayList();
                break;
            case 3:
                this.f4348 = new ArrayList();
                break;
            case 4:
                this.f4348 = new ArrayList();
                break;
            default:
                this.f4348 = new ArrayList();
                break;
        }
    }

    public synchronized InterfaceC2574 m2810(Class cls) {
        int size = this.f4348.size();
        for (int i = 0; i < size; i++) {
            C2575 c2575 = (C2575) this.f4348.get(i);
            if (c2575.f8169.isAssignableFrom(cls)) {
                return c2575.f8170;
            }
        }
        return null;
    }

    public List m2811() {
        ArrayList arrayList;
        if (this.f4348.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4348) {
            arrayList = new ArrayList(this.f4348);
        }
        return arrayList;
    }

    public synchronized ArrayList m2812(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C3423 c3423 : this.f4348) {
            if ((c3423.f10795.isAssignableFrom(cls) && cls2.isAssignableFrom(c3423.f10796)) && !arrayList.contains(c3423.f10796)) {
                arrayList.add(c3423.f10796);
            }
        }
        return arrayList;
    }
}
