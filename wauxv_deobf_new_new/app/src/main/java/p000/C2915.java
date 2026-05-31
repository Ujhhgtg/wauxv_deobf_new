package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2915 implements InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile boolean f9293 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ConcurrentHashMap f9294 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final LinkedBlockingQueue f9295 = new LinkedBlockingQueue();

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final synchronized InterfaceC1881 mo3502(String str) {
        C2914 c2914;
        c2914 = (C2914) this.f9294.get(str);
        if (c2914 == null) {
            c2914 = new C2914(str, this.f9295, this.f9293);
            this.f9294.put(str, c2914);
        }
        return c2914;
    }
}
