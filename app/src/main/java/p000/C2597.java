package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2597 extends AbstractC3530 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final C0913 f8244 = new C0913(new C0918(C3448.m4962("java/lang/reflect/Array")), new C0914(new C0917("newInstance"), new C0917("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2596 f8245;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C0768 f8246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C0442 f8247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C1133 f8248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int f8249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final ArrayList f8250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C2819 f8251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f8252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f8253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f8254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f8255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f8256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public boolean f8257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C2587 f8258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public C2590 f8259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public C2788 f8260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597(C2596 c2596, C0768 c0768, C0442 c0442) {
        super(c0768.f2865.mo2257());
        C1133 c1133 = C1133.f4204;
        if (c0442 == null) {
            throw new NullPointerException("methods == null");
        }
        this.f8245 = c2596;
        this.f8246 = c0768;
        this.f8247 = c0442;
        this.f8248 = c1133;
        this.f8249 = c0768.f2867.f1494;
        this.f8250 = new ArrayList(25);
        this.f8251 = null;
        this.f8252 = false;
        this.f8253 = false;
        this.f8254 = -1;
        this.f8255 = 0;
        this.f8257 = false;
        this.f8259 = null;
        this.f8260 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:101:0x020c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0215  */
    /* JADX WARN: Code duplicated, block: B:106:0x0219  */
    /* JADX WARN: Code duplicated, block: B:111:0x0223  */
    /* JADX WARN: Code duplicated, block: B:113:0x0226  */
    /* JADX WARN: Code duplicated, block: B:115:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0235  */
    /* JADX WARN: Code duplicated, block: B:120:0x0237  */
    /* JADX WARN: Code duplicated, block: B:123:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0266  */
    /* JADX WARN: Code duplicated, block: B:128:0x026e A[LOOP:1: B:127:0x026c->B:128:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x02b2 A[LOOP:2: B:130:0x02b0->B:131:0x02b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:142:0x0301  */
    /* JADX WARN: Code duplicated, block: B:143:0x0304  */
    /* JADX WARN: Code duplicated, block: B:144:0x0307  */
    /* JADX WARN: Code duplicated, block: B:145:0x030a  */
    /* JADX WARN: Code duplicated, block: B:146:0x030d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0310  */
    /* JADX WARN: Code duplicated, block: B:148:0x0313  */
    /* JADX WARN: Code duplicated, block: B:151:0x0397  */
    /* JADX WARN: Code duplicated, block: B:153:0x039f  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:172:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:176:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:190:0x0400  */
    /* JADX WARN: Code duplicated, block: B:191:0x0403  */
    /* JADX WARN: Code duplicated, block: B:192:0x0406  */
    /* JADX WARN: Code duplicated, block: B:193:0x0409  */
    /* JADX WARN: Code duplicated, block: B:194:0x040c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0410  */
    /* JADX WARN: Code duplicated, block: B:196:0x0413  */
    /* JADX WARN: Code duplicated, block: B:197:0x0416  */
    /* JADX WARN: Code duplicated, block: B:198:0x0419  */
    /* JADX WARN: Code duplicated, block: B:199:0x041d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0442  */
    /* JADX WARN: Code duplicated, block: B:208:0x0451  */
    /* JADX WARN: Code duplicated, block: B:211:0x0459  */
    /* JADX WARN: Code duplicated, block: B:219:0x047d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0481  */
    /* JADX WARN: Code duplicated, block: B:221:0x0485  */
    /* JADX WARN: Code duplicated, block: B:222:0x0489  */
    /* JADX WARN: Code duplicated, block: B:223:0x048d  */
    /* JADX WARN: Code duplicated, block: B:224:0x0491  */
    /* JADX WARN: Code duplicated, block: B:225:0x0495  */
    /* JADX WARN: Code duplicated, block: B:226:0x0499  */
    /* JADX WARN: Code duplicated, block: B:227:0x049d  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:231:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:236:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:239:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:241:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:242:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:243:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:246:0x04da  */
    /* JADX WARN: Code duplicated, block: B:247:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:249:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:251:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:252:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:255:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:267:0x053a  */
    /* JADX WARN: Code duplicated, block: B:269:0x053e  */
    /* JADX WARN: Code duplicated, block: B:274:0x0561  */
    /* JADX WARN: Code duplicated, block: B:276:0x056d  */
    /* JADX WARN: Code duplicated, block: B:277:0x056f  */
    /* JADX WARN: Code duplicated, block: B:281:0x058b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0591  */
    /* JADX WARN: Code duplicated, block: B:286:0x05af  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:290:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:294:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:295:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:296:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x05da  */
    /* JADX WARN: Code duplicated, block: B:305:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:309:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:311:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:313:0x0603  */
    /* JADX WARN: Code duplicated, block: B:314:0x0606  */
    /* JADX WARN: Code duplicated, block: B:316:0x060e A[LOOP:3: B:315:0x060c->B:316:0x060e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x061c  */
    /* JADX WARN: Code duplicated, block: B:323:0x0626  */
    /* JADX WARN: Code duplicated, block: B:324:0x0633  */
    /* JADX WARN: Code duplicated, block: B:325:0x0636  */
    /* JADX WARN: Code duplicated, block: B:327:0x0641  */
    /* JADX WARN: Code duplicated, block: B:328:0x0644  */
    /* JADX WARN: Code duplicated, block: B:330:0x064c A[LOOP:4: B:329:0x064a->B:330:0x064c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:333:0x065b  */
    /* JADX WARN: Code duplicated, block: B:340:0x067f  */
    /* JADX WARN: Code duplicated, block: B:342:0x0683  */
    /* JADX WARN: Code duplicated, block: B:344:0x0694  */
    /* JADX WARN: Code duplicated, block: B:346:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:348:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:350:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:352:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:353:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:356:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:358:0x06ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:359:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:361:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:363:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:365:0x071e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:366:0x0720 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x0722  */
    /* JADX WARN: Code duplicated, block: B:369:0x0728  */
    /* JADX WARN: Code duplicated, block: B:371:0x0741  */
    /* JADX WARN: Code duplicated, block: B:373:0x075f  */
    /* JADX WARN: Code duplicated, block: B:374:0x076e  */
    /* JADX WARN: Code duplicated, block: B:376:0x0774  */
    /* JADX WARN: Code duplicated, block: B:378:0x0782  */
    /* JADX WARN: Code duplicated, block: B:379:0x0786  */
    /* JADX WARN: Code duplicated, block: B:381:0x078f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0799  */
    /* JADX WARN: Code duplicated, block: B:386:0x079e  */
    /* JADX WARN: Code duplicated, block: B:390:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:392:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:394:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:397:0x07e8 A[LOOP:6: B:396:0x07e6->B:397:0x07e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x080e A[LOOP:7: B:399:0x080c->B:400:0x080e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:402:0x0835  */
    /* JADX WARN: Code duplicated, block: B:404:0x083c  */
    /* JADX WARN: Code duplicated, block: B:410:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x02e7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:295:0x05ca, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:363:0x06ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4619(C0243 c0243, int i, int i2) {
        C2526 c2526;
        int i3;
        C2788 c2788M2261;
        InterfaceC1971 interfaceC1971;
        boolean z;
        C2525 c2525M5116;
        int i4;
        ArrayList arrayList;
        C2596 c2596;
        int iM4540;
        C2525[] c2525Arr;
        int i5;
        int i6;
        InterfaceC3450 interfaceC3450;
        AbstractC0777 abstractC0777;
        int i7;
        C2788 c2788;
        int i8;
        int i9;
        C2590 c2590M4625;
        AbstractC0777 abstractC0778;
        C2525 c2525;
        int i10;
        C2351 c2351;
        C2590 c2590M4626;
        C2526 c2527;
        AbstractC0777 abstractC0777M2420;
        InterfaceC3450 interfaceC3451;
        InterfaceC3450 interfaceC3452;
        C2525 c2528;
        InterfaceC3450 interfaceC3453;
        boolean z2;
        int length;
        C2526 c2529;
        int i11;
        C2526 c25210;
        int i12;
        int length2;
        C2526 c25211;
        int i13;
        C2526 c25212;
        InterfaceC3450 interfaceC3454;
        C0903 c0903;
        int i14;
        int iMo2424;
        int iMo2425;
        C1242 c1242;
        ArrayList arrayList2;
        boolean zM4599;
        C2590 c2590;
        C2526 c25213;
        AbstractC0777 abstractC0779;
        C2525 c25214;
        InterfaceC3407 c2352;
        InterfaceC3407 c2350;
        C2788 c2789;
        InterfaceC3407 c2923;
        C2525 c25215;
        C2590 c2591;
        C2525 c25216;
        InterfaceC3450 interfaceC3455;
        C0913 c0913;
        int i15;
        C0442 c0442;
        InterfaceC1971 interfaceC1972;
        C0913 c0914;
        int i16;
        int i17;
        C3448 c3448;
        C2525 c2525M4532;
        C3448 c3448M4968;
        C2819 c2819;
        int i18;
        C3448 c3448M4969;
        int i19;
        int i20;
        C0918 c0918;
        C2923 c2924;
        int i21;
        C1242 c1243 = (C1242) c0243.f1405;
        AbstractC1834 abstractC1834 = (AbstractC1834) c0243.f1404;
        int iM4966 = this.f8249 + c1243.f4507;
        int i22 = this.f11045;
        boolean z3 = true;
        if (i22 == 0) {
            c2526 = C2526.f8058;
        } else {
            int i23 = this.f11052;
            if (i23 >= 0) {
                c2526 = new C2526(1);
                c2526.m3063(0, C2525.m4532(i23, m5114(0), null));
            } else {
                C2526 c25217 = new C2526(i22);
                int iM4541 = iM4966;
                for (int i24 = 0; i24 < i22; i24++) {
                    C2525 c2525M4533 = C2525.m4532(iM4541, m5114(i24), null);
                    c25217.m3063(i24, c2525M4533);
                    iM4541 += c2525M4533.m4540();
                }
                if (i2 == 79) {
                    if (i22 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C2525 c25218 = (C2525) c25217.m3062(0);
                    C2525 c25219 = (C2525) c25217.m3062(1);
                    c25217.m3063(0, (C2525) c25217.m3062(2));
                    c25217.m3063(1, c25218);
                    c25217.m3063(2, c25219);
                } else if (i2 == 181) {
                    if (i22 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C2525 c25220 = (C2525) c25217.m3062(0);
                    c25217.m3063(0, (C2525) c25217.m3062(1));
                    c25217.m3063(1, c25220);
                }
                c2526 = c25217;
            }
            c2526.f6944 = false;
        }
        C2526 c2526M4546 = c2526;
        int length3 = c2526M4546.f4836.length;
        InterfaceC3450[] interfaceC3450Arr = this.f11055;
        if (i2 != 0) {
            if (i2 == 20) {
                z3 = true;
                m5121((InterfaceC3450) this.f11048);
            } else if (i2 == 21) {
                z3 = true;
                m5121(m5114(0));
            } else if (i2 != 171 && i2 != 172) {
                switch (i2) {
                    case 0:
                    case 79 /* 79 */:
                        break;
                    case 18 /* 18 */:
                        z3 = true;
                        m5121((InterfaceC3450) this.f11048);
                        break;
                    case 46 /* 46 */:
                    case 100:
                    case 104:
                    case 108 /* 108 */:
                    case 112:
                    case 116 /* 116 */:
                    case 120:
                    case 122:
                    case 124 /* 124 */:
                    case 126:
                    case 128:
                    case 130 /* 130 */:
                        z3 = true;
                        m5121(this.f11046);
                        break;
                    case 54 /* 54 */:
                        z3 = true;
                        m5121(m5114(0));
                        break;
                    default:
                        switch (i2) {
                            case 87 /* 87 */:
                            case 88 /* 88 */:
                                break;
                            case 89 /* 89 */:
                            case 90:
                            case 91:
                            case 92 /* 92 */:
                            case 93:
                            case 94:
                            case 95 /* 95 */:
                                z3 = true;
                                this.f11056 = 0;
                                for (int i25 = this.f11047; i25 != 0; i25 >>= 4) {
                                    InterfaceC3450 interfaceC3450M5114 = m5114((i25 & 15) - 1);
                                    if (interfaceC3450M5114 == null) {
                                        throw new NullPointerException("result == null");
                                    }
                                    int i26 = this.f11056;
                                    interfaceC3450Arr[i26] = interfaceC3450M5114;
                                    this.f11056 = i26 + 1;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 132 /* 132 */:
                                    case 133 /* 133 */:
                                    case 134 /* 134 */:
                                    case 135 /* 135 */:
                                    case 136 /* 136 */:
                                    case 137:
                                    case 138:
                                    case 139 /* 139 */:
                                    case 140 /* 140 */:
                                    case 141:
                                    case 142 /* 142 */:
                                    case 143 /* 143 */:
                                    case 144:
                                    case 145 /* 145 */:
                                    case 146 /* 146 */:
                                    case 147 /* 147 */:
                                    case 148 /* 148 */:
                                    case 149 /* 149 */:
                                    case 150 /* 150 */:
                                    case 151 /* 151 */:
                                    case 152 /* 152 */:
                                        break;
                                    case 153 /* 153 */:
                                    case 154 /* 154 */:
                                    case 155 /* 155 */:
                                    case 156 /* 156 */:
                                    case 157 /* 157 */:
                                    case 158 /* 158 */:
                                    case 159 /* 159 */:
                                    case 160 /* 160 */:
                                    case 161 /* 161 */:
                                    case 162 /* 162 */:
                                    case 163 /* 163 */:
                                    case 164 /* 164 */:
                                    case 165 /* 165 */:
                                    case 166 /* 166 */:
                                    case 167 /* 167 */:
                                    case 169 /* 169 */:
                                        break;
                                    case 168 /* 168 */:
                                        z3 = true;
                                        m5121(new C2587(this.f11049));
                                        break;
                                    default:
                                        switch (i2) {
                                            case 177 /* 177 */:
                                            case 179 /* 179 */:
                                            case 181 /* 181 */:
                                            case 191 /* 191 */:
                                            case 194 /* 194 */:
                                            case 195 /* 195 */:
                                                break;
                                            case 178 /* 178 */:
                                            case 180 /* 180 */:
                                            case 182 /* 182 */:
                                            case 184 /* 184 */:
                                            case 185 /* 185 */:
                                                z3 = true;
                                                C3448 type = ((InterfaceC3450) this.f11048).getType();
                                                if (type == C3448.f10874) {
                                                    this.f11056 = 0;
                                                } else {
                                                    m5121(type);
                                                }
                                                break;
                                            case 183 /* 183 */:
                                                C3448 type2 = m5114(0).getType();
                                                if (type2.f10906 >= 0) {
                                                    abstractC1834.mo3591(type2);
                                                    if (c1243.f4507 != 0) {
                                                        c1243.m3925();
                                                        C3448 c3448M49610 = type2.m4969();
                                                        int i27 = 0;
                                                        while (i27 < c1243.f4507) {
                                                            InterfaceC3450[] interfaceC3450Arr2 = (InterfaceC3450[]) c1243.f4508;
                                                            boolean z4 = z3;
                                                            if (interfaceC3450Arr2[i27] == type2) {
                                                                interfaceC3450Arr2[i27] = c3448M49610;
                                                            }
                                                            i27++;
                                                            z3 = z4;
                                                        }
                                                    }
                                                }
                                                z3 = z3;
                                                C3448 type3 = ((InterfaceC3450) this.f11048).getType();
                                                if (type3 == C3448.f10874) {
                                                    this.f11056 = 0;
                                                } else {
                                                    m5121(type3);
                                                }
                                                break;
                                            case 186:
                                                C3448 c3449 = ((C0895) this.f11048).f3335.f3359.f7755;
                                                if (c3449 == C3448.f10874) {
                                                    this.f11056 = 0;
                                                } else {
                                                    m5121(c3449);
                                                }
                                                z3 = true;
                                                break;
                                            case 187 /* 187 */:
                                                m5121(((C0918) this.f11048).f3401.m4964(i));
                                                z3 = true;
                                                break;
                                            case 188 /* 188 */:
                                            case 192 /* 192 */:
                                                m5121(((C0918) this.f11048).f3401);
                                                z3 = true;
                                                break;
                                            case 189 /* 189 */:
                                                m5121(((C0918) this.f11048).f3401.m4965());
                                                z3 = true;
                                                break;
                                            case 190 /* 190 */:
                                                break;
                                            case 193 /* 193 */:
                                                m5121(C3448.f10871);
                                                z3 = true;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 197:
                                                        m5121(((C0918) this.f11048).f3401);
                                                        z3 = true;
                                                        break;
                                                    case 198 /* 198 */:
                                                    case 199 /* 199 */:
                                                        break;
                                                    default:
                                                        throw new RuntimeException("shouldn't happen: ".concat(AbstractC1460.m3222(i2)));
                                                }
                                                break;
                                        }
                                        break;
                                }
                            case 96 /* 96 */:
                                z3 = true;
                                m5121(this.f11046);
                                break;
                        }
                        break;
                }
            }
            i3 = this.f11056;
            if (i3 >= 0) {
                throw new C2704("results never set", null);
            }
            if (i3 != 0) {
                if (this.f11054 != null) {
                    abstractC1834.mo3595(m5116(false));
                } else {
                    for (i21 = 0; i21 < this.f11056; i21++) {
                        if (this.f11053) {
                            c1243.m3925();
                            ((boolean[]) c1243.f4509)[c1243.f4507] = z3;
                        }
                        c1243.m2900(interfaceC3450Arr[i21]);
                    }
                }
            }
            C0768 c0768 = this.f8246;
            c2788M2261 = c0768.m2261(i);
            interfaceC1971 = c0768.f2865;
            if (i2 == 54) {
                z = z3;
            } else {
                z = false;
            }
            c2525M5116 = m5116(z);
            i4 = this.f11056;
            if (i4 >= 0) {
                throw new C2704("results never set", null);
            }
            arrayList = this.f8250;
            if (i4 == 0) {
                if (i2 != 87 || i2 == 88) {
                    return;
                } else {
                    c2525M5116 = null;
                }
            } else if (c2525M5116 == null) {
                if (i4 == z3) {
                    c2596 = this.f8245;
                    iM4540 = c2596.f8232 + c2596.f8230.f2867.f1493;
                    if (c2596.m4613()) {
                        iM4540++;
                    }
                    c2525Arr = new C2525[length3];
                    for (i5 = 0; i5 < length3; i5++) {
                        C2525 c25221 = (C2525) c2526M4546.m3062(i5);
                        InterfaceC3450 interfaceC3456 = c25221.f8056;
                        C2525 c2525M4544 = c25221.m4544(iM4540);
                        arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3456), c2788M2261, c2525M4544, c25221));
                        c2525Arr[i5] = c2525M4544;
                        iM4540 += c25221.m4540();
                    }
                    for (i6 = this.f11047; i6 != 0; i6 >>= 4) {
                        C2525 c25222 = c2525Arr[(i6 & 15) - 1];
                        InterfaceC3450 interfaceC3457 = c25222.f8056;
                        arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3457), c2788M2261, c25222.m4544(iM4966), c25222));
                        iM4966 += interfaceC3457.getType().m4966();
                    }
                    return;
                }
                if (i4 > 0) {
                    throw new IllegalArgumentException("n >= resultCount");
                }
                try {
                    c2525M5116 = C2525.m4532(iM4966, interfaceC3450Arr[0], null);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("n < 0");
                }
            }
            if (c2525M5116 != null) {
                interfaceC3450 = c2525M5116;
            } else {
                interfaceC3450 = C3448.f10874;
            }
            abstractC0777 = this.f11048;
            if (i2 == 197) {
                this.f8257 = true;
                this.f8255 = 6;
                int iM4542 = c2525M5116.m4540() + c2525M5116.f8055;
                i17 = c2525M5116.f8055;
                c3448 = C3448.f10900;
                c2525M4532 = C2525.m4532(iM4542, c3448, null);
                C2590 c2592 = AbstractC2598.f8261;
                
                c3448M4968 = c3448.m4968();
                if (!c3448M4968.m4972()) {
                    AbstractC2598.m4626(c3448);
                    throw null;
                }
                if (length3 >= 0) {
                    throw new IllegalArgumentException("count < 0");
                }
                c2819 = new C2819(length3);
                for (i18 = 0; i18 < length3; i18++) {
                    c2819.m3063(i18, c3448M4968);
                }
                c2788 = c2788M2261;
                i7 = 6;
                arrayList.add(new C2923(new C2590(42, c2819, AbstractC1239.f4472), c2788, c2526M4546, this.f8251, C0918.f3397));
                C3448 c34410 = C3448.f10900;
                
                arrayList.add(new C2351(new C2590(55, c34410, C2819.f9030, null), c2788, c2525M4532, C2526.f8058));
                c3448M4969 = ((C0918) abstractC0777).f3401;
                for (i19 = 0; i19 < length3; i19++) {
                    c3448M4969 = c3448M4969.m4968();
                }
                C2525 c2525M4534 = C2525.m4532(i17, C3448.f10877, null);
                i20 = c3448M4969.f10905;
                switch (i20) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ConcurrentHashMap concurrentHashMap = C0918.f3380;
                        switch (i20) {
                            case 0:
                                c0918 = C0918.f3390;
                                break;
                            case 1:
                                c0918 = C0918.f3382;
                                break;
                            case 2:
                                c0918 = C0918.f3383;
                                break;
                            case 3:
                                c0918 = C0918.f3384;
                                break;
                            case 4:
                                c0918 = C0918.f3385;
                                break;
                            case 5:
                                c0918 = C0918.f3386;
                                break;
                            case 6:
                                c0918 = C0918.f3388;
                                break;
                            case 7:
                                c0918 = C0918.f3387;
                                break;
                            case 8:
                                c0918 = C0918.f3389;
                                break;
                            default:
                                throw new IllegalArgumentException("not primitive: " + c3448M4969);
                        }
                        c2924 = new C2923(AbstractC2598.f8439, c2788, C2526.f8058, this.f8251, new C0899(c0918, C0914.f3373));
                        c2788 = c2788;
                        break;
                    default:
                        c2924 = new C2923(AbstractC2598.f8277, c2788, C2526.f8058, this.f8251, new C0918(c3448M4969));
                        break;
                }
                arrayList.add(c2924);
                C2590 c2590M4622 = AbstractC2598.m4622(c2525M4534.f8056.getType());
                C2526 c25223 = C2526.f8058;
                arrayList.add(new C2351(c2590M4622, c2788, c2525M4534, c25223));
                C2525 c2525M4535 = C2525.m4532(i17, C3448.f10882, null);
                C0913 c0915 = f8244;
                arrayList.add(new C2923(new C2590(49, c0915.f3330.m4422(), C2819.f9037), c2788, C2526.m4547(c2525M4534, c2525M4532), this.f8251, c0915));
                C3448 c34411 = c0915.f3330.f7755;
                
                arrayList.add(new C2351(new C2590(55, c34411, C2819.f9030, null), c2788, c2525M4535, c25223));
                c2526M4546 = C2526.m4546(c2525M4535);
                i8 = 192;
            } else {
                i7 = 6;
                c2788 = c2788M2261;
                if (i2 == 168) {
                    this.f8256 = true;
                    return;
                } else {
                    if (i2 == 169) {
                        try {
                            this.f8258 = (C2587) m5114(0);
                            return;
                        } catch (ClassCastException e) {
                            throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                        }
                    }
                    i8 = i2;
                }
            }
            if (i8 == 0) {
                i9 = 1;
            } else if (i8 == 20) {
                i9 = 5;
            } else if (i8 == 21) {
                i9 = 2;
            } else if (i8 != 171) {
                i9 = 13;
            } else if (i8 == 172) {
                i9 = 33;
            } else if (i8 == 198) {
                i9 = 7;
            } else if (i8 != 199) {
                switch (i8) {
                    case 0:
                        i9 = 1;
                        break;
                    case 18 /* 18 */:
                        i9 = 5;
                        break;
                    case 46 /* 46 */:
                        i9 = 38;
                        break;
                    case 54 /* 54 */:
                        i9 = 2;
                        break;
                    case 79 /* 79 */:
                        i9 = 39;
                        break;
                    case 96 /* 96 */:
                        i9 = 14;
                        break;
                    case 100:
                        i9 = 15;
                        break;
                    case 104:
                        i9 = 16;
                        break;
                    case 108 /* 108 */:
                        i9 = 17;
                        break;
                    case 112:
                        i9 = 18;
                        break;
                    case 116 /* 116 */:
                        i9 = 19;
                        break;
                    case 120:
                        i9 = 23;
                        break;
                    case 122:
                        i9 = 24;
                        break;
                    case 124 /* 124 */:
                        i9 = 25;
                        break;
                    case 126:
                        i9 = 20;
                        break;
                    case 128:
                        i9 = 21;
                        break;
                    case 130 /* 130 */:
                        i9 = 22;
                        break;
                    default:
                        switch (i8) {
                            case 132 /* 132 */:
                                i9 = 14;
                                break;
                            case 133 /* 133 */:
                            case 134 /* 134 */:
                            case 135 /* 135 */:
                            case 136 /* 136 */:
                            case 137:
                            case 138:
                            case 139 /* 139 */:
                            case 140 /* 140 */:
                            case 141:
                            case 142 /* 142 */:
                            case 143 /* 143 */:
                            case 144:
                                i9 = 29;
                                break;
                            case 145 /* 145 */:
                                i9 = 30;
                                break;
                            case 146 /* 146 */:
                                i9 = 31;
                                break;
                            case 147 /* 147 */:
                                i9 = 32;
                                break;
                            case 148 /* 148 */:
                            case 149 /* 149 */:
                            case 151 /* 151 */:
                                i9 = 27;
                                break;
                            case 150 /* 150 */:
                            case 152 /* 152 */:
                                i9 = 28;
                                break;
                            case 153 /* 153 */:
                            case 159 /* 159 */:
                            case 165 /* 165 */:
                                i9 = 7;
                                break;
                            case 154 /* 154 */:
                            case 160 /* 160 */:
                            case 166 /* 166 */:
                                i9 = 8;
                                break;
                            case 155 /* 155 */:
                            case 161 /* 161 */:
                                i9 = 9;
                                break;
                            case 156 /* 156 */:
                            case 162 /* 162 */:
                                i9 = 10;
                                break;
                            case 157 /* 157 */:
                            case 163 /* 163 */:
                                i9 = 12;
                                break;
                            case 158 /* 158 */:
                            case 164 /* 164 */:
                                i9 = 11;
                                break;
                            case 167 /* 167 */:
                                i9 = i7;
                                break;
                            default:
                                switch (i8) {
                                    case 177 /* 177 */:
                                        i9 = 33;
                                        break;
                                    case 178 /* 178 */:
                                        i9 = 46;
                                        break;
                                    case 179 /* 179 */:
                                        i9 = 48;
                                        break;
                                    case 180 /* 180 */:
                                        i9 = 45;
                                        break;
                                    case 181 /* 181 */:
                                        i9 = 47;
                                        break;
                                    case 182 /* 182 */:
                                        c0913 = (C0913) abstractC0777;
                                        if (c0913.f3368.equals(interfaceC1971.mo2258())) {
                                            i15 = 0;
                                            while (true) {
                                                c0442 = this.f8247;
                                                if (i15 < c0442.f4836.length) {
                                                    interfaceC1972 = (InterfaceC1971) c0442.m3062(i15);
                                                    if ((interfaceC1972.mo2259() & 2) == 0 && c0913.f3369.equals(interfaceC1972.mo2260())) {
                                                        i9 = 52;
                                                    } else {
                                                        i15++;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        if (c0913.m2410()) {
                                            i9 = 58;
                                        } else {
                                            i9 = 50;
                                        }
                                        break;
                                    case 183 /* 183 */:
                                        c0914 = (C0913) abstractC0777;
                                        if (!c0914.f3369.f3374.f3378.equals("<init>") || c0914.f3368.equals(interfaceC1971.mo2258())) {
                                            i9 = 52;
                                        } else {
                                            i16 = 51;
                                            i9 = i16;
                                        }
                                        break;
                                    case 184 /* 184 */:
                                        i9 = 49;
                                        break;
                                    case 185 /* 185 */:
                                        i16 = 53;
                                        i9 = i16;
                                        break;
                                    case 186:
                                        i9 = 59;
                                        break;
                                    case 187 /* 187 */:
                                        i16 = 40;
                                        i9 = i16;
                                        break;
                                    case 188 /* 188 */:
                                    case 189 /* 189 */:
                                        i9 = 41;
                                        break;
                                    case 190 /* 190 */:
                                        i16 = 34;
                                        i9 = i16;
                                        break;
                                    case 191 /* 191 */:
                                        i16 = 35;
                                        i9 = i16;
                                        break;
                                    case 192 /* 192 */:
                                        i16 = 43;
                                        i9 = i16;
                                        break;
                                    case 193 /* 193 */:
                                        i16 = 44;
                                        i9 = i16;
                                        break;
                                    case 194 /* 194 */:
                                        i16 = 36;
                                        i9 = i16;
                                        break;
                                    case 195 /* 195 */:
                                        i16 = 37;
                                        i9 = i16;
                                        break;
                                    default:
                                        throw new RuntimeException("shouldn't happen");
                                }
                                break;
                        }
                        break;
                }
            } else {
                i9 = 8;
            }
            c2590M4625 = AbstractC2598.m4625(i9, interfaceC3450, c2526M4546, abstractC0777);
            if (c2525M5116 != null || !c2590M4625.f8209) {
                abstractC0778 = abstractC0777;
                if (c2525M5116 == null && c2590M4625.m4599()) {
                    this.f8255++;
                    c2351 = new C2351(AbstractC2598.m4622(c2525M5116.f8056), c2788, c2525M5116, C2526.f8058);
                } else {
                    c2525 = c2525M5116;
                    i10 = 41;
                    c2351 = null;
                }
                if (i9 != i10) {
                    if (abstractC0778 == null && length3 == 2) {
                        interfaceC3451 = ((C2525) c2526M4546.m3062(0)).f8056;
                        interfaceC3452 = ((C2525) c2526M4546.m3062(1)).f8056;
                        if (interfaceC3452.mo4534() || interfaceC3451.mo4534()) {
                            C2525 c25224 = (C2525) c2526M4546.m3062(0);
                            c2528 = (C2525) c2526M4546.m3062(1);
                            
                            interfaceC3453 = c25224.f8056;
                            if (interfaceC3453.getType() == C3448.f10871) {
                                interfaceC3454 = c2528.f8056;
                                if (interfaceC3454 instanceof C0903) {
                                    c0903 = (C0903) interfaceC3454;
                                    i14 = c0903.f3364;
                                    switch (c2590M4625.f8204) {
                                        case 14 /* 14 */:
                                        case 16:
                                        case 17 /* 17 */:
                                        case 18 /* 18 */:
                                        case 20:
                                        case 21 /* 21 */:
                                        case 22 /* 22 */:
                                            iMo2424 = c0903.mo2424();
                                            if (((short) iMo2424) == iMo2424) {
                                            }
                                            break;
                                        case 15:
                                            iMo2425 = C0903.m2420(-i14).mo2424();
                                            if (((short) iMo2425) == iMo2425) {
                                            }
                                            break;
                                        case 19:
                                        default:
                                            break;
                                        case 23 /* 23 */:
                                        case 24 /* 24 */:
                                        case 25 /* 25 */:
                                            if (((byte) i14) == i14) {
                                            }
                                            break;
                                    }
                                } else if ((interfaceC3453 instanceof C0903) && c2590M4625.f8204 == 15) {
                                    int iMo2426 = ((C0903) interfaceC3453).mo2424();
                                    z2 = ((short) iMo2426) == iMo2426;
                                }
                            }
                            if (z2) {
                                if (interfaceC3452.mo4534()) {
                                    abstractC0777M2420 = (AbstractC0777) interfaceC3452;
                                    length2 = c2526M4546.f4836.length - 1;
                                    if (length2 == 0) {
                                        c25212 = C2526.f8058;
                                    } else {
                                        c25211 = new C2526(length2);
                                        for (i13 = 0; i13 < length2; i13++) {
                                            c25211.m3063(i13, c2526M4546.m3062(i13));
                                        }
                                        if (!c2526M4546.f6944) {
                                            c25211.f6944 = false;
                                        }
                                        c25212 = c25211;
                                    }
                                    if (c2590M4625.f8204 == 15) {
                                        abstractC0777M2420 = C0903.m2420(-((C0903) interfaceC3452).f3364);
                                        c2526M4546 = c25212;
                                        i12 = 14;
                                    } else {
                                        c2526M4546 = c25212;
                                        i12 = i9;
                                    }
                                } else {
                                    abstractC0777M2420 = (AbstractC0777) interfaceC3451;
                                    length = c2526M4546.f4836.length - 1;
                                    if (length == 0) {
                                        c25210 = C2526.f8058;
                                    } else {
                                        c2529 = new C2526(length);
                                        i11 = 0;
                                        while (i11 < length) {
                                            int i28 = i11 + 1;
                                            c2529.m3063(i11, c2526M4546.m3062(i28));
                                            i11 = i28;
                                        }
                                        if (!c2526M4546.f6944) {
                                            c2529.f6944 = false;
                                        }
                                        c25210 = c2529;
                                    }
                                    i12 = i9;
                                    c2526M4546 = c25210;
                                }
                                c2590M4626 = AbstractC2598.m4625(i12, interfaceC3450, c2526M4546, abstractC0777M2420);
                                i9 = i12;
                            }
                            c1242 = this.f11050;
                            arrayList2 = this.f11051;
                            zM4599 = c2590M4626.m4599();
                            this.f8257 |= zM4599;
                            if (c1242 == null) {
                                c2590 = c2590M4626;
                                c25213 = c2527;
                                if (i9 == 33) {
                                    if (c25213.f4836.length != 0) {
                                        c25216 = (C2525) c25213.m3062(0);
                                        interfaceC3455 = c25216.f8056;
                                        if (c25216.f8055 != 0) {
                                            c25215 = null;
                                            arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                                        } else {
                                            c25215 = null;
                                        }
                                    } else {
                                        c25215 = null;
                                    }
                                    c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                                    this.f8254 = 0;
                                    c2591 = this.f8259;
                                    if (c2591 == null) {
                                        this.f8259 = c2590;
                                        this.f8260 = c2788;
                                    } else {
                                        if (c2591 != c2590) {
                                            throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                                        }
                                        if (c2788.f8907 > this.f8260.f8907) {
                                            this.f8260 = c2788;
                                        }
                                    }
                                    this.f8253 = true;
                                    abstractC0779 = abstractC0777M2420;
                                } else if (abstractC0777M2420 == null) {
                                    abstractC0779 = abstractC0777M2420;
                                    c25214 = c2525;
                                    if (zM4599) {
                                        InterfaceC3407 c2868 = new C2868(c2590, c2788, c25213, this.f8251);
                                        this.f8252 = true;
                                        if (i8 == 191) {
                                            this.f8254 = -1;
                                        } else {
                                            this.f8254 = this.f8251.f4836.length;
                                        }
                                        c2352 = c2868;
                                    } else {
                                        c2352 = new C2351(c2590, c2788, c25214, c25213);
                                    }
                                } else if (zM4599) {
                                    if (c2590.f8204 == 58) {
                                        c2789 = c2788;
                                        c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                                        abstractC0779 = abstractC0777M2420;
                                    } else {
                                        c2789 = c2788;
                                        abstractC0779 = abstractC0777M2420;
                                        c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                                    }
                                    c2352 = c2923;
                                    this.f8252 = true;
                                    this.f8254 = this.f8251.f4836.length;
                                    c2788 = c2789;
                                } else {
                                    abstractC0779 = abstractC0777M2420;
                                    c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                                    c2352 = c2350;
                                }
                            } else if (c1242.f4507 == 0) {
                                c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                                this.f8254 = 0;
                                abstractC0779 = abstractC0777M2420;
                            } else {
                                C1660 c1660 = (C1660) c1242.f4508;
                                c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1660);
                                this.f8254 = c1660.f5610;
                                abstractC0779 = abstractC0777M2420;
                                c2352 = c2350;
                            }
                            arrayList.add(c2352);
                            if (c2351 != null) {
                                arrayList.add(c2351);
                            }
                            if (arrayList2 != null) {
                                this.f8255++;
                                arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                            }
                        }
                    }
                    c2590M4626 = c2590M4625;
                    c2527 = c2526M4546;
                    abstractC0777M2420 = abstractC0778;
                    c1242 = this.f11050;
                    arrayList2 = this.f11051;
                    zM4599 = c2590M4626.m4599();
                    this.f8257 |= zM4599;
                    if (c1242 == null) {
                        c2590 = c2590M4626;
                        c25213 = c2527;
                        if (i9 == 33) {
                            if (c25213.f4836.length != 0) {
                                c25216 = (C2525) c25213.m3062(0);
                                interfaceC3455 = c25216.f8056;
                                if (c25216.f8055 != 0) {
                                    c25215 = null;
                                    arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                                } else {
                                    c25215 = null;
                                }
                            } else {
                                c25215 = null;
                            }
                            c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                            this.f8254 = 0;
                            c2591 = this.f8259;
                            if (c2591 == null) {
                                this.f8259 = c2590;
                                this.f8260 = c2788;
                            } else {
                                if (c2591 != c2590) {
                                    throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                                }
                                if (c2788.f8907 > this.f8260.f8907) {
                                    this.f8260 = c2788;
                                }
                            }
                            this.f8253 = true;
                            abstractC0779 = abstractC0777M2420;
                        } else if (abstractC0777M2420 == null) {
                            abstractC0779 = abstractC0777M2420;
                            c25214 = c2525;
                            if (zM4599) {
                                InterfaceC3407 c2869 = new C2868(c2590, c2788, c25213, this.f8251);
                                this.f8252 = true;
                                if (i8 == 191) {
                                    this.f8254 = -1;
                                } else {
                                    this.f8254 = this.f8251.f4836.length;
                                }
                                c2352 = c2869;
                            } else {
                                c2352 = new C2351(c2590, c2788, c25214, c25213);
                            }
                        } else if (zM4599) {
                            if (c2590.f8204 == 58) {
                                c2789 = c2788;
                                c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                                abstractC0779 = abstractC0777M2420;
                            } else {
                                c2789 = c2788;
                                abstractC0779 = abstractC0777M2420;
                                c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                            }
                            c2352 = c2923;
                            this.f8252 = true;
                            this.f8254 = this.f8251.f4836.length;
                            c2788 = c2789;
                        } else {
                            abstractC0779 = abstractC0777M2420;
                            c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                            c2352 = c2350;
                        }
                    } else if (c1242.f4507 == 0) {
                        c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                        this.f8254 = 0;
                        abstractC0779 = abstractC0777M2420;
                    } else {
                        C1660 c1661 = (C1660) c1242.f4508;
                        c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1661);
                        this.f8254 = c1661.f5610;
                        abstractC0779 = abstractC0777M2420;
                        c2352 = c2350;
                    }
                    arrayList.add(c2352);
                    if (c2351 != null) {
                        arrayList.add(c2351);
                    }
                    if (arrayList2 != null) {
                        this.f8255++;
                        arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                    }
                }
                abstractC0777M2420 = C0918.m2431(c2590M4625.f8205);
                c2590M4626 = c2590M4625;
                c2527 = c2526M4546;
                c1242 = this.f11050;
                arrayList2 = this.f11051;
                zM4599 = c2590M4626.m4599();
                this.f8257 |= zM4599;
                if (c1242 == null) {
                    c2590 = c2590M4626;
                    c25213 = c2527;
                    if (i9 == 33) {
                        if (c25213.f4836.length != 0) {
                            c25216 = (C2525) c25213.m3062(0);
                            interfaceC3455 = c25216.f8056;
                            if (c25216.f8055 != 0) {
                                c25215 = null;
                                arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                            } else {
                                c25215 = null;
                            }
                        } else {
                            c25215 = null;
                        }
                        c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                        this.f8254 = 0;
                        c2591 = this.f8259;
                        if (c2591 == null) {
                            this.f8259 = c2590;
                            this.f8260 = c2788;
                        } else {
                            if (c2591 != c2590) {
                                throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                            }
                            if (c2788.f8907 > this.f8260.f8907) {
                                this.f8260 = c2788;
                            }
                        }
                        this.f8253 = true;
                        abstractC0779 = abstractC0777M2420;
                    } else if (abstractC0777M2420 == null) {
                        abstractC0779 = abstractC0777M2420;
                        c25214 = c2525;
                        if (zM4599) {
                            InterfaceC3407 c28610 = new C2868(c2590, c2788, c25213, this.f8251);
                            this.f8252 = true;
                            if (i8 == 191) {
                                this.f8254 = -1;
                            } else {
                                this.f8254 = this.f8251.f4836.length;
                            }
                            c2352 = c28610;
                        } else {
                            c2352 = new C2351(c2590, c2788, c25214, c25213);
                        }
                    } else if (zM4599) {
                        if (c2590.f8204 == 58) {
                            c2789 = c2788;
                            c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                            abstractC0779 = abstractC0777M2420;
                        } else {
                            c2789 = c2788;
                            abstractC0779 = abstractC0777M2420;
                            c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                        }
                        c2352 = c2923;
                        this.f8252 = true;
                        this.f8254 = this.f8251.f4836.length;
                        c2788 = c2789;
                    } else {
                        abstractC0779 = abstractC0777M2420;
                        c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                        c2352 = c2350;
                    }
                } else if (c1242.f4507 == 0) {
                    c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                    this.f8254 = 0;
                    abstractC0779 = abstractC0777M2420;
                } else {
                    C1660 c1662 = (C1660) c1242.f4508;
                    c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1662);
                    this.f8254 = c1662.f5610;
                    abstractC0779 = abstractC0777M2420;
                    c2352 = c2350;
                }
                arrayList.add(c2352);
                if (c2351 != null) {
                    arrayList.add(c2351);
                }
                if (arrayList2 != null) {
                    this.f8255++;
                    arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                }
            }
            this.f8255++;
            C3448 c34412 = c2590M4625.f8204 == 59 ? ((C0895) abstractC0777).f3335.f3359.f7755 : ((C0913) abstractC0777).f3330.f7755;
            
            abstractC0778 = abstractC0777;
            c2351 = new C2351(new C2590(55, c34412, C2819.f9030, null), c2788, c2525M5116, C2526.f8058);
            i10 = 41;
            c2525 = null;
            if (i9 != i10) {
                if (abstractC0778 == null) {
                    interfaceC3451 = ((C2525) c2526M4546.m3062(0)).f8056;
                    interfaceC3452 = ((C2525) c2526M4546.m3062(1)).f8056;
                    if (interfaceC3452.mo4534()) {
                        C2525 c25225 = (C2525) c2526M4546.m3062(0);
                        c2528 = (C2525) c2526M4546.m3062(1);
                        
                        interfaceC3453 = c25225.f8056;
                        if (interfaceC3453.getType() == C3448.f10871) {
                            interfaceC3454 = c2528.f8056;
                            if (interfaceC3454 instanceof C0903) {
                                c0903 = (C0903) interfaceC3454;
                                i14 = c0903.f3364;
                                switch (c2590M4625.f8204) {
                                    case 14 /* 14 */:
                                    case 16:
                                    case 17 /* 17 */:
                                    case 18 /* 18 */:
                                    case 20:
                                    case 21 /* 21 */:
                                    case 22 /* 22 */:
                                        iMo2424 = c0903.mo2424();
                                        if (((short) iMo2424) == iMo2424) {
                                        }
                                        break;
                                    case 15:
                                        iMo2425 = C0903.m2420(-i14).mo2424();
                                        if (((short) iMo2425) == iMo2425) {
                                        }
                                        break;
                                    case 19:
                                    default:
                                        break;
                                    case 23 /* 23 */:
                                    case 24 /* 24 */:
                                    case 25 /* 25 */:
                                        if (((byte) i14) == i14) {
                                        }
                                        break;
                                }
                            } else if (interfaceC3453 instanceof C0903) {
                                int iMo2427 = ((C0903) interfaceC3453).mo2424();
                                if (((short) iMo2427) == iMo2427) {
                                }
                            }
                        }
                        if (z2) {
                            if (interfaceC3452.mo4534()) {
                                abstractC0777M2420 = (AbstractC0777) interfaceC3452;
                                length2 = c2526M4546.f4836.length - 1;
                                if (length2 == 0) {
                                    c25212 = C2526.f8058;
                                } else {
                                    c25211 = new C2526(length2);
                                    while (i13 < length2) {
                                        c25211.m3063(i13, c2526M4546.m3062(i13));
                                    }
                                    if (!c2526M4546.f6944) {
                                        c25211.f6944 = false;
                                    }
                                    c25212 = c25211;
                                }
                                if (c2590M4625.f8204 == 15) {
                                    abstractC0777M2420 = C0903.m2420(-((C0903) interfaceC3452).f3364);
                                    c2526M4546 = c25212;
                                    i12 = 14;
                                } else {
                                    c2526M4546 = c25212;
                                    i12 = i9;
                                }
                            } else {
                                abstractC0777M2420 = (AbstractC0777) interfaceC3451;
                                length = c2526M4546.f4836.length - 1;
                                if (length == 0) {
                                    c25210 = C2526.f8058;
                                } else {
                                    c2529 = new C2526(length);
                                    i11 = 0;
                                    while (i11 < length) {
                                        int i29 = i11 + 1;
                                        c2529.m3063(i11, c2526M4546.m3062(i29));
                                        i11 = i29;
                                    }
                                    if (!c2526M4546.f6944) {
                                        c2529.f6944 = false;
                                    }
                                    c25210 = c2529;
                                }
                                i12 = i9;
                                c2526M4546 = c25210;
                            }
                            c2590M4626 = AbstractC2598.m4625(i12, interfaceC3450, c2526M4546, abstractC0777M2420);
                            i9 = i12;
                        }
                        c1242 = this.f11050;
                        arrayList2 = this.f11051;
                        zM4599 = c2590M4626.m4599();
                        this.f8257 |= zM4599;
                        if (c1242 == null) {
                            c2590 = c2590M4626;
                            c25213 = c2527;
                            if (i9 == 33) {
                                if (c25213.f4836.length != 0) {
                                    c25216 = (C2525) c25213.m3062(0);
                                    interfaceC3455 = c25216.f8056;
                                    if (c25216.f8055 != 0) {
                                        c25215 = null;
                                        arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                                    } else {
                                        c25215 = null;
                                    }
                                } else {
                                    c25215 = null;
                                }
                                c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                                this.f8254 = 0;
                                c2591 = this.f8259;
                                if (c2591 == null) {
                                    this.f8259 = c2590;
                                    this.f8260 = c2788;
                                } else {
                                    if (c2591 != c2590) {
                                        throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                                    }
                                    if (c2788.f8907 > this.f8260.f8907) {
                                        this.f8260 = c2788;
                                    }
                                }
                                this.f8253 = true;
                                abstractC0779 = abstractC0777M2420;
                            } else if (abstractC0777M2420 == null) {
                                abstractC0779 = abstractC0777M2420;
                                c25214 = c2525;
                                if (zM4599) {
                                    InterfaceC3407 c28611 = new C2868(c2590, c2788, c25213, this.f8251);
                                    this.f8252 = true;
                                    if (i8 == 191) {
                                        this.f8254 = -1;
                                    } else {
                                        this.f8254 = this.f8251.f4836.length;
                                    }
                                    c2352 = c28611;
                                } else {
                                    c2352 = new C2351(c2590, c2788, c25214, c25213);
                                }
                            } else if (zM4599) {
                                if (c2590.f8204 == 58) {
                                    c2789 = c2788;
                                    c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                                    abstractC0779 = abstractC0777M2420;
                                } else {
                                    c2789 = c2788;
                                    abstractC0779 = abstractC0777M2420;
                                    c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                                }
                                c2352 = c2923;
                                this.f8252 = true;
                                this.f8254 = this.f8251.f4836.length;
                                c2788 = c2789;
                            } else {
                                abstractC0779 = abstractC0777M2420;
                                c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                                c2352 = c2350;
                            }
                        } else if (c1242.f4507 == 0) {
                            c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                            this.f8254 = 0;
                            abstractC0779 = abstractC0777M2420;
                        } else {
                            C1660 c1663 = (C1660) c1242.f4508;
                            c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1663);
                            this.f8254 = c1663.f5610;
                            abstractC0779 = abstractC0777M2420;
                            c2352 = c2350;
                        }
                        arrayList.add(c2352);
                        if (c2351 != null) {
                            arrayList.add(c2351);
                        }
                        if (arrayList2 != null) {
                            this.f8255++;
                            arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                        }
                    }
                    C2525 c25226 = (C2525) c2526M4546.m3062(0);
                    c2528 = (C2525) c2526M4546.m3062(1);
                    
                    interfaceC3453 = c25226.f8056;
                    if (interfaceC3453.getType() == C3448.f10871) {
                        interfaceC3454 = c2528.f8056;
                        if (interfaceC3454 instanceof C0903) {
                            c0903 = (C0903) interfaceC3454;
                            i14 = c0903.f3364;
                            switch (c2590M4625.f8204) {
                                case 14 /* 14 */:
                                case 16:
                                case 17 /* 17 */:
                                case 18 /* 18 */:
                                case 20:
                                case 21 /* 21 */:
                                case 22 /* 22 */:
                                    iMo2424 = c0903.mo2424();
                                    if (((short) iMo2424) == iMo2424) {
                                    }
                                    break;
                                case 15:
                                    iMo2425 = C0903.m2420(-i14).mo2424();
                                    if (((short) iMo2425) == iMo2425) {
                                    }
                                    break;
                                case 19:
                                default:
                                    break;
                                case 23 /* 23 */:
                                case 24 /* 24 */:
                                case 25 /* 25 */:
                                    if (((byte) i14) == i14) {
                                    }
                                    break;
                            }
                        } else if (interfaceC3453 instanceof C0903) {
                            int iMo2428 = ((C0903) interfaceC3453).mo2424();
                            if (((short) iMo2428) == iMo2428) {
                            }
                        }
                    }
                    if (z2) {
                        if (interfaceC3452.mo4534()) {
                            abstractC0777M2420 = (AbstractC0777) interfaceC3452;
                            length2 = c2526M4546.f4836.length - 1;
                            if (length2 == 0) {
                                c25212 = C2526.f8058;
                            } else {
                                c25211 = new C2526(length2);
                                while (i13 < length2) {
                                    c25211.m3063(i13, c2526M4546.m3062(i13));
                                }
                                if (!c2526M4546.f6944) {
                                    c25211.f6944 = false;
                                }
                                c25212 = c25211;
                            }
                            if (c2590M4625.f8204 == 15) {
                                abstractC0777M2420 = C0903.m2420(-((C0903) interfaceC3452).f3364);
                                c2526M4546 = c25212;
                                i12 = 14;
                            } else {
                                c2526M4546 = c25212;
                                i12 = i9;
                            }
                        } else {
                            abstractC0777M2420 = (AbstractC0777) interfaceC3451;
                            length = c2526M4546.f4836.length - 1;
                            if (length == 0) {
                                c25210 = C2526.f8058;
                            } else {
                                c2529 = new C2526(length);
                                i11 = 0;
                                while (i11 < length) {
                                    int i210 = i11 + 1;
                                    c2529.m3063(i11, c2526M4546.m3062(i210));
                                    i11 = i210;
                                }
                                if (!c2526M4546.f6944) {
                                    c2529.f6944 = false;
                                }
                                c25210 = c2529;
                            }
                            i12 = i9;
                            c2526M4546 = c25210;
                        }
                        c2590M4626 = AbstractC2598.m4625(i12, interfaceC3450, c2526M4546, abstractC0777M2420);
                        i9 = i12;
                    }
                    c1242 = this.f11050;
                    arrayList2 = this.f11051;
                    zM4599 = c2590M4626.m4599();
                    this.f8257 |= zM4599;
                    if (c1242 == null) {
                        c2590 = c2590M4626;
                        c25213 = c2527;
                        if (i9 == 33) {
                            if (c25213.f4836.length != 0) {
                                c25216 = (C2525) c25213.m3062(0);
                                interfaceC3455 = c25216.f8056;
                                if (c25216.f8055 != 0) {
                                    c25215 = null;
                                    arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                                } else {
                                    c25215 = null;
                                }
                            } else {
                                c25215 = null;
                            }
                            c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                            this.f8254 = 0;
                            c2591 = this.f8259;
                            if (c2591 == null) {
                                this.f8259 = c2590;
                                this.f8260 = c2788;
                            } else {
                                if (c2591 != c2590) {
                                    throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                                }
                                if (c2788.f8907 > this.f8260.f8907) {
                                    this.f8260 = c2788;
                                }
                            }
                            this.f8253 = true;
                            abstractC0779 = abstractC0777M2420;
                        } else if (abstractC0777M2420 == null) {
                            abstractC0779 = abstractC0777M2420;
                            c25214 = c2525;
                            if (zM4599) {
                                InterfaceC3407 c28612 = new C2868(c2590, c2788, c25213, this.f8251);
                                this.f8252 = true;
                                if (i8 == 191) {
                                    this.f8254 = -1;
                                } else {
                                    this.f8254 = this.f8251.f4836.length;
                                }
                                c2352 = c28612;
                            } else {
                                c2352 = new C2351(c2590, c2788, c25214, c25213);
                            }
                        } else if (zM4599) {
                            if (c2590.f8204 == 58) {
                                c2789 = c2788;
                                c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                                abstractC0779 = abstractC0777M2420;
                            } else {
                                c2789 = c2788;
                                abstractC0779 = abstractC0777M2420;
                                c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                            }
                            c2352 = c2923;
                            this.f8252 = true;
                            this.f8254 = this.f8251.f4836.length;
                            c2788 = c2789;
                        } else {
                            abstractC0779 = abstractC0777M2420;
                            c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                            c2352 = c2350;
                        }
                    } else if (c1242.f4507 == 0) {
                        c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                        this.f8254 = 0;
                        abstractC0779 = abstractC0777M2420;
                    } else {
                        C1660 c1664 = (C1660) c1242.f4508;
                        c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1664);
                        this.f8254 = c1664.f5610;
                        abstractC0779 = abstractC0777M2420;
                        c2352 = c2350;
                    }
                    arrayList.add(c2352);
                    if (c2351 != null) {
                        arrayList.add(c2351);
                    }
                    if (arrayList2 != null) {
                        this.f8255++;
                        arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                    }
                }
                c2590M4626 = c2590M4625;
                c2527 = c2526M4546;
                abstractC0777M2420 = abstractC0778;
                c1242 = this.f11050;
                arrayList2 = this.f11051;
                zM4599 = c2590M4626.m4599();
                this.f8257 |= zM4599;
                if (c1242 == null) {
                    c2590 = c2590M4626;
                    c25213 = c2527;
                    if (i9 == 33) {
                        if (c25213.f4836.length != 0) {
                            c25216 = (C2525) c25213.m3062(0);
                            interfaceC3455 = c25216.f8056;
                            if (c25216.f8055 != 0) {
                                c25215 = null;
                                arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                            } else {
                                c25215 = null;
                            }
                        } else {
                            c25215 = null;
                        }
                        c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                        this.f8254 = 0;
                        c2591 = this.f8259;
                        if (c2591 == null) {
                            this.f8259 = c2590;
                            this.f8260 = c2788;
                        } else {
                            if (c2591 != c2590) {
                                throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                            }
                            if (c2788.f8907 > this.f8260.f8907) {
                                this.f8260 = c2788;
                            }
                        }
                        this.f8253 = true;
                        abstractC0779 = abstractC0777M2420;
                    } else if (abstractC0777M2420 == null) {
                        abstractC0779 = abstractC0777M2420;
                        c25214 = c2525;
                        if (zM4599) {
                            InterfaceC3407 c28613 = new C2868(c2590, c2788, c25213, this.f8251);
                            this.f8252 = true;
                            if (i8 == 191) {
                                this.f8254 = -1;
                            } else {
                                this.f8254 = this.f8251.f4836.length;
                            }
                            c2352 = c28613;
                        } else {
                            c2352 = new C2351(c2590, c2788, c25214, c25213);
                        }
                    } else if (zM4599) {
                        if (c2590.f8204 == 58) {
                            c2789 = c2788;
                            c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                            abstractC0779 = abstractC0777M2420;
                        } else {
                            c2789 = c2788;
                            abstractC0779 = abstractC0777M2420;
                            c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                        }
                        c2352 = c2923;
                        this.f8252 = true;
                        this.f8254 = this.f8251.f4836.length;
                        c2788 = c2789;
                    } else {
                        abstractC0779 = abstractC0777M2420;
                        c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                        c2352 = c2350;
                    }
                } else if (c1242.f4507 == 0) {
                    c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                    this.f8254 = 0;
                    abstractC0779 = abstractC0777M2420;
                } else {
                    C1660 c1665 = (C1660) c1242.f4508;
                    c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1665);
                    this.f8254 = c1665.f5610;
                    abstractC0779 = abstractC0777M2420;
                    c2352 = c2350;
                }
                arrayList.add(c2352);
                if (c2351 != null) {
                    arrayList.add(c2351);
                }
                if (arrayList2 != null) {
                    this.f8255++;
                    arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                }
            }
            abstractC0777M2420 = C0918.m2431(c2590M4625.f8205);
            c2590M4626 = c2590M4625;
            c2527 = c2526M4546;
            c1242 = this.f11050;
            arrayList2 = this.f11051;
            zM4599 = c2590M4626.m4599();
            this.f8257 |= zM4599;
            if (c1242 == null) {
                c2590 = c2590M4626;
                c25213 = c2527;
                if (i9 == 33) {
                    if (c25213.f4836.length != 0) {
                        c25216 = (C2525) c25213.m3062(0);
                        interfaceC3455 = c25216.f8056;
                        if (c25216.f8055 != 0) {
                            c25215 = null;
                            arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                        } else {
                            c25215 = null;
                        }
                    } else {
                        c25215 = null;
                    }
                    c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                    this.f8254 = 0;
                    c2591 = this.f8259;
                    if (c2591 == null) {
                        this.f8259 = c2590;
                        this.f8260 = c2788;
                    } else {
                        if (c2591 != c2590) {
                            throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                        }
                        if (c2788.f8907 > this.f8260.f8907) {
                            this.f8260 = c2788;
                        }
                    }
                    this.f8253 = true;
                    abstractC0779 = abstractC0777M2420;
                } else if (abstractC0777M2420 == null) {
                    abstractC0779 = abstractC0777M2420;
                    c25214 = c2525;
                    if (zM4599) {
                        InterfaceC3407 c28614 = new C2868(c2590, c2788, c25213, this.f8251);
                        this.f8252 = true;
                        if (i8 == 191) {
                            this.f8254 = -1;
                        } else {
                            this.f8254 = this.f8251.f4836.length;
                        }
                        c2352 = c28614;
                    } else {
                        c2352 = new C2351(c2590, c2788, c25214, c25213);
                    }
                } else if (zM4599) {
                    if (c2590.f8204 == 58) {
                        c2789 = c2788;
                        c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                        abstractC0779 = abstractC0777M2420;
                    } else {
                        c2789 = c2788;
                        abstractC0779 = abstractC0777M2420;
                        c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                    }
                    c2352 = c2923;
                    this.f8252 = true;
                    this.f8254 = this.f8251.f4836.length;
                    c2788 = c2789;
                } else {
                    abstractC0779 = abstractC0777M2420;
                    c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                    c2352 = c2350;
                }
            } else if (c1242.f4507 == 0) {
                c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                this.f8254 = 0;
                abstractC0779 = abstractC0777M2420;
            } else {
                C1660 c1666 = (C1660) c1242.f4508;
                c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1666);
                this.f8254 = c1666.f5610;
                abstractC0779 = abstractC0777M2420;
                c2352 = c2350;
            }
            arrayList.add(c2352);
            if (c2351 != null) {
                arrayList.add(c2351);
            }
            if (arrayList2 != null) {
                this.f8255++;
                arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
            }
        }
        this.f11056 = 0;
        i3 = this.f11056;
        if (i3 >= 0) {
            throw new C2704("results never set", null);
        }
        if (i3 != 0) {
            if (this.f11054 != null) {
                abstractC1834.mo3595(m5116(false));
            } else {
                while (i21 < this.f11056) {
                    if (this.f11053) {
                        c1243.m3925();
                        ((boolean[]) c1243.f4509)[c1243.f4507] = z3;
                    }
                    c1243.m2900(interfaceC3450Arr[i21]);
                }
            }
        }
        C0768 c0769 = this.f8246;
        c2788M2261 = c0769.m2261(i);
        interfaceC1971 = c0769.f2865;
        if (i2 == 54) {
            z = z3;
        } else {
            z = false;
        }
        c2525M5116 = m5116(z);
        i4 = this.f11056;
        if (i4 >= 0) {
            throw new C2704("results never set", null);
        }
        arrayList = this.f8250;
        if (i4 == 0) {
            if (i2 != 87) {
                return;
            } else {
                return;
            }
        }
        if (c2525M5116 == null) {
            if (i4 == z3) {
                c2596 = this.f8245;
                iM4540 = c2596.f8232 + c2596.f8230.f2867.f1493;
                if (c2596.m4613()) {
                    iM4540++;
                }
                c2525Arr = new C2525[length3];
                while (i5 < length3) {
                    C2525 c25227 = (C2525) c2526M4546.m3062(i5);
                    InterfaceC3450 interfaceC3458 = c25227.f8056;
                    C2525 c2525M4545 = c25227.m4544(iM4540);
                    arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3458), c2788M2261, c2525M4545, c25227));
                    c2525Arr[i5] = c2525M4545;
                    iM4540 += c25227.m4540();
                }
                while (i6 != 0) {
                    C2525 c25228 = c2525Arr[(i6 & 15) - 1];
                    InterfaceC3450 interfaceC3459 = c25228.f8056;
                    arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3459), c2788M2261, c25228.m4544(iM4966), c25228));
                    iM4966 += interfaceC3459.getType().m4966();
                }
                return;
            }
            if (i4 > 0) {
                throw new IllegalArgumentException("n >= resultCount");
            }
            c2525M5116 = C2525.m4532(iM4966, interfaceC3450Arr[0], null);
        }
        if (c2525M5116 != null) {
            interfaceC3450 = c2525M5116;
        } else {
            interfaceC3450 = C3448.f10874;
        }
        abstractC0777 = this.f11048;
        if (i2 == 197) {
            this.f8257 = true;
            this.f8255 = 6;
            int iM4543 = c2525M5116.m4540() + c2525M5116.f8055;
            i17 = c2525M5116.f8055;
            c3448 = C3448.f10900;
            c2525M4532 = C2525.m4532(iM4543, c3448, null);
            C2590 c2593 = AbstractC2598.f8261;
            
            c3448M4968 = c3448.m4968();
            if (!c3448M4968.m4972()) {
                AbstractC2598.m4626(c3448);
                throw null;
            }
            if (length3 >= 0) {
                throw new IllegalArgumentException("count < 0");
            }
            c2819 = new C2819(length3);
            while (i18 < length3) {
                c2819.m3063(i18, c3448M4968);
            }
            c2788 = c2788M2261;
            i7 = 6;
            arrayList.add(new C2923(new C2590(42, c2819, AbstractC1239.f4472), c2788, c2526M4546, this.f8251, C0918.f3397));
            C3448 c34413 = C3448.f10900;
            
            arrayList.add(new C2351(new C2590(55, c34413, C2819.f9030, null), c2788, c2525M4532, C2526.f8058));
            c3448M4969 = ((C0918) abstractC0777).f3401;
            while (i19 < length3) {
                c3448M4969 = c3448M4969.m4968();
            }
            C2525 c2525M4536 = C2525.m4532(i17, C3448.f10877, null);
            i20 = c3448M4969.f10905;
            switch (i20) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    ConcurrentHashMap concurrentHashMap2 = C0918.f3380;
                    switch (i20) {
                        case 0:
                            c0918 = C0918.f3390;
                            break;
                        case 1:
                            c0918 = C0918.f3382;
                            break;
                        case 2:
                            c0918 = C0918.f3383;
                            break;
                        case 3:
                            c0918 = C0918.f3384;
                            break;
                        case 4:
                            c0918 = C0918.f3385;
                            break;
                        case 5:
                            c0918 = C0918.f3386;
                            break;
                        case 6:
                            c0918 = C0918.f3388;
                            break;
                        case 7:
                            c0918 = C0918.f3387;
                            break;
                        case 8:
                            c0918 = C0918.f3389;
                            break;
                        default:
                            throw new IllegalArgumentException("not primitive: " + c3448M4969);
                    }
                    c2924 = new C2923(AbstractC2598.f8439, c2788, C2526.f8058, this.f8251, new C0899(c0918, C0914.f3373));
                    c2788 = c2788;
                    break;
                default:
                    c2924 = new C2923(AbstractC2598.f8277, c2788, C2526.f8058, this.f8251, new C0918(c3448M4969));
                    break;
            }
            arrayList.add(c2924);
            C2590 c2590M4623 = AbstractC2598.m4622(c2525M4536.f8056.getType());
            C2526 c25229 = C2526.f8058;
            arrayList.add(new C2351(c2590M4623, c2788, c2525M4536, c25229));
            C2525 c2525M4537 = C2525.m4532(i17, C3448.f10882, null);
            C0913 c0916 = f8244;
            arrayList.add(new C2923(new C2590(49, c0916.f3330.m4422(), C2819.f9037), c2788, C2526.m4547(c2525M4536, c2525M4532), this.f8251, c0916));
            C3448 c34414 = c0916.f3330.f7755;
            
            arrayList.add(new C2351(new C2590(55, c34414, C2819.f9030, null), c2788, c2525M4537, c25229));
            c2526M4546 = C2526.m4546(c2525M4537);
            i8 = 192;
        } else {
            i7 = 6;
            c2788 = c2788M2261;
            if (i2 == 168) {
                this.f8256 = true;
                return;
            } else {
                if (i2 == 169) {
                    this.f8258 = (C2587) m5114(0);
                    return;
                }
                i8 = i2;
            }
        }
        if (i8 == 0) {
            i9 = 1;
        } else if (i8 == 20) {
            i9 = 5;
        } else if (i8 == 21) {
            i9 = 2;
        } else if (i8 != 171) {
            i9 = 13;
        } else if (i8 == 172) {
            i9 = 33;
        } else if (i8 == 198) {
            i9 = 7;
        } else if (i8 != 199) {
            switch (i8) {
                case 0:
                    i9 = 1;
                    break;
                case 18 /* 18 */:
                    i9 = 5;
                    break;
                case 46 /* 46 */:
                    i9 = 38;
                    break;
                case 54 /* 54 */:
                    i9 = 2;
                    break;
                case 79 /* 79 */:
                    i9 = 39;
                    break;
                case 96 /* 96 */:
                    i9 = 14;
                    break;
                case 100:
                    i9 = 15;
                    break;
                case 104:
                    i9 = 16;
                    break;
                case 108 /* 108 */:
                    i9 = 17;
                    break;
                case 112:
                    i9 = 18;
                    break;
                case 116 /* 116 */:
                    i9 = 19;
                    break;
                case 120:
                    i9 = 23;
                    break;
                case 122:
                    i9 = 24;
                    break;
                case 124 /* 124 */:
                    i9 = 25;
                    break;
                case 126:
                    i9 = 20;
                    break;
                case 128:
                    i9 = 21;
                    break;
                case 130 /* 130 */:
                    i9 = 22;
                    break;
                default:
                    switch (i8) {
                        case 132 /* 132 */:
                            i9 = 14;
                            break;
                        case 133 /* 133 */:
                        case 134 /* 134 */:
                        case 135 /* 135 */:
                        case 136 /* 136 */:
                        case 137:
                        case 138:
                        case 139 /* 139 */:
                        case 140 /* 140 */:
                        case 141:
                        case 142 /* 142 */:
                        case 143 /* 143 */:
                        case 144:
                            i9 = 29;
                            break;
                        case 145 /* 145 */:
                            i9 = 30;
                            break;
                        case 146 /* 146 */:
                            i9 = 31;
                            break;
                        case 147 /* 147 */:
                            i9 = 32;
                            break;
                        case 148 /* 148 */:
                        case 149 /* 149 */:
                        case 151 /* 151 */:
                            i9 = 27;
                            break;
                        case 150 /* 150 */:
                        case 152 /* 152 */:
                            i9 = 28;
                            break;
                        case 153 /* 153 */:
                        case 159 /* 159 */:
                        case 165 /* 165 */:
                            i9 = 7;
                            break;
                        case 154 /* 154 */:
                        case 160 /* 160 */:
                        case 166 /* 166 */:
                            i9 = 8;
                            break;
                        case 155 /* 155 */:
                        case 161 /* 161 */:
                            i9 = 9;
                            break;
                        case 156 /* 156 */:
                        case 162 /* 162 */:
                            i9 = 10;
                            break;
                        case 157 /* 157 */:
                        case 163 /* 163 */:
                            i9 = 12;
                            break;
                        case 158 /* 158 */:
                        case 164 /* 164 */:
                            i9 = 11;
                            break;
                        case 167 /* 167 */:
                            i9 = i7;
                            break;
                        default:
                            switch (i8) {
                                case 177 /* 177 */:
                                    i9 = 33;
                                    break;
                                case 178 /* 178 */:
                                    i9 = 46;
                                    break;
                                case 179 /* 179 */:
                                    i9 = 48;
                                    break;
                                case 180 /* 180 */:
                                    i9 = 45;
                                    break;
                                case 181 /* 181 */:
                                    i9 = 47;
                                    break;
                                case 182 /* 182 */:
                                    c0913 = (C0913) abstractC0777;
                                    if (c0913.f3368.equals(interfaceC1971.mo2258())) {
                                        i15 = 0;
                                        while (true) {
                                            c0442 = this.f8247;
                                            if (i15 < c0442.f4836.length) {
                                                interfaceC1972 = (InterfaceC1971) c0442.m3062(i15);
                                                if ((interfaceC1972.mo2259() & 2) == 0) {
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    if (c0913.m2410()) {
                                        i9 = 58;
                                    } else {
                                        i9 = 50;
                                    }
                                    break;
                                case 183 /* 183 */:
                                    c0914 = (C0913) abstractC0777;
                                    if (!c0914.f3369.f3374.f3378.equals("<init>")) {
                                    }
                                    i9 = 52;
                                    break;
                                case 184 /* 184 */:
                                    i9 = 49;
                                    break;
                                case 185 /* 185 */:
                                    i16 = 53;
                                    i9 = i16;
                                    break;
                                case 186:
                                    i9 = 59;
                                    break;
                                case 187 /* 187 */:
                                    i16 = 40;
                                    i9 = i16;
                                    break;
                                case 188 /* 188 */:
                                case 189 /* 189 */:
                                    i9 = 41;
                                    break;
                                case 190 /* 190 */:
                                    i16 = 34;
                                    i9 = i16;
                                    break;
                                case 191 /* 191 */:
                                    i16 = 35;
                                    i9 = i16;
                                    break;
                                case 192 /* 192 */:
                                    i16 = 43;
                                    i9 = i16;
                                    break;
                                case 193 /* 193 */:
                                    i16 = 44;
                                    i9 = i16;
                                    break;
                                case 194 /* 194 */:
                                    i16 = 36;
                                    i9 = i16;
                                    break;
                                case 195 /* 195 */:
                                    i16 = 37;
                                    i9 = i16;
                                    break;
                                default:
                                    throw new RuntimeException("shouldn't happen");
                            }
                            break;
                    }
                    break;
            }
        } else {
            i9 = 8;
        }
        c2590M4625 = AbstractC2598.m4625(i9, interfaceC3450, c2526M4546, abstractC0777);
        if (c2525M5116 != null) {
            abstractC0778 = abstractC0777;
            if (c2525M5116 == null) {
            }
            c2525 = c2525M5116;
            i10 = 41;
            c2351 = null;
        } else {
            abstractC0778 = abstractC0777;
            if (c2525M5116 == null) {
            }
            c2525 = c2525M5116;
            i10 = 41;
            c2351 = null;
        }
        if (i9 != i10) {
            if (abstractC0778 == null) {
                interfaceC3451 = ((C2525) c2526M4546.m3062(0)).f8056;
                interfaceC3452 = ((C2525) c2526M4546.m3062(1)).f8056;
                if (interfaceC3452.mo4534()) {
                    C2525 c252210 = (C2525) c2526M4546.m3062(0);
                    c2528 = (C2525) c2526M4546.m3062(1);
                    
                    interfaceC3453 = c252210.f8056;
                    if (interfaceC3453.getType() == C3448.f10871) {
                        interfaceC3454 = c2528.f8056;
                        if (interfaceC3454 instanceof C0903) {
                            c0903 = (C0903) interfaceC3454;
                            i14 = c0903.f3364;
                            switch (c2590M4625.f8204) {
                                case 14 /* 14 */:
                                case 16:
                                case 17 /* 17 */:
                                case 18 /* 18 */:
                                case 20:
                                case 21 /* 21 */:
                                case 22 /* 22 */:
                                    iMo2424 = c0903.mo2424();
                                    if (((short) iMo2424) == iMo2424) {
                                    }
                                    break;
                                case 15:
                                    iMo2425 = C0903.m2420(-i14).mo2424();
                                    if (((short) iMo2425) == iMo2425) {
                                    }
                                    break;
                                case 19:
                                default:
                                    break;
                                case 23 /* 23 */:
                                case 24 /* 24 */:
                                case 25 /* 25 */:
                                    if (((byte) i14) == i14) {
                                    }
                                    break;
                            }
                        } else if (interfaceC3453 instanceof C0903) {
                            int iMo2429 = ((C0903) interfaceC3453).mo2424();
                            if (((short) iMo2429) == iMo2429) {
                            }
                        }
                    }
                    if (z2) {
                        if (interfaceC3452.mo4534()) {
                            abstractC0777M2420 = (AbstractC0777) interfaceC3452;
                            length2 = c2526M4546.f4836.length - 1;
                            if (length2 == 0) {
                                c25212 = C2526.f8058;
                            } else {
                                c25211 = new C2526(length2);
                                while (i13 < length2) {
                                    c25211.m3063(i13, c2526M4546.m3062(i13));
                                }
                                if (!c2526M4546.f6944) {
                                    c25211.f6944 = false;
                                }
                                c25212 = c25211;
                            }
                            if (c2590M4625.f8204 == 15) {
                                abstractC0777M2420 = C0903.m2420(-((C0903) interfaceC3452).f3364);
                                c2526M4546 = c25212;
                                i12 = 14;
                            } else {
                                c2526M4546 = c25212;
                                i12 = i9;
                            }
                        } else {
                            abstractC0777M2420 = (AbstractC0777) interfaceC3451;
                            length = c2526M4546.f4836.length - 1;
                            if (length == 0) {
                                c25210 = C2526.f8058;
                            } else {
                                c2529 = new C2526(length);
                                i11 = 0;
                                while (i11 < length) {
                                    int i211 = i11 + 1;
                                    c2529.m3063(i11, c2526M4546.m3062(i211));
                                    i11 = i211;
                                }
                                if (!c2526M4546.f6944) {
                                    c2529.f6944 = false;
                                }
                                c25210 = c2529;
                            }
                            i12 = i9;
                            c2526M4546 = c25210;
                        }
                        c2590M4626 = AbstractC2598.m4625(i12, interfaceC3450, c2526M4546, abstractC0777M2420);
                        i9 = i12;
                    }
                    c1242 = this.f11050;
                    arrayList2 = this.f11051;
                    zM4599 = c2590M4626.m4599();
                    this.f8257 |= zM4599;
                    if (c1242 == null) {
                        c2590 = c2590M4626;
                        c25213 = c2527;
                        if (i9 == 33) {
                            if (c25213.f4836.length != 0) {
                                c25216 = (C2525) c25213.m3062(0);
                                interfaceC3455 = c25216.f8056;
                                if (c25216.f8055 != 0) {
                                    c25215 = null;
                                    arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                                } else {
                                    c25215 = null;
                                }
                            } else {
                                c25215 = null;
                            }
                            c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                            this.f8254 = 0;
                            c2591 = this.f8259;
                            if (c2591 == null) {
                                this.f8259 = c2590;
                                this.f8260 = c2788;
                            } else {
                                if (c2591 != c2590) {
                                    throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                                }
                                if (c2788.f8907 > this.f8260.f8907) {
                                    this.f8260 = c2788;
                                }
                            }
                            this.f8253 = true;
                            abstractC0779 = abstractC0777M2420;
                        } else if (abstractC0777M2420 == null) {
                            abstractC0779 = abstractC0777M2420;
                            c25214 = c2525;
                            if (zM4599) {
                                InterfaceC3407 c28615 = new C2868(c2590, c2788, c25213, this.f8251);
                                this.f8252 = true;
                                if (i8 == 191) {
                                    this.f8254 = -1;
                                } else {
                                    this.f8254 = this.f8251.f4836.length;
                                }
                                c2352 = c28615;
                            } else {
                                c2352 = new C2351(c2590, c2788, c25214, c25213);
                            }
                        } else if (zM4599) {
                            if (c2590.f8204 == 58) {
                                c2789 = c2788;
                                c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                                abstractC0779 = abstractC0777M2420;
                            } else {
                                c2789 = c2788;
                                abstractC0779 = abstractC0777M2420;
                                c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                            }
                            c2352 = c2923;
                            this.f8252 = true;
                            this.f8254 = this.f8251.f4836.length;
                            c2788 = c2789;
                        } else {
                            abstractC0779 = abstractC0777M2420;
                            c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                            c2352 = c2350;
                        }
                    } else if (c1242.f4507 == 0) {
                        c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                        this.f8254 = 0;
                        abstractC0779 = abstractC0777M2420;
                    } else {
                        C1660 c1667 = (C1660) c1242.f4508;
                        c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1667);
                        this.f8254 = c1667.f5610;
                        abstractC0779 = abstractC0777M2420;
                        c2352 = c2350;
                    }
                    arrayList.add(c2352);
                    if (c2351 != null) {
                        arrayList.add(c2351);
                    }
                    if (arrayList2 != null) {
                        this.f8255++;
                        arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                    }
                }
                C2525 c252211 = (C2525) c2526M4546.m3062(0);
                c2528 = (C2525) c2526M4546.m3062(1);
                
                interfaceC3453 = c252211.f8056;
                if (interfaceC3453.getType() == C3448.f10871) {
                    interfaceC3454 = c2528.f8056;
                    if (interfaceC3454 instanceof C0903) {
                        c0903 = (C0903) interfaceC3454;
                        i14 = c0903.f3364;
                        switch (c2590M4625.f8204) {
                            case 14 /* 14 */:
                            case 16:
                            case 17 /* 17 */:
                            case 18 /* 18 */:
                            case 20:
                            case 21 /* 21 */:
                            case 22 /* 22 */:
                                iMo2424 = c0903.mo2424();
                                if (((short) iMo2424) == iMo2424) {
                                }
                                break;
                            case 15:
                                iMo2425 = C0903.m2420(-i14).mo2424();
                                if (((short) iMo2425) == iMo2425) {
                                }
                                break;
                            case 19:
                            default:
                                break;
                            case 23 /* 23 */:
                            case 24 /* 24 */:
                            case 25 /* 25 */:
                                if (((byte) i14) == i14) {
                                }
                                break;
                        }
                    } else if (interfaceC3453 instanceof C0903) {
                        int iMo24210 = ((C0903) interfaceC3453).mo2424();
                        if (((short) iMo24210) == iMo24210) {
                        }
                    }
                }
                if (z2) {
                    if (interfaceC3452.mo4534()) {
                        abstractC0777M2420 = (AbstractC0777) interfaceC3452;
                        length2 = c2526M4546.f4836.length - 1;
                        if (length2 == 0) {
                            c25212 = C2526.f8058;
                        } else {
                            c25211 = new C2526(length2);
                            while (i13 < length2) {
                                c25211.m3063(i13, c2526M4546.m3062(i13));
                            }
                            if (!c2526M4546.f6944) {
                                c25211.f6944 = false;
                            }
                            c25212 = c25211;
                        }
                        if (c2590M4625.f8204 == 15) {
                            abstractC0777M2420 = C0903.m2420(-((C0903) interfaceC3452).f3364);
                            c2526M4546 = c25212;
                            i12 = 14;
                        } else {
                            c2526M4546 = c25212;
                            i12 = i9;
                        }
                    } else {
                        abstractC0777M2420 = (AbstractC0777) interfaceC3451;
                        length = c2526M4546.f4836.length - 1;
                        if (length == 0) {
                            c25210 = C2526.f8058;
                        } else {
                            c2529 = new C2526(length);
                            i11 = 0;
                            while (i11 < length) {
                                int i212 = i11 + 1;
                                c2529.m3063(i11, c2526M4546.m3062(i212));
                                i11 = i212;
                            }
                            if (!c2526M4546.f6944) {
                                c2529.f6944 = false;
                            }
                            c25210 = c2529;
                        }
                        i12 = i9;
                        c2526M4546 = c25210;
                    }
                    c2590M4626 = AbstractC2598.m4625(i12, interfaceC3450, c2526M4546, abstractC0777M2420);
                    i9 = i12;
                }
                c1242 = this.f11050;
                arrayList2 = this.f11051;
                zM4599 = c2590M4626.m4599();
                this.f8257 |= zM4599;
                if (c1242 == null) {
                    c2590 = c2590M4626;
                    c25213 = c2527;
                    if (i9 == 33) {
                        if (c25213.f4836.length != 0) {
                            c25216 = (C2525) c25213.m3062(0);
                            interfaceC3455 = c25216.f8056;
                            if (c25216.f8055 != 0) {
                                c25215 = null;
                                arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                            } else {
                                c25215 = null;
                            }
                        } else {
                            c25215 = null;
                        }
                        c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                        this.f8254 = 0;
                        c2591 = this.f8259;
                        if (c2591 == null) {
                            this.f8259 = c2590;
                            this.f8260 = c2788;
                        } else {
                            if (c2591 != c2590) {
                                throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                            }
                            if (c2788.f8907 > this.f8260.f8907) {
                                this.f8260 = c2788;
                            }
                        }
                        this.f8253 = true;
                        abstractC0779 = abstractC0777M2420;
                    } else if (abstractC0777M2420 == null) {
                        abstractC0779 = abstractC0777M2420;
                        c25214 = c2525;
                        if (zM4599) {
                            InterfaceC3407 c28616 = new C2868(c2590, c2788, c25213, this.f8251);
                            this.f8252 = true;
                            if (i8 == 191) {
                                this.f8254 = -1;
                            } else {
                                this.f8254 = this.f8251.f4836.length;
                            }
                            c2352 = c28616;
                        } else {
                            c2352 = new C2351(c2590, c2788, c25214, c25213);
                        }
                    } else if (zM4599) {
                        if (c2590.f8204 == 58) {
                            c2789 = c2788;
                            c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                            abstractC0779 = abstractC0777M2420;
                        } else {
                            c2789 = c2788;
                            abstractC0779 = abstractC0777M2420;
                            c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                        }
                        c2352 = c2923;
                        this.f8252 = true;
                        this.f8254 = this.f8251.f4836.length;
                        c2788 = c2789;
                    } else {
                        abstractC0779 = abstractC0777M2420;
                        c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                        c2352 = c2350;
                    }
                } else if (c1242.f4507 == 0) {
                    c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                    this.f8254 = 0;
                    abstractC0779 = abstractC0777M2420;
                } else {
                    C1660 c1668 = (C1660) c1242.f4508;
                    c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1668);
                    this.f8254 = c1668.f5610;
                    abstractC0779 = abstractC0777M2420;
                    c2352 = c2350;
                }
                arrayList.add(c2352);
                if (c2351 != null) {
                    arrayList.add(c2351);
                }
                if (arrayList2 != null) {
                    this.f8255++;
                    arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
                }
            }
            c2590M4626 = c2590M4625;
            c2527 = c2526M4546;
            abstractC0777M2420 = abstractC0778;
            c1242 = this.f11050;
            arrayList2 = this.f11051;
            zM4599 = c2590M4626.m4599();
            this.f8257 |= zM4599;
            if (c1242 == null) {
                c2590 = c2590M4626;
                c25213 = c2527;
                if (i9 == 33) {
                    if (c25213.f4836.length != 0) {
                        c25216 = (C2525) c25213.m3062(0);
                        interfaceC3455 = c25216.f8056;
                        if (c25216.f8055 != 0) {
                            c25215 = null;
                            arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                        } else {
                            c25215 = null;
                        }
                    } else {
                        c25215 = null;
                    }
                    c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                    this.f8254 = 0;
                    c2591 = this.f8259;
                    if (c2591 == null) {
                        this.f8259 = c2590;
                        this.f8260 = c2788;
                    } else {
                        if (c2591 != c2590) {
                            throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                        }
                        if (c2788.f8907 > this.f8260.f8907) {
                            this.f8260 = c2788;
                        }
                    }
                    this.f8253 = true;
                    abstractC0779 = abstractC0777M2420;
                } else if (abstractC0777M2420 == null) {
                    abstractC0779 = abstractC0777M2420;
                    c25214 = c2525;
                    if (zM4599) {
                        InterfaceC3407 c28617 = new C2868(c2590, c2788, c25213, this.f8251);
                        this.f8252 = true;
                        if (i8 == 191) {
                            this.f8254 = -1;
                        } else {
                            this.f8254 = this.f8251.f4836.length;
                        }
                        c2352 = c28617;
                    } else {
                        c2352 = new C2351(c2590, c2788, c25214, c25213);
                    }
                } else if (zM4599) {
                    if (c2590.f8204 == 58) {
                        c2789 = c2788;
                        c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                        abstractC0779 = abstractC0777M2420;
                    } else {
                        c2789 = c2788;
                        abstractC0779 = abstractC0777M2420;
                        c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                    }
                    c2352 = c2923;
                    this.f8252 = true;
                    this.f8254 = this.f8251.f4836.length;
                    c2788 = c2789;
                } else {
                    abstractC0779 = abstractC0777M2420;
                    c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                    c2352 = c2350;
                }
            } else if (c1242.f4507 == 0) {
                c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
                this.f8254 = 0;
                abstractC0779 = abstractC0777M2420;
            } else {
                C1660 c1669 = (C1660) c1242.f4508;
                c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c1669);
                this.f8254 = c1669.f5610;
                abstractC0779 = abstractC0777M2420;
                c2352 = c2350;
            }
            arrayList.add(c2352);
            if (c2351 != null) {
                arrayList.add(c2351);
            }
            if (arrayList2 != null) {
                this.f8255++;
                arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
            }
        }
        abstractC0777M2420 = C0918.m2431(c2590M4625.f8205);
        c2590M4626 = c2590M4625;
        c2527 = c2526M4546;
        c1242 = this.f11050;
        arrayList2 = this.f11051;
        zM4599 = c2590M4626.m4599();
        this.f8257 |= zM4599;
        if (c1242 == null) {
            c2590 = c2590M4626;
            c25213 = c2527;
            if (i9 == 33) {
                if (c25213.f4836.length != 0) {
                    c25216 = (C2525) c25213.m3062(0);
                    interfaceC3455 = c25216.f8056;
                    if (c25216.f8055 != 0) {
                        c25215 = null;
                        arrayList.add(new C2351(AbstractC2598.m4620(interfaceC3455), c2788, C2525.m4532(0, interfaceC3455, null), c25216));
                    } else {
                        c25215 = null;
                    }
                } else {
                    c25215 = null;
                }
                c2352 = new C2351(AbstractC2598.f8279, c2788, c25215, C2526.f8058);
                this.f8254 = 0;
                c2591 = this.f8259;
                if (c2591 == null) {
                    this.f8259 = c2590;
                    this.f8260 = c2788;
                } else {
                    if (c2591 != c2590) {
                        throw new C2704("return op mismatch: " + c2590 + ", " + this.f8259, null);
                    }
                    if (c2788.f8907 > this.f8260.f8907) {
                        this.f8260 = c2788;
                    }
                }
                this.f8253 = true;
                abstractC0779 = abstractC0777M2420;
            } else if (abstractC0777M2420 == null) {
                abstractC0779 = abstractC0777M2420;
                c25214 = c2525;
                if (zM4599) {
                    InterfaceC3407 c28618 = new C2868(c2590, c2788, c25213, this.f8251);
                    this.f8252 = true;
                    if (i8 == 191) {
                        this.f8254 = -1;
                    } else {
                        this.f8254 = this.f8251.f4836.length;
                    }
                    c2352 = c28618;
                } else {
                    c2352 = new C2351(c2590, c2788, c25214, c25213);
                }
            } else if (zM4599) {
                if (c2590.f8204 == 58) {
                    c2789 = c2788;
                    c2923 = new C1674(c2590, c2789, c25213, this.f8251, (C0913) abstractC0777M2420);
                    abstractC0779 = abstractC0777M2420;
                } else {
                    c2789 = c2788;
                    abstractC0779 = abstractC0777M2420;
                    c2923 = new C2923(c2590, c2789, c25213, this.f8251, abstractC0779);
                }
                c2352 = c2923;
                this.f8252 = true;
                this.f8254 = this.f8251.f4836.length;
                c2788 = c2789;
            } else {
                abstractC0779 = abstractC0777M2420;
                c2350 = new C2350(c2590, c2788, c2525, c25213, abstractC0779);
                c2352 = c2350;
            }
        } else if (c1242.f4507 == 0) {
            c2352 = new C2351(AbstractC2598.f8279, c2788, (C2525) null, C2526.f8058);
            this.f8254 = 0;
            abstractC0779 = abstractC0777M2420;
        } else {
            C1660 c16610 = (C1660) c1242.f4508;
            c2350 = new C2868(c2590M4626, c2788, c2525, c2527, c16610);
            this.f8254 = c16610.f5610;
            abstractC0779 = abstractC0777M2420;
            c2352 = c2350;
        }
        arrayList.add(c2352);
        if (c2351 != null) {
            arrayList.add(c2351);
        }
        if (arrayList2 != null) {
            this.f8255++;
            arrayList.add(new C1329(AbstractC2598.f8462, c2788, C2526.m4546(c2351.f5590), arrayList2, abstractC0779));
        }
    }
}
