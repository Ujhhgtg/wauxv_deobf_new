package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0979feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0979feyxiexzfUjhhgtg f3874Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f3875Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f3876Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f3877Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f3874Ujhhgtgfeyxiexzf = new C0979feyxiexzfUjhhgtg("RemoveVoipLimitHook");
        f3875Ujhhgtgfeyxiexzf = "限制";
        f3876Ujhhgtgfeyxiexzf = "移除通话限制";
        f3877Ujhhgtgfeyxiexzf = "将通话中无法使用部分功能的限制移除";
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        C0982feyxiexzfUjhhgtg c0982feyxiexzfUjhhgtg = C0982feyxiexzfUjhhgtg.f3881Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(c0982feyxiexzfUjhhgtg, dexKitBridge, new C0999feyxiexzfUjhhgtg(0, "com.tencent.mm.plugin.multitalk.model", "Lcom/tencent/mm/autogen/events/MultiTalkActionEvent;"));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0983feyxiexzfUjhhgtg.f3882Ujhhgtgfeyxiexzf, dexKitBridge, new C0999feyxiexzfUjhhgtg(0, "com.tencent.mm.plugin.voip.model", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1001feyxiexzfUjhhgtg.f3919Ujhhgtgfeyxiexzf, dexKitBridge, new C0999feyxiexzfUjhhgtg(0, "com.tencent.mm.plugin.ipcall", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1000feyxiexzfUjhhgtg.f3918Ujhhgtgfeyxiexzf, dexKitBridge, new C0999feyxiexzfUjhhgtg(0, (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7376Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7353Ujhhgtgfeyxiexzf)) ? "com.tencent.mm.voipmp.helper" : "com.tencent.mm.plugin_flutter_ilinkvoip.helper", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        Iterator it = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(C0982feyxiexzfUjhhgtg.f3881Ujhhgtgfeyxiexzf, C0983feyxiexzfUjhhgtg.f3882Ujhhgtgfeyxiexzf, C1001feyxiexzfUjhhgtg.f3919Ujhhgtgfeyxiexzf, C1000feyxiexzfUjhhgtg.f3918Ujhhgtgfeyxiexzf).iterator();
        while (it.hasNext()) {
            List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg((AbstractC3266feyxiexzfUjhhgtg) it.next()));
            C0979feyxiexzfUjhhgtg c0979feyxiexzfUjhhgtg = f3874Ujhhgtgfeyxiexzf;
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c0979feyxiexzfUjhhgtg, listSingletonList);
            c0979feyxiexzfUjhhgtg.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C0780feyxiexzfUjhhgtg(21));
            c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f3877Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f3876Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f3875Ujhhgtgfeyxiexzf;
    }
}
