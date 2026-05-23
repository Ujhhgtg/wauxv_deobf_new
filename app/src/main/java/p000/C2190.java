package p000;

import java.lang.reflect.Constructor;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2190 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2190 f7151 = new C2190();

    public static Object m3962(String transactionId, String transferId, String type, String payerUsername, int invalidTime) throws NoSuchMethodException {
        String[] strArr = AbstractC1574.f5469;
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String str8 = "";
        Constructor constructorM3314 = AbstractC1574.dexToCtor(C2189.f7150);
        switch (constructorM3314.getParameterCount()) {
            case 10:
                return constructorM3314.newInstance(transactionId, transferId, 0, type, payerUsername, Integer.valueOf(invalidTime), "", null, 1, null);
            case 11:
            default:
                throw new NoSuchMethodException("With " + constructorM3314.getParameterCount() + " parameters not supported");
            case 12 /* 12 */:
                return constructorM3314.newInstance(transactionId, transferId, 0, type, payerUsername, Integer.valueOf(invalidTime), "", null, 1, null, 0L, "");
            case 13:
                return constructorM3314.newInstance(transactionId, transferId, 0, type, payerUsername, Integer.valueOf(invalidTime), "", null, 1, null, 0L, "", "");
            case 14 /* 14 */:
                return constructorM3314.newInstance(transactionId, transferId, 0, type, payerUsername, Integer.valueOf(invalidTime), "", null, 1, "", null, 0L, "", "");
        }
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2189.f7150, dexKitBridge, new C2174(21));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
