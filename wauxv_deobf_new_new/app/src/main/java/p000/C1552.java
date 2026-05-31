package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᲀᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1552 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1552 f5417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f5418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean f5421;

    static {
        String[] strArr = AbstractC1471.f5234;
        f5417 = new C1552("HideDividerLineHook");
        f5418 = "净化";
        f5419 = "隐藏分割线";
        f5420 = "隐藏主界面聊天消息列表的灰色分割线";
        f5421 = true;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1550.f5415, dexKitBridge, new C1493(12));
        if (AbstractC0972.m2596(EnumC3737.f11690) || AbstractC0972.m2597(EnumC3734.f11658)) {
            AbstractC0972.m2592(C1551.f5416, dexKitBridge, new C1493(14));
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C1550.f5415));
        C1552 c1552 = f5417;
        C3752 c3752M4301 = C2342.m4301(c1552, listSingletonList);
        c1552.m3443(c3752M4301, new C1493(17));
        c3752M4301.m5360();
        if (AbstractC0972.m2596(EnumC3737.f11690) || AbstractC0972.m2597(EnumC3734.f11658)) {
            C3752 c3752M4302 = C2342.m4301(c1552, Collections.singletonList(AbstractC0972.m2610(C1551.f5416)));
            c1552.m3443(c3752M4302, new C1493(20));
            c3752M4302.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f5420;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f5419;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f5418;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f5421;
    }
}
