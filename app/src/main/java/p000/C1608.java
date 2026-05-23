package p000;

import android.content.Context;
import android.content.Intent;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1608 implements InterfaceC1425 {

    public final /* synthetic */ int f5479;

    public /* synthetic */ C1608(int i) {
        this.f5479 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f5479) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                ((C0705) obj).m2127("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return Unit.INSTANCE;
            case 1:
                C0705 c0705 = (C0705) obj;
                
                C1317 c1317 = new C1317(4);
                c1317.m3041(AbstractC1574.dexToClass(C1611.f5482));
                c1317.m3041(AbstractC1574.dexToClass(C1609.f5480));
                c0705.f2686 = c1317;
                return Unit.INSTANCE;
            case 2:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return Unit.INSTANCE;
            case 3:
                ((C1020) obj).declaringClassMatcher = new C1608(4);
                return Unit.INSTANCE;
            case 4:
                C1332 c1332 = (C1332) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.modelavatar");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s");
                c1332.f4791 = c0706;
                return Unit.INSTANCE;
            case 5:
                ((C1020) obj).declaringClassMatcher = new C1608(6);
                return Unit.INSTANCE;
            case 6:
                ((C1332) obj).m3050(new C1608(7));
                return Unit.INSTANCE;
            case 7:
                String[] strArr4 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return Unit.INSTANCE;
            case 8:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C1608(9);
                c1020.thisMethodMatcher = new C1608(10);
                return Unit.INSTANCE;
            case 9:
                ((C1332) obj).m3050(new C1608(11));
                return Unit.INSTANCE;
            case 10:
                ((C1333) obj).m3052(new C1608(12));
                return Unit.INSTANCE;
            case 11:
                String[] strArr5 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ImgUpload.MsgImgFeatureService", "taskListener", "params");
                return Unit.INSTANCE;
            case 12 /* 12 */:
                C1981 c1981 = (C1981) obj;
                c1981.m3821(1);
                c1981.m3827("params");
                return Unit.INSTANCE;
            case 13:
                C1020 c1021 = (C1020) obj;
                c1021.declaringClassMatcher = new C1608(14);
                c1021.thisMethodMatcher = new C1608(15);
                return Unit.INSTANCE;
            case 14 /* 14 */:
                C1332 c1333 = (C1332) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1333.m3051("com.tencent.mm.pluginsdk.model");
                C0705 c0707 = new C0705(4);
                c0707.m2127("MicroMsg.GetVideoMetadata", "get video file name, dataString ");
                c1333.f4791 = c0707;
                return Unit.INSTANCE;
            case 15:
                ((C1333) obj).m3052(new C1608(16));
                return Unit.INSTANCE;
            case 16:
                C1981 c1982 = (C1981) obj;
                Class clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Context.class));
                Class cls = clsM2183 == null ? Context.class : clsM2183;
                Class clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(List.class));
                Class cls2 = clsM2184 == null ? List.class : clsM2184;
                Class clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(Intent.class));
                Class cls3 = clsM2185 == null ? Intent.class : clsM2185;
                Class clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls4 = clsM2186 == null ? String.class : clsM2186;
                Class clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls5 = clsM2187 == null ? Integer.class : clsM2187;
                Class clsM2188 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                c1982.paramTypes(cls, cls2, cls3, cls4, cls5, null, clsM2188 == null ? Boolean.class : clsM2188);
                return Unit.INSTANCE;
            case 17 /* 17 */:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 18 /* 18 */:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 19:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 20:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 21 /* 21 */:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 22 /* 22 */:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 23 /* 23 */:
                C0708 c0708 = (C0708) obj;
                C0708.m2129(c0708, "JsonPrimitive", new C1718(new C1354(13)));
                C0708.m2129(c0708, "JsonNull", new C1718(new C1354(14)));
                C0708.m2129(c0708, "JsonLiteral", new C1718(new C1354(15)));
                C0708.m2129(c0708, "JsonObject", new C1718(new C1354(16)));
                C0708.m2129(c0708, "JsonArray", new C1718(new C1354(17)));
                return Unit.INSTANCE;
            case 24 /* 24 */:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC1715 abstractC1715 = (AbstractC1715) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC2838.m4824(sb, str);
                sb.append(':');
                sb.append(abstractC1715);
                return sb.toString();
            case 25 /* 25 */:
                ((C1020) obj).thisMethodMatcher = new C1608(28);
                return Unit.INSTANCE;
            case 26:
                ((C1020) obj).thisMethodMatcher = new C1608(27);
                return Unit.INSTANCE;
            case 27:
                C1333 c1334 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1983 = new C1981(4);
                c1983.m3827("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                c1334.f4794 = c1983;
                return Unit.INSTANCE;
            case 28:
                C1333 c1335 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1984 = new C1981(4);
                c1984.m3827("getSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                c1335.f4794 = c1984;
                return Unit.INSTANCE;
            default:
                ((C1563) obj).setReturn(Double.valueOf(C1842.f6135.m2537()));
                return Unit.INSTANCE;
        }
    }
}
