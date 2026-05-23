package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2772 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2772 f8869;

    public static final String f8870;

    public static final String f8871;

    public static final String f8872;

    public static final C2764 f8873;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8869 = new C2772("SnsUploadOriginalPhoto");
        f8870 = "朋友圈";
        f8871 = "朋友圈上传原图";
        f8872 = "上传时不压缩图片，过大可能上传失败";
        f8873 = new C2764(3);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2769.f8863, dexKitBridge, new C2764(4));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2769.f8863));
        C2772 c2772 = f8869;
        C3689 c3689M4172 = C2309.createHook(c2772, listSingletonList);
        c2772.hookBefore(c3689M4172, new C2764(5));
        c2772.m3262(c3689M4172, new C2764(6));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8872;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8871;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8870;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f8873;
    }
}
