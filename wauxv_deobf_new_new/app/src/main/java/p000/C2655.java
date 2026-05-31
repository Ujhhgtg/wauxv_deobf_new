package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2655 extends AbstractC3589 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final C0912 f8396 = new C0912(new C0917(C3505.m5024("java/lang/reflect/Array")), new C0913(new C0916("newInstance"), new C0916("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2654 f8397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C0766 f8398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C0417 f8399;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C1139 f8400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int f8401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final ArrayList f8402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C2879 f8403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f8404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f8405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f8406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f8407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f8408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public boolean f8409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C2643 f8410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public C2648 f8411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public C2848 f8412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2655(C2654 c2654, C0766 c0766, C0417 c0417) {
        super(c0766.f2867.mo2358());
        C1139 c1139 = C1139.f4216;
        if (c0417 == null) {
            throw new NullPointerException("methods == null");
        }
        this.f8397 = c2654;
        this.f8398 = c0766;
        this.f8399 = c0417;
        this.f8400 = c1139;
        this.f8401 = c0766.f2869.f1568;
        this.f8402 = new ArrayList(25);
        this.f8403 = null;
        this.f8404 = false;
        this.f8405 = false;
        this.f8406 = -1;
        this.f8407 = 0;
        this.f8409 = false;
        this.f8411 = null;
        this.f8412 = null;
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
    public final void m4649(C0253 c0253, int i, int i2) {
        C2582 c2582;
        int i3;
        C2848 c2848M2362;
        InterfaceC2002 interfaceC2002;
        boolean z;
        C2581 c2581M5128;
        int i4;
        ArrayList arrayList;
        C2654 c2654;
        int iM4562;
        C2581[] c2581Arr;
        int i5;
        int i6;
        InterfaceC3507 interfaceC3507;
        AbstractC0775 abstractC0775;
        int i7;
        C2848 c2848;
        int i8;
        int i9;
        C2648 c2648M4655;
        AbstractC0775 abstractC0776;
        C2581 c2581;
        int i10;
        C2396 c2396;
        C2648 c2648M4656;
        C2582 c2583;
        AbstractC0775 abstractC0775M2537;
        InterfaceC3507 interfaceC3508;
        InterfaceC3507 interfaceC3509;
        C2581 c2584;
        InterfaceC3507 interfaceC35010;
        boolean z2;
        int length;
        C2582 c2585;
        int i11;
        C2582 c2586;
        int i12;
        int length2;
        C2582 c2587;
        int i13;
        C2582 c2588;
        InterfaceC3507 interfaceC35011;
        C0902 c0902;
        int i14;
        int iMo2541;
        int iMo2542;
        C1244 c1244;
        ArrayList arrayList2;
        boolean zM4629;
        C2648 c2648;
        C2582 c2589;
        AbstractC0775 abstractC0777;
        C2581 c25810;
        AbstractC1663 c2397;
        AbstractC1663 c2395;
        C2848 c2849;
        AbstractC1663 c2982;
        C2581 c25811;
        C2648 c2649;
        C2581 c25812;
        InterfaceC3507 interfaceC35012;
        C0912 c0912;
        int i15;
        C0417 c0417;
        InterfaceC2002 interfaceC2003;
        C0912 c0913;
        int i16;
        int i17;
        C3505 c3505;
        C2581 c2581M4554;
        C3505 c3505M5030;
        C2879 c2879;
        int i18;
        C3505 c3505M5031;
        int i19;
        int i20;
        C0917 c0917;
        C2982 c2983;
        int i21;
        C1244 c1245 = (C1244) c0253.f1479;
        AbstractC1861 abstractC1861 = (AbstractC1861) c0253.f1478;
        int iM5028 = this.f8401 + c1245.f4506;
        int i22 = this.f11200;
        boolean z3 = true;
        if (i22 == 0) {
            c2582 = C2582.f8208;
        } else {
            int i23 = this.f11207;
            if (i23 >= 0) {
                c2582 = new C2582(1);
                c2582.m3166(0, C2581.m4554(i23, m5126(0), null));
            } else {
                C2582 c25813 = new C2582(i22);
                int iM4563 = iM5028;
                for (int i24 = 0; i24 < i22; i24++) {
                    C2581 c2581M4555 = C2581.m4554(iM4563, m5126(i24), null);
                    c25813.m3166(i24, c2581M4555);
                    iM4563 += c2581M4555.m4562();
                }
                if (i2 == 79) {
                    if (i22 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C2581 c25814 = (C2581) c25813.m3165(0);
                    C2581 c25815 = (C2581) c25813.m3165(1);
                    c25813.m3166(0, (C2581) c25813.m3165(2));
                    c25813.m3166(1, c25814);
                    c25813.m3166(2, c25815);
                } else if (i2 == 181) {
                    if (i22 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C2581 c25816 = (C2581) c25813.m3165(0);
                    c25813.m3166(0, (C2581) c25813.m3165(1));
                    c25813.m3166(1, c25816);
                }
                c2582 = c25813;
            }
            c2582.f7068 = false;
        }
        C2582 c2582M4568 = c2582;
        int length3 = c2582M4568.f4833.length;
        InterfaceC3507[] interfaceC3507Arr = this.f11210;
        if (i2 != 0) {
            if (i2 == 20) {
                z3 = true;
                m5133((InterfaceC3507) this.f11203);
            } else if (i2 == 21) {
                z3 = true;
                m5133(m5126(0));
            } else if (i2 != 171 && i2 != 172) {
                switch (i2) {
                    case 0:
                    case Opcodes.IASTORE /* 79 */:
                        break;
                    case Opcodes.LDC /* 18 */:
                        z3 = true;
                        m5133((InterfaceC3507) this.f11203);
                        break;
                    case Opcodes.IALOAD /* 46 */:
                    case 100:
                    case 104:
                    case Opcodes.IDIV /* 108 */:
                    case 112:
                    case Opcodes.INEG /* 116 */:
                    case 120:
                    case 122:
                    case Opcodes.IUSHR /* 124 */:
                    case 126:
                    case 128:
                    case Opcodes.IXOR /* 130 */:
                        z3 = true;
                        m5133(this.f11201);
                        break;
                    case Opcodes.ISTORE /* 54 */:
                        z3 = true;
                        m5133(m5126(0));
                        break;
                    default:
                        switch (i2) {
                            case Opcodes.POP /* 87 */:
                            case Opcodes.POP2 /* 88 */:
                                break;
                            case Opcodes.DUP /* 89 */:
                            case 90:
                            case 91:
                            case Opcodes.DUP2 /* 92 */:
                            case 93:
                            case 94:
                            case Opcodes.SWAP /* 95 */:
                                z3 = true;
                                this.f11211 = 0;
                                for (int i25 = this.f11202; i25 != 0; i25 >>= 4) {
                                    InterfaceC3507 interfaceC3507M5126 = m5126((i25 & 15) - 1);
                                    if (interfaceC3507M5126 == null) {
                                        throw new NullPointerException("result == null");
                                    }
                                    int i26 = this.f11211;
                                    interfaceC3507Arr[i26] = interfaceC3507M5126;
                                    this.f11211 = i26 + 1;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case Opcodes.IINC /* 132 */:
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.I2F /* 134 */:
                                    case Opcodes.I2D /* 135 */:
                                    case Opcodes.L2I /* 136 */:
                                    case 137:
                                    case 138:
                                    case Opcodes.F2I /* 139 */:
                                    case Opcodes.F2L /* 140 */:
                                    case 141:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.D2L /* 143 */:
                                    case 144:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case Opcodes.FCMPG /* 150 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        break;
                                    case Opcodes.IFEQ /* 153 */:
                                    case Opcodes.IFNE /* 154 */:
                                    case Opcodes.IFLT /* 155 */:
                                    case Opcodes.IFGE /* 156 */:
                                    case Opcodes.IFGT /* 157 */:
                                    case Opcodes.IFLE /* 158 */:
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case Opcodes.IF_ICMPNE /* 160 */:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RET /* 169 */:
                                        break;
                                    case Opcodes.JSR /* 168 */:
                                        z3 = true;
                                        m5133(new C2643(this.f11204));
                                        break;
                                    default:
                                        switch (i2) {
                                            case Opcodes.RETURN /* 177 */:
                                            case Opcodes.PUTSTATIC /* 179 */:
                                            case Opcodes.PUTFIELD /* 181 */:
                                            case Opcodes.ATHROW /* 191 */:
                                            case Opcodes.MONITORENTER /* 194 */:
                                            case Opcodes.MONITOREXIT /* 195 */:
                                                break;
                                            case Opcodes.GETSTATIC /* 178 */:
                                            case Opcodes.GETFIELD /* 180 */:
                                            case Opcodes.INVOKEVIRTUAL /* 182 */:
                                            case Opcodes.INVOKESTATIC /* 184 */:
                                            case Opcodes.INVOKEINTERFACE /* 185 */:
                                                z3 = true;
                                                C3505 type = ((InterfaceC3507) this.f11203).getType();
                                                if (type == C3505.f11034) {
                                                    this.f11211 = 0;
                                                } else {
                                                    m5133(type);
                                                }
                                                break;
                                            case Opcodes.INVOKESPECIAL /* 183 */:
                                                C3505 type2 = m5126(0).getType();
                                                if (type2.f11066 >= 0) {
                                                    abstractC1861.mo3769(type2);
                                                    if (c1245.f4506 != 0) {
                                                        c1245.m4109();
                                                        C3505 c3505M5032 = type2.m5031();
                                                        int i27 = 0;
                                                        while (i27 < c1245.f4506) {
                                                            InterfaceC3507[] interfaceC3507Arr2 = (InterfaceC3507[]) c1245.f4507;
                                                            boolean z4 = z3;
                                                            if (interfaceC3507Arr2[i27] == type2) {
                                                                interfaceC3507Arr2[i27] = c3505M5032;
                                                            }
                                                            i27++;
                                                            z3 = z4;
                                                        }
                                                    }
                                                }
                                                z3 = z3;
                                                C3505 type3 = ((InterfaceC3507) this.f11203).getType();
                                                if (type3 == C3505.f11034) {
                                                    this.f11211 = 0;
                                                } else {
                                                    m5133(type3);
                                                }
                                                break;
                                            case 186:
                                                C3505 c3506 = ((C0894) this.f11203).f3342.f3366.f7899;
                                                if (c3506 == C3505.f11034) {
                                                    this.f11211 = 0;
                                                } else {
                                                    m5133(c3506);
                                                }
                                                z3 = true;
                                                break;
                                            case Opcodes.NEW /* 187 */:
                                                m5133(((C0917) this.f11203).f3408.m5026(i));
                                                z3 = true;
                                                break;
                                            case Opcodes.NEWARRAY /* 188 */:
                                            case Opcodes.CHECKCAST /* 192 */:
                                                m5133(((C0917) this.f11203).f3408);
                                                z3 = true;
                                                break;
                                            case Opcodes.ANEWARRAY /* 189 */:
                                                m5133(((C0917) this.f11203).f3408.m5027());
                                                z3 = true;
                                                break;
                                            case Opcodes.ARRAYLENGTH /* 190 */:
                                                break;
                                            case Opcodes.INSTANCEOF /* 193 */:
                                                m5133(C3505.f11031);
                                                z3 = true;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 197:
                                                        m5133(((C0917) this.f11203).f3408);
                                                        z3 = true;
                                                        break;
                                                    case Opcodes.IFNULL /* 198 */:
                                                    case Opcodes.IFNONNULL /* 199 */:
                                                        break;
                                                    default:
                                                        throw new RuntimeException("shouldn't happen: ".concat(AbstractC2902.m4905(i2)));
                                                }
                                                break;
                                        }
                                        break;
                                }
                            case Opcodes.IADD /* 96 */:
                                z3 = true;
                                m5133(this.f11201);
                                break;
                        }
                        break;
                }
            }
            i3 = this.f11211;
            if (i3 >= 0) {
                throw new C2766("results never set", null);
            }
            if (i3 != 0) {
                if (this.f11209 != null) {
                    abstractC1861.mo3773(m5128(false));
                } else {
                    for (i21 = 0; i21 < this.f11211; i21++) {
                        if (this.f11208) {
                            c1245.m4109();
                            ((boolean[]) c1245.f4508)[c1245.f4506] = z3;
                        }
                        c1245.m3019(interfaceC3507Arr[i21]);
                    }
                }
            }
            C0766 c0766 = this.f8398;
            c2848M2362 = c0766.m2362(i);
            interfaceC2002 = c0766.f2867;
            if (i2 == 54) {
                z = z3;
            } else {
                z = false;
            }
            c2581M5128 = m5128(z);
            i4 = this.f11211;
            if (i4 >= 0) {
                throw new C2766("results never set", null);
            }
            arrayList = this.f8402;
            if (i4 == 0) {
                if (i2 != 87 || i2 == 88) {
                    return;
                } else {
                    c2581M5128 = null;
                }
            } else if (c2581M5128 == null) {
                if (i4 == z3) {
                    c2654 = this.f8397;
                    iM4562 = c2654.f8384 + c2654.f8382.f2869.f1567;
                    if (c2654.m4643()) {
                        iM4562++;
                    }
                    c2581Arr = new C2581[length3];
                    for (i5 = 0; i5 < length3; i5++) {
                        C2581 c25817 = (C2581) c2582M4568.m3165(i5);
                        InterfaceC3507 interfaceC35013 = c25817.f8206;
                        C2581 c2581M4566 = c25817.m4566(iM4562);
                        arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35013), c2848M2362, c2581M4566, c25817));
                        c2581Arr[i5] = c2581M4566;
                        iM4562 += c25817.m4562();
                    }
                    for (i6 = this.f11202; i6 != 0; i6 >>= 4) {
                        C2581 c25818 = c2581Arr[(i6 & 15) - 1];
                        InterfaceC3507 interfaceC35014 = c25818.f8206;
                        arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35014), c2848M2362, c25818.m4566(iM5028), c25818));
                        iM5028 += interfaceC35014.getType().m5028();
                    }
                    return;
                }
                if (i4 > 0) {
                    throw new IllegalArgumentException("n >= resultCount");
                }
                try {
                    c2581M5128 = C2581.m4554(iM5028, interfaceC3507Arr[0], null);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("n < 0");
                }
            }
            if (c2581M5128 != null) {
                interfaceC3507 = c2581M5128;
            } else {
                interfaceC3507 = C3505.f11034;
            }
            abstractC0775 = this.f11203;
            if (i2 == 197) {
                this.f8409 = true;
                this.f8407 = 6;
                int iM4564 = c2581M5128.m4562() + c2581M5128.f8205;
                i17 = c2581M5128.f8205;
                c3505 = C3505.f11060;
                c2581M4554 = C2581.m4554(iM4564, c3505, null);
                C2648 c26410 = AbstractC2656.f8413;
                c3505.getClass();
                c3505M5030 = c3505.m5030();
                if (!c3505M5030.m5034()) {
                    AbstractC2656.m4656(c3505);
                    throw null;
                }
                if (length3 >= 0) {
                    throw new IllegalArgumentException("count < 0");
                }
                c2879 = new C2879(length3);
                for (i18 = 0; i18 < length3; i18++) {
                    c2879.m3166(i18, c3505M5030);
                }
                c2848 = c2848M2362;
                i7 = 6;
                arrayList.add(new C2982(new C2648(42, c2879, AbstractC1241.f4471), c2848, c2582M4568, this.f8403, C0917.f3404));
                C3505 c3507 = C3505.f11060;
                c3507.getClass();
                arrayList.add(new C2396(new C2648(55, c3507, C2879.f9192, null), c2848, c2581M4554, C2582.f8208));
                c3505M5031 = ((C0917) abstractC0775).f3408;
                for (i19 = 0; i19 < length3; i19++) {
                    c3505M5031 = c3505M5031.m5030();
                }
                C2581 c2581M4556 = C2581.m4554(i17, C3505.f11037, null);
                i20 = c3505M5031.f11065;
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
                        ConcurrentHashMap concurrentHashMap = C0917.f3387;
                        switch (i20) {
                            case 0:
                                c0917 = C0917.f3397;
                                break;
                            case 1:
                                c0917 = C0917.f3389;
                                break;
                            case 2:
                                c0917 = C0917.f3390;
                                break;
                            case 3:
                                c0917 = C0917.f3391;
                                break;
                            case 4:
                                c0917 = C0917.f3392;
                                break;
                            case 5:
                                c0917 = C0917.f3393;
                                break;
                            case 6:
                                c0917 = C0917.f3395;
                                break;
                            case 7:
                                c0917 = C0917.f3394;
                                break;
                            case 8:
                                c0917 = C0917.f3396;
                                break;
                            default:
                                throw new IllegalArgumentException("not primitive: " + c3505M5031);
                        }
                        c2983 = new C2982(AbstractC2656.f8591, c2848, C2582.f8208, this.f8403, new C0898(c0917, C0913.f3380));
                        c2848 = c2848;
                        break;
                    default:
                        c2983 = new C2982(AbstractC2656.f8429, c2848, C2582.f8208, this.f8403, new C0917(c3505M5031));
                        break;
                }
                arrayList.add(c2983);
                C2648 c2648M4652 = AbstractC2656.m4652(c2581M4556.f8206.getType());
                C2582 c25819 = C2582.f8208;
                arrayList.add(new C2396(c2648M4652, c2848, c2581M4556, c25819));
                C2581 c2581M4557 = C2581.m4554(i17, C3505.f11042, null);
                C0912 c0914 = f8396;
                arrayList.add(new C2982(new C2648(49, c0914.f3337.m4443(), C2879.f9199), c2848, C2582.m4569(c2581M4556, c2581M4554), this.f8403, c0914));
                C3505 c3508 = c0914.f3337.f7899;
                c3508.getClass();
                arrayList.add(new C2396(new C2648(55, c3508, C2879.f9192, null), c2848, c2581M4557, c25819));
                c2582M4568 = C2582.m4568(c2581M4557);
                i8 = Opcodes.CHECKCAST;
            } else {
                i7 = 6;
                c2848 = c2848M2362;
                if (i2 == 168) {
                    this.f8408 = true;
                    return;
                } else {
                    if (i2 == 169) {
                        try {
                            this.f8410 = (C2643) m5126(0);
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
                    case Opcodes.LDC /* 18 */:
                        i9 = 5;
                        break;
                    case Opcodes.IALOAD /* 46 */:
                        i9 = 38;
                        break;
                    case Opcodes.ISTORE /* 54 */:
                        i9 = 2;
                        break;
                    case Opcodes.IASTORE /* 79 */:
                        i9 = 39;
                        break;
                    case Opcodes.IADD /* 96 */:
                        i9 = 14;
                        break;
                    case 100:
                        i9 = 15;
                        break;
                    case 104:
                        i9 = 16;
                        break;
                    case Opcodes.IDIV /* 108 */:
                        i9 = 17;
                        break;
                    case 112:
                        i9 = 18;
                        break;
                    case Opcodes.INEG /* 116 */:
                        i9 = 19;
                        break;
                    case 120:
                        i9 = 23;
                        break;
                    case 122:
                        i9 = 24;
                        break;
                    case Opcodes.IUSHR /* 124 */:
                        i9 = 25;
                        break;
                    case 126:
                        i9 = 20;
                        break;
                    case 128:
                        i9 = 21;
                        break;
                    case Opcodes.IXOR /* 130 */:
                        i9 = 22;
                        break;
                    default:
                        switch (i8) {
                            case Opcodes.IINC /* 132 */:
                                i9 = 14;
                                break;
                            case Opcodes.I2L /* 133 */:
                            case Opcodes.I2F /* 134 */:
                            case Opcodes.I2D /* 135 */:
                            case Opcodes.L2I /* 136 */:
                            case 137:
                            case 138:
                            case Opcodes.F2I /* 139 */:
                            case Opcodes.F2L /* 140 */:
                            case 141:
                            case Opcodes.D2I /* 142 */:
                            case Opcodes.D2L /* 143 */:
                            case 144:
                                i9 = 29;
                                break;
                            case Opcodes.I2B /* 145 */:
                                i9 = 30;
                                break;
                            case Opcodes.I2C /* 146 */:
                                i9 = 31;
                                break;
                            case Opcodes.I2S /* 147 */:
                                i9 = 32;
                                break;
                            case Opcodes.LCMP /* 148 */:
                            case Opcodes.FCMPL /* 149 */:
                            case Opcodes.DCMPL /* 151 */:
                                i9 = 27;
                                break;
                            case Opcodes.FCMPG /* 150 */:
                            case Opcodes.DCMPG /* 152 */:
                                i9 = 28;
                                break;
                            case Opcodes.IFEQ /* 153 */:
                            case Opcodes.IF_ICMPEQ /* 159 */:
                            case Opcodes.IF_ACMPEQ /* 165 */:
                                i9 = 7;
                                break;
                            case Opcodes.IFNE /* 154 */:
                            case Opcodes.IF_ICMPNE /* 160 */:
                            case Opcodes.IF_ACMPNE /* 166 */:
                                i9 = 8;
                                break;
                            case Opcodes.IFLT /* 155 */:
                            case Opcodes.IF_ICMPLT /* 161 */:
                                i9 = 9;
                                break;
                            case Opcodes.IFGE /* 156 */:
                            case Opcodes.IF_ICMPGE /* 162 */:
                                i9 = 10;
                                break;
                            case Opcodes.IFGT /* 157 */:
                            case Opcodes.IF_ICMPGT /* 163 */:
                                i9 = 12;
                                break;
                            case Opcodes.IFLE /* 158 */:
                            case Opcodes.IF_ICMPLE /* 164 */:
                                i9 = 11;
                                break;
                            case Opcodes.GOTO /* 167 */:
                                i9 = i7;
                                break;
                            default:
                                switch (i8) {
                                    case Opcodes.RETURN /* 177 */:
                                        i9 = 33;
                                        break;
                                    case Opcodes.GETSTATIC /* 178 */:
                                        i9 = 46;
                                        break;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        i9 = 48;
                                        break;
                                    case Opcodes.GETFIELD /* 180 */:
                                        i9 = 45;
                                        break;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        i9 = 47;
                                        break;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                        c0912 = (C0912) abstractC0775;
                                        if (c0912.f3375.equals(interfaceC2002.mo2359())) {
                                            i15 = 0;
                                            while (true) {
                                                c0417 = this.f8399;
                                                if (i15 < c0417.f4833.length) {
                                                    interfaceC2003 = (InterfaceC2002) c0417.m3165(i15);
                                                    if ((interfaceC2003.mo2360() & 2) == 0 && c0912.f3376.equals(interfaceC2003.mo2361())) {
                                                        i9 = 52;
                                                    } else {
                                                        i15++;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        if (c0912.m2527()) {
                                            i9 = 58;
                                        } else {
                                            i9 = 50;
                                        }
                                        break;
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                        c0913 = (C0912) abstractC0775;
                                        if (!c0913.f3376.f3381.f3385.equals("<init>") || c0913.f3375.equals(interfaceC2002.mo2359())) {
                                            i9 = 52;
                                        } else {
                                            i16 = 51;
                                            i9 = i16;
                                        }
                                        break;
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                        i9 = 49;
                                        break;
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        i16 = 53;
                                        i9 = i16;
                                        break;
                                    case 186:
                                        i9 = 59;
                                        break;
                                    case Opcodes.NEW /* 187 */:
                                        i16 = 40;
                                        i9 = i16;
                                        break;
                                    case Opcodes.NEWARRAY /* 188 */:
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        i9 = 41;
                                        break;
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                        i16 = 34;
                                        i9 = i16;
                                        break;
                                    case Opcodes.ATHROW /* 191 */:
                                        i16 = 35;
                                        i9 = i16;
                                        break;
                                    case Opcodes.CHECKCAST /* 192 */:
                                        i16 = 43;
                                        i9 = i16;
                                        break;
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        i16 = 44;
                                        i9 = i16;
                                        break;
                                    case Opcodes.MONITORENTER /* 194 */:
                                        i16 = 36;
                                        i9 = i16;
                                        break;
                                    case Opcodes.MONITOREXIT /* 195 */:
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
            c2648M4655 = AbstractC2656.m4655(i9, interfaceC3507, c2582M4568, abstractC0775);
            if (c2581M5128 != null || !c2648M4655.f8361) {
                abstractC0776 = abstractC0775;
                if (c2581M5128 == null && c2648M4655.m4629()) {
                    this.f8407++;
                    c2396 = new C2396(AbstractC2656.m4652(c2581M5128.f8206), c2848, c2581M5128, C2582.f8208);
                } else {
                    c2581 = c2581M5128;
                    i10 = 41;
                    c2396 = null;
                }
                if (i9 != i10) {
                    if (abstractC0776 == null && length3 == 2) {
                        interfaceC3508 = ((C2581) c2582M4568.m3165(0)).f8206;
                        interfaceC3509 = ((C2581) c2582M4568.m3165(1)).f8206;
                        if (interfaceC3509.mo4556() || interfaceC3508.mo4556()) {
                            C2581 c25820 = (C2581) c2582M4568.m3165(0);
                            c2584 = (C2581) c2582M4568.m3165(1);
                            this.f8400.getClass();
                            interfaceC35010 = c25820.f8206;
                            if (interfaceC35010.getType() == C3505.f11031) {
                                interfaceC35011 = c2584.f8206;
                                if (interfaceC35011 instanceof C0902) {
                                    c0902 = (C0902) interfaceC35011;
                                    i14 = c0902.f3371;
                                    switch (c2648M4655.f8356) {
                                        case Opcodes.DCONST_0 /* 14 */:
                                        case 16:
                                        case Opcodes.SIPUSH /* 17 */:
                                        case Opcodes.LDC /* 18 */:
                                        case 20:
                                        case Opcodes.ILOAD /* 21 */:
                                        case Opcodes.LLOAD /* 22 */:
                                            iMo2541 = c0902.mo2541();
                                            if (((short) iMo2541) == iMo2541) {
                                            }
                                            break;
                                        case 15:
                                            iMo2542 = C0902.m2537(-i14).mo2541();
                                            if (((short) iMo2542) == iMo2542) {
                                            }
                                            break;
                                        case 19:
                                        default:
                                            break;
                                        case Opcodes.FLOAD /* 23 */:
                                        case Opcodes.DLOAD /* 24 */:
                                        case Opcodes.ALOAD /* 25 */:
                                            if (((byte) i14) == i14) {
                                            }
                                            break;
                                    }
                                } else if ((interfaceC35010 instanceof C0902) && c2648M4655.f8356 == 15) {
                                    int iMo2543 = ((C0902) interfaceC35010).mo2541();
                                    z2 = ((short) iMo2543) == iMo2543;
                                }
                            }
                            if (z2) {
                                if (interfaceC3509.mo4556()) {
                                    abstractC0775M2537 = (AbstractC0775) interfaceC3509;
                                    length2 = c2582M4568.f4833.length - 1;
                                    if (length2 == 0) {
                                        c2588 = C2582.f8208;
                                    } else {
                                        c2587 = new C2582(length2);
                                        for (i13 = 0; i13 < length2; i13++) {
                                            c2587.m3166(i13, c2582M4568.m3165(i13));
                                        }
                                        if (!c2582M4568.f7068) {
                                            c2587.f7068 = false;
                                        }
                                        c2588 = c2587;
                                    }
                                    if (c2648M4655.f8356 == 15) {
                                        abstractC0775M2537 = C0902.m2537(-((C0902) interfaceC3509).f3371);
                                        c2582M4568 = c2588;
                                        i12 = 14;
                                    } else {
                                        c2582M4568 = c2588;
                                        i12 = i9;
                                    }
                                } else {
                                    abstractC0775M2537 = (AbstractC0775) interfaceC3508;
                                    length = c2582M4568.f4833.length - 1;
                                    if (length == 0) {
                                        c2586 = C2582.f8208;
                                    } else {
                                        c2585 = new C2582(length);
                                        i11 = 0;
                                        while (i11 < length) {
                                            int i28 = i11 + 1;
                                            c2585.m3166(i11, c2582M4568.m3165(i28));
                                            i11 = i28;
                                        }
                                        if (!c2582M4568.f7068) {
                                            c2585.f7068 = false;
                                        }
                                        c2586 = c2585;
                                    }
                                    i12 = i9;
                                    c2582M4568 = c2586;
                                }
                                c2648M4656 = AbstractC2656.m4655(i12, interfaceC3507, c2582M4568, abstractC0775M2537);
                                i9 = i12;
                            }
                            c1244 = this.f11205;
                            arrayList2 = this.f11206;
                            zM4629 = c2648M4656.m4629();
                            this.f8409 |= zM4629;
                            if (c1244 == null) {
                                c2648 = c2648M4656;
                                c2589 = c2583;
                                if (i9 == 33) {
                                    if (c2589.f4833.length != 0) {
                                        c25812 = (C2581) c2589.m3165(0);
                                        interfaceC35012 = c25812.f8206;
                                        if (c25812.f8205 != 0) {
                                            c25811 = null;
                                            arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                                        } else {
                                            c25811 = null;
                                        }
                                    } else {
                                        c25811 = null;
                                    }
                                    c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                                    this.f8406 = 0;
                                    c2649 = this.f8411;
                                    if (c2649 == null) {
                                        this.f8411 = c2648;
                                        this.f8412 = c2848;
                                    } else {
                                        if (c2649 != c2648) {
                                            throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                                        }
                                        if (c2848.f9069 > this.f8412.f9069) {
                                            this.f8412 = c2848;
                                        }
                                    }
                                    this.f8405 = true;
                                    abstractC0777 = abstractC0775M2537;
                                } else if (abstractC0775M2537 == null) {
                                    abstractC0777 = abstractC0775M2537;
                                    c25810 = c2581;
                                    if (zM4629) {
                                        AbstractC1663 c2928 = new C2928(c2648, c2848, c2589, this.f8403);
                                        this.f8404 = true;
                                        if (i8 == 191) {
                                            this.f8406 = -1;
                                        } else {
                                            this.f8406 = this.f8403.f4833.length;
                                        }
                                        c2397 = c2928;
                                    } else {
                                        c2397 = new C2396(c2648, c2848, c25810, c2589);
                                    }
                                } else if (zM4629) {
                                    if (c2648.f8356 == 58) {
                                        c2849 = c2848;
                                        c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                                        abstractC0777 = abstractC0775M2537;
                                    } else {
                                        c2849 = c2848;
                                        abstractC0777 = abstractC0775M2537;
                                        c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                                    }
                                    c2397 = c2982;
                                    this.f8404 = true;
                                    this.f8406 = this.f8403.f4833.length;
                                    c2848 = c2849;
                                } else {
                                    abstractC0777 = abstractC0775M2537;
                                    c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                                    c2397 = c2395;
                                }
                            } else if (c1244.f4506 == 0) {
                                c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                                this.f8406 = 0;
                                abstractC0777 = abstractC0775M2537;
                            } else {
                                C1676 c1676 = (C1676) c1244.f4507;
                                c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c1676);
                                this.f8406 = c1676.f5648;
                                abstractC0777 = abstractC0775M2537;
                                c2397 = c2395;
                            }
                            arrayList.add(c2397);
                            if (c2396 != null) {
                                arrayList.add(c2396);
                            }
                            if (arrayList2 != null) {
                                this.f8407++;
                                arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                            }
                        }
                    }
                    c2648M4656 = c2648M4655;
                    c2583 = c2582M4568;
                    abstractC0775M2537 = abstractC0776;
                    c1244 = this.f11205;
                    arrayList2 = this.f11206;
                    zM4629 = c2648M4656.m4629();
                    this.f8409 |= zM4629;
                    if (c1244 == null) {
                        c2648 = c2648M4656;
                        c2589 = c2583;
                        if (i9 == 33) {
                            if (c2589.f4833.length != 0) {
                                c25812 = (C2581) c2589.m3165(0);
                                interfaceC35012 = c25812.f8206;
                                if (c25812.f8205 != 0) {
                                    c25811 = null;
                                    arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                                } else {
                                    c25811 = null;
                                }
                            } else {
                                c25811 = null;
                            }
                            c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                            this.f8406 = 0;
                            c2649 = this.f8411;
                            if (c2649 == null) {
                                this.f8411 = c2648;
                                this.f8412 = c2848;
                            } else {
                                if (c2649 != c2648) {
                                    throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                                }
                                if (c2848.f9069 > this.f8412.f9069) {
                                    this.f8412 = c2848;
                                }
                            }
                            this.f8405 = true;
                            abstractC0777 = abstractC0775M2537;
                        } else if (abstractC0775M2537 == null) {
                            abstractC0777 = abstractC0775M2537;
                            c25810 = c2581;
                            if (zM4629) {
                                AbstractC1663 c2929 = new C2928(c2648, c2848, c2589, this.f8403);
                                this.f8404 = true;
                                if (i8 == 191) {
                                    this.f8406 = -1;
                                } else {
                                    this.f8406 = this.f8403.f4833.length;
                                }
                                c2397 = c2929;
                            } else {
                                c2397 = new C2396(c2648, c2848, c25810, c2589);
                            }
                        } else if (zM4629) {
                            if (c2648.f8356 == 58) {
                                c2849 = c2848;
                                c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                                abstractC0777 = abstractC0775M2537;
                            } else {
                                c2849 = c2848;
                                abstractC0777 = abstractC0775M2537;
                                c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                            }
                            c2397 = c2982;
                            this.f8404 = true;
                            this.f8406 = this.f8403.f4833.length;
                            c2848 = c2849;
                        } else {
                            abstractC0777 = abstractC0775M2537;
                            c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                            c2397 = c2395;
                        }
                    } else if (c1244.f4506 == 0) {
                        c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                        this.f8406 = 0;
                        abstractC0777 = abstractC0775M2537;
                    } else {
                        C1676 c1677 = (C1676) c1244.f4507;
                        c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c1677);
                        this.f8406 = c1677.f5648;
                        abstractC0777 = abstractC0775M2537;
                        c2397 = c2395;
                    }
                    arrayList.add(c2397);
                    if (c2396 != null) {
                        arrayList.add(c2396);
                    }
                    if (arrayList2 != null) {
                        this.f8407++;
                        arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                    }
                }
                abstractC0775M2537 = C0917.m2548(c2648M4655.f8357);
                c2648M4656 = c2648M4655;
                c2583 = c2582M4568;
                c1244 = this.f11205;
                arrayList2 = this.f11206;
                zM4629 = c2648M4656.m4629();
                this.f8409 |= zM4629;
                if (c1244 == null) {
                    c2648 = c2648M4656;
                    c2589 = c2583;
                    if (i9 == 33) {
                        if (c2589.f4833.length != 0) {
                            c25812 = (C2581) c2589.m3165(0);
                            interfaceC35012 = c25812.f8206;
                            if (c25812.f8205 != 0) {
                                c25811 = null;
                                arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                            } else {
                                c25811 = null;
                            }
                        } else {
                            c25811 = null;
                        }
                        c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                        this.f8406 = 0;
                        c2649 = this.f8411;
                        if (c2649 == null) {
                            this.f8411 = c2648;
                            this.f8412 = c2848;
                        } else {
                            if (c2649 != c2648) {
                                throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                            }
                            if (c2848.f9069 > this.f8412.f9069) {
                                this.f8412 = c2848;
                            }
                        }
                        this.f8405 = true;
                        abstractC0777 = abstractC0775M2537;
                    } else if (abstractC0775M2537 == null) {
                        abstractC0777 = abstractC0775M2537;
                        c25810 = c2581;
                        if (zM4629) {
                            AbstractC1663 c29210 = new C2928(c2648, c2848, c2589, this.f8403);
                            this.f8404 = true;
                            if (i8 == 191) {
                                this.f8406 = -1;
                            } else {
                                this.f8406 = this.f8403.f4833.length;
                            }
                            c2397 = c29210;
                        } else {
                            c2397 = new C2396(c2648, c2848, c25810, c2589);
                        }
                    } else if (zM4629) {
                        if (c2648.f8356 == 58) {
                            c2849 = c2848;
                            c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                            abstractC0777 = abstractC0775M2537;
                        } else {
                            c2849 = c2848;
                            abstractC0777 = abstractC0775M2537;
                            c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                        }
                        c2397 = c2982;
                        this.f8404 = true;
                        this.f8406 = this.f8403.f4833.length;
                        c2848 = c2849;
                    } else {
                        abstractC0777 = abstractC0775M2537;
                        c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                        c2397 = c2395;
                    }
                } else if (c1244.f4506 == 0) {
                    c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                    this.f8406 = 0;
                    abstractC0777 = abstractC0775M2537;
                } else {
                    C1676 c1678 = (C1676) c1244.f4507;
                    c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c1678);
                    this.f8406 = c1678.f5648;
                    abstractC0777 = abstractC0775M2537;
                    c2397 = c2395;
                }
                arrayList.add(c2397);
                if (c2396 != null) {
                    arrayList.add(c2396);
                }
                if (arrayList2 != null) {
                    this.f8407++;
                    arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                }
            }
            this.f8407++;
            C3505 c3509 = c2648M4655.f8356 == 59 ? ((C0894) abstractC0775).f3342.f3366.f7899 : ((C0912) abstractC0775).f3337.f7899;
            c3509.getClass();
            abstractC0776 = abstractC0775;
            c2396 = new C2396(new C2648(55, c3509, C2879.f9192, null), c2848, c2581M5128, C2582.f8208);
            i10 = 41;
            c2581 = null;
            if (i9 != i10) {
                if (abstractC0776 == null) {
                    interfaceC3508 = ((C2581) c2582M4568.m3165(0)).f8206;
                    interfaceC3509 = ((C2581) c2582M4568.m3165(1)).f8206;
                    if (interfaceC3509.mo4556()) {
                        C2581 c25821 = (C2581) c2582M4568.m3165(0);
                        c2584 = (C2581) c2582M4568.m3165(1);
                        this.f8400.getClass();
                        interfaceC35010 = c25821.f8206;
                        if (interfaceC35010.getType() == C3505.f11031) {
                            interfaceC35011 = c2584.f8206;
                            if (interfaceC35011 instanceof C0902) {
                                c0902 = (C0902) interfaceC35011;
                                i14 = c0902.f3371;
                                switch (c2648M4655.f8356) {
                                    case Opcodes.DCONST_0 /* 14 */:
                                    case 16:
                                    case Opcodes.SIPUSH /* 17 */:
                                    case Opcodes.LDC /* 18 */:
                                    case 20:
                                    case Opcodes.ILOAD /* 21 */:
                                    case Opcodes.LLOAD /* 22 */:
                                        iMo2541 = c0902.mo2541();
                                        if (((short) iMo2541) == iMo2541) {
                                        }
                                        break;
                                    case 15:
                                        iMo2542 = C0902.m2537(-i14).mo2541();
                                        if (((short) iMo2542) == iMo2542) {
                                        }
                                        break;
                                    case 19:
                                    default:
                                        break;
                                    case Opcodes.FLOAD /* 23 */:
                                    case Opcodes.DLOAD /* 24 */:
                                    case Opcodes.ALOAD /* 25 */:
                                        if (((byte) i14) == i14) {
                                        }
                                        break;
                                }
                            } else if (interfaceC35010 instanceof C0902) {
                                int iMo2544 = ((C0902) interfaceC35010).mo2541();
                                if (((short) iMo2544) == iMo2544) {
                                }
                            }
                        }
                        if (z2) {
                            if (interfaceC3509.mo4556()) {
                                abstractC0775M2537 = (AbstractC0775) interfaceC3509;
                                length2 = c2582M4568.f4833.length - 1;
                                if (length2 == 0) {
                                    c2588 = C2582.f8208;
                                } else {
                                    c2587 = new C2582(length2);
                                    while (i13 < length2) {
                                        c2587.m3166(i13, c2582M4568.m3165(i13));
                                    }
                                    if (!c2582M4568.f7068) {
                                        c2587.f7068 = false;
                                    }
                                    c2588 = c2587;
                                }
                                if (c2648M4655.f8356 == 15) {
                                    abstractC0775M2537 = C0902.m2537(-((C0902) interfaceC3509).f3371);
                                    c2582M4568 = c2588;
                                    i12 = 14;
                                } else {
                                    c2582M4568 = c2588;
                                    i12 = i9;
                                }
                            } else {
                                abstractC0775M2537 = (AbstractC0775) interfaceC3508;
                                length = c2582M4568.f4833.length - 1;
                                if (length == 0) {
                                    c2586 = C2582.f8208;
                                } else {
                                    c2585 = new C2582(length);
                                    i11 = 0;
                                    while (i11 < length) {
                                        int i29 = i11 + 1;
                                        c2585.m3166(i11, c2582M4568.m3165(i29));
                                        i11 = i29;
                                    }
                                    if (!c2582M4568.f7068) {
                                        c2585.f7068 = false;
                                    }
                                    c2586 = c2585;
                                }
                                i12 = i9;
                                c2582M4568 = c2586;
                            }
                            c2648M4656 = AbstractC2656.m4655(i12, interfaceC3507, c2582M4568, abstractC0775M2537);
                            i9 = i12;
                        }
                        c1244 = this.f11205;
                        arrayList2 = this.f11206;
                        zM4629 = c2648M4656.m4629();
                        this.f8409 |= zM4629;
                        if (c1244 == null) {
                            c2648 = c2648M4656;
                            c2589 = c2583;
                            if (i9 == 33) {
                                if (c2589.f4833.length != 0) {
                                    c25812 = (C2581) c2589.m3165(0);
                                    interfaceC35012 = c25812.f8206;
                                    if (c25812.f8205 != 0) {
                                        c25811 = null;
                                        arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                                    } else {
                                        c25811 = null;
                                    }
                                } else {
                                    c25811 = null;
                                }
                                c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                                this.f8406 = 0;
                                c2649 = this.f8411;
                                if (c2649 == null) {
                                    this.f8411 = c2648;
                                    this.f8412 = c2848;
                                } else {
                                    if (c2649 != c2648) {
                                        throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                                    }
                                    if (c2848.f9069 > this.f8412.f9069) {
                                        this.f8412 = c2848;
                                    }
                                }
                                this.f8405 = true;
                                abstractC0777 = abstractC0775M2537;
                            } else if (abstractC0775M2537 == null) {
                                abstractC0777 = abstractC0775M2537;
                                c25810 = c2581;
                                if (zM4629) {
                                    AbstractC1663 c29211 = new C2928(c2648, c2848, c2589, this.f8403);
                                    this.f8404 = true;
                                    if (i8 == 191) {
                                        this.f8406 = -1;
                                    } else {
                                        this.f8406 = this.f8403.f4833.length;
                                    }
                                    c2397 = c29211;
                                } else {
                                    c2397 = new C2396(c2648, c2848, c25810, c2589);
                                }
                            } else if (zM4629) {
                                if (c2648.f8356 == 58) {
                                    c2849 = c2848;
                                    c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                                    abstractC0777 = abstractC0775M2537;
                                } else {
                                    c2849 = c2848;
                                    abstractC0777 = abstractC0775M2537;
                                    c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                                }
                                c2397 = c2982;
                                this.f8404 = true;
                                this.f8406 = this.f8403.f4833.length;
                                c2848 = c2849;
                            } else {
                                abstractC0777 = abstractC0775M2537;
                                c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                                c2397 = c2395;
                            }
                        } else if (c1244.f4506 == 0) {
                            c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                            this.f8406 = 0;
                            abstractC0777 = abstractC0775M2537;
                        } else {
                            C1676 c1679 = (C1676) c1244.f4507;
                            c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c1679);
                            this.f8406 = c1679.f5648;
                            abstractC0777 = abstractC0775M2537;
                            c2397 = c2395;
                        }
                        arrayList.add(c2397);
                        if (c2396 != null) {
                            arrayList.add(c2396);
                        }
                        if (arrayList2 != null) {
                            this.f8407++;
                            arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                        }
                    }
                    C2581 c25822 = (C2581) c2582M4568.m3165(0);
                    c2584 = (C2581) c2582M4568.m3165(1);
                    this.f8400.getClass();
                    interfaceC35010 = c25822.f8206;
                    if (interfaceC35010.getType() == C3505.f11031) {
                        interfaceC35011 = c2584.f8206;
                        if (interfaceC35011 instanceof C0902) {
                            c0902 = (C0902) interfaceC35011;
                            i14 = c0902.f3371;
                            switch (c2648M4655.f8356) {
                                case Opcodes.DCONST_0 /* 14 */:
                                case 16:
                                case Opcodes.SIPUSH /* 17 */:
                                case Opcodes.LDC /* 18 */:
                                case 20:
                                case Opcodes.ILOAD /* 21 */:
                                case Opcodes.LLOAD /* 22 */:
                                    iMo2541 = c0902.mo2541();
                                    if (((short) iMo2541) == iMo2541) {
                                    }
                                    break;
                                case 15:
                                    iMo2542 = C0902.m2537(-i14).mo2541();
                                    if (((short) iMo2542) == iMo2542) {
                                    }
                                    break;
                                case 19:
                                default:
                                    break;
                                case Opcodes.FLOAD /* 23 */:
                                case Opcodes.DLOAD /* 24 */:
                                case Opcodes.ALOAD /* 25 */:
                                    if (((byte) i14) == i14) {
                                    }
                                    break;
                            }
                        } else if (interfaceC35010 instanceof C0902) {
                            int iMo2545 = ((C0902) interfaceC35010).mo2541();
                            if (((short) iMo2545) == iMo2545) {
                            }
                        }
                    }
                    if (z2) {
                        if (interfaceC3509.mo4556()) {
                            abstractC0775M2537 = (AbstractC0775) interfaceC3509;
                            length2 = c2582M4568.f4833.length - 1;
                            if (length2 == 0) {
                                c2588 = C2582.f8208;
                            } else {
                                c2587 = new C2582(length2);
                                while (i13 < length2) {
                                    c2587.m3166(i13, c2582M4568.m3165(i13));
                                }
                                if (!c2582M4568.f7068) {
                                    c2587.f7068 = false;
                                }
                                c2588 = c2587;
                            }
                            if (c2648M4655.f8356 == 15) {
                                abstractC0775M2537 = C0902.m2537(-((C0902) interfaceC3509).f3371);
                                c2582M4568 = c2588;
                                i12 = 14;
                            } else {
                                c2582M4568 = c2588;
                                i12 = i9;
                            }
                        } else {
                            abstractC0775M2537 = (AbstractC0775) interfaceC3508;
                            length = c2582M4568.f4833.length - 1;
                            if (length == 0) {
                                c2586 = C2582.f8208;
                            } else {
                                c2585 = new C2582(length);
                                i11 = 0;
                                while (i11 < length) {
                                    int i210 = i11 + 1;
                                    c2585.m3166(i11, c2582M4568.m3165(i210));
                                    i11 = i210;
                                }
                                if (!c2582M4568.f7068) {
                                    c2585.f7068 = false;
                                }
                                c2586 = c2585;
                            }
                            i12 = i9;
                            c2582M4568 = c2586;
                        }
                        c2648M4656 = AbstractC2656.m4655(i12, interfaceC3507, c2582M4568, abstractC0775M2537);
                        i9 = i12;
                    }
                    c1244 = this.f11205;
                    arrayList2 = this.f11206;
                    zM4629 = c2648M4656.m4629();
                    this.f8409 |= zM4629;
                    if (c1244 == null) {
                        c2648 = c2648M4656;
                        c2589 = c2583;
                        if (i9 == 33) {
                            if (c2589.f4833.length != 0) {
                                c25812 = (C2581) c2589.m3165(0);
                                interfaceC35012 = c25812.f8206;
                                if (c25812.f8205 != 0) {
                                    c25811 = null;
                                    arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                                } else {
                                    c25811 = null;
                                }
                            } else {
                                c25811 = null;
                            }
                            c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                            this.f8406 = 0;
                            c2649 = this.f8411;
                            if (c2649 == null) {
                                this.f8411 = c2648;
                                this.f8412 = c2848;
                            } else {
                                if (c2649 != c2648) {
                                    throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                                }
                                if (c2848.f9069 > this.f8412.f9069) {
                                    this.f8412 = c2848;
                                }
                            }
                            this.f8405 = true;
                            abstractC0777 = abstractC0775M2537;
                        } else if (abstractC0775M2537 == null) {
                            abstractC0777 = abstractC0775M2537;
                            c25810 = c2581;
                            if (zM4629) {
                                AbstractC1663 c29212 = new C2928(c2648, c2848, c2589, this.f8403);
                                this.f8404 = true;
                                if (i8 == 191) {
                                    this.f8406 = -1;
                                } else {
                                    this.f8406 = this.f8403.f4833.length;
                                }
                                c2397 = c29212;
                            } else {
                                c2397 = new C2396(c2648, c2848, c25810, c2589);
                            }
                        } else if (zM4629) {
                            if (c2648.f8356 == 58) {
                                c2849 = c2848;
                                c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                                abstractC0777 = abstractC0775M2537;
                            } else {
                                c2849 = c2848;
                                abstractC0777 = abstractC0775M2537;
                                c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                            }
                            c2397 = c2982;
                            this.f8404 = true;
                            this.f8406 = this.f8403.f4833.length;
                            c2848 = c2849;
                        } else {
                            abstractC0777 = abstractC0775M2537;
                            c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                            c2397 = c2395;
                        }
                    } else if (c1244.f4506 == 0) {
                        c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                        this.f8406 = 0;
                        abstractC0777 = abstractC0775M2537;
                    } else {
                        C1676 c16710 = (C1676) c1244.f4507;
                        c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16710);
                        this.f8406 = c16710.f5648;
                        abstractC0777 = abstractC0775M2537;
                        c2397 = c2395;
                    }
                    arrayList.add(c2397);
                    if (c2396 != null) {
                        arrayList.add(c2396);
                    }
                    if (arrayList2 != null) {
                        this.f8407++;
                        arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                    }
                }
                c2648M4656 = c2648M4655;
                c2583 = c2582M4568;
                abstractC0775M2537 = abstractC0776;
                c1244 = this.f11205;
                arrayList2 = this.f11206;
                zM4629 = c2648M4656.m4629();
                this.f8409 |= zM4629;
                if (c1244 == null) {
                    c2648 = c2648M4656;
                    c2589 = c2583;
                    if (i9 == 33) {
                        if (c2589.f4833.length != 0) {
                            c25812 = (C2581) c2589.m3165(0);
                            interfaceC35012 = c25812.f8206;
                            if (c25812.f8205 != 0) {
                                c25811 = null;
                                arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                            } else {
                                c25811 = null;
                            }
                        } else {
                            c25811 = null;
                        }
                        c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                        this.f8406 = 0;
                        c2649 = this.f8411;
                        if (c2649 == null) {
                            this.f8411 = c2648;
                            this.f8412 = c2848;
                        } else {
                            if (c2649 != c2648) {
                                throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                            }
                            if (c2848.f9069 > this.f8412.f9069) {
                                this.f8412 = c2848;
                            }
                        }
                        this.f8405 = true;
                        abstractC0777 = abstractC0775M2537;
                    } else if (abstractC0775M2537 == null) {
                        abstractC0777 = abstractC0775M2537;
                        c25810 = c2581;
                        if (zM4629) {
                            AbstractC1663 c29213 = new C2928(c2648, c2848, c2589, this.f8403);
                            this.f8404 = true;
                            if (i8 == 191) {
                                this.f8406 = -1;
                            } else {
                                this.f8406 = this.f8403.f4833.length;
                            }
                            c2397 = c29213;
                        } else {
                            c2397 = new C2396(c2648, c2848, c25810, c2589);
                        }
                    } else if (zM4629) {
                        if (c2648.f8356 == 58) {
                            c2849 = c2848;
                            c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                            abstractC0777 = abstractC0775M2537;
                        } else {
                            c2849 = c2848;
                            abstractC0777 = abstractC0775M2537;
                            c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                        }
                        c2397 = c2982;
                        this.f8404 = true;
                        this.f8406 = this.f8403.f4833.length;
                        c2848 = c2849;
                    } else {
                        abstractC0777 = abstractC0775M2537;
                        c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                        c2397 = c2395;
                    }
                } else if (c1244.f4506 == 0) {
                    c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                    this.f8406 = 0;
                    abstractC0777 = abstractC0775M2537;
                } else {
                    C1676 c16711 = (C1676) c1244.f4507;
                    c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16711);
                    this.f8406 = c16711.f5648;
                    abstractC0777 = abstractC0775M2537;
                    c2397 = c2395;
                }
                arrayList.add(c2397);
                if (c2396 != null) {
                    arrayList.add(c2396);
                }
                if (arrayList2 != null) {
                    this.f8407++;
                    arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                }
            }
            abstractC0775M2537 = C0917.m2548(c2648M4655.f8357);
            c2648M4656 = c2648M4655;
            c2583 = c2582M4568;
            c1244 = this.f11205;
            arrayList2 = this.f11206;
            zM4629 = c2648M4656.m4629();
            this.f8409 |= zM4629;
            if (c1244 == null) {
                c2648 = c2648M4656;
                c2589 = c2583;
                if (i9 == 33) {
                    if (c2589.f4833.length != 0) {
                        c25812 = (C2581) c2589.m3165(0);
                        interfaceC35012 = c25812.f8206;
                        if (c25812.f8205 != 0) {
                            c25811 = null;
                            arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                        } else {
                            c25811 = null;
                        }
                    } else {
                        c25811 = null;
                    }
                    c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                    this.f8406 = 0;
                    c2649 = this.f8411;
                    if (c2649 == null) {
                        this.f8411 = c2648;
                        this.f8412 = c2848;
                    } else {
                        if (c2649 != c2648) {
                            throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                        }
                        if (c2848.f9069 > this.f8412.f9069) {
                            this.f8412 = c2848;
                        }
                    }
                    this.f8405 = true;
                    abstractC0777 = abstractC0775M2537;
                } else if (abstractC0775M2537 == null) {
                    abstractC0777 = abstractC0775M2537;
                    c25810 = c2581;
                    if (zM4629) {
                        AbstractC1663 c29214 = new C2928(c2648, c2848, c2589, this.f8403);
                        this.f8404 = true;
                        if (i8 == 191) {
                            this.f8406 = -1;
                        } else {
                            this.f8406 = this.f8403.f4833.length;
                        }
                        c2397 = c29214;
                    } else {
                        c2397 = new C2396(c2648, c2848, c25810, c2589);
                    }
                } else if (zM4629) {
                    if (c2648.f8356 == 58) {
                        c2849 = c2848;
                        c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                        abstractC0777 = abstractC0775M2537;
                    } else {
                        c2849 = c2848;
                        abstractC0777 = abstractC0775M2537;
                        c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                    }
                    c2397 = c2982;
                    this.f8404 = true;
                    this.f8406 = this.f8403.f4833.length;
                    c2848 = c2849;
                } else {
                    abstractC0777 = abstractC0775M2537;
                    c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                    c2397 = c2395;
                }
            } else if (c1244.f4506 == 0) {
                c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                this.f8406 = 0;
                abstractC0777 = abstractC0775M2537;
            } else {
                C1676 c16712 = (C1676) c1244.f4507;
                c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16712);
                this.f8406 = c16712.f5648;
                abstractC0777 = abstractC0775M2537;
                c2397 = c2395;
            }
            arrayList.add(c2397);
            if (c2396 != null) {
                arrayList.add(c2396);
            }
            if (arrayList2 != null) {
                this.f8407++;
                arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
            }
        }
        this.f11211 = 0;
        i3 = this.f11211;
        if (i3 >= 0) {
            throw new C2766("results never set", null);
        }
        if (i3 != 0) {
            if (this.f11209 != null) {
                abstractC1861.mo3773(m5128(false));
            } else {
                while (i21 < this.f11211) {
                    if (this.f11208) {
                        c1245.m4109();
                        ((boolean[]) c1245.f4508)[c1245.f4506] = z3;
                    }
                    c1245.m3019(interfaceC3507Arr[i21]);
                }
            }
        }
        C0766 c0767 = this.f8398;
        c2848M2362 = c0767.m2362(i);
        interfaceC2002 = c0767.f2867;
        if (i2 == 54) {
            z = z3;
        } else {
            z = false;
        }
        c2581M5128 = m5128(z);
        i4 = this.f11211;
        if (i4 >= 0) {
            throw new C2766("results never set", null);
        }
        arrayList = this.f8402;
        if (i4 == 0) {
            if (i2 != 87) {
                return;
            } else {
                return;
            }
        }
        if (c2581M5128 == null) {
            if (i4 == z3) {
                c2654 = this.f8397;
                iM4562 = c2654.f8384 + c2654.f8382.f2869.f1567;
                if (c2654.m4643()) {
                    iM4562++;
                }
                c2581Arr = new C2581[length3];
                while (i5 < length3) {
                    C2581 c258110 = (C2581) c2582M4568.m3165(i5);
                    InterfaceC3507 interfaceC35015 = c258110.f8206;
                    C2581 c2581M4567 = c258110.m4566(iM4562);
                    arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35015), c2848M2362, c2581M4567, c258110));
                    c2581Arr[i5] = c2581M4567;
                    iM4562 += c258110.m4562();
                }
                while (i6 != 0) {
                    C2581 c258111 = c2581Arr[(i6 & 15) - 1];
                    InterfaceC3507 interfaceC35016 = c258111.f8206;
                    arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35016), c2848M2362, c258111.m4566(iM5028), c258111));
                    iM5028 += interfaceC35016.getType().m5028();
                }
                return;
            }
            if (i4 > 0) {
                throw new IllegalArgumentException("n >= resultCount");
            }
            c2581M5128 = C2581.m4554(iM5028, interfaceC3507Arr[0], null);
        }
        if (c2581M5128 != null) {
            interfaceC3507 = c2581M5128;
        } else {
            interfaceC3507 = C3505.f11034;
        }
        abstractC0775 = this.f11203;
        if (i2 == 197) {
            this.f8409 = true;
            this.f8407 = 6;
            int iM4565 = c2581M5128.m4562() + c2581M5128.f8205;
            i17 = c2581M5128.f8205;
            c3505 = C3505.f11060;
            c2581M4554 = C2581.m4554(iM4565, c3505, null);
            C2648 c26411 = AbstractC2656.f8413;
            c3505.getClass();
            c3505M5030 = c3505.m5030();
            if (!c3505M5030.m5034()) {
                AbstractC2656.m4656(c3505);
                throw null;
            }
            if (length3 >= 0) {
                throw new IllegalArgumentException("count < 0");
            }
            c2879 = new C2879(length3);
            while (i18 < length3) {
                c2879.m3166(i18, c3505M5030);
            }
            c2848 = c2848M2362;
            i7 = 6;
            arrayList.add(new C2982(new C2648(42, c2879, AbstractC1241.f4471), c2848, c2582M4568, this.f8403, C0917.f3404));
            C3505 c35010 = C3505.f11060;
            c35010.getClass();
            arrayList.add(new C2396(new C2648(55, c35010, C2879.f9192, null), c2848, c2581M4554, C2582.f8208));
            c3505M5031 = ((C0917) abstractC0775).f3408;
            while (i19 < length3) {
                c3505M5031 = c3505M5031.m5030();
            }
            C2581 c2581M4558 = C2581.m4554(i17, C3505.f11037, null);
            i20 = c3505M5031.f11065;
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
                    ConcurrentHashMap concurrentHashMap2 = C0917.f3387;
                    switch (i20) {
                        case 0:
                            c0917 = C0917.f3397;
                            break;
                        case 1:
                            c0917 = C0917.f3389;
                            break;
                        case 2:
                            c0917 = C0917.f3390;
                            break;
                        case 3:
                            c0917 = C0917.f3391;
                            break;
                        case 4:
                            c0917 = C0917.f3392;
                            break;
                        case 5:
                            c0917 = C0917.f3393;
                            break;
                        case 6:
                            c0917 = C0917.f3395;
                            break;
                        case 7:
                            c0917 = C0917.f3394;
                            break;
                        case 8:
                            c0917 = C0917.f3396;
                            break;
                        default:
                            throw new IllegalArgumentException("not primitive: " + c3505M5031);
                    }
                    c2983 = new C2982(AbstractC2656.f8591, c2848, C2582.f8208, this.f8403, new C0898(c0917, C0913.f3380));
                    c2848 = c2848;
                    break;
                default:
                    c2983 = new C2982(AbstractC2656.f8429, c2848, C2582.f8208, this.f8403, new C0917(c3505M5031));
                    break;
            }
            arrayList.add(c2983);
            C2648 c2648M4653 = AbstractC2656.m4652(c2581M4558.f8206.getType());
            C2582 c258112 = C2582.f8208;
            arrayList.add(new C2396(c2648M4653, c2848, c2581M4558, c258112));
            C2581 c2581M4559 = C2581.m4554(i17, C3505.f11042, null);
            C0912 c0915 = f8396;
            arrayList.add(new C2982(new C2648(49, c0915.f3337.m4443(), C2879.f9199), c2848, C2582.m4569(c2581M4558, c2581M4554), this.f8403, c0915));
            C3505 c35011 = c0915.f3337.f7899;
            c35011.getClass();
            arrayList.add(new C2396(new C2648(55, c35011, C2879.f9192, null), c2848, c2581M4559, c258112));
            c2582M4568 = C2582.m4568(c2581M4559);
            i8 = Opcodes.CHECKCAST;
        } else {
            i7 = 6;
            c2848 = c2848M2362;
            if (i2 == 168) {
                this.f8408 = true;
                return;
            } else {
                if (i2 == 169) {
                    this.f8410 = (C2643) m5126(0);
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
                case Opcodes.LDC /* 18 */:
                    i9 = 5;
                    break;
                case Opcodes.IALOAD /* 46 */:
                    i9 = 38;
                    break;
                case Opcodes.ISTORE /* 54 */:
                    i9 = 2;
                    break;
                case Opcodes.IASTORE /* 79 */:
                    i9 = 39;
                    break;
                case Opcodes.IADD /* 96 */:
                    i9 = 14;
                    break;
                case 100:
                    i9 = 15;
                    break;
                case 104:
                    i9 = 16;
                    break;
                case Opcodes.IDIV /* 108 */:
                    i9 = 17;
                    break;
                case 112:
                    i9 = 18;
                    break;
                case Opcodes.INEG /* 116 */:
                    i9 = 19;
                    break;
                case 120:
                    i9 = 23;
                    break;
                case 122:
                    i9 = 24;
                    break;
                case Opcodes.IUSHR /* 124 */:
                    i9 = 25;
                    break;
                case 126:
                    i9 = 20;
                    break;
                case 128:
                    i9 = 21;
                    break;
                case Opcodes.IXOR /* 130 */:
                    i9 = 22;
                    break;
                default:
                    switch (i8) {
                        case Opcodes.IINC /* 132 */:
                            i9 = 14;
                            break;
                        case Opcodes.I2L /* 133 */:
                        case Opcodes.I2F /* 134 */:
                        case Opcodes.I2D /* 135 */:
                        case Opcodes.L2I /* 136 */:
                        case 137:
                        case 138:
                        case Opcodes.F2I /* 139 */:
                        case Opcodes.F2L /* 140 */:
                        case 141:
                        case Opcodes.D2I /* 142 */:
                        case Opcodes.D2L /* 143 */:
                        case 144:
                            i9 = 29;
                            break;
                        case Opcodes.I2B /* 145 */:
                            i9 = 30;
                            break;
                        case Opcodes.I2C /* 146 */:
                            i9 = 31;
                            break;
                        case Opcodes.I2S /* 147 */:
                            i9 = 32;
                            break;
                        case Opcodes.LCMP /* 148 */:
                        case Opcodes.FCMPL /* 149 */:
                        case Opcodes.DCMPL /* 151 */:
                            i9 = 27;
                            break;
                        case Opcodes.FCMPG /* 150 */:
                        case Opcodes.DCMPG /* 152 */:
                            i9 = 28;
                            break;
                        case Opcodes.IFEQ /* 153 */:
                        case Opcodes.IF_ICMPEQ /* 159 */:
                        case Opcodes.IF_ACMPEQ /* 165 */:
                            i9 = 7;
                            break;
                        case Opcodes.IFNE /* 154 */:
                        case Opcodes.IF_ICMPNE /* 160 */:
                        case Opcodes.IF_ACMPNE /* 166 */:
                            i9 = 8;
                            break;
                        case Opcodes.IFLT /* 155 */:
                        case Opcodes.IF_ICMPLT /* 161 */:
                            i9 = 9;
                            break;
                        case Opcodes.IFGE /* 156 */:
                        case Opcodes.IF_ICMPGE /* 162 */:
                            i9 = 10;
                            break;
                        case Opcodes.IFGT /* 157 */:
                        case Opcodes.IF_ICMPGT /* 163 */:
                            i9 = 12;
                            break;
                        case Opcodes.IFLE /* 158 */:
                        case Opcodes.IF_ICMPLE /* 164 */:
                            i9 = 11;
                            break;
                        case Opcodes.GOTO /* 167 */:
                            i9 = i7;
                            break;
                        default:
                            switch (i8) {
                                case Opcodes.RETURN /* 177 */:
                                    i9 = 33;
                                    break;
                                case Opcodes.GETSTATIC /* 178 */:
                                    i9 = 46;
                                    break;
                                case Opcodes.PUTSTATIC /* 179 */:
                                    i9 = 48;
                                    break;
                                case Opcodes.GETFIELD /* 180 */:
                                    i9 = 45;
                                    break;
                                case Opcodes.PUTFIELD /* 181 */:
                                    i9 = 47;
                                    break;
                                case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    c0912 = (C0912) abstractC0775;
                                    if (c0912.f3375.equals(interfaceC2002.mo2359())) {
                                        i15 = 0;
                                        while (true) {
                                            c0417 = this.f8399;
                                            if (i15 < c0417.f4833.length) {
                                                interfaceC2003 = (InterfaceC2002) c0417.m3165(i15);
                                                if ((interfaceC2003.mo2360() & 2) == 0) {
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    if (c0912.m2527()) {
                                        i9 = 58;
                                    } else {
                                        i9 = 50;
                                    }
                                    break;
                                case Opcodes.INVOKESPECIAL /* 183 */:
                                    c0913 = (C0912) abstractC0775;
                                    if (!c0913.f3376.f3381.f3385.equals("<init>")) {
                                    }
                                    i9 = 52;
                                    break;
                                case Opcodes.INVOKESTATIC /* 184 */:
                                    i9 = 49;
                                    break;
                                case Opcodes.INVOKEINTERFACE /* 185 */:
                                    i16 = 53;
                                    i9 = i16;
                                    break;
                                case 186:
                                    i9 = 59;
                                    break;
                                case Opcodes.NEW /* 187 */:
                                    i16 = 40;
                                    i9 = i16;
                                    break;
                                case Opcodes.NEWARRAY /* 188 */:
                                case Opcodes.ANEWARRAY /* 189 */:
                                    i9 = 41;
                                    break;
                                case Opcodes.ARRAYLENGTH /* 190 */:
                                    i16 = 34;
                                    i9 = i16;
                                    break;
                                case Opcodes.ATHROW /* 191 */:
                                    i16 = 35;
                                    i9 = i16;
                                    break;
                                case Opcodes.CHECKCAST /* 192 */:
                                    i16 = 43;
                                    i9 = i16;
                                    break;
                                case Opcodes.INSTANCEOF /* 193 */:
                                    i16 = 44;
                                    i9 = i16;
                                    break;
                                case Opcodes.MONITORENTER /* 194 */:
                                    i16 = 36;
                                    i9 = i16;
                                    break;
                                case Opcodes.MONITOREXIT /* 195 */:
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
        c2648M4655 = AbstractC2656.m4655(i9, interfaceC3507, c2582M4568, abstractC0775);
        if (c2581M5128 != null) {
            abstractC0776 = abstractC0775;
            if (c2581M5128 == null) {
            }
            c2581 = c2581M5128;
            i10 = 41;
            c2396 = null;
        } else {
            abstractC0776 = abstractC0775;
            if (c2581M5128 == null) {
            }
            c2581 = c2581M5128;
            i10 = 41;
            c2396 = null;
        }
        if (i9 != i10) {
            if (abstractC0776 == null) {
                interfaceC3508 = ((C2581) c2582M4568.m3165(0)).f8206;
                interfaceC3509 = ((C2581) c2582M4568.m3165(1)).f8206;
                if (interfaceC3509.mo4556()) {
                    C2581 c25823 = (C2581) c2582M4568.m3165(0);
                    c2584 = (C2581) c2582M4568.m3165(1);
                    this.f8400.getClass();
                    interfaceC35010 = c25823.f8206;
                    if (interfaceC35010.getType() == C3505.f11031) {
                        interfaceC35011 = c2584.f8206;
                        if (interfaceC35011 instanceof C0902) {
                            c0902 = (C0902) interfaceC35011;
                            i14 = c0902.f3371;
                            switch (c2648M4655.f8356) {
                                case Opcodes.DCONST_0 /* 14 */:
                                case 16:
                                case Opcodes.SIPUSH /* 17 */:
                                case Opcodes.LDC /* 18 */:
                                case 20:
                                case Opcodes.ILOAD /* 21 */:
                                case Opcodes.LLOAD /* 22 */:
                                    iMo2541 = c0902.mo2541();
                                    if (((short) iMo2541) == iMo2541) {
                                    }
                                    break;
                                case 15:
                                    iMo2542 = C0902.m2537(-i14).mo2541();
                                    if (((short) iMo2542) == iMo2542) {
                                    }
                                    break;
                                case 19:
                                default:
                                    break;
                                case Opcodes.FLOAD /* 23 */:
                                case Opcodes.DLOAD /* 24 */:
                                case Opcodes.ALOAD /* 25 */:
                                    if (((byte) i14) == i14) {
                                    }
                                    break;
                            }
                        } else if (interfaceC35010 instanceof C0902) {
                            int iMo2546 = ((C0902) interfaceC35010).mo2541();
                            if (((short) iMo2546) == iMo2546) {
                            }
                        }
                    }
                    if (z2) {
                        if (interfaceC3509.mo4556()) {
                            abstractC0775M2537 = (AbstractC0775) interfaceC3509;
                            length2 = c2582M4568.f4833.length - 1;
                            if (length2 == 0) {
                                c2588 = C2582.f8208;
                            } else {
                                c2587 = new C2582(length2);
                                while (i13 < length2) {
                                    c2587.m3166(i13, c2582M4568.m3165(i13));
                                }
                                if (!c2582M4568.f7068) {
                                    c2587.f7068 = false;
                                }
                                c2588 = c2587;
                            }
                            if (c2648M4655.f8356 == 15) {
                                abstractC0775M2537 = C0902.m2537(-((C0902) interfaceC3509).f3371);
                                c2582M4568 = c2588;
                                i12 = 14;
                            } else {
                                c2582M4568 = c2588;
                                i12 = i9;
                            }
                        } else {
                            abstractC0775M2537 = (AbstractC0775) interfaceC3508;
                            length = c2582M4568.f4833.length - 1;
                            if (length == 0) {
                                c2586 = C2582.f8208;
                            } else {
                                c2585 = new C2582(length);
                                i11 = 0;
                                while (i11 < length) {
                                    int i211 = i11 + 1;
                                    c2585.m3166(i11, c2582M4568.m3165(i211));
                                    i11 = i211;
                                }
                                if (!c2582M4568.f7068) {
                                    c2585.f7068 = false;
                                }
                                c2586 = c2585;
                            }
                            i12 = i9;
                            c2582M4568 = c2586;
                        }
                        c2648M4656 = AbstractC2656.m4655(i12, interfaceC3507, c2582M4568, abstractC0775M2537);
                        i9 = i12;
                    }
                    c1244 = this.f11205;
                    arrayList2 = this.f11206;
                    zM4629 = c2648M4656.m4629();
                    this.f8409 |= zM4629;
                    if (c1244 == null) {
                        c2648 = c2648M4656;
                        c2589 = c2583;
                        if (i9 == 33) {
                            if (c2589.f4833.length != 0) {
                                c25812 = (C2581) c2589.m3165(0);
                                interfaceC35012 = c25812.f8206;
                                if (c25812.f8205 != 0) {
                                    c25811 = null;
                                    arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                                } else {
                                    c25811 = null;
                                }
                            } else {
                                c25811 = null;
                            }
                            c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                            this.f8406 = 0;
                            c2649 = this.f8411;
                            if (c2649 == null) {
                                this.f8411 = c2648;
                                this.f8412 = c2848;
                            } else {
                                if (c2649 != c2648) {
                                    throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                                }
                                if (c2848.f9069 > this.f8412.f9069) {
                                    this.f8412 = c2848;
                                }
                            }
                            this.f8405 = true;
                            abstractC0777 = abstractC0775M2537;
                        } else if (abstractC0775M2537 == null) {
                            abstractC0777 = abstractC0775M2537;
                            c25810 = c2581;
                            if (zM4629) {
                                AbstractC1663 c29215 = new C2928(c2648, c2848, c2589, this.f8403);
                                this.f8404 = true;
                                if (i8 == 191) {
                                    this.f8406 = -1;
                                } else {
                                    this.f8406 = this.f8403.f4833.length;
                                }
                                c2397 = c29215;
                            } else {
                                c2397 = new C2396(c2648, c2848, c25810, c2589);
                            }
                        } else if (zM4629) {
                            if (c2648.f8356 == 58) {
                                c2849 = c2848;
                                c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                                abstractC0777 = abstractC0775M2537;
                            } else {
                                c2849 = c2848;
                                abstractC0777 = abstractC0775M2537;
                                c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                            }
                            c2397 = c2982;
                            this.f8404 = true;
                            this.f8406 = this.f8403.f4833.length;
                            c2848 = c2849;
                        } else {
                            abstractC0777 = abstractC0775M2537;
                            c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                            c2397 = c2395;
                        }
                    } else if (c1244.f4506 == 0) {
                        c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                        this.f8406 = 0;
                        abstractC0777 = abstractC0775M2537;
                    } else {
                        C1676 c16713 = (C1676) c1244.f4507;
                        c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16713);
                        this.f8406 = c16713.f5648;
                        abstractC0777 = abstractC0775M2537;
                        c2397 = c2395;
                    }
                    arrayList.add(c2397);
                    if (c2396 != null) {
                        arrayList.add(c2396);
                    }
                    if (arrayList2 != null) {
                        this.f8407++;
                        arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                    }
                }
                C2581 c25824 = (C2581) c2582M4568.m3165(0);
                c2584 = (C2581) c2582M4568.m3165(1);
                this.f8400.getClass();
                interfaceC35010 = c25824.f8206;
                if (interfaceC35010.getType() == C3505.f11031) {
                    interfaceC35011 = c2584.f8206;
                    if (interfaceC35011 instanceof C0902) {
                        c0902 = (C0902) interfaceC35011;
                        i14 = c0902.f3371;
                        switch (c2648M4655.f8356) {
                            case Opcodes.DCONST_0 /* 14 */:
                            case 16:
                            case Opcodes.SIPUSH /* 17 */:
                            case Opcodes.LDC /* 18 */:
                            case 20:
                            case Opcodes.ILOAD /* 21 */:
                            case Opcodes.LLOAD /* 22 */:
                                iMo2541 = c0902.mo2541();
                                if (((short) iMo2541) == iMo2541) {
                                }
                                break;
                            case 15:
                                iMo2542 = C0902.m2537(-i14).mo2541();
                                if (((short) iMo2542) == iMo2542) {
                                }
                                break;
                            case 19:
                            default:
                                break;
                            case Opcodes.FLOAD /* 23 */:
                            case Opcodes.DLOAD /* 24 */:
                            case Opcodes.ALOAD /* 25 */:
                                if (((byte) i14) == i14) {
                                }
                                break;
                        }
                    } else if (interfaceC35010 instanceof C0902) {
                        int iMo2547 = ((C0902) interfaceC35010).mo2541();
                        if (((short) iMo2547) == iMo2547) {
                        }
                    }
                }
                if (z2) {
                    if (interfaceC3509.mo4556()) {
                        abstractC0775M2537 = (AbstractC0775) interfaceC3509;
                        length2 = c2582M4568.f4833.length - 1;
                        if (length2 == 0) {
                            c2588 = C2582.f8208;
                        } else {
                            c2587 = new C2582(length2);
                            while (i13 < length2) {
                                c2587.m3166(i13, c2582M4568.m3165(i13));
                            }
                            if (!c2582M4568.f7068) {
                                c2587.f7068 = false;
                            }
                            c2588 = c2587;
                        }
                        if (c2648M4655.f8356 == 15) {
                            abstractC0775M2537 = C0902.m2537(-((C0902) interfaceC3509).f3371);
                            c2582M4568 = c2588;
                            i12 = 14;
                        } else {
                            c2582M4568 = c2588;
                            i12 = i9;
                        }
                    } else {
                        abstractC0775M2537 = (AbstractC0775) interfaceC3508;
                        length = c2582M4568.f4833.length - 1;
                        if (length == 0) {
                            c2586 = C2582.f8208;
                        } else {
                            c2585 = new C2582(length);
                            i11 = 0;
                            while (i11 < length) {
                                int i212 = i11 + 1;
                                c2585.m3166(i11, c2582M4568.m3165(i212));
                                i11 = i212;
                            }
                            if (!c2582M4568.f7068) {
                                c2585.f7068 = false;
                            }
                            c2586 = c2585;
                        }
                        i12 = i9;
                        c2582M4568 = c2586;
                    }
                    c2648M4656 = AbstractC2656.m4655(i12, interfaceC3507, c2582M4568, abstractC0775M2537);
                    i9 = i12;
                }
                c1244 = this.f11205;
                arrayList2 = this.f11206;
                zM4629 = c2648M4656.m4629();
                this.f8409 |= zM4629;
                if (c1244 == null) {
                    c2648 = c2648M4656;
                    c2589 = c2583;
                    if (i9 == 33) {
                        if (c2589.f4833.length != 0) {
                            c25812 = (C2581) c2589.m3165(0);
                            interfaceC35012 = c25812.f8206;
                            if (c25812.f8205 != 0) {
                                c25811 = null;
                                arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                            } else {
                                c25811 = null;
                            }
                        } else {
                            c25811 = null;
                        }
                        c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                        this.f8406 = 0;
                        c2649 = this.f8411;
                        if (c2649 == null) {
                            this.f8411 = c2648;
                            this.f8412 = c2848;
                        } else {
                            if (c2649 != c2648) {
                                throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                            }
                            if (c2848.f9069 > this.f8412.f9069) {
                                this.f8412 = c2848;
                            }
                        }
                        this.f8405 = true;
                        abstractC0777 = abstractC0775M2537;
                    } else if (abstractC0775M2537 == null) {
                        abstractC0777 = abstractC0775M2537;
                        c25810 = c2581;
                        if (zM4629) {
                            AbstractC1663 c29216 = new C2928(c2648, c2848, c2589, this.f8403);
                            this.f8404 = true;
                            if (i8 == 191) {
                                this.f8406 = -1;
                            } else {
                                this.f8406 = this.f8403.f4833.length;
                            }
                            c2397 = c29216;
                        } else {
                            c2397 = new C2396(c2648, c2848, c25810, c2589);
                        }
                    } else if (zM4629) {
                        if (c2648.f8356 == 58) {
                            c2849 = c2848;
                            c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                            abstractC0777 = abstractC0775M2537;
                        } else {
                            c2849 = c2848;
                            abstractC0777 = abstractC0775M2537;
                            c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                        }
                        c2397 = c2982;
                        this.f8404 = true;
                        this.f8406 = this.f8403.f4833.length;
                        c2848 = c2849;
                    } else {
                        abstractC0777 = abstractC0775M2537;
                        c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                        c2397 = c2395;
                    }
                } else if (c1244.f4506 == 0) {
                    c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                    this.f8406 = 0;
                    abstractC0777 = abstractC0775M2537;
                } else {
                    C1676 c16714 = (C1676) c1244.f4507;
                    c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16714);
                    this.f8406 = c16714.f5648;
                    abstractC0777 = abstractC0775M2537;
                    c2397 = c2395;
                }
                arrayList.add(c2397);
                if (c2396 != null) {
                    arrayList.add(c2396);
                }
                if (arrayList2 != null) {
                    this.f8407++;
                    arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
                }
            }
            c2648M4656 = c2648M4655;
            c2583 = c2582M4568;
            abstractC0775M2537 = abstractC0776;
            c1244 = this.f11205;
            arrayList2 = this.f11206;
            zM4629 = c2648M4656.m4629();
            this.f8409 |= zM4629;
            if (c1244 == null) {
                c2648 = c2648M4656;
                c2589 = c2583;
                if (i9 == 33) {
                    if (c2589.f4833.length != 0) {
                        c25812 = (C2581) c2589.m3165(0);
                        interfaceC35012 = c25812.f8206;
                        if (c25812.f8205 != 0) {
                            c25811 = null;
                            arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                        } else {
                            c25811 = null;
                        }
                    } else {
                        c25811 = null;
                    }
                    c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                    this.f8406 = 0;
                    c2649 = this.f8411;
                    if (c2649 == null) {
                        this.f8411 = c2648;
                        this.f8412 = c2848;
                    } else {
                        if (c2649 != c2648) {
                            throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                        }
                        if (c2848.f9069 > this.f8412.f9069) {
                            this.f8412 = c2848;
                        }
                    }
                    this.f8405 = true;
                    abstractC0777 = abstractC0775M2537;
                } else if (abstractC0775M2537 == null) {
                    abstractC0777 = abstractC0775M2537;
                    c25810 = c2581;
                    if (zM4629) {
                        AbstractC1663 c29217 = new C2928(c2648, c2848, c2589, this.f8403);
                        this.f8404 = true;
                        if (i8 == 191) {
                            this.f8406 = -1;
                        } else {
                            this.f8406 = this.f8403.f4833.length;
                        }
                        c2397 = c29217;
                    } else {
                        c2397 = new C2396(c2648, c2848, c25810, c2589);
                    }
                } else if (zM4629) {
                    if (c2648.f8356 == 58) {
                        c2849 = c2848;
                        c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                        abstractC0777 = abstractC0775M2537;
                    } else {
                        c2849 = c2848;
                        abstractC0777 = abstractC0775M2537;
                        c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                    }
                    c2397 = c2982;
                    this.f8404 = true;
                    this.f8406 = this.f8403.f4833.length;
                    c2848 = c2849;
                } else {
                    abstractC0777 = abstractC0775M2537;
                    c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                    c2397 = c2395;
                }
            } else if (c1244.f4506 == 0) {
                c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
                this.f8406 = 0;
                abstractC0777 = abstractC0775M2537;
            } else {
                C1676 c16715 = (C1676) c1244.f4507;
                c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16715);
                this.f8406 = c16715.f5648;
                abstractC0777 = abstractC0775M2537;
                c2397 = c2395;
            }
            arrayList.add(c2397);
            if (c2396 != null) {
                arrayList.add(c2396);
            }
            if (arrayList2 != null) {
                this.f8407++;
                arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
            }
        }
        abstractC0775M2537 = C0917.m2548(c2648M4655.f8357);
        c2648M4656 = c2648M4655;
        c2583 = c2582M4568;
        c1244 = this.f11205;
        arrayList2 = this.f11206;
        zM4629 = c2648M4656.m4629();
        this.f8409 |= zM4629;
        if (c1244 == null) {
            c2648 = c2648M4656;
            c2589 = c2583;
            if (i9 == 33) {
                if (c2589.f4833.length != 0) {
                    c25812 = (C2581) c2589.m3165(0);
                    interfaceC35012 = c25812.f8206;
                    if (c25812.f8205 != 0) {
                        c25811 = null;
                        arrayList.add(new C2396(AbstractC2656.m4650(interfaceC35012), c2848, C2581.m4554(0, interfaceC35012, null), c25812));
                    } else {
                        c25811 = null;
                    }
                } else {
                    c25811 = null;
                }
                c2397 = new C2396(AbstractC2656.f8431, c2848, c25811, C2582.f8208);
                this.f8406 = 0;
                c2649 = this.f8411;
                if (c2649 == null) {
                    this.f8411 = c2648;
                    this.f8412 = c2848;
                } else {
                    if (c2649 != c2648) {
                        throw new C2766("return op mismatch: " + c2648 + ", " + this.f8411, null);
                    }
                    if (c2848.f9069 > this.f8412.f9069) {
                        this.f8412 = c2848;
                    }
                }
                this.f8405 = true;
                abstractC0777 = abstractC0775M2537;
            } else if (abstractC0775M2537 == null) {
                abstractC0777 = abstractC0775M2537;
                c25810 = c2581;
                if (zM4629) {
                    AbstractC1663 c29218 = new C2928(c2648, c2848, c2589, this.f8403);
                    this.f8404 = true;
                    if (i8 == 191) {
                        this.f8406 = -1;
                    } else {
                        this.f8406 = this.f8403.f4833.length;
                    }
                    c2397 = c29218;
                } else {
                    c2397 = new C2396(c2648, c2848, c25810, c2589);
                }
            } else if (zM4629) {
                if (c2648.f8356 == 58) {
                    c2849 = c2848;
                    c2982 = new C1689(c2648, c2849, c2589, this.f8403, (C0912) abstractC0775M2537);
                    abstractC0777 = abstractC0775M2537;
                } else {
                    c2849 = c2848;
                    abstractC0777 = abstractC0775M2537;
                    c2982 = new C2982(c2648, c2849, c2589, this.f8403, abstractC0777);
                }
                c2397 = c2982;
                this.f8404 = true;
                this.f8406 = this.f8403.f4833.length;
                c2848 = c2849;
            } else {
                abstractC0777 = abstractC0775M2537;
                c2395 = new C2395(c2648, c2848, c2581, c2589, abstractC0777);
                c2397 = c2395;
            }
        } else if (c1244.f4506 == 0) {
            c2397 = new C2396(AbstractC2656.f8431, c2848, (C2581) null, C2582.f8208);
            this.f8406 = 0;
            abstractC0777 = abstractC0775M2537;
        } else {
            C1676 c16716 = (C1676) c1244.f4507;
            c2395 = new C2928(c2648M4656, c2848, c2581, c2583, c16716);
            this.f8406 = c16716.f5648;
            abstractC0777 = abstractC0775M2537;
            c2397 = c2395;
        }
        arrayList.add(c2397);
        if (c2396 != null) {
            arrayList.add(c2396);
        }
        if (arrayList2 != null) {
            this.f8407++;
            arrayList.add(new C1331(AbstractC2656.f8614, c2848, C2582.m4568(c2396.f5625), arrayList2, abstractC0777));
        }
    }
}
